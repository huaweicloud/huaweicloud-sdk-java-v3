package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLatestDeadLockSnapshot4ApiResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_lock")

    private Boolean findLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happen_time")

    private Long happenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_dead_lock")

    private MySQLLatestDeadLock mysqlDeadLock;

    public ShowLatestDeadLockSnapshot4ApiResponse withFindLock(Boolean findLock) {
        this.findLock = findLock;
        return this;
    }

    /**
     * 是否找到有锁
     * @return findLock
     */
    public Boolean getFindLock() {
        return findLock;
    }

    public void setFindLock(Boolean findLock) {
        this.findLock = findLock;
    }

    public ShowLatestDeadLockSnapshot4ApiResponse withHappenTime(Long happenTime) {
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

    public ShowLatestDeadLockSnapshot4ApiResponse withMysqlDeadLock(MySQLLatestDeadLock mysqlDeadLock) {
        this.mysqlDeadLock = mysqlDeadLock;
        return this;
    }

    public ShowLatestDeadLockSnapshot4ApiResponse withMysqlDeadLock(Consumer<MySQLLatestDeadLock> mysqlDeadLockSetter) {
        if (this.mysqlDeadLock == null) {
            this.mysqlDeadLock = new MySQLLatestDeadLock();
            mysqlDeadLockSetter.accept(this.mysqlDeadLock);
        }

        return this;
    }

    /**
     * Get mysqlDeadLock
     * @return mysqlDeadLock
     */
    public MySQLLatestDeadLock getMysqlDeadLock() {
        return mysqlDeadLock;
    }

    public void setMysqlDeadLock(MySQLLatestDeadLock mysqlDeadLock) {
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
        ShowLatestDeadLockSnapshot4ApiResponse that = (ShowLatestDeadLockSnapshot4ApiResponse) obj;
        return Objects.equals(this.findLock, that.findLock) && Objects.equals(this.happenTime, that.happenTime)
            && Objects.equals(this.mysqlDeadLock, that.mysqlDeadLock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(findLock, happenTime, mysqlDeadLock);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLatestDeadLockSnapshot4ApiResponse {\n");
        sb.append("    findLock: ").append(toIndentedString(findLock)).append("\n");
        sb.append("    happenTime: ").append(toIndentedString(happenTime)).append("\n");
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
