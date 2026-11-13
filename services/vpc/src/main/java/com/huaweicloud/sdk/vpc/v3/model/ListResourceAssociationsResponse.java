package com.huaweicloud.sdk.vpc.v3.model;

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
public class ListResourceAssociationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_associations")

    private List<ResourceAssociation> resourceAssociations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListResourceAssociationsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**： 请求ID。 **取值范围**： 不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListResourceAssociationsResponse withResourceAssociations(List<ResourceAssociation> resourceAssociations) {
        this.resourceAssociations = resourceAssociations;
        return this;
    }

    public ListResourceAssociationsResponse addResourceAssociationsItem(ResourceAssociation resourceAssociationsItem) {
        if (this.resourceAssociations == null) {
            this.resourceAssociations = new ArrayList<>();
        }
        this.resourceAssociations.add(resourceAssociationsItem);
        return this;
    }

    public ListResourceAssociationsResponse withResourceAssociations(
        Consumer<List<ResourceAssociation>> resourceAssociationsSetter) {
        if (this.resourceAssociations == null) {
            this.resourceAssociations = new ArrayList<>();
        }
        resourceAssociationsSetter.accept(this.resourceAssociations);
        return this;
    }

    /**
     * **参数解释**： 资源关联实例信息列表。 **取值范围**： 不涉及。
     * @return resourceAssociations
     */
    public List<ResourceAssociation> getResourceAssociations() {
        return resourceAssociations;
    }

    public void setResourceAssociations(List<ResourceAssociation> resourceAssociations) {
        this.resourceAssociations = resourceAssociations;
    }

    public ListResourceAssociationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResourceAssociationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListResourceAssociationsResponse that = (ListResourceAssociationsResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.resourceAssociations, that.resourceAssociations)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, resourceAssociations, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceAssociationsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    resourceAssociations: ").append(toIndentedString(resourceAssociations)).append("\n");
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
