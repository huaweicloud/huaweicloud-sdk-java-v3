package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObsBucketInfo
 */
public class ObsBucketInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responseHeaders")

    private Object responseHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "originalHeaders")

    private Object originalHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusCode")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucketName")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private ObsBucketInfoOwner owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationDate")

    private String creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageClass")

    private Object storageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Object metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl")

    private Object acl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucketStorageClass")

    private Object bucketStorageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucketType")

    private String bucketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requestId")

    private String requestId;

    public ObsBucketInfo withResponseHeaders(Object responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }

    /**
     * 响应头
     * @return responseHeaders
     */
    public Object getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(Object responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public ObsBucketInfo withOriginalHeaders(Object originalHeaders) {
        this.originalHeaders = originalHeaders;
        return this;
    }

    /**
     * 请求头
     * @return originalHeaders
     */
    public Object getOriginalHeaders() {
        return originalHeaders;
    }

    public void setOriginalHeaders(Object originalHeaders) {
        this.originalHeaders = originalHeaders;
    }

    public ObsBucketInfo withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public ObsBucketInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ObsBucketInfo withOwner(ObsBucketInfoOwner owner) {
        this.owner = owner;
        return this;
    }

    public ObsBucketInfo withOwner(Consumer<ObsBucketInfoOwner> ownerSetter) {
        if (this.owner == null) {
            this.owner = new ObsBucketInfoOwner();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public ObsBucketInfoOwner getOwner() {
        return owner;
    }

    public void setOwner(ObsBucketInfoOwner owner) {
        this.owner = owner;
    }

    public ObsBucketInfo withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 桶的创建时间
     * @return creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public ObsBucketInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 桶的位置信息
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ObsBucketInfo withStorageClass(Object storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * 对象的存储类型
     * @return storageClass
     */
    public Object getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(Object storageClass) {
        this.storageClass = storageClass;
    }

    public ObsBucketInfo withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 桶元数据
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public ObsBucketInfo withAcl(Object acl) {
        this.acl = acl;
        return this;
    }

    /**
     * 桶ACL
     * @return acl
     */
    public Object getAcl() {
        return acl;
    }

    public void setAcl(Object acl) {
        this.acl = acl;
    }

    public ObsBucketInfo withBucketStorageClass(Object bucketStorageClass) {
        this.bucketStorageClass = bucketStorageClass;
        return this;
    }

    /**
     * 桶的存储类型
     * @return bucketStorageClass
     */
    public Object getBucketStorageClass() {
        return bucketStorageClass;
    }

    public void setBucketStorageClass(Object bucketStorageClass) {
        this.bucketStorageClass = bucketStorageClass;
    }

    public ObsBucketInfo withBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }

    /**
     * 桶类型
     * @return bucketType
     */
    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    public ObsBucketInfo withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObsBucketInfo obsBucketInfo = (ObsBucketInfo) o;
        return Objects.equals(this.responseHeaders, obsBucketInfo.responseHeaders)
            && Objects.equals(this.originalHeaders, obsBucketInfo.originalHeaders)
            && Objects.equals(this.statusCode, obsBucketInfo.statusCode)
            && Objects.equals(this.bucketName, obsBucketInfo.bucketName)
            && Objects.equals(this.owner, obsBucketInfo.owner)
            && Objects.equals(this.creationDate, obsBucketInfo.creationDate)
            && Objects.equals(this.location, obsBucketInfo.location)
            && Objects.equals(this.storageClass, obsBucketInfo.storageClass)
            && Objects.equals(this.metadata, obsBucketInfo.metadata) && Objects.equals(this.acl, obsBucketInfo.acl)
            && Objects.equals(this.bucketStorageClass, obsBucketInfo.bucketStorageClass)
            && Objects.equals(this.bucketType, obsBucketInfo.bucketType)
            && Objects.equals(this.requestId, obsBucketInfo.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseHeaders,
            originalHeaders,
            statusCode,
            bucketName,
            owner,
            creationDate,
            location,
            storageClass,
            metadata,
            acl,
            bucketStorageClass,
            bucketType,
            requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsBucketInfo {\n");
        sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
        sb.append("    originalHeaders: ").append(toIndentedString(originalHeaders)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
        sb.append("    bucketStorageClass: ").append(toIndentedString(bucketStorageClass)).append("\n");
        sb.append("    bucketType: ").append(toIndentedString(bucketType)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
