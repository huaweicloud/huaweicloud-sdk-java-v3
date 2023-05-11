package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合规总结结果
 */
public class AggregatePolicyComplianceSummaryResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_details")

    private PolicyComplianceSummaryUnit resourceDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignment_details")

    private PolicyComplianceSummaryUnit assignmentDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    public AggregatePolicyComplianceSummaryResult withResourceDetails(PolicyComplianceSummaryUnit resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    public AggregatePolicyComplianceSummaryResult withResourceDetails(
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

    public AggregatePolicyComplianceSummaryResult withAssignmentDetails(PolicyComplianceSummaryUnit assignmentDetails) {
        this.assignmentDetails = assignmentDetails;
        return this;
    }

    public AggregatePolicyComplianceSummaryResult withAssignmentDetails(
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

    public AggregatePolicyComplianceSummaryResult withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 分组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregatePolicyComplianceSummaryResult aggregatePolicyComplianceSummaryResult =
            (AggregatePolicyComplianceSummaryResult) o;
        return Objects.equals(this.resourceDetails, aggregatePolicyComplianceSummaryResult.resourceDetails)
            && Objects.equals(this.assignmentDetails, aggregatePolicyComplianceSummaryResult.assignmentDetails)
            && Objects.equals(this.groupName, aggregatePolicyComplianceSummaryResult.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceDetails, assignmentDetails, groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregatePolicyComplianceSummaryResult {\n");
        sb.append("    resourceDetails: ").append(toIndentedString(resourceDetails)).append("\n");
        sb.append("    assignmentDetails: ").append(toIndentedString(assignmentDetails)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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
