package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MySQL事务信息
 */
public class MySQLTransaction {

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
    @JsonProperty(value = "table")

    private String table;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    public MySQLTransaction withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public MySQLTransaction withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 线程ID
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public MySQLTransaction withRequestType(String requestType) {
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

    public MySQLTransaction withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务ID
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public MySQLTransaction withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 涉及表
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public MySQLTransaction withWaitingLock(String waitingLock) {
        this.waitingLock = waitingLock;
        return this;
    }

    /**
     * 等待锁
     * @return waitingLock
     */
    public String getWaitingLock() {
        return waitingLock;
    }

    public void setWaitingLock(String waitingLock) {
        this.waitingLock = waitingLock;
    }

    public MySQLTransaction withWaitingLockIndex(String waitingLockIndex) {
        this.waitingLockIndex = waitingLockIndex;
        return this;
    }

    /**
     * 等待锁索引名
     * @return waitingLockIndex
     */
    public String getWaitingLockIndex() {
        return waitingLockIndex;
    }

    public void setWaitingLockIndex(String waitingLockIndex) {
        this.waitingLockIndex = waitingLockIndex;
    }

    public MySQLTransaction withWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
        return this;
    }

    /**
     * 等待锁索引类型
     * @return waitingLockType
     */
    public String getWaitingLockType() {
        return waitingLockType;
    }

    public void setWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
    }

    public MySQLTransaction withHoldingLock(String holdingLock) {
        this.holdingLock = holdingLock;
        return this;
    }

    /**
     * 持有锁
     * @return holdingLock
     */
    public String getHoldingLock() {
        return holdingLock;
    }

    public void setHoldingLock(String holdingLock) {
        this.holdingLock = holdingLock;
    }

    public MySQLTransaction withHoldingLockIndex(String holdingLockIndex) {
        this.holdingLockIndex = holdingLockIndex;
        return this;
    }

    /**
     * 持有锁索引
     * @return holdingLockIndex
     */
    public String getHoldingLockIndex() {
        return holdingLockIndex;
    }

    public void setHoldingLockIndex(String holdingLockIndex) {
        this.holdingLockIndex = holdingLockIndex;
    }

    public MySQLTransaction withHoldingLockType(String holdingLockType) {
        this.holdingLockType = holdingLockType;
        return this;
    }

    /**
     * 持有锁索引类型
     * @return holdingLockType
     */
    public String getHoldingLockType() {
        return holdingLockType;
    }

    public void setHoldingLockType(String holdingLockType) {
        this.holdingLockType = holdingLockType;
    }

    public MySQLTransaction withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * SQL语句
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MySQLTransaction that = (MySQLTransaction) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.threadId, that.threadId)
            && Objects.equals(this.requestType, that.requestType)
            && Objects.equals(this.transactionId, that.transactionId) && Objects.equals(this.table, that.table)
            && Objects.equals(this.waitingLock, that.waitingLock)
            && Objects.equals(this.waitingLockIndex, that.waitingLockIndex)
            && Objects.equals(this.waitingLockType, that.waitingLockType)
            && Objects.equals(this.holdingLock, that.holdingLock)
            && Objects.equals(this.holdingLockIndex, that.holdingLockIndex)
            && Objects.equals(this.holdingLockType, that.holdingLockType) && Objects.equals(this.sql, that.sql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId,
            threadId,
            requestType,
            transactionId,
            table,
            waitingLock,
            waitingLockIndex,
            waitingLockType,
            holdingLock,
            holdingLockIndex,
            holdingLockType,
            sql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MySQLTransaction {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    waitingLock: ").append(toIndentedString(waitingLock)).append("\n");
        sb.append("    waitingLockIndex: ").append(toIndentedString(waitingLockIndex)).append("\n");
        sb.append("    waitingLockType: ").append(toIndentedString(waitingLockType)).append("\n");
        sb.append("    holdingLock: ").append(toIndentedString(holdingLock)).append("\n");
        sb.append("    holdingLockIndex: ").append(toIndentedString(holdingLockIndex)).append("\n");
        sb.append("    holdingLockType: ").append(toIndentedString(holdingLockType)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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
