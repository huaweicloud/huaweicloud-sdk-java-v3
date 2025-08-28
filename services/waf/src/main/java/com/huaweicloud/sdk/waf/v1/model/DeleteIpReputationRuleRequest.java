package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteIpReputationRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    public DeleteIpReputationRuleRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 您可以通过调用企业项目管理服务（EPS)的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DeleteIpReputationRuleRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** 防护策略id，您可以通过调用查询防护策略列表（ListPolicy）获取策略id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public DeleteIpReputationRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释：** 机房IP情报访问控制规则id，通过查询机房IP情报规则列表接口获取https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=WAF&api=ListIdcIpRule **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
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
        DeleteIpReputationRuleRequest that = (DeleteIpReputationRuleRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.ruleId, that.ruleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, policyId, ruleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteIpReputationRuleRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
