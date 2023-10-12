package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TopnRequstBody
 */
public class TopnRequstBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_desc")

    private Boolean isDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topn")

    private Integer topn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private Map<String, String> filter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_list")

    private List<String> searchList = null;

    public TopnRequstBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间时间戳，毫秒时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public TopnRequstBody withIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }

    /**
     * 是否降序  true / false
     * @return isDesc
     */
    public Boolean getIsDesc() {
        return isDesc;
    }

    public void setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
    }

    public TopnRequstBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，log_group / log_stream / tenant
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public TopnRequstBody withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 排序依据，index/write/storage/basicTransfer/seniorTransfer，必须是search_list中存在的数据
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public TopnRequstBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间时间戳，毫秒时间，最多支持30天范围内的查询
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public TopnRequstBody withTopn(Integer topn) {
        this.topn = topn;
        return this;
    }

    /**
     * 查询前多少数据，范围1~100
     * @return topn
     */
    public Integer getTopn() {
        return topn;
    }

    public void setTopn(Integer topn) {
        this.topn = topn;
    }

    public TopnRequstBody withFilter(Map<String, String> filter) {
        this.filter = filter;
        return this;
    }

    public TopnRequstBody putFilterItem(String key, String filterItem) {
        if (this.filter == null) {
            this.filter = new HashMap<>();
        }
        this.filter.put(key, filterItem);
        return this;
    }

    public TopnRequstBody withFilter(Consumer<Map<String, String>> filterSetter) {
        if (this.filter == null) {
            this.filter = new HashMap<>();
        }
        filterSetter.accept(this.filter);
        return this;
    }

    /**
     * 过滤条件 {     \"log_group_id\": \"xxxxxx\" }过滤器，为一个map结构，键为过滤属性，值为属性值，不支持模糊匹配
     * @return filter
     */
    public Map<String, String> getFilter() {
        return filter;
    }

    public void setFilter(Map<String, String> filter) {
        this.filter = filter;
    }

    public TopnRequstBody withSearchList(List<String> searchList) {
        this.searchList = searchList;
        return this;
    }

    public TopnRequstBody addSearchListItem(String searchListItem) {
        if (this.searchList == null) {
            this.searchList = new ArrayList<>();
        }
        this.searchList.add(searchListItem);
        return this;
    }

    public TopnRequstBody withSearchList(Consumer<List<String>> searchListSetter) {
        if (this.searchList == null) {
            this.searchList = new ArrayList<>();
        }
        searchListSetter.accept(this.searchList);
        return this;
    }

    /**
     * 查询数据类型，字符串数组可多种搭配，只能在index/write/storage/basicTransfer/seniorTransfer中选填
     * @return searchList
     */
    public List<String> getSearchList() {
        return searchList;
    }

    public void setSearchList(List<String> searchList) {
        this.searchList = searchList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopnRequstBody that = (TopnRequstBody) obj;
        return Objects.equals(this.endTime, that.endTime) && Objects.equals(this.isDesc, that.isDesc)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.sortBy, that.sortBy)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.topn, that.topn)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.searchList, that.searchList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, isDesc, resourceType, sortBy, startTime, topn, filter, searchList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopnRequstBody {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    isDesc: ").append(toIndentedString(isDesc)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    topn: ").append(toIndentedString(topn)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    searchList: ").append(toIndentedString(searchList)).append("\n");
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
