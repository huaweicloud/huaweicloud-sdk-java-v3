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
public class ListResolverQueryLogConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolver_query_log_configs")

    private List<ResolverQueryLogConfig> resolverQueryLogConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListResolverQueryLogConfigsResponse withResolverQueryLogConfigs(
        List<ResolverQueryLogConfig> resolverQueryLogConfigs) {
        this.resolverQueryLogConfigs = resolverQueryLogConfigs;
        return this;
    }

    public ListResolverQueryLogConfigsResponse addResolverQueryLogConfigsItem(
        ResolverQueryLogConfig resolverQueryLogConfigsItem) {
        if (this.resolverQueryLogConfigs == null) {
            this.resolverQueryLogConfigs = new ArrayList<>();
        }
        this.resolverQueryLogConfigs.add(resolverQueryLogConfigsItem);
        return this;
    }

    public ListResolverQueryLogConfigsResponse withResolverQueryLogConfigs(
        Consumer<List<ResolverQueryLogConfig>> resolverQueryLogConfigsSetter) {
        if (this.resolverQueryLogConfigs == null) {
            this.resolverQueryLogConfigs = new ArrayList<>();
        }
        resolverQueryLogConfigsSetter.accept(this.resolverQueryLogConfigs);
        return this;
    }

    /**
     * 解析器访问日志列表。
     * @return resolverQueryLogConfigs
     */
    public List<ResolverQueryLogConfig> getResolverQueryLogConfigs() {
        return resolverQueryLogConfigs;
    }

    public void setResolverQueryLogConfigs(List<ResolverQueryLogConfig> resolverQueryLogConfigs) {
        this.resolverQueryLogConfigs = resolverQueryLogConfigs;
    }

    public ListResolverQueryLogConfigsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResolverQueryLogConfigsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListResolverQueryLogConfigsResponse that = (ListResolverQueryLogConfigsResponse) obj;
        return Objects.equals(this.resolverQueryLogConfigs, that.resolverQueryLogConfigs)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverQueryLogConfigs, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResolverQueryLogConfigsResponse {\n");
        sb.append("    resolverQueryLogConfigs: ").append(toIndentedString(resolverQueryLogConfigs)).append("\n");
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
