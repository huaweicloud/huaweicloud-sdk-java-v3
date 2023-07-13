package com.huaweicloud.sdk.aom.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 函数流节点执行详细信息
 */
public class ExecutionResultList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_execution_id")

    private String functionExecutionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private Object output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ExecutionResultList withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 流程节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ExecutionResultList withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 节点开始执行时间。
     * minimum: 0
     * maximum: 9999999999999
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public ExecutionResultList withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 节点执行结束时间。
     * minimum: 0
     * maximum: 9999999999999
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ExecutionResultList withFunctionExecutionId(String functionExecutionId) {
        this.functionExecutionId = functionExecutionId;
        return this;
    }

    /**
     * FunctionGraph的执行id。
     * @return functionExecutionId
     */
    public String getFunctionExecutionId() {
        return functionExecutionId;
    }

    public void setFunctionExecutionId(String functionExecutionId) {
        this.functionExecutionId = functionExecutionId;
    }

    public ExecutionResultList withOutput(Object output) {
        this.output = output;
        return this;
    }

    /**
     * 节点输出。
     * @return output
     */
    public Object getOutput() {
        return output;
    }

    public void setOutput(Object output) {
        this.output = output;
    }

    public ExecutionResultList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionResultList that = (ExecutionResultList) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.functionExecutionId, that.functionExecutionId)
            && Objects.equals(this.output, that.output) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, beginTime, endTime, functionExecutionId, output, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionResultList {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    functionExecutionId: ").append(toIndentedString(functionExecutionId)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
