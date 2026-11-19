package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProcessDetail
 */
public class ProcessDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private String db;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_info")

    private String sqlInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_duration")

    private Long stateDuration;

    public ProcessDetail withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**  会话ID。  **取值范围**：  不涉及。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProcessDetail withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**：  用户名。  **取值范围**：  不涉及。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ProcessDetail withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * **参数解释**：    数据库名。    **取值范围**：    不涉及。
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public ProcessDetail withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：  执行状态。  **取值范围**：  不涉及。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ProcessDetail withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * **参数解释**：  命令。  **取值范围**：  不涉及。
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public ProcessDetail withSqlInfo(String sqlInfo) {
        this.sqlInfo = sqlInfo;
        return this;
    }

    /**
     * **参数解释**：  SQL语句。  **取值范围**：  不涉及。
     * @return sqlInfo
     */
    public String getSqlInfo() {
        return sqlInfo;
    }

    public void setSqlInfo(String sqlInfo) {
        this.sqlInfo = sqlInfo;
    }

    public ProcessDetail withStateDuration(Long stateDuration) {
        this.stateDuration = stateDuration;
        return this;
    }

    /**
     * **参数解释**：  状态持续时间，单位是秒。  **取值范围**：  不涉及。
     * @return stateDuration
     */
    public Long getStateDuration() {
        return stateDuration;
    }

    public void setStateDuration(Long stateDuration) {
        this.stateDuration = stateDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessDetail that = (ProcessDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.user, that.user)
            && Objects.equals(this.db, that.db) && Objects.equals(this.state, that.state)
            && Objects.equals(this.command, that.command) && Objects.equals(this.sqlInfo, that.sqlInfo)
            && Objects.equals(this.stateDuration, that.stateDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, db, state, command, sqlInfo, stateDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    sqlInfo: ").append(toIndentedString(sqlInfo)).append("\n");
        sb.append("    stateDuration: ").append(toIndentedString(stateDuration)).append("\n");
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
