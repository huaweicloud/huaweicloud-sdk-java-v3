package com.huaweicloud.sdk.rfs.v1.model;

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
public class ListPrivateProvidersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "providers")

    private List<PrivateProviderSummary> providers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListPrivateProvidersResponse withProviders(List<PrivateProviderSummary> providers) {
        this.providers = providers;
        return this;
    }

    public ListPrivateProvidersResponse addProvidersItem(PrivateProviderSummary providersItem) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        this.providers.add(providersItem);
        return this;
    }

    public ListPrivateProvidersResponse withProviders(Consumer<List<PrivateProviderSummary>> providersSetter) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        providersSetter.accept(this.providers);
        return this;
    }

    /**
     * 私有provider的列表。默认以创建时间降序排序。
     * @return providers
     */
    public List<PrivateProviderSummary> getProviders() {
        return providers;
    }

    public void setProviders(List<PrivateProviderSummary> providers) {
        this.providers = providers;
    }

    public ListPrivateProvidersResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPrivateProvidersResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListPrivateProvidersResponse that = (ListPrivateProvidersResponse) obj;
        return Objects.equals(this.providers, that.providers) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providers, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateProvidersResponse {\n");
        sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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
