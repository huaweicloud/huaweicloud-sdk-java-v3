package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class StartWorkflowExecutionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    @JacksonXmlProperty(localName = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Create-Time")

    @JacksonXmlProperty(localName = "X-Create-Time")

    private String xCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-WorkflowRun-ID")

    @JacksonXmlProperty(localName = "X-WorkflowRun-ID")

    private String xWorkflowRunID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-WorkflowRun-MergeFnParameters")

    @JacksonXmlProperty(localName = "X-WorkflowRun-MergeFnParameters")

    private String xWorkflowRunMergeFnParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private FlowExecuteBody body;

    public StartWorkflowExecutionRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 函数流定义ID
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

    public StartWorkflowExecutionRequest withXWorkflowRunMergeFnParameters(String xWorkflowRunMergeFnParameters) {
        this.xWorkflowRunMergeFnParameters = xWorkflowRunMergeFnParameters;
        return this;
    }

    /**
     * Combines the output of the previous node with the input of the next node into an input.
     * @return xWorkflowRunMergeFnParameters
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-WorkflowRun-MergeFnParameters")
    public String getXWorkflowRunMergeFnParameters() {
        return xWorkflowRunMergeFnParameters;
    }

    public void setXWorkflowRunMergeFnParameters(String xWorkflowRunMergeFnParameters) {
        this.xWorkflowRunMergeFnParameters = xWorkflowRunMergeFnParameters;
    }

    public StartWorkflowExecutionRequest withBody(FlowExecuteBody body) {
        this.body = body;
        return this;
    }

    public StartWorkflowExecutionRequest withBody(Consumer<FlowExecuteBody> bodySetter) {
        if (this.body == null) {
            this.body = new FlowExecuteBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public FlowExecuteBody getBody() {
        return body;
    }

    public void setBody(FlowExecuteBody body) {
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
            && Objects.equals(this.xWorkflowRunMergeFnParameters,
                startWorkflowExecutionRequest.xWorkflowRunMergeFnParameters)
            && Objects.equals(this.body, startWorkflowExecutionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId, xCreateTime, xWorkflowRunID, xWorkflowRunMergeFnParameters, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartWorkflowExecutionRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    xCreateTime: ").append(toIndentedString(xCreateTime)).append("\n");
        sb.append("    xWorkflowRunID: ").append(toIndentedString(xWorkflowRunID)).append("\n");
        sb.append("    xWorkflowRunMergeFnParameters: ")
            .append(toIndentedString(xWorkflowRunMergeFnParameters))
            .append("\n");
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
