package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecurityGroupRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rule")

    private SecurityGroupRule securityGroupRule;

    public ShowSecurityGroupRuleResponse withSecurityGroupRule(SecurityGroupRule securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }

    public ShowSecurityGroupRuleResponse withSecurityGroupRule(Consumer<SecurityGroupRule> securityGroupRuleSetter) {
        if (this.securityGroupRule == null) {
            this.securityGroupRule = new SecurityGroupRule();
            securityGroupRuleSetter.accept(this.securityGroupRule);
        }

        return this;
    }

    /**
     * Get securityGroupRule
     * @return securityGroupRule
     */
    public SecurityGroupRule getSecurityGroupRule() {
        return securityGroupRule;
    }

    public void setSecurityGroupRule(SecurityGroupRule securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityGroupRuleResponse that = (ShowSecurityGroupRuleResponse) obj;
        return Objects.equals(this.securityGroupRule, that.securityGroupRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityGroupRuleResponse {\n");
        sb.append("    securityGroupRule: ").append(toIndentedString(securityGroupRule)).append("\n");
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
