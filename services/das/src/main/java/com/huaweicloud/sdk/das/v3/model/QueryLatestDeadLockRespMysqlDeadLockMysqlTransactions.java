package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions
 */
public class QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "holding_lock")

    private String holdingLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "holding_lock_index")

    private String holdingLockIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "holding_lock_type")

    private String holdingLockType;

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 事务操作的具体表
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 前正在执行或最近执行的 SQL 语句
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话的 ID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withThreadId(String threadId) {
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

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withRequestType(String requestType) {
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

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 内部的事务 ID
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withWaitingLock(String waitingLock) {
        this.waitingLock = waitingLock;
        return this;
    }

    /**
     * 事务正在等待的锁的详细描述
     * @return waitingLock
     */
    public String getWaitingLock() {
        return waitingLock;
    }

    public void setWaitingLock(String waitingLock) {
        this.waitingLock = waitingLock;
    }

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withWaitingLockIndex(String waitingLockIndex) {
        this.waitingLockIndex = waitingLockIndex;
        return this;
    }

    /**
     * 正在等待的锁是针对表的索引
     * @return waitingLockIndex
     */
    public String getWaitingLockIndex() {
        return waitingLockIndex;
    }

    public void setWaitingLockIndex(String waitingLockIndex) {
        this.waitingLockIndex = waitingLockIndex;
    }

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
        return this;
    }

    /**
     * 正在等待的锁的具体类型
     * @return waitingLockType
     */
    public String getWaitingLockType() {
        return waitingLockType;
    }

    public void setWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
    }

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withHoldingLock(String holdingLock) {
        this.holdingLock = holdingLock;
        return this;
    }

    /**
     * 该事务当前持有的锁的详细描述
     * @return holdingLock
     */
    public String getHoldingLock() {
        return holdingLock;
    }

    public void setHoldingLock(String holdingLock) {
        this.holdingLock = holdingLock;
    }

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withHoldingLockIndex(String holdingLockIndex) {
        this.holdingLockIndex = holdingLockIndex;
        return this;
    }

    /**
     * 持有的锁的针对表的索引
     * @return holdingLockIndex
     */
    public String getHoldingLockIndex() {
        return holdingLockIndex;
    }

    public void setHoldingLockIndex(String holdingLockIndex) {
        this.holdingLockIndex = holdingLockIndex;
    }

    public QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions withHoldingLockType(String holdingLockType) {
        this.holdingLockType = holdingLockType;
        return this;
    }

    /**
     * 持有的锁的具体类型。X 是排他锁，rec 是记录锁
     * @return holdingLockType
     */
    public String getHoldingLockType() {
        return holdingLockType;
    }

    public void setHoldingLockType(String holdingLockType) {
        this.holdingLockType = holdingLockType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions that =
            (QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions) obj;
        return Objects.equals(this.table, that.table) && Objects.equals(this.sql, that.sql)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.threadId, that.threadId)
            && Objects.equals(this.requestType, that.requestType)
            && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.waitingLock, that.waitingLock)
            && Objects.equals(this.waitingLockIndex, that.waitingLockIndex)
            && Objects.equals(this.waitingLockType, that.waitingLockType)
            && Objects.equals(this.holdingLock, that.holdingLock)
            && Objects.equals(this.holdingLockIndex, that.holdingLockIndex)
            && Objects.equals(this.holdingLockType, that.holdingLockType);
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
            waitingLockType,
            holdingLock,
            holdingLockIndex,
            holdingLockType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions {\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    waitingLock: ").append(toIndentedString(waitingLock)).append("\n");
        sb.append("    waitingLockIndex: ").append(toIndentedString(waitingLockIndex)).append("\n");
        sb.append("    waitingLockType: ").append(toIndentedString(waitingLockType)).append("\n");
        sb.append("    holdingLock: ").append(toIndentedString(holdingLock)).append("\n");
        sb.append("    holdingLockIndex: ").append(toIndentedString(holdingLockIndex)).append("\n");
        sb.append("    holdingLockType: ").append(toIndentedString(holdingLockType)).append("\n");
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
