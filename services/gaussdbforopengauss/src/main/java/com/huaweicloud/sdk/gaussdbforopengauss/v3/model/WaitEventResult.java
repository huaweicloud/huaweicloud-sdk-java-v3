package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WaitEventResult
 */
public class WaitEventResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private String pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event")

    private String waitEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_status")

    private String waitStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_addr")

    private String clientAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private String clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_time")

    private String sessionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xact_start")

    private String xactStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_time")

    private String transactionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_start")

    private String queryStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_change")

    private String stateChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time")

    private String queryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_start")

    private String backendStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting")

    private String waiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockmode")

    private String lockmode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_sessionid")

    private String blockSessionid;

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
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_xid")

    private String currentXid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_xid")

    private String topXid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xlog_quantity")

    private String xlogQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private String connectionInfo;

    public WaitEventResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**: 会话ID。 **取值范围**: 不涉及。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public WaitEventResult withPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**: 线程ID。 **取值范围**: 不涉及。
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public WaitEventResult withWaitEvent(String waitEvent) {
        this.waitEvent = waitEvent;
        return this;
    }

    /**
     * **参数解释**: 等待事件。 参见“开发指南 > 系统表和系统视图 > 系统视图 > 其他系统视图 > PG_THREAD_WAIT_STATUS”中的wait_event字段。 **取值范围**: 不涉及。
     * @return waitEvent
     */
    public String getWaitEvent() {
        return waitEvent;
    }

    public void setWaitEvent(String waitEvent) {
        this.waitEvent = waitEvent;
    }

    public WaitEventResult withWaitStatus(String waitStatus) {
        this.waitStatus = waitStatus;
        return this;
    }

    /**
     * **参数解释**: 等待状态。 参见“开发指南 > 系统表和系统视图 > 系统视图 > 其他系统视图 > PG_THREAD_WAIT_STATUS”中的等待状态列表。 **取值范围**: 不涉及。
     * @return waitStatus
     */
    public String getWaitStatus() {
        return waitStatus;
    }

    public void setWaitStatus(String waitStatus) {
        this.waitStatus = waitStatus;
    }

    public WaitEventResult withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **取值范围**: 不涉及。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public WaitEventResult withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名称。 **取值范围**: 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WaitEventResult withClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }

    /**
     * **参数解释**: 客户端地址。 **取值范围**: 不涉及。
     * @return clientAddr
     */
    public String getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
    }

    public WaitEventResult withClientPort(String clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * **参数解释**: 客户端用于与后台通讯的TCP端口号。 **取值范围**: 不涉及。
     * @return clientPort
     */
    public String getClientPort() {
        return clientPort;
    }

    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    public WaitEventResult withSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
        return this;
    }

    /**
     * **参数解释**: 会话持续时间，单位：秒。 **取值范围**: 不涉及。
     * @return sessionTime
     */
    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }

    public WaitEventResult withXactStart(String xactStart) {
        this.xactStart = xactStart;
        return this;
    }

    /**
     * **参数解释**: 会话开始时间。 **取值范围**: 不涉及。
     * @return xactStart
     */
    public String getXactStart() {
        return xactStart;
    }

    public void setXactStart(String xactStart) {
        this.xactStart = xactStart;
    }

    public WaitEventResult withTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }

    /**
     * **参数解释**: 事务持续时间，单位秒。 **取值范围**: 不涉及。
     * @return transactionTime
     */
    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public WaitEventResult withQueryStart(String queryStart) {
        this.queryStart = queryStart;
        return this;
    }

    /**
     * **参数解释**: 查询开始时间。 **取值范围**: 不涉及。
     * @return queryStart
     */
    public String getQueryStart() {
        return queryStart;
    }

    public void setQueryStart(String queryStart) {
        this.queryStart = queryStart;
    }

    public WaitEventResult withStateChange(String stateChange) {
        this.stateChange = stateChange;
        return this;
    }

    /**
     * **参数解释**: 上次状态改变的时间。 **取值范围**: 不涉及。
     * @return stateChange
     */
    public String getStateChange() {
        return stateChange;
    }

    public void setStateChange(String stateChange) {
        this.stateChange = stateChange;
    }

    public WaitEventResult withQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }

    /**
     * **参数解释**: 查询持续时间，单位秒。 **取值范围**: 不涉及。
     * @return queryTime
     */
    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public WaitEventResult withBackendStart(String backendStart) {
        this.backendStart = backendStart;
        return this;
    }

    /**
     * **参数解释**: 会话开始时间。 **取值范围**: 不涉及。
     * @return backendStart
     */
    public String getBackendStart() {
        return backendStart;
    }

    public void setBackendStart(String backendStart) {
        this.backendStart = backendStart;
    }

    public WaitEventResult withWaiting(String waiting) {
        this.waiting = waiting;
        return this;
    }

    /**
     * **参数解释**: 是否在等待锁。 **取值范围**: 不涉及。
     * @return waiting
     */
    public String getWaiting() {
        return waiting;
    }

    public void setWaiting(String waiting) {
        this.waiting = waiting;
    }

    public WaitEventResult withLockmode(String lockmode) {
        this.lockmode = lockmode;
        return this;
    }

    /**
     * **参数解释**: （等待获取的）锁模式。 **取值范围**: 不涉及。
     * @return lockmode
     */
    public String getLockmode() {
        return lockmode;
    }

    public void setLockmode(String lockmode) {
        this.lockmode = lockmode;
    }

    public WaitEventResult withBlockSessionid(String blockSessionid) {
        this.blockSessionid = blockSessionid;
        return this;
    }

    /**
     * **参数解释**: 阻塞会话ID。 **取值范围**: 不涉及。
     * @return blockSessionid
     */
    public String getBlockSessionid() {
        return blockSessionid;
    }

    public void setBlockSessionid(String blockSessionid) {
        this.blockSessionid = blockSessionid;
    }

    public WaitEventResult withBlockCount(String blockCount) {
        this.blockCount = blockCount;
        return this;
    }

    /**
     * **参数解释**: 阻塞会话数。 **取值范围**: 不涉及。
     * @return blockCount
     */
    public String getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(String blockCount) {
        this.blockCount = blockCount;
    }

    public WaitEventResult withUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
        return this;
    }

    /**
     * **参数解释**: 归一化SQL ID。 **取值范围**: 不涉及。
     * @return uniqueSqlId
     */
    public String getUniqueSqlId() {
        return uniqueSqlId;
    }

    public void setUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
    }

    public WaitEventResult withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * **参数解释**: 查询 ID。 **取值范围**: 不涉及。
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public WaitEventResult withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释**: SQL文本。 **取值范围**: 不涉及。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public WaitEventResult withCurrentXid(String currentXid) {
        this.currentXid = currentXid;
        return this;
    }

    /**
     * **参数解释**: 当前事务ID。 **取值范围**: 不涉及。
     * @return currentXid
     */
    public String getCurrentXid() {
        return currentXid;
    }

    public void setCurrentXid(String currentXid) {
        this.currentXid = currentXid;
    }

    public WaitEventResult withTopXid(String topXid) {
        this.topXid = topXid;
        return this;
    }

    /**
     * **参数解释**: 顶层事务ID。 **取值范围**: 不涉及。
     * @return topXid
     */
    public String getTopXid() {
        return topXid;
    }

    public void setTopXid(String topXid) {
        this.topXid = topXid;
    }

    public WaitEventResult withXlogQuantity(String xlogQuantity) {
        this.xlogQuantity = xlogQuantity;
        return this;
    }

    /**
     * **参数解释**: 事务当前使用的XLOG量，单位为字节。 **取值范围**: 不涉及。
     * @return xlogQuantity
     */
    public String getXlogQuantity() {
        return xlogQuantity;
    }

    public void setXlogQuantity(String xlogQuantity) {
        this.xlogQuantity = xlogQuantity;
    }

    public WaitEventResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**: 该会话当前总体状态。 **取值范围**: -active：后台正在执行一个查询。 -idle：后台正在等待一个新的客户端命令。 -idle in transaction：后台在事务中，但事务中没有语句在执行。 -fastpath function call：后台正在执行一个fast-path函数。 -disabled：如果后台禁用track_activities，则事务显示此状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public WaitEventResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * **参数解释**: 应用名称。 **取值范围**: 不涉及。
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public WaitEventResult withConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    /**
     * **参数解释**: 连接信息。 **取值范围**: 不涉及。
     * @return connectionInfo
     */
    public String getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WaitEventResult that = (WaitEventResult) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.waitEvent, that.waitEvent) && Objects.equals(this.waitStatus, that.waitStatus)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.clientAddr, that.clientAddr) && Objects.equals(this.clientPort, that.clientPort)
            && Objects.equals(this.sessionTime, that.sessionTime) && Objects.equals(this.xactStart, that.xactStart)
            && Objects.equals(this.transactionTime, that.transactionTime)
            && Objects.equals(this.queryStart, that.queryStart) && Objects.equals(this.stateChange, that.stateChange)
            && Objects.equals(this.queryTime, that.queryTime) && Objects.equals(this.backendStart, that.backendStart)
            && Objects.equals(this.waiting, that.waiting) && Objects.equals(this.lockmode, that.lockmode)
            && Objects.equals(this.blockSessionid, that.blockSessionid)
            && Objects.equals(this.blockCount, that.blockCount) && Objects.equals(this.uniqueSqlId, that.uniqueSqlId)
            && Objects.equals(this.queryId, that.queryId) && Objects.equals(this.query, that.query)
            && Objects.equals(this.currentXid, that.currentXid) && Objects.equals(this.topXid, that.topXid)
            && Objects.equals(this.xlogQuantity, that.xlogQuantity) && Objects.equals(this.state, that.state)
            && Objects.equals(this.applicationName, that.applicationName)
            && Objects.equals(this.connectionInfo, that.connectionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId,
            pid,
            waitEvent,
            waitStatus,
            databaseName,
            userName,
            clientAddr,
            clientPort,
            sessionTime,
            xactStart,
            transactionTime,
            queryStart,
            stateChange,
            queryTime,
            backendStart,
            waiting,
            lockmode,
            blockSessionid,
            blockCount,
            uniqueSqlId,
            queryId,
            query,
            currentXid,
            topXid,
            xlogQuantity,
            state,
            applicationName,
            connectionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WaitEventResult {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    waitEvent: ").append(toIndentedString(waitEvent)).append("\n");
        sb.append("    waitStatus: ").append(toIndentedString(waitStatus)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    clientAddr: ").append(toIndentedString(clientAddr)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    sessionTime: ").append(toIndentedString(sessionTime)).append("\n");
        sb.append("    xactStart: ").append(toIndentedString(xactStart)).append("\n");
        sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
        sb.append("    queryStart: ").append(toIndentedString(queryStart)).append("\n");
        sb.append("    stateChange: ").append(toIndentedString(stateChange)).append("\n");
        sb.append("    queryTime: ").append(toIndentedString(queryTime)).append("\n");
        sb.append("    backendStart: ").append(toIndentedString(backendStart)).append("\n");
        sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
        sb.append("    lockmode: ").append(toIndentedString(lockmode)).append("\n");
        sb.append("    blockSessionid: ").append(toIndentedString(blockSessionid)).append("\n");
        sb.append("    blockCount: ").append(toIndentedString(blockCount)).append("\n");
        sb.append("    uniqueSqlId: ").append(toIndentedString(uniqueSqlId)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    currentXid: ").append(toIndentedString(currentXid)).append("\n");
        sb.append("    topXid: ").append(toIndentedString(topXid)).append("\n");
        sb.append("    xlogQuantity: ").append(toIndentedString(xlogQuantity)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
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
