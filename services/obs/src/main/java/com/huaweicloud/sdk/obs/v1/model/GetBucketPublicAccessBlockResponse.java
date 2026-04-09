package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlResponse;

import java.util.Objects;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "GetBucketPublicAccessBlockResponse")
public class GetBucketPublicAccessBlockResponse extends SdkXmlResponse<GetBucketPublicAccessBlockResponse> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "BlockPublicAcls")

    @JacksonXmlProperty(localName = "BlockPublicAcls")

    private Boolean blockPublicAcls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IgnorePublicAcls")

    @JacksonXmlProperty(localName = "IgnorePublicAcls")

    private Boolean ignorePublicAcls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "BlockPublicPolicy")

    @JacksonXmlProperty(localName = "BlockPublicPolicy")

    private Boolean blockPublicPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "RestrictPublicBuckets")

    @JacksonXmlProperty(localName = "RestrictPublicBuckets")

    private Boolean restrictPublicBuckets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-id-2")

    @JacksonXmlProperty(localName = "x-obs-id-2")

    private String xObsId2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-request-id")

    @JacksonXmlProperty(localName = "x-obs-request-id")

    private String xObsRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    @JacksonXmlProperty(localName = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    @JacksonXmlProperty(localName = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    public GetBucketPublicAccessBlockResponse withBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
        return this;
    }

    /**
     * 指定是否应该禁止为桶或桶内对象配置公开的ACL（access control list）。如果指定为true，会出现以下现象： 上传对象时，如果指定公开的ACL，则上传对象失败，返回403 Access Denied。 修改桶ACL或对象ACL时，如果指定公开的ACL，则修改ACL失败，返回403 Access Denied。 
     * @return blockPublicAcls
     */
    public Boolean getBlockPublicAcls() {
        return blockPublicAcls;
    }

    public void setBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    public GetBucketPublicAccessBlockResponse withIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
        return this;
    }

    /**
     * 指定是否需要忽略已经为桶或桶内对象配置的公开的ACL。如果指定为true，该桶或桶内对象公开的ACL均会失效。 
     * @return ignorePublicAcls
     */
    public Boolean getIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    public GetBucketPublicAccessBlockResponse withBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
        return this;
    }

    /**
     * 指定是否应该禁止为桶配置公开的桶策略。如果指定为true，为桶配置桶策略时，如果指定公开的桶策略，则配置桶策略失败，返回403 Access Denied。 
     * @return blockPublicPolicy
     */
    public Boolean getBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    public GetBucketPublicAccessBlockResponse withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
        return this;
    }

    /**
     * 指定是否需要对已有的公开桶策略进行限制。如果指定为true并且桶策略为公开时，只允许云服务账号和桶拥有者账号对该桶访问。 
     * @return restrictPublicBuckets
     */
    public Boolean getRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    public GetBucketPublicAccessBlockResponse withXObsId2(String xObsId2) {
        this.xObsId2 = xObsId2;
        return this;
    }

    /**
     * Get xObsId2
     * @return xObsId2
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-id-2")
    public String getXObsId2() {
        return xObsId2;
    }

    public void setXObsId2(String xObsId2) {
        this.xObsId2 = xObsId2;
    }

    public GetBucketPublicAccessBlockResponse withXObsRequestId(String xObsRequestId) {
        this.xObsRequestId = xObsRequestId;
        return this;
    }

    /**
     * Get xObsRequestId
     * @return xObsRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-request-id")
    public String getXObsRequestId() {
        return xObsRequestId;
    }

    public void setXObsRequestId(String xObsRequestId) {
        this.xObsRequestId = xObsRequestId;
    }

    public GetBucketPublicAccessBlockResponse withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public GetBucketPublicAccessBlockResponse withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get contentLength
     * @return contentLength
     */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public GetBucketPublicAccessBlockResponse withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetBucketPublicAccessBlockResponse that = (GetBucketPublicAccessBlockResponse) obj;
        return Objects.equals(this.blockPublicAcls, that.blockPublicAcls)
            && Objects.equals(this.ignorePublicAcls, that.ignorePublicAcls)
            && Objects.equals(this.blockPublicPolicy, that.blockPublicPolicy)
            && Objects.equals(this.restrictPublicBuckets, that.restrictPublicBuckets)
            && Objects.equals(this.xObsId2, that.xObsId2) && Objects.equals(this.xObsRequestId, that.xObsRequestId)
            && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.contentLength, that.contentLength) && Objects.equals(this.date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockPublicAcls,
            ignorePublicAcls,
            blockPublicPolicy,
            restrictPublicBuckets,
            xObsId2,
            xObsRequestId,
            connection,
            contentLength,
            date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBucketPublicAccessBlockResponse {\n");
        sb.append("    blockPublicAcls: ").append(toIndentedString(blockPublicAcls)).append("\n");
        sb.append("    ignorePublicAcls: ").append(toIndentedString(ignorePublicAcls)).append("\n");
        sb.append("    blockPublicPolicy: ").append(toIndentedString(blockPublicPolicy)).append("\n");
        sb.append("    restrictPublicBuckets: ").append(toIndentedString(restrictPublicBuckets)).append("\n");
        sb.append("    xObsId2: ").append(toIndentedString(xObsId2)).append("\n");
        sb.append("    xObsRequestId: ").append(toIndentedString(xObsRequestId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
