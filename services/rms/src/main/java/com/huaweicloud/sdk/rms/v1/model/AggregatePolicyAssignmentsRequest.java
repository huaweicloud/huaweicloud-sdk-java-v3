package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 聚合合规规则请求体
 */
public class AggregatePolicyAssignmentsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_id")

    private String aggregatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private AggregatePolicyAssignmentsFilters filter;

    public AggregatePolicyAssignmentsRequest withAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }

    /**
     * 资源聚合器ID
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return aggregatorId;
    }

    public void setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
    }

    public AggregatePolicyAssignmentsRequest withFilter(AggregatePolicyAssignmentsFilters filter) {
        this.filter = filter;
        return this;
    }

    public AggregatePolicyAssignmentsRequest withFilter(Consumer<AggregatePolicyAssignmentsFilters> filterSetter) {
        if (this.filter == null) {
            this.filter = new AggregatePolicyAssignmentsFilters();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public AggregatePolicyAssignmentsFilters getFilter() {
        return filter;
    }

    public void setFilter(AggregatePolicyAssignmentsFilters filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregatePolicyAssignmentsRequest aggregatePolicyAssignmentsRequest = (AggregatePolicyAssignmentsRequest) o;
        return Objects.equals(this.aggregatorId, aggregatePolicyAssignmentsRequest.aggregatorId)
            && Objects.equals(this.filter, aggregatePolicyAssignmentsRequest.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatorId, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregatePolicyAssignmentsRequest {\n");
        sb.append("    aggregatorId: ").append(toIndentedString(aggregatorId)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
