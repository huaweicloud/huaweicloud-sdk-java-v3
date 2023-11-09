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
@JacksonXmlRootElement(localName = "DeleteObjectResponse")
public class DeleteObjectResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-delete-marker")

    @JacksonXmlProperty(localName = "x-obs-delete-marker")

    private String xObsDeleteMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-version-id")

    @JacksonXmlProperty(localName = "x-obs-version-id")

    private String xObsVersionId;

    public DeleteObjectResponse withXObsId2(String xObsId2) {
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

    public DeleteObjectResponse withXObsRequestId(String xObsRequestId) {
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

    public DeleteObjectResponse withEtag(String etag) {
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

    public DeleteObjectResponse withConnection(String connection) {
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

    public DeleteObjectResponse withContentLength(String contentLength) {
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

    public DeleteObjectResponse withDate(String date) {
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

    public DeleteObjectResponse withXObsDeleteMarker(String xObsDeleteMarker) {
        this.xObsDeleteMarker = xObsDeleteMarker;
        return this;
    }

    /**
     * Get xObsDeleteMarker
     * @return xObsDeleteMarker
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-delete-marker")
    public String getXObsDeleteMarker() {
        return xObsDeleteMarker;
    }

    public void setXObsDeleteMarker(String xObsDeleteMarker) {
        this.xObsDeleteMarker = xObsDeleteMarker;
    }

    public DeleteObjectResponse withXObsVersionId(String xObsVersionId) {
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
        DeleteObjectResponse that = (DeleteObjectResponse) obj;
        return Objects.equals(this.xObsId2, that.xObsId2) && Objects.equals(this.xObsRequestId, that.xObsRequestId)
            && Objects.equals(this.etag, that.etag) && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.contentLength, that.contentLength) && Objects.equals(this.date, that.date)
            && Objects.equals(this.xObsDeleteMarker, that.xObsDeleteMarker)
            && Objects.equals(this.xObsVersionId, that.xObsVersionId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(xObsId2, xObsRequestId, etag, connection, contentLength, date, xObsDeleteMarker, xObsVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteObjectResponse {\n");
        sb.append("    xObsId2: ").append(toIndentedString(xObsId2)).append("\n");
        sb.append("    xObsRequestId: ").append(toIndentedString(xObsRequestId)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
