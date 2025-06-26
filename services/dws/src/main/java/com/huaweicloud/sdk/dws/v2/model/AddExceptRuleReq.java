package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 创建/更新异常规则请求体。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class AddExceptRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "except_rules")

    private List<ExceptRule> exceptRules = null;

    public AddExceptRuleReq withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释**： 异常规则名称。 **约束限制**： 名称不能为空。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public AddExceptRuleReq withExceptRules(List<ExceptRule> exceptRules) {
        this.exceptRules = exceptRules;
        return this;
    }

    public AddExceptRuleReq addExceptRulesItem(ExceptRule exceptRulesItem) {
        if (this.exceptRules == null) {
            this.exceptRules = new ArrayList<>();
        }
        this.exceptRules.add(exceptRulesItem);
        return this;
    }

    public AddExceptRuleReq withExceptRules(Consumer<List<ExceptRule>> exceptRulesSetter) {
        if (this.exceptRules == null) {
            this.exceptRules = new ArrayList<>();
        }
        exceptRulesSetter.accept(this.exceptRules);
        return this;
    }

    /**
     * **参数解释**： 异常规则配置项。 **约束限制**： 不能为空。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return exceptRules
     */
    public List<ExceptRule> getExceptRules() {
        return exceptRules;
    }

    public void setExceptRules(List<ExceptRule> exceptRules) {
        this.exceptRules = exceptRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddExceptRuleReq that = (AddExceptRuleReq) obj;
        return Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.exceptRules, that.exceptRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, exceptRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddExceptRuleReq {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    exceptRules: ").append(toIndentedString(exceptRules)).append("\n");
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
