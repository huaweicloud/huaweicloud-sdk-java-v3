package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合规规则合规性
 */
public class Compliance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_state")

    private String complianceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_details")

    private PolicyComplianceSummaryUnit resourceDetails;

    public Compliance withComplianceState(String complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    /**
     * 合规结果。
     * @return complianceState
     */
    public String getComplianceState() {
        return complianceState;
    }

    public void setComplianceState(String complianceState) {
        this.complianceState = complianceState;
    }

    public Compliance withResourceDetails(PolicyComplianceSummaryUnit resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    public Compliance withResourceDetails(Consumer<PolicyComplianceSummaryUnit> resourceDetailsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Compliance that = (Compliance) obj;
        return Objects.equals(this.complianceState, that.complianceState)
            && Objects.equals(this.resourceDetails, that.resourceDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complianceState, resourceDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Compliance {\n");
        sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
        sb.append("    resourceDetails: ").append(toIndentedString(resourceDetails)).append("\n");
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
