package com.qidi.grpcclient;

import com.qidi.grpcsdk.idl.HelloRequest;
import com.qidi.grpcsdk.idl.HelloResponse;
import com.qidi.grpcsdk.idl.MessageServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author maqidi
 * @version 1.0
 * @create 2025-03-17 15:22
 */
public class ClientTest {
    public static void main(String[] args) {
        //1.创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        //2.创建代理对象 stub
        try {
            //阻塞模式，同步调用
            MessageServiceGrpc.MessageServiceBlockingStub helloService = MessageServiceGrpc.newBlockingStub(managedChannel);

            //3.完成 RPC 调用
            //3.1 准备参数
            HelloRequest request = HelloRequest
                    .newBuilder()
                    .setName("mqd")
                    .build();
            //3.2 进行 rpc 调用
            HelloResponse response = helloService.hello(request);
            System.out.println("response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            managedChannel.shutdown();
        }
    }
}
