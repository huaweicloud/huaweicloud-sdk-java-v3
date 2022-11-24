package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点执行记录
 */
public class NodeExecution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private Object input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private Object output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public NodeExecution withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 流程节点执行状态  最小长度：1  最大长度：32  枚举值：  success  fail  running  timeout  cancel
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NodeExecution withInput(Object input) {
        this.input = input;
        return this;
    }

    /**
     * 函数执行时的入参
     * @return input
     */
    public Object getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input = input;
    }

    public NodeExecution withOutput(Object output) {
        this.output = output;
        return this;
    }

    /**
     * 函数执行结果
     * @return output
     */
    public Object getOutput() {
        return output;
    }

    public void setOutput(Object output) {
        this.output = output;
    }

    public NodeExecution withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 节点启动时间，UTC毫秒时间戳格式  最小值：0  最大值：99999999999999999
     * minimum: 0
     * maximum: 99999999999999999
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public NodeExecution withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 节点结束时间，UTC毫秒时间戳格式  最小值：0  最大值：99999999999999999
     * minimum: 0
     * maximum: 99999999999999999
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public NodeExecution withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 节点错误信息，仅在节点出错时非空
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public NodeExecution withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 流程节点请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeExecution nodeExecution = (NodeExecution) o;
        return Objects.equals(this.status, nodeExecution.status) && Objects.equals(this.input, nodeExecution.input)
            && Objects.equals(this.output, nodeExecution.output)
            && Objects.equals(this.beginTime, nodeExecution.beginTime)
            && Objects.equals(this.endTime, nodeExecution.endTime)
            && Objects.equals(this.errorMessage, nodeExecution.errorMessage)
            && Objects.equals(this.requestId, nodeExecution.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, input, output, beginTime, endTime, errorMessage, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeExecution {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
