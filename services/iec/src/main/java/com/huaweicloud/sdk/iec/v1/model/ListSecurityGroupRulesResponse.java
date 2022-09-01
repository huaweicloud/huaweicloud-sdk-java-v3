package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSecurityGroupRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rules")

    @JacksonXmlProperty(localName = "security_group_rules")

    private List<SecurityGroupRule> securityGroupRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

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

    public ListSecurityGroupRulesResponse withSecurityGroupRules(
        Consumer<List<SecurityGroupRule>> securityGroupRulesSetter) {
        if (this.securityGroupRules == null) {
            this.securityGroupRules = new ArrayList<>();
        }
        securityGroupRulesSetter.accept(this.securityGroupRules);
        return this;
    }

    /**
     * 安全组规则列表对象。
     * @return securityGroupRules
     */
    public List<SecurityGroupRule> getSecurityGroupRules() {
        return securityGroupRules;
    }

    public void setSecurityGroupRules(List<SecurityGroupRule> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
    }

    public ListSecurityGroupRulesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 安全组规则数目。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
        return Objects.equals(this.securityGroupRules, listSecurityGroupRulesResponse.securityGroupRules)
            && Objects.equals(this.count, listSecurityGroupRulesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRules, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityGroupRulesResponse {\n");
        sb.append("    securityGroupRules: ").append(toIndentedString(securityGroupRules)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
