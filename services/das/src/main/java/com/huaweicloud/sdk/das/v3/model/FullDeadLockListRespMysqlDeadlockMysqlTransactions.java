package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FullDeadLockListRespMysqlDeadlockMysqlTransactions
 */
public class FullDeadLockListRespMysqlDeadlockMysqlTransactions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private String threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_type")

    private String requestType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_lock")

    private String waitingLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_lock_index")

    private String waitingLockIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_lock_type")

    private String waitingLockType;

    public FullDeadLockListRespMysqlDeadlockMysqlTransactions withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 表
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public FullDeadLockListRespMysqlDeadlockMysqlTransactions withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 具体sql
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public FullDeadLockListRespMysqlDeadlockMysqlTransactions withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话id
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public FullDeadLockListRespMysqlDeadlockMysqlTransactions withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 线程id
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public FullDeadLockListRespMysqlDeadlockMysqlTransactions withRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }

    /**
     * 请求类型
     * @return requestType
     */
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public FullDeadLockListRespMysqlDeadlockMysqlTransactions withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 内部事务id
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public FullDeadLockListRespMysqlDeadlockMysqlTransactions withWaitingLock(String waitingLock) {
        this.waitingLock = waitingLock;
        return this;
    }

    /**
     * 事务正在等待的锁的描述
     * @return waitingLock
     */
    public String getWaitingLock() {
        return waitingLock;
    }

    public void setWaitingLock(String waitingLock) {
        this.waitingLock = waitingLock;
    }

    public FullDeadLockListRespMysqlDeadlockMysqlTransactions withWaitingLockIndex(String waitingLockIndex) {
        this.waitingLockIndex = waitingLockIndex;
        return this;
    }

    /**
     * 锁针对的索引
     * @return waitingLockIndex
     */
    public String getWaitingLockIndex() {
        return waitingLockIndex;
    }

    public void setWaitingLockIndex(String waitingLockIndex) {
        this.waitingLockIndex = waitingLockIndex;
    }

    public FullDeadLockListRespMysqlDeadlockMysqlTransactions withWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
        return this;
    }

    /**
     * 锁类型
     * @return waitingLockType
     */
    public String getWaitingLockType() {
        return waitingLockType;
    }

    public void setWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullDeadLockListRespMysqlDeadlockMysqlTransactions that =
            (FullDeadLockListRespMysqlDeadlockMysqlTransactions) obj;
        return Objects.equals(this.table, that.table) && Objects.equals(this.sql, that.sql)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.threadId, that.threadId)
            && Objects.equals(this.requestType, that.requestType)
            && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.waitingLock, that.waitingLock)
            && Objects.equals(this.waitingLockIndex, that.waitingLockIndex)
            && Objects.equals(this.waitingLockType, that.waitingLockType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table,
            sql,
            sessionId,
            threadId,
            requestType,
            transactionId,
            waitingLock,
            waitingLockIndex,
            waitingLockType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullDeadLockListRespMysqlDeadlockMysqlTransactions {\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    waitingLock: ").append(toIndentedString(waitingLock)).append("\n");
        sb.append("    waitingLockIndex: ").append(toIndentedString(waitingLockIndex)).append("\n");
        sb.append("    waitingLockType: ").append(toIndentedString(waitingLockType)).append("\n");
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
