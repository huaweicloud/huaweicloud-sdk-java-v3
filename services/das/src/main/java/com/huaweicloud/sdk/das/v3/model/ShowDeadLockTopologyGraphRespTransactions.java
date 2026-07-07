package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowDeadLockTopologyGraphRespTransactions
 */
public class ShowDeadLockTopologyGraphRespTransactions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private Long threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_target")

    private Boolean rollbackTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_lock_count")

    private Long rowLockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "undo_log_entries")

    private Long undoLogEntries;

    public ShowDeadLockTopologyGraphRespTransactions withTransactionId(String transactionId) {
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

    public ShowDeadLockTopologyGraphRespTransactions withThreadId(Long threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 线程ID
     * @return threadId
     */
    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public ShowDeadLockTopologyGraphRespTransactions withRollbackTarget(Boolean rollbackTarget) {
        this.rollbackTarget = rollbackTarget;
        return this;
    }

    /**
     * 是否被回滚
     * @return rollbackTarget
     */
    public Boolean getRollbackTarget() {
        return rollbackTarget;
    }

    public void setRollbackTarget(Boolean rollbackTarget) {
        this.rollbackTarget = rollbackTarget;
    }

    public ShowDeadLockTopologyGraphRespTransactions withSql(String sql) {
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

    public ShowDeadLockTopologyGraphRespTransactions withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 操作的表名
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public ShowDeadLockTopologyGraphRespTransactions withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作类型
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ShowDeadLockTopologyGraphRespTransactions withRowLockCount(Long rowLockCount) {
        this.rowLockCount = rowLockCount;
        return this;
    }

    /**
     * 行锁数量
     * @return rowLockCount
     */
    public Long getRowLockCount() {
        return rowLockCount;
    }

    public void setRowLockCount(Long rowLockCount) {
        this.rowLockCount = rowLockCount;
    }

    public ShowDeadLockTopologyGraphRespTransactions withUndoLogEntries(Long undoLogEntries) {
        this.undoLogEntries = undoLogEntries;
        return this;
    }

    /**
     * Undo日志条数
     * @return undoLogEntries
     */
    public Long getUndoLogEntries() {
        return undoLogEntries;
    }

    public void setUndoLogEntries(Long undoLogEntries) {
        this.undoLogEntries = undoLogEntries;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockTopologyGraphRespTransactions that = (ShowDeadLockTopologyGraphRespTransactions) obj;
        return Objects.equals(this.transactionId, that.transactionId) && Objects.equals(this.threadId, that.threadId)
            && Objects.equals(this.rollbackTarget, that.rollbackTarget) && Objects.equals(this.sql, that.sql)
            && Objects.equals(this.table, that.table) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.rowLockCount, that.rowLockCount)
            && Objects.equals(this.undoLogEntries, that.undoLogEntries);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(transactionId, threadId, rollbackTarget, sql, table, operator, rowLockCount, undoLogEntries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockTopologyGraphRespTransactions {\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    rollbackTarget: ").append(toIndentedString(rollbackTarget)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    rowLockCount: ").append(toIndentedString(rowLockCount)).append("\n");
        sb.append("    undoLogEntries: ").append(toIndentedString(undoLogEntries)).append("\n");
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
