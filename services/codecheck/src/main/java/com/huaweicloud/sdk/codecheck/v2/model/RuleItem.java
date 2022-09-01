package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_language")

    @JacksonXmlProperty(localName = "rule_language")

    private String ruleLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    @JacksonXmlProperty(localName = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_severity")

    @JacksonXmlProperty(localName = "rule_severity")

    private String ruleSeverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_tages")

    @JacksonXmlProperty(localName = "rule_tages")

    private String ruleTages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checked")

    @JacksonXmlProperty(localName = "checked")

    private String checked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_config_list")

    @JacksonXmlProperty(localName = "rule_config_list")

    private List<RuleConfig> ruleConfigList = null;

    public RuleItem withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则id
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
     * 规则所属语言
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
     * 规则名称
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
     * 规则问题级别
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
     * 规则标签
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
     * 规则状态0：未启用，1：已启用
     * @return checked
     */
    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public RuleItem withRuleConfigList(List<RuleConfig> ruleConfigList) {
        this.ruleConfigList = ruleConfigList;
        return this;
    }

    public RuleItem addRuleConfigListItem(RuleConfig ruleConfigListItem) {
        if (this.ruleConfigList == null) {
            this.ruleConfigList = new ArrayList<>();
        }
        this.ruleConfigList.add(ruleConfigListItem);
        return this;
    }

    public RuleItem withRuleConfigList(Consumer<List<RuleConfig>> ruleConfigListSetter) {
        if (this.ruleConfigList == null) {
            this.ruleConfigList = new ArrayList<>();
        }
        ruleConfigListSetter.accept(this.ruleConfigList);
        return this;
    }

    /**
     * 规则配置参数阈值相关信息
     * @return ruleConfigList
     */
    public List<RuleConfig> getRuleConfigList() {
        return ruleConfigList;
    }

    public void setRuleConfigList(List<RuleConfig> ruleConfigList) {
        this.ruleConfigList = ruleConfigList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleItem ruleItem = (RuleItem) o;
        return Objects.equals(this.ruleId, ruleItem.ruleId) && Objects.equals(this.ruleLanguage, ruleItem.ruleLanguage)
            && Objects.equals(this.ruleName, ruleItem.ruleName)
            && Objects.equals(this.ruleSeverity, ruleItem.ruleSeverity)
            && Objects.equals(this.ruleTages, ruleItem.ruleTages) && Objects.equals(this.checked, ruleItem.checked)
            && Objects.equals(this.ruleConfigList, ruleItem.ruleConfigList);
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
