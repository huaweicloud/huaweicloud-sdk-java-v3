package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAuditRuleRisksNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_levels")

    private String riskLevels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_db_classify_rule")

    private Boolean supportDbClassifyRule;

    public ListAuditRuleRisksNewRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。可通过查询实例列表接口ID字段获取 **约束限制**： 不涉及 **取值范围**： 以查询实例列表接口值为准，字符长度32-64。 **默认取值**： 不涉及 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListAuditRuleRisksNewRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 风险名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAuditRuleRisksNewRequest withRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }

    /**
     * **参数解释**： 风险级别 **约束限制**： 以取值范围为准 **取值范围**： - LOW：低风险 - MEDIUM：中风险 - HIGH：高风险 - NO_RISK：无风险 **默认取值**： 不涉及 
     * @return riskLevels
     */
    public String getRiskLevels() {
        return riskLevels;
    }

    public void setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
    }

    public ListAuditRuleRisksNewRequest withSupportDbClassifyRule(Boolean supportDbClassifyRule) {
        this.supportDbClassifyRule = supportDbClassifyRule;
        return this;
    }

    /**
     * **参数解释**： 实例前端是否支持按数据库类型展示风险规则 **约束限制**： 以取值范围为准 **取值范围**： - true: 支持 - false: 不支持 **默认取值**： false: 不支持 
     * @return supportDbClassifyRule
     */
    public Boolean getSupportDbClassifyRule() {
        return supportDbClassifyRule;
    }

    public void setSupportDbClassifyRule(Boolean supportDbClassifyRule) {
        this.supportDbClassifyRule = supportDbClassifyRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditRuleRisksNewRequest that = (ListAuditRuleRisksNewRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.riskLevels, that.riskLevels)
            && Objects.equals(this.supportDbClassifyRule, that.supportDbClassifyRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, name, riskLevels, supportDbClassifyRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditRuleRisksNewRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    riskLevels: ").append(toIndentedString(riskLevels)).append("\n");
        sb.append("    supportDbClassifyRule: ").append(toIndentedString(supportDbClassifyRule)).append("\n");
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
