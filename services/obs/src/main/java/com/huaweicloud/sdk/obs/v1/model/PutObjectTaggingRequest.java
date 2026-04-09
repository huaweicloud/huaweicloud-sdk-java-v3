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
@JacksonXmlRootElement(localName = "PutObjectTaggingRequest")
public class PutObjectTaggingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-MD5")

    @JacksonXmlProperty(localName = "Content-MD5")

    private String contentMD5;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private PutObjectTaggingRequestBody body;

    public PutObjectTaggingRequest withDate(String date) {
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

    public PutObjectTaggingRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * 按照RFC 1864标准计算出消息体的MD5摘要字符串，即消息体128-bit MD5值经过base64编码后得到的字符串。也支持设置Content-SHA256头域，其值为消息体256-bit SHA256值经过base64编码后得到的字符串，Content-MD5和Content-SHA256二选一。 示例：n58IG6hfM7vqI4K0vnWpog==
     * @return contentMD5
     */
    public String getContentMD5() {
        return contentMD5;
    }

    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    public PutObjectTaggingRequest withBucketName(String bucketName) {
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

    public PutObjectTaggingRequest withObjectKey(String objectKey) {
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

    public PutObjectTaggingRequest withTagging(String tagging) {
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

    public PutObjectTaggingRequest withVersionId(String versionId) {
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

    public PutObjectTaggingRequest withBody(PutObjectTaggingRequestBody body) {
        this.body = body;
        return this;
    }

    public PutObjectTaggingRequest withBody(Consumer<PutObjectTaggingRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new PutObjectTaggingRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PutObjectTaggingRequestBody getBody() {
        return body;
    }

    public void setBody(PutObjectTaggingRequestBody body) {
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
        PutObjectTaggingRequest that = (PutObjectTaggingRequest) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.contentMD5, that.contentMD5)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.objectKey, that.objectKey)
            && Objects.equals(this.tagging, that.tagging) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, contentMD5, bucketName, objectKey, tagging, versionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutObjectTaggingRequest {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    contentMD5: ").append(toIndentedString(contentMD5)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    tagging: ").append(toIndentedString(tagging)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
