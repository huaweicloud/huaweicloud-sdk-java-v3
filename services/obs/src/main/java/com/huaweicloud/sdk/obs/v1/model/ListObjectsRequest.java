package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "ListObjectsRequest")
public class ListObjectsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    @JacksonXmlProperty(localName = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    @JacksonXmlProperty(localName = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max-keys")

    @JacksonXmlProperty(localName = "max-keys")

    private Integer maxKeys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delimiter")

    @JacksonXmlProperty(localName = "delimiter")

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key-marker")

    @JacksonXmlProperty(localName = "key-marker")

    private String keyMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version-id-marker")

    @JacksonXmlProperty(localName = "version-id-marker")

    private String versionIdMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding-type")

    @JacksonXmlProperty(localName = "encoding-type")

    private String encodingType;

    public ListObjectsRequest withDate(String date) {
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

    public ListObjectsRequest withBucketName(String bucketName) {
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

    public ListObjectsRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 列举以指定的字符串prefix开头的对象。 
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ListObjectsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 列举桶内对象列表时，指定一个标识符，从该标识符以后按字典顺序返回对象列表。 
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListObjectsRequest withMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    /**
     * 指定返回的最大对象数，返回的对象列表将是按照字典顺序的最多前max-keys个对象，范围是[1，1000]，超出范围时，按照默认的1000进行处理。 
     * minimum: 1
     * maximum: 1000
     * @return maxKeys
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    public ListObjectsRequest withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * 将对象名进行分组的分隔符。如果指定了prefix，从prefix到第一次出现delimiter间具有相同字符串的对象名会被分成一组，形成一条CommonPrefixes；如果没有指定prefix，从对象名的首字符到第一次出现delimiter间具有相同字符串的对象名会被分成一组，形成一条CommonPrefixes。  例如，桶中有3个对象，分别为abcd、abcde、bbcde。如果指定delimiter为d，prefix为a，abcd、abcde会被分成一组，形成一条前缀为abcd的CommonPrefixes；如果只指定delimiter为d，abcd、abcde会被分成一组，形成一条前缀为abcd的CommonPrefixes，而bbcde会被单独分成一组，形成一条前缀为bbcd的CommonPrefixes。 
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public ListObjectsRequest withKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }

    /**
     * 列举对象时的起始位置。 有效值：上次请求返回体的NextKeyMarker值 
     * @return keyMarker
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    public ListObjectsRequest withVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
        return this;
    }

    /**
     * 本参数只适用于多版本例举场景  与请求中的key-marker配合使用，返回的对象列表将是按照字典顺序排序后在该标识符以后的对象(单次返回最大为1000个)。如果version-id-marker不是key-marker对应的一个版本号，则该参数无效。  有效值：对象的版本号，即上次请求返回体的NextVersionIdMarker值 
     * @return versionIdMarker
     */
    public String getVersionIdMarker() {
        return versionIdMarker;
    }

    public void setVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
    }

    public ListObjectsRequest withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * 对响应中的部分元素进行指定类型的编码。如果Delimiter、Marker（或KeyMarker）、Prefix、NextMarker（或NextKeyMarker）和Key包含xml 1.0标准不支持的控制字符，可通过设置encoding-type对响应中的Delimiter、Marker（或KeyMarker）、Prefix（包括CommonPrefixes中的Prefix）、NextMarker（或NextKeyMarker）和Key进行编码。  可选值：url 
     * @return encodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListObjectsRequest that = (ListObjectsRequest) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.prefix, that.prefix) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.maxKeys, that.maxKeys) && Objects.equals(this.delimiter, that.delimiter)
            && Objects.equals(this.keyMarker, that.keyMarker)
            && Objects.equals(this.versionIdMarker, that.versionIdMarker)
            && Objects.equals(this.encodingType, that.encodingType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(date, bucketName, prefix, marker, maxKeys, delimiter, keyMarker, versionIdMarker, encodingType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObjectsRequest {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    maxKeys: ").append(toIndentedString(maxKeys)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    keyMarker: ").append(toIndentedString(keyMarker)).append("\n");
        sb.append("    versionIdMarker: ").append(toIndentedString(versionIdMarker)).append("\n");
        sb.append("    encodingType: ").append(toIndentedString(encodingType)).append("\n");
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
