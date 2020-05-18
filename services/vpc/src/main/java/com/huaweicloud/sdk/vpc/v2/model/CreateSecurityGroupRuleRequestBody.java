package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupRuleOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CreateSecurityGroupRuleRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_rule")
    
    private CreateSecurityGroupRuleOption securityGroupRule = null;

    public CreateSecurityGroupRuleRequestBody withSecurityGroupRule(CreateSecurityGroupRuleOption securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }

    public CreateSecurityGroupRuleRequestBody withSecurityGroupRule(Consumer<CreateSecurityGroupRuleOption> securityGroupRuleSetter) {
        if(this.securityGroupRule == null ){
            this.securityGroupRule = new CreateSecurityGroupRuleOption();
        }
        securityGroupRuleSetter.accept(this.securityGroupRule);
        return this;
    }


    /**
     * Get securityGroupRule
     * @return securityGroupRule
     */
    public CreateSecurityGroupRuleOption getSecurityGroupRule() {
        return securityGroupRule;
    }

    public void setSecurityGroupRule(CreateSecurityGroupRuleOption securityGroupRule) {
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
        CreateSecurityGroupRuleRequestBody createSecurityGroupRuleRequestBody = (CreateSecurityGroupRuleRequestBody) o;
        return Objects.equals(this.securityGroupRule, createSecurityGroupRuleRequestBody.securityGroupRule);
    }
    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRule);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupRuleRequestBody {\n");
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

