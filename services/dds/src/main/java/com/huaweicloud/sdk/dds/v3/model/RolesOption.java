package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** RolesOption */
public class RolesOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_db_name")

    private String roleDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    public RolesOption withRoleDbName(String roleDbName) {
        this.roleDbName = roleDbName;
        return this;
    }

    /** 被继承角色所在数据库名称。 - 长度为1~64位，可以包含大写字母（A~Z）、小写字母（a~z）、数字（0~9）、下划线。
     * 
     * @return roleDbName */
    public String getRoleDbName() {
        return roleDbName;
    }

    public void setRoleDbName(String roleDbName) {
        this.roleDbName = roleDbName;
    }

    public RolesOption withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /** 被继承角色的名称。 - 长度为1~64位，可以包含大写字母（A~Z）、小写字母（a~z）、数字（0~9）、中划线、下划线和点。
     * 
     * @return roleName */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolesOption rolesOption = (RolesOption) o;
        return Objects.equals(this.roleDbName, rolesOption.roleDbName)
            && Objects.equals(this.roleName, rolesOption.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleDbName, roleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolesOption {\n");
        sb.append("    roleDbName: ").append(toIndentedString(roleDbName)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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
