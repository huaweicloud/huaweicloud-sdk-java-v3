package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkflowTask
 */
public class WorkflowTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_result")

    private List<ObjectTaskResult> taskResult = null;

    public WorkflowTask withInput(ObsInfo input) {
        this.input = input;
        return this;
    }

    public WorkflowTask withInput(Consumer<ObsInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ObsInfo getInput() {
        return input;
    }

    public void setInput(ObsInfo input) {
        this.input = input;
    }

    public WorkflowTask withTaskResult(List<ObjectTaskResult> taskResult) {
        this.taskResult = taskResult;
        return this;
    }

    public WorkflowTask addTaskResultItem(ObjectTaskResult taskResultItem) {
        if (this.taskResult == null) {
            this.taskResult = new ArrayList<>();
        }
        this.taskResult.add(taskResultItem);
        return this;
    }

    public WorkflowTask withTaskResult(Consumer<List<ObjectTaskResult>> taskResultSetter) {
        if (this.taskResult == null) {
            this.taskResult = new ArrayList<>();
        }
        taskResultSetter.accept(this.taskResult);
        return this;
    }

    /**
     * 工作流任务结果列表
     * @return taskResult
     */
    public List<ObjectTaskResult> getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(List<ObjectTaskResult> taskResult) {
        this.taskResult = taskResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowTask that = (WorkflowTask) obj;
        return Objects.equals(this.input, that.input) && Objects.equals(this.taskResult, that.taskResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, taskResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTask {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    taskResult: ").append(toIndentedString(taskResult)).append("\n");
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
