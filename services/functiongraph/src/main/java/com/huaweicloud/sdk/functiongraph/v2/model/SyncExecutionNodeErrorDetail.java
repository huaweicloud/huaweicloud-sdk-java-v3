package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 函数流节点错误信息
 */
public class SyncExecutionNodeErrorDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    @JacksonXmlProperty(localName = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    @JacksonXmlProperty(localName = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    @JacksonXmlProperty(localName = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    public SyncExecutionNodeErrorDetail withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 流程节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SyncExecutionNodeErrorDetail withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误详细信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public SyncExecutionNodeErrorDetail withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 流程实例创建时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public SyncExecutionNodeErrorDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 流程实例结束时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncExecutionNodeErrorDetail syncExecutionNodeErrorDetail = (SyncExecutionNodeErrorDetail) o;
        return Objects.equals(this.nodeId, syncExecutionNodeErrorDetail.nodeId)
            && Objects.equals(this.errorMessage, syncExecutionNodeErrorDetail.errorMessage)
            && Objects.equals(this.beginTime, syncExecutionNodeErrorDetail.beginTime)
            && Objects.equals(this.endTime, syncExecutionNodeErrorDetail.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, errorMessage, beginTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncExecutionNodeErrorDetail {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
