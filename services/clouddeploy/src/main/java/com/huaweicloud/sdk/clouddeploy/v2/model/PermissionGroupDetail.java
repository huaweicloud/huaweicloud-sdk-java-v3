package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 主机组相关权限详情类
 */
public class PermissionGroupDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_view")

    @JacksonXmlProperty(localName = "can_view")

    private Boolean canView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_edit")

    @JacksonXmlProperty(localName = "can_edit")

    private Boolean canEdit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    @JacksonXmlProperty(localName = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_add_host")

    @JacksonXmlProperty(localName = "can_add_host")

    private Boolean canAddHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_manage")

    @JacksonXmlProperty(localName = "can_manage")

    private Boolean canManage;

    public PermissionGroupDetail withCanView(Boolean canView) {
        this.canView = canView;
        return this;
    }

    /**
     * 是否有查看权限
     * @return canView
     */
    public Boolean getCanView() {
        return canView;
    }

    public void setCanView(Boolean canView) {
        this.canView = canView;
    }

    public PermissionGroupDetail withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /**
     * 是否有编辑权限
     * @return canEdit
     */
    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public PermissionGroupDetail withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 是否有删除权限
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public PermissionGroupDetail withCanAddHost(Boolean canAddHost) {
        this.canAddHost = canAddHost;
        return this;
    }

    /**
     * 是否有添加主机权限
     * @return canAddHost
     */
    public Boolean getCanAddHost() {
        return canAddHost;
    }

    public void setCanAddHost(Boolean canAddHost) {
        this.canAddHost = canAddHost;
    }

    public PermissionGroupDetail withCanManage(Boolean canManage) {
        this.canManage = canManage;
        return this;
    }

    /**
     * 是否有管理权限
     * @return canManage
     */
    public Boolean getCanManage() {
        return canManage;
    }

    public void setCanManage(Boolean canManage) {
        this.canManage = canManage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionGroupDetail permissionGroupDetail = (PermissionGroupDetail) o;
        return Objects.equals(this.canView, permissionGroupDetail.canView)
            && Objects.equals(this.canEdit, permissionGroupDetail.canEdit)
            && Objects.equals(this.canDelete, permissionGroupDetail.canDelete)
            && Objects.equals(this.canAddHost, permissionGroupDetail.canAddHost)
            && Objects.equals(this.canManage, permissionGroupDetail.canManage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canView, canEdit, canDelete, canAddHost, canManage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionGroupDetail {\n");
        sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canAddHost: ").append(toIndentedString(canAddHost)).append("\n");
        sb.append("    canManage: ").append(toIndentedString(canManage)).append("\n");
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
