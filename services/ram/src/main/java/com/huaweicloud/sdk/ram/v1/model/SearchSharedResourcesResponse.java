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
public class SearchSharedResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_resources")

    private List<SharedResource> sharedResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public SearchSharedResourcesResponse withSharedResources(List<SharedResource> sharedResources) {
        this.sharedResources = sharedResources;
        return this;
    }

    public SearchSharedResourcesResponse addSharedResourcesItem(SharedResource sharedResourcesItem) {
        if (this.sharedResources == null) {
            this.sharedResources = new ArrayList<>();
        }
        this.sharedResources.add(sharedResourcesItem);
        return this;
    }

    public SearchSharedResourcesResponse withSharedResources(Consumer<List<SharedResource>> sharedResourcesSetter) {
        if (this.sharedResources == null) {
            this.sharedResources = new ArrayList<>();
        }
        sharedResourcesSetter.accept(this.sharedResources);
        return this;
    }

    /**
     * 共享资源的信息列表。
     * @return sharedResources
     */
    public List<SharedResource> getSharedResources() {
        return sharedResources;
    }

    public void setSharedResources(List<SharedResource> sharedResources) {
        this.sharedResources = sharedResources;
    }

    public SearchSharedResourcesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public SearchSharedResourcesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        SearchSharedResourcesResponse that = (SearchSharedResourcesResponse) obj;
        return Objects.equals(this.sharedResources, that.sharedResources)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharedResources, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchSharedResourcesResponse {\n");
        sb.append("    sharedResources: ").append(toIndentedString(sharedResources)).append("\n");
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
