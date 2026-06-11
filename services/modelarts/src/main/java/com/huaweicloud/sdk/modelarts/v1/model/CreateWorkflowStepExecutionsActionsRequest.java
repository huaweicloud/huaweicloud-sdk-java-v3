package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateWorkflowStepExecutionsActionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_execution_id")

    private String stepExecutionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private StepExecutionAction body;

    public CreateWorkflowStepExecutionsActionsRequest withWorkflowId(String workflowId) {
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

    public CreateWorkflowStepExecutionsActionsRequest withExecutionId(String executionId) {
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

    public CreateWorkflowStepExecutionsActionsRequest withStepExecutionId(String stepExecutionId) {
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

    public CreateWorkflowStepExecutionsActionsRequest withBody(StepExecutionAction body) {
        this.body = body;
        return this;
    }

    public CreateWorkflowStepExecutionsActionsRequest withBody(Consumer<StepExecutionAction> bodySetter) {
        if (this.body == null) {
            this.body = new StepExecutionAction();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public StepExecutionAction getBody() {
        return body;
    }

    public void setBody(StepExecutionAction body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkflowStepExecutionsActionsRequest that = (CreateWorkflowStepExecutionsActionsRequest) obj;
        return Objects.equals(this.workflowId, that.workflowId) && Objects.equals(this.executionId, that.executionId)
            && Objects.equals(this.stepExecutionId, that.stepExecutionId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId, executionId, stepExecutionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkflowStepExecutionsActionsRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    stepExecutionId: ").append(toIndentedString(stepExecutionId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
