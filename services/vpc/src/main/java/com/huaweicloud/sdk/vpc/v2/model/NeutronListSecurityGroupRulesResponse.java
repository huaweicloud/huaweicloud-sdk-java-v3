package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class NeutronListSecurityGroupRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rules")

    private List<NeutronSecurityGroupRule> securityGroupRules = null;

    public NeutronListSecurityGroupRulesResponse withSecurityGroupRules(
        List<NeutronSecurityGroupRule> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
        return this;
    }

    public NeutronListSecurityGroupRulesResponse addSecurityGroupRulesItem(
        NeutronSecurityGroupRule securityGroupRulesItem) {
        if (this.securityGroupRules == null) {
            this.securityGroupRules = new ArrayList<>();
        }
        this.securityGroupRules.add(securityGroupRulesItem);
        return this;
    }

    public NeutronListSecurityGroupRulesResponse withSecurityGroupRules(
        Consumer<List<NeutronSecurityGroupRule>> securityGroupRulesSetter) {
        if (this.securityGroupRules == null) {
            this.securityGroupRules = new ArrayList<>();
        }
        securityGroupRulesSetter.accept(this.securityGroupRules);
        return this;
    }

    /** 安全组规则对象列表
     * 
     * @return securityGroupRules */
    public List<NeutronSecurityGroupRule> getSecurityGroupRules() {
        return securityGroupRules;
    }

    public void setSecurityGroupRules(List<NeutronSecurityGroupRule> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListSecurityGroupRulesResponse neutronListSecurityGroupRulesResponse =
            (NeutronListSecurityGroupRulesResponse) o;
        return Objects.equals(this.securityGroupRules, neutronListSecurityGroupRulesResponse.securityGroupRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListSecurityGroupRulesResponse {\n");
        sb.append("    securityGroupRules: ").append(toIndentedString(securityGroupRules)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
