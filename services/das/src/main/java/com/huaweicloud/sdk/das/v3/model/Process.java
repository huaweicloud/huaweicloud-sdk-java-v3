package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Process */
public class Process {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_executed_time")

    private String trxExecutedTime;

    public Process withId(String id) {
        this.id = id;
        return this;
    }

    /** 会话ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Process withUser(String user) {
        this.user = user;
        return this;
    }

    /** 用户
     * 
     * @return user */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Process withHost(String host) {
        this.host = host;
        return this;
    }

    /** 主机
     * 
     * @return host */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Process withDatabase(String database) {
        this.database = database;
        return this;
    }

    /** 数据库
     * 
     * @return database */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Process withCommand(String command) {
        this.command = command;
        return this;
    }

    /** 命令
     * 
     * @return command */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Process withTime(String time) {
        this.time = time;
        return this;
    }

    /** 会话持续时间
     * 
     * @return time */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Process withState(String state) {
        this.state = state;
        return this;
    }

    /** 状态
     * 
     * @return state */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Process withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /** SQL语句
     * 
     * @return sql */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Process withTrxExecutedTime(String trxExecutedTime) {
        this.trxExecutedTime = trxExecutedTime;
        return this;
    }

    /** 事务持续时间
     * 
     * @return trxExecutedTime */
    public String getTrxExecutedTime() {
        return trxExecutedTime;
    }

    public void setTrxExecutedTime(String trxExecutedTime) {
        this.trxExecutedTime = trxExecutedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Process process = (Process) o;
        return Objects.equals(this.id, process.id) && Objects.equals(this.user, process.user)
            && Objects.equals(this.host, process.host) && Objects.equals(this.database, process.database)
            && Objects.equals(this.command, process.command) && Objects.equals(this.time, process.time)
            && Objects.equals(this.state, process.state) && Objects.equals(this.sql, process.sql)
            && Objects.equals(this.trxExecutedTime, process.trxExecutedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, host, database, command, time, state, sql, trxExecutedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Process {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    trxExecutedTime: ").append(toIndentedString(trxExecutedTime)).append("\n");
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
