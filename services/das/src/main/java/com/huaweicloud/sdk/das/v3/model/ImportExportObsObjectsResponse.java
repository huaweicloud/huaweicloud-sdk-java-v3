package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ImportExportObsObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "truncated")

    private Boolean truncated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_keys")

    private Integer maxKeys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_prefixes")

    private List<String> commonPrefixes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<ObsObjectInfo> contents = null;

    public ImportExportObsObjectsResponse withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ImportExportObsObjectsResponse withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 列举桶内对象列表时，指定一个标识符，作为列举时的起始位置
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ImportExportObsObjectsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 如果本次没有返回全部结果，响应请求中将包含此字段，用于标明本次请求列举到的最后一个对象
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ImportExportObsObjectsResponse withTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * 表明本次请求是否返回了全部结果
     * @return truncated
     */
    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public ImportExportObsObjectsResponse withMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    /**
     * 列举对象的最大数目
     * @return maxKeys
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    public ImportExportObsObjectsResponse withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 列举桶内对象列表时，指定一个前缀
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ImportExportObsObjectsResponse withCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
        return this;
    }

    public ImportExportObsObjectsResponse addCommonPrefixesItem(String commonPrefixesItem) {
        if (this.commonPrefixes == null) {
            this.commonPrefixes = new ArrayList<>();
        }
        this.commonPrefixes.add(commonPrefixesItem);
        return this;
    }

    public ImportExportObsObjectsResponse withCommonPrefixes(Consumer<List<String>> commonPrefixesSetter) {
        if (this.commonPrefixes == null) {
            this.commonPrefixes = new ArrayList<>();
        }
        commonPrefixesSetter.accept(this.commonPrefixes);
        return this;
    }

    /**
     * 分组信息
     * @return commonPrefixes
     */
    public List<String> getCommonPrefixes() {
        return commonPrefixes;
    }

    public void setCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
    }

    public ImportExportObsObjectsResponse withContents(List<ObsObjectInfo> contents) {
        this.contents = contents;
        return this;
    }

    public ImportExportObsObjectsResponse addContentsItem(ObsObjectInfo contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public ImportExportObsObjectsResponse withContents(Consumer<List<ObsObjectInfo>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 对象的元数据信息
     * @return contents
     */
    public List<ObsObjectInfo> getContents() {
        return contents;
    }

    public void setContents(List<ObsObjectInfo> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportExportObsObjectsResponse that = (ImportExportObsObjectsResponse) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.nextMarker, that.nextMarker) && Objects.equals(this.truncated, that.truncated)
            && Objects.equals(this.maxKeys, that.maxKeys) && Objects.equals(this.prefix, that.prefix)
            && Objects.equals(this.commonPrefixes, that.commonPrefixes) && Objects.equals(this.contents, that.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, marker, nextMarker, truncated, maxKeys, prefix, commonPrefixes, contents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportExportObsObjectsResponse {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
        sb.append("    maxKeys: ").append(toIndentedString(maxKeys)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    commonPrefixes: ").append(toIndentedString(commonPrefixes)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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
