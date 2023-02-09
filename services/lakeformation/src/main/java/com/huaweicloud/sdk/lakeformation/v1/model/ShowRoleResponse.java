package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRoleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private Role role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_roles")

    private List<UserRole> userRoles = null;

    public ShowRoleResponse withRole(Role role) {
        this.role = role;
        return this;
    }

    public ShowRoleResponse withRole(Consumer<Role> roleSetter) {
        if (this.role == null) {
            this.role = new Role();
            roleSetter.accept(this.role);
        }

        return this;
    }

    /**
     * Get role
     * @return role
     */
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public ShowRoleResponse withUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
        return this;
    }

    public ShowRoleResponse addUserRolesItem(UserRole userRolesItem) {
        if (this.userRoles == null) {
            this.userRoles = new ArrayList<>();
        }
        this.userRoles.add(userRolesItem);
        return this;
    }

    public ShowRoleResponse withUserRoles(Consumer<List<UserRole>> userRolesSetter) {
        if (this.userRoles == null) {
            this.userRoles = new ArrayList<>();
        }
        userRolesSetter.accept(this.userRoles);
        return this;
    }

    /**
     * 角色包含的用户或者用户组信息
     * @return userRoles
     */
    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRoleResponse showRoleResponse = (ShowRoleResponse) o;
        return Objects.equals(this.role, showRoleResponse.role)
            && Objects.equals(this.userRoles, showRoleResponse.userRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, userRoles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRoleResponse {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    userRoles: ").append(toIndentedString(userRoles)).append("\n");
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
