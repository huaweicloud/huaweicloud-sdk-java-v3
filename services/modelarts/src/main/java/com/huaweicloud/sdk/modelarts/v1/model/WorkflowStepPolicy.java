package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点执行策略。
 */
public class WorkflowStepPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poll_interval_seconds")

    private String pollIntervalSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_execution_minutes")

    private String maxExecutionMinutes;

    public WorkflowStepPolicy withPollIntervalSeconds(String pollIntervalSeconds) {
        this.pollIntervalSeconds = pollIntervalSeconds;
        return this;
    }

    /**
     * 节点执行间隔。
     * @return pollIntervalSeconds
     */
    public String getPollIntervalSeconds() {
        return pollIntervalSeconds;
    }

    public void setPollIntervalSeconds(String pollIntervalSeconds) {
        this.pollIntervalSeconds = pollIntervalSeconds;
    }

    public WorkflowStepPolicy withMaxExecutionMinutes(String maxExecutionMinutes) {
        this.maxExecutionMinutes = maxExecutionMinutes;
        return this;
    }

    /**
     * 最大执行时间。
     * @return maxExecutionMinutes
     */
    public String getMaxExecutionMinutes() {
        return maxExecutionMinutes;
    }

    public void setMaxExecutionMinutes(String maxExecutionMinutes) {
        this.maxExecutionMinutes = maxExecutionMinutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowStepPolicy that = (WorkflowStepPolicy) obj;
        return Objects.equals(this.pollIntervalSeconds, that.pollIntervalSeconds)
            && Objects.equals(this.maxExecutionMinutes, that.maxExecutionMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pollIntervalSeconds, maxExecutionMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowStepPolicy {\n");
        sb.append("    pollIntervalSeconds: ").append(toIndentedString(pollIntervalSeconds)).append("\n");
        sb.append("    maxExecutionMinutes: ").append(toIndentedString(maxExecutionMinutes)).append("\n");
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
