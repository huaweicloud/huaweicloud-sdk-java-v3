package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RoleSyncDto
 */
public class RoleSyncDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_sync_enabled")

    private Boolean roleSyncEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_type")

    private String roleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_chinese_name")

    private String roleChineseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public RoleSyncDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 角色记录id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoleSyncDto withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * **参数解释：** 角色id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public RoleSyncDto withRoleSyncEnabled(Boolean roleSyncEnabled) {
        this.roleSyncEnabled = roleSyncEnabled;
        return this;
    }

    /**
     * **参数解释：** 角色同步开关。
     * @return roleSyncEnabled
     */
    public Boolean getRoleSyncEnabled() {
        return roleSyncEnabled;
    }

    public void setRoleSyncEnabled(Boolean roleSyncEnabled) {
        this.roleSyncEnabled = roleSyncEnabled;
    }

    public RoleSyncDto withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * **参数解释：** 角色名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public RoleSyncDto withRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * **参数解释：** 角色类型。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleType
     */
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public RoleSyncDto withRoleChineseName(String roleChineseName) {
        this.roleChineseName = roleChineseName;
        return this;
    }

    /**
     * **参数解释：** 角色中文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleChineseName
     */
    public String getRoleChineseName() {
        return roleChineseName;
    }

    public void setRoleChineseName(String roleChineseName) {
        this.roleChineseName = roleChineseName;
    }

    public RoleSyncDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RoleSyncDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleSyncDto that = (RoleSyncDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.roleSyncEnabled, that.roleSyncEnabled)
            && Objects.equals(this.roleName, that.roleName) && Objects.equals(this.roleType, that.roleType)
            && Objects.equals(this.roleChineseName, that.roleChineseName)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleId, roleSyncEnabled, roleName, roleType, roleChineseName, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleSyncDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleSyncEnabled: ").append(toIndentedString(roleSyncEnabled)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
        sb.append("    roleChineseName: ").append(toIndentedString(roleChineseName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
