package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源合规总结
 */
public class PolicyResourceComplianceSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_state")

    private String complianceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private PolicyResource resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private PolicyComplianceSummaryResults results;

    public PolicyResourceComplianceSummary withComplianceState(String complianceState) {
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

    public PolicyResourceComplianceSummary withResource(PolicyResource resource) {
        this.resource = resource;
        return this;
    }

    public PolicyResourceComplianceSummary withResource(Consumer<PolicyResource> resourceSetter) {
        if (this.resource == null) {
            this.resource = new PolicyResource();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public PolicyResource getResource() {
        return resource;
    }

    public void setResource(PolicyResource resource) {
        this.resource = resource;
    }

    public PolicyResourceComplianceSummary withResults(PolicyComplianceSummaryResults results) {
        this.results = results;
        return this;
    }

    public PolicyResourceComplianceSummary withResults(Consumer<PolicyComplianceSummaryResults> resultsSetter) {
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
        PolicyResourceComplianceSummary that = (PolicyResourceComplianceSummary) obj;
        return Objects.equals(this.complianceState, that.complianceState)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complianceState, resource, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyResourceComplianceSummary {\n");
        sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
