package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTrackedResourceTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_deleted")

    private Boolean resourceDeleted;

    public ListTrackedResourceTagsRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 标签键名
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ListTrackedResourceTagsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListTrackedResourceTagsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的返回数量。
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTrackedResourceTagsRequest withResourceDeleted(Boolean resourceDeleted) {
        this.resourceDeleted = resourceDeleted;
        return this;
    }

    /**
     * 是否查询已删除的资源。默认为false，不查询已删除的资源
     * @return resourceDeleted
     */
    public Boolean getResourceDeleted() {
        return resourceDeleted;
    }

    public void setResourceDeleted(Boolean resourceDeleted) {
        this.resourceDeleted = resourceDeleted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTrackedResourceTagsRequest that = (ListTrackedResourceTagsRequest) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.resourceDeleted, that.resourceDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, marker, limit, resourceDeleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrackedResourceTagsRequest {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    resourceDeleted: ").append(toIndentedString(resourceDeleted)).append("\n");
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
