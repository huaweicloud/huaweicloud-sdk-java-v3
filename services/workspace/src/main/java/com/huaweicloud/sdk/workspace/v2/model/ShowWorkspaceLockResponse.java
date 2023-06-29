package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowWorkspaceLockResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_lock")

    private Integer isLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_reason")

    private String lockReason;

    public ShowWorkspaceLockResponse withIsLock(Integer isLock) {
        this.isLock = isLock;
        return this;
    }

    /**
     * 云办公服务是否被锁定，0代表未锁定，1代表锁定。
     * @return isLock
     */
    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public ShowWorkspaceLockResponse withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 云办公服务锁定时间，格式：yyyy-MM-dd HH:mm:ss，时区：UTC。
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public ShowWorkspaceLockResponse withLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }

    /**
     * 云办公服务锁定原因。
     * @return lockReason
     */
    public String getLockReason() {
        return lockReason;
    }

    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkspaceLockResponse that = (ShowWorkspaceLockResponse) obj;
        return Objects.equals(this.isLock, that.isLock) && Objects.equals(this.lockTime, that.lockTime)
            && Objects.equals(this.lockReason, that.lockReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLock, lockTime, lockReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkspaceLockResponse {\n");
        sb.append("    isLock: ").append(toIndentedString(isLock)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
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
