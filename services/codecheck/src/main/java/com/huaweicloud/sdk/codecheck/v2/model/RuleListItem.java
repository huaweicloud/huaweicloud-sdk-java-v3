package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** RuleListItem */
public class RuleListItem {

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
    @JsonProperty(value = "right_example")

    private String rightExample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_example")

    private String errorExample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revise_opinion")

    private String reviseOpinion;

    public RuleListItem withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /** 规则id
     * 
     * @return ruleId */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public RuleListItem withRuleLanguage(String ruleLanguage) {
        this.ruleLanguage = ruleLanguage;
        return this;
    }

    /** 规则所属语言
     * 
     * @return ruleLanguage */
    public String getRuleLanguage() {
        return ruleLanguage;
    }

    public void setRuleLanguage(String ruleLanguage) {
        this.ruleLanguage = ruleLanguage;
    }

    public RuleListItem withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /** 规则名称
     * 
     * @return ruleName */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public RuleListItem withRuleSeverity(String ruleSeverity) {
        this.ruleSeverity = ruleSeverity;
        return this;
    }

    /** 规则问题级别
     * 
     * @return ruleSeverity */
    public String getRuleSeverity() {
        return ruleSeverity;
    }

    public void setRuleSeverity(String ruleSeverity) {
        this.ruleSeverity = ruleSeverity;
    }

    public RuleListItem withRuleTages(String ruleTages) {
        this.ruleTages = ruleTages;
        return this;
    }

    /** 规则标签
     * 
     * @return ruleTages */
    public String getRuleTages() {
        return ruleTages;
    }

    public void setRuleTages(String ruleTages) {
        this.ruleTages = ruleTages;
    }

    public RuleListItem withRightExample(String rightExample) {
        this.rightExample = rightExample;
        return this;
    }

    /** 正确示例
     * 
     * @return rightExample */
    public String getRightExample() {
        return rightExample;
    }

    public void setRightExample(String rightExample) {
        this.rightExample = rightExample;
    }

    public RuleListItem withErrorExample(String errorExample) {
        this.errorExample = errorExample;
        return this;
    }

    /** 错误示例
     * 
     * @return errorExample */
    public String getErrorExample() {
        return errorExample;
    }

    public void setErrorExample(String errorExample) {
        this.errorExample = errorExample;
    }

    public RuleListItem withReviseOpinion(String reviseOpinion) {
        this.reviseOpinion = reviseOpinion;
        return this;
    }

    /** 修改建议
     * 
     * @return reviseOpinion */
    public String getReviseOpinion() {
        return reviseOpinion;
    }

    public void setReviseOpinion(String reviseOpinion) {
        this.reviseOpinion = reviseOpinion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleListItem ruleListItem = (RuleListItem) o;
        return Objects.equals(this.ruleId, ruleListItem.ruleId)
            && Objects.equals(this.ruleLanguage, ruleListItem.ruleLanguage)
            && Objects.equals(this.ruleName, ruleListItem.ruleName)
            && Objects.equals(this.ruleSeverity, ruleListItem.ruleSeverity)
            && Objects.equals(this.ruleTages, ruleListItem.ruleTages)
            && Objects.equals(this.rightExample, ruleListItem.rightExample)
            && Objects.equals(this.errorExample, ruleListItem.errorExample)
            && Objects.equals(this.reviseOpinion, ruleListItem.reviseOpinion);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(ruleId, ruleLanguage, ruleName, ruleSeverity, ruleTages, rightExample, errorExample, reviseOpinion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleListItem {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleLanguage: ").append(toIndentedString(ruleLanguage)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleSeverity: ").append(toIndentedString(ruleSeverity)).append("\n");
        sb.append("    ruleTages: ").append(toIndentedString(ruleTages)).append("\n");
        sb.append("    rightExample: ").append(toIndentedString(rightExample)).append("\n");
        sb.append("    errorExample: ").append(toIndentedString(errorExample)).append("\n");
        sb.append("    reviseOpinion: ").append(toIndentedString(reviseOpinion)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
