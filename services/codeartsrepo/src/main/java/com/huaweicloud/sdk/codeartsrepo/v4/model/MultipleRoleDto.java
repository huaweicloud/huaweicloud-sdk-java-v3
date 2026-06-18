package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MultipleRoleDto
 */
public class MultipleRoleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_chinese_name")

    private String roleChineseName;

    public MultipleRoleDto withRoleId(String roleId) {
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

    public MultipleRoleDto withRoleName(String roleName) {
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

    public MultipleRoleDto withRoleChineseName(String roleChineseName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultipleRoleDto that = (MultipleRoleDto) obj;
        return Objects.equals(this.roleId, that.roleId) && Objects.equals(this.roleName, that.roleName)
            && Objects.equals(this.roleChineseName, that.roleChineseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, roleChineseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultipleRoleDto {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    roleChineseName: ").append(toIndentedString(roleChineseName)).append("\n");
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
