package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建安全组规则请求体。
 */
public class CreateSecurityGroupRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rule")

    @JacksonXmlProperty(localName = "security_group_rule")

    private CreateSecurityGroupRuleOption securityGroupRule;

    public CreateSecurityGroupRuleRequestBody withSecurityGroupRule(CreateSecurityGroupRuleOption securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }

    public CreateSecurityGroupRuleRequestBody withSecurityGroupRule(
        Consumer<CreateSecurityGroupRuleOption> securityGroupRuleSetter) {
        if (this.securityGroupRule == null) {
            this.securityGroupRule = new CreateSecurityGroupRuleOption();
            securityGroupRuleSetter.accept(this.securityGroupRule);
        }

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
