package com.huaweicloud.sdk.config.v1.model;

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
    @JsonProperty(value = "resource_providers")

    private List<ResourceProviderResponse> resourceProviders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListProvidersResponse withResourceProviders(List<ResourceProviderResponse> resourceProviders) {
        this.resourceProviders = resourceProviders;
        return this;
    }

    public ListProvidersResponse addResourceProvidersItem(ResourceProviderResponse resourceProvidersItem) {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ArrayList<>();
        }
        this.resourceProviders.add(resourceProvidersItem);
        return this;
    }

    public ListProvidersResponse withResourceProviders(
        Consumer<List<ResourceProviderResponse>> resourceProvidersSetter) {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ArrayList<>();
        }
        resourceProvidersSetter.accept(this.resourceProviders);
        return this;
    }

    /**
     * 云服务详情列表
     * @return resourceProviders
     */
    public List<ResourceProviderResponse> getResourceProviders() {
        return resourceProviders;
    }

    public void setResourceProviders(List<ResourceProviderResponse> resourceProviders) {
        this.resourceProviders = resourceProviders;
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
        return Objects.equals(this.resourceProviders, that.resourceProviders)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceProviders, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProvidersResponse {\n");
        sb.append("    resourceProviders: ").append(toIndentedString(resourceProviders)).append("\n");
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
