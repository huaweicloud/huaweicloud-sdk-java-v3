package com.huaweicloud.sdk.vpc.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.NeutronSecurityGroupRule;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class NeutronShowSecurityGroupRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_rule")
    
    private NeutronSecurityGroupRule securityGroupRule;

    public NeutronShowSecurityGroupRuleResponse withSecurityGroupRule(NeutronSecurityGroupRule securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }

    public NeutronShowSecurityGroupRuleResponse withSecurityGroupRule(Consumer<NeutronSecurityGroupRule> securityGroupRuleSetter) {
        if(this.securityGroupRule == null ){
            this.securityGroupRule = new NeutronSecurityGroupRule();
            securityGroupRuleSetter.accept(this.securityGroupRule);
        }
        
        return this;
    }


    /**
     * Get securityGroupRule
     * @return securityGroupRule
     */
    public NeutronSecurityGroupRule getSecurityGroupRule() {
        return securityGroupRule;
    }

    public void setSecurityGroupRule(NeutronSecurityGroupRule securityGroupRule) {
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
        NeutronShowSecurityGroupRuleResponse neutronShowSecurityGroupRuleResponse = (NeutronShowSecurityGroupRuleResponse) o;
        return Objects.equals(this.securityGroupRule, neutronShowSecurityGroupRuleResponse.securityGroupRule);
    }
    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRule);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronShowSecurityGroupRuleResponse {\n");
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
