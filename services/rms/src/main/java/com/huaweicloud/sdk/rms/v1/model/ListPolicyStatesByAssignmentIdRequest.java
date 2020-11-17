package com.huaweicloud.sdk.rms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListPolicyStatesByAssignmentIdRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_assignment_id")
    
    private String policyAssignmentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compliance_state")
    
    private String complianceState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;

    public ListPolicyStatesByAssignmentIdRequest withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    


    /**
     * Get policyAssignmentId
     * @return policyAssignmentId
     */
    public String getPolicyAssignmentId() {
        return policyAssignmentId;
    }

    public void setPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
    }

    public ListPolicyStatesByAssignmentIdRequest withComplianceState(String complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    


    /**
     * Get complianceState
     * @return complianceState
     */
    public String getComplianceState() {
        return complianceState;
    }

    public void setComplianceState(String complianceState) {
        this.complianceState = complianceState;
    }

    public ListPolicyStatesByAssignmentIdRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * Get resourceId
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListPolicyStatesByAssignmentIdRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * Get resourceName
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListPolicyStatesByAssignmentIdRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPolicyStatesByAssignmentIdRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPolicyStatesByAssignmentIdRequest listPolicyStatesByAssignmentIdRequest = (ListPolicyStatesByAssignmentIdRequest) o;
        return Objects.equals(this.policyAssignmentId, listPolicyStatesByAssignmentIdRequest.policyAssignmentId) &&
            Objects.equals(this.complianceState, listPolicyStatesByAssignmentIdRequest.complianceState) &&
            Objects.equals(this.resourceId, listPolicyStatesByAssignmentIdRequest.resourceId) &&
            Objects.equals(this.resourceName, listPolicyStatesByAssignmentIdRequest.resourceName) &&
            Objects.equals(this.limit, listPolicyStatesByAssignmentIdRequest.limit) &&
            Objects.equals(this.marker, listPolicyStatesByAssignmentIdRequest.marker);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policyAssignmentId, complianceState, resourceId, resourceName, limit, marker);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyStatesByAssignmentIdRequest {\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
        sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

