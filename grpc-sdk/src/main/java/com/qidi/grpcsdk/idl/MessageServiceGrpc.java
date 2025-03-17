package com.qidi.grpcsdk.idl;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.0)",
    comments = "Source: message.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MessageServiceGrpc {

  private MessageServiceGrpc() {}

  public static final String SERVICE_NAME = "message.MessageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = com.qidi.grpcsdk.idl.HelloRequest.class,
      responseType = com.qidi.grpcsdk.idl.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest, com.qidi.grpcsdk.idl.HelloResponse> getHelloMethod;
    if ((getHelloMethod = MessageServiceGrpc.getHelloMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getHelloMethod = MessageServiceGrpc.getHelloMethod) == null) {
          MessageServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<com.qidi.grpcsdk.idl.HelloRequest, com.qidi.grpcsdk.idl.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "helloServerStream",
      requestType = com.qidi.grpcsdk.idl.HelloRequest.class,
      responseType = com.qidi.grpcsdk.idl.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloServerStreamMethod() {
    io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest, com.qidi.grpcsdk.idl.HelloResponse> getHelloServerStreamMethod;
    if ((getHelloServerStreamMethod = MessageServiceGrpc.getHelloServerStreamMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getHelloServerStreamMethod = MessageServiceGrpc.getHelloServerStreamMethod) == null) {
          MessageServiceGrpc.getHelloServerStreamMethod = getHelloServerStreamMethod =
              io.grpc.MethodDescriptor.<com.qidi.grpcsdk.idl.HelloRequest, com.qidi.grpcsdk.idl.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "helloServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("helloServerStream"))
              .build();
        }
      }
    }
    return getHelloServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "helloClientStream",
      requestType = com.qidi.grpcsdk.idl.HelloRequest.class,
      responseType = com.qidi.grpcsdk.idl.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloClientStreamMethod() {
    io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest, com.qidi.grpcsdk.idl.HelloResponse> getHelloClientStreamMethod;
    if ((getHelloClientStreamMethod = MessageServiceGrpc.getHelloClientStreamMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getHelloClientStreamMethod = MessageServiceGrpc.getHelloClientStreamMethod) == null) {
          MessageServiceGrpc.getHelloClientStreamMethod = getHelloClientStreamMethod =
              io.grpc.MethodDescriptor.<com.qidi.grpcsdk.idl.HelloRequest, com.qidi.grpcsdk.idl.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "helloClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("helloClientStream"))
              .build();
        }
      }
    }
    return getHelloClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloBidiStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "helloBidiStream",
      requestType = com.qidi.grpcsdk.idl.HelloRequest.class,
      responseType = com.qidi.grpcsdk.idl.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloBidiStreamMethod() {
    io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloRequest, com.qidi.grpcsdk.idl.HelloResponse> getHelloBidiStreamMethod;
    if ((getHelloBidiStreamMethod = MessageServiceGrpc.getHelloBidiStreamMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getHelloBidiStreamMethod = MessageServiceGrpc.getHelloBidiStreamMethod) == null) {
          MessageServiceGrpc.getHelloBidiStreamMethod = getHelloBidiStreamMethod =
              io.grpc.MethodDescriptor.<com.qidi.grpcsdk.idl.HelloRequest, com.qidi.grpcsdk.idl.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "helloBidiStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("helloBidiStream"))
              .build();
        }
      }
    }
    return getHelloBidiStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloListRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "helloList",
      requestType = com.qidi.grpcsdk.idl.HelloListRequest.class,
      responseType = com.qidi.grpcsdk.idl.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloListRequest,
      com.qidi.grpcsdk.idl.HelloResponse> getHelloListMethod() {
    io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.HelloListRequest, com.qidi.grpcsdk.idl.HelloResponse> getHelloListMethod;
    if ((getHelloListMethod = MessageServiceGrpc.getHelloListMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getHelloListMethod = MessageServiceGrpc.getHelloListMethod) == null) {
          MessageServiceGrpc.getHelloListMethod = getHelloListMethod =
              io.grpc.MethodDescriptor.<com.qidi.grpcsdk.idl.HelloListRequest, com.qidi.grpcsdk.idl.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "helloList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("helloList"))
              .build();
        }
      }
    }
    return getHelloListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceStub>() {
        @java.lang.Override
        public MessageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceStub(channel, callOptions);
        }
      };
    return MessageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceBlockingStub>() {
        @java.lang.Override
        public MessageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceBlockingStub(channel, callOptions);
        }
      };
    return MessageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceFutureStub>() {
        @java.lang.Override
        public MessageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceFutureStub(channel, callOptions);
        }
      };
    return MessageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MessageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(com.qidi.grpcsdk.idl.HelloRequest request,
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     *服务端流式，类似于股票推送，不同时间的数据变化，服务端变化，广播类的
     * </pre>
     */
    public void helloServerStream(com.qidi.grpcsdk.idl.HelloRequest request,
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloServerStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *客户端流式，客户端流式发送，类似于物联网iot场景，客户端生产数据
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloRequest> helloClientStream(
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHelloClientStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * 双向流式，一般都是双工流式。 服务端流式，也只有大模型那种推送了
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloRequest> helloBidiStream(
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHelloBidiStreamMethod(), responseObserver);
    }

    /**
     */
    public void helloList(com.qidi.grpcsdk.idl.HelloListRequest request,
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.qidi.grpcsdk.idl.HelloRequest,
                com.qidi.grpcsdk.idl.HelloResponse>(
                  this, METHODID_HELLO)))
          .addMethod(
            getHelloServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.qidi.grpcsdk.idl.HelloRequest,
                com.qidi.grpcsdk.idl.HelloResponse>(
                  this, METHODID_HELLO_SERVER_STREAM)))
          .addMethod(
            getHelloClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.qidi.grpcsdk.idl.HelloRequest,
                com.qidi.grpcsdk.idl.HelloResponse>(
                  this, METHODID_HELLO_CLIENT_STREAM)))
          .addMethod(
            getHelloBidiStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.qidi.grpcsdk.idl.HelloRequest,
                com.qidi.grpcsdk.idl.HelloResponse>(
                  this, METHODID_HELLO_BIDI_STREAM)))
          .addMethod(
            getHelloListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.qidi.grpcsdk.idl.HelloListRequest,
                com.qidi.grpcsdk.idl.HelloResponse>(
                  this, METHODID_HELLO_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class MessageServiceStub extends io.grpc.stub.AbstractAsyncStub<MessageServiceStub> {
    private MessageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.qidi.grpcsdk.idl.HelloRequest request,
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *服务端流式，类似于股票推送，不同时间的数据变化，服务端变化，广播类的
     * </pre>
     */
    public void helloServerStream(com.qidi.grpcsdk.idl.HelloRequest request,
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getHelloServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *客户端流式，客户端流式发送，类似于物联网iot场景，客户端生产数据
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloRequest> helloClientStream(
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getHelloClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 双向流式，一般都是双工流式。 服务端流式，也只有大模型那种推送了
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloRequest> helloBidiStream(
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getHelloBidiStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void helloList(com.qidi.grpcsdk.idl.HelloListRequest request,
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MessageServiceBlockingStub> {
    private MessageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.qidi.grpcsdk.idl.HelloResponse hello(com.qidi.grpcsdk.idl.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *服务端流式，类似于股票推送，不同时间的数据变化，服务端变化，广播类的
     * </pre>
     */
    public java.util.Iterator<com.qidi.grpcsdk.idl.HelloResponse> helloServerStream(
        com.qidi.grpcsdk.idl.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getHelloServerStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.qidi.grpcsdk.idl.HelloResponse helloList(com.qidi.grpcsdk.idl.HelloListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MessageServiceFutureStub> {
    private MessageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qidi.grpcsdk.idl.HelloResponse> hello(
        com.qidi.grpcsdk.idl.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qidi.grpcsdk.idl.HelloResponse> helloList(
        com.qidi.grpcsdk.idl.HelloListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_HELLO_SERVER_STREAM = 1;
  private static final int METHODID_HELLO_LIST = 2;
  private static final int METHODID_HELLO_CLIENT_STREAM = 3;
  private static final int METHODID_HELLO_BIDI_STREAM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.qidi.grpcsdk.idl.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO_SERVER_STREAM:
          serviceImpl.helloServerStream((com.qidi.grpcsdk.idl.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO_LIST:
          serviceImpl.helloList((com.qidi.grpcsdk.idl.HelloListRequest) request,
              (io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloClientStream(
              (io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse>) responseObserver);
        case METHODID_HELLO_BIDI_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloBidiStream(
              (io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.qidi.grpcsdk.idl.MessageProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessageService");
    }
  }

  private static final class MessageServiceFileDescriptorSupplier
      extends MessageServiceBaseDescriptorSupplier {
    MessageServiceFileDescriptorSupplier() {}
  }

  private static final class MessageServiceMethodDescriptorSupplier
      extends MessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessageServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MessageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getHelloServerStreamMethod())
              .addMethod(getHelloClientStreamMethod())
              .addMethod(getHelloBidiStreamMethod())
              .addMethod(getHelloListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
