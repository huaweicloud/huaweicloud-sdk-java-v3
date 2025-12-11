package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户键入的要修复的检查项的参数ID和参数值
 */
public class CheckRuleFixValuesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_param_id")

    private Integer ruleParamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_value")

    private Integer fixValue;

    public CheckRuleFixValuesInfo withRuleParamId(Integer ruleParamId) {
        this.ruleParamId = ruleParamId;
        return this;
    }

    /**
     * **参数解释**: 检查项的参数ID **约束限制**: 不涉及 **取值范围**: 字符串大小范围1-128 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 128
     * @return ruleParamId
     */
    public Integer getRuleParamId() {
        return ruleParamId;
    }

    public void setRuleParamId(Integer ruleParamId) {
        this.ruleParamId = ruleParamId;
    }

    public CheckRuleFixValuesInfo withFixValue(Integer fixValue) {
        this.fixValue = fixValue;
        return this;
    }

    /**
     * **参数解释**: 修复检查项参数具体值 **约束限制**: 不涉及 **取值范围**: 字符串大小范围0-512 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 512
     * @return fixValue
     */
    public Integer getFixValue() {
        return fixValue;
    }

    public void setFixValue(Integer fixValue) {
        this.fixValue = fixValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRuleFixValuesInfo that = (CheckRuleFixValuesInfo) obj;
        return Objects.equals(this.ruleParamId, that.ruleParamId) && Objects.equals(this.fixValue, that.fixValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleParamId, fixValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRuleFixValuesInfo {\n");
        sb.append("    ruleParamId: ").append(toIndentedString(ruleParamId)).append("\n");
        sb.append("    fixValue: ").append(toIndentedString(fixValue)).append("\n");
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
