package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则合规总结
 */
public class PolicyAssignmentComplianceSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_state")

    private String complianceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment")

    private PolicyAssignment policyAssignment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private PolicyComplianceSummaryResults results;

    public PolicyAssignmentComplianceSummary withComplianceState(String complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    /**
     * 规则合规状态
     * @return complianceState
     */
    public String getComplianceState() {
        return complianceState;
    }

    public void setComplianceState(String complianceState) {
        this.complianceState = complianceState;
    }

    public PolicyAssignmentComplianceSummary withPolicyAssignment(PolicyAssignment policyAssignment) {
        this.policyAssignment = policyAssignment;
        return this;
    }

    public PolicyAssignmentComplianceSummary withPolicyAssignment(Consumer<PolicyAssignment> policyAssignmentSetter) {
        if (this.policyAssignment == null) {
            this.policyAssignment = new PolicyAssignment();
            policyAssignmentSetter.accept(this.policyAssignment);
        }

        return this;
    }

    /**
     * Get policyAssignment
     * @return policyAssignment
     */
    public PolicyAssignment getPolicyAssignment() {
        return policyAssignment;
    }

    public void setPolicyAssignment(PolicyAssignment policyAssignment) {
        this.policyAssignment = policyAssignment;
    }

    public PolicyAssignmentComplianceSummary withResults(PolicyComplianceSummaryResults results) {
        this.results = results;
        return this;
    }

    public PolicyAssignmentComplianceSummary withResults(Consumer<PolicyComplianceSummaryResults> resultsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyAssignmentComplianceSummary that = (PolicyAssignmentComplianceSummary) obj;
        return Objects.equals(this.complianceState, that.complianceState)
            && Objects.equals(this.policyAssignment, that.policyAssignment)
            && Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complianceState, policyAssignment, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyAssignmentComplianceSummary {\n");
        sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
        sb.append("    policyAssignment: ").append(toIndentedString(policyAssignment)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
