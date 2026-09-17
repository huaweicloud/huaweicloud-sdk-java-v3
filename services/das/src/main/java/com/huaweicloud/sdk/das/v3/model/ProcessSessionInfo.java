package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会话信息
 */
public class ProcessSessionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

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
    @JsonProperty(value = "sql_info")

    private String sqlInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_duration")

    private Long stateDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    public ProcessSessionInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 会话ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProcessSessionInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 数据库用户
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ProcessSessionInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 数据库主机
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ProcessSessionInfo withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * 数据库名称
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public ProcessSessionInfo withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 命令类型
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public ProcessSessionInfo withSqlInfo(String sqlInfo) {
        this.sqlInfo = sqlInfo;
        return this;
    }

    /**
     * SQL信息
     * @return sqlInfo
     */
    public String getSqlInfo() {
        return sqlInfo;
    }

    public void setSqlInfo(String sqlInfo) {
        this.sqlInfo = sqlInfo;
    }

    public ProcessSessionInfo withStateDuration(Long stateDuration) {
        this.stateDuration = stateDuration;
        return this;
    }

    /**
     * 当前状态持续时间
     * @return stateDuration
     */
    public Long getStateDuration() {
        return stateDuration;
    }

    public void setStateDuration(Long stateDuration) {
        this.stateDuration = stateDuration;
    }

    public ProcessSessionInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 当前状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessSessionInfo that = (ProcessSessionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.user, that.user)
            && Objects.equals(this.host, that.host) && Objects.equals(this.db, that.db)
            && Objects.equals(this.command, that.command) && Objects.equals(this.sqlInfo, that.sqlInfo)
            && Objects.equals(this.stateDuration, that.stateDuration) && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, host, db, command, sqlInfo, stateDuration, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessSessionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    sqlInfo: ").append(toIndentedString(sqlInfo)).append("\n");
        sb.append("    stateDuration: ").append(toIndentedString(stateDuration)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
