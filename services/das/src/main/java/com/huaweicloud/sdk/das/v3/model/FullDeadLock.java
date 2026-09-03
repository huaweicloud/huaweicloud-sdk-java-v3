package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 全量死锁信息
 */
public class FullDeadLock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happen_time")

    private Long happenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_lock_id")

    private String deadLockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_dead_lock")

    private MySQLDeadLock mysqlDeadLock;

    public FullDeadLock withHappenTime(Long happenTime) {
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

    public FullDeadLock withDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
        return this;
    }

    /**
     * 死锁ID
     * @return deadLockId
     */
    public String getDeadLockId() {
        return deadLockId;
    }

    public void setDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
    }

    public FullDeadLock withMysqlDeadLock(MySQLDeadLock mysqlDeadLock) {
        this.mysqlDeadLock = mysqlDeadLock;
        return this;
    }

    public FullDeadLock withMysqlDeadLock(Consumer<MySQLDeadLock> mysqlDeadLockSetter) {
        if (this.mysqlDeadLock == null) {
            this.mysqlDeadLock = new MySQLDeadLock();
            mysqlDeadLockSetter.accept(this.mysqlDeadLock);
        }

        return this;
    }

    /**
     * Get mysqlDeadLock
     * @return mysqlDeadLock
     */
    public MySQLDeadLock getMysqlDeadLock() {
        return mysqlDeadLock;
    }

    public void setMysqlDeadLock(MySQLDeadLock mysqlDeadLock) {
        this.mysqlDeadLock = mysqlDeadLock;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullDeadLock that = (FullDeadLock) obj;
        return Objects.equals(this.happenTime, that.happenTime) && Objects.equals(this.deadLockId, that.deadLockId)
            && Objects.equals(this.mysqlDeadLock, that.mysqlDeadLock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(happenTime, deadLockId, mysqlDeadLock);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullDeadLock {\n");
        sb.append("    happenTime: ").append(toIndentedString(happenTime)).append("\n");
        sb.append("    deadLockId: ").append(toIndentedString(deadLockId)).append("\n");
        sb.append("    mysqlDeadLock: ").append(toIndentedString(mysqlDeadLock)).append("\n");
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
