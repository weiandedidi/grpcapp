package com.qidi.grpcclient;

import com.qidi.grpcsdk.idl.HelloRequest;
import com.qidi.grpcsdk.idl.HelloResponse;
import com.qidi.grpcsdk.idl.MessageServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

/**
 * 测试服务端流式输出
 *
 * @author maqidi
 * @version 1.0
 * @create 2025-03-17 15:44
 */
public class ServerStreamTest {


    public static void main(String[] args) {
        //1.创建通信通道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        try {
            //2.获取代理对象
            MessageServiceGrpc.MessageServiceBlockingStub helloService = MessageServiceGrpc.newBlockingStub(managedChannel);
            //3.准备参数
            HelloRequest request = HelloRequest
                    .newBuilder()
                    .setName("cyk")
                    .build();
            //4.rpc调用
            //此时获取到的是一个迭代器
            Iterator<HelloResponse> helloResponseIterator = helloService.helloServerStream(request);
            while (helloResponseIterator.hasNext()) {
                String result = helloResponseIterator.next().getResult();
                System.out.println("result: " + result);
            }
            System.out.println("end!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            managedChannel.shutdownNow();
        }
    }
}
