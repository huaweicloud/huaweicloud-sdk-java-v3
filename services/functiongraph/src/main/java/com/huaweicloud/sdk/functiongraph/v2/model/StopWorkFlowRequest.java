package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class StopWorkFlowRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    @JacksonXmlProperty(localName = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    @JacksonXmlProperty(localName = "execution_id")

    private String executionId;

    public StopWorkFlowRequest withWorkflowId(String workflowId) {
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

    public StopWorkFlowRequest withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 函数流执行实例ID
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopWorkFlowRequest stopWorkFlowRequest = (StopWorkFlowRequest) o;
        return Objects.equals(this.workflowId, stopWorkFlowRequest.workflowId)
            && Objects.equals(this.executionId, stopWorkFlowRequest.executionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId, executionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopWorkFlowRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
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
