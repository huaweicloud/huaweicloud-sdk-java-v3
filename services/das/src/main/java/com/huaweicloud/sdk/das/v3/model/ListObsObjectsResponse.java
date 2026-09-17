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
public class ListObsObjectsResponse extends SdkResponse {

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
    @JsonProperty(value = "common_prefixes")

    private List<String> commonPrefixes = null;

    public ListObsObjectsResponse withBucketName(String bucketName) {
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

    public ListObsObjectsResponse withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 当前页marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListObsObjectsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下一页marker
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListObsObjectsResponse withCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
        return this;
    }

    public ListObsObjectsResponse addCommonPrefixesItem(String commonPrefixesItem) {
        if (this.commonPrefixes == null) {
            this.commonPrefixes = new ArrayList<>();
        }
        this.commonPrefixes.add(commonPrefixesItem);
        return this;
    }

    public ListObsObjectsResponse withCommonPrefixes(Consumer<List<String>> commonPrefixesSetter) {
        if (this.commonPrefixes == null) {
            this.commonPrefixes = new ArrayList<>();
        }
        commonPrefixesSetter.accept(this.commonPrefixes);
        return this;
    }

    /**
     * 文件夹列表
     * @return commonPrefixes
     */
    public List<String> getCommonPrefixes() {
        return commonPrefixes;
    }

    public void setCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListObsObjectsResponse that = (ListObsObjectsResponse) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.nextMarker, that.nextMarker)
            && Objects.equals(this.commonPrefixes, that.commonPrefixes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, marker, nextMarker, commonPrefixes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObsObjectsResponse {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    commonPrefixes: ").append(toIndentedString(commonPrefixes)).append("\n");
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
