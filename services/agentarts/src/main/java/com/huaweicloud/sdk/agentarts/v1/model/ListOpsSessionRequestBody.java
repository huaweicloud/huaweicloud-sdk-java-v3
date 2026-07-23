package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListOpsSessionRequestBody
 */
public class ListOpsSessionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private List<ListFilterParam> filter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_filter")

    private List<FilterParam> labelFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    public ListOpsSessionRequestBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 时间戳
     * minimum: 0
     * maximum: 4110338427000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListOpsSessionRequestBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 时间戳
     * minimum: 0
     * maximum: 4110338427000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListOpsSessionRequestBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListOpsSessionRequestBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListOpsSessionRequestBody withFilter(List<ListFilterParam> filter) {
        this.filter = filter;
        return this;
    }

    public ListOpsSessionRequestBody addFilterItem(ListFilterParam filterItem) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.add(filterItem);
        return this;
    }

    public ListOpsSessionRequestBody withFilter(Consumer<List<ListFilterParam>> filterSetter) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        filterSetter.accept(this.filter);
        return this;
    }

    /**
     * 过滤条件
     * @return filter
     */
    public List<ListFilterParam> getFilter() {
        return filter;
    }

    public void setFilter(List<ListFilterParam> filter) {
        this.filter = filter;
    }

    public ListOpsSessionRequestBody withLabelFilter(List<FilterParam> labelFilter) {
        this.labelFilter = labelFilter;
        return this;
    }

    public ListOpsSessionRequestBody addLabelFilterItem(FilterParam labelFilterItem) {
        if (this.labelFilter == null) {
            this.labelFilter = new ArrayList<>();
        }
        this.labelFilter.add(labelFilterItem);
        return this;
    }

    public ListOpsSessionRequestBody withLabelFilter(Consumer<List<FilterParam>> labelFilterSetter) {
        if (this.labelFilter == null) {
            this.labelFilter = new ArrayList<>();
        }
        labelFilterSetter.accept(this.labelFilter);
        return this;
    }

    /**
     * 标签过滤条件
     * @return labelFilter
     */
    public List<FilterParam> getLabelFilter() {
        return labelFilter;
    }

    public void setLabelFilter(List<FilterParam> labelFilter) {
        this.labelFilter = labelFilter;
    }

    public ListOpsSessionRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 页面序号
     * minimum: 1
     * maximum: 1000
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ListOpsSessionRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 单页大小
     * minimum: 1
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
        ListOpsSessionRequestBody that = (ListOpsSessionRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.labelFilter, that.labelFilter)
            && Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, resourceId, resourceType, filter, labelFilter, pageNo, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsSessionRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    labelFilter: ").append(toIndentedString(labelFilter)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
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
