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
public class SearchResourceShareInvitationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_invitations")

    private List<ResourceShareInvitation> resourceShareInvitations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public SearchResourceShareInvitationResponse withResourceShareInvitations(
        List<ResourceShareInvitation> resourceShareInvitations) {
        this.resourceShareInvitations = resourceShareInvitations;
        return this;
    }

    public SearchResourceShareInvitationResponse addResourceShareInvitationsItem(
        ResourceShareInvitation resourceShareInvitationsItem) {
        if (this.resourceShareInvitations == null) {
            this.resourceShareInvitations = new ArrayList<>();
        }
        this.resourceShareInvitations.add(resourceShareInvitationsItem);
        return this;
    }

    public SearchResourceShareInvitationResponse withResourceShareInvitations(
        Consumer<List<ResourceShareInvitation>> resourceShareInvitationsSetter) {
        if (this.resourceShareInvitations == null) {
            this.resourceShareInvitations = new ArrayList<>();
        }
        resourceShareInvitationsSetter.accept(this.resourceShareInvitations);
        return this;
    }

    /**
     * Get resourceShareInvitations
     * @return resourceShareInvitations
     */
    public List<ResourceShareInvitation> getResourceShareInvitations() {
        return resourceShareInvitations;
    }

    public void setResourceShareInvitations(List<ResourceShareInvitation> resourceShareInvitations) {
        this.resourceShareInvitations = resourceShareInvitations;
    }

    public SearchResourceShareInvitationResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public SearchResourceShareInvitationResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        SearchResourceShareInvitationResponse that = (SearchResourceShareInvitationResponse) obj;
        return Objects.equals(this.resourceShareInvitations, that.resourceShareInvitations)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareInvitations, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResourceShareInvitationResponse {\n");
        sb.append("    resourceShareInvitations: ").append(toIndentedString(resourceShareInvitations)).append("\n");
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
