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
public class DisablePolicyAssignmentRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_assignment_id")
    
    private String policyAssignmentId;

    public DisablePolicyAssignmentRequest withPolicyAssignmentId(String policyAssignmentId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisablePolicyAssignmentRequest disablePolicyAssignmentRequest = (DisablePolicyAssignmentRequest) o;
        return Objects.equals(this.policyAssignmentId, disablePolicyAssignmentRequest.policyAssignmentId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policyAssignmentId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisablePolicyAssignmentRequest {\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
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

