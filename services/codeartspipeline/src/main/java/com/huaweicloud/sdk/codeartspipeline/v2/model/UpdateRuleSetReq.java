package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateRuleSetReq
 */
public class UpdateRuleSetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<UpdateRuleInstance> rules = null;

    public UpdateRuleSetReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 策略名称。 **约束限制**： 策略名称仅支持中文、大小写英文字母、数字、‘-’、‘_’。 **取值范围**： 不超过128个字符。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRuleSetReq withRules(List<UpdateRuleInstance> rules) {
        this.rules = rules;
        return this;
    }

    public UpdateRuleSetReq addRulesItem(UpdateRuleInstance rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public UpdateRuleSetReq withRules(Consumer<List<UpdateRuleInstance>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * **参数解释**： 策略中的规则列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return rules
     */
    public List<UpdateRuleInstance> getRules() {
        return rules;
    }

    public void setRules(List<UpdateRuleInstance> rules) {
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
        UpdateRuleSetReq that = (UpdateRuleSetReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRuleSetReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
