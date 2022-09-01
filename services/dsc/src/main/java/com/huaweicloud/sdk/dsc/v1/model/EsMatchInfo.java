package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ES数据项匹配信息
 */
public class EsMatchInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    @JacksonXmlProperty(localName = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    @JacksonXmlProperty(localName = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    @JacksonXmlProperty(localName = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_risk_level")

    @JacksonXmlProperty(localName = "rule_risk_level")

    private Integer ruleRiskLevel;

    public EsMatchInfo withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 数据字段名
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public EsMatchInfo withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public EsMatchInfo withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public EsMatchInfo withRuleRiskLevel(Integer ruleRiskLevel) {
        this.ruleRiskLevel = ruleRiskLevel;
        return this;
    }

    /**
     * 规则风险等级
     * @return ruleRiskLevel
     */
    public Integer getRuleRiskLevel() {
        return ruleRiskLevel;
    }

    public void setRuleRiskLevel(Integer ruleRiskLevel) {
        this.ruleRiskLevel = ruleRiskLevel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EsMatchInfo esMatchInfo = (EsMatchInfo) o;
        return Objects.equals(this.fieldName, esMatchInfo.fieldName)
            && Objects.equals(this.ruleName, esMatchInfo.ruleName) && Objects.equals(this.ruleId, esMatchInfo.ruleId)
            && Objects.equals(this.ruleRiskLevel, esMatchInfo.ruleRiskLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldName, ruleName, ruleId, ruleRiskLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsMatchInfo {\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleRiskLevel: ").append(toIndentedString(ruleRiskLevel)).append("\n");
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
