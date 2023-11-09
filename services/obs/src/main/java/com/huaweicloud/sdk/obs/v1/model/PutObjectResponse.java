package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "PutObjectResponse")
public class PutObjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-id-2")

    @JacksonXmlProperty(localName = "x-obs-id-2")

    private String xObsId2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-request-id")

    @JacksonXmlProperty(localName = "x-obs-request-id")

    private String xObsRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ETag")

    @JacksonXmlProperty(localName = "ETag")

    private String etag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption")

    private String xObsServerSideEncryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-algorithm")

    private String xObsServerSideEncryptionCustomerAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-storage-class")

    @JacksonXmlProperty(localName = "x-obs-storage-class")

    private String xObsStorageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    @JacksonXmlProperty(localName = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key-MD5")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-key-MD5")

    private String xObsServerSideEncryptionCustomerKeyMD5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-kms-key-id")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-kms-key-id")

    private String xObsServerSideEncryptionKmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    @JacksonXmlProperty(localName = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-version-id")

    @JacksonXmlProperty(localName = "x-obs-version-id")

    private String xObsVersionId;

    public PutObjectResponse withXObsId2(String xObsId2) {
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

    public PutObjectResponse withXObsRequestId(String xObsRequestId) {
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

    public PutObjectResponse withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get etag
     * @return etag
     */
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public PutObjectResponse withXObsServerSideEncryption(String xObsServerSideEncryption) {
        this.xObsServerSideEncryption = xObsServerSideEncryption;
        return this;
    }

    /**
     * Get xObsServerSideEncryption
     * @return xObsServerSideEncryption
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption")
    public String getXObsServerSideEncryption() {
        return xObsServerSideEncryption;
    }

    public void setXObsServerSideEncryption(String xObsServerSideEncryption) {
        this.xObsServerSideEncryption = xObsServerSideEncryption;
    }

    public PutObjectResponse withXObsServerSideEncryptionCustomerAlgorithm(
        String xObsServerSideEncryptionCustomerAlgorithm) {
        this.xObsServerSideEncryptionCustomerAlgorithm = xObsServerSideEncryptionCustomerAlgorithm;
        return this;
    }

    /**
     * Get xObsServerSideEncryptionCustomerAlgorithm
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

    public PutObjectResponse withXObsStorageClass(String xObsStorageClass) {
        this.xObsStorageClass = xObsStorageClass;
        return this;
    }

    /**
     * Get xObsStorageClass
     * @return xObsStorageClass
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-storage-class")
    public String getXObsStorageClass() {
        return xObsStorageClass;
    }

    public void setXObsStorageClass(String xObsStorageClass) {
        this.xObsStorageClass = xObsStorageClass;
    }

    public PutObjectResponse withConnection(String connection) {
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

    public PutObjectResponse withXObsServerSideEncryptionCustomerKeyMD5(String xObsServerSideEncryptionCustomerKeyMD5) {
        this.xObsServerSideEncryptionCustomerKeyMD5 = xObsServerSideEncryptionCustomerKeyMD5;
        return this;
    }

    /**
     * Get xObsServerSideEncryptionCustomerKeyMD5
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

    public PutObjectResponse withXObsServerSideEncryptionKmsKeyId(String xObsServerSideEncryptionKmsKeyId) {
        this.xObsServerSideEncryptionKmsKeyId = xObsServerSideEncryptionKmsKeyId;
        return this;
    }

    /**
     * Get xObsServerSideEncryptionKmsKeyId
     * @return xObsServerSideEncryptionKmsKeyId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-kms-key-id")
    public String getXObsServerSideEncryptionKmsKeyId() {
        return xObsServerSideEncryptionKmsKeyId;
    }

    public void setXObsServerSideEncryptionKmsKeyId(String xObsServerSideEncryptionKmsKeyId) {
        this.xObsServerSideEncryptionKmsKeyId = xObsServerSideEncryptionKmsKeyId;
    }

    public PutObjectResponse withContentLength(String contentLength) {
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

    public PutObjectResponse withDate(String date) {
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

    public PutObjectResponse withXObsVersionId(String xObsVersionId) {
        this.xObsVersionId = xObsVersionId;
        return this;
    }

    /**
     * Get xObsVersionId
     * @return xObsVersionId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-version-id")
    public String getXObsVersionId() {
        return xObsVersionId;
    }

    public void setXObsVersionId(String xObsVersionId) {
        this.xObsVersionId = xObsVersionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutObjectResponse that = (PutObjectResponse) obj;
        return Objects.equals(this.xObsId2, that.xObsId2) && Objects.equals(this.xObsRequestId, that.xObsRequestId)
            && Objects.equals(this.etag, that.etag)
            && Objects.equals(this.xObsServerSideEncryption, that.xObsServerSideEncryption)
            && Objects.equals(this.xObsServerSideEncryptionCustomerAlgorithm,
                that.xObsServerSideEncryptionCustomerAlgorithm)
            && Objects.equals(this.xObsStorageClass, that.xObsStorageClass)
            && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKeyMD5, that.xObsServerSideEncryptionCustomerKeyMD5)
            && Objects.equals(this.xObsServerSideEncryptionKmsKeyId, that.xObsServerSideEncryptionKmsKeyId)
            && Objects.equals(this.contentLength, that.contentLength) && Objects.equals(this.date, that.date)
            && Objects.equals(this.xObsVersionId, that.xObsVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xObsId2,
            xObsRequestId,
            etag,
            xObsServerSideEncryption,
            xObsServerSideEncryptionCustomerAlgorithm,
            xObsStorageClass,
            connection,
            xObsServerSideEncryptionCustomerKeyMD5,
            xObsServerSideEncryptionKmsKeyId,
            contentLength,
            date,
            xObsVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutObjectResponse {\n");
        sb.append("    xObsId2: ").append(toIndentedString(xObsId2)).append("\n");
        sb.append("    xObsRequestId: ").append(toIndentedString(xObsRequestId)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    xObsServerSideEncryption: ").append(toIndentedString(xObsServerSideEncryption)).append("\n");
        sb.append("    xObsServerSideEncryptionCustomerAlgorithm: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerAlgorithm))
            .append("\n");
        sb.append("    xObsStorageClass: ").append(toIndentedString(xObsStorageClass)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKeyMD5: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKeyMD5))
            .append("\n");
        sb.append("    xObsServerSideEncryptionKmsKeyId: ")
            .append(toIndentedString(xObsServerSideEncryptionKmsKeyId))
            .append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    xObsVersionId: ").append(toIndentedString(xObsVersionId)).append("\n");
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
