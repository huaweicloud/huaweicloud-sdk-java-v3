package com.huaweicloud.sdk.ram.v1.model;

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
public class SearchResourceSharesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_shares")

    private List<ResourceShare> resourceShares = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public SearchResourceSharesResponse withResourceShares(List<ResourceShare> resourceShares) {
        this.resourceShares = resourceShares;
        return this;
    }

    public SearchResourceSharesResponse addResourceSharesItem(ResourceShare resourceSharesItem) {
        if (this.resourceShares == null) {
            this.resourceShares = new ArrayList<>();
        }
        this.resourceShares.add(resourceSharesItem);
        return this;
    }

    public SearchResourceSharesResponse withResourceShares(Consumer<List<ResourceShare>> resourceSharesSetter) {
        if (this.resourceShares == null) {
            this.resourceShares = new ArrayList<>();
        }
        resourceSharesSetter.accept(this.resourceShares);
        return this;
    }

    /**
     * 资源共享实例的详细信息列表。
     * @return resourceShares
     */
    public List<ResourceShare> getResourceShares() {
        return resourceShares;
    }

    public void setResourceShares(List<ResourceShare> resourceShares) {
        this.resourceShares = resourceShares;
    }

    public SearchResourceSharesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public SearchResourceSharesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchResourceSharesResponse searchResourceSharesResponse = (SearchResourceSharesResponse) o;
        return Objects.equals(this.resourceShares, searchResourceSharesResponse.resourceShares)
            && Objects.equals(this.pageInfo, searchResourceSharesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShares, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResourceSharesResponse {\n");
        sb.append("    resourceShares: ").append(toIndentedString(resourceShares)).append("\n");
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
