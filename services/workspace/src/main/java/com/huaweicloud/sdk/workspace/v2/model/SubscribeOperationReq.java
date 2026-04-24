package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 订阅操作请求，支持项目、用户、用户组的添加或删除订阅,项目、用户、用户组至少存在一个。
 */
public class SubscribeOperationReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private SubscribeOperationReqProject project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<CreateSubscribeUserInfo> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usergroups")

    private List<CreateSubscribeUserGroupInfo> usergroups = null;

    public SubscribeOperationReq withProject(SubscribeOperationReqProject project) {
        this.project = project;
        return this;
    }

    public SubscribeOperationReq withProject(Consumer<SubscribeOperationReqProject> projectSetter) {
        if (this.project == null) {
            this.project = new SubscribeOperationReqProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public SubscribeOperationReqProject getProject() {
        return project;
    }

    public void setProject(SubscribeOperationReqProject project) {
        this.project = project;
    }

    public SubscribeOperationReq withUsers(List<CreateSubscribeUserInfo> users) {
        this.users = users;
        return this;
    }

    public SubscribeOperationReq addUsersItem(CreateSubscribeUserInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public SubscribeOperationReq withUsers(Consumer<List<CreateSubscribeUserInfo>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 用户信息列表
     * @return users
     */
    public List<CreateSubscribeUserInfo> getUsers() {
        return users;
    }

    public void setUsers(List<CreateSubscribeUserInfo> users) {
        this.users = users;
    }

    public SubscribeOperationReq withUsergroups(List<CreateSubscribeUserGroupInfo> usergroups) {
        this.usergroups = usergroups;
        return this;
    }

    public SubscribeOperationReq addUsergroupsItem(CreateSubscribeUserGroupInfo usergroupsItem) {
        if (this.usergroups == null) {
            this.usergroups = new ArrayList<>();
        }
        this.usergroups.add(usergroupsItem);
        return this;
    }

    public SubscribeOperationReq withUsergroups(Consumer<List<CreateSubscribeUserGroupInfo>> usergroupsSetter) {
        if (this.usergroups == null) {
            this.usergroups = new ArrayList<>();
        }
        usergroupsSetter.accept(this.usergroups);
        return this;
    }

    /**
     * 用户组信息列表
     * @return usergroups
     */
    public List<CreateSubscribeUserGroupInfo> getUsergroups() {
        return usergroups;
    }

    public void setUsergroups(List<CreateSubscribeUserGroupInfo> usergroups) {
        this.usergroups = usergroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeOperationReq that = (SubscribeOperationReq) obj;
        return Objects.equals(this.project, that.project) && Objects.equals(this.users, that.users)
            && Objects.equals(this.usergroups, that.usergroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, users, usergroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeOperationReq {\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    usergroups: ").append(toIndentedString(usergroups)).append("\n");
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
