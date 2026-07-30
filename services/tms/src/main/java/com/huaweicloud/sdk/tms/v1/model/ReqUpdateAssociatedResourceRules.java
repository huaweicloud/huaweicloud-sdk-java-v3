package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新规则入参
 */
public class ReqUpdateAssociatedResourceRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<ReqAssociatedResourceRule> rules = null;

    public ReqUpdateAssociatedResourceRules withRules(List<ReqAssociatedResourceRule> rules) {
        this.rules = rules;
        return this;
    }

    public ReqUpdateAssociatedResourceRules addRulesItem(ReqAssociatedResourceRule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public ReqUpdateAssociatedResourceRules withRules(Consumer<List<ReqAssociatedResourceRule>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 批量更新的规则信息
     * @return rules
     */
    public List<ReqAssociatedResourceRule> getRules() {
        return rules;
    }

    public void setRules(List<ReqAssociatedResourceRule> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReqUpdateAssociatedResourceRules that = (ReqUpdateAssociatedResourceRules) obj;
        return Objects.equals(this.rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqUpdateAssociatedResourceRules {\n");
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
