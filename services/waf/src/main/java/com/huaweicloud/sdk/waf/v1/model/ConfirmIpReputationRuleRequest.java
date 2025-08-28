package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ConfirmIpReputationRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    public ConfirmIpReputationRuleRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** policyid **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** ''
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ConfirmIpReputationRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释：** geoipRuleId **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** ''
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmIpReputationRuleRequest that = (ConfirmIpReputationRuleRequest) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.ruleId, that.ruleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, ruleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmIpReputationRuleRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
