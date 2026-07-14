package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作流调度策略。
 */
public class WorkflowSchedulePoliciesResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_failure")

    private String onFailure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_running")

    private String onRunning;

    public WorkflowSchedulePoliciesResp withOnFailure(String onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    /**
     * **参数解释**：定时调度策略中的标记，失败时触发。 **取值范围**：不涉及。
     * @return onFailure
     */
    public String getOnFailure() {
        return onFailure;
    }

    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    public WorkflowSchedulePoliciesResp withOnRunning(String onRunning) {
        this.onRunning = onRunning;
        return this;
    }

    /**
     * **参数解释**：定时调度策略中的标记，running时触发。 **取值范围**：不涉及。
     * @return onRunning
     */
    public String getOnRunning() {
        return onRunning;
    }

    public void setOnRunning(String onRunning) {
        this.onRunning = onRunning;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowSchedulePoliciesResp that = (WorkflowSchedulePoliciesResp) obj;
        return Objects.equals(this.onFailure, that.onFailure) && Objects.equals(this.onRunning, that.onRunning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onFailure, onRunning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowSchedulePoliciesResp {\n");
        sb.append("    onFailure: ").append(toIndentedString(onFailure)).append("\n");
        sb.append("    onRunning: ").append(toIndentedString(onRunning)).append("\n");
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
