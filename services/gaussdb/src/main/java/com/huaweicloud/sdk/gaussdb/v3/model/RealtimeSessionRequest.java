package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 收集全部实时会话信息请求体
 */
public class RealtimeSessionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_process_threshold")

    private Integer slowProcessThreshold;

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
    @JsonProperty(value = "sql_key")

    private String sqlKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    public RealtimeSessionRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * **参数解释**：  需要收集的实时会话类型。  **约束限制**：  不涉及。  **取值范围**：  - slow：慢会话。 - active：活跃会话。 - total：会话总数。 - long：长事务会话。  **默认取值**：  total。
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public RealtimeSessionRequest withSlowProcessThreshold(Integer slowProcessThreshold) {
        this.slowProcessThreshold = slowProcessThreshold;
        return this;
    }

    /**
     * **参数解释**：  慢会话阈值，单位是秒。  **约束限制**：  不涉及。  **取值范围**：  1-86400。  **默认取值**：  10。
     * minimum: 1
     * maximum: 86400
     * @return slowProcessThreshold
     */
    public Integer getSlowProcessThreshold() {
        return slowProcessThreshold;
    }

    public void setSlowProcessThreshold(Integer slowProcessThreshold) {
        this.slowProcessThreshold = slowProcessThreshold;
    }

    public RealtimeSessionRequest withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**：  实时会话的用户。 获取方法请参见[查询数据库用户](https://support.huaweicloud.com/api-taurusdb/ListGaussMySqlDatabaseUser.html)。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public RealtimeSessionRequest withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释**：  实时会话的主机。 获取方法请参见[查询数据库用户](https://support.huaweicloud.com/api-taurusdb/ListGaussMySqlDatabaseUser.html)。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public RealtimeSessionRequest withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * **参数解释**：  实时会话的数据库。 获取方法请参见[查询数据库用户](https://support.huaweicloud.com/api-taurusdb/ListGaussMySqlDatabaseUser.html)。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public RealtimeSessionRequest withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * **参数解释**：  实时会话的命令类型。  **约束限制**：  不涉及。  **取值范围**：  - Sleep：空闲连接，无任何操作。 - Query：正在执行查询。 - Connect：建立连接。 - Init DB：切换数据库。 - Field List：获取表字段列表。 - Processlist：查看会话列表。  **默认取值**：  不涉及。
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public RealtimeSessionRequest withSqlKey(String sqlKey) {
        this.sqlKey = sqlKey;
        return this;
    }

    /**
     * **参数解释**：  实时会话的SQL语句。 您可以通过登录管理控制台，选择智能DBA助手下的实时会话，在会话列表中获取。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return sqlKey
     */
    public String getSqlKey() {
        return sqlKey;
    }

    public void setSqlKey(String sqlKey) {
        this.sqlKey = sqlKey;
    }

    public RealtimeSessionRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**：  实时会话的排序列。  **约束限制**：  不涉及。  **取值范围**：  - id：会话ID。 - state_duration：状态持续时间。 - trx_executed_time：事务持续时间。 - trx_id：事务ID。 - trx_lock_duration：事务锁等待时长。 - trx_lock_rows：事务锁定行数。 - trx_lock_tables：事务锁定表数量。 - trx_update_rows：事务更新行数。  **默认取值**：  id。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public RealtimeSessionRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**：  实时会话的排序方向。  **约束限制**：  不涉及。  **取值范围**：  - desc：降序排列。 - asc：升序排列。  **默认取值**：  asc。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealtimeSessionRequest that = (RealtimeSessionRequest) obj;
        return Objects.equals(this.filter, that.filter)
            && Objects.equals(this.slowProcessThreshold, that.slowProcessThreshold)
            && Objects.equals(this.user, that.user) && Objects.equals(this.host, that.host)
            && Objects.equals(this.db, that.db) && Objects.equals(this.command, that.command)
            && Objects.equals(this.sqlKey, that.sqlKey) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, slowProcessThreshold, user, host, db, command, sqlKey, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeSessionRequest {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    slowProcessThreshold: ").append(toIndentedString(slowProcessThreshold)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    sqlKey: ").append(toIndentedString(sqlKey)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
