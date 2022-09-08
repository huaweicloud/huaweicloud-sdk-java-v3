package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWorkflowExecutionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executions")

    private List<FlowExecutionBrief> executions = null;

    public ListWorkflowExecutionsResponse withExecutions(List<FlowExecutionBrief> executions) {
        this.executions = executions;
        return this;
    }

    public ListWorkflowExecutionsResponse addExecutionsItem(FlowExecutionBrief executionsItem) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        this.executions.add(executionsItem);
        return this;
    }

    public ListWorkflowExecutionsResponse withExecutions(Consumer<List<FlowExecutionBrief>> executionsSetter) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        executionsSetter.accept(this.executions);
        return this;
    }

    /**
     * 流程执行信息列表
     * @return executions
     */
    public List<FlowExecutionBrief> getExecutions() {
        return executions;
    }

    public void setExecutions(List<FlowExecutionBrief> executions) {
        this.executions = executions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkflowExecutionsResponse listWorkflowExecutionsResponse = (ListWorkflowExecutionsResponse) o;
        return Objects.equals(this.executions, listWorkflowExecutionsResponse.executions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkflowExecutionsResponse {\n");
        sb.append("    executions: ").append(toIndentedString(executions)).append("\n");
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
