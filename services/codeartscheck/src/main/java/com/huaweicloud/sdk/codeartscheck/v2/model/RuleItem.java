package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleItem
 */
public class RuleItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_language")

    private String ruleLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_severity")

    private String ruleSeverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_tages")

    private String ruleTages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checked")

    private String checked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_config_list")

    private List<RuleConfigParam> ruleConfigList = null;

    public RuleItem withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释:** 规则ID。 **取值范围:** 32位ID。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public RuleItem withRuleLanguage(String ruleLanguage) {
        this.ruleLanguage = ruleLanguage;
        return this;
    }

    /**
     * **参数解释:** 规则所属语言。 **取值范围:** 当前支持的语言有： - ARKTS - C# - CANGJIE - C++ - CSS - GO - HTML - JAVA - JAVASCRIPT - KOTLIN - LUA - PHP - PYTHON - RUST - SCALA - SHELL - SQL - TERRAFORM - TYPESCRIPT - AZURERESOURCEMANAGER - DOCKER - KUBERNETES
     * @return ruleLanguage
     */
    public String getRuleLanguage() {
        return ruleLanguage;
    }

    public void setRuleLanguage(String ruleLanguage) {
        this.ruleLanguage = ruleLanguage;
    }

    public RuleItem withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释:** 规则名称。 **取值范围:** 不涉及。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public RuleItem withRuleSeverity(String ruleSeverity) {
        this.ruleSeverity = ruleSeverity;
        return this;
    }

    /**
     * **参数解释:** 规则问题级别。 **取值范围：** - 0：致命。 - 1：严重。 - 2：一般。 - 3：提示。
     * @return ruleSeverity
     */
    public String getRuleSeverity() {
        return ruleSeverity;
    }

    public void setRuleSeverity(String ruleSeverity) {
        this.ruleSeverity = ruleSeverity;
    }

    public RuleItem withRuleTages(String ruleTages) {
        this.ruleTages = ruleTages;
        return this;
    }

    /**
     * **参数解释:** 规则标签。 **取值范围:** - huawei - iso5055 - cert - cwe - top10 - top25 - misra - GJB - autosar - PCI DSS
     * @return ruleTages
     */
    public String getRuleTages() {
        return ruleTages;
    }

    public void setRuleTages(String ruleTages) {
        this.ruleTages = ruleTages;
    }

    public RuleItem withChecked(String checked) {
        this.checked = checked;
        return this;
    }

    /**
     * **参数解释:** 规则状态。 **取值范围:** - 0：未启用。 - 1：已启用。
     * @return checked
     */
    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public RuleItem withRuleConfigList(List<RuleConfigParam> ruleConfigList) {
        this.ruleConfigList = ruleConfigList;
        return this;
    }

    public RuleItem addRuleConfigListItem(RuleConfigParam ruleConfigListItem) {
        if (this.ruleConfigList == null) {
            this.ruleConfigList = new ArrayList<>();
        }
        this.ruleConfigList.add(ruleConfigListItem);
        return this;
    }

    public RuleItem withRuleConfigList(Consumer<List<RuleConfigParam>> ruleConfigListSetter) {
        if (this.ruleConfigList == null) {
            this.ruleConfigList = new ArrayList<>();
        }
        ruleConfigListSetter.accept(this.ruleConfigList);
        return this;
    }

    /**
     * **参数解释:** 规则配置参数阈值相关信息。
     * @return ruleConfigList
     */
    public List<RuleConfigParam> getRuleConfigList() {
        return ruleConfigList;
    }

    public void setRuleConfigList(List<RuleConfigParam> ruleConfigList) {
        this.ruleConfigList = ruleConfigList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleItem that = (RuleItem) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.ruleLanguage, that.ruleLanguage)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.ruleSeverity, that.ruleSeverity)
            && Objects.equals(this.ruleTages, that.ruleTages) && Objects.equals(this.checked, that.checked)
            && Objects.equals(this.ruleConfigList, that.ruleConfigList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, ruleLanguage, ruleName, ruleSeverity, ruleTages, checked, ruleConfigList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleItem {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleLanguage: ").append(toIndentedString(ruleLanguage)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleSeverity: ").append(toIndentedString(ruleSeverity)).append("\n");
        sb.append("    ruleTages: ").append(toIndentedString(ruleTages)).append("\n");
        sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
        sb.append("    ruleConfigList: ").append(toIndentedString(ruleConfigList)).append("\n");
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
