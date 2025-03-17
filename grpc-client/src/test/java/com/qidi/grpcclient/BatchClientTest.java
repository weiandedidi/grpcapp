package com.qidi.grpcclient;

import com.qidi.grpcsdk.idl.HelloListRequest;
import com.qidi.grpcsdk.idl.HelloResponse;
import com.qidi.grpcsdk.idl.MessageServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author maqidi
 * @version 1.0
 * @create 2025-03-17 15:33
 */
public class BatchClientTest {
    public static void main(String[] args) {
        //1.创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        //2.创建代理对象 stub
        try {
            MessageServiceGrpc.MessageServiceBlockingStub helloService = MessageServiceGrpc.newBlockingStub(managedChannel);
            //3.完成 RPC 调用
            //3.1 准备参数
            HelloListRequest request = HelloListRequest
                    .newBuilder()
                    .addName("cyk1")
                    .addName("cyk2")
                    .addName("cyk3")
                    .addName("cyk4")
                    .build();

            //3.2 进行 rpc 调用，list一个一个塞入，可能是需要计算出通讯的字段长度
            HelloResponse response = helloService.helloList(request);
            System.out.println("response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            managedChannel.shutdown();
        }
    }
}
