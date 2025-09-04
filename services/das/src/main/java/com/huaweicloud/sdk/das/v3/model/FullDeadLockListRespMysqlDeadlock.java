package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 死锁事件详细信息
 */
public class FullDeadLockListRespMysqlDeadlock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw")

    private String raw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happen_time")

    private Long happenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_trx_id")

    private String rollbackTrxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_transactions")

    private List<FullDeadLockListRespMysqlDeadlockMysqlTransactions> mysqlTransactions = null;

    public FullDeadLockListRespMysqlDeadlock withRaw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * 死锁事件详细信息
     * @return raw
     */
    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public FullDeadLockListRespMysqlDeadlock withHappenTime(Long happenTime) {
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

    public FullDeadLockListRespMysqlDeadlock withRollbackTrxId(String rollbackTrxId) {
        this.rollbackTrxId = rollbackTrxId;
        return this;
    }

    /**
     * MySQL InnoDB 引擎在检测到死锁后，会自动选择一个事务进行回滚以解除死锁。
     * @return rollbackTrxId
     */
    public String getRollbackTrxId() {
        return rollbackTrxId;
    }

    public void setRollbackTrxId(String rollbackTrxId) {
        this.rollbackTrxId = rollbackTrxId;
    }

    public FullDeadLockListRespMysqlDeadlock withMysqlTransactions(
        List<FullDeadLockListRespMysqlDeadlockMysqlTransactions> mysqlTransactions) {
        this.mysqlTransactions = mysqlTransactions;
        return this;
    }

    public FullDeadLockListRespMysqlDeadlock addMysqlTransactionsItem(
        FullDeadLockListRespMysqlDeadlockMysqlTransactions mysqlTransactionsItem) {
        if (this.mysqlTransactions == null) {
            this.mysqlTransactions = new ArrayList<>();
        }
        this.mysqlTransactions.add(mysqlTransactionsItem);
        return this;
    }

    public FullDeadLockListRespMysqlDeadlock withMysqlTransactions(
        Consumer<List<FullDeadLockListRespMysqlDeadlockMysqlTransactions>> mysqlTransactionsSetter) {
        if (this.mysqlTransactions == null) {
            this.mysqlTransactions = new ArrayList<>();
        }
        mysqlTransactionsSetter.accept(this.mysqlTransactions);
        return this;
    }

    /**
     * 参与这次死锁的每个事务的详细结构化信息
     * @return mysqlTransactions
     */
    public List<FullDeadLockListRespMysqlDeadlockMysqlTransactions> getMysqlTransactions() {
        return mysqlTransactions;
    }

    public void setMysqlTransactions(List<FullDeadLockListRespMysqlDeadlockMysqlTransactions> mysqlTransactions) {
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
        FullDeadLockListRespMysqlDeadlock that = (FullDeadLockListRespMysqlDeadlock) obj;
        return Objects.equals(this.raw, that.raw) && Objects.equals(this.happenTime, that.happenTime)
            && Objects.equals(this.rollbackTrxId, that.rollbackTrxId)
            && Objects.equals(this.mysqlTransactions, that.mysqlTransactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raw, happenTime, rollbackTrxId, mysqlTransactions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullDeadLockListRespMysqlDeadlock {\n");
        sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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
