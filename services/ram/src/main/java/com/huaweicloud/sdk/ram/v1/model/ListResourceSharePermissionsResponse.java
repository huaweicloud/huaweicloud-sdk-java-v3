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
public class ListResourceSharePermissionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_permissions")

    private List<AssociatedPermission> associatedPermissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListResourceSharePermissionsResponse withAssociatedPermissions(
        List<AssociatedPermission> associatedPermissions) {
        this.associatedPermissions = associatedPermissions;
        return this;
    }

    public ListResourceSharePermissionsResponse addAssociatedPermissionsItem(
        AssociatedPermission associatedPermissionsItem) {
        if (this.associatedPermissions == null) {
            this.associatedPermissions = new ArrayList<>();
        }
        this.associatedPermissions.add(associatedPermissionsItem);
        return this;
    }

    public ListResourceSharePermissionsResponse withAssociatedPermissions(
        Consumer<List<AssociatedPermission>> associatedPermissionsSetter) {
        if (this.associatedPermissions == null) {
            this.associatedPermissions = new ArrayList<>();
        }
        associatedPermissionsSetter.accept(this.associatedPermissions);
        return this;
    }

    /**
     * 资源共享实例关联的共享资源权限信息列表。
     * @return associatedPermissions
     */
    public List<AssociatedPermission> getAssociatedPermissions() {
        return associatedPermissions;
    }

    public void setAssociatedPermissions(List<AssociatedPermission> associatedPermissions) {
        this.associatedPermissions = associatedPermissions;
    }

    public ListResourceSharePermissionsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResourceSharePermissionsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListResourceSharePermissionsResponse that = (ListResourceSharePermissionsResponse) obj;
        return Objects.equals(this.associatedPermissions, that.associatedPermissions)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associatedPermissions, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceSharePermissionsResponse {\n");
        sb.append("    associatedPermissions: ").append(toIndentedString(associatedPermissions)).append("\n");
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
