package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 为IAM委托授予高风险系统身份策略分析详细结果。
 */
public class IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    public IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 委托的唯一标识符（ID）。
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails withPolicyName(String policyName) {
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
        IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails that =
            (IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails) obj;
        return Objects.equals(this.agencyId, that.agencyId) && Objects.equals(this.policyName, that.policyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyId, policyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails {\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
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
