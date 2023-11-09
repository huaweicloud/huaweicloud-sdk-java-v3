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
@JacksonXmlRootElement(localName = "GetBucketMetadataResponse")
public class GetBucketMetadataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-id-2")

    @JacksonXmlProperty(localName = "x-obs-id-2")

    private String xObsId2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-request-id")

    @JacksonXmlProperty(localName = "x-obs-request-id")

    private String xObsRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-fs-file-interface")

    @JacksonXmlProperty(localName = "x-obs-fs-file-interface")

    private String xObsFsFileInterface;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-version")

    @JacksonXmlProperty(localName = "x-obs-version")

    private String xObsVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Origin")

    @JacksonXmlProperty(localName = "Access-Control-Allow-Origin")

    private String accessControlAllowOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Methods")

    @JacksonXmlProperty(localName = "Access-Control-Allow-Methods")

    private String accessControlAllowMethods;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-bucket-location")

    @JacksonXmlProperty(localName = "x-obs-bucket-location")

    private String xObsBucketLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    @JacksonXmlProperty(localName = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-epid")

    @JacksonXmlProperty(localName = "x-obs-epid")

    private String xObsEpid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Headers")

    @JacksonXmlProperty(localName = "Access-Control-Allow-Headers")

    private String accessControlAllowHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Expose-Headers")

    @JacksonXmlProperty(localName = "Access-Control-Expose-Headers")

    private String accessControlExposeHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ETag")

    @JacksonXmlProperty(localName = "ETag")

    private String etag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-storage-class")

    @JacksonXmlProperty(localName = "x-obs-storage-class")

    private String xObsStorageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-az-redundancy")

    @JacksonXmlProperty(localName = "x-obs-az-redundancy")

    private String xObsAzRedundancy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    @JacksonXmlProperty(localName = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Max-Age")

    @JacksonXmlProperty(localName = "Access-Control-Max-Age")

    private Integer accessControlMaxAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-ies-location")

    @JacksonXmlProperty(localName = "x-obs-ies-location")

    private String xObsIesLocation;

    public GetBucketMetadataResponse withXObsId2(String xObsId2) {
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

    public GetBucketMetadataResponse withXObsRequestId(String xObsRequestId) {
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

    public GetBucketMetadataResponse withXObsFsFileInterface(String xObsFsFileInterface) {
        this.xObsFsFileInterface = xObsFsFileInterface;
        return this;
    }

    /**
     * Get xObsFsFileInterface
     * @return xObsFsFileInterface
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-fs-file-interface")
    public String getXObsFsFileInterface() {
        return xObsFsFileInterface;
    }

    public void setXObsFsFileInterface(String xObsFsFileInterface) {
        this.xObsFsFileInterface = xObsFsFileInterface;
    }

    public GetBucketMetadataResponse withXObsVersion(String xObsVersion) {
        this.xObsVersion = xObsVersion;
        return this;
    }

    /**
     * Get xObsVersion
     * @return xObsVersion
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-version")
    public String getXObsVersion() {
        return xObsVersion;
    }

    public void setXObsVersion(String xObsVersion) {
        this.xObsVersion = xObsVersion;
    }

    public GetBucketMetadataResponse withAccessControlAllowOrigin(String accessControlAllowOrigin) {
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

    public GetBucketMetadataResponse withAccessControlAllowMethods(String accessControlAllowMethods) {
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

    public GetBucketMetadataResponse withXObsBucketLocation(String xObsBucketLocation) {
        this.xObsBucketLocation = xObsBucketLocation;
        return this;
    }

    /**
     * Get xObsBucketLocation
     * @return xObsBucketLocation
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-bucket-location")
    public String getXObsBucketLocation() {
        return xObsBucketLocation;
    }

    public void setXObsBucketLocation(String xObsBucketLocation) {
        this.xObsBucketLocation = xObsBucketLocation;
    }

    public GetBucketMetadataResponse withConnection(String connection) {
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

    public GetBucketMetadataResponse withXObsEpid(String xObsEpid) {
        this.xObsEpid = xObsEpid;
        return this;
    }

    /**
     * Get xObsEpid
     * @return xObsEpid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-epid")
    public String getXObsEpid() {
        return xObsEpid;
    }

    public void setXObsEpid(String xObsEpid) {
        this.xObsEpid = xObsEpid;
    }

    public GetBucketMetadataResponse withDate(String date) {
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

    public GetBucketMetadataResponse withAccessControlAllowHeaders(String accessControlAllowHeaders) {
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

    public GetBucketMetadataResponse withAccessControlExposeHeaders(String accessControlExposeHeaders) {
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

    public GetBucketMetadataResponse withEtag(String etag) {
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

    public GetBucketMetadataResponse withXObsStorageClass(String xObsStorageClass) {
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

    public GetBucketMetadataResponse withXObsAzRedundancy(String xObsAzRedundancy) {
        this.xObsAzRedundancy = xObsAzRedundancy;
        return this;
    }

    /**
     * Get xObsAzRedundancy
     * @return xObsAzRedundancy
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-az-redundancy")
    public String getXObsAzRedundancy() {
        return xObsAzRedundancy;
    }

    public void setXObsAzRedundancy(String xObsAzRedundancy) {
        this.xObsAzRedundancy = xObsAzRedundancy;
    }

    public GetBucketMetadataResponse withContentLength(String contentLength) {
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

    public GetBucketMetadataResponse withAccessControlMaxAge(Integer accessControlMaxAge) {
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

    public GetBucketMetadataResponse withXObsIesLocation(String xObsIesLocation) {
        this.xObsIesLocation = xObsIesLocation;
        return this;
    }

    /**
     * Get xObsIesLocation
     * @return xObsIesLocation
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-ies-location")
    public String getXObsIesLocation() {
        return xObsIesLocation;
    }

    public void setXObsIesLocation(String xObsIesLocation) {
        this.xObsIesLocation = xObsIesLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetBucketMetadataResponse that = (GetBucketMetadataResponse) obj;
        return Objects.equals(this.xObsId2, that.xObsId2) && Objects.equals(this.xObsRequestId, that.xObsRequestId)
            && Objects.equals(this.xObsFsFileInterface, that.xObsFsFileInterface)
            && Objects.equals(this.xObsVersion, that.xObsVersion)
            && Objects.equals(this.accessControlAllowOrigin, that.accessControlAllowOrigin)
            && Objects.equals(this.accessControlAllowMethods, that.accessControlAllowMethods)
            && Objects.equals(this.xObsBucketLocation, that.xObsBucketLocation)
            && Objects.equals(this.connection, that.connection) && Objects.equals(this.xObsEpid, that.xObsEpid)
            && Objects.equals(this.date, that.date)
            && Objects.equals(this.accessControlAllowHeaders, that.accessControlAllowHeaders)
            && Objects.equals(this.accessControlExposeHeaders, that.accessControlExposeHeaders)
            && Objects.equals(this.etag, that.etag) && Objects.equals(this.xObsStorageClass, that.xObsStorageClass)
            && Objects.equals(this.xObsAzRedundancy, that.xObsAzRedundancy)
            && Objects.equals(this.contentLength, that.contentLength)
            && Objects.equals(this.accessControlMaxAge, that.accessControlMaxAge)
            && Objects.equals(this.xObsIesLocation, that.xObsIesLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xObsId2,
            xObsRequestId,
            xObsFsFileInterface,
            xObsVersion,
            accessControlAllowOrigin,
            accessControlAllowMethods,
            xObsBucketLocation,
            connection,
            xObsEpid,
            date,
            accessControlAllowHeaders,
            accessControlExposeHeaders,
            etag,
            xObsStorageClass,
            xObsAzRedundancy,
            contentLength,
            accessControlMaxAge,
            xObsIesLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBucketMetadataResponse {\n");
        sb.append("    xObsId2: ").append(toIndentedString(xObsId2)).append("\n");
        sb.append("    xObsRequestId: ").append(toIndentedString(xObsRequestId)).append("\n");
        sb.append("    xObsFsFileInterface: ").append(toIndentedString(xObsFsFileInterface)).append("\n");
        sb.append("    xObsVersion: ").append(toIndentedString(xObsVersion)).append("\n");
        sb.append("    accessControlAllowOrigin: ").append(toIndentedString(accessControlAllowOrigin)).append("\n");
        sb.append("    accessControlAllowMethods: ").append(toIndentedString(accessControlAllowMethods)).append("\n");
        sb.append("    xObsBucketLocation: ").append(toIndentedString(xObsBucketLocation)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    xObsEpid: ").append(toIndentedString(xObsEpid)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    accessControlAllowHeaders: ").append(toIndentedString(accessControlAllowHeaders)).append("\n");
        sb.append("    accessControlExposeHeaders: ").append(toIndentedString(accessControlExposeHeaders)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    xObsStorageClass: ").append(toIndentedString(xObsStorageClass)).append("\n");
        sb.append("    xObsAzRedundancy: ").append(toIndentedString(xObsAzRedundancy)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    accessControlMaxAge: ").append(toIndentedString(accessControlMaxAge)).append("\n");
        sb.append("    xObsIesLocation: ").append(toIndentedString(xObsIesLocation)).append("\n");
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
