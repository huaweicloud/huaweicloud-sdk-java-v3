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
@JacksonXmlRootElement(localName = "SetBucketCustomedomainRequest")
public class SetBucketCustomedomainRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-MD5")

    @JacksonXmlProperty(localName = "Content-MD5")

    private String contentMD5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customdomain")

    @JacksonXmlProperty(localName = "customdomain")

    private String customdomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private SetBucketCustomDomainBody body;

    public SetBucketCustomedomainRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * 设置自定义域名证书时，必须要携带此头域，来校验请求消息体内容和发送时是否一致。 按照RFC 1864标准计算出消息体的MD5摘要字符串，即消息体128-bit MD5值经过base64编码后得到的字符串。 示例：n58IG6hfM7vqI4K0vnWpog== 
     * @return contentMD5
     */
    public String getContentMD5() {
        return contentMD5;
    }

    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    public SetBucketCustomedomainRequest withDate(String date) {
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

    public SetBucketCustomedomainRequest withBucketName(String bucketName) {
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

    public SetBucketCustomedomainRequest withCustomdomain(String customdomain) {
        this.customdomain = customdomain;
        return this;
    }

    /**
     * 桶的自定义域名。  类型：字符串，必须满足域名规则。  规格：最长256字节。  默认值：无。  约束：一个桶最多可以设置30个自定义域名，一个自定义域名只能被一个桶使用。 
     * @return customdomain
     */
    public String getCustomdomain() {
        return customdomain;
    }

    public void setCustomdomain(String customdomain) {
        this.customdomain = customdomain;
    }

    public SetBucketCustomedomainRequest withBody(SetBucketCustomDomainBody body) {
        this.body = body;
        return this;
    }

    public SetBucketCustomedomainRequest withBody(Consumer<SetBucketCustomDomainBody> bodySetter) {
        if (this.body == null) {
            this.body = new SetBucketCustomDomainBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SetBucketCustomDomainBody getBody() {
        return body;
    }

    public void setBody(SetBucketCustomDomainBody body) {
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
        SetBucketCustomedomainRequest that = (SetBucketCustomedomainRequest) obj;
        return Objects.equals(this.contentMD5, that.contentMD5) && Objects.equals(this.date, that.date)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.customdomain, that.customdomain)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentMD5, date, bucketName, customdomain, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketCustomedomainRequest {\n");
        sb.append("    contentMD5: ").append(toIndentedString(contentMD5)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    customdomain: ").append(toIndentedString(customdomain)).append("\n");
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
