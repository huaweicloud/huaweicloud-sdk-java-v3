package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：热更新自动调优配置参数请求体。 **约束限制**：不涉及。
 */
public class UpdateFlinkJobAutoscalingRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling_policy")

    private AutoscalingPolicy autoscalingPolicy;

    public UpdateFlinkJobAutoscalingRequestBody withAutoscalingPolicy(AutoscalingPolicy autoscalingPolicy) {
        this.autoscalingPolicy = autoscalingPolicy;
        return this;
    }

    public UpdateFlinkJobAutoscalingRequestBody withAutoscalingPolicy(
        Consumer<AutoscalingPolicy> autoscalingPolicySetter) {
        if (this.autoscalingPolicy == null) {
            this.autoscalingPolicy = new AutoscalingPolicy();
            autoscalingPolicySetter.accept(this.autoscalingPolicy);
        }

        return this;
    }

    /**
     * Get autoscalingPolicy
     * @return autoscalingPolicy
     */
    public AutoscalingPolicy getAutoscalingPolicy() {
        return autoscalingPolicy;
    }

    public void setAutoscalingPolicy(AutoscalingPolicy autoscalingPolicy) {
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
        UpdateFlinkJobAutoscalingRequestBody that = (UpdateFlinkJobAutoscalingRequestBody) obj;
        return Objects.equals(this.autoscalingPolicy, that.autoscalingPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoscalingPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlinkJobAutoscalingRequestBody {\n");
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
