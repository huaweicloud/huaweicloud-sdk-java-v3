package com.huaweicloud.sdk.config.v1.model;

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
public class CollectPolicyStatesSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private PolicyComplianceSummaryResults results;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignments")

    private List<PolicyAssignmentComplianceSummary> policyAssignments = null;

    public CollectPolicyStatesSummaryResponse withResults(PolicyComplianceSummaryResults results) {
        this.results = results;
        return this;
    }

    public CollectPolicyStatesSummaryResponse withResults(Consumer<PolicyComplianceSummaryResults> resultsSetter) {
        if (this.results == null) {
            this.results = new PolicyComplianceSummaryResults();
            resultsSetter.accept(this.results);
        }

        return this;
    }

    /**
     * Get results
     * @return results
     */
    public PolicyComplianceSummaryResults getResults() {
        return results;
    }

    public void setResults(PolicyComplianceSummaryResults results) {
        this.results = results;
    }

    public CollectPolicyStatesSummaryResponse withPolicyAssignments(
        List<PolicyAssignmentComplianceSummary> policyAssignments) {
        this.policyAssignments = policyAssignments;
        return this;
    }

    public CollectPolicyStatesSummaryResponse addPolicyAssignmentsItem(
        PolicyAssignmentComplianceSummary policyAssignmentsItem) {
        if (this.policyAssignments == null) {
            this.policyAssignments = new ArrayList<>();
        }
        this.policyAssignments.add(policyAssignmentsItem);
        return this;
    }

    public CollectPolicyStatesSummaryResponse withPolicyAssignments(
        Consumer<List<PolicyAssignmentComplianceSummary>> policyAssignmentsSetter) {
        if (this.policyAssignments == null) {
            this.policyAssignments = new ArrayList<>();
        }
        policyAssignmentsSetter.accept(this.policyAssignments);
        return this;
    }

    /**
     * 规则合规总结列表
     * @return policyAssignments
     */
    public List<PolicyAssignmentComplianceSummary> getPolicyAssignments() {
        return policyAssignments;
    }

    public void setPolicyAssignments(List<PolicyAssignmentComplianceSummary> policyAssignments) {
        this.policyAssignments = policyAssignments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectPolicyStatesSummaryResponse that = (CollectPolicyStatesSummaryResponse) obj;
        return Objects.equals(this.results, that.results)
            && Objects.equals(this.policyAssignments, that.policyAssignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, policyAssignments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectPolicyStatesSummaryResponse {\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    policyAssignments: ").append(toIndentedString(policyAssignments)).append("\n");
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
