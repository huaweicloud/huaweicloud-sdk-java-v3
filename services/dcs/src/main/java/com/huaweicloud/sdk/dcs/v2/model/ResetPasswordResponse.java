package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ResetPasswordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_times_left")

    private String retryTimesLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time_left")

    private String lockTimeLeft;

    public ResetPasswordResponse withRetryTimesLeft(String retryTimesLeft) {
        this.retryTimesLeft = retryTimesLeft;
        return this;
    }

    /**
     * 密码验证剩余次数
     * @return retryTimesLeft
     */
    public String getRetryTimesLeft() {
        return retryTimesLeft;
    }

    public void setRetryTimesLeft(String retryTimesLeft) {
        this.retryTimesLeft = retryTimesLeft;
    }

    public ResetPasswordResponse withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 锁定时间
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public ResetPasswordResponse withLockTimeLeft(String lockTimeLeft) {
        this.lockTimeLeft = lockTimeLeft;
        return this;
    }

    /**
     * 锁定剩余时间
     * @return lockTimeLeft
     */
    public String getLockTimeLeft() {
        return lockTimeLeft;
    }

    public void setLockTimeLeft(String lockTimeLeft) {
        this.lockTimeLeft = lockTimeLeft;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetPasswordResponse that = (ResetPasswordResponse) obj;
        return Objects.equals(this.retryTimesLeft, that.retryTimesLeft) && Objects.equals(this.lockTime, that.lockTime)
            && Objects.equals(this.lockTimeLeft, that.lockTimeLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retryTimesLeft, lockTime, lockTimeLeft);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPasswordResponse {\n");
        sb.append("    retryTimesLeft: ").append(toIndentedString(retryTimesLeft)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    lockTimeLeft: ").append(toIndentedString(lockTimeLeft)).append("\n");
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
