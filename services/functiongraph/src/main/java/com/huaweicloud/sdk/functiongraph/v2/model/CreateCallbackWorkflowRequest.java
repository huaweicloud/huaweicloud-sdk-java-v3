package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateCallbackWorkflowRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Workflow-Run-Id")

    private String xWorkflowRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Workflow-State-Id")

    private String xWorkflowStateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CallbackWorkflowRequestBody body;

    public CreateCallbackWorkflowRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 函数工作流ID
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public CreateCallbackWorkflowRequest withXWorkflowRunId(String xWorkflowRunId) {
        this.xWorkflowRunId = xWorkflowRunId;
        return this;
    }

    /**
     * workflow run id
     * @return xWorkflowRunId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Workflow-Run-Id")
    public String getXWorkflowRunId() {
        return xWorkflowRunId;
    }

    public void setXWorkflowRunId(String xWorkflowRunId) {
        this.xWorkflowRunId = xWorkflowRunId;
    }

    public CreateCallbackWorkflowRequest withXWorkflowStateId(String xWorkflowStateId) {
        this.xWorkflowStateId = xWorkflowStateId;
        return this;
    }

    /**
     * workflow state id
     * @return xWorkflowStateId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Workflow-State-Id")
    public String getXWorkflowStateId() {
        return xWorkflowStateId;
    }

    public void setXWorkflowStateId(String xWorkflowStateId) {
        this.xWorkflowStateId = xWorkflowStateId;
    }

    public CreateCallbackWorkflowRequest withBody(CallbackWorkflowRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateCallbackWorkflowRequest withBody(Consumer<CallbackWorkflowRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CallbackWorkflowRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CallbackWorkflowRequestBody getBody() {
        return body;
    }

    public void setBody(CallbackWorkflowRequestBody body) {
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
        CreateCallbackWorkflowRequest that = (CreateCallbackWorkflowRequest) obj;
        return Objects.equals(this.workflowId, that.workflowId)
            && Objects.equals(this.xWorkflowRunId, that.xWorkflowRunId)
            && Objects.equals(this.xWorkflowStateId, that.xWorkflowStateId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId, xWorkflowRunId, xWorkflowStateId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCallbackWorkflowRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    xWorkflowRunId: ").append(toIndentedString(xWorkflowRunId)).append("\n");
        sb.append("    xWorkflowStateId: ").append(toIndentedString(xWorkflowStateId)).append("\n");
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
