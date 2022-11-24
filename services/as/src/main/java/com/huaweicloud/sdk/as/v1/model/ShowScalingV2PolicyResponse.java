package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowScalingV2PolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy")

    private ScalingV2PolicyDetail scalingPolicy;

    public ShowScalingV2PolicyResponse withScalingPolicy(ScalingV2PolicyDetail scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }

    public ShowScalingV2PolicyResponse withScalingPolicy(Consumer<ScalingV2PolicyDetail> scalingPolicySetter) {
        if (this.scalingPolicy == null) {
            this.scalingPolicy = new ScalingV2PolicyDetail();
            scalingPolicySetter.accept(this.scalingPolicy);
        }

        return this;
    }

    /**
     * Get scalingPolicy
     * @return scalingPolicy
     */
    public ScalingV2PolicyDetail getScalingPolicy() {
        return scalingPolicy;
    }

    public void setScalingPolicy(ScalingV2PolicyDetail scalingPolicy) {
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
        ShowScalingV2PolicyResponse showScalingV2PolicyResponse = (ShowScalingV2PolicyResponse) o;
        return Objects.equals(this.scalingPolicy, showScalingV2PolicyResponse.scalingPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScalingV2PolicyResponse {\n");
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
