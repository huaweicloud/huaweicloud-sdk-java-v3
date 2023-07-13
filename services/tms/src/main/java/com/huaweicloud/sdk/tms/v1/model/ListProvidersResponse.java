package com.huaweicloud.sdk.tms.v1.model;

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
public class ListProvidersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "providers")

    private List<ProviderResponseBody> providers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListProvidersResponse withProviders(List<ProviderResponseBody> providers) {
        this.providers = providers;
        return this;
    }

    public ListProvidersResponse addProvidersItem(ProviderResponseBody providersItem) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        this.providers.add(providersItem);
        return this;
    }

    public ListProvidersResponse withProviders(Consumer<List<ProviderResponseBody>> providersSetter) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        providersSetter.accept(this.providers);
        return this;
    }

    /**
     * 云服务列表
     * @return providers
     */
    public List<ProviderResponseBody> getProviders() {
        return providers;
    }

    public void setProviders(List<ProviderResponseBody> providers) {
        this.providers = providers;
    }

    public ListProvidersResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 当前支持的云服务总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProvidersResponse that = (ListProvidersResponse) obj;
        return Objects.equals(this.providers, that.providers) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providers, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProvidersResponse {\n");
        sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
