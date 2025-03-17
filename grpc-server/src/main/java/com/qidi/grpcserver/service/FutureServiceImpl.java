package com.qidi.grpcserver.service;

import com.qidi.grpcsdk.idl.FutureProto;
import com.qidi.grpcsdk.idl.FutureServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author maqidi
 * @version 1.0
 * @create 2025-03-17 16:58
 */
@Slf4j
@Component
public class FutureServiceImpl extends FutureServiceGrpc.FutureServiceImplBase {

    @Override
    public void future(FutureProto.FutureRequest request, StreamObserver<FutureProto.FutureResponse> responseObserver) {
        //1.接受客户端请求
        String name = request.getName();
        //2.业务处理
        System.out.println("name: " + name);
        //3.构造响应
        FutureProto.FutureResponse response = FutureProto.FutureResponse
                .newBuilder()
                .setData("ok!")
                .build();
        //4.返回响应和标记
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
