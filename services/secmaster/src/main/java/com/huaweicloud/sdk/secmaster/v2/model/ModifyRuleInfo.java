package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Information of rule
 */
public class ModifyRuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private ConditionInfo rule;

    public ModifyRuleInfo withRule(ConditionInfo rule) {
        this.rule = rule;
        return this;
    }

    public ModifyRuleInfo withRule(Consumer<ConditionInfo> ruleSetter) {
        if (this.rule == null) {
            this.rule = new ConditionInfo();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    public ConditionInfo getRule() {
        return rule;
    }

    public void setRule(ConditionInfo rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyRuleInfo modifyRuleInfo = (ModifyRuleInfo) o;
        return Objects.equals(this.rule, modifyRuleInfo.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyRuleInfo {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
