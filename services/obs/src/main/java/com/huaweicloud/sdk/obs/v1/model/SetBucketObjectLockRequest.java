package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "SetBucketObjectLockRequest")
public class SetBucketObjectLockRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object-lock")

    @JacksonXmlProperty(localName = "object-lock")

    private String objectLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private SetBucketObjectLockRequestBody body;

    public SetBucketObjectLockRequest withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 请求发起端的日期和时间，例如：Wed, 27 Jun 2018 13:39:15 +0000。 默认值：无。 条件：如果消息头中带了x-obs-date字段，则可以不带该字段，其他情况下必选。
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public SetBucketObjectLockRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 请求的桶名称。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public SetBucketObjectLockRequest withObjectLock(String objectLock) {
        this.objectLock = objectLock;
        return this;
    }

    /**
     * object-lock表示请求配置桶级默认WORM策略API。
     * @return objectLock
     */
    public String getObjectLock() {
        return objectLock;
    }

    public void setObjectLock(String objectLock) {
        this.objectLock = objectLock;
    }

    public SetBucketObjectLockRequest withBody(SetBucketObjectLockRequestBody body) {
        this.body = body;
        return this;
    }

    public SetBucketObjectLockRequest withBody(Consumer<SetBucketObjectLockRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new SetBucketObjectLockRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SetBucketObjectLockRequestBody getBody() {
        return body;
    }

    public void setBody(SetBucketObjectLockRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBucketObjectLockRequest that = (SetBucketObjectLockRequest) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.objectLock, that.objectLock) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, bucketName, objectLock, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketObjectLockRequest {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectLock: ").append(toIndentedString(objectLock)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
