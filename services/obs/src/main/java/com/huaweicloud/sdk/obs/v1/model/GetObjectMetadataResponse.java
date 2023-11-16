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
@JacksonXmlRootElement(localName = "GetObjectMetadataResponse")
public class GetObjectMetadataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-id-2")

    @JacksonXmlProperty(localName = "x-obs-id-2")

    private String xObsId2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-request-id")

    @JacksonXmlProperty(localName = "x-obs-request-id")

    private String xObsRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-hash-crc64ecma")

    @JacksonXmlProperty(localName = "x-obs-hash-crc64ecma")

    private String xObsHashCrc64ecma;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Origin")

    @JacksonXmlProperty(localName = "Access-Control-Allow-Origin")

    private String accessControlAllowOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption")

    private String xObsServerSideEncryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-restore")

    @JacksonXmlProperty(localName = "x-obs-restore")

    private String xObsRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-object-type")

    @JacksonXmlProperty(localName = "x-obs-object-type")

    private String xObsObjectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-next-append-position")

    @JacksonXmlProperty(localName = "x-obs-next-append-position")

    private Integer xObsNextAppendPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Methods")

    @JacksonXmlProperty(localName = "Access-Control-Allow-Methods")

    private String accessControlAllowMethods;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    @JacksonXmlProperty(localName = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key-MD5")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-key-MD5")

    private String xObsServerSideEncryptionCustomerKeyMD5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-expiration")

    @JacksonXmlProperty(localName = "x-obs-expiration")

    private String xObsExpiration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Headers")

    @JacksonXmlProperty(localName = "Access-Control-Allow-Headers")

    private String accessControlAllowHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-uploadId")

    @JacksonXmlProperty(localName = "x-obs-uploadId")

    private String xObsUploadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Expose-Headers")

    @JacksonXmlProperty(localName = "Access-Control-Expose-Headers")

    private String accessControlExposeHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ETag")

    @JacksonXmlProperty(localName = "ETag")

    private String etag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-algorithm")

    private String xObsServerSideEncryptionCustomerAlgorithm;

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
    @JsonProperty(value = "Access-Control-Max-Age")

    @JacksonXmlProperty(localName = "Access-Control-Max-Age")

    private Integer accessControlMaxAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-website-redirect-location")

    @JacksonXmlProperty(localName = "x-obs-website-redirect-location")

    private String xObsWebsiteRedirectLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-version-id")

    @JacksonXmlProperty(localName = "x-obs-version-id")

    private String xObsVersionId;

    public GetObjectMetadataResponse withXObsId2(String xObsId2) {
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

    public GetObjectMetadataResponse withXObsRequestId(String xObsRequestId) {
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

    public GetObjectMetadataResponse withXObsHashCrc64ecma(String xObsHashCrc64ecma) {
        this.xObsHashCrc64ecma = xObsHashCrc64ecma;
        return this;
    }

    /**
     * Get xObsHashCrc64ecma
     * @return xObsHashCrc64ecma
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-hash-crc64ecma")
    public String getXObsHashCrc64ecma() {
        return xObsHashCrc64ecma;
    }

    public void setXObsHashCrc64ecma(String xObsHashCrc64ecma) {
        this.xObsHashCrc64ecma = xObsHashCrc64ecma;
    }

    public GetObjectMetadataResponse withAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
        return this;
    }

    /**
     * Get accessControlAllowOrigin
     * @return accessControlAllowOrigin
     */
    public String getAccessControlAllowOrigin() {
        return accessControlAllowOrigin;
    }

    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }

    public GetObjectMetadataResponse withXObsServerSideEncryption(String xObsServerSideEncryption) {
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

    public GetObjectMetadataResponse withXObsRestore(String xObsRestore) {
        this.xObsRestore = xObsRestore;
        return this;
    }

    /**
     * Get xObsRestore
     * @return xObsRestore
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-restore")
    public String getXObsRestore() {
        return xObsRestore;
    }

    public void setXObsRestore(String xObsRestore) {
        this.xObsRestore = xObsRestore;
    }

    public GetObjectMetadataResponse withXObsObjectType(String xObsObjectType) {
        this.xObsObjectType = xObsObjectType;
        return this;
    }

    /**
     * Get xObsObjectType
     * @return xObsObjectType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-object-type")
    public String getXObsObjectType() {
        return xObsObjectType;
    }

    public void setXObsObjectType(String xObsObjectType) {
        this.xObsObjectType = xObsObjectType;
    }

    public GetObjectMetadataResponse withXObsNextAppendPosition(Integer xObsNextAppendPosition) {
        this.xObsNextAppendPosition = xObsNextAppendPosition;
        return this;
    }

    /**
     * Get xObsNextAppendPosition
     * @return xObsNextAppendPosition
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-next-append-position")
    public Integer getXObsNextAppendPosition() {
        return xObsNextAppendPosition;
    }

    public void setXObsNextAppendPosition(Integer xObsNextAppendPosition) {
        this.xObsNextAppendPosition = xObsNextAppendPosition;
    }

    public GetObjectMetadataResponse withAccessControlAllowMethods(String accessControlAllowMethods) {
        this.accessControlAllowMethods = accessControlAllowMethods;
        return this;
    }

    /**
     * Get accessControlAllowMethods
     * @return accessControlAllowMethods
     */
    public String getAccessControlAllowMethods() {
        return accessControlAllowMethods;
    }

    public void setAccessControlAllowMethods(String accessControlAllowMethods) {
        this.accessControlAllowMethods = accessControlAllowMethods;
    }

    public GetObjectMetadataResponse withConnection(String connection) {
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

    public GetObjectMetadataResponse withXObsServerSideEncryptionCustomerKeyMD5(
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

    public GetObjectMetadataResponse withXObsExpiration(String xObsExpiration) {
        this.xObsExpiration = xObsExpiration;
        return this;
    }

    /**
     * Get xObsExpiration
     * @return xObsExpiration
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-expiration")
    public String getXObsExpiration() {
        return xObsExpiration;
    }

    public void setXObsExpiration(String xObsExpiration) {
        this.xObsExpiration = xObsExpiration;
    }

    public GetObjectMetadataResponse withDate(String date) {
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

    public GetObjectMetadataResponse withAccessControlAllowHeaders(String accessControlAllowHeaders) {
        this.accessControlAllowHeaders = accessControlAllowHeaders;
        return this;
    }

    /**
     * Get accessControlAllowHeaders
     * @return accessControlAllowHeaders
     */
    public String getAccessControlAllowHeaders() {
        return accessControlAllowHeaders;
    }

    public void setAccessControlAllowHeaders(String accessControlAllowHeaders) {
        this.accessControlAllowHeaders = accessControlAllowHeaders;
    }

    public GetObjectMetadataResponse withXObsUploadId(String xObsUploadId) {
        this.xObsUploadId = xObsUploadId;
        return this;
    }

    /**
     * Get xObsUploadId
     * @return xObsUploadId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-uploadId")
    public String getXObsUploadId() {
        return xObsUploadId;
    }

    public void setXObsUploadId(String xObsUploadId) {
        this.xObsUploadId = xObsUploadId;
    }

    public GetObjectMetadataResponse withAccessControlExposeHeaders(String accessControlExposeHeaders) {
        this.accessControlExposeHeaders = accessControlExposeHeaders;
        return this;
    }

    /**
     * Get accessControlExposeHeaders
     * @return accessControlExposeHeaders
     */
    public String getAccessControlExposeHeaders() {
        return accessControlExposeHeaders;
    }

    public void setAccessControlExposeHeaders(String accessControlExposeHeaders) {
        this.accessControlExposeHeaders = accessControlExposeHeaders;
    }

    public GetObjectMetadataResponse withEtag(String etag) {
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

    public GetObjectMetadataResponse withXObsServerSideEncryptionCustomerAlgorithm(
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

    public GetObjectMetadataResponse withXObsStorageClass(String xObsStorageClass) {
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

    public GetObjectMetadataResponse withXObsServerSideEncryptionKmsKeyId(String xObsServerSideEncryptionKmsKeyId) {
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

    public GetObjectMetadataResponse withContentLength(String contentLength) {
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

    public GetObjectMetadataResponse withAccessControlMaxAge(Integer accessControlMaxAge) {
        this.accessControlMaxAge = accessControlMaxAge;
        return this;
    }

    /**
     * Get accessControlMaxAge
     * @return accessControlMaxAge
     */
    public Integer getAccessControlMaxAge() {
        return accessControlMaxAge;
    }

    public void setAccessControlMaxAge(Integer accessControlMaxAge) {
        this.accessControlMaxAge = accessControlMaxAge;
    }

    public GetObjectMetadataResponse withXObsWebsiteRedirectLocation(String xObsWebsiteRedirectLocation) {
        this.xObsWebsiteRedirectLocation = xObsWebsiteRedirectLocation;
        return this;
    }

    /**
     * Get xObsWebsiteRedirectLocation
     * @return xObsWebsiteRedirectLocation
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-website-redirect-location")
    public String getXObsWebsiteRedirectLocation() {
        return xObsWebsiteRedirectLocation;
    }

    public void setXObsWebsiteRedirectLocation(String xObsWebsiteRedirectLocation) {
        this.xObsWebsiteRedirectLocation = xObsWebsiteRedirectLocation;
    }

    public GetObjectMetadataResponse withXObsVersionId(String xObsVersionId) {
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
        GetObjectMetadataResponse that = (GetObjectMetadataResponse) obj;
        return Objects.equals(this.xObsId2, that.xObsId2) && Objects.equals(this.xObsRequestId, that.xObsRequestId)
            && Objects.equals(this.xObsHashCrc64ecma, that.xObsHashCrc64ecma)
            && Objects.equals(this.accessControlAllowOrigin, that.accessControlAllowOrigin)
            && Objects.equals(this.xObsServerSideEncryption, that.xObsServerSideEncryption)
            && Objects.equals(this.xObsRestore, that.xObsRestore)
            && Objects.equals(this.xObsObjectType, that.xObsObjectType)
            && Objects.equals(this.xObsNextAppendPosition, that.xObsNextAppendPosition)
            && Objects.equals(this.accessControlAllowMethods, that.accessControlAllowMethods)
            && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKeyMD5, that.xObsServerSideEncryptionCustomerKeyMD5)
            && Objects.equals(this.xObsExpiration, that.xObsExpiration) && Objects.equals(this.date, that.date)
            && Objects.equals(this.accessControlAllowHeaders, that.accessControlAllowHeaders)
            && Objects.equals(this.xObsUploadId, that.xObsUploadId)
            && Objects.equals(this.accessControlExposeHeaders, that.accessControlExposeHeaders)
            && Objects.equals(this.etag, that.etag)
            && Objects.equals(this.xObsServerSideEncryptionCustomerAlgorithm,
                that.xObsServerSideEncryptionCustomerAlgorithm)
            && Objects.equals(this.xObsStorageClass, that.xObsStorageClass)
            && Objects.equals(this.xObsServerSideEncryptionKmsKeyId, that.xObsServerSideEncryptionKmsKeyId)
            && Objects.equals(this.contentLength, that.contentLength)
            && Objects.equals(this.accessControlMaxAge, that.accessControlMaxAge)
            && Objects.equals(this.xObsWebsiteRedirectLocation, that.xObsWebsiteRedirectLocation)
            && Objects.equals(this.xObsVersionId, that.xObsVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xObsId2,
            xObsRequestId,
            xObsHashCrc64ecma,
            accessControlAllowOrigin,
            xObsServerSideEncryption,
            xObsRestore,
            xObsObjectType,
            xObsNextAppendPosition,
            accessControlAllowMethods,
            connection,
            xObsServerSideEncryptionCustomerKeyMD5,
            xObsExpiration,
            date,
            accessControlAllowHeaders,
            xObsUploadId,
            accessControlExposeHeaders,
            etag,
            xObsServerSideEncryptionCustomerAlgorithm,
            xObsStorageClass,
            xObsServerSideEncryptionKmsKeyId,
            contentLength,
            accessControlMaxAge,
            xObsWebsiteRedirectLocation,
            xObsVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetObjectMetadataResponse {\n");
        sb.append("    xObsId2: ").append(toIndentedString(xObsId2)).append("\n");
        sb.append("    xObsRequestId: ").append(toIndentedString(xObsRequestId)).append("\n");
        sb.append("    xObsHashCrc64ecma: ").append(toIndentedString(xObsHashCrc64ecma)).append("\n");
        sb.append("    accessControlAllowOrigin: ").append(toIndentedString(accessControlAllowOrigin)).append("\n");
        sb.append("    xObsServerSideEncryption: ").append(toIndentedString(xObsServerSideEncryption)).append("\n");
        sb.append("    xObsRestore: ").append(toIndentedString(xObsRestore)).append("\n");
        sb.append("    xObsObjectType: ").append(toIndentedString(xObsObjectType)).append("\n");
        sb.append("    xObsNextAppendPosition: ").append(toIndentedString(xObsNextAppendPosition)).append("\n");
        sb.append("    accessControlAllowMethods: ").append(toIndentedString(accessControlAllowMethods)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKeyMD5: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKeyMD5))
            .append("\n");
        sb.append("    xObsExpiration: ").append(toIndentedString(xObsExpiration)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    accessControlAllowHeaders: ").append(toIndentedString(accessControlAllowHeaders)).append("\n");
        sb.append("    xObsUploadId: ").append(toIndentedString(xObsUploadId)).append("\n");
        sb.append("    accessControlExposeHeaders: ").append(toIndentedString(accessControlExposeHeaders)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    xObsServerSideEncryptionCustomerAlgorithm: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerAlgorithm))
            .append("\n");
        sb.append("    xObsStorageClass: ").append(toIndentedString(xObsStorageClass)).append("\n");
        sb.append("    xObsServerSideEncryptionKmsKeyId: ")
            .append(toIndentedString(xObsServerSideEncryptionKmsKeyId))
            .append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    accessControlMaxAge: ").append(toIndentedString(accessControlMaxAge)).append("\n");
        sb.append("    xObsWebsiteRedirectLocation: ")
            .append(toIndentedString(xObsWebsiteRedirectLocation))
            .append("\n");
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
