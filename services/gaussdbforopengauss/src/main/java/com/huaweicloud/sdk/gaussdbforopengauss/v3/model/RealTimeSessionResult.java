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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private String clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_time_cost")

    private String transactionTimeCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_session_id")

    private String globalSessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_transaction_id")

    private String topTransactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_transaction_id")

    private String currentTransactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xlog_quantity_pretty")

    private String xlogQuantityPretty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_status")

    private String waitStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lwt_id")

    private String lwtId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_name")

    private String threadName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_mode")

    private String lockMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_session_id")

    private String parentSessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smp_id")

    private String smpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_tag")

    private String lockTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

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

    public RealTimeSessionResult withClientPort(String clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * **参数解释**： 客户端用于与后台通讯的TCP端口号，如果使用Unix套接字，则为-1。 **取值范围**： 不涉及。
     * @return clientPort
     */
    public String getClientPort() {
        return clientPort;
    }

    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    public RealTimeSessionResult withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * **参数解释**： 会话执行的sql数。 **取值范围**： 不涉及。
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public RealTimeSessionResult withTransactionTimeCost(String transactionTimeCost) {
        this.transactionTimeCost = transactionTimeCost;
        return this;
    }

    /**
     * **参数解释**： 当前用户上一次执行的事务持续时间。 **取值范围**： 不涉及。
     * @return transactionTimeCost
     */
    public String getTransactionTimeCost() {
        return transactionTimeCost;
    }

    public void setTransactionTimeCost(String transactionTimeCost) {
        this.transactionTimeCost = transactionTimeCost;
    }

    public RealTimeSessionResult withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * **参数解释**： 驱动传入的trace id，用于标识应用的一次请求。 **取值范围**： 不涉及。
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public RealTimeSessionResult withGlobalSessionId(String globalSessionId) {
        this.globalSessionId = globalSessionId;
        return this;
    }

    /**
     * **参数解释**： 当前用户上次执行的全局会话ID。 **取值范围**： 不涉及。
     * @return globalSessionId
     */
    public String getGlobalSessionId() {
        return globalSessionId;
    }

    public void setGlobalSessionId(String globalSessionId) {
        this.globalSessionId = globalSessionId;
    }

    public RealTimeSessionResult withTopTransactionId(String topTransactionId) {
        this.topTransactionId = topTransactionId;
        return this;
    }

    /**
     * **参数解释**： 当前用户上次执行的顶层事务ID。 **取值范围**： 不涉及。
     * @return topTransactionId
     */
    public String getTopTransactionId() {
        return topTransactionId;
    }

    public void setTopTransactionId(String topTransactionId) {
        this.topTransactionId = topTransactionId;
    }

    public RealTimeSessionResult withCurrentTransactionId(String currentTransactionId) {
        this.currentTransactionId = currentTransactionId;
        return this;
    }

    /**
     * **参数解释**： 当前用户上次执行的事务ID。 **取值范围**： 不涉及。
     * @return currentTransactionId
     */
    public String getCurrentTransactionId() {
        return currentTransactionId;
    }

    public void setCurrentTransactionId(String currentTransactionId) {
        this.currentTransactionId = currentTransactionId;
    }

    public RealTimeSessionResult withXlogQuantityPretty(String xlogQuantityPretty) {
        this.xlogQuantityPretty = xlogQuantityPretty;
        return this;
    }

    /**
     * **参数解释**： 当前用户上次执行的事务使用的XLOG量，易读格式。 **取值范围**： 不涉及。
     * @return xlogQuantityPretty
     */
    public String getXlogQuantityPretty() {
        return xlogQuantityPretty;
    }

    public void setXlogQuantityPretty(String xlogQuantityPretty) {
        this.xlogQuantityPretty = xlogQuantityPretty;
    }

    public RealTimeSessionResult withWaitStatus(String waitStatus) {
        this.waitStatus = waitStatus;
        return this;
    }

    /**
     * **参数解释**： 实例线程等待状态。 **取值范围**： 不涉及。
     * @return waitStatus
     */
    public String getWaitStatus() {
        return waitStatus;
    }

    public void setWaitStatus(String waitStatus) {
        this.waitStatus = waitStatus;
    }

    public RealTimeSessionResult withLwtId(String lwtId) {
        this.lwtId = lwtId;
        return this;
    }

    /**
     * **参数解释**： 实例线程的轻量级线程号。 **取值范围**： 不涉及。
     * @return lwtId
     */
    public String getLwtId() {
        return lwtId;
    }

    public void setLwtId(String lwtId) {
        this.lwtId = lwtId;
    }

    public RealTimeSessionResult withThreadName(String threadName) {
        this.threadName = threadName;
        return this;
    }

    /**
     * **参数解释**： 实例线程名。 **取值范围**： 不涉及。
     * @return threadName
     */
    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public RealTimeSessionResult withLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    /**
     * **参数解释**： 实例等锁模式。 **取值范围**： 不涉及。
     * @return lockMode
     */
    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public RealTimeSessionResult withParentSessionId(String parentSessionId) {
        this.parentSessionId = parentSessionId;
        return this;
    }

    /**
     * **参数解释**： 实例父会话ID。 **取值范围**： 不涉及。
     * @return parentSessionId
     */
    public String getParentSessionId() {
        return parentSessionId;
    }

    public void setParentSessionId(String parentSessionId) {
        this.parentSessionId = parentSessionId;
    }

    public RealTimeSessionResult withSmpId(String smpId) {
        this.smpId = smpId;
        return this;
    }

    /**
     * **参数解释**： 实例并行线程的ID。 **取值范围**： 不涉及。
     * @return smpId
     */
    public String getSmpId() {
        return smpId;
    }

    public void setSmpId(String smpId) {
        this.smpId = smpId;
    }

    public RealTimeSessionResult withLockTag(String lockTag) {
        this.lockTag = lockTag;
        return this;
    }

    /**
     * **参数解释**： 实例线程正等待获取的锁的信息。 **取值范围**： 不涉及。
     * @return lockTag
     */
    public String getLockTag() {
        return lockTag;
    }

    public void setLockTag(String lockTag) {
        this.lockTag = lockTag;
    }

    public RealTimeSessionResult withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * **参数解释**： 组件名称。 **取值范围**： 不涉及。
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
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
            && Objects.equals(this.rollbackNum, that.rollbackNum) && Objects.equals(this.sqlNum, that.sqlNum)
            && Objects.equals(this.clientPort, that.clientPort) && Objects.equals(this.queryId, that.queryId)
            && Objects.equals(this.transactionTimeCost, that.transactionTimeCost)
            && Objects.equals(this.traceId, that.traceId) && Objects.equals(this.globalSessionId, that.globalSessionId)
            && Objects.equals(this.topTransactionId, that.topTransactionId)
            && Objects.equals(this.currentTransactionId, that.currentTransactionId)
            && Objects.equals(this.xlogQuantityPretty, that.xlogQuantityPretty)
            && Objects.equals(this.waitStatus, that.waitStatus) && Objects.equals(this.lwtId, that.lwtId)
            && Objects.equals(this.threadName, that.threadName) && Objects.equals(this.lockMode, that.lockMode)
            && Objects.equals(this.parentSessionId, that.parentSessionId) && Objects.equals(this.smpId, that.smpId)
            && Objects.equals(this.lockTag, that.lockTag) && Objects.equals(this.componentName, that.componentName);
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
            sqlNum,
            clientPort,
            queryId,
            transactionTimeCost,
            traceId,
            globalSessionId,
            topTransactionId,
            currentTransactionId,
            xlogQuantityPretty,
            waitStatus,
            lwtId,
            threadName,
            lockMode,
            parentSessionId,
            smpId,
            lockTag,
            componentName);
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
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    transactionTimeCost: ").append(toIndentedString(transactionTimeCost)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    globalSessionId: ").append(toIndentedString(globalSessionId)).append("\n");
        sb.append("    topTransactionId: ").append(toIndentedString(topTransactionId)).append("\n");
        sb.append("    currentTransactionId: ").append(toIndentedString(currentTransactionId)).append("\n");
        sb.append("    xlogQuantityPretty: ").append(toIndentedString(xlogQuantityPretty)).append("\n");
        sb.append("    waitStatus: ").append(toIndentedString(waitStatus)).append("\n");
        sb.append("    lwtId: ").append(toIndentedString(lwtId)).append("\n");
        sb.append("    threadName: ").append(toIndentedString(threadName)).append("\n");
        sb.append("    lockMode: ").append(toIndentedString(lockMode)).append("\n");
        sb.append("    parentSessionId: ").append(toIndentedString(parentSessionId)).append("\n");
        sb.append("    smpId: ").append(toIndentedString(smpId)).append("\n");
        sb.append("    lockTag: ").append(toIndentedString(lockTag)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
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
