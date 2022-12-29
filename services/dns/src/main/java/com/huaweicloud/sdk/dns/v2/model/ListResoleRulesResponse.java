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
public class ListResoleRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolver_rules")

    private List<ResolveRuleParam> resolverRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    public ListResoleRulesResponse withResolverRules(List<ResolveRuleParam> resolverRules) {
        this.resolverRules = resolverRules;
        return this;
    }

    public ListResoleRulesResponse addResolverRulesItem(ResolveRuleParam resolverRulesItem) {
        if (this.resolverRules == null) {
            this.resolverRules = new ArrayList<>();
        }
        this.resolverRules.add(resolverRulesItem);
        return this;
    }

    public ListResoleRulesResponse withResolverRules(Consumer<List<ResolveRuleParam>> resolverRulesSetter) {
        if (this.resolverRules == null) {
            this.resolverRules = new ArrayList<>();
        }
        resolverRulesSetter.accept(this.resolverRules);
        return this;
    }

    /**
     * 解析记录资源列表。
     * @return resolverRules
     */
    public List<ResolveRuleParam> getResolverRules() {
        return resolverRules;
    }

    public void setResolverRules(List<ResolveRuleParam> resolverRules) {
        this.resolverRules = resolverRules;
    }

    public ListResoleRulesResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListResoleRulesResponse withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResoleRulesResponse listResoleRulesResponse = (ListResoleRulesResponse) o;
        return Objects.equals(this.resolverRules, listResoleRulesResponse.resolverRules)
            && Objects.equals(this.metadata, listResoleRulesResponse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverRules, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResoleRulesResponse {\n");
        sb.append("    resolverRules: ").append(toIndentedString(resolverRules)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
