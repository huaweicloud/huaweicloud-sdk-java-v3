package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateSecurityGroupRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rule")

    @JacksonXmlProperty(localName = "security_group_rule")

    private SecurityGroupRule securityGroupRule;

    public CreateSecurityGroupRuleResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateSecurityGroupRuleResponse withSecurityGroupRule(SecurityGroupRule securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }

    public CreateSecurityGroupRuleResponse withSecurityGroupRule(Consumer<SecurityGroupRule> securityGroupRuleSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecurityGroupRuleResponse createSecurityGroupRuleResponse = (CreateSecurityGroupRuleResponse) o;
        return Objects.equals(this.requestId, createSecurityGroupRuleResponse.requestId)
            && Objects.equals(this.securityGroupRule, createSecurityGroupRuleResponse.securityGroupRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, securityGroupRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupRuleResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
