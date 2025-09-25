package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WaitEventQueryInfo
 */
public class WaitEventQueryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting")

    private String waiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_session_id")

    private String blockSessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_count")

    private String blockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_sql_id")

    private String uniqueSqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event")

    private String waitEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_status")

    private String waitStatus;

    public WaitEventQueryInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public WaitEventQueryInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名称。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WaitEventQueryInfo withWaiting(String waiting) {
        this.waiting = waiting;
        return this;
    }

    /**
     * **参数解释**: 是否在等待状态。 **约束限制**: 不涉及。 **取值范围**: -t：是。 -f：否。 **默认取值**: 不涉及。
     * @return waiting
     */
    public String getWaiting() {
        return waiting;
    }

    public void setWaiting(String waiting) {
        this.waiting = waiting;
    }

    public WaitEventQueryInfo withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**: 会话ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public WaitEventQueryInfo withBlockSessionId(String blockSessionId) {
        this.blockSessionId = blockSessionId;
        return this;
    }

    /**
     * **参数解释**: 阻塞当前会话的会话ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return blockSessionId
     */
    public String getBlockSessionId() {
        return blockSessionId;
    }

    public void setBlockSessionId(String blockSessionId) {
        this.blockSessionId = blockSessionId;
    }

    public WaitEventQueryInfo withBlockCount(String blockCount) {
        this.blockCount = blockCount;
        return this;
    }

    /**
     * **参数解释**: 阻塞当前会话的会话数。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return blockCount
     */
    public String getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(String blockCount) {
        this.blockCount = blockCount;
    }

    public WaitEventQueryInfo withUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
        return this;
    }

    /**
     * **参数解释**: 唯一的SQL ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return uniqueSqlId
     */
    public String getUniqueSqlId() {
        return uniqueSqlId;
    }

    public void setUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
    }

    public WaitEventQueryInfo withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * **参数解释**: SQL查询ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public WaitEventQueryInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**: 该会话当前整体状态。 **约束限制**: 不涉及。 **取值范围**: -active：后台正在执行一个查询。 -idle：后台正在等待一个新的客户端命令。 -idle in transaction：后台在事务中，但事务中没有语句在执行。 -fastpath function call：后台正在执行一个fast-path函数。 -disabled：如果后台禁用track_activities，则事务显示此状态。 **默认取值**: 不涉及。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public WaitEventQueryInfo withWaitEvent(String waitEvent) {
        this.waitEvent = waitEvent;
        return this;
    }

    /**
     * **参数解释**: 等待事件。 参见“开发指南 > 系统表和系统视图 > 系统视图 > 其他系统视图 > PG_THREAD_WAIT_STATUS”中的wait_event字段。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return waitEvent
     */
    public String getWaitEvent() {
        return waitEvent;
    }

    public void setWaitEvent(String waitEvent) {
        this.waitEvent = waitEvent;
    }

    public WaitEventQueryInfo withWaitStatus(String waitStatus) {
        this.waitStatus = waitStatus;
        return this;
    }

    /**
     * **参数解释**: 等待状态。 参见“开发指南 > 系统表和系统视图 > 系统视图 > 其他系统视图 > PG_THREAD_WAIT_STATUS”中的wait_status列表。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return waitStatus
     */
    public String getWaitStatus() {
        return waitStatus;
    }

    public void setWaitStatus(String waitStatus) {
        this.waitStatus = waitStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WaitEventQueryInfo that = (WaitEventQueryInfo) obj;
        return Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.waiting, that.waiting) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.blockSessionId, that.blockSessionId)
            && Objects.equals(this.blockCount, that.blockCount) && Objects.equals(this.uniqueSqlId, that.uniqueSqlId)
            && Objects.equals(this.queryId, that.queryId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.waitEvent, that.waitEvent) && Objects.equals(this.waitStatus, that.waitStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName,
            userName,
            waiting,
            sessionId,
            blockSessionId,
            blockCount,
            uniqueSqlId,
            queryId,
            state,
            waitEvent,
            waitStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WaitEventQueryInfo {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    blockSessionId: ").append(toIndentedString(blockSessionId)).append("\n");
        sb.append("    blockCount: ").append(toIndentedString(blockCount)).append("\n");
        sb.append("    uniqueSqlId: ").append(toIndentedString(uniqueSqlId)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    waitEvent: ").append(toIndentedString(waitEvent)).append("\n");
        sb.append("    waitStatus: ").append(toIndentedString(waitStatus)).append("\n");
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
