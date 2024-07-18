package com.huaweicloud.sdk.codeartsgovernance.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VulCheckerRule
 */
public class VulCheckerRule {

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

    public VulCheckerRule withCheckerRule(String checkerRule) {
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

    public VulCheckerRule withCheckerEntry(String checkerEntry) {
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

    public VulCheckerRule withCheckerResult(String checkerResult) {
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

    public VulCheckerRule withCheckerStack(String checkerStack) {
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

    public VulCheckerRule withPrivacyPolicyEvidences(String privacyPolicyEvidences) {
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

    public VulCheckerRule withPass(Boolean pass) {
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

    public VulCheckerRule withRectifySuggestion(String rectifySuggestion) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulCheckerRule that = (VulCheckerRule) obj;
        return Objects.equals(this.checkerRule, that.checkerRule)
            && Objects.equals(this.checkerEntry, that.checkerEntry)
            && Objects.equals(this.checkerResult, that.checkerResult)
            && Objects.equals(this.checkerStack, that.checkerStack)
            && Objects.equals(this.privacyPolicyEvidences, that.privacyPolicyEvidences)
            && Objects.equals(this.pass, that.pass) && Objects.equals(this.rectifySuggestion, that.rectifySuggestion);
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
        sb.append("class VulCheckerRule {\n");
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
