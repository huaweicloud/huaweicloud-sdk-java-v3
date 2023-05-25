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
public class ListAggregateComplianceByPolicyAssignmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregate_policy_assignments")

    private List<AggregatePolicyAssignments> aggregatePolicyAssignments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAggregateComplianceByPolicyAssignmentResponse withAggregatePolicyAssignments(
        List<AggregatePolicyAssignments> aggregatePolicyAssignments) {
        this.aggregatePolicyAssignments = aggregatePolicyAssignments;
        return this;
    }

    public ListAggregateComplianceByPolicyAssignmentResponse addAggregatePolicyAssignmentsItem(
        AggregatePolicyAssignments aggregatePolicyAssignmentsItem) {
        if (this.aggregatePolicyAssignments == null) {
            this.aggregatePolicyAssignments = new ArrayList<>();
        }
        this.aggregatePolicyAssignments.add(aggregatePolicyAssignmentsItem);
        return this;
    }

    public ListAggregateComplianceByPolicyAssignmentResponse withAggregatePolicyAssignments(
        Consumer<List<AggregatePolicyAssignments>> aggregatePolicyAssignmentsSetter) {
        if (this.aggregatePolicyAssignments == null) {
            this.aggregatePolicyAssignments = new ArrayList<>();
        }
        aggregatePolicyAssignmentsSetter.accept(this.aggregatePolicyAssignments);
        return this;
    }

    /**
     * 聚合合规规则的列表。
     * @return aggregatePolicyAssignments
     */
    public List<AggregatePolicyAssignments> getAggregatePolicyAssignments() {
        return aggregatePolicyAssignments;
    }

    public void setAggregatePolicyAssignments(List<AggregatePolicyAssignments> aggregatePolicyAssignments) {
        this.aggregatePolicyAssignments = aggregatePolicyAssignments;
    }

    public ListAggregateComplianceByPolicyAssignmentResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAggregateComplianceByPolicyAssignmentResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAggregateComplianceByPolicyAssignmentResponse listAggregateComplianceByPolicyAssignmentResponse =
            (ListAggregateComplianceByPolicyAssignmentResponse) o;
        return Objects.equals(this.aggregatePolicyAssignments,
            listAggregateComplianceByPolicyAssignmentResponse.aggregatePolicyAssignments)
            && Objects.equals(this.pageInfo, listAggregateComplianceByPolicyAssignmentResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatePolicyAssignments, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAggregateComplianceByPolicyAssignmentResponse {\n");
        sb.append("    aggregatePolicyAssignments: ").append(toIndentedString(aggregatePolicyAssignments)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
