// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.qidi.grpcsdk.idl;

/**
 * <pre>
 *重复对象
 * </pre>
 *
 * Protobuf type {@code message.HelloListRequest}
 */
public final class HelloListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:message.HelloListRequest)
    HelloListRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloListRequest.newBuilder() to construct.
  private HelloListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloListRequest() {
    name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HelloListRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.qidi.grpcsdk.idl.MessageProto.internal_static_message_HelloListRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.qidi.grpcsdk.idl.MessageProto.internal_static_message_HelloListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.qidi.grpcsdk.idl.HelloListRequest.class, com.qidi.grpcsdk.idl.HelloListRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList name_;
  /**
   * <code>repeated string name = 1;</code>
   * @return A list containing the name.
   */
  public com.google.protobuf.ProtocolStringList
      getNameList() {
    return name_;
  }
  /**
   * <code>repeated string name = 1;</code>
   * @return The count of name.
   */
  public int getNameCount() {
    return name_.size();
  }
  /**
   * <code>repeated string name = 1;</code>
   * @param index The index of the element to return.
   * @return The name at the given index.
   */
  public java.lang.String getName(int index) {
    return name_.get(index);
  }
  /**
   * <code>repeated string name = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the name at the given index.
   */
  public com.google.protobuf.ByteString
      getNameBytes(int index) {
    return name_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < name_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < name_.size(); i++) {
        dataSize += computeStringSizeNoTag(name_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNameList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.qidi.grpcsdk.idl.HelloListRequest)) {
      return super.equals(obj);
    }
    com.qidi.grpcsdk.idl.HelloListRequest other = (com.qidi.grpcsdk.idl.HelloListRequest) obj;

    if (!getNameList()
        .equals(other.getNameList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getNameCount() > 0) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getNameList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.qidi.grpcsdk.idl.HelloListRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.qidi.grpcsdk.idl.HelloListRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *重复对象
   * </pre>
   *
   * Protobuf type {@code message.HelloListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:message.HelloListRequest)
      com.qidi.grpcsdk.idl.HelloListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.qidi.grpcsdk.idl.MessageProto.internal_static_message_HelloListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.qidi.grpcsdk.idl.MessageProto.internal_static_message_HelloListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.qidi.grpcsdk.idl.HelloListRequest.class, com.qidi.grpcsdk.idl.HelloListRequest.Builder.class);
    }

    // Construct using com.qidi.grpcsdk.idl.HelloListRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.qidi.grpcsdk.idl.MessageProto.internal_static_message_HelloListRequest_descriptor;
    }

    @java.lang.Override
    public com.qidi.grpcsdk.idl.HelloListRequest getDefaultInstanceForType() {
      return com.qidi.grpcsdk.idl.HelloListRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.qidi.grpcsdk.idl.HelloListRequest build() {
      com.qidi.grpcsdk.idl.HelloListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.qidi.grpcsdk.idl.HelloListRequest buildPartial() {
      com.qidi.grpcsdk.idl.HelloListRequest result = new com.qidi.grpcsdk.idl.HelloListRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        name_ = name_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.name_ = name_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.qidi.grpcsdk.idl.HelloListRequest) {
        return mergeFrom((com.qidi.grpcsdk.idl.HelloListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.qidi.grpcsdk.idl.HelloListRequest other) {
      if (other == com.qidi.grpcsdk.idl.HelloListRequest.getDefaultInstance()) return this;
      if (!other.name_.isEmpty()) {
        if (name_.isEmpty()) {
          name_ = other.name_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNameIsMutable();
          name_.addAll(other.name_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureNameIsMutable();
              name_.add(s);
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNameIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        name_ = new com.google.protobuf.LazyStringArrayList(name_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string name = 1;</code>
     * @return A list containing the name.
     */
    public com.google.protobuf.ProtocolStringList
        getNameList() {
      return name_.getUnmodifiableView();
    }
    /**
     * <code>repeated string name = 1;</code>
     * @return The count of name.
     */
    public int getNameCount() {
      return name_.size();
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param index The index of the element to return.
     * @return The name at the given index.
     */
    public java.lang.String getName(int index) {
      return name_.get(index);
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the name at the given index.
     */
    public com.google.protobuf.ByteString
        getNameBytes(int index) {
      return name_.getByteString(index);
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param index The index to set the value at.
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
      name_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param value The name to add.
     * @return This builder for chaining.
     */
    public Builder addName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
      name_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param values The name to add.
     * @return This builder for chaining.
     */
    public Builder addAllName(
        java.lang.Iterable<java.lang.String> values) {
      ensureNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, name_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param value The bytes of the name to add.
     * @return This builder for chaining.
     */
    public Builder addNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNameIsMutable();
      name_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:message.HelloListRequest)
  }

  // @@protoc_insertion_point(class_scope:message.HelloListRequest)
  private static final com.qidi.grpcsdk.idl.HelloListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.qidi.grpcsdk.idl.HelloListRequest();
  }

  public static com.qidi.grpcsdk.idl.HelloListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloListRequest>
      PARSER = new com.google.protobuf.AbstractParser<HelloListRequest>() {
    @java.lang.Override
    public HelloListRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<HelloListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloListRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.qidi.grpcsdk.idl.HelloListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

