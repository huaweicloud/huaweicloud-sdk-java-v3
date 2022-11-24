package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowResoleRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolver_rule")

    private Object resolverRule;

    public ShowResoleRuleResponse withResolverRule(Object resolverRule) {
        this.resolverRule = resolverRule;
        return this;
    }

    /**
     * 查询单个resolver_rule响应。
     * @return resolverRule
     */
    public Object getResolverRule() {
        return resolverRule;
    }

    public void setResolverRule(Object resolverRule) {
        this.resolverRule = resolverRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResoleRuleResponse showResoleRuleResponse = (ShowResoleRuleResponse) o;
        return Objects.equals(this.resolverRule, showResoleRuleResponse.resolverRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResoleRuleResponse {\n");
        sb.append("    resolverRule: ").append(toIndentedString(resolverRule)).append("\n");
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
