package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 慢日志信息。
 */
public class SlowLogStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockTime")

    @JacksonXmlProperty(localName = "lockTime")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rowsSent")

    @JacksonXmlProperty(localName = "rowsSent")

    private Long rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rowsExamined")

    @JacksonXmlProperty(localName = "rowsExamined")

    private Long rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    @JacksonXmlProperty(localName = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    @JacksonXmlProperty(localName = "users")

    private String users;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "querySample")

    @JacksonXmlProperty(localName = "querySample")

    private String querySample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientIP")

    @JacksonXmlProperty(localName = "clientIP")

    private String clientIP;

    public SlowLogStatistics withCount(String count) {
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

    public SlowLogStatistics withTime(String time) {
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

    public SlowLogStatistics withLockTime(String lockTime) {
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

    public SlowLogStatistics withRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /**
     * 平均结果行数量。
     * @return rowsSent
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public SlowLogStatistics withRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * 平均扫描的行数量。
     * @return rowsExamined
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public SlowLogStatistics withDatabase(String database) {
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

    public SlowLogStatistics withUsers(String users) {
        this.users = users;
        return this;
    }

    /**
     * 帐号。
     * @return users
     */
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public SlowLogStatistics withQuerySample(String querySample) {
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

    public SlowLogStatistics withType(String type) {
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

    public SlowLogStatistics withClientIP(String clientIP) {
        this.clientIP = clientIP;
        return this;
    }

    /**
     * IP地址。
     * @return clientIP
     */
    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlowLogStatistics slowLogStatistics = (SlowLogStatistics) o;
        return Objects.equals(this.count, slowLogStatistics.count) && Objects.equals(this.time, slowLogStatistics.time)
            && Objects.equals(this.lockTime, slowLogStatistics.lockTime)
            && Objects.equals(this.rowsSent, slowLogStatistics.rowsSent)
            && Objects.equals(this.rowsExamined, slowLogStatistics.rowsExamined)
            && Objects.equals(this.database, slowLogStatistics.database)
            && Objects.equals(this.users, slowLogStatistics.users)
            && Objects.equals(this.querySample, slowLogStatistics.querySample)
            && Objects.equals(this.type, slowLogStatistics.type)
            && Objects.equals(this.clientIP, slowLogStatistics.clientIP);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(count, time, lockTime, rowsSent, rowsExamined, database, users, querySample, type, clientIP);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLogStatistics {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
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
