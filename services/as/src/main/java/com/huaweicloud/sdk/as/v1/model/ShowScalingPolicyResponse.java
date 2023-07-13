package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowScalingPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy")

    private ScalingV1PolicyDetail scalingPolicy;

    public ShowScalingPolicyResponse withScalingPolicy(ScalingV1PolicyDetail scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }

    public ShowScalingPolicyResponse withScalingPolicy(Consumer<ScalingV1PolicyDetail> scalingPolicySetter) {
        if (this.scalingPolicy == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowScalingPolicyResponse that = (ShowScalingPolicyResponse) obj;
        return Objects.equals(this.scalingPolicy, that.scalingPolicy);
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
