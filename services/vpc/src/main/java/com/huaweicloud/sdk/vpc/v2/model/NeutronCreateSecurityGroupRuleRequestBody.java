package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronCreateSecurityGroupRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rule")

    private NeutronCreateSecurityGroupRuleOption securityGroupRule;

    public NeutronCreateSecurityGroupRuleRequestBody withSecurityGroupRule(
        NeutronCreateSecurityGroupRuleOption securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }

    public NeutronCreateSecurityGroupRuleRequestBody withSecurityGroupRule(
        Consumer<NeutronCreateSecurityGroupRuleOption> securityGroupRuleSetter) {
        if (this.securityGroupRule == null) {
            this.securityGroupRule = new NeutronCreateSecurityGroupRuleOption();
            securityGroupRuleSetter.accept(this.securityGroupRule);
        }

        return this;
    }

    /**
     * Get securityGroupRule
     * @return securityGroupRule
     */
    public NeutronCreateSecurityGroupRuleOption getSecurityGroupRule() {
        return securityGroupRule;
    }

    public void setSecurityGroupRule(NeutronCreateSecurityGroupRuleOption securityGroupRule) {
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
        NeutronCreateSecurityGroupRuleRequestBody that = (NeutronCreateSecurityGroupRuleRequestBody) obj;
        return Objects.equals(this.securityGroupRule, that.securityGroupRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateSecurityGroupRuleRequestBody {\n");
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
