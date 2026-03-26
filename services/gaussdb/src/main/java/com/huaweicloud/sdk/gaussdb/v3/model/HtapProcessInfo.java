package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HTAP标准版的会话信息
 */
public class HtapProcessInfo {

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
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    public HtapProcessInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  会话ID。    **取值范围**：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HtapProcessInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**：  会话用户名。    **取值范围**：  不涉及。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public HtapProcessInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释**：  会话主机。    **取值范围**：  不涉及。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public HtapProcessInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：  会话状态。  **取值范围**：  不涉及。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public HtapProcessInfo withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释**：  会话对应数据库。    **取值范围**：  不涉及。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public HtapProcessInfo withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * **参数解释**：  会话执行的SQL语句。    **取值范围**：  不涉及。
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public HtapProcessInfo withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**：  会话持续时间，单位是秒。  **取值范围**：  不涉及。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public HtapProcessInfo withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * **参数解释**：  会话命令类型。    **取值范围**：  不涉及。
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HtapProcessInfo that = (HtapProcessInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.user, that.user)
            && Objects.equals(this.host, that.host) && Objects.equals(this.state, that.state)
            && Objects.equals(this.database, that.database) && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.command, that.command);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, host, state, database, sqlStatement, duration, command);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HtapProcessInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
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
