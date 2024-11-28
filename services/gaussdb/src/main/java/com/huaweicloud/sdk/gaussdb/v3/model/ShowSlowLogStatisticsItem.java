package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowSlowLogStatisticsItem
 */
public class ShowSlowLogStatisticsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_sample")

    private String querySample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private Integer rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    private Integer rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private String users;

    public ShowSlowLogStatisticsItem withClientIp(String clientIp) {
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

    public ShowSlowLogStatisticsItem withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 执行次数。
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public ShowSlowLogStatisticsItem withDatabase(String database) {
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

    public ShowSlowLogStatisticsItem withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 平均等待锁时间。
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public ShowSlowLogStatisticsItem withNodeId(String nodeId) {
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

    public ShowSlowLogStatisticsItem withQuerySample(String querySample) {
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

    public ShowSlowLogStatisticsItem withRowsExamined(Integer rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * 平均扫描的行数量。
     * @return rowsExamined
     */
    public Integer getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Integer rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public ShowSlowLogStatisticsItem withRowsSent(Integer rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /**
     * 平均结果行统计数量。
     * @return rowsSent
     */
    public Integer getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Integer rowsSent) {
        this.rowsSent = rowsSent;
    }

    public ShowSlowLogStatisticsItem withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 平均执行时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ShowSlowLogStatisticsItem withType(String type) {
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

    public ShowSlowLogStatisticsItem withUsers(String users) {
        this.users = users;
        return this;
    }

    /**
     * 账号。
     * @return users
     */
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlowLogStatisticsItem that = (ShowSlowLogStatisticsItem) obj;
        return Objects.equals(this.clientIp, that.clientIp) && Objects.equals(this.count, that.count)
            && Objects.equals(this.database, that.database) && Objects.equals(this.lockTime, that.lockTime)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.querySample, that.querySample)
            && Objects.equals(this.rowsExamined, that.rowsExamined) && Objects.equals(this.rowsSent, that.rowsSent)
            && Objects.equals(this.time, that.time) && Objects.equals(this.type, that.type)
            && Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(clientIp, count, database, lockTime, nodeId, querySample, rowsExamined, rowsSent, time, type, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowLogStatisticsItem {\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
