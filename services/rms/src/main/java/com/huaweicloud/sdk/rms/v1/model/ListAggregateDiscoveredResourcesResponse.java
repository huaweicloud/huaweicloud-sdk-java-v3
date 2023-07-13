package com.huaweicloud.sdk.rms.v1.model;

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
public class ListAggregateDiscoveredResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_identifiers")

    private List<ResourceIdentifier> resourceIdentifiers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAggregateDiscoveredResourcesResponse withResourceIdentifiers(
        List<ResourceIdentifier> resourceIdentifiers) {
        this.resourceIdentifiers = resourceIdentifiers;
        return this;
    }

    public ListAggregateDiscoveredResourcesResponse addResourceIdentifiersItem(
        ResourceIdentifier resourceIdentifiersItem) {
        if (this.resourceIdentifiers == null) {
            this.resourceIdentifiers = new ArrayList<>();
        }
        this.resourceIdentifiers.add(resourceIdentifiersItem);
        return this;
    }

    public ListAggregateDiscoveredResourcesResponse withResourceIdentifiers(
        Consumer<List<ResourceIdentifier>> resourceIdentifiersSetter) {
        if (this.resourceIdentifiers == null) {
            this.resourceIdentifiers = new ArrayList<>();
        }
        resourceIdentifiersSetter.accept(this.resourceIdentifiers);
        return this;
    }

    /**
     * 资源信息列表。
     * @return resourceIdentifiers
     */
    public List<ResourceIdentifier> getResourceIdentifiers() {
        return resourceIdentifiers;
    }

    public void setResourceIdentifiers(List<ResourceIdentifier> resourceIdentifiers) {
        this.resourceIdentifiers = resourceIdentifiers;
    }

    public ListAggregateDiscoveredResourcesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAggregateDiscoveredResourcesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListAggregateDiscoveredResourcesResponse that = (ListAggregateDiscoveredResourcesResponse) obj;
        return Objects.equals(this.resourceIdentifiers, that.resourceIdentifiers)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceIdentifiers, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAggregateDiscoveredResourcesResponse {\n");
        sb.append("    resourceIdentifiers: ").append(toIndentedString(resourceIdentifiers)).append("\n");
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
