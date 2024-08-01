package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LogicalProcessInfo
 */
public class LogicalProcessInfo {

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
    @JsonProperty(value = "db")

    private String db;

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
    @JsonProperty(value = "info")

    private String info;

    public LogicalProcessInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 会话id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LogicalProcessInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 当前连接用户
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LogicalProcessInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 所属的 IP 和端口
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public LogicalProcessInfo withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * 数据库名
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public LogicalProcessInfo withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 连接状态，一般是休眠（sleep），查询（query），连接（connect）
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public LogicalProcessInfo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 连接状态持续的时间，单位是秒（s）
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LogicalProcessInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 当前 SQL 语句的状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LogicalProcessInfo withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * 当前所执行的 SQL 语句
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogicalProcessInfo that = (LogicalProcessInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.user, that.user)
            && Objects.equals(this.host, that.host) && Objects.equals(this.db, that.db)
            && Objects.equals(this.command, that.command) && Objects.equals(this.time, that.time)
            && Objects.equals(this.state, that.state) && Objects.equals(this.info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, host, db, command, time, state, info);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalProcessInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
