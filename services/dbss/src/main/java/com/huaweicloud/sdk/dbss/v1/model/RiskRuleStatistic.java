package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RiskRuleStatistic
 */
public class RiskRuleStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name_english")

    private String ruleNameEnglish;

    public RiskRuleStatistic withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public RiskRuleStatistic withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public RiskRuleStatistic withRuleNameEnglish(String ruleNameEnglish) {
        this.ruleNameEnglish = ruleNameEnglish;
        return this;
    }

    /**
     * 规则英文名
     * @return ruleNameEnglish
     */
    public String getRuleNameEnglish() {
        return ruleNameEnglish;
    }

    public void setRuleNameEnglish(String ruleNameEnglish) {
        this.ruleNameEnglish = ruleNameEnglish;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskRuleStatistic that = (RiskRuleStatistic) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.ruleNameEnglish, that.ruleNameEnglish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, ruleName, ruleNameEnglish);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskRuleStatistic {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleNameEnglish: ").append(toIndentedString(ruleNameEnglish)).append("\n");
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
