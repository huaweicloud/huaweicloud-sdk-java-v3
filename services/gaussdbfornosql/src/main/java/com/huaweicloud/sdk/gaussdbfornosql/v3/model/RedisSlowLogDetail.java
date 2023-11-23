package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RedisSlowLogDetail
 */
public class RedisSlowLogDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whole_message")

    private String wholeMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_time")

    private Double costTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_time")

    private String logTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    public RedisSlowLogDetail withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public RedisSlowLogDetail withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public RedisSlowLogDetail withWholeMessage(String wholeMessage) {
        this.wholeMessage = wholeMessage;
        return this;
    }

    /**
     * 执行语句。
     * @return wholeMessage
     */
    public String getWholeMessage() {
        return wholeMessage;
    }

    public void setWholeMessage(String wholeMessage) {
        this.wholeMessage = wholeMessage;
    }

    public RedisSlowLogDetail withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 语句类型。
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public RedisSlowLogDetail withCostTime(Double costTime) {
        this.costTime = costTime;
        return this;
    }

    /**
     * 执行时间。单位：ms
     * @return costTime
     */
    public Double getCostTime() {
        return costTime;
    }

    public void setCostTime(Double costTime) {
        this.costTime = costTime;
    }

    public RedisSlowLogDetail withLogTime(String logTime) {
        this.logTime = logTime;
        return this;
    }

    /**
     * 日志产生时间，UTC时间。 格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return logTime
     */
    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    public RedisSlowLogDetail withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 日志单行序列号
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedisSlowLogDetail that = (RedisSlowLogDetail) obj;
        return Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.wholeMessage, that.wholeMessage)
            && Objects.equals(this.operateType, that.operateType) && Objects.equals(this.costTime, that.costTime)
            && Objects.equals(this.logTime, that.logTime) && Objects.equals(this.lineNum, that.lineNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeName, nodeId, wholeMessage, operateType, costTime, logTime, lineNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisSlowLogDetail {\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    wholeMessage: ").append(toIndentedString(wholeMessage)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    costTime: ").append(toIndentedString(costTime)).append("\n");
        sb.append("    logTime: ").append(toIndentedString(logTime)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
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
