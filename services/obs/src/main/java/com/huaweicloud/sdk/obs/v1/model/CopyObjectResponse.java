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
@JacksonXmlRootElement(localName = "CopyObjectResponse")
public class CopyObjectResponse extends SdkXmlResponse<CopyObjectResponse> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "LastModified")

    @JacksonXmlProperty(localName = "LastModified")

    private String lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ETag")

    @JacksonXmlProperty(localName = "ETag")

    private String etag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-id-2")

    @JacksonXmlProperty(localName = "x-obs-id-2")

    private String xObsId2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-request-id")

    @JacksonXmlProperty(localName = "x-obs-request-id")

    private String xObsRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption")

    private String xObsServerSideEncryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    @JacksonXmlProperty(localName = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key-MD5")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-key-MD5")

    private String xObsServerSideEncryptionCustomerKeyMD5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-algorithm")

    private String xObsServerSideEncryptionCustomerAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-version-id")

    @JacksonXmlProperty(localName = "x-obs-copy-source-version-id")

    private String xObsCopySourceVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-storage-class")

    @JacksonXmlProperty(localName = "x-obs-storage-class")

    private String xObsStorageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-kms-key-id")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-kms-key-id")

    private String xObsServerSideEncryptionKmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    @JacksonXmlProperty(localName = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-version-id")

    @JacksonXmlProperty(localName = "x-obs-version-id")

    private String xObsVersionId;

    public CopyObjectResponse withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 对象上次修改的时间。 
     * @return lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public CopyObjectResponse withEtag(String etag) {
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

    public CopyObjectResponse withXObsId2(String xObsId2) {
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

    public CopyObjectResponse withXObsRequestId(String xObsRequestId) {
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

    public CopyObjectResponse withXObsServerSideEncryption(String xObsServerSideEncryption) {
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

    public CopyObjectResponse withConnection(String connection) {
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

    public CopyObjectResponse withXObsServerSideEncryptionCustomerKeyMD5(
        String xObsServerSideEncryptionCustomerKeyMD5) {
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

    public CopyObjectResponse withDate(String date) {
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

    public CopyObjectResponse withXObsServerSideEncryptionCustomerAlgorithm(
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

    public CopyObjectResponse withXObsCopySourceVersionId(String xObsCopySourceVersionId) {
        this.xObsCopySourceVersionId = xObsCopySourceVersionId;
        return this;
    }

    /**
     * Get xObsCopySourceVersionId
     * @return xObsCopySourceVersionId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-version-id")
    public String getXObsCopySourceVersionId() {
        return xObsCopySourceVersionId;
    }

    public void setXObsCopySourceVersionId(String xObsCopySourceVersionId) {
        this.xObsCopySourceVersionId = xObsCopySourceVersionId;
    }

    public CopyObjectResponse withXObsStorageClass(String xObsStorageClass) {
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

    public CopyObjectResponse withXObsServerSideEncryptionKmsKeyId(String xObsServerSideEncryptionKmsKeyId) {
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

    public CopyObjectResponse withContentLength(String contentLength) {
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

    public CopyObjectResponse withXObsVersionId(String xObsVersionId) {
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
        CopyObjectResponse that = (CopyObjectResponse) obj;
        return Objects.equals(this.lastModified, that.lastModified) && Objects.equals(this.etag, that.etag)
            && Objects.equals(this.xObsId2, that.xObsId2) && Objects.equals(this.xObsRequestId, that.xObsRequestId)
            && Objects.equals(this.xObsServerSideEncryption, that.xObsServerSideEncryption)
            && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKeyMD5, that.xObsServerSideEncryptionCustomerKeyMD5)
            && Objects.equals(this.date, that.date)
            && Objects.equals(this.xObsServerSideEncryptionCustomerAlgorithm,
                that.xObsServerSideEncryptionCustomerAlgorithm)
            && Objects.equals(this.xObsCopySourceVersionId, that.xObsCopySourceVersionId)
            && Objects.equals(this.xObsStorageClass, that.xObsStorageClass)
            && Objects.equals(this.xObsServerSideEncryptionKmsKeyId, that.xObsServerSideEncryptionKmsKeyId)
            && Objects.equals(this.contentLength, that.contentLength)
            && Objects.equals(this.xObsVersionId, that.xObsVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastModified,
            etag,
            xObsId2,
            xObsRequestId,
            xObsServerSideEncryption,
            connection,
            xObsServerSideEncryptionCustomerKeyMD5,
            date,
            xObsServerSideEncryptionCustomerAlgorithm,
            xObsCopySourceVersionId,
            xObsStorageClass,
            xObsServerSideEncryptionKmsKeyId,
            contentLength,
            xObsVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyObjectResponse {\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    xObsId2: ").append(toIndentedString(xObsId2)).append("\n");
        sb.append("    xObsRequestId: ").append(toIndentedString(xObsRequestId)).append("\n");
        sb.append("    xObsServerSideEncryption: ").append(toIndentedString(xObsServerSideEncryption)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKeyMD5: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKeyMD5))
            .append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    xObsServerSideEncryptionCustomerAlgorithm: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerAlgorithm))
            .append("\n");
        sb.append("    xObsCopySourceVersionId: ").append(toIndentedString(xObsCopySourceVersionId)).append("\n");
        sb.append("    xObsStorageClass: ").append(toIndentedString(xObsStorageClass)).append("\n");
        sb.append("    xObsServerSideEncryptionKmsKeyId: ")
            .append(toIndentedString(xObsServerSideEncryptionKmsKeyId))
            .append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
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
