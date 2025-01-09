package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 录屏规则列表。
 */
public class PoliciesRecordAuditRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private RecordAuditRule rule;

    public PoliciesRecordAuditRules withRule(RecordAuditRule rule) {
        this.rule = rule;
        return this;
    }

    public PoliciesRecordAuditRules withRule(Consumer<RecordAuditRule> ruleSetter) {
        if (this.rule == null) {
            this.rule = new RecordAuditRule();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    public RecordAuditRule getRule() {
        return rule;
    }

    public void setRule(RecordAuditRule rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesRecordAuditRules that = (PoliciesRecordAuditRules) obj;
        return Objects.equals(this.rule, that.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesRecordAuditRules {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
