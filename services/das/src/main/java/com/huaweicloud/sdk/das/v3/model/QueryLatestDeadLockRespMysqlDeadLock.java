package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MySQL 死锁事件的所有详细信息
 */
public class QueryLatestDeadLockRespMysqlDeadLock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw")

    private String raw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happen_time")

    private Long happenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_trx_id")

    private String rollbackTrxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_transactions")

    private List<QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions> mysqlTransactions = null;

    public QueryLatestDeadLockRespMysqlDeadLock withRaw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * 原始的、未经解析的 MySQL 死锁日志文本
     * @return raw
     */
    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public QueryLatestDeadLockRespMysqlDeadLock withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 死锁事件发生的日期和时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public QueryLatestDeadLockRespMysqlDeadLock withHappenTime(Long happenTime) {
        this.happenTime = happenTime;
        return this;
    }

    /**
     * 死锁事件发生的 Unix 时间戳（毫秒级）
     * @return happenTime
     */
    public Long getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Long happenTime) {
        this.happenTime = happenTime;
    }

    public QueryLatestDeadLockRespMysqlDeadLock withRollbackTrxId(String rollbackTrxId) {
        this.rollbackTrxId = rollbackTrxId;
        return this;
    }

    /**
     * MySQL 在检测到死锁后，会自动选择一个事务进行回滚（通常是代价较小的那个）
     * @return rollbackTrxId
     */
    public String getRollbackTrxId() {
        return rollbackTrxId;
    }

    public void setRollbackTrxId(String rollbackTrxId) {
        this.rollbackTrxId = rollbackTrxId;
    }

    public QueryLatestDeadLockRespMysqlDeadLock withMysqlTransactions(
        List<QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions> mysqlTransactions) {
        this.mysqlTransactions = mysqlTransactions;
        return this;
    }

    public QueryLatestDeadLockRespMysqlDeadLock addMysqlTransactionsItem(
        QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions mysqlTransactionsItem) {
        if (this.mysqlTransactions == null) {
            this.mysqlTransactions = new ArrayList<>();
        }
        this.mysqlTransactions.add(mysqlTransactionsItem);
        return this;
    }

    public QueryLatestDeadLockRespMysqlDeadLock withMysqlTransactions(
        Consumer<List<QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions>> mysqlTransactionsSetter) {
        if (this.mysqlTransactions == null) {
            this.mysqlTransactions = new ArrayList<>();
        }
        mysqlTransactionsSetter.accept(this.mysqlTransactions);
        return this;
    }

    /**
     * 参与死锁的每个事务的详细信息
     * @return mysqlTransactions
     */
    public List<QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions> getMysqlTransactions() {
        return mysqlTransactions;
    }

    public void setMysqlTransactions(List<QueryLatestDeadLockRespMysqlDeadLockMysqlTransactions> mysqlTransactions) {
        this.mysqlTransactions = mysqlTransactions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryLatestDeadLockRespMysqlDeadLock that = (QueryLatestDeadLockRespMysqlDeadLock) obj;
        return Objects.equals(this.raw, that.raw) && Objects.equals(this.time, that.time)
            && Objects.equals(this.happenTime, that.happenTime)
            && Objects.equals(this.rollbackTrxId, that.rollbackTrxId)
            && Objects.equals(this.mysqlTransactions, that.mysqlTransactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raw, time, happenTime, rollbackTrxId, mysqlTransactions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryLatestDeadLockRespMysqlDeadLock {\n");
        sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    happenTime: ").append(toIndentedString(happenTime)).append("\n");
        sb.append("    rollbackTrxId: ").append(toIndentedString(rollbackTrxId)).append("\n");
        sb.append("    mysqlTransactions: ").append(toIndentedString(mysqlTransactions)).append("\n");
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
