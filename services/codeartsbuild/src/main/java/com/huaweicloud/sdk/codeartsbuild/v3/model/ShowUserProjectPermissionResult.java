package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 结果
 */
public class ShowUserProjectPermissionResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_permission")

    private Boolean createPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_permission")

    private Boolean modifyPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_permission")

    private Boolean groupPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    public ShowUserProjectPermissionResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工程编号
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowUserProjectPermissionResult withCreatePermission(Boolean createPermission) {
        this.createPermission = createPermission;
        return this;
    }

    /**
     * 用户是否有创建权限
     * @return createPermission
     */
    public Boolean getCreatePermission() {
        return createPermission;
    }

    public void setCreatePermission(Boolean createPermission) {
        this.createPermission = createPermission;
    }

    public ShowUserProjectPermissionResult withModifyPermission(Boolean modifyPermission) {
        this.modifyPermission = modifyPermission;
        return this;
    }

    /**
     * 用户是否有修改权限
     * @return modifyPermission
     */
    public Boolean getModifyPermission() {
        return modifyPermission;
    }

    public void setModifyPermission(Boolean modifyPermission) {
        this.modifyPermission = modifyPermission;
    }

    public ShowUserProjectPermissionResult withGroupPermission(Boolean groupPermission) {
        this.groupPermission = groupPermission;
        return this;
    }

    /**
     * 用户是否有分类权限
     * @return groupPermission
     */
    public Boolean getGroupPermission() {
        return groupPermission;
    }

    public void setGroupPermission(Boolean groupPermission) {
        this.groupPermission = groupPermission;
    }

    public ShowUserProjectPermissionResult withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色ID
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public ShowUserProjectPermissionResult withRoleName(String roleName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserProjectPermissionResult that = (ShowUserProjectPermissionResult) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.createPermission, that.createPermission)
            && Objects.equals(this.modifyPermission, that.modifyPermission)
            && Objects.equals(this.groupPermission, that.groupPermission) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, createPermission, modifyPermission, groupPermission, roleId, roleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserProjectPermissionResult {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createPermission: ").append(toIndentedString(createPermission)).append("\n");
        sb.append("    modifyPermission: ").append(toIndentedString(modifyPermission)).append("\n");
        sb.append("    groupPermission: ").append(toIndentedString(groupPermission)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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
