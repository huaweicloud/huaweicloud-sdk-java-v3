package com.huaweicloud.sdk.rc.v1.model;

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
public class ListResourceGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_groups")

    private List<CreateGroupsResponse> resourceGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListResourceGroupsResponse withResourceGroups(List<CreateGroupsResponse> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }

    public ListResourceGroupsResponse addResourceGroupsItem(CreateGroupsResponse resourceGroupsItem) {
        if (this.resourceGroups == null) {
            this.resourceGroups = new ArrayList<>();
        }
        this.resourceGroups.add(resourceGroupsItem);
        return this;
    }

    public ListResourceGroupsResponse withResourceGroups(Consumer<List<CreateGroupsResponse>> resourceGroupsSetter) {
        if (this.resourceGroups == null) {
            this.resourceGroups = new ArrayList<>();
        }
        resourceGroupsSetter.accept(this.resourceGroups);
        return this;
    }

    /**
     * Get resourceGroups
     * @return resourceGroups
     */
    public List<CreateGroupsResponse> getResourceGroups() {
        return resourceGroups;
    }

    public void setResourceGroups(List<CreateGroupsResponse> resourceGroups) {
        this.resourceGroups = resourceGroups;
    }

    public ListResourceGroupsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResourceGroupsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListResourceGroupsResponse that = (ListResourceGroupsResponse) obj;
        return Objects.equals(this.resourceGroups, that.resourceGroups) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceGroups, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceGroupsResponse {\n");
        sb.append("    resourceGroups: ").append(toIndentedString(resourceGroups)).append("\n");
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
