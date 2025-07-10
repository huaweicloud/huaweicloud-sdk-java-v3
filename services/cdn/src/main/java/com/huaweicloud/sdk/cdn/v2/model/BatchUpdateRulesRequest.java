package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 批量更新规则状态和优先级 **约束限制：** 不涉及
 */
public class BatchUpdateRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<UpdateRuleStatusRequest> rules = null;

    public BatchUpdateRulesRequest withRules(List<UpdateRuleStatusRequest> rules) {
        this.rules = rules;
        return this;
    }

    public BatchUpdateRulesRequest addRulesItem(UpdateRuleStatusRequest rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public BatchUpdateRulesRequest withRules(Consumer<List<UpdateRuleStatusRequest>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * **参数解释：** 规则列表 **约束限制：** 不涉及
     * @return rules
     */
    public List<UpdateRuleStatusRequest> getRules() {
        return rules;
    }

    public void setRules(List<UpdateRuleStatusRequest> rules) {
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
        BatchUpdateRulesRequest that = (BatchUpdateRulesRequest) obj;
        return Objects.equals(this.rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateRulesRequest {\n");
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
