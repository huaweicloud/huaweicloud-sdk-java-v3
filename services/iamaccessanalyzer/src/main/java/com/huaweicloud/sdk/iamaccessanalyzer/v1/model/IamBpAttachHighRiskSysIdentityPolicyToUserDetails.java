package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 为IAM用户授予高风险系统身份策略分析详细结果。
 */
public class IamBpAttachHighRiskSysIdentityPolicyToUserDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    public IamBpAttachHighRiskSysIdentityPolicyToUserDetails withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户的唯一标识符（ID）。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public IamBpAttachHighRiskSysIdentityPolicyToUserDetails withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IamBpAttachHighRiskSysIdentityPolicyToUserDetails that =
            (IamBpAttachHighRiskSysIdentityPolicyToUserDetails) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.policyName, that.policyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, policyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IamBpAttachHighRiskSysIdentityPolicyToUserDetails {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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
