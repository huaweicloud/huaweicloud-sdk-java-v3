package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobRolePermission
 */
public class JobRolePermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private Integer roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devuc_role_id")

    private String devucRoleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_modify")

    private Boolean isModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete")

    private Boolean isDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_view")

    private Boolean isView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_execute")

    private Boolean isExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_copy")

    private Boolean isCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_forbidden")

    private Boolean isForbidden;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_manager")

    private Boolean isManager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public JobRolePermission withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 主键ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JobRolePermission withRoleId(Integer roleId) {
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

    public JobRolePermission withDevucRoleId(String devucRoleId) {
        this.devucRoleId = devucRoleId;
        return this;
    }

    /**
     * devuc的角色ID
     * @return devucRoleId
     */
    public String getDevucRoleId() {
        return devucRoleId;
    }

    public void setDevucRoleId(String devucRoleId) {
        this.devucRoleId = devucRoleId;
    }

    public JobRolePermission withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * 角色名称
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public JobRolePermission withIsModify(Boolean isModify) {
        this.isModify = isModify;
        return this;
    }

    /**
     * 修改权限
     * @return isModify
     */
    public Boolean getIsModify() {
        return isModify;
    }

    public void setIsModify(Boolean isModify) {
        this.isModify = isModify;
    }

    public JobRolePermission withIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    /**
     * 删除权限
     * @return isDelete
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public JobRolePermission withIsView(Boolean isView) {
        this.isView = isView;
        return this;
    }

    /**
     * 查看权限
     * @return isView
     */
    public Boolean getIsView() {
        return isView;
    }

    public void setIsView(Boolean isView) {
        this.isView = isView;
    }

    public JobRolePermission withIsExecute(Boolean isExecute) {
        this.isExecute = isExecute;
        return this;
    }

    /**
     * 执行权限
     * @return isExecute
     */
    public Boolean getIsExecute() {
        return isExecute;
    }

    public void setIsExecute(Boolean isExecute) {
        this.isExecute = isExecute;
    }

    public JobRolePermission withIsCopy(Boolean isCopy) {
        this.isCopy = isCopy;
        return this;
    }

    /**
     * 复制权限
     * @return isCopy
     */
    public Boolean getIsCopy() {
        return isCopy;
    }

    public void setIsCopy(Boolean isCopy) {
        this.isCopy = isCopy;
    }

    public JobRolePermission withIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
        return this;
    }

    /**
     * 禁用权限
     * @return isForbidden
     */
    public Boolean getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
    }

    public JobRolePermission withIsManager(Boolean isManager) {
        this.isManager = isManager;
        return this;
    }

    /**
     * 管理权限
     * @return isManager
     */
    public Boolean getIsManager() {
        return isManager;
    }

    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }

    public JobRolePermission withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobRolePermission that = (JobRolePermission) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.devucRoleId, that.devucRoleId) && Objects.equals(this.roleName, that.roleName)
            && Objects.equals(this.isModify, that.isModify) && Objects.equals(this.isDelete, that.isDelete)
            && Objects.equals(this.isView, that.isView) && Objects.equals(this.isExecute, that.isExecute)
            && Objects.equals(this.isCopy, that.isCopy) && Objects.equals(this.isForbidden, that.isForbidden)
            && Objects.equals(this.isManager, that.isManager) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            roleId,
            devucRoleId,
            roleName,
            isModify,
            isDelete,
            isView,
            isExecute,
            isCopy,
            isForbidden,
            isManager,
            count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobRolePermission {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    devucRoleId: ").append(toIndentedString(devucRoleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    isModify: ").append(toIndentedString(isModify)).append("\n");
        sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
        sb.append("    isView: ").append(toIndentedString(isView)).append("\n");
        sb.append("    isExecute: ").append(toIndentedString(isExecute)).append("\n");
        sb.append("    isCopy: ").append(toIndentedString(isCopy)).append("\n");
        sb.append("    isForbidden: ").append(toIndentedString(isForbidden)).append("\n");
        sb.append("    isManager: ").append(toIndentedString(isManager)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
