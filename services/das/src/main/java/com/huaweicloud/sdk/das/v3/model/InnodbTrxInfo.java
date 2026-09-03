package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InnoDB事务信息
 */
public class InnodbTrxInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id")

    private String trxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_state")

    private String trxState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_started")

    private String trxStarted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_started_timestamp")

    private Long trxStartedTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_requested_lock_id")

    private String trxRequestedLockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_wait_started")

    private String trxWaitStarted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_wait_started_timestamp")

    private Long trxWaitStartedTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_weight")

    private String trxWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_mysql_thread_id")

    private String trxMysqlThreadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_query")

    private String trxQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_operation_state")

    private String trxOperationState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_tables_in_use")

    private String trxTablesInUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_tables_locked")

    private String trxTablesLocked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_lock_structs")

    private String trxLockStructs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_lock_memory_bytes")

    private String trxLockMemoryBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_rows_locked")

    private String trxRowsLocked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_rows_modified")

    private String trxRowsModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_concurrency_tickets")

    private String trxConcurrencyTickets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_isolation_level")

    private String trxIsolationLevel;

    public InnodbTrxInfo withTrxId(String trxId) {
        this.trxId = trxId;
        return this;
    }

    /**
     * 事务ID
     * @return trxId
     */
    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public InnodbTrxInfo withTrxState(String trxState) {
        this.trxState = trxState;
        return this;
    }

    /**
     * 事务状态
     * @return trxState
     */
    public String getTrxState() {
        return trxState;
    }

    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    public InnodbTrxInfo withTrxStarted(String trxStarted) {
        this.trxStarted = trxStarted;
        return this;
    }

    /**
     * 事务开始时间
     * @return trxStarted
     */
    public String getTrxStarted() {
        return trxStarted;
    }

    public void setTrxStarted(String trxStarted) {
        this.trxStarted = trxStarted;
    }

    public InnodbTrxInfo withTrxStartedTimestamp(Long trxStartedTimestamp) {
        this.trxStartedTimestamp = trxStartedTimestamp;
        return this;
    }

    /**
     * 事务开始时间戳
     * @return trxStartedTimestamp
     */
    public Long getTrxStartedTimestamp() {
        return trxStartedTimestamp;
    }

    public void setTrxStartedTimestamp(Long trxStartedTimestamp) {
        this.trxStartedTimestamp = trxStartedTimestamp;
    }

    public InnodbTrxInfo withTrxRequestedLockId(String trxRequestedLockId) {
        this.trxRequestedLockId = trxRequestedLockId;
        return this;
    }

    /**
     * 事务当前正在等待锁的Id
     * @return trxRequestedLockId
     */
    public String getTrxRequestedLockId() {
        return trxRequestedLockId;
    }

    public void setTrxRequestedLockId(String trxRequestedLockId) {
        this.trxRequestedLockId = trxRequestedLockId;
    }

    public InnodbTrxInfo withTrxWaitStarted(String trxWaitStarted) {
        this.trxWaitStarted = trxWaitStarted;
        return this;
    }

    /**
     * 事务开始等待时间
     * @return trxWaitStarted
     */
    public String getTrxWaitStarted() {
        return trxWaitStarted;
    }

    public void setTrxWaitStarted(String trxWaitStarted) {
        this.trxWaitStarted = trxWaitStarted;
    }

    public InnodbTrxInfo withTrxWaitStartedTimestamp(Long trxWaitStartedTimestamp) {
        this.trxWaitStartedTimestamp = trxWaitStartedTimestamp;
        return this;
    }

    /**
     * 事务开始等待时间戳
     * @return trxWaitStartedTimestamp
     */
    public Long getTrxWaitStartedTimestamp() {
        return trxWaitStartedTimestamp;
    }

    public void setTrxWaitStartedTimestamp(Long trxWaitStartedTimestamp) {
        this.trxWaitStartedTimestamp = trxWaitStartedTimestamp;
    }

    public InnodbTrxInfo withTrxWeight(String trxWeight) {
        this.trxWeight = trxWeight;
        return this;
    }

    /**
     * 事务权重
     * @return trxWeight
     */
    public String getTrxWeight() {
        return trxWeight;
    }

    public void setTrxWeight(String trxWeight) {
        this.trxWeight = trxWeight;
    }

    public InnodbTrxInfo withTrxMysqlThreadId(String trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
        return this;
    }

    /**
     * 会话ID
     * @return trxMysqlThreadId
     */
    public String getTrxMysqlThreadId() {
        return trxMysqlThreadId;
    }

    public void setTrxMysqlThreadId(String trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
    }

    public InnodbTrxInfo withTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
        return this;
    }

    /**
     * 事务正在执行的SQL语句
     * @return trxQuery
     */
    public String getTrxQuery() {
        return trxQuery;
    }

    public void setTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
    }

    public InnodbTrxInfo withTrxOperationState(String trxOperationState) {
        this.trxOperationState = trxOperationState;
        return this;
    }

    /**
     * 事务当前操作状态
     * @return trxOperationState
     */
    public String getTrxOperationState() {
        return trxOperationState;
    }

    public void setTrxOperationState(String trxOperationState) {
        this.trxOperationState = trxOperationState;
    }

    public InnodbTrxInfo withTrxTablesInUse(String trxTablesInUse) {
        this.trxTablesInUse = trxTablesInUse;
        return this;
    }

    /**
     * 当前事务执行的SQL中使用的表个数
     * @return trxTablesInUse
     */
    public String getTrxTablesInUse() {
        return trxTablesInUse;
    }

    public void setTrxTablesInUse(String trxTablesInUse) {
        this.trxTablesInUse = trxTablesInUse;
    }

    public InnodbTrxInfo withTrxTablesLocked(String trxTablesLocked) {
        this.trxTablesLocked = trxTablesLocked;
        return this;
    }

    /**
     * 当前执行SQL的行锁数量
     * @return trxTablesLocked
     */
    public String getTrxTablesLocked() {
        return trxTablesLocked;
    }

    public void setTrxTablesLocked(String trxTablesLocked) {
        this.trxTablesLocked = trxTablesLocked;
    }

    public InnodbTrxInfo withTrxLockStructs(String trxLockStructs) {
        this.trxLockStructs = trxLockStructs;
        return this;
    }

    /**
     * 事务保留的锁数量
     * @return trxLockStructs
     */
    public String getTrxLockStructs() {
        return trxLockStructs;
    }

    public void setTrxLockStructs(String trxLockStructs) {
        this.trxLockStructs = trxLockStructs;
    }

    public InnodbTrxInfo withTrxLockMemoryBytes(String trxLockMemoryBytes) {
        this.trxLockMemoryBytes = trxLockMemoryBytes;
        return this;
    }

    /**
     * 事务锁住的内存大小
     * @return trxLockMemoryBytes
     */
    public String getTrxLockMemoryBytes() {
        return trxLockMemoryBytes;
    }

    public void setTrxLockMemoryBytes(String trxLockMemoryBytes) {
        this.trxLockMemoryBytes = trxLockMemoryBytes;
    }

    public InnodbTrxInfo withTrxRowsLocked(String trxRowsLocked) {
        this.trxRowsLocked = trxRowsLocked;
        return this;
    }

    /**
     * 事务锁住的行记录数
     * @return trxRowsLocked
     */
    public String getTrxRowsLocked() {
        return trxRowsLocked;
    }

    public void setTrxRowsLocked(String trxRowsLocked) {
        this.trxRowsLocked = trxRowsLocked;
    }

    public InnodbTrxInfo withTrxRowsModified(String trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
        return this;
    }

    /**
     * 事务更改的行数
     * @return trxRowsModified
     */
    public String getTrxRowsModified() {
        return trxRowsModified;
    }

    public void setTrxRowsModified(String trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
    }

    public InnodbTrxInfo withTrxConcurrencyTickets(String trxConcurrencyTickets) {
        this.trxConcurrencyTickets = trxConcurrencyTickets;
        return this;
    }

    /**
     * 事务并发票数
     * @return trxConcurrencyTickets
     */
    public String getTrxConcurrencyTickets() {
        return trxConcurrencyTickets;
    }

    public void setTrxConcurrencyTickets(String trxConcurrencyTickets) {
        this.trxConcurrencyTickets = trxConcurrencyTickets;
    }

    public InnodbTrxInfo withTrxIsolationLevel(String trxIsolationLevel) {
        this.trxIsolationLevel = trxIsolationLevel;
        return this;
    }

    /**
     * 事务隔离级别
     * @return trxIsolationLevel
     */
    public String getTrxIsolationLevel() {
        return trxIsolationLevel;
    }

    public void setTrxIsolationLevel(String trxIsolationLevel) {
        this.trxIsolationLevel = trxIsolationLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InnodbTrxInfo that = (InnodbTrxInfo) obj;
        return Objects.equals(this.trxId, that.trxId) && Objects.equals(this.trxState, that.trxState)
            && Objects.equals(this.trxStarted, that.trxStarted)
            && Objects.equals(this.trxStartedTimestamp, that.trxStartedTimestamp)
            && Objects.equals(this.trxRequestedLockId, that.trxRequestedLockId)
            && Objects.equals(this.trxWaitStarted, that.trxWaitStarted)
            && Objects.equals(this.trxWaitStartedTimestamp, that.trxWaitStartedTimestamp)
            && Objects.equals(this.trxWeight, that.trxWeight)
            && Objects.equals(this.trxMysqlThreadId, that.trxMysqlThreadId)
            && Objects.equals(this.trxQuery, that.trxQuery)
            && Objects.equals(this.trxOperationState, that.trxOperationState)
            && Objects.equals(this.trxTablesInUse, that.trxTablesInUse)
            && Objects.equals(this.trxTablesLocked, that.trxTablesLocked)
            && Objects.equals(this.trxLockStructs, that.trxLockStructs)
            && Objects.equals(this.trxLockMemoryBytes, that.trxLockMemoryBytes)
            && Objects.equals(this.trxRowsLocked, that.trxRowsLocked)
            && Objects.equals(this.trxRowsModified, that.trxRowsModified)
            && Objects.equals(this.trxConcurrencyTickets, that.trxConcurrencyTickets)
            && Objects.equals(this.trxIsolationLevel, that.trxIsolationLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trxId,
            trxState,
            trxStarted,
            trxStartedTimestamp,
            trxRequestedLockId,
            trxWaitStarted,
            trxWaitStartedTimestamp,
            trxWeight,
            trxMysqlThreadId,
            trxQuery,
            trxOperationState,
            trxTablesInUse,
            trxTablesLocked,
            trxLockStructs,
            trxLockMemoryBytes,
            trxRowsLocked,
            trxRowsModified,
            trxConcurrencyTickets,
            trxIsolationLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InnodbTrxInfo {\n");
        sb.append("    trxId: ").append(toIndentedString(trxId)).append("\n");
        sb.append("    trxState: ").append(toIndentedString(trxState)).append("\n");
        sb.append("    trxStarted: ").append(toIndentedString(trxStarted)).append("\n");
        sb.append("    trxStartedTimestamp: ").append(toIndentedString(trxStartedTimestamp)).append("\n");
        sb.append("    trxRequestedLockId: ").append(toIndentedString(trxRequestedLockId)).append("\n");
        sb.append("    trxWaitStarted: ").append(toIndentedString(trxWaitStarted)).append("\n");
        sb.append("    trxWaitStartedTimestamp: ").append(toIndentedString(trxWaitStartedTimestamp)).append("\n");
        sb.append("    trxWeight: ").append(toIndentedString(trxWeight)).append("\n");
        sb.append("    trxMysqlThreadId: ").append(toIndentedString(trxMysqlThreadId)).append("\n");
        sb.append("    trxQuery: ").append(toIndentedString(trxQuery)).append("\n");
        sb.append("    trxOperationState: ").append(toIndentedString(trxOperationState)).append("\n");
        sb.append("    trxTablesInUse: ").append(toIndentedString(trxTablesInUse)).append("\n");
        sb.append("    trxTablesLocked: ").append(toIndentedString(trxTablesLocked)).append("\n");
        sb.append("    trxLockStructs: ").append(toIndentedString(trxLockStructs)).append("\n");
        sb.append("    trxLockMemoryBytes: ").append(toIndentedString(trxLockMemoryBytes)).append("\n");
        sb.append("    trxRowsLocked: ").append(toIndentedString(trxRowsLocked)).append("\n");
        sb.append("    trxRowsModified: ").append(toIndentedString(trxRowsModified)).append("\n");
        sb.append("    trxConcurrencyTickets: ").append(toIndentedString(trxConcurrencyTickets)).append("\n");
        sb.append("    trxIsolationLevel: ").append(toIndentedString(trxIsolationLevel)).append("\n");
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
