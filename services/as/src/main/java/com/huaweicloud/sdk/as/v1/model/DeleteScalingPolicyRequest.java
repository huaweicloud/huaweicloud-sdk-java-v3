package com.huaweicloud.sdk.as.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteScalingPolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_id")
    
    private String scalingPolicyId;

    public DeleteScalingPolicyRequest withScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }

    


    /**
     * Get scalingPolicyId
     * @return scalingPolicyId
     */
    public String getScalingPolicyId() {
        return scalingPolicyId;
    }

    public void setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteScalingPolicyRequest deleteScalingPolicyRequest = (DeleteScalingPolicyRequest) o;
        return Objects.equals(this.scalingPolicyId, deleteScalingPolicyRequest.scalingPolicyId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicyId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteScalingPolicyRequest {\n");
        sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
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

