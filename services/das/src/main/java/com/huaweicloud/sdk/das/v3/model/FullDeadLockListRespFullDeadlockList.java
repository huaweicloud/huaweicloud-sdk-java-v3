package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * FullDeadLockListRespFullDeadlockList
 */
public class FullDeadLockListRespFullDeadlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happen_time")

    private Long happenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_deadlock")

    private FullDeadLockListRespMysqlDeadlock mysqlDeadlock;

    public FullDeadLockListRespFullDeadlockList withHappenTime(Long happenTime) {
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

    public FullDeadLockListRespFullDeadlockList withMysqlDeadlock(FullDeadLockListRespMysqlDeadlock mysqlDeadlock) {
        this.mysqlDeadlock = mysqlDeadlock;
        return this;
    }

    public FullDeadLockListRespFullDeadlockList withMysqlDeadlock(
        Consumer<FullDeadLockListRespMysqlDeadlock> mysqlDeadlockSetter) {
        if (this.mysqlDeadlock == null) {
            this.mysqlDeadlock = new FullDeadLockListRespMysqlDeadlock();
            mysqlDeadlockSetter.accept(this.mysqlDeadlock);
        }

        return this;
    }

    /**
     * Get mysqlDeadlock
     * @return mysqlDeadlock
     */
    public FullDeadLockListRespMysqlDeadlock getMysqlDeadlock() {
        return mysqlDeadlock;
    }

    public void setMysqlDeadlock(FullDeadLockListRespMysqlDeadlock mysqlDeadlock) {
        this.mysqlDeadlock = mysqlDeadlock;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullDeadLockListRespFullDeadlockList that = (FullDeadLockListRespFullDeadlockList) obj;
        return Objects.equals(this.happenTime, that.happenTime)
            && Objects.equals(this.mysqlDeadlock, that.mysqlDeadlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(happenTime, mysqlDeadlock);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullDeadLockListRespFullDeadlockList {\n");
        sb.append("    happenTime: ").append(toIndentedString(happenTime)).append("\n");
        sb.append("    mysqlDeadlock: ").append(toIndentedString(mysqlDeadlock)).append("\n");
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
