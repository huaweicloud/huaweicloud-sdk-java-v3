package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RealTimeSessionResult
 */
public class RealTimeSessionResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private String pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_sql_id")

    private String uniqueSqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait")

    private String wait;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_session")

    private String blockSession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event")

    private String waitEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_runtime")

    private String queryRuntime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_end_start")

    private Integer backEndStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_start")

    private Integer transactionStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_start")

    private Integer queryStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_time")

    private String execTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_num")

    private String transNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_num")

    private String rollbackNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_num")

    private String sqlNum;

    public RealTimeSessionResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**： 会话ID。 **取值范围**： 不涉及。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public RealTimeSessionResult withPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**： 线程ID。 **取值范围**： 不涉及。
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public RealTimeSessionResult withUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
        return this;
    }

    /**
     * **参数解释**： SQL ID。 **取值范围**： 不涉及。
     * @return uniqueSqlId
     */
    public String getUniqueSqlId() {
        return uniqueSqlId;
    }

    public void setUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
    }

    public RealTimeSessionResult withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**： 数据库名称。 **取值范围**： 不涉及。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public RealTimeSessionResult withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * **参数解释**： 客户端IP。 **取值范围**： 不涉及。
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public RealTimeSessionResult withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 用户名称。 **取值范围**： 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public RealTimeSessionResult withWait(String wait) {
        this.wait = wait;
        return this;
    }

    /**
     * **参数解释**： 是否等待。 **取值范围**： 不涉及。
     * @return wait
     */
    public String getWait() {
        return wait;
    }

    public void setWait(String wait) {
        this.wait = wait;
    }

    public RealTimeSessionResult withBlockSession(String blockSession) {
        this.blockSession = blockSession;
        return this;
    }

    /**
     * **参数解释**： 阻塞会话。 **取值范围**： 不涉及。
     * @return blockSession
     */
    public String getBlockSession() {
        return blockSession;
    }

    public void setBlockSession(String blockSession) {
        this.blockSession = blockSession;
    }

    public RealTimeSessionResult withWaitEvent(String waitEvent) {
        this.waitEvent = waitEvent;
        return this;
    }

    /**
     * **参数解释**： 等待事件。 **取值范围**： 不涉及。
     * @return waitEvent
     */
    public String getWaitEvent() {
        return waitEvent;
    }

    public void setWaitEvent(String waitEvent) {
        this.waitEvent = waitEvent;
    }

    public RealTimeSessionResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**： 状态。 **取值范围**： 不涉及。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public RealTimeSessionResult withQueryRuntime(String queryRuntime) {
        this.queryRuntime = queryRuntime;
        return this;
    }

    /**
     * **参数解释**： 语句执行时长。 **取值范围**： 不涉及。
     * @return queryRuntime
     */
    public String getQueryRuntime() {
        return queryRuntime;
    }

    public void setQueryRuntime(String queryRuntime) {
        this.queryRuntime = queryRuntime;
    }

    public RealTimeSessionResult withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释**： SQL文本。 **取值范围**： 不涉及。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public RealTimeSessionResult withBackEndStart(Integer backEndStart) {
        this.backEndStart = backEndStart;
        return this;
    }

    /**
     * **参数解释**： 会话开始时间。 **取值范围**： 不涉及。
     * @return backEndStart
     */
    public Integer getBackEndStart() {
        return backEndStart;
    }

    public void setBackEndStart(Integer backEndStart) {
        this.backEndStart = backEndStart;
    }

    public RealTimeSessionResult withTransactionStart(Integer transactionStart) {
        this.transactionStart = transactionStart;
        return this;
    }

    /**
     * **参数解释**： 事务开始时间。 **取值范围**： 不涉及。
     * @return transactionStart
     */
    public Integer getTransactionStart() {
        return transactionStart;
    }

    public void setTransactionStart(Integer transactionStart) {
        this.transactionStart = transactionStart;
    }

    public RealTimeSessionResult withQueryStart(Integer queryStart) {
        this.queryStart = queryStart;
        return this;
    }

    /**
     * **参数解释**： 语句开始时间。 **取值范围**： 不涉及。
     * @return queryStart
     */
    public Integer getQueryStart() {
        return queryStart;
    }

    public void setQueryStart(Integer queryStart) {
        this.queryStart = queryStart;
    }

    public RealTimeSessionResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * **参数解释**： 应用名称。 **取值范围**： 不涉及。
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public RealTimeSessionResult withExecTime(String execTime) {
        this.execTime = execTime;
        return this;
    }

    /**
     * **参数解释**： 会话执行时长（单位：秒）。 **取值范围**： 不涉及。
     * @return execTime
     */
    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    public RealTimeSessionResult withTransNum(String transNum) {
        this.transNum = transNum;
        return this;
    }

    /**
     * **参数解释**： 会话建立事务的数量。 **取值范围**： 不涉及。
     * @return transNum
     */
    public String getTransNum() {
        return transNum;
    }

    public void setTransNum(String transNum) {
        this.transNum = transNum;
    }

    public RealTimeSessionResult withRollbackNum(String rollbackNum) {
        this.rollbackNum = rollbackNum;
        return this;
    }

    /**
     * **参数解释**： 会话中事务回滚的次数。 **取值范围**： 不涉及。
     * @return rollbackNum
     */
    public String getRollbackNum() {
        return rollbackNum;
    }

    public void setRollbackNum(String rollbackNum) {
        this.rollbackNum = rollbackNum;
    }

    public RealTimeSessionResult withSqlNum(String sqlNum) {
        this.sqlNum = sqlNum;
        return this;
    }

    /**
     * **参数解释**： 会话执行的sql数。 **取值范围**： 不涉及。
     * @return sqlNum
     */
    public String getSqlNum() {
        return sqlNum;
    }

    public void setSqlNum(String sqlNum) {
        this.sqlNum = sqlNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealTimeSessionResult that = (RealTimeSessionResult) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.uniqueSqlId, that.uniqueSqlId)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.clientIp, that.clientIp)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.wait, that.wait)
            && Objects.equals(this.blockSession, that.blockSession) && Objects.equals(this.waitEvent, that.waitEvent)
            && Objects.equals(this.state, that.state) && Objects.equals(this.queryRuntime, that.queryRuntime)
            && Objects.equals(this.query, that.query) && Objects.equals(this.backEndStart, that.backEndStart)
            && Objects.equals(this.transactionStart, that.transactionStart)
            && Objects.equals(this.queryStart, that.queryStart)
            && Objects.equals(this.applicationName, that.applicationName)
            && Objects.equals(this.execTime, that.execTime) && Objects.equals(this.transNum, that.transNum)
            && Objects.equals(this.rollbackNum, that.rollbackNum) && Objects.equals(this.sqlNum, that.sqlNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId,
            pid,
            uniqueSqlId,
            databaseName,
            clientIp,
            userName,
            wait,
            blockSession,
            waitEvent,
            state,
            queryRuntime,
            query,
            backEndStart,
            transactionStart,
            queryStart,
            applicationName,
            execTime,
            transNum,
            rollbackNum,
            sqlNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealTimeSessionResult {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    uniqueSqlId: ").append(toIndentedString(uniqueSqlId)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    wait: ").append(toIndentedString(wait)).append("\n");
        sb.append("    blockSession: ").append(toIndentedString(blockSession)).append("\n");
        sb.append("    waitEvent: ").append(toIndentedString(waitEvent)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    queryRuntime: ").append(toIndentedString(queryRuntime)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    backEndStart: ").append(toIndentedString(backEndStart)).append("\n");
        sb.append("    transactionStart: ").append(toIndentedString(transactionStart)).append("\n");
        sb.append("    queryStart: ").append(toIndentedString(queryStart)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    execTime: ").append(toIndentedString(execTime)).append("\n");
        sb.append("    transNum: ").append(toIndentedString(transNum)).append("\n");
        sb.append("    rollbackNum: ").append(toIndentedString(rollbackNum)).append("\n");
        sb.append("    sqlNum: ").append(toIndentedString(sqlNum)).append("\n");
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
