package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingPolicyDetail;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowScalingPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy")
    
    private ScalingPolicyDetail scalingPolicy = null;

    public ShowScalingPolicyResponse withScalingPolicy(ScalingPolicyDetail scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }

    public ShowScalingPolicyResponse withScalingPolicy(Consumer<ScalingPolicyDetail> scalingPolicySetter) {
        if(this.scalingPolicy == null ){
            this.scalingPolicy = new ScalingPolicyDetail();
        }
        scalingPolicySetter.accept(this.scalingPolicy);
        return this;
    }


    /**
     * Get scalingPolicy
     * @return scalingPolicy
     */
    public ScalingPolicyDetail getScalingPolicy() {
        return scalingPolicy;
    }

    public void setScalingPolicy(ScalingPolicyDetail scalingPolicy) {
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

