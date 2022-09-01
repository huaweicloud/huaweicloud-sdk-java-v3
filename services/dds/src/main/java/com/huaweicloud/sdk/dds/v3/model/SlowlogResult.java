package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SlowlogResult
 */
public class SlowlogResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    @JacksonXmlProperty(localName = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_sample")

    @JacksonXmlProperty(localName = "query_sample")

    private String querySample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    @JacksonXmlProperty(localName = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    @JacksonXmlProperty(localName = "rows_sent")

    private String rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    @JacksonXmlProperty(localName = "rows_examined")

    private String rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    @JacksonXmlProperty(localName = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    public SlowlogResult withNodeName(String nodeName) {
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

    public SlowlogResult withQuerySample(String querySample) {
        this.querySample = querySample;
        return this;
    }

    /**
     * 执行语法。
     * @return querySample
     */
    public String getQuerySample() {
        return querySample;
    }

    public void setQuerySample(String querySample) {
        this.querySample = querySample;
    }

    public SlowlogResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 语句类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SlowlogResult withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 执行时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public SlowlogResult withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 等待锁时间。
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public SlowlogResult withRowsSent(String rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /**
     * 角色所在数据库名称。
     * @return rowsSent
     */
    public String getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(String rowsSent) {
        this.rowsSent = rowsSent;
    }

    public SlowlogResult withRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * 扫描的行数量。
     * @return rowsExamined
     */
    public String getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public SlowlogResult withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 所属数据库。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public SlowlogResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 发生时间，UTC时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlowlogResult slowlogResult = (SlowlogResult) o;
        return Objects.equals(this.nodeName, slowlogResult.nodeName)
            && Objects.equals(this.querySample, slowlogResult.querySample)
            && Objects.equals(this.type, slowlogResult.type) && Objects.equals(this.time, slowlogResult.time)
            && Objects.equals(this.lockTime, slowlogResult.lockTime)
            && Objects.equals(this.rowsSent, slowlogResult.rowsSent)
            && Objects.equals(this.rowsExamined, slowlogResult.rowsExamined)
            && Objects.equals(this.database, slowlogResult.database)
            && Objects.equals(this.startTime, slowlogResult.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeName, querySample, type, time, lockTime, rowsSent, rowsExamined, database, startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowlogResult {\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
