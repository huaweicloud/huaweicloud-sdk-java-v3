package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListObsBucketsResponseBody
 */
public class ListObsBucketsResponseBody {

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

    private Object owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationDate")

    private Long creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clustertype")

    private String clustertype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageClass")

    private String storageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Object metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl")

    private String acl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucketStorageClass")

    private String bucketStorageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucketType")

    private String bucketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requestId")

    private String requestId;

    public ListObsBucketsResponseBody withResponseHeaders(Object responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }

    /**
     * **参数解释**： 响应头。
     * @return responseHeaders
     */
    public Object getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(Object responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public ListObsBucketsResponseBody withOriginalHeaders(Object originalHeaders) {
        this.originalHeaders = originalHeaders;
        return this;
    }

    /**
     * **参数解释**： 原始响应头。
     * @return originalHeaders
     */
    public Object getOriginalHeaders() {
        return originalHeaders;
    }

    public void setOriginalHeaders(Object originalHeaders) {
        this.originalHeaders = originalHeaders;
    }

    public ListObsBucketsResponseBody withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * **参数解释**： 状态码。 **取值范围**： 不涉及。
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public ListObsBucketsResponseBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * **参数解释**： 桶名。 **取值范围**： 不涉及。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ListObsBucketsResponseBody withOwner(Object owner) {
        this.owner = owner;
        return this;
    }

    /**
     * **参数解释**： 桶拥有者信息。
     * @return owner
     */
    public Object getOwner() {
        return owner;
    }

    public void setOwner(Object owner) {
        this.owner = owner;
    }

    public ListObsBucketsResponseBody withCreationDate(Long creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * **参数解释**： 桶的创建时间。 **取值范围**： 长度为24的字符串。
     * @return creationDate
     */
    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public ListObsBucketsResponseBody withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * **参数解释**： 桶所在的区域。 **取值范围**： 不涉及。
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ListObsBucketsResponseBody withClustertype(String clustertype) {
        this.clustertype = clustertype;
        return this;
    }

    /**
     * **参数解释**： 集群类型。 **取值范围**： 不涉及。
     * @return clustertype
     */
    public String getClustertype() {
        return clustertype;
    }

    public void setClustertype(String clustertype) {
        this.clustertype = clustertype;
    }

    public ListObsBucketsResponseBody withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * **参数解释**： 存储类型。 **取值范围**： 不涉及。
     * @return storageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public ListObsBucketsResponseBody withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * **参数解释**： 元数据。
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public ListObsBucketsResponseBody withAcl(String acl) {
        this.acl = acl;
        return this;
    }

    /**
     * **参数解释**： 桶ACL策略。 **取值范围**： 不涉及。
     * @return acl
     */
    public String getAcl() {
        return acl;
    }

    public void setAcl(String acl) {
        this.acl = acl;
    }

    public ListObsBucketsResponseBody withBucketStorageClass(String bucketStorageClass) {
        this.bucketStorageClass = bucketStorageClass;
        return this;
    }

    /**
     * **参数解释**： 桶的存储类型。 **取值范围**： - STANDARD：标准存储。 - WARM：低频访问存储。 - COLD：归档存储。 - DEEP_ARCHIVE：深度归档存储（受限公测）。
     * @return bucketStorageClass
     */
    public String getBucketStorageClass() {
        return bucketStorageClass;
    }

    public void setBucketStorageClass(String bucketStorageClass) {
        this.bucketStorageClass = bucketStorageClass;
    }

    public ListObsBucketsResponseBody withBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }

    /**
     * **参数解释**： 桶类型。 **取值范围**： 不涉及。
     * @return bucketType
     */
    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    public ListObsBucketsResponseBody withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**： 请求ID。 **取值范围**： 不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListObsBucketsResponseBody that = (ListObsBucketsResponseBody) obj;
        return Objects.equals(this.responseHeaders, that.responseHeaders)
            && Objects.equals(this.originalHeaders, that.originalHeaders)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.location, that.location) && Objects.equals(this.clustertype, that.clustertype)
            && Objects.equals(this.storageClass, that.storageClass) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.acl, that.acl) && Objects.equals(this.bucketStorageClass, that.bucketStorageClass)
            && Objects.equals(this.bucketType, that.bucketType) && Objects.equals(this.requestId, that.requestId);
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
            clustertype,
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
        sb.append("class ListObsBucketsResponseBody {\n");
        sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
        sb.append("    originalHeaders: ").append(toIndentedString(originalHeaders)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    clustertype: ").append(toIndentedString(clustertype)).append("\n");
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
