package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "ListObjectsResponse")
public class ListObjectsResponse extends SdkXmlResponse<ListObjectsResponse> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Contents")

    @JacksonXmlProperty(localName = "Contents")
    private List<Contents> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CommonPrefix")

    @JacksonXmlProperty(localName = "CommonPrefix")

    private String commonPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Delimiter")

    @JacksonXmlProperty(localName = "Delimiter")

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "EncodingType")

    @JacksonXmlProperty(localName = "EncodingType")

    private String encodingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IsTruncated")

    @JacksonXmlProperty(localName = "IsTruncated")

    private Boolean isTruncated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Marker")

    @JacksonXmlProperty(localName = "Marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NextMarker")

    @JacksonXmlProperty(localName = "NextMarker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "MaxKeys")

    @JacksonXmlProperty(localName = "MaxKeys")

    private String maxKeys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Name")

    @JacksonXmlProperty(localName = "Name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Prefix")

    @JacksonXmlProperty(localName = "Prefix")

    private String prefix;

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
    @JsonProperty(value = "x-obs-bucket-type")

    @JacksonXmlProperty(localName = "x-obs-bucket-type")

    private String xObsBucketType;

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

    public ListObjectsResponse withContents(List<Contents> contents) {
        this.contents = contents;
        return this;
    }

    public ListObjectsResponse addContentsItem(Contents contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public ListObjectsResponse withContents(Consumer<List<Contents>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * Get contents
     * @return contents
     */
    public List<Contents> getContents() {
        return contents;
    }

    public void setContents(List<Contents> contents) {
        this.contents = contents;
    }

    public ListObjectsResponse withCommonPrefix(String commonPrefix) {
        this.commonPrefix = commonPrefix;
        return this;
    }

    /**
     * 请求中带delimiter参数时，返回消息带CommonPrefixes分组信息。 
     * @return commonPrefix
     */
    public String getCommonPrefix() {
        return commonPrefix;
    }

    public void setCommonPrefix(String commonPrefix) {
        this.commonPrefix = commonPrefix;
    }

    public ListObjectsResponse withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * 请求中携带的delimiter参数。 
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public ListObjectsResponse withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * 对响应中的部分元素进行指定类型的编码。如果请求中设置了encoding-type，那响应中的Delimiter、Marker、Prefix（包括CommonPrefixes中的Prefix）、NextMarker和Key会被编码。 
     * @return encodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    public ListObjectsResponse withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * 表明是否本次返回的ListBucketResult结果列表被截断。“true”表示本次没有返回全部结果；“false”表示本次已经返回了全部结果。 
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    public ListObjectsResponse withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 列举对象时的起始位置标识符。 
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListObjectsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 如果本次没有返回全部结果，响应请求中将包含此字段，用于标明本次请求列举到的最后一个对象。后续请求可以指定Marker等于该值来列举剩余的对象。 
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListObjectsResponse withMaxKeys(String maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    /**
     * 列举时最多返回的对象个数。 
     * @return maxKeys
     */
    public String getMaxKeys() {
        return maxKeys;
    }

    public void setMaxKeys(String maxKeys) {
        this.maxKeys = maxKeys;
    }

    public ListObjectsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 本次请求的桶名。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListObjectsResponse withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 对象名的前缀，表示本次请求只列举对象名能匹配该前缀的所有对象。 
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ListObjectsResponse withXObsId2(String xObsId2) {
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

    public ListObjectsResponse withXObsRequestId(String xObsRequestId) {
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

    public ListObjectsResponse withEtag(String etag) {
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

    public ListObjectsResponse withXObsBucketType(String xObsBucketType) {
        this.xObsBucketType = xObsBucketType;
        return this;
    }

    /**
     * Get xObsBucketType
     * @return xObsBucketType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-bucket-type")
    public String getXObsBucketType() {
        return xObsBucketType;
    }

    public void setXObsBucketType(String xObsBucketType) {
        this.xObsBucketType = xObsBucketType;
    }

    public ListObjectsResponse withConnection(String connection) {
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

    public ListObjectsResponse withContentLength(String contentLength) {
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

    public ListObjectsResponse withDate(String date) {
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
        ListObjectsResponse that = (ListObjectsResponse) obj;
        return Objects.equals(this.contents, that.contents) && Objects.equals(this.commonPrefix, that.commonPrefix)
            && Objects.equals(this.delimiter, that.delimiter) && Objects.equals(this.encodingType, that.encodingType)
            && Objects.equals(this.isTruncated, that.isTruncated) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.nextMarker, that.nextMarker) && Objects.equals(this.maxKeys, that.maxKeys)
            && Objects.equals(this.name, that.name) && Objects.equals(this.prefix, that.prefix)
            && Objects.equals(this.xObsId2, that.xObsId2) && Objects.equals(this.xObsRequestId, that.xObsRequestId)
            && Objects.equals(this.etag, that.etag) && Objects.equals(this.xObsBucketType, that.xObsBucketType)
            && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.contentLength, that.contentLength) && Objects.equals(this.date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents,
            commonPrefix,
            delimiter,
            encodingType,
            isTruncated,
            marker,
            nextMarker,
            maxKeys,
            name,
            prefix,
            xObsId2,
            xObsRequestId,
            etag,
            xObsBucketType,
            connection,
            contentLength,
            date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObjectsResponse {\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    commonPrefix: ").append(toIndentedString(commonPrefix)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    encodingType: ").append(toIndentedString(encodingType)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    maxKeys: ").append(toIndentedString(maxKeys)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    xObsId2: ").append(toIndentedString(xObsId2)).append("\n");
        sb.append("    xObsRequestId: ").append(toIndentedString(xObsRequestId)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    xObsBucketType: ").append(toIndentedString(xObsBucketType)).append("\n");
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
