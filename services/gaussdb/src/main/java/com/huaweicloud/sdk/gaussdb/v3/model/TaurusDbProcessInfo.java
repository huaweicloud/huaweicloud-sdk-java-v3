package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaurusDB用户会话线程信息
 */
public class TaurusDbProcessInfo {

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
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    public TaurusDbProcessInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  用户会话线程ID。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaurusDbProcessInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**：  启动用户会话线程的用户。 
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public TaurusDbProcessInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释**：  发送请求的主机和端口。 
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public TaurusDbProcessInfo withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * **参数解释**：  当前访问的数据库名。 
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public TaurusDbProcessInfo withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * **参数解释**：  当前执行的命令。 
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public TaurusDbProcessInfo withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**：  用户会话线程处于当前状态的持续时间，单位为秒。 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public TaurusDbProcessInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：  正在执行的SQL语句的当前状态。 
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TaurusDbProcessInfo withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * **参数解释**：  额外信息，通常是正在执行的语句。 
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
        TaurusDbProcessInfo that = (TaurusDbProcessInfo) obj;
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
        sb.append("class TaurusDbProcessInfo {\n");
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
