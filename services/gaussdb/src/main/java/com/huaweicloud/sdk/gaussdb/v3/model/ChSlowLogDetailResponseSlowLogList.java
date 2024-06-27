package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChSlowLogDetailResponseSlowLogList
 */
public class ChSlowLogDetailResponseSlowLogList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    private Integer rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private Integer rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private String users;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_sample")

    private String querySample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    public ChSlowLogDetailResponseSlowLogList withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * ClickHouse实例节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ChSlowLogDetailResponseSlowLogList withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 数据库语句执行时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ChSlowLogDetailResponseSlowLogList withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 数据库语句等待锁时间。
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public ChSlowLogDetailResponseSlowLogList withRowsSent(Integer rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /**
     * 数据库语句执行结果行数。
     * @return rowsSent
     */
    public Integer getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Integer rowsSent) {
        this.rowsSent = rowsSent;
    }

    public ChSlowLogDetailResponseSlowLogList withRowsExamined(Integer rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * 数据库语句扫描行数。
     * @return rowsExamined
     */
    public Integer getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Integer rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public ChSlowLogDetailResponseSlowLogList withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 所属数据库名。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ChSlowLogDetailResponseSlowLogList withUsers(String users) {
        this.users = users;
        return this;
    }

    /**
     * 执行语句账号。
     * @return users
     */
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public ChSlowLogDetailResponseSlowLogList withQuerySample(String querySample) {
        this.querySample = querySample;
        return this;
    }

    /**
     * 数据库执行语句。
     * @return querySample
     */
    public String getQuerySample() {
        return querySample;
    }

    public void setQuerySample(String querySample) {
        this.querySample = querySample;
    }

    public ChSlowLogDetailResponseSlowLogList withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库语句类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ChSlowLogDetailResponseSlowLogList withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * IP地址。
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public ChSlowLogDetailResponseSlowLogList withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 数据库语句发生时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ChSlowLogDetailResponseSlowLogList withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 日志单行序列号，第一次查询时不需要此参数，后续分页查询时需要使用，可从上次查询的返回信息中获取。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public ChSlowLogDetailResponseSlowLogList withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 慢日志数量。
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChSlowLogDetailResponseSlowLogList that = (ChSlowLogDetailResponseSlowLogList) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.time, that.time)
            && Objects.equals(this.lockTime, that.lockTime) && Objects.equals(this.rowsSent, that.rowsSent)
            && Objects.equals(this.rowsExamined, that.rowsExamined) && Objects.equals(this.database, that.database)
            && Objects.equals(this.users, that.users) && Objects.equals(this.querySample, that.querySample)
            && Objects.equals(this.type, that.type) && Objects.equals(this.clientIp, that.clientIp)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.lineNum, that.lineNum)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId,
            time,
            lockTime,
            rowsSent,
            rowsExamined,
            database,
            users,
            querySample,
            type,
            clientIp,
            startTime,
            lineNum,
            count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChSlowLogDetailResponseSlowLogList {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
