package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "GetObjectMetadataRequest")
public class GetObjectMetadataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    @JacksonXmlProperty(localName = "object_key")

    private String objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionId")

    @JacksonXmlProperty(localName = "versionId")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Origin")

    @JacksonXmlProperty(localName = "Origin")

    private String origin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Request-Headers")

    @JacksonXmlProperty(localName = "Access-Control-Request-Headers")

    private String accessControlRequestHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-algorithm")

    private String xObsServerSideEncryptionCustomerAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-key")

    private String xObsServerSideEncryptionCustomerKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key-MD5")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-key-MD5")

    private String xObsServerSideEncryptionCustomerKeyMD5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success-action-redirect")

    @JacksonXmlProperty(localName = "success-action-redirect")

    private String successActionRedirect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-expires")

    @JacksonXmlProperty(localName = "x-obs-expires")

    private Integer xObsExpires;

    public GetObjectMetadataRequest withBucketName(String bucketName) {
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

    public GetObjectMetadataRequest withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * 通过此请求获取元数据的对象名称。 
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public GetObjectMetadataRequest withDate(String date) {
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

    public GetObjectMetadataRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 对象的版本号。 
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public GetObjectMetadataRequest withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * 预请求指定的跨域请求Origin（通常为域名）。 
     * @return origin
     */
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public GetObjectMetadataRequest withAccessControlRequestHeaders(String accessControlRequestHeaders) {
        this.accessControlRequestHeaders = accessControlRequestHeaders;
        return this;
    }

    /**
     * 实际请求可以带的HTTP头域，可以带多个头域。 
     * @return accessControlRequestHeaders
     */
    public String getAccessControlRequestHeaders() {
        return accessControlRequestHeaders;
    }

    public void setAccessControlRequestHeaders(String accessControlRequestHeaders) {
        this.accessControlRequestHeaders = accessControlRequestHeaders;
    }

    public GetObjectMetadataRequest withXObsServerSideEncryptionCustomerAlgorithm(
        String xObsServerSideEncryptionCustomerAlgorithm) {
        this.xObsServerSideEncryptionCustomerAlgorithm = xObsServerSideEncryptionCustomerAlgorithm;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示解密使用的算法。  示例：x-obs-server-side-encryption-customer-algorithm：AES256  约束：需要和x-obs-server-side-encryption-customer-key， x-obs-server-side-encryption-customer-key-MD5一起使用。 
     * @return xObsServerSideEncryptionCustomerAlgorithm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")
    public String getXObsServerSideEncryptionCustomerAlgorithm() {
        return xObsServerSideEncryptionCustomerAlgorithm;
    }

    public void setXObsServerSideEncryptionCustomerAlgorithm(String xObsServerSideEncryptionCustomerAlgorithm) {
        this.xObsServerSideEncryptionCustomerAlgorithm = xObsServerSideEncryptionCustomerAlgorithm;
    }

    public GetObjectMetadataRequest withXObsServerSideEncryptionCustomerKey(
        String xObsServerSideEncryptionCustomerKey) {
        this.xObsServerSideEncryptionCustomerKey = xObsServerSideEncryptionCustomerKey;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示解密使用的密钥。  示例：x-obs-server-side-encryption-customer-key:K7QkYpBkM5+hca27fsNkUnNVaobncnLht/rCB2o/9Cw=  约束：该头域由256-bit的密钥经过base64-encoded得到，需要和x-obs-server-side-encryption-customer-algorithm，x-obs-server-side-encryption-customer-key-MD5一起使用。 
     * @return xObsServerSideEncryptionCustomerKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key")
    public String getXObsServerSideEncryptionCustomerKey() {
        return xObsServerSideEncryptionCustomerKey;
    }

    public void setXObsServerSideEncryptionCustomerKey(String xObsServerSideEncryptionCustomerKey) {
        this.xObsServerSideEncryptionCustomerKey = xObsServerSideEncryptionCustomerKey;
    }

    public GetObjectMetadataRequest withXObsServerSideEncryptionCustomerKeyMD5(
        String xObsServerSideEncryptionCustomerKeyMD5) {
        this.xObsServerSideEncryptionCustomerKeyMD5 = xObsServerSideEncryptionCustomerKeyMD5;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密使用的密钥的MD5值。MD5值用于验证密钥传输过程中没有出错。  示例：x-obs-server-side-encryption-customer-key-MD5:4XvB3tbNTN+tIEVa0/fGaQ==  约束: 该头域由密钥的128-bit MD5值经过base64-encoded得到，需要和x-obs-server-side-encryption-customer-algorithm，x-obs-server-side-encryption-customer-key一起使用。 
     * @return xObsServerSideEncryptionCustomerKeyMD5
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key-MD5")
    public String getXObsServerSideEncryptionCustomerKeyMD5() {
        return xObsServerSideEncryptionCustomerKeyMD5;
    }

    public void setXObsServerSideEncryptionCustomerKeyMD5(String xObsServerSideEncryptionCustomerKeyMD5) {
        this.xObsServerSideEncryptionCustomerKeyMD5 = xObsServerSideEncryptionCustomerKeyMD5;
    }

    public GetObjectMetadataRequest withSuccessActionRedirect(String successActionRedirect) {
        this.successActionRedirect = successActionRedirect;
        return this;
    }

    /**
     * 此参数的值是一个URL，用于指定当此次请求操作成功响应后的重定向的地址。  如果此参数值有效且操作成功，响应码为303，Location头域由此参数以及桶名、对象名、对象的ETag组成。 如果此参数值无效，则OBS忽略此参数的作用，响应码为204，Location头域为对象地址。 
     * @return successActionRedirect
     */
    public String getSuccessActionRedirect() {
        return successActionRedirect;
    }

    public void setSuccessActionRedirect(String successActionRedirect) {
        this.successActionRedirect = successActionRedirect;
    }

    public GetObjectMetadataRequest withXObsExpires(Integer xObsExpires) {
        this.xObsExpires = xObsExpires;
        return this;
    }

    /**
     * 表示对象的过期时间，单位是天。过期之后对象会被自动删除。（从对象最后修改时间开始计算）  此字段对于每个对象仅支持上传时配置，不支持后期通过修改元数据接口修改。  示例：x-obs-expires:3 
     * @return xObsExpires
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-expires")
    public Integer getXObsExpires() {
        return xObsExpires;
    }

    public void setXObsExpires(Integer xObsExpires) {
        this.xObsExpires = xObsExpires;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetObjectMetadataRequest that = (GetObjectMetadataRequest) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.objectKey, that.objectKey)
            && Objects.equals(this.date, that.date) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.origin, that.origin)
            && Objects.equals(this.accessControlRequestHeaders, that.accessControlRequestHeaders)
            && Objects.equals(this.xObsServerSideEncryptionCustomerAlgorithm,
                that.xObsServerSideEncryptionCustomerAlgorithm)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKey, that.xObsServerSideEncryptionCustomerKey)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKeyMD5, that.xObsServerSideEncryptionCustomerKeyMD5)
            && Objects.equals(this.successActionRedirect, that.successActionRedirect)
            && Objects.equals(this.xObsExpires, that.xObsExpires);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName,
            objectKey,
            date,
            versionId,
            origin,
            accessControlRequestHeaders,
            xObsServerSideEncryptionCustomerAlgorithm,
            xObsServerSideEncryptionCustomerKey,
            xObsServerSideEncryptionCustomerKeyMD5,
            successActionRedirect,
            xObsExpires);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetObjectMetadataRequest {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    accessControlRequestHeaders: ")
            .append(toIndentedString(accessControlRequestHeaders))
            .append("\n");
        sb.append("    xObsServerSideEncryptionCustomerAlgorithm: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerAlgorithm))
            .append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKey: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKey))
            .append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKeyMD5: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKeyMD5))
            .append("\n");
        sb.append("    successActionRedirect: ").append(toIndentedString(successActionRedirect)).append("\n");
        sb.append("    xObsExpires: ").append(toIndentedString(xObsExpires)).append("\n");
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
