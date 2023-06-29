package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListObsObjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_names")

    private List<String> objectNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    public ListObsObjectResponse withObjectNames(List<String> objectNames) {
        this.objectNames = objectNames;
        return this;
    }

    public ListObsObjectResponse addObjectNamesItem(String objectNamesItem) {
        if (this.objectNames == null) {
            this.objectNames = new ArrayList<>();
        }
        this.objectNames.add(objectNamesItem);
        return this;
    }

    public ListObsObjectResponse withObjectNames(Consumer<List<String>> objectNamesSetter) {
        if (this.objectNames == null) {
            this.objectNames = new ArrayList<>();
        }
        objectNamesSetter.accept(this.objectNames);
        return this;
    }

    /**
     * object名称列表
     * @return objectNames
     */
    public List<String> getObjectNames() {
        return objectNames;
    }

    public void setObjectNames(List<String> objectNames) {
        this.objectNames = objectNames;
    }

    public ListObsObjectResponse withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * region编码
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ListObsObjectResponse withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 搜索前缀
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ListObsObjectResponse withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * obs桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ListObsObjectResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下一个object起始位置
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListObsObjectResponse that = (ListObsObjectResponse) obj;
        return Objects.equals(this.objectNames, that.objectNames) && Objects.equals(this.location, that.location)
            && Objects.equals(this.prefix, that.prefix) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.nextMarker, that.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectNames, location, prefix, bucketName, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObsObjectResponse {\n");
        sb.append("    objectNames: ").append(toIndentedString(objectNames)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
