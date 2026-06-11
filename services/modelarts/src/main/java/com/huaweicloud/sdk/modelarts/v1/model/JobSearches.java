package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobSearches
 */
public class JobSearches {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unified_jobs")

    private Boolean unifiedJobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_type")

    private String trainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<Filter> filters = null;

    public JobSearches withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询作业的页数，最小为0。例如设置为0，则表示从第一页开始查询。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public JobSearches withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询作业的每页条目数。最小为1，最大为50。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public JobSearches withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 查询作业排列顺序的指标。默认使用create_time排序。
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public JobSearches withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 查询作业排列顺序，默认为“desc”，降序排序。也可以选择对应的“asc”，升序排序。
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public JobSearches withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 查询作业要搜索的分组条件。
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public JobSearches withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 参数解释：工作空间ID。 约束限制：不涉及。 取值范围：0或长度为32的字符串。 默认取值：0。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public JobSearches withUnifiedJobs(Boolean unifiedJobs) {
        this.unifiedJobs = unifiedJobs;
        return this;
    }

    /**
     * **参数解释**：是否开启自定义作业和精调作业联合查询。 **约束限制**：不涉及。 **取值范围**：   - true：开启自定义作业和精调作业联合查询   - false: 非必须，不开启自定义作业和精调作业联合查询 **默认取值**：默认为“false”。
     * @return unifiedJobs
     */
    public Boolean getUnifiedJobs() {
        return unifiedJobs;
    }

    public void setUnifiedJobs(Boolean unifiedJobs) {
        this.unifiedJobs = unifiedJobs;
    }

    public JobSearches withTrainType(String trainType) {
        this.trainType = trainType;
        return this;
    }

    /**
     * **参数解释**：在开启自定义作业和精调作业联合查询时，只显示自定义或精调作业。 **约束限制**：不涉及。 **取值范围**：   - job: 只查自定义作业   - ftjob : 只查精调作业 **默认取值**：不涉及。
     * @return trainType
     */
    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public JobSearches withFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public JobSearches addFiltersItem(Filter filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public JobSearches withFilters(Consumer<List<Filter>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 查询作业要过滤的一系列条件。
     * @return filters
     */
    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobSearches that = (JobSearches) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.order, that.order)
            && Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.unifiedJobs, that.unifiedJobs) && Objects.equals(this.trainType, that.trainType)
            && Objects.equals(this.filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, sortBy, order, groupBy, workspaceId, unifiedJobs, trainType, filters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobSearches {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    unifiedJobs: ").append(toIndentedString(unifiedJobs)).append("\n");
        sb.append("    trainType: ").append(toIndentedString(trainType)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
