package com.qidi.grpcclient;

import com.qidi.grpcsdk.idl.HelloRequest;
import com.qidi.grpcsdk.idl.HelloResponse;
import com.qidi.grpcsdk.idl.MessageServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

/**
 * @author maqidi
 * @version 1.0
 * @create 2025-03-17 15:59
 */
public class ClientStreamRequestTest {
    public static void main(String[] args) {
        //1.创建通信通道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        try {
            //2.获取代理对象(异步式)
            MessageServiceGrpc.MessageServiceStub helloServiceStub = MessageServiceGrpc.newStub(managedChannel);
            //3.rpc调用(不会阻塞在这里，会继续执行后面的逻辑)
            StreamObserver<HelloRequest> helloRequestStreamObserver = helloServiceStub.helloClientStream(new StreamObserver<HelloResponse>() {

                @Override
                public void onNext(HelloResponse helloResponse) {
                    System.out.println("收到服务端响应: " + helloResponse.getResult());
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("服务端响应异常! msg:" + throwable.getMessage());
                }

                @Override
                public void onCompleted() {
                    System.out.println("服务端响应结束!");
                }
            });
            //4.客户端发送数据到服务端
            for (int i = 1; i <= 10; i++) {
                //4.1 准备参数
                HelloRequest request = HelloRequest
                        .newBuilder()
                        .setName("cyk" + i)
                        .build();
                //4.2 发送数据
                helloRequestStreamObserver.onNext(request);
                //4.3 不同时刻发送数据
                Thread.sleep(1000);
            }

            System.out.println("======================= end =========================="); //因为不会在前面阻塞住，因此就会直接执行到这里(异步)，先执行到了这里
            //5.结束响应
            helloRequestStreamObserver.onCompleted();
            managedChannel.awaitTermination(12, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            managedChannel.shutdownNow();
        }
    }

}
