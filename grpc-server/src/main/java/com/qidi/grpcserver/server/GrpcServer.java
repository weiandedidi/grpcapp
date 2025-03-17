package com.qidi.grpcserver.server;

import com.qidi.grpcserver.service.FutureServiceImpl;
import com.qidi.grpcserver.service.MessageServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author maqidi
 * @version 1.0
 * @create 2025-03-17 15:15
 */
@Slf4j
@Component
public class GrpcServer {
    @Value("${grpc.port}")
    private int port;
    final FutureServiceImpl futureService;
    final MessageServiceImpl messageService;

    public GrpcServer(FutureServiceImpl futureService, MessageServiceImpl messageService) {
        this.futureService = futureService;
        this.messageService = messageService;
    }


    @PostConstruct
    public void init() throws IOException, InterruptedException {
        //1.绑定端口
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(port);
        //2.发布服务(可以使用springboot注入)
        serverBuilder.addService(messageService);
        serverBuilder.addService(futureService);
        //3.创建服务对象
        Server server = serverBuilder.build();

        server.start();
        log.info("grpc server started on port {}", port);
        server.awaitTermination();
    }
}
