/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

/**
 *
 *
 * <pre>
 * The request for [ListSessions][google.spanner.v1.Spanner.ListSessions].
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.ListSessionsRequest}
 */
public final class ListSessionsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.ListSessionsRequest)
    ListSessionsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSessionsRequest.newBuilder() to construct.
  private ListSessionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSessionsRequest() {
    database_ = "";
    pageToken_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSessionsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListSessionsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              database_ = s;
              break;
            }
          case 16:
            {
              pageSize_ = input.readInt32();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              pageToken_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              filter_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.v1.SpannerProto
        .internal_static_google_spanner_v1_ListSessionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.SpannerProto
        .internal_static_google_spanner_v1_ListSessionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.ListSessionsRequest.class,
            com.google.spanner.v1.ListSessionsRequest.Builder.class);
  }

  public static final int DATABASE_FIELD_NUMBER = 1;
  private volatile java.lang.Object database_;
  /**
   *
   *
   * <pre>
   * Required. The database in which to list sessions.
   * </pre>
   *
   * <code>
   * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The database.
   */
  public java.lang.String getDatabase() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      database_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The database in which to list sessions.
   * </pre>
   *
   * <code>
   * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for database.
   */
  public com.google.protobuf.ByteString getDatabaseBytes() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      database_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   *
   *
   * <pre>
   * Number of sessions to be returned in the response. If 0 or less, defaults
   * to the server's maximum allowed page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object pageToken_;
  /**
   *
   *
   * <pre>
   * If non-empty, `page_token` should contain a
   * [next_page_token][google.spanner.v1.ListSessionsResponse.next_page_token] from a previous
   * [ListSessionsResponse][google.spanner.v1.ListSessionsResponse].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If non-empty, `page_token` should contain a
   * [next_page_token][google.spanner.v1.ListSessionsResponse.next_page_token] from a previous
   * [ListSessionsResponse][google.spanner.v1.ListSessionsResponse].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 4;
  private volatile java.lang.Object filter_;
  /**
   *
   *
   * <pre>
   * An expression for filtering the results of the request. Filter rules are
   * case insensitive. The fields eligible for filtering are:
   *   * `labels.key` where key is the name of a label
   * Some examples of using filters are:
   *   * `labels.env:*` --&gt; The session has the label "env".
   *   * `labels.env:dev` --&gt; The session has the label "env" and the value of
   *                        the label contains the string "dev".
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * An expression for filtering the results of the request. Filter rules are
   * case insensitive. The fields eligible for filtering are:
   *   * `labels.key` where key is the name of a label
   * Some examples of using filters are:
   *   * `labels.env:*` --&gt; The session has the label "env".
   *   * `labels.env:dev` --&gt; The session has the label "env" and the value of
   *                        the label contains the string "dev".
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getDatabaseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, database_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pageToken_);
    }
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, filter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDatabaseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, database_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pageToken_);
    }
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, filter_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.v1.ListSessionsRequest)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.ListSessionsRequest other =
        (com.google.spanner.v1.ListSessionsRequest) obj;

    if (!getDatabase().equals(other.getDatabase())) return false;
    if (getPageSize() != other.getPageSize()) return false;
    if (!getPageToken().equals(other.getPageToken())) return false;
    if (!getFilter().equals(other.getFilter())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabase().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.ListSessionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.spanner.v1.ListSessionsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request for [ListSessions][google.spanner.v1.Spanner.ListSessions].
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.ListSessionsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.ListSessionsRequest)
      com.google.spanner.v1.ListSessionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.v1.SpannerProto
          .internal_static_google_spanner_v1_ListSessionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.SpannerProto
          .internal_static_google_spanner_v1_ListSessionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.ListSessionsRequest.class,
              com.google.spanner.v1.ListSessionsRequest.Builder.class);
    }

    // Construct using com.google.spanner.v1.ListSessionsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      database_ = "";

      pageSize_ = 0;

      pageToken_ = "";

      filter_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.v1.SpannerProto
          .internal_static_google_spanner_v1_ListSessionsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.v1.ListSessionsRequest getDefaultInstanceForType() {
      return com.google.spanner.v1.ListSessionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.v1.ListSessionsRequest build() {
      com.google.spanner.v1.ListSessionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.v1.ListSessionsRequest buildPartial() {
      com.google.spanner.v1.ListSessionsRequest result =
          new com.google.spanner.v1.ListSessionsRequest(this);
      result.database_ = database_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
      result.filter_ = filter_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.v1.ListSessionsRequest) {
        return mergeFrom((com.google.spanner.v1.ListSessionsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.ListSessionsRequest other) {
      if (other == com.google.spanner.v1.ListSessionsRequest.getDefaultInstance()) return this;
      if (!other.getDatabase().isEmpty()) {
        database_ = other.database_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.spanner.v1.ListSessionsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.ListSessionsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object database_ = "";
    /**
     *
     *
     * <pre>
     * Required. The database in which to list sessions.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The database.
     */
    public java.lang.String getDatabase() {
      java.lang.Object ref = database_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        database_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The database in which to list sessions.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for database.
     */
    public com.google.protobuf.ByteString getDatabaseBytes() {
      java.lang.Object ref = database_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        database_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The database in which to list sessions.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabase(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      database_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The database in which to list sessions.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatabase() {

      database_ = getDefaultInstance().getDatabase();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The database in which to list sessions.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      database_ = value;
      onChanged();
      return this;
    }

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * Number of sessions to be returned in the response. If 0 or less, defaults
     * to the server's maximum allowed page size.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @return The pageSize.
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * Number of sessions to be returned in the response. If 0 or less, defaults
     * to the server's maximum allowed page size.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of sessions to be returned in the response. If 0 or less, defaults
     * to the server's maximum allowed page size.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {

      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * If non-empty, `page_token` should contain a
     * [next_page_token][google.spanner.v1.ListSessionsResponse.next_page_token] from a previous
     * [ListSessionsResponse][google.spanner.v1.ListSessionsResponse].
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If non-empty, `page_token` should contain a
     * [next_page_token][google.spanner.v1.ListSessionsResponse.next_page_token] from a previous
     * [ListSessionsResponse][google.spanner.v1.ListSessionsResponse].
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If non-empty, `page_token` should contain a
     * [next_page_token][google.spanner.v1.ListSessionsResponse.next_page_token] from a previous
     * [ListSessionsResponse][google.spanner.v1.ListSessionsResponse].
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If non-empty, `page_token` should contain a
     * [next_page_token][google.spanner.v1.ListSessionsResponse.next_page_token] from a previous
     * [ListSessionsResponse][google.spanner.v1.ListSessionsResponse].
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {

      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If non-empty, `page_token` should contain a
     * [next_page_token][google.spanner.v1.ListSessionsResponse.next_page_token] from a previous
     * [ListSessionsResponse][google.spanner.v1.ListSessionsResponse].
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      pageToken_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request. Filter rules are
     * case insensitive. The fields eligible for filtering are:
     *   * `labels.key` where key is the name of a label
     * Some examples of using filters are:
     *   * `labels.env:*` --&gt; The session has the label "env".
     *   * `labels.env:dev` --&gt; The session has the label "env" and the value of
     *                        the label contains the string "dev".
     * </pre>
     *
     * <code>string filter = 4;</code>
     *
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request. Filter rules are
     * case insensitive. The fields eligible for filtering are:
     *   * `labels.key` where key is the name of a label
     * Some examples of using filters are:
     *   * `labels.env:*` --&gt; The session has the label "env".
     *   * `labels.env:dev` --&gt; The session has the label "env" and the value of
     *                        the label contains the string "dev".
     * </pre>
     *
     * <code>string filter = 4;</code>
     *
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request. Filter rules are
     * case insensitive. The fields eligible for filtering are:
     *   * `labels.key` where key is the name of a label
     * Some examples of using filters are:
     *   * `labels.env:*` --&gt; The session has the label "env".
     *   * `labels.env:dev` --&gt; The session has the label "env" and the value of
     *                        the label contains the string "dev".
     * </pre>
     *
     * <code>string filter = 4;</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      filter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request. Filter rules are
     * case insensitive. The fields eligible for filtering are:
     *   * `labels.key` where key is the name of a label
     * Some examples of using filters are:
     *   * `labels.env:*` --&gt; The session has the label "env".
     *   * `labels.env:dev` --&gt; The session has the label "env" and the value of
     *                        the label contains the string "dev".
     * </pre>
     *
     * <code>string filter = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {

      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request. Filter rules are
     * case insensitive. The fields eligible for filtering are:
     *   * `labels.key` where key is the name of a label
     * Some examples of using filters are:
     *   * `labels.env:*` --&gt; The session has the label "env".
     *   * `labels.env:dev` --&gt; The session has the label "env" and the value of
     *                        the label contains the string "dev".
     * </pre>
     *
     * <code>string filter = 4;</code>
     *
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      filter_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.v1.ListSessionsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.ListSessionsRequest)
  private static final com.google.spanner.v1.ListSessionsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.ListSessionsRequest();
  }

  public static com.google.spanner.v1.ListSessionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSessionsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListSessionsRequest>() {
        @java.lang.Override
        public ListSessionsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListSessionsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListSessionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSessionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.v1.ListSessionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
