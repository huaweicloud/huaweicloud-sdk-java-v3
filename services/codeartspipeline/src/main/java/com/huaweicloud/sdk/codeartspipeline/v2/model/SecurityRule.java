package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则详情
 */
public class SecurityRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SecurityRuleSeverity severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve")

    private SecurityRuleCve cve;

    public SecurityRule withSeverity(SecurityRuleSeverity severity) {
        this.severity = severity;
        return this;
    }

    public SecurityRule withSeverity(Consumer<SecurityRuleSeverity> severitySetter) {
        if (this.severity == null) {
            this.severity = new SecurityRuleSeverity();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public SecurityRuleSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(SecurityRuleSeverity severity) {
        this.severity = severity;
    }

    public SecurityRule withCve(SecurityRuleCve cve) {
        this.cve = cve;
        return this;
    }

    public SecurityRule withCve(Consumer<SecurityRuleCve> cveSetter) {
        if (this.cve == null) {
            this.cve = new SecurityRuleCve();
            cveSetter.accept(this.cve);
        }

        return this;
    }

    /**
     * Get cve
     * @return cve
     */
    public SecurityRuleCve getCve() {
        return cve;
    }

    public void setCve(SecurityRuleCve cve) {
        this.cve = cve;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityRule that = (SecurityRule) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.cve, that.cve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, cve);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityRule {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    cve: ").append(toIndentedString(cve)).append("\n");
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
