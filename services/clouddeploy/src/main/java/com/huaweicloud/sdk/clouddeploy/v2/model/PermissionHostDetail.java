package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 主机相关权限详情类 */
public class PermissionHostDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_view")

    private Boolean canView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_edit")

    private Boolean canEdit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_add_host")

    private Boolean canAddHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_connection_test")

    private Boolean canConnectionTest;

    public PermissionHostDetail withCanView(Boolean canView) {
        this.canView = canView;
        return this;
    }

    /** 是否有查看权限
     * 
     * @return canView */
    public Boolean getCanView() {
        return canView;
    }

    public void setCanView(Boolean canView) {
        this.canView = canView;
    }

    public PermissionHostDetail withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /** 是否有编辑权限
     * 
     * @return canEdit */
    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public PermissionHostDetail withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /** 是否有删除权限
     * 
     * @return canDelete */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public PermissionHostDetail withCanAddHost(Boolean canAddHost) {
        this.canAddHost = canAddHost;
        return this;
    }

    /** 是否有添加主机权限
     * 
     * @return canAddHost */
    public Boolean getCanAddHost() {
        return canAddHost;
    }

    public void setCanAddHost(Boolean canAddHost) {
        this.canAddHost = canAddHost;
    }

    public PermissionHostDetail withCanConnectionTest(Boolean canConnectionTest) {
        this.canConnectionTest = canConnectionTest;
        return this;
    }

    /** 是否测试主机连通性权限
     * 
     * @return canConnectionTest */
    public Boolean getCanConnectionTest() {
        return canConnectionTest;
    }

    public void setCanConnectionTest(Boolean canConnectionTest) {
        this.canConnectionTest = canConnectionTest;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionHostDetail permissionHostDetail = (PermissionHostDetail) o;
        return Objects.equals(this.canView, permissionHostDetail.canView)
            && Objects.equals(this.canEdit, permissionHostDetail.canEdit)
            && Objects.equals(this.canDelete, permissionHostDetail.canDelete)
            && Objects.equals(this.canAddHost, permissionHostDetail.canAddHost)
            && Objects.equals(this.canConnectionTest, permissionHostDetail.canConnectionTest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canView, canEdit, canDelete, canAddHost, canConnectionTest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionHostDetail {\n");
        sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canAddHost: ").append(toIndentedString(canAddHost)).append("\n");
        sb.append("    canConnectionTest: ").append(toIndentedString(canConnectionTest)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
