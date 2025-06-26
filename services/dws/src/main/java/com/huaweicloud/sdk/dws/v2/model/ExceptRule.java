package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 异常规则信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class ExceptRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_key")

    private String ruleKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_value")

    private String ruleValue;

    public ExceptRule withRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
        return this;
    }

    /**
     * **参数解释**： 规则项名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return ruleKey
     */
    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public ExceptRule withRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
        return this;
    }

    /**
     * **参数解释**： 规则项数值。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return ruleValue
     */
    public String getRuleValue() {
        return ruleValue;
    }

    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExceptRule that = (ExceptRule) obj;
        return Objects.equals(this.ruleKey, that.ruleKey) && Objects.equals(this.ruleValue, that.ruleValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleKey, ruleValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExceptRule {\n");
        sb.append("    ruleKey: ").append(toIndentedString(ruleKey)).append("\n");
        sb.append("    ruleValue: ").append(toIndentedString(ruleValue)).append("\n");
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
