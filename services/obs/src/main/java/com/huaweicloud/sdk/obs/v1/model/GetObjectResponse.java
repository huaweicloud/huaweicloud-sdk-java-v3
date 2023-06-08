package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.core.SdkStreamResponse;

import java.util.Objects;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "GetObjectResponse")
public class GetObjectResponse extends SdkStreamResponse {

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
    @JsonProperty(value = "x-obs-object-type")

    @JacksonXmlProperty(localName = "x-obs-object-type")

    private String xObsObjectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-next-append-position")

    @JacksonXmlProperty(localName = "x-obs-next-append-position")

    private Integer xObsNextAppendPosition;

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
    @JsonProperty(value = "ETag")

    @JacksonXmlProperty(localName = "ETag")

    private String etag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-algorithm")

    private String xObsServerSideEncryptionCustomerAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-kms-key-id")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-kms-key-id")

    private String xObsServerSideEncryptionKmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    @JacksonXmlProperty(localName = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-website-redirect-location")

    @JacksonXmlProperty(localName = "x-obs-website-redirect-location")

    private String xObsWebsiteRedirectLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-delete-marker")

    @JacksonXmlProperty(localName = "x-obs-delete-marker")

    private Boolean xObsDeleteMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-version-id")

    @JacksonXmlProperty(localName = "x-obs-version-id")

    private String xObsVersionId;

    public GetObjectResponse withXObsId2(String xObsId2) {
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

    public GetObjectResponse withXObsRequestId(String xObsRequestId) {
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

    public GetObjectResponse withXObsServerSideEncryption(String xObsServerSideEncryption) {
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

    public GetObjectResponse withXObsObjectType(String xObsObjectType) {
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

    public GetObjectResponse withXObsNextAppendPosition(Integer xObsNextAppendPosition) {
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

    public GetObjectResponse withConnection(String connection) {
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

    public GetObjectResponse withXObsServerSideEncryptionCustomerKeyMD5(String xObsServerSideEncryptionCustomerKeyMD5) {
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

    public GetObjectResponse withXObsExpiration(String xObsExpiration) {
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

    public GetObjectResponse withDate(String date) {
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

    public GetObjectResponse withEtag(String etag) {
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

    public GetObjectResponse withXObsServerSideEncryptionCustomerAlgorithm(
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

    public GetObjectResponse withXObsServerSideEncryptionKmsKeyId(String xObsServerSideEncryptionKmsKeyId) {
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

    public GetObjectResponse withContentLength(String contentLength) {
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

    public GetObjectResponse withXObsWebsiteRedirectLocation(String xObsWebsiteRedirectLocation) {
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

    public GetObjectResponse withXObsDeleteMarker(Boolean xObsDeleteMarker) {
        this.xObsDeleteMarker = xObsDeleteMarker;
        return this;
    }

    /**
     * Get xObsDeleteMarker
     * @return xObsDeleteMarker
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-delete-marker")
    public Boolean getXObsDeleteMarker() {
        return xObsDeleteMarker;
    }

    public void setXObsDeleteMarker(Boolean xObsDeleteMarker) {
        this.xObsDeleteMarker = xObsDeleteMarker;
    }

    public GetObjectResponse withXObsVersionId(String xObsVersionId) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetObjectResponse getObjectResponse = (GetObjectResponse) o;
        return Objects.equals(this.xObsId2, getObjectResponse.xObsId2)
            && Objects.equals(this.xObsRequestId, getObjectResponse.xObsRequestId)
            && Objects.equals(this.xObsServerSideEncryption, getObjectResponse.xObsServerSideEncryption)
            && Objects.equals(this.xObsObjectType, getObjectResponse.xObsObjectType)
            && Objects.equals(this.xObsNextAppendPosition, getObjectResponse.xObsNextAppendPosition)
            && Objects.equals(this.connection, getObjectResponse.connection)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKeyMD5,
                getObjectResponse.xObsServerSideEncryptionCustomerKeyMD5)
            && Objects.equals(this.xObsExpiration, getObjectResponse.xObsExpiration)
            && Objects.equals(this.date, getObjectResponse.date) && Objects.equals(this.etag, getObjectResponse.etag)
            && Objects.equals(this.xObsServerSideEncryptionCustomerAlgorithm,
                getObjectResponse.xObsServerSideEncryptionCustomerAlgorithm)
            && Objects.equals(this.xObsServerSideEncryptionKmsKeyId, getObjectResponse.xObsServerSideEncryptionKmsKeyId)
            && Objects.equals(this.contentLength, getObjectResponse.contentLength)
            && Objects.equals(this.xObsWebsiteRedirectLocation, getObjectResponse.xObsWebsiteRedirectLocation)
            && Objects.equals(this.xObsDeleteMarker, getObjectResponse.xObsDeleteMarker)
            && Objects.equals(this.xObsVersionId, getObjectResponse.xObsVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xObsId2,
            xObsRequestId,
            xObsServerSideEncryption,
            xObsObjectType,
            xObsNextAppendPosition,
            connection,
            xObsServerSideEncryptionCustomerKeyMD5,
            xObsExpiration,
            date,
            etag,
            xObsServerSideEncryptionCustomerAlgorithm,
            xObsServerSideEncryptionKmsKeyId,
            contentLength,
            xObsWebsiteRedirectLocation,
            xObsDeleteMarker,
            xObsVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetObjectResponse {\n");
        sb.append("    xObsId2: ").append(toIndentedString(xObsId2)).append("\n");
        sb.append("    xObsRequestId: ").append(toIndentedString(xObsRequestId)).append("\n");
        sb.append("    xObsServerSideEncryption: ").append(toIndentedString(xObsServerSideEncryption)).append("\n");
        sb.append("    xObsObjectType: ").append(toIndentedString(xObsObjectType)).append("\n");
        sb.append("    xObsNextAppendPosition: ").append(toIndentedString(xObsNextAppendPosition)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKeyMD5: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKeyMD5))
            .append("\n");
        sb.append("    xObsExpiration: ").append(toIndentedString(xObsExpiration)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    xObsServerSideEncryptionCustomerAlgorithm: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerAlgorithm))
            .append("\n");
        sb.append("    xObsServerSideEncryptionKmsKeyId: ")
            .append(toIndentedString(xObsServerSideEncryptionKmsKeyId))
            .append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    xObsWebsiteRedirectLocation: ")
            .append(toIndentedString(xObsWebsiteRedirectLocation))
            .append("\n");
        sb.append("    xObsDeleteMarker: ").append(toIndentedString(xObsDeleteMarker)).append("\n");
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
