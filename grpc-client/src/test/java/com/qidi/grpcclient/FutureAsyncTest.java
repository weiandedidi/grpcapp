package com.qidi.grpcclient;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.qidi.grpcsdk.idl.FutureProto;
import com.qidi.grpcsdk.idl.FutureServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author maqidi
 * @version 1.0
 * @create 2025-03-17 17:05
 */
public class FutureAsyncTest {
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
                    .setName("mqd")
                    .build();
            ListenableFuture<FutureProto.FutureResponse> response = futureServiceFutureStub.future(request);
            //4. 异步调用，添加回调函数，交给线程池处理
            Futures.addCallback(response, new FutureCallback<FutureProto.FutureResponse>() {

                @Override
                public void onSuccess(FutureProto.FutureResponse futureResponse) {
                    System.out.println("收到服务器异步响应:" + futureResponse);
                }

                @Override
                public void onFailure(Throwable throwable) {
                    System.out.println(throwable.getMessage());

                }
            }, Executors.newCachedThreadPool());
            System.out.println("前面的操作不会阻塞，会直接执行到这里~");
            managedChannel.awaitTermination(12, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            managedChannel.shutdownNow();
        }
    }
}
