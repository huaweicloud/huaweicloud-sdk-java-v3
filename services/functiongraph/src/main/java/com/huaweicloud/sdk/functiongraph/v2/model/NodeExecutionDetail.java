package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 函数流节点执行详细信息 */
public class NodeExecutionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executions")

    private List<NodeExecution> executions = null;

    public NodeExecutionDetail withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /** 流程节点ID
     * 
     * @return nodeId */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NodeExecutionDetail withExecutions(List<NodeExecution> executions) {
        this.executions = executions;
        return this;
    }

    public NodeExecutionDetail addExecutionsItem(NodeExecution executionsItem) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        this.executions.add(executionsItem);
        return this;
    }

    public NodeExecutionDetail withExecutions(Consumer<List<NodeExecution>> executionsSetter) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        executionsSetter.accept(this.executions);
        return this;
    }

    /** 节点执行记录
     * 
     * @return executions */
    public List<NodeExecution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<NodeExecution> executions) {
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
        NodeExecutionDetail nodeExecutionDetail = (NodeExecutionDetail) o;
        return Objects.equals(this.nodeId, nodeExecutionDetail.nodeId)
            && Objects.equals(this.executions, nodeExecutionDetail.executions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, executions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeExecutionDetail {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    executions: ").append(toIndentedString(executions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
