package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 录屏审计。
 */
public class PoliciesRecordAudit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private PoliciesRecordAuditRules rules;

    public PoliciesRecordAudit withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启录屏审计。取值为： false：表示关闭。 true：表示开启。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public PoliciesRecordAudit withRules(PoliciesRecordAuditRules rules) {
        this.rules = rules;
        return this;
    }

    public PoliciesRecordAudit withRules(Consumer<PoliciesRecordAuditRules> rulesSetter) {
        if (this.rules == null) {
            this.rules = new PoliciesRecordAuditRules();
            rulesSetter.accept(this.rules);
        }

        return this;
    }

    /**
     * Get rules
     * @return rules
     */
    public PoliciesRecordAuditRules getRules() {
        return rules;
    }

    public void setRules(PoliciesRecordAuditRules rules) {
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
        PoliciesRecordAudit that = (PoliciesRecordAudit) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesRecordAudit {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
