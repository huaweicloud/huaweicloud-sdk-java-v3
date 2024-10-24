package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListManagedRolesInPermissionSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_managed_roles")

    private List<ResourceAttachedManagedPolicyDto> attachedManagedRoles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListManagedRolesInPermissionSetResponse withAttachedManagedRoles(
        List<ResourceAttachedManagedPolicyDto> attachedManagedRoles) {
        this.attachedManagedRoles = attachedManagedRoles;
        return this;
    }

    public ListManagedRolesInPermissionSetResponse addAttachedManagedRolesItem(
        ResourceAttachedManagedPolicyDto attachedManagedRolesItem) {
        if (this.attachedManagedRoles == null) {
            this.attachedManagedRoles = new ArrayList<>();
        }
        this.attachedManagedRoles.add(attachedManagedRolesItem);
        return this;
    }

    public ListManagedRolesInPermissionSetResponse withAttachedManagedRoles(
        Consumer<List<ResourceAttachedManagedPolicyDto>> attachedManagedRolesSetter) {
        if (this.attachedManagedRoles == null) {
            this.attachedManagedRoles = new ArrayList<>();
        }
        attachedManagedRolesSetter.accept(this.attachedManagedRoles);
        return this;
    }

    /**
     * IAM系统策略列表
     * @return attachedManagedRoles
     */
    public List<ResourceAttachedManagedPolicyDto> getAttachedManagedRoles() {
        return attachedManagedRoles;
    }

    public void setAttachedManagedRoles(List<ResourceAttachedManagedPolicyDto> attachedManagedRoles) {
        this.attachedManagedRoles = attachedManagedRoles;
    }

    public ListManagedRolesInPermissionSetResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListManagedRolesInPermissionSetResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
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
        ListManagedRolesInPermissionSetResponse that = (ListManagedRolesInPermissionSetResponse) obj;
        return Objects.equals(this.attachedManagedRoles, that.attachedManagedRoles)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedManagedRoles, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListManagedRolesInPermissionSetResponse {\n");
        sb.append("    attachedManagedRoles: ").append(toIndentedString(attachedManagedRoles)).append("\n");
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
