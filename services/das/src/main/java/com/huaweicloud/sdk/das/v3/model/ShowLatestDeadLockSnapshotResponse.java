package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLatestDeadLockSnapshotResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_dead_lock")

    private QueryLatestDeadLockRespMysqlDeadLock mysqlDeadLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_lock")

    private Boolean findLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happen_time")

    private Integer happenTime;

    public ShowLatestDeadLockSnapshotResponse withMysqlDeadLock(QueryLatestDeadLockRespMysqlDeadLock mysqlDeadLock) {
        this.mysqlDeadLock = mysqlDeadLock;
        return this;
    }

    public ShowLatestDeadLockSnapshotResponse withMysqlDeadLock(
        Consumer<QueryLatestDeadLockRespMysqlDeadLock> mysqlDeadLockSetter) {
        if (this.mysqlDeadLock == null) {
            this.mysqlDeadLock = new QueryLatestDeadLockRespMysqlDeadLock();
            mysqlDeadLockSetter.accept(this.mysqlDeadLock);
        }

        return this;
    }

    /**
     * Get mysqlDeadLock
     * @return mysqlDeadLock
     */
    public QueryLatestDeadLockRespMysqlDeadLock getMysqlDeadLock() {
        return mysqlDeadLock;
    }

    public void setMysqlDeadLock(QueryLatestDeadLockRespMysqlDeadLock mysqlDeadLock) {
        this.mysqlDeadLock = mysqlDeadLock;
    }

    public ShowLatestDeadLockSnapshotResponse withFindLock(Boolean findLock) {
        this.findLock = findLock;
        return this;
    }

    /**
     * 表示系统是否成功检测到死锁事件
     * @return findLock
     */
    public Boolean getFindLock() {
        return findLock;
    }

    public void setFindLock(Boolean findLock) {
        this.findLock = findLock;
    }

    public ShowLatestDeadLockSnapshotResponse withHappenTime(Integer happenTime) {
        this.happenTime = happenTime;
        return this;
    }

    /**
     * 死锁事件发生的 Unix 时间戳
     * @return happenTime
     */
    public Integer getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Integer happenTime) {
        this.happenTime = happenTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLatestDeadLockSnapshotResponse that = (ShowLatestDeadLockSnapshotResponse) obj;
        return Objects.equals(this.mysqlDeadLock, that.mysqlDeadLock) && Objects.equals(this.findLock, that.findLock)
            && Objects.equals(this.happenTime, that.happenTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mysqlDeadLock, findLock, happenTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLatestDeadLockSnapshotResponse {\n");
        sb.append("    mysqlDeadLock: ").append(toIndentedString(mysqlDeadLock)).append("\n");
        sb.append("    findLock: ").append(toIndentedString(findLock)).append("\n");
        sb.append("    happenTime: ").append(toIndentedString(happenTime)).append("\n");
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
