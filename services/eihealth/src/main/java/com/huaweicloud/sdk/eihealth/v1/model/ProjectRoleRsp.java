package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 项目角色详情
 */
public class ProjectRoleRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_type")

    private String roleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<BindUserRsp> users = null;

    public ProjectRoleRsp withRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * 项目角色名
     * @return roleType
     */
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public ProjectRoleRsp withUsers(List<BindUserRsp> users) {
        this.users = users;
        return this;
    }

    public ProjectRoleRsp addUsersItem(BindUserRsp usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public ProjectRoleRsp withUsers(Consumer<List<BindUserRsp>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 项目成员列表
     * @return users
     */
    public List<BindUserRsp> getUsers() {
        return users;
    }

    public void setUsers(List<BindUserRsp> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectRoleRsp projectRoleRsp = (ProjectRoleRsp) o;
        return Objects.equals(this.roleType, projectRoleRsp.roleType)
            && Objects.equals(this.users, projectRoleRsp.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleType, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectRoleRsp {\n");
        sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
