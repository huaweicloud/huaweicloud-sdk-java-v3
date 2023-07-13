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
public class SearchResourceShareAssociationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_associations")

    private List<ResourceShareAssociation> resourceShareAssociations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public SearchResourceShareAssociationsResponse withResourceShareAssociations(
        List<ResourceShareAssociation> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }

    public SearchResourceShareAssociationsResponse addResourceShareAssociationsItem(
        ResourceShareAssociation resourceShareAssociationsItem) {
        if (this.resourceShareAssociations == null) {
            this.resourceShareAssociations = new ArrayList<>();
        }
        this.resourceShareAssociations.add(resourceShareAssociationsItem);
        return this;
    }

    public SearchResourceShareAssociationsResponse withResourceShareAssociations(
        Consumer<List<ResourceShareAssociation>> resourceShareAssociationsSetter) {
        if (this.resourceShareAssociations == null) {
            this.resourceShareAssociations = new ArrayList<>();
        }
        resourceShareAssociationsSetter.accept(this.resourceShareAssociations);
        return this;
    }

    /**
     * 绑定的详细信息列表。
     * @return resourceShareAssociations
     */
    public List<ResourceShareAssociation> getResourceShareAssociations() {
        return resourceShareAssociations;
    }

    public void setResourceShareAssociations(List<ResourceShareAssociation> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
    }

    public SearchResourceShareAssociationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public SearchResourceShareAssociationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        SearchResourceShareAssociationsResponse that = (SearchResourceShareAssociationsResponse) obj;
        return Objects.equals(this.resourceShareAssociations, that.resourceShareAssociations)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareAssociations, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResourceShareAssociationsResponse {\n");
        sb.append("    resourceShareAssociations: ").append(toIndentedString(resourceShareAssociations)).append("\n");
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
