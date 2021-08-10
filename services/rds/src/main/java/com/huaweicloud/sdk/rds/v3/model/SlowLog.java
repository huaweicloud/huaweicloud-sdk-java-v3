package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 慢日志信息。 */
public class SlowLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    private String rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private String rowsExamined;

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
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    public SlowLog withCount(String count) {
        this.count = count;
        return this;
    }

    /** 执行次数。
     * 
     * @return count */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public SlowLog withTime(String time) {
        this.time = time;
        return this;
    }

    /** 平均执行时间。
     * 
     * @return time */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public SlowLog withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /** 平均等待锁时间。
     * 
     * @return lockTime */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public SlowLog withRowsSent(String rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /** 平均结果行数量。
     * 
     * @return rowsSent */
    public String getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(String rowsSent) {
        this.rowsSent = rowsSent;
    }

    public SlowLog withRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /** 平均扫描的行数量。
     * 
     * @return rowsExamined */
    public String getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public SlowLog withDatabase(String database) {
        this.database = database;
        return this;
    }

    /** 所属数据库。
     * 
     * @return database */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public SlowLog withUsers(String users) {
        this.users = users;
        return this;
    }

    /** 帐号。
     * 
     * @return users */
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public SlowLog withQuerySample(String querySample) {
        this.querySample = querySample;
        return this;
    }

    /** 执行语法。
     * 
     * @return querySample */
    public String getQuerySample() {
        return querySample;
    }

    public void setQuerySample(String querySample) {
        this.querySample = querySample;
    }

    public SlowLog withType(String type) {
        this.type = type;
        return this;
    }

    /** 语句类型。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SlowLog withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 发生时间，UTC时间。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SlowLog withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /** IP地址。
     * 
     * @return clientIp */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlowLog slowLog = (SlowLog) o;
        return Objects.equals(this.count, slowLog.count) && Objects.equals(this.time, slowLog.time)
            && Objects.equals(this.lockTime, slowLog.lockTime) && Objects.equals(this.rowsSent, slowLog.rowsSent)
            && Objects.equals(this.rowsExamined, slowLog.rowsExamined)
            && Objects.equals(this.database, slowLog.database) && Objects.equals(this.users, slowLog.users)
            && Objects.equals(this.querySample, slowLog.querySample) && Objects.equals(this.type, slowLog.type)
            && Objects.equals(this.startTime, slowLog.startTime) && Objects.equals(this.clientIp, slowLog.clientIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count,
            time,
            lockTime,
            rowsSent,
            rowsExamined,
            database,
            users,
            querySample,
            type,
            startTime,
            clientIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLog {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
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
