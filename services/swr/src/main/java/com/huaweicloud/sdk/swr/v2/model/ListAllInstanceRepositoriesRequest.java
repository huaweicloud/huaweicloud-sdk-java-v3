package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAllInstanceRepositoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ListAllInstanceRepositoriesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询时的查询标记，使用上一次接口调用返回的next_marker值，默认值从第一条数据查询。**注意：marker和limit参数需要配套使用。**
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAllInstanceRepositoriesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 条目数量，用于分页查询，默认值为100，最大值为100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAllInstanceRepositoriesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 仓库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllInstanceRepositoriesRequest that = (ListAllInstanceRepositoriesRequest) obj;
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker, limit, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllInstanceRepositoriesRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
