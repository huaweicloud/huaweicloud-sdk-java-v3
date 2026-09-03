package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 进程信息
 */
public class ProcessInfo {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_duration")

    private String trxDuration;

    public ProcessInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 会话ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ProcessInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 连接库的IP和port
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ProcessInfo withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * 数据库
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public ProcessInfo withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 当前执行的命令
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public ProcessInfo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 会话运行时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ProcessInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 执行状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ProcessInfo withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * 执行的SQL
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ProcessInfo withTrxDuration(String trxDuration) {
        this.trxDuration = trxDuration;
        return this;
    }

    /**
     * 事务持续时间
     * @return trxDuration
     */
    public String getTrxDuration() {
        return trxDuration;
    }

    public void setTrxDuration(String trxDuration) {
        this.trxDuration = trxDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessInfo that = (ProcessInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.user, that.user)
            && Objects.equals(this.host, that.host) && Objects.equals(this.db, that.db)
            && Objects.equals(this.command, that.command) && Objects.equals(this.time, that.time)
            && Objects.equals(this.state, that.state) && Objects.equals(this.info, that.info)
            && Objects.equals(this.trxDuration, that.trxDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, host, db, command, time, state, info, trxDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    trxDuration: ").append(toIndentedString(trxDuration)).append("\n");
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
