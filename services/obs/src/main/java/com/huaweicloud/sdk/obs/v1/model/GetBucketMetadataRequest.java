package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "GetBucketMetadataRequest")
public class GetBucketMetadataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Origin")

    @JacksonXmlProperty(localName = "Origin")

    private String origin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Request-Headers")

    @JacksonXmlProperty(localName = "Access-Control-Request-Headers")

    private String accessControlRequestHeaders;

    public GetBucketMetadataRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名称。 
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public GetBucketMetadataRequest withDate(String date) {
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

    public GetBucketMetadataRequest withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * 预请求指定的跨域请求Origin（通常为域名）。 如果想要获取CORS配置信息，必添加该消息头。 
     * @return origin
     */
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public GetBucketMetadataRequest withAccessControlRequestHeaders(String accessControlRequestHeaders) {
        this.accessControlRequestHeaders = accessControlRequestHeaders;
        return this;
    }

    /**
     * 实际请求可以带的HTTP头域，可以带多个头域。 如果想要获取CORS配置信息，可选添加该消息头。 
     * @return accessControlRequestHeaders
     */
    public String getAccessControlRequestHeaders() {
        return accessControlRequestHeaders;
    }

    public void setAccessControlRequestHeaders(String accessControlRequestHeaders) {
        this.accessControlRequestHeaders = accessControlRequestHeaders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetBucketMetadataRequest that = (GetBucketMetadataRequest) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.date, that.date)
            && Objects.equals(this.origin, that.origin)
            && Objects.equals(this.accessControlRequestHeaders, that.accessControlRequestHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, date, origin, accessControlRequestHeaders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBucketMetadataRequest {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    accessControlRequestHeaders: ")
            .append(toIndentedString(accessControlRequestHeaders))
            .append("\n");
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
