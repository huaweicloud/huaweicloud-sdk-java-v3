package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReferencedRule
 */
public class ReferencedRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_opts_type")

    private String detectOptsType;

    public ReferencedRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public ReferencedRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 策略名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ReferencedRule withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 引用该代答库的规则所属策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ReferencedRule withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 引用该代答库的规则所属策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ReferencedRule withDetectOptsType(String detectOptsType) {
        this.detectOptsType = detectOptsType;
        return this;
    }

    /**
     * 规则检测选项类型，可选：lexicon(词库检测), compliance(合规检测), inject(注入检测), immunity_lexicon(豁免词库), supported_language(语言检测), pii(PII检测), abuse(算力滥用检测), topic_detect(话题检测)等
     * @return detectOptsType
     */
    public String getDetectOptsType() {
        return detectOptsType;
    }

    public void setDetectOptsType(String detectOptsType) {
        this.detectOptsType = detectOptsType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReferencedRule that = (ReferencedRule) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.detectOptsType, that.detectOptsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, ruleName, policyId, policyName, detectOptsType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferencedRule {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    detectOptsType: ").append(toIndentedString(detectOptsType)).append("\n");
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
