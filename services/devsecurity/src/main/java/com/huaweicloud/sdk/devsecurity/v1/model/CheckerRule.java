package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckerRule
 */
public class CheckerRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checker_rule")

    private String checkerRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checker_entry")

    private String checkerEntry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checker_result")

    private String checkerResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checker_stack")

    private String checkerStack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy_policy_evidences")

    private String privacyPolicyEvidences;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pass")

    private Boolean pass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rectify_suggestion")

    private String rectifySuggestion;

    public CheckerRule withCheckerRule(String checkerRule) {
        this.checkerRule = checkerRule;
        return this;
    }

    /**
     * 检测项
     * @return checkerRule
     */
    public String getCheckerRule() {
        return checkerRule;
    }

    public void setCheckerRule(String checkerRule) {
        this.checkerRule = checkerRule;
    }

    public CheckerRule withCheckerEntry(String checkerEntry) {
        this.checkerEntry = checkerEntry;
        return this;
    }

    /**
     * 规范检测项条目
     * @return checkerEntry
     */
    public String getCheckerEntry() {
        return checkerEntry;
    }

    public void setCheckerEntry(String checkerEntry) {
        this.checkerEntry = checkerEntry;
    }

    public CheckerRule withCheckerResult(String checkerResult) {
        this.checkerResult = checkerResult;
        return this;
    }

    /**
     * 规则检测项结果
     * @return checkerResult
     */
    public String getCheckerResult() {
        return checkerResult;
    }

    public void setCheckerResult(String checkerResult) {
        this.checkerResult = checkerResult;
    }

    public CheckerRule withCheckerStack(String checkerStack) {
        this.checkerStack = checkerStack;
        return this;
    }

    /**
     * 调用栈信息
     * @return checkerStack
     */
    public String getCheckerStack() {
        return checkerStack;
    }

    public void setCheckerStack(String checkerStack) {
        this.checkerStack = checkerStack;
    }

    public CheckerRule withPrivacyPolicyEvidences(String privacyPolicyEvidences) {
        this.privacyPolicyEvidences = privacyPolicyEvidences;
        return this;
    }

    /**
     * 隐私声明
     * @return privacyPolicyEvidences
     */
    public String getPrivacyPolicyEvidences() {
        return privacyPolicyEvidences;
    }

    public void setPrivacyPolicyEvidences(String privacyPolicyEvidences) {
        this.privacyPolicyEvidences = privacyPolicyEvidences;
    }

    public CheckerRule withPass(Boolean pass) {
        this.pass = pass;
        return this;
    }

    /**
     * 是否通过
     * @return pass
     */
    public Boolean getPass() {
        return pass;
    }

    public void setPass(Boolean pass) {
        this.pass = pass;
    }

    public CheckerRule withRectifySuggestion(String rectifySuggestion) {
        this.rectifySuggestion = rectifySuggestion;
        return this;
    }

    /**
     * 修复建议
     * @return rectifySuggestion
     */
    public String getRectifySuggestion() {
        return rectifySuggestion;
    }

    public void setRectifySuggestion(String rectifySuggestion) {
        this.rectifySuggestion = rectifySuggestion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckerRule checkerRule = (CheckerRule) o;
        return Objects.equals(this.checkerRule, checkerRule.checkerRule)
            && Objects.equals(this.checkerEntry, checkerRule.checkerEntry)
            && Objects.equals(this.checkerResult, checkerRule.checkerResult)
            && Objects.equals(this.checkerStack, checkerRule.checkerStack)
            && Objects.equals(this.privacyPolicyEvidences, checkerRule.privacyPolicyEvidences)
            && Objects.equals(this.pass, checkerRule.pass)
            && Objects.equals(this.rectifySuggestion, checkerRule.rectifySuggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkerRule,
            checkerEntry,
            checkerResult,
            checkerStack,
            privacyPolicyEvidences,
            pass,
            rectifySuggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckerRule {\n");
        sb.append("    checkerRule: ").append(toIndentedString(checkerRule)).append("\n");
        sb.append("    checkerEntry: ").append(toIndentedString(checkerEntry)).append("\n");
        sb.append("    checkerResult: ").append(toIndentedString(checkerResult)).append("\n");
        sb.append("    checkerStack: ").append(toIndentedString(checkerStack)).append("\n");
        sb.append("    privacyPolicyEvidences: ").append(toIndentedString(privacyPolicyEvidences)).append("\n");
        sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
        sb.append("    rectifySuggestion: ").append(toIndentedString(rectifySuggestion)).append("\n");
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
