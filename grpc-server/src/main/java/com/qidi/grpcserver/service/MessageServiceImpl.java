package com.qidi.grpcserver.service;

import com.google.protobuf.ProtocolStringList;
import com.qidi.grpcsdk.idl.HelloListRequest;
import com.qidi.grpcsdk.idl.HelloRequest;
import com.qidi.grpcsdk.idl.HelloResponse;
import com.qidi.grpcsdk.idl.MessageServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author maqidi
 * @version 1.0
 * @create 2025-03-17 15:10
 */
@Slf4j
@Component
public class MessageServiceImpl extends MessageServiceGrpc.MessageServiceImplBase {
    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        //1.接收 client 的请求参数
        String name = request.getName();
        //2.业务处理
        System.out.println("name: " + name);
        //3.封装响应
        HelloResponse response = HelloResponse
                .newBuilder()
                .setResult("ok!")   //填充数据
                .build();
        //通过这个方法，把响应消息回传给 client
        responseObserver.onNext(response);
        //通知 client，整个服务结束(底层返回一个标记，client 就能监听到)
        responseObserver.onCompleted();

    }

    @Override
    public void helloList(HelloListRequest request, StreamObserver<HelloResponse> responseObserver) {
        //1.获取 client 的请求参数，批量发送(获取中间的list类)
        ProtocolStringList nameList = request.getNameList();
        //2.业务处理
        for (String name : nameList) {
            System.out.println("name: " + name);
        }
        //3.封装响应
        HelloResponse response = HelloResponse
                .newBuilder()
                .setResult("ok!")
                .build();
        //通过这个方法，把响应消息回传给 client
        responseObserver.onNext(response);
        //通知 client，整个服务结束(底层返回一个标记，client 就能监听到)
        responseObserver.onCompleted();
    }

    /**
     * 流式模拟每秒响应一个参数
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void helloServerStream(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        //1.获取请求参数
        String name = request.getName();
        //2.进行业务处理
        System.out.println("name: " + name);
        //3.封装响应
        for (int i = 1; i <= 10; i++) {
            HelloResponse response = HelloResponse
                    .newBuilder()
                    .setResult("ok~ - " + i)
                    .build();
            //返回响应
            responseObserver.onNext(response);
            //模拟每秒发送一个数据
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //结束
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<HelloRequest> helloClientStream(StreamObserver<HelloResponse> responseObserver) {
        return dealRequestStream(responseObserver);
    }

    /**
     * 处理请求的流逝返回的响应
     *
     * @param responseObserver
     * @return
     */
    private StreamObserver<HelloRequest> dealRequestStream(StreamObserver<HelloResponse> responseObserver) {
        return new StreamObserver<HelloRequest>() {
            @Override
            public void onNext(HelloRequest helloRequest) {
                System.out.println("收到 client 请求: " + helloRequest.getName());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("客户端异常: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                //1.构造响应
                HelloResponse response = HelloResponse
                        .newBuilder()
                        .setResult("ok!")
                        .build();
                //2.返回响应
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<HelloRequest> helloBidiStream(StreamObserver<HelloResponse> responseObserver) {
        //就流式处理吧
        return dealRequestStream(responseObserver);
    }
}
