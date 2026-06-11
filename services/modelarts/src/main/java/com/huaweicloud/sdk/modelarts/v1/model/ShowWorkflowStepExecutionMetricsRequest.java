package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowWorkflowStepExecutionMetricsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_execution_id")

    private String stepExecutionId;

    public ShowWorkflowStepExecutionMetricsRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 工作流的ID。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public ShowWorkflowStepExecutionMetricsRequest withExecutionId(String executionId) {
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

    public ShowWorkflowStepExecutionMetricsRequest withStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
        return this;
    }

    /**
     * 工作流的一次执行中一个节点的执行ID。
     * @return stepExecutionId
     */
    public String getStepExecutionId() {
        return stepExecutionId;
    }

    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkflowStepExecutionMetricsRequest that = (ShowWorkflowStepExecutionMetricsRequest) obj;
        return Objects.equals(this.workflowId, that.workflowId) && Objects.equals(this.executionId, that.executionId)
            && Objects.equals(this.stepExecutionId, that.stepExecutionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId, executionId, stepExecutionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowStepExecutionMetricsRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    stepExecutionId: ").append(toIndentedString(stepExecutionId)).append("\n");
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
