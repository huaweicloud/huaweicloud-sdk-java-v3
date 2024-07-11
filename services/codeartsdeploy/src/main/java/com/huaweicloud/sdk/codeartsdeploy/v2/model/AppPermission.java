package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AppPermission
 */
public class AppPermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_role_id")

    private String devRoleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_modify")

    private Boolean canModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_view")

    private Boolean canView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_execute")

    private Boolean canExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_copy")

    private Boolean canCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_manage")

    private Boolean canManage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_create_env")

    private Boolean canCreateEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_disable")

    private Boolean canDisable;

    public AppPermission withDevRoleId(String devRoleId) {
        this.devRoleId = devRoleId;
        return this;
    }

    /**
     * 角色id
     * @return devRoleId
     */
    public String getDevRoleId() {
        return devRoleId;
    }

    public void setDevRoleId(String devRoleId) {
        this.devRoleId = devRoleId;
    }

    public AppPermission withCanModify(Boolean canModify) {
        this.canModify = canModify;
        return this;
    }

    /**
     * 是否具有编辑权限
     * @return canModify
     */
    public Boolean getCanModify() {
        return canModify;
    }

    public void setCanModify(Boolean canModify) {
        this.canModify = canModify;
    }

    public AppPermission withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 是否具有删除权限
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public AppPermission withCanView(Boolean canView) {
        this.canView = canView;
        return this;
    }

    /**
     * 是否具有查看权限
     * @return canView
     */
    public Boolean getCanView() {
        return canView;
    }

    public void setCanView(Boolean canView) {
        this.canView = canView;
    }

    public AppPermission withCanExecute(Boolean canExecute) {
        this.canExecute = canExecute;
        return this;
    }

    /**
     * 是否具有执行权限
     * @return canExecute
     */
    public Boolean getCanExecute() {
        return canExecute;
    }

    public void setCanExecute(Boolean canExecute) {
        this.canExecute = canExecute;
    }

    public AppPermission withCanCopy(Boolean canCopy) {
        this.canCopy = canCopy;
        return this;
    }

    /**
     * 是否具有复制权限
     * @return canCopy
     */
    public Boolean getCanCopy() {
        return canCopy;
    }

    public void setCanCopy(Boolean canCopy) {
        this.canCopy = canCopy;
    }

    public AppPermission withCanManage(Boolean canManage) {
        this.canManage = canManage;
        return this;
    }

    /**
     * 是否具有权限管理权限
     * @return canManage
     */
    public Boolean getCanManage() {
        return canManage;
    }

    public void setCanManage(Boolean canManage) {
        this.canManage = canManage;
    }

    public AppPermission withCanCreateEnv(Boolean canCreateEnv) {
        this.canCreateEnv = canCreateEnv;
        return this;
    }

    /**
     * 是否具有创建环境权限
     * @return canCreateEnv
     */
    public Boolean getCanCreateEnv() {
        return canCreateEnv;
    }

    public void setCanCreateEnv(Boolean canCreateEnv) {
        this.canCreateEnv = canCreateEnv;
    }

    public AppPermission withCanDisable(Boolean canDisable) {
        this.canDisable = canDisable;
        return this;
    }

    /**
     * 是否具有禁用权限
     * @return canDisable
     */
    public Boolean getCanDisable() {
        return canDisable;
    }

    public void setCanDisable(Boolean canDisable) {
        this.canDisable = canDisable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppPermission that = (AppPermission) obj;
        return Objects.equals(this.devRoleId, that.devRoleId) && Objects.equals(this.canModify, that.canModify)
            && Objects.equals(this.canDelete, that.canDelete) && Objects.equals(this.canView, that.canView)
            && Objects.equals(this.canExecute, that.canExecute) && Objects.equals(this.canCopy, that.canCopy)
            && Objects.equals(this.canManage, that.canManage) && Objects.equals(this.canCreateEnv, that.canCreateEnv)
            && Objects.equals(this.canDisable, that.canDisable);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(devRoleId, canModify, canDelete, canView, canExecute, canCopy, canManage, canCreateEnv, canDisable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppPermission {\n");
        sb.append("    devRoleId: ").append(toIndentedString(devRoleId)).append("\n");
        sb.append("    canModify: ").append(toIndentedString(canModify)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
        sb.append("    canExecute: ").append(toIndentedString(canExecute)).append("\n");
        sb.append("    canCopy: ").append(toIndentedString(canCopy)).append("\n");
        sb.append("    canManage: ").append(toIndentedString(canManage)).append("\n");
        sb.append("    canCreateEnv: ").append(toIndentedString(canCreateEnv)).append("\n");
        sb.append("    canDisable: ").append(toIndentedString(canDisable)).append("\n");
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
