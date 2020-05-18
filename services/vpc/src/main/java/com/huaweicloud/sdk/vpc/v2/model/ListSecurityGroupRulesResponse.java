package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.SecurityGroupRule;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListSecurityGroupRulesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_rules")
    
    private List<SecurityGroupRule> securityGroupRules = null;
    
    public ListSecurityGroupRulesResponse withSecurityGroupRules(List<SecurityGroupRule> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
        return this;
    }

    
    public ListSecurityGroupRulesResponse addSecurityGroupRulesItem(SecurityGroupRule securityGroupRulesItem) {
        if (this.securityGroupRules == null) {
            this.securityGroupRules = new ArrayList<>();
        }
        this.securityGroupRules.add(securityGroupRulesItem);
        return this;
    }

    public ListSecurityGroupRulesResponse withSecurityGroupRules(Consumer<List<SecurityGroupRule>> securityGroupRulesSetter) {
        if(this.securityGroupRules == null ){
            this.securityGroupRules = new ArrayList<>();
        }
        securityGroupRulesSetter.accept(this.securityGroupRules);
        return this;
    }

    /**
     * 安全组规则对象列表
     * @return securityGroupRules
     */
    public List<SecurityGroupRule> getSecurityGroupRules() {
        return securityGroupRules;
    }

    public void setSecurityGroupRules(List<SecurityGroupRule> securityGroupRules) {
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
        ListSecurityGroupRulesResponse listSecurityGroupRulesResponse = (ListSecurityGroupRulesResponse) o;
        return Objects.equals(this.securityGroupRules, listSecurityGroupRulesResponse.securityGroupRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityGroupRulesResponse {\n");
            sb.append("    securityGroupRules: ").append(toIndentedString(securityGroupRules)).append("\n");
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

