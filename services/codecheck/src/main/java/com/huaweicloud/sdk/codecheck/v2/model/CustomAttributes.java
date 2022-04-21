package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomAttributes
 */
public class CustomAttributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute")

    private String attribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<CustomAttributesRule> rules = null;

    public CustomAttributes withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * 配置项属性，severity：为问题级别
     * @return attribute
     */
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public CustomAttributes withRules(List<CustomAttributesRule> rules) {
        this.rules = rules;
        return this;
    }

    public CustomAttributes addRulesItem(CustomAttributesRule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public CustomAttributes withRules(Consumer<List<CustomAttributesRule>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 规则详细
     * @return rules
     */
    public List<CustomAttributesRule> getRules() {
        return rules;
    }

    public void setRules(List<CustomAttributesRule> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomAttributes customAttributes = (CustomAttributes) o;
        return Objects.equals(this.attribute, customAttributes.attribute)
            && Objects.equals(this.rules, customAttributes.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attribute, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomAttributes {\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
