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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_message")

    private String extMessage;

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

    public ResetPasswordResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 重置密码结果编号。 **取值范围**： - 1：重置密码成功。 - 3：实例被锁定。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ResetPasswordResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**： 重置密码结果信息。 **取值范围**： - success - instance is locked 
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResetPasswordResponse withExtMessage(String extMessage) {
        this.extMessage = extMessage;
        return this;
    }

    /**
     * **参数解释**： 重置密码错误信息，若重置密码成功，则为null。 **取值范围**： 不涉及。 
     * @return extMessage
     */
    public String getExtMessage() {
        return extMessage;
    }

    public void setExtMessage(String extMessage) {
        this.extMessage = extMessage;
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
            && Objects.equals(this.lockTimeLeft, that.lockTimeLeft) && Objects.equals(this.code, that.code)
            && Objects.equals(this.message, that.message) && Objects.equals(this.extMessage, that.extMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retryTimesLeft, lockTime, lockTimeLeft, code, message, extMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPasswordResponse {\n");
        sb.append("    retryTimesLeft: ").append(toIndentedString(retryTimesLeft)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    lockTimeLeft: ").append(toIndentedString(lockTimeLeft)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    extMessage: ").append(toIndentedString(extMessage)).append("\n");
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
