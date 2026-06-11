package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * workflow step execution 策略。
 */
public class WorkflowStepExecutionPolicyResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_policy")

    private String executionPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_cache")

    private Boolean useCache;

    public WorkflowStepExecutionPolicyResp withExecutionPolicy(String executionPolicy) {
        this.executionPolicy = executionPolicy;
        return this;
    }

    /**
     * **参数解释**：执行策略， **取值范围**：可选值如下： - retry：重试 - stop：停止 - continue：继续运行
     * @return executionPolicy
     */
    public String getExecutionPolicy() {
        return executionPolicy;
    }

    public void setExecutionPolicy(String executionPolicy) {
        this.executionPolicy = executionPolicy;
    }

    public WorkflowStepExecutionPolicyResp withUseCache(Boolean useCache) {
        this.useCache = useCache;
        return this;
    }

    /**
     * **参数解释**：是否使用的是缓存。 **取值范围**： - true：是缓存 - false：不是缓存
     * @return useCache
     */
    public Boolean getUseCache() {
        return useCache;
    }

    public void setUseCache(Boolean useCache) {
        this.useCache = useCache;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowStepExecutionPolicyResp that = (WorkflowStepExecutionPolicyResp) obj;
        return Objects.equals(this.executionPolicy, that.executionPolicy)
            && Objects.equals(this.useCache, that.useCache);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionPolicy, useCache);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowStepExecutionPolicyResp {\n");
        sb.append("    executionPolicy: ").append(toIndentedString(executionPolicy)).append("\n");
        sb.append("    useCache: ").append(toIndentedString(useCache)).append("\n");
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
