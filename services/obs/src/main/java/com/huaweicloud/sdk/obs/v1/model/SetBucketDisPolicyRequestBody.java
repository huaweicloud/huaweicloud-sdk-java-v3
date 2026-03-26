package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略规则数组。 类型：Container 取值范围：[1, 10]
 */
@JacksonXmlRootElement(localName = "SetBucketDisPolicyRequestBody")
public class SetBucketDisPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    @JacksonXmlProperty(localName = "rules")
    private List<SetBucketDisPolicyRequestBodyRules> rules = null;

    public SetBucketDisPolicyRequestBody withRules(List<SetBucketDisPolicyRequestBodyRules> rules) {
        this.rules = rules;
        return this;
    }

    public SetBucketDisPolicyRequestBody addRulesItem(SetBucketDisPolicyRequestBodyRules rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public SetBucketDisPolicyRequestBody withRules(Consumer<List<SetBucketDisPolicyRequestBodyRules>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * Get rules
     * @return rules
     */
    public List<SetBucketDisPolicyRequestBodyRules> getRules() {
        return rules;
    }

    public void setRules(List<SetBucketDisPolicyRequestBodyRules> rules) {
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
        SetBucketDisPolicyRequestBody that = (SetBucketDisPolicyRequestBody) obj;
        return Objects.equals(this.rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketDisPolicyRequestBody {\n");
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
