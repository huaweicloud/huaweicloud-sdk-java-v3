package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MySQL死锁内容
 */
public class MySQLLatestDeadLock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw")

    private String raw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happen_time")

    private Long happenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_trx_id")

    private String rollbackTrxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_transactions")

    private List<MySQLTransaction> mysqlTransactions = null;

    public MySQLLatestDeadLock withRaw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * 原始死锁内容
     * @return raw
     */
    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public MySQLLatestDeadLock withHappenTime(Long happenTime) {
        this.happenTime = happenTime;
        return this;
    }

    /**
     * 发生时间（ms）
     * @return happenTime
     */
    public Long getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Long happenTime) {
        this.happenTime = happenTime;
    }

    public MySQLLatestDeadLock withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 死锁时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MySQLLatestDeadLock withRollbackTrxId(String rollbackTrxId) {
        this.rollbackTrxId = rollbackTrxId;
        return this;
    }

    /**
     * 回滚事务ID
     * @return rollbackTrxId
     */
    public String getRollbackTrxId() {
        return rollbackTrxId;
    }

    public void setRollbackTrxId(String rollbackTrxId) {
        this.rollbackTrxId = rollbackTrxId;
    }

    public MySQLLatestDeadLock withMysqlTransactions(List<MySQLTransaction> mysqlTransactions) {
        this.mysqlTransactions = mysqlTransactions;
        return this;
    }

    public MySQLLatestDeadLock addMysqlTransactionsItem(MySQLTransaction mysqlTransactionsItem) {
        if (this.mysqlTransactions == null) {
            this.mysqlTransactions = new ArrayList<>();
        }
        this.mysqlTransactions.add(mysqlTransactionsItem);
        return this;
    }

    public MySQLLatestDeadLock withMysqlTransactions(Consumer<List<MySQLTransaction>> mysqlTransactionsSetter) {
        if (this.mysqlTransactions == null) {
            this.mysqlTransactions = new ArrayList<>();
        }
        mysqlTransactionsSetter.accept(this.mysqlTransactions);
        return this;
    }

    /**
     * 事务列表
     * @return mysqlTransactions
     */
    public List<MySQLTransaction> getMysqlTransactions() {
        return mysqlTransactions;
    }

    public void setMysqlTransactions(List<MySQLTransaction> mysqlTransactions) {
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
        MySQLLatestDeadLock that = (MySQLLatestDeadLock) obj;
        return Objects.equals(this.raw, that.raw) && Objects.equals(this.happenTime, that.happenTime)
            && Objects.equals(this.time, that.time) && Objects.equals(this.rollbackTrxId, that.rollbackTrxId)
            && Objects.equals(this.mysqlTransactions, that.mysqlTransactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raw, happenTime, time, rollbackTrxId, mysqlTransactions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MySQLLatestDeadLock {\n");
        sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
        sb.append("    happenTime: ").append(toIndentedString(happenTime)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
