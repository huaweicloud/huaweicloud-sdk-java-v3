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
    @JsonProperty(value = "train_type")

    private String trainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ListTagFilter> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ips")

    private List<String> hostIps = null;

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

    public JobSearches withTags(List<ListTagFilter> tags) {
        this.tags = tags;
        return this;
    }

    public JobSearches addTagsItem(ListTagFilter tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public JobSearches withTags(Consumer<List<ListTagFilter>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：按 TMS 标签筛选训练作业列表。 **约束限制**：   - 最多 10 个标签条件；   - 同一 `key` 不可重复；   - 同一 `key` 下 `values` 不可重复；   - 传入本参数时须同时满足 `filters` 中 `create_time` 条件：未传则默认最近 31 天，时间跨度不得超过 31 天。 **匹配规则**：   - 同一 `key` 下多个 `values` 为 **OR**；   - 不同 `key` 之间为 **AND**；   - `values` 为空或仅含空字符串时，按 **仅匹配该 key**（不限 value）处理。 **取值范围**：不涉及。 **默认取值**：不传则不按标签筛选。
     * @return tags
     */
    public List<ListTagFilter> getTags() {
        return tags;
    }

    public void setTags(List<ListTagFilter> tags) {
        this.tags = tags;
    }

    public JobSearches withHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
        return this;
    }

    public JobSearches addHostIpsItem(String hostIpsItem) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        this.hostIps.add(hostIpsItem);
        return this;
    }

    public JobSearches withHostIps(Consumer<List<String>> hostIpsSetter) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        hostIpsSetter.accept(this.hostIps);
        return this;
    }

    /**
     * **参数解释**：按训练实例所在节点宿主机 IP 筛选训练作业列表。 **约束限制**：   - 最多 10 个 IP；   - 每个元素须为合法 IPv4/IPv6 地址；   - 传入本参数时须同时满足 `filters` 中 `create_time` 条件：未传则默认最近 31 天，时间跨度不得超过 31 天。 **匹配规则**：   - 多个 IP 之间为 **OR**（命中任一 IP 即匹配） **取值范围**：不涉及。 **默认取值**：不传则不按 IP 筛选。
     * @return hostIps
     */
    public List<String> getHostIps() {
        return hostIps;
    }

    public void setHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
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
            && Objects.equals(this.trainType, that.trainType) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.hostIps, that.hostIps) && Objects.equals(this.filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, sortBy, order, groupBy, workspaceId, trainType, tags, hostIps, filters);
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
        sb.append("    trainType: ").append(toIndentedString(trainType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    hostIps: ").append(toIndentedString(hostIps)).append("\n");
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
