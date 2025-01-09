package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自动安装应用请求。 assign_scope&#x3D;ASSIGN_USER: users必须非空，如果用户不满足对应应用的访问权限，会自动添加对应的权限。 assign_scope&#x3D;ALL_USER: 会同时修改所有应用授权为全部用户。
 */
public class BatchAutoInstallAppsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_ids")

    private List<String> appIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_scope")

    private AssignType assignScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<AccountInfo> users = null;

    public BatchAutoInstallAppsReq withAppIds(List<String> appIds) {
        this.appIds = appIds;
        return this;
    }

    public BatchAutoInstallAppsReq addAppIdsItem(String appIdsItem) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        this.appIds.add(appIdsItem);
        return this;
    }

    public BatchAutoInstallAppsReq withAppIds(Consumer<List<String>> appIdsSetter) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        appIdsSetter.accept(this.appIds);
        return this;
    }

    /**
     * 批量唯一标识请求列表，一次请求数量区间 [1, 50]。
     * @return appIds
     */
    public List<String> getAppIds() {
        return appIds;
    }

    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public BatchAutoInstallAppsReq withAssignScope(AssignType assignScope) {
        this.assignScope = assignScope;
        return this;
    }

    /**
     * Get assignScope
     * @return assignScope
     */
    public AssignType getAssignScope() {
        return assignScope;
    }

    public void setAssignScope(AssignType assignScope) {
        this.assignScope = assignScope;
    }

    public BatchAutoInstallAppsReq withUsers(List<AccountInfo> users) {
        this.users = users;
        return this;
    }

    public BatchAutoInstallAppsReq addUsersItem(AccountInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public BatchAutoInstallAppsReq withUsers(Consumer<List<AccountInfo>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 用户列表，一次请求数量区间 [1, 50]。
     * @return users
     */
    public List<AccountInfo> getUsers() {
        return users;
    }

    public void setUsers(List<AccountInfo> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAutoInstallAppsReq that = (BatchAutoInstallAppsReq) obj;
        return Objects.equals(this.appIds, that.appIds) && Objects.equals(this.assignScope, that.assignScope)
            && Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appIds, assignScope, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAutoInstallAppsReq {\n");
        sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
        sb.append("    assignScope: ").append(toIndentedString(assignScope)).append("\n");
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
