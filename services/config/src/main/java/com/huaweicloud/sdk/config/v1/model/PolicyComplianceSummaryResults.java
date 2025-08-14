package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合规总结结果
 */
public class PolicyComplianceSummaryResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_details")

    private PolicyComplianceSummaryUnit resourceDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignment_details")

    private PolicyComplianceSummaryUnit assignmentDetails;

    public PolicyComplianceSummaryResults withResourceDetails(PolicyComplianceSummaryUnit resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    public PolicyComplianceSummaryResults withResourceDetails(
        Consumer<PolicyComplianceSummaryUnit> resourceDetailsSetter) {
        if (this.resourceDetails == null) {
            this.resourceDetails = new PolicyComplianceSummaryUnit();
            resourceDetailsSetter.accept(this.resourceDetails);
        }

        return this;
    }

    /**
     * Get resourceDetails
     * @return resourceDetails
     */
    public PolicyComplianceSummaryUnit getResourceDetails() {
        return resourceDetails;
    }

    public void setResourceDetails(PolicyComplianceSummaryUnit resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    public PolicyComplianceSummaryResults withAssignmentDetails(PolicyComplianceSummaryUnit assignmentDetails) {
        this.assignmentDetails = assignmentDetails;
        return this;
    }

    public PolicyComplianceSummaryResults withAssignmentDetails(
        Consumer<PolicyComplianceSummaryUnit> assignmentDetailsSetter) {
        if (this.assignmentDetails == null) {
            this.assignmentDetails = new PolicyComplianceSummaryUnit();
            assignmentDetailsSetter.accept(this.assignmentDetails);
        }

        return this;
    }

    /**
     * Get assignmentDetails
     * @return assignmentDetails
     */
    public PolicyComplianceSummaryUnit getAssignmentDetails() {
        return assignmentDetails;
    }

    public void setAssignmentDetails(PolicyComplianceSummaryUnit assignmentDetails) {
        this.assignmentDetails = assignmentDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyComplianceSummaryResults that = (PolicyComplianceSummaryResults) obj;
        return Objects.equals(this.resourceDetails, that.resourceDetails)
            && Objects.equals(this.assignmentDetails, that.assignmentDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceDetails, assignmentDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyComplianceSummaryResults {\n");
        sb.append("    resourceDetails: ").append(toIndentedString(resourceDetails)).append("\n");
        sb.append("    assignmentDetails: ").append(toIndentedString(assignmentDetails)).append("\n");
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
