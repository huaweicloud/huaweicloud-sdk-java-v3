package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleInfo
 */
public class RuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleID")

    private String ruleID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleName")

    private String ruleName;

    public RuleInfo withRuleID(String ruleID) {
        this.ruleID = ruleID;
        return this;
    }

    /**
     * 权限策略id
     * @return ruleID
     */
    public String getRuleID() {
        return ruleID;
    }

    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

    public RuleInfo withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 权限策略名字
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleInfo that = (RuleInfo) obj;
        return Objects.equals(this.ruleID, that.ruleID) && Objects.equals(this.ruleName, that.ruleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleID, ruleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleInfo {\n");
        sb.append("    ruleID: ").append(toIndentedString(ruleID)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
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
