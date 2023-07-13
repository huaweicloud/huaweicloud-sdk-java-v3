package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowWorkflowExecutionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Get-Workflow-Full-History-Data")

    private Boolean xGetWorkflowFullHistoryData;

    public ShowWorkflowExecutionRequest withWorkflowId(String workflowId) {
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

    public ShowWorkflowExecutionRequest withExecutionId(String executionId) {
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

    public ShowWorkflowExecutionRequest withXGetWorkflowFullHistoryData(Boolean xGetWorkflowFullHistoryData) {
        this.xGetWorkflowFullHistoryData = xGetWorkflowFullHistoryData;
        return this;
    }

    /**
     * 获取函数流执行详情完整输出值
     * @return xGetWorkflowFullHistoryData
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Get-Workflow-Full-History-Data")
    public Boolean getXGetWorkflowFullHistoryData() {
        return xGetWorkflowFullHistoryData;
    }

    public void setXGetWorkflowFullHistoryData(Boolean xGetWorkflowFullHistoryData) {
        this.xGetWorkflowFullHistoryData = xGetWorkflowFullHistoryData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkflowExecutionRequest that = (ShowWorkflowExecutionRequest) obj;
        return Objects.equals(this.workflowId, that.workflowId) && Objects.equals(this.executionId, that.executionId)
            && Objects.equals(this.xGetWorkflowFullHistoryData, that.xGetWorkflowFullHistoryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId, executionId, xGetWorkflowFullHistoryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowExecutionRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    xGetWorkflowFullHistoryData: ")
            .append(toIndentedString(xGetWorkflowFullHistoryData))
            .append("\n");
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
