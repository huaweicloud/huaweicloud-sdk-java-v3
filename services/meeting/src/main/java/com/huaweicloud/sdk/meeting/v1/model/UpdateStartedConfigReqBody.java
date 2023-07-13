package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改会议配置请求。
 */
public class UpdateStartedConfigReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockSharing")

    private Integer lockSharing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callInRestriction")

    private Integer callInRestriction;

    public UpdateStartedConfigReqBody withLockSharing(Integer lockSharing) {
        this.lockSharing = lockSharing;
        return this;
    }

    /**
     * 锁定共享标志位。 * 0: 不锁定 * 1: 锁定 
     * minimum: 0
     * maximum: 1
     * @return lockSharing
     */
    public Integer getLockSharing() {
        return lockSharing;
    }

    public void setLockSharing(Integer lockSharing) {
        this.lockSharing = lockSharing;
    }

    public UpdateStartedConfigReqBody withCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
        return this;
    }

    /**
     * 允许加入会议的范围。 - 0: 所有用户 - 2: 企业内用户 - 3: 被邀请用户 
     * minimum: 0
     * maximum: 3
     * @return callInRestriction
     */
    public Integer getCallInRestriction() {
        return callInRestriction;
    }

    public void setCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateStartedConfigReqBody that = (UpdateStartedConfigReqBody) obj;
        return Objects.equals(this.lockSharing, that.lockSharing)
            && Objects.equals(this.callInRestriction, that.callInRestriction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockSharing, callInRestriction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStartedConfigReqBody {\n");
        sb.append("    lockSharing: ").append(toIndentedString(lockSharing)).append("\n");
        sb.append("    callInRestriction: ").append(toIndentedString(callInRestriction)).append("\n");
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
