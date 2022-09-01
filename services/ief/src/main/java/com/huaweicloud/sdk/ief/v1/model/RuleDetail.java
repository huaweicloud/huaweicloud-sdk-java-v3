package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则配置
 */
public class RuleDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    @JacksonXmlProperty(localName = "rule")

    private RuleConfig rule;

    public RuleDetail withRule(RuleConfig rule) {
        this.rule = rule;
        return this;
    }

    public RuleDetail withRule(Consumer<RuleConfig> ruleSetter) {
        if (this.rule == null) {
            this.rule = new RuleConfig();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    public RuleConfig getRule() {
        return rule;
    }

    public void setRule(RuleConfig rule) {
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
        RuleDetail ruleDetail = (RuleDetail) o;
        return Objects.equals(this.rule, ruleDetail.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleDetail {\n");
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
