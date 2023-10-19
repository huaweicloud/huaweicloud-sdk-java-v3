package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ResetAclAccountPassWordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time_left")

    private String lockTimeLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_times_left")

    private String retryTimesLeft;

    public ResetAclAccountPassWordResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 任务执行成功代码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ResetAclAccountPassWordResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 重置结果说明信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResetAclAccountPassWordResponse withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 锁定时间。验证失败时和锁定时该参数返回不为null
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public ResetAclAccountPassWordResponse withLockTimeLeft(String lockTimeLeft) {
        this.lockTimeLeft = lockTimeLeft;
        return this;
    }

    /**
     * 锁定剩余时间。锁定时该参数返回不为null
     * @return lockTimeLeft
     */
    public String getLockTimeLeft() {
        return lockTimeLeft;
    }

    public void setLockTimeLeft(String lockTimeLeft) {
        this.lockTimeLeft = lockTimeLeft;
    }

    public ResetAclAccountPassWordResponse withRetryTimesLeft(String retryTimesLeft) {
        this.retryTimesLeft = retryTimesLeft;
        return this;
    }

    /**
     * 密码验证剩余次数。验证失败时该参数返回不为null
     * @return retryTimesLeft
     */
    public String getRetryTimesLeft() {
        return retryTimesLeft;
    }

    public void setRetryTimesLeft(String retryTimesLeft) {
        this.retryTimesLeft = retryTimesLeft;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetAclAccountPassWordResponse that = (ResetAclAccountPassWordResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.message, that.message)
            && Objects.equals(this.lockTime, that.lockTime) && Objects.equals(this.lockTimeLeft, that.lockTimeLeft)
            && Objects.equals(this.retryTimesLeft, that.retryTimesLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, lockTime, lockTimeLeft, retryTimesLeft);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetAclAccountPassWordResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    lockTimeLeft: ").append(toIndentedString(lockTimeLeft)).append("\n");
        sb.append("    retryTimesLeft: ").append(toIndentedString(retryTimesLeft)).append("\n");
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
