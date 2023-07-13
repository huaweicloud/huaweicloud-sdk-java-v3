package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChartConfig
 */
public class ChartConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_sort")

    private Boolean canSort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_search")

    private Boolean canSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    public ChartConfig withCanSort(Boolean canSort) {
        this.canSort = canSort;
        return this;
    }

    /**
     * 是否开启排序
     * @return canSort
     */
    public Boolean getCanSort() {
        return canSort;
    }

    public void setCanSort(Boolean canSort) {
        this.canSort = canSort;
    }

    public ChartConfig withCanSearch(Boolean canSearch) {
        this.canSearch = canSearch;
        return this;
    }

    /**
     * 是否开启搜索
     * @return canSearch
     */
    public Boolean getCanSearch() {
        return canSearch;
    }

    public void setCanSearch(Boolean canSearch) {
        this.canSearch = canSearch;
    }

    public ChartConfig withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页显示数量
     * minimum: 0
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChartConfig that = (ChartConfig) obj;
        return Objects.equals(this.canSort, that.canSort) && Objects.equals(this.canSearch, that.canSearch)
            && Objects.equals(this.pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canSort, canSearch, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChartConfig {\n");
        sb.append("    canSort: ").append(toIndentedString(canSort)).append("\n");
        sb.append("    canSearch: ").append(toIndentedString(canSearch)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
