package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlinkJobAutoscalingPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling_policy")

    private AutoscalingPolicyResponse autoscalingPolicy;

    public ShowFlinkJobAutoscalingPolicyResponse withAutoscalingPolicy(AutoscalingPolicyResponse autoscalingPolicy) {
        this.autoscalingPolicy = autoscalingPolicy;
        return this;
    }

    public ShowFlinkJobAutoscalingPolicyResponse withAutoscalingPolicy(
        Consumer<AutoscalingPolicyResponse> autoscalingPolicySetter) {
        if (this.autoscalingPolicy == null) {
            this.autoscalingPolicy = new AutoscalingPolicyResponse();
            autoscalingPolicySetter.accept(this.autoscalingPolicy);
        }

        return this;
    }

    /**
     * Get autoscalingPolicy
     * @return autoscalingPolicy
     */
    public AutoscalingPolicyResponse getAutoscalingPolicy() {
        return autoscalingPolicy;
    }

    public void setAutoscalingPolicy(AutoscalingPolicyResponse autoscalingPolicy) {
        this.autoscalingPolicy = autoscalingPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlinkJobAutoscalingPolicyResponse that = (ShowFlinkJobAutoscalingPolicyResponse) obj;
        return Objects.equals(this.autoscalingPolicy, that.autoscalingPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoscalingPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkJobAutoscalingPolicyResponse {\n");
        sb.append("    autoscalingPolicy: ").append(toIndentedString(autoscalingPolicy)).append("\n");
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
