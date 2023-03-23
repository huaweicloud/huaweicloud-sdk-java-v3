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
public class SearchDistinctSharedResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinct_shared_resources")

    private List<DistinctSharedResource> distinctSharedResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public SearchDistinctSharedResourcesResponse withDistinctSharedResources(
        List<DistinctSharedResource> distinctSharedResources) {
        this.distinctSharedResources = distinctSharedResources;
        return this;
    }

    public SearchDistinctSharedResourcesResponse addDistinctSharedResourcesItem(
        DistinctSharedResource distinctSharedResourcesItem) {
        if (this.distinctSharedResources == null) {
            this.distinctSharedResources = new ArrayList<>();
        }
        this.distinctSharedResources.add(distinctSharedResourcesItem);
        return this;
    }

    public SearchDistinctSharedResourcesResponse withDistinctSharedResources(
        Consumer<List<DistinctSharedResource>> distinctSharedResourcesSetter) {
        if (this.distinctSharedResources == null) {
            this.distinctSharedResources = new ArrayList<>();
        }
        distinctSharedResourcesSetter.accept(this.distinctSharedResources);
        return this;
    }

    /**
     * 不同资源的信息列表。
     * @return distinctSharedResources
     */
    public List<DistinctSharedResource> getDistinctSharedResources() {
        return distinctSharedResources;
    }

    public void setDistinctSharedResources(List<DistinctSharedResource> distinctSharedResources) {
        this.distinctSharedResources = distinctSharedResources;
    }

    public SearchDistinctSharedResourcesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public SearchDistinctSharedResourcesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        SearchDistinctSharedResourcesResponse searchDistinctSharedResourcesResponse =
            (SearchDistinctSharedResourcesResponse) o;
        return Objects.equals(this.distinctSharedResources,
            searchDistinctSharedResourcesResponse.distinctSharedResources)
            && Objects.equals(this.pageInfo, searchDistinctSharedResourcesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distinctSharedResources, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchDistinctSharedResourcesResponse {\n");
        sb.append("    distinctSharedResources: ").append(toIndentedString(distinctSharedResources)).append("\n");
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
