package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateResolverRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolver_rule")

    private ResolverRuleParam resolverRule;

    public CreateResolverRuleResponse withResolverRule(ResolverRuleParam resolverRule) {
        this.resolverRule = resolverRule;
        return this;
    }

    public CreateResolverRuleResponse withResolverRule(Consumer<ResolverRuleParam> resolverRuleSetter) {
        if (this.resolverRule == null) {
            this.resolverRule = new ResolverRuleParam();
            resolverRuleSetter.accept(this.resolverRule);
        }

        return this;
    }

    /**
     * Get resolverRule
     * @return resolverRule
     */
    public ResolverRuleParam getResolverRule() {
        return resolverRule;
    }

    public void setResolverRule(ResolverRuleParam resolverRule) {
        this.resolverRule = resolverRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResolverRuleResponse that = (CreateResolverRuleResponse) obj;
        return Objects.equals(this.resolverRule, that.resolverRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResolverRuleResponse {\n");
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
