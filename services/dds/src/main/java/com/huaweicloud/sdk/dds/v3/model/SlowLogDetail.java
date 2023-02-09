package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SlowLogDetail
 */
public class SlowLogDetail {

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

    private Integer costTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private Integer lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "docs_returned")

    private Integer docsReturned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "docs_scanned")

    private Integer docsScanned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection")

    private String collection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_time")

    private String logTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    public SlowLogDetail withNodeName(String nodeName) {
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

    public SlowLogDetail withNodeId(String nodeId) {
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

    public SlowLogDetail withWholeMessage(String wholeMessage) {
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

    public SlowLogDetail withOperateType(String operateType) {
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

    public SlowLogDetail withCostTime(Integer costTime) {
        this.costTime = costTime;
        return this;
    }

    /**
     * 执行时间。单位：ms
     * @return costTime
     */
    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    public SlowLogDetail withLockTime(Integer lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 等待锁时间。单位：us
     * @return lockTime
     */
    public Integer getLockTime() {
        return lockTime;
    }

    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    public SlowLogDetail withDocsReturned(Integer docsReturned) {
        this.docsReturned = docsReturned;
        return this;
    }

    /**
     * 返回的文档数。
     * @return docsReturned
     */
    public Integer getDocsReturned() {
        return docsReturned;
    }

    public void setDocsReturned(Integer docsReturned) {
        this.docsReturned = docsReturned;
    }

    public SlowLogDetail withDocsScanned(Integer docsScanned) {
        this.docsScanned = docsScanned;
        return this;
    }

    /**
     * 扫描的文档数。
     * @return docsScanned
     */
    public Integer getDocsScanned() {
        return docsScanned;
    }

    public void setDocsScanned(Integer docsScanned) {
        this.docsScanned = docsScanned;
    }

    public SlowLogDetail withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 日志所属的数据库库名。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public SlowLogDetail withCollection(String collection) {
        this.collection = collection;
        return this;
    }

    /**
     * 日志所属的数据库表名。
     * @return collection
     */
    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public SlowLogDetail withLogTime(String logTime) {
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

    public SlowLogDetail withLineNum(String lineNum) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlowLogDetail slowLogDetail = (SlowLogDetail) o;
        return Objects.equals(this.nodeName, slowLogDetail.nodeName)
            && Objects.equals(this.nodeId, slowLogDetail.nodeId)
            && Objects.equals(this.wholeMessage, slowLogDetail.wholeMessage)
            && Objects.equals(this.operateType, slowLogDetail.operateType)
            && Objects.equals(this.costTime, slowLogDetail.costTime)
            && Objects.equals(this.lockTime, slowLogDetail.lockTime)
            && Objects.equals(this.docsReturned, slowLogDetail.docsReturned)
            && Objects.equals(this.docsScanned, slowLogDetail.docsScanned)
            && Objects.equals(this.database, slowLogDetail.database)
            && Objects.equals(this.collection, slowLogDetail.collection)
            && Objects.equals(this.logTime, slowLogDetail.logTime)
            && Objects.equals(this.lineNum, slowLogDetail.lineNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeName,
            nodeId,
            wholeMessage,
            operateType,
            costTime,
            lockTime,
            docsReturned,
            docsScanned,
            database,
            collection,
            logTime,
            lineNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLogDetail {\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    wholeMessage: ").append(toIndentedString(wholeMessage)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    costTime: ").append(toIndentedString(costTime)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    docsReturned: ").append(toIndentedString(docsReturned)).append("\n");
        sb.append("    docsScanned: ").append(toIndentedString(docsScanned)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
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
