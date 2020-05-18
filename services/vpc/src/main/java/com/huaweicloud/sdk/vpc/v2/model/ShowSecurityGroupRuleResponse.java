package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.SecurityGroupRule;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowSecurityGroupRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_rule")
    
    private SecurityGroupRule securityGroupRule = null;

    public ShowSecurityGroupRuleResponse withSecurityGroupRule(SecurityGroupRule securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }

    public ShowSecurityGroupRuleResponse withSecurityGroupRule(Consumer<SecurityGroupRule> securityGroupRuleSetter) {
        if(this.securityGroupRule == null ){
            this.securityGroupRule = new SecurityGroupRule();
        }
        securityGroupRuleSetter.accept(this.securityGroupRule);
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSecurityGroupRuleResponse showSecurityGroupRuleResponse = (ShowSecurityGroupRuleResponse) o;
        return Objects.equals(this.securityGroupRule, showSecurityGroupRuleResponse.securityGroupRule);
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

