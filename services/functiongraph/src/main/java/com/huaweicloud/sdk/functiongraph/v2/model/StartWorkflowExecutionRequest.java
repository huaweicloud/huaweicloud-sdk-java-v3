package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class StartWorkflowExecutionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Create-Time")

    private String xCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-WorkflowRun-ID")

    private String xWorkflowRunID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private StartWorkflowExecutionRequestBody body;

    public StartWorkflowExecutionRequest withWorkflowId(String workflowId) {
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

    public StartWorkflowExecutionRequest withXCreateTime(String xCreateTime) {
        this.xCreateTime = xCreateTime;
        return this;
    }

    /**
     * workflowRun task create time
     * @return xCreateTime
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Create-Time")
    public String getXCreateTime() {
        return xCreateTime;
    }

    public void setXCreateTime(String xCreateTime) {
        this.xCreateTime = xCreateTime;
    }

    public StartWorkflowExecutionRequest withXWorkflowRunID(String xWorkflowRunID) {
        this.xWorkflowRunID = xWorkflowRunID;
        return this;
    }

    /**
     * workflowRun id
     * @return xWorkflowRunID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-WorkflowRun-ID")
    public String getXWorkflowRunID() {
        return xWorkflowRunID;
    }

    public void setXWorkflowRunID(String xWorkflowRunID) {
        this.xWorkflowRunID = xWorkflowRunID;
    }

    public StartWorkflowExecutionRequest withBody(StartWorkflowExecutionRequestBody body) {
        this.body = body;
        return this;
    }

    public StartWorkflowExecutionRequest withBody(Consumer<StartWorkflowExecutionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new StartWorkflowExecutionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public StartWorkflowExecutionRequestBody getBody() {
        return body;
    }

    public void setBody(StartWorkflowExecutionRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartWorkflowExecutionRequest startWorkflowExecutionRequest = (StartWorkflowExecutionRequest) o;
        return Objects.equals(this.workflowId, startWorkflowExecutionRequest.workflowId)
            && Objects.equals(this.xCreateTime, startWorkflowExecutionRequest.xCreateTime)
            && Objects.equals(this.xWorkflowRunID, startWorkflowExecutionRequest.xWorkflowRunID)
            && Objects.equals(this.body, startWorkflowExecutionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId, xCreateTime, xWorkflowRunID, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartWorkflowExecutionRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    xCreateTime: ").append(toIndentedString(xCreateTime)).append("\n");
        sb.append("    xWorkflowRunID: ").append(toIndentedString(xWorkflowRunID)).append("\n");
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
