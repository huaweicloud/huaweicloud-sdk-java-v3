package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleRiskResponseRules
 */
public class RuleRiskResponseRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private String feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank")

    private Integer rank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    public RuleRiskResponseRules withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 风险规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RuleRiskResponseRules withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 风险规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleRiskResponseRules withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 风险规则类型 - LOGIN：登录  - OPERATE：操作
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleRiskResponseRules withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * 风险规则特征
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public RuleRiskResponseRules withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 风险规则状态。 - ON：开启 - OFF：关闭
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RuleRiskResponseRules withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * 风险规则优先级。数字越小优先级越高。
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public RuleRiskResponseRules withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险级别 - LOW：低 - MEDIUM：中 - HIGH：高 - NO_RISK：无风险
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public RuleRiskResponseRules withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 规则类型 - SYSTEM：系统  - CUSTOMIZE：自定义
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleRiskResponseRules that = (RuleRiskResponseRules) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this.status, that.status) && Objects.equals(this.rank, that.rank)
            && Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.ruleType, that.ruleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, feature, status, rank, riskLevel, ruleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleRiskResponseRules {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
