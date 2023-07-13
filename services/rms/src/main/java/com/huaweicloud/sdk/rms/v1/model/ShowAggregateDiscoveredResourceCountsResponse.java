package com.huaweicloud.sdk.rms.v1.model;

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
public class ShowAggregateDiscoveredResourceCountsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by_key")

    private String groupByKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grouped_resource_counts")

    private List<GroupedResourceCount> groupedResourceCounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_discovered_resources")

    private Integer totalDiscoveredResources;

    public ShowAggregateDiscoveredResourceCountsResponse withGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }

    /**
     * 资源计数进行分组的键。
     * @return groupByKey
     */
    public String getGroupByKey() {
        return groupByKey;
    }

    public void setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
    }

    public ShowAggregateDiscoveredResourceCountsResponse withGroupedResourceCounts(
        List<GroupedResourceCount> groupedResourceCounts) {
        this.groupedResourceCounts = groupedResourceCounts;
        return this;
    }

    public ShowAggregateDiscoveredResourceCountsResponse addGroupedResourceCountsItem(
        GroupedResourceCount groupedResourceCountsItem) {
        if (this.groupedResourceCounts == null) {
            this.groupedResourceCounts = new ArrayList<>();
        }
        this.groupedResourceCounts.add(groupedResourceCountsItem);
        return this;
    }

    public ShowAggregateDiscoveredResourceCountsResponse withGroupedResourceCounts(
        Consumer<List<GroupedResourceCount>> groupedResourceCountsSetter) {
        if (this.groupedResourceCounts == null) {
            this.groupedResourceCounts = new ArrayList<>();
        }
        groupedResourceCountsSetter.accept(this.groupedResourceCounts);
        return this;
    }

    /**
     * 分组资源计数的列表。
     * @return groupedResourceCounts
     */
    public List<GroupedResourceCount> getGroupedResourceCounts() {
        return groupedResourceCounts;
    }

    public void setGroupedResourceCounts(List<GroupedResourceCount> groupedResourceCounts) {
        this.groupedResourceCounts = groupedResourceCounts;
    }

    public ShowAggregateDiscoveredResourceCountsResponse withTotalDiscoveredResources(
        Integer totalDiscoveredResources) {
        this.totalDiscoveredResources = totalDiscoveredResources;
        return this;
    }

    /**
     * 指定过滤器的资源聚合器中存在的资源总数。
     * @return totalDiscoveredResources
     */
    public Integer getTotalDiscoveredResources() {
        return totalDiscoveredResources;
    }

    public void setTotalDiscoveredResources(Integer totalDiscoveredResources) {
        this.totalDiscoveredResources = totalDiscoveredResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAggregateDiscoveredResourceCountsResponse that = (ShowAggregateDiscoveredResourceCountsResponse) obj;
        return Objects.equals(this.groupByKey, that.groupByKey)
            && Objects.equals(this.groupedResourceCounts, that.groupedResourceCounts)
            && Objects.equals(this.totalDiscoveredResources, that.totalDiscoveredResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupByKey, groupedResourceCounts, totalDiscoveredResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAggregateDiscoveredResourceCountsResponse {\n");
        sb.append("    groupByKey: ").append(toIndentedString(groupByKey)).append("\n");
        sb.append("    groupedResourceCounts: ").append(toIndentedString(groupedResourceCounts)).append("\n");
        sb.append("    totalDiscoveredResources: ").append(toIndentedString(totalDiscoveredResources)).append("\n");
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
