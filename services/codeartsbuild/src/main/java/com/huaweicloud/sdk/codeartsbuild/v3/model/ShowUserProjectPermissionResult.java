package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

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
    @JsonProperty(value = "delete_permission")

    private Boolean deletePermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_permission")

    private Boolean viewPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_permission")

    private Boolean executePermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copy_permission")

    private Boolean copyPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbidden_permission")

    private Boolean forbiddenPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_permission")

    private Boolean managerPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_ids")

    private List<String> roleIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_names")

    private List<String> roleNames = null;

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

    public ShowUserProjectPermissionResult withDeletePermission(Boolean deletePermission) {
        this.deletePermission = deletePermission;
        return this;
    }

    /**
     * 用户是否有删除权限。
     * @return deletePermission
     */
    public Boolean getDeletePermission() {
        return deletePermission;
    }

    public void setDeletePermission(Boolean deletePermission) {
        this.deletePermission = deletePermission;
    }

    public ShowUserProjectPermissionResult withViewPermission(Boolean viewPermission) {
        this.viewPermission = viewPermission;
        return this;
    }

    /**
     * 用户是否有查看权限。
     * @return viewPermission
     */
    public Boolean getViewPermission() {
        return viewPermission;
    }

    public void setViewPermission(Boolean viewPermission) {
        this.viewPermission = viewPermission;
    }

    public ShowUserProjectPermissionResult withExecutePermission(Boolean executePermission) {
        this.executePermission = executePermission;
        return this;
    }

    /**
     * 用户是否有执行权限。
     * @return executePermission
     */
    public Boolean getExecutePermission() {
        return executePermission;
    }

    public void setExecutePermission(Boolean executePermission) {
        this.executePermission = executePermission;
    }

    public ShowUserProjectPermissionResult withCopyPermission(Boolean copyPermission) {
        this.copyPermission = copyPermission;
        return this;
    }

    /**
     * 用户是否有克隆权限。
     * @return copyPermission
     */
    public Boolean getCopyPermission() {
        return copyPermission;
    }

    public void setCopyPermission(Boolean copyPermission) {
        this.copyPermission = copyPermission;
    }

    public ShowUserProjectPermissionResult withForbiddenPermission(Boolean forbiddenPermission) {
        this.forbiddenPermission = forbiddenPermission;
        return this;
    }

    /**
     * 用户是否有禁用权限。
     * @return forbiddenPermission
     */
    public Boolean getForbiddenPermission() {
        return forbiddenPermission;
    }

    public void setForbiddenPermission(Boolean forbiddenPermission) {
        this.forbiddenPermission = forbiddenPermission;
    }

    public ShowUserProjectPermissionResult withManagerPermission(Boolean managerPermission) {
        this.managerPermission = managerPermission;
        return this;
    }

    /**
     * 用户是否有管理权限。
     * @return managerPermission
     */
    public Boolean getManagerPermission() {
        return managerPermission;
    }

    public void setManagerPermission(Boolean managerPermission) {
        this.managerPermission = managerPermission;
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

    public ShowUserProjectPermissionResult withRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
        return this;
    }

    public ShowUserProjectPermissionResult addRoleIdsItem(String roleIdsItem) {
        if (this.roleIds == null) {
            this.roleIds = new ArrayList<>();
        }
        this.roleIds.add(roleIdsItem);
        return this;
    }

    public ShowUserProjectPermissionResult withRoleIds(Consumer<List<String>> roleIdsSetter) {
        if (this.roleIds == null) {
            this.roleIds = new ArrayList<>();
        }
        roleIdsSetter.accept(this.roleIds);
        return this;
    }

    /**
     * 角色编码集合。
     * @return roleIds
     */
    public List<String> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
    }

    public ShowUserProjectPermissionResult withRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
        return this;
    }

    public ShowUserProjectPermissionResult addRoleNamesItem(String roleNamesItem) {
        if (this.roleNames == null) {
            this.roleNames = new ArrayList<>();
        }
        this.roleNames.add(roleNamesItem);
        return this;
    }

    public ShowUserProjectPermissionResult withRoleNames(Consumer<List<String>> roleNamesSetter) {
        if (this.roleNames == null) {
            this.roleNames = new ArrayList<>();
        }
        roleNamesSetter.accept(this.roleNames);
        return this;
    }

    /**
     * 角色名称集合。
     * @return roleNames
     */
    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
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
            && Objects.equals(this.groupPermission, that.groupPermission)
            && Objects.equals(this.deletePermission, that.deletePermission)
            && Objects.equals(this.viewPermission, that.viewPermission)
            && Objects.equals(this.executePermission, that.executePermission)
            && Objects.equals(this.copyPermission, that.copyPermission)
            && Objects.equals(this.forbiddenPermission, that.forbiddenPermission)
            && Objects.equals(this.managerPermission, that.managerPermission)
            && Objects.equals(this.roleId, that.roleId) && Objects.equals(this.roleName, that.roleName)
            && Objects.equals(this.roleIds, that.roleIds) && Objects.equals(this.roleNames, that.roleNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            createPermission,
            modifyPermission,
            groupPermission,
            deletePermission,
            viewPermission,
            executePermission,
            copyPermission,
            forbiddenPermission,
            managerPermission,
            roleId,
            roleName,
            roleIds,
            roleNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserProjectPermissionResult {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createPermission: ").append(toIndentedString(createPermission)).append("\n");
        sb.append("    modifyPermission: ").append(toIndentedString(modifyPermission)).append("\n");
        sb.append("    groupPermission: ").append(toIndentedString(groupPermission)).append("\n");
        sb.append("    deletePermission: ").append(toIndentedString(deletePermission)).append("\n");
        sb.append("    viewPermission: ").append(toIndentedString(viewPermission)).append("\n");
        sb.append("    executePermission: ").append(toIndentedString(executePermission)).append("\n");
        sb.append("    copyPermission: ").append(toIndentedString(copyPermission)).append("\n");
        sb.append("    forbiddenPermission: ").append(toIndentedString(forbiddenPermission)).append("\n");
        sb.append("    managerPermission: ").append(toIndentedString(managerPermission)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
        sb.append("    roleNames: ").append(toIndentedString(roleNames)).append("\n");
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
