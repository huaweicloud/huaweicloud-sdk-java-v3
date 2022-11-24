package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateResolveRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolver_rules")

    private List<ResolveRuleParam> resolverRules = null;

    public UpdateResolveRuleResponse withResolverRules(List<ResolveRuleParam> resolverRules) {
        this.resolverRules = resolverRules;
        return this;
    }

    public UpdateResolveRuleResponse addResolverRulesItem(ResolveRuleParam resolverRulesItem) {
        if (this.resolverRules == null) {
            this.resolverRules = new ArrayList<>();
        }
        this.resolverRules.add(resolverRulesItem);
        return this;
    }

    public UpdateResolveRuleResponse withResolverRules(Consumer<List<ResolveRuleParam>> resolverRulesSetter) {
        if (this.resolverRules == null) {
            this.resolverRules = new ArrayList<>();
        }
        resolverRulesSetter.accept(this.resolverRules);
        return this;
    }

    /**
     * 查询resolver_rule的列表响应。
     * @return resolverRules
     */
    public List<ResolveRuleParam> getResolverRules() {
        return resolverRules;
    }

    public void setResolverRules(List<ResolveRuleParam> resolverRules) {
        this.resolverRules = resolverRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateResolveRuleResponse updateResolveRuleResponse = (UpdateResolveRuleResponse) o;
        return Objects.equals(this.resolverRules, updateResolveRuleResponse.resolverRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResolveRuleResponse {\n");
        sb.append("    resolverRules: ").append(toIndentedString(resolverRules)).append("\n");
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
