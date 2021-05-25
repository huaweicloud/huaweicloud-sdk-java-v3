package com.huaweicloud.sdk.as.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingV1PolicyDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowScalingPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy")
    
    private ScalingV1PolicyDetail scalingPolicy;

    public ShowScalingPolicyResponse withScalingPolicy(ScalingV1PolicyDetail scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }

    public ShowScalingPolicyResponse withScalingPolicy(Consumer<ScalingV1PolicyDetail> scalingPolicySetter) {
        if(this.scalingPolicy == null ){
            this.scalingPolicy = new ScalingV1PolicyDetail();
            scalingPolicySetter.accept(this.scalingPolicy);
        }
        
        return this;
    }


    /**
     * Get scalingPolicy
     * @return scalingPolicy
     */
    public ScalingV1PolicyDetail getScalingPolicy() {
        return scalingPolicy;
    }

    public void setScalingPolicy(ScalingV1PolicyDetail scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScalingPolicyResponse showScalingPolicyResponse = (ShowScalingPolicyResponse) o;
        return Objects.equals(this.scalingPolicy, showScalingPolicyResponse.scalingPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScalingPolicyResponse {\n");
        sb.append("    scalingPolicy: ").append(toIndentedString(scalingPolicy)).append("\n");
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

