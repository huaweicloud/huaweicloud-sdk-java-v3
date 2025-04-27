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
public class ListResolverRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolver_rules")

    private List<ListResolverRuleParam> resolverRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListResolverRulesResponse withResolverRules(List<ListResolverRuleParam> resolverRules) {
        this.resolverRules = resolverRules;
        return this;
    }

    public ListResolverRulesResponse addResolverRulesItem(ListResolverRuleParam resolverRulesItem) {
        if (this.resolverRules == null) {
            this.resolverRules = new ArrayList<>();
        }
        this.resolverRules.add(resolverRulesItem);
        return this;
    }

    public ListResolverRulesResponse withResolverRules(Consumer<List<ListResolverRuleParam>> resolverRulesSetter) {
        if (this.resolverRules == null) {
            this.resolverRules = new ArrayList<>();
        }
        resolverRulesSetter.accept(this.resolverRules);
        return this;
    }

    /**
     * 解析器转发规则列表。
     * @return resolverRules
     */
    public List<ListResolverRuleParam> getResolverRules() {
        return resolverRules;
    }

    public void setResolverRules(List<ListResolverRuleParam> resolverRules) {
        this.resolverRules = resolverRules;
    }

    public ListResolverRulesResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ListResolverRulesResponse withLinks(Consumer<PageLink> linksSetter) {
        if (this.links == null) {
            this.links = new PageLink();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public PageLink getLinks() {
        return links;
    }

    public void setLinks(PageLink links) {
        this.links = links;
    }

    public ListResolverRulesResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListResolverRulesResponse withMetadata(Consumer<Metadata> metadataSetter) {
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

    public ListResolverRulesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResolverRulesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResolverRulesResponse that = (ListResolverRulesResponse) obj;
        return Objects.equals(this.resolverRules, that.resolverRules) && Objects.equals(this.links, that.links)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverRules, links, metadata, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResolverRulesResponse {\n");
        sb.append("    resolverRules: ").append(toIndentedString(resolverRules)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
