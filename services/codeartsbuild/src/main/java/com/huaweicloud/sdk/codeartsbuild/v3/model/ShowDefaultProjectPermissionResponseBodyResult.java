package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 权限信息
 */
public class ShowDefaultProjectPermissionResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private Integer roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_copy")

    private Boolean isCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete")

    private Boolean isDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_execute")

    private Boolean isExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_forbidden")

    private Boolean isForbidden;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_manager")

    private Boolean isManager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_modify")

    private Boolean isModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_view")

    private Boolean isView;

    public ShowDefaultProjectPermissionResponseBodyResult withRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色ID
     * @return roleId
     */
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public ShowDefaultProjectPermissionResponseBodyResult withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * 角色名
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public ShowDefaultProjectPermissionResponseBodyResult withIsCopy(Boolean isCopy) {
        this.isCopy = isCopy;
        return this;
    }

    /**
     * 是否有复制任务权限
     * @return isCopy
     */
    public Boolean getIsCopy() {
        return isCopy;
    }

    public void setIsCopy(Boolean isCopy) {
        this.isCopy = isCopy;
    }

    public ShowDefaultProjectPermissionResponseBodyResult withIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    /**
     * 是否有删除任务权限
     * @return isDelete
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public ShowDefaultProjectPermissionResponseBodyResult withIsExecute(Boolean isExecute) {
        this.isExecute = isExecute;
        return this;
    }

    /**
     * 是否有执行任务权限
     * @return isExecute
     */
    public Boolean getIsExecute() {
        return isExecute;
    }

    public void setIsExecute(Boolean isExecute) {
        this.isExecute = isExecute;
    }

    public ShowDefaultProjectPermissionResponseBodyResult withIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
        return this;
    }

    /**
     * 是否有禁用任务权限
     * @return isForbidden
     */
    public Boolean getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
    }

    public ShowDefaultProjectPermissionResponseBodyResult withIsManager(Boolean isManager) {
        this.isManager = isManager;
        return this;
    }

    /**
     * 是否有管理任务权限
     * @return isManager
     */
    public Boolean getIsManager() {
        return isManager;
    }

    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }

    public ShowDefaultProjectPermissionResponseBodyResult withIsModify(Boolean isModify) {
        this.isModify = isModify;
        return this;
    }

    /**
     * 是否有修改任务权限
     * @return isModify
     */
    public Boolean getIsModify() {
        return isModify;
    }

    public void setIsModify(Boolean isModify) {
        this.isModify = isModify;
    }

    public ShowDefaultProjectPermissionResponseBodyResult withIsView(Boolean isView) {
        this.isView = isView;
        return this;
    }

    /**
     * 是否有查看任务权限
     * @return isView
     */
    public Boolean getIsView() {
        return isView;
    }

    public void setIsView(Boolean isView) {
        this.isView = isView;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDefaultProjectPermissionResponseBodyResult that = (ShowDefaultProjectPermissionResponseBodyResult) obj;
        return Objects.equals(this.roleId, that.roleId) && Objects.equals(this.roleName, that.roleName)
            && Objects.equals(this.isCopy, that.isCopy) && Objects.equals(this.isDelete, that.isDelete)
            && Objects.equals(this.isExecute, that.isExecute) && Objects.equals(this.isForbidden, that.isForbidden)
            && Objects.equals(this.isManager, that.isManager) && Objects.equals(this.isModify, that.isModify)
            && Objects.equals(this.isView, that.isView);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, isCopy, isDelete, isExecute, isForbidden, isManager, isModify, isView);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDefaultProjectPermissionResponseBodyResult {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    isCopy: ").append(toIndentedString(isCopy)).append("\n");
        sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
        sb.append("    isExecute: ").append(toIndentedString(isExecute)).append("\n");
        sb.append("    isForbidden: ").append(toIndentedString(isForbidden)).append("\n");
        sb.append("    isManager: ").append(toIndentedString(isManager)).append("\n");
        sb.append("    isModify: ").append(toIndentedString(isModify)).append("\n");
        sb.append("    isView: ").append(toIndentedString(isView)).append("\n");
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
