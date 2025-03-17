package com.qidi.grpcsdk.idl;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.0)",
    comments = "Source: future.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FutureServiceGrpc {

  private FutureServiceGrpc() {}

  public static final String SERVICE_NAME = "FutureService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.FutureProto.FutureRequest,
      com.qidi.grpcsdk.idl.FutureProto.FutureResponse> getFutureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "future",
      requestType = com.qidi.grpcsdk.idl.FutureProto.FutureRequest.class,
      responseType = com.qidi.grpcsdk.idl.FutureProto.FutureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.FutureProto.FutureRequest,
      com.qidi.grpcsdk.idl.FutureProto.FutureResponse> getFutureMethod() {
    io.grpc.MethodDescriptor<com.qidi.grpcsdk.idl.FutureProto.FutureRequest, com.qidi.grpcsdk.idl.FutureProto.FutureResponse> getFutureMethod;
    if ((getFutureMethod = FutureServiceGrpc.getFutureMethod) == null) {
      synchronized (FutureServiceGrpc.class) {
        if ((getFutureMethod = FutureServiceGrpc.getFutureMethod) == null) {
          FutureServiceGrpc.getFutureMethod = getFutureMethod =
              io.grpc.MethodDescriptor.<com.qidi.grpcsdk.idl.FutureProto.FutureRequest, com.qidi.grpcsdk.idl.FutureProto.FutureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "future"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.FutureProto.FutureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qidi.grpcsdk.idl.FutureProto.FutureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FutureServiceMethodDescriptorSupplier("future"))
              .build();
        }
      }
    }
    return getFutureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FutureServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FutureServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FutureServiceStub>() {
        @java.lang.Override
        public FutureServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FutureServiceStub(channel, callOptions);
        }
      };
    return FutureServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FutureServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FutureServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FutureServiceBlockingStub>() {
        @java.lang.Override
        public FutureServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FutureServiceBlockingStub(channel, callOptions);
        }
      };
    return FutureServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FutureServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FutureServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FutureServiceFutureStub>() {
        @java.lang.Override
        public FutureServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FutureServiceFutureStub(channel, callOptions);
        }
      };
    return FutureServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FutureServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void future(com.qidi.grpcsdk.idl.FutureProto.FutureRequest request,
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.FutureProto.FutureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFutureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFutureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.qidi.grpcsdk.idl.FutureProto.FutureRequest,
                com.qidi.grpcsdk.idl.FutureProto.FutureResponse>(
                  this, METHODID_FUTURE)))
          .build();
    }
  }

  /**
   */
  public static final class FutureServiceStub extends io.grpc.stub.AbstractAsyncStub<FutureServiceStub> {
    private FutureServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FutureServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FutureServiceStub(channel, callOptions);
    }

    /**
     */
    public void future(com.qidi.grpcsdk.idl.FutureProto.FutureRequest request,
        io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.FutureProto.FutureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFutureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FutureServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FutureServiceBlockingStub> {
    private FutureServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FutureServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FutureServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.qidi.grpcsdk.idl.FutureProto.FutureResponse future(com.qidi.grpcsdk.idl.FutureProto.FutureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFutureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FutureServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FutureServiceFutureStub> {
    private FutureServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FutureServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FutureServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qidi.grpcsdk.idl.FutureProto.FutureResponse> future(
        com.qidi.grpcsdk.idl.FutureProto.FutureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFutureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FUTURE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FutureServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FutureServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FUTURE:
          serviceImpl.future((com.qidi.grpcsdk.idl.FutureProto.FutureRequest) request,
              (io.grpc.stub.StreamObserver<com.qidi.grpcsdk.idl.FutureProto.FutureResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FutureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FutureServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.qidi.grpcsdk.idl.FutureProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FutureService");
    }
  }

  private static final class FutureServiceFileDescriptorSupplier
      extends FutureServiceBaseDescriptorSupplier {
    FutureServiceFileDescriptorSupplier() {}
  }

  private static final class FutureServiceMethodDescriptorSupplier
      extends FutureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FutureServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FutureServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FutureServiceFileDescriptorSupplier())
              .addMethod(getFutureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
