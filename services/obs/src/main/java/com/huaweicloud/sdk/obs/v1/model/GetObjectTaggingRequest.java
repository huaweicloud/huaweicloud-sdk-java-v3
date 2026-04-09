package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "GetObjectTaggingRequest")
public class GetObjectTaggingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    @JacksonXmlProperty(localName = "object_key")

    private String objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tagging")

    @JacksonXmlProperty(localName = "tagging")

    private String tagging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionId")

    @JacksonXmlProperty(localName = "versionId")

    private String versionId;

    public GetObjectTaggingRequest withDate(String date) {
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

    public GetObjectTaggingRequest withBucketName(String bucketName) {
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

    public GetObjectTaggingRequest withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * 设置标签对象名。
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public GetObjectTaggingRequest withTagging(String tagging) {
        this.tagging = tagging;
        return this;
    }

    /**
     * 标识当前请求是对象标签请求。
     * @return tagging
     */
    public String getTagging() {
        return tagging;
    }

    public void setTagging(String tagging) {
        this.tagging = tagging;
    }

    public GetObjectTaggingRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 对象版本号。标识设置指定版本的对象标签。对应的附加响应消息头为x-obs-version-id。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetObjectTaggingRequest that = (GetObjectTaggingRequest) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.objectKey, that.objectKey) && Objects.equals(this.tagging, that.tagging)
            && Objects.equals(this.versionId, that.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, bucketName, objectKey, tagging, versionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetObjectTaggingRequest {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    tagging: ").append(toIndentedString(tagging)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
