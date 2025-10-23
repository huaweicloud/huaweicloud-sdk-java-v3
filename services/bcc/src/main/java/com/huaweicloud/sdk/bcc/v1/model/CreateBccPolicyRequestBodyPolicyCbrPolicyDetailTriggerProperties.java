package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 保护类型：备份（backup）、复制(replication)。
 */
public class CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private List<String> pattern = null;

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties withPattern(List<String> pattern) {
        this.pattern = pattern;
        return this;
    }

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties addPatternItem(String patternItem) {
        if (this.pattern == null) {
            this.pattern = new ArrayList<>();
        }
        this.pattern.add(patternItem);
        return this;
    }

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties withPattern(
        Consumer<List<String>> patternSetter) {
        if (this.pattern == null) {
            this.pattern = new ArrayList<>();
        }
        patternSetter.accept(this.pattern);
        return this;
    }

    /**
     * 调度规则。
     * @return pattern
     */
    public List<String> getPattern() {
        return pattern;
    }

    public void setPattern(List<String> pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties that =
            (CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties) obj;
        return Objects.equals(this.pattern, that.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties {\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
