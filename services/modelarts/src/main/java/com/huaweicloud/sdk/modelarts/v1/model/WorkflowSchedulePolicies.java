package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作流调度策略。
 */
public class WorkflowSchedulePolicies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_failure")

    private String onFailure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_running")

    private String onRunning;

    public WorkflowSchedulePolicies withOnFailure(String onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    /**
     * 定时调度策略中的标记，失败时触发。
     * @return onFailure
     */
    public String getOnFailure() {
        return onFailure;
    }

    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    public WorkflowSchedulePolicies withOnRunning(String onRunning) {
        this.onRunning = onRunning;
        return this;
    }

    /**
     * 定时调度策略中的标记，running时触发。
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
        WorkflowSchedulePolicies that = (WorkflowSchedulePolicies) obj;
        return Objects.equals(this.onFailure, that.onFailure) && Objects.equals(this.onRunning, that.onRunning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onFailure, onRunning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowSchedulePolicies {\n");
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
