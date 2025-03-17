package com.qidi.grpcclient;

import com.google.common.util.concurrent.ListenableFuture;
import com.qidi.grpcsdk.idl.FutureProto;
import com.qidi.grpcsdk.idl.FutureServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author maqidi
 * @version 1.0
 * @create 2025-03-17 17:05
 */
public class FutureSyncTest {
    /**
     * 同步调用
     *
     * @param args
     */
    public static void main(String[] args) {
        //1.创建通信通道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        try {
            //2.获取代理对象
            FutureServiceGrpc.FutureServiceFutureStub futureServiceFutureStub = FutureServiceGrpc.newFutureStub(managedChannel);
            //3.准备参数
            FutureProto.FutureRequest request = FutureProto.FutureRequest
                    .newBuilder()
                    .setName("cyk")
                    .build();
            //4.同步rpc调用
            ListenableFuture<FutureProto.FutureResponse> response = futureServiceFutureStub.future(request);
            System.out.println("result: " + response.get().getData());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            managedChannel.shutdownNow();
        }
    }
}
