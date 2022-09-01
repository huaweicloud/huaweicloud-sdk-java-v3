package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSecurityGroupRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rule_id")

    @JacksonXmlProperty(localName = "security_group_rule_id")

    private String securityGroupRuleId;

    public DeleteSecurityGroupRuleRequest withSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }

    /**
     * 安全组规则ID
     * @return securityGroupRuleId
     */
    public String getSecurityGroupRuleId() {
        return securityGroupRuleId;
    }

    public void setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSecurityGroupRuleRequest deleteSecurityGroupRuleRequest = (DeleteSecurityGroupRuleRequest) o;
        return Objects.equals(this.securityGroupRuleId, deleteSecurityGroupRuleRequest.securityGroupRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecurityGroupRuleRequest {\n");
        sb.append("    securityGroupRuleId: ").append(toIndentedString(securityGroupRuleId)).append("\n");
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
