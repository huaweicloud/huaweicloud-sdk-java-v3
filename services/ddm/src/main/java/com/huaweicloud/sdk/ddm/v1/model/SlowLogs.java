package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SlowLogs
 */
public class SlowLogs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private String users;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_sample")

    private String querySample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_time")

    private String logTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shards")

    private String shards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private String rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    public SlowLogs withUsers(String users) {
        this.users = users;
        return this;
    }

    /**
     * 执行慢sql的DDM账号名称。
     * @return users
     */
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public SlowLogs withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 慢sql所属逻辑库的名称。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public SlowLogs withQuerySample(String querySample) {
        this.querySample = querySample;
        return this;
    }

    /**
     * 慢sql执行语法。
     * @return querySample
     */
    public String getQuerySample() {
        return querySample;
    }

    public void setQuerySample(String querySample) {
        this.querySample = querySample;
    }

    public SlowLogs withLogTime(String logTime) {
        this.logTime = logTime;
        return this;
    }

    /**
     * DDM慢sql开始执行时间。
     * @return logTime
     */
    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    public SlowLogs withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 慢sql的执行时长，精确到毫秒。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public SlowLogs withShards(String shards) {
        this.shards = shards;
        return this;
    }

    /**
     * 逻辑库物理分片名称。
     * @return shards
     */
    public String getShards() {
        return shards;
    }

    public void setShards(String shards) {
        this.shards = shards;
    }

    public SlowLogs withNodeId(String nodeId) {
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

    public SlowLogs withRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * 慢sql影响行数。
     * @return rowsExamined
     */
    public String getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public SlowLogs withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 客户端ip，该IP地址可能涉及个人数据，建议用户依据实际IP地址的敏感性做查询后脱敏处理。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowLogs that = (SlowLogs) obj;
        return Objects.equals(this.users, that.users) && Objects.equals(this.database, that.database)
            && Objects.equals(this.querySample, that.querySample) && Objects.equals(this.logTime, that.logTime)
            && Objects.equals(this.time, that.time) && Objects.equals(this.shards, that.shards)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.rowsExamined, that.rowsExamined)
            && Objects.equals(this.host, that.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, database, querySample, logTime, time, shards, nodeId, rowsExamined, host);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLogs {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    logTime: ").append(toIndentedString(logTime)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
