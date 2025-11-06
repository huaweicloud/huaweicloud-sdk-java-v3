package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponsePermissionInfo
 */
public class ResponsePermissionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name_cn")

    private String roleNameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_permissions")

    private Map<String, Object> resourcePermissions = null;

    public ResponsePermissionInfo withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * **参数解释：** 角色id **取值范围：** 不涉及。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public ResponsePermissionInfo withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * **参数解释：** 角色名称 **取值范围：** 不涉及。
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public ResponsePermissionInfo withRoleNameCn(String roleNameCn) {
        this.roleNameCn = roleNameCn;
        return this;
    }

    /**
     * **参数解释：** 角色中文名称 **取值范围：** 不涉及。
     * @return roleNameCn
     */
    public String getRoleNameCn() {
        return roleNameCn;
    }

    public void setRoleNameCn(String roleNameCn) {
        this.roleNameCn = roleNameCn;
    }

    public ResponsePermissionInfo withResourcePermissions(Map<String, Object> resourcePermissions) {
        this.resourcePermissions = resourcePermissions;
        return this;
    }

    public ResponsePermissionInfo putResourcePermissionsItem(String key, Object resourcePermissionsItem) {
        if (this.resourcePermissions == null) {
            this.resourcePermissions = new HashMap<>();
        }
        this.resourcePermissions.put(key, resourcePermissionsItem);
        return this;
    }

    public ResponsePermissionInfo withResourcePermissions(Consumer<Map<String, Object>> resourcePermissionsSetter) {
        if (this.resourcePermissions == null) {
            this.resourcePermissions = new HashMap<>();
        }
        resourcePermissionsSetter.accept(this.resourcePermissions);
        return this;
    }

    /**
     * Get resourcePermissions
     * @return resourcePermissions
     */
    public Map<String, Object> getResourcePermissions() {
        return resourcePermissions;
    }

    public void setResourcePermissions(Map<String, Object> resourcePermissions) {
        this.resourcePermissions = resourcePermissions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponsePermissionInfo that = (ResponsePermissionInfo) obj;
        return Objects.equals(this.roleId, that.roleId) && Objects.equals(this.roleName, that.roleName)
            && Objects.equals(this.roleNameCn, that.roleNameCn)
            && Objects.equals(this.resourcePermissions, that.resourcePermissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, roleNameCn, resourcePermissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponsePermissionInfo {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    roleNameCn: ").append(toIndentedString(roleNameCn)).append("\n");
        sb.append("    resourcePermissions: ").append(toIndentedString(resourcePermissions)).append("\n");
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
