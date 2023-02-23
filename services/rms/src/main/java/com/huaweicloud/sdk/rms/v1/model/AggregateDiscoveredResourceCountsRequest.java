package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询聚合器中帐号资源计数请求体。
 */
public class AggregateDiscoveredResourceCountsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_id")

    private String aggregatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private ResourceCountsFilters filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by_key")

    private String groupByKey;

    public AggregateDiscoveredResourceCountsRequest withAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }

    /**
     * 资源聚合器ID。
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return aggregatorId;
    }

    public void setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
    }

    public AggregateDiscoveredResourceCountsRequest withFilter(ResourceCountsFilters filter) {
        this.filter = filter;
        return this;
    }

    public AggregateDiscoveredResourceCountsRequest withFilter(Consumer<ResourceCountsFilters> filterSetter) {
        if (this.filter == null) {
            this.filter = new ResourceCountsFilters();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public ResourceCountsFilters getFilter() {
        return filter;
    }

    public void setFilter(ResourceCountsFilters filter) {
        this.filter = filter;
    }

    public AggregateDiscoveredResourceCountsRequest withGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }

    /**
     * 用于对资源计数进行分组的键（RESOURCE_TYPE | ACCOUNT_ID）。
     * @return groupByKey
     */
    public String getGroupByKey() {
        return groupByKey;
    }

    public void setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregateDiscoveredResourceCountsRequest aggregateDiscoveredResourceCountsRequest =
            (AggregateDiscoveredResourceCountsRequest) o;
        return Objects.equals(this.aggregatorId, aggregateDiscoveredResourceCountsRequest.aggregatorId)
            && Objects.equals(this.filter, aggregateDiscoveredResourceCountsRequest.filter)
            && Objects.equals(this.groupByKey, aggregateDiscoveredResourceCountsRequest.groupByKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatorId, filter, groupByKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregateDiscoveredResourceCountsRequest {\n");
        sb.append("    aggregatorId: ").append(toIndentedString(aggregatorId)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    groupByKey: ").append(toIndentedString(groupByKey)).append("\n");
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
