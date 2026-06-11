package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作流执行简要信息。
 */
public class ExecutionBrief {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_steps")

    private List<String> runningSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_steps")

    private List<String> currentSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    public ExecutionBrief withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 工作流执行ID。
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public ExecutionBrief withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 工作流执行的创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ExecutionBrief withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 工作流状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExecutionBrief withRunningSteps(List<String> runningSteps) {
        this.runningSteps = runningSteps;
        return this;
    }

    public ExecutionBrief addRunningStepsItem(String runningStepsItem) {
        if (this.runningSteps == null) {
            this.runningSteps = new ArrayList<>();
        }
        this.runningSteps.add(runningStepsItem);
        return this;
    }

    public ExecutionBrief withRunningSteps(Consumer<List<String>> runningStepsSetter) {
        if (this.runningSteps == null) {
            this.runningSteps = new ArrayList<>();
        }
        runningStepsSetter.accept(this.runningSteps);
        return this;
    }

    /**
     * 运行的节点。
     * @return runningSteps
     */
    public List<String> getRunningSteps() {
        return runningSteps;
    }

    public void setRunningSteps(List<String> runningSteps) {
        this.runningSteps = runningSteps;
    }

    public ExecutionBrief withCurrentSteps(List<String> currentSteps) {
        this.currentSteps = currentSteps;
        return this;
    }

    public ExecutionBrief addCurrentStepsItem(String currentStepsItem) {
        if (this.currentSteps == null) {
            this.currentSteps = new ArrayList<>();
        }
        this.currentSteps.add(currentStepsItem);
        return this;
    }

    public ExecutionBrief withCurrentSteps(Consumer<List<String>> currentStepsSetter) {
        if (this.currentSteps == null) {
            this.currentSteps = new ArrayList<>();
        }
        currentStepsSetter.accept(this.currentSteps);
        return this;
    }

    /**
     * 当前节点。
     * @return currentSteps
     */
    public List<String> getCurrentSteps() {
        return currentSteps;
    }

    public void setCurrentSteps(List<String> currentSteps) {
        this.currentSteps = currentSteps;
    }

    public ExecutionBrief withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 运行时长。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionBrief that = (ExecutionBrief) obj;
        return Objects.equals(this.executionId, that.executionId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.status, that.status) && Objects.equals(this.runningSteps, that.runningSteps)
            && Objects.equals(this.currentSteps, that.currentSteps) && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionId, createdAt, status, runningSteps, currentSteps, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionBrief {\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runningSteps: ").append(toIndentedString(runningSteps)).append("\n");
        sb.append("    currentSteps: ").append(toIndentedString(currentSteps)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
