package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量设置应用授权。
 */
public class BatchAssignAppAuthorizationsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_ids")

    private List<String> appIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_type")

    private AssignType authorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<AccountInfo> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del_users")

    private List<AccountInfo> delUsers = null;

    public BatchAssignAppAuthorizationsReq withAppIds(List<String> appIds) {
        this.appIds = appIds;
        return this;
    }

    public BatchAssignAppAuthorizationsReq addAppIdsItem(String appIdsItem) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        this.appIds.add(appIdsItem);
        return this;
    }

    public BatchAssignAppAuthorizationsReq withAppIds(Consumer<List<String>> appIdsSetter) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        appIdsSetter.accept(this.appIds);
        return this;
    }

    /**
     * 批量唯一标识请求列表，一次请求数量区间 [1, 20]。
     * @return appIds
     */
    public List<String> getAppIds() {
        return appIds;
    }

    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public BatchAssignAppAuthorizationsReq withAuthorizationType(AssignType authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * Get authorizationType
     * @return authorizationType
     */
    public AssignType getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(AssignType authorizationType) {
        this.authorizationType = authorizationType;
    }

    public BatchAssignAppAuthorizationsReq withUsers(List<AccountInfo> users) {
        this.users = users;
        return this;
    }

    public BatchAssignAppAuthorizationsReq addUsersItem(AccountInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public BatchAssignAppAuthorizationsReq withUsers(Consumer<List<AccountInfo>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 新增授权用户列表，一次请求数量区间 [0, 100]。
     * @return users
     */
    public List<AccountInfo> getUsers() {
        return users;
    }

    public void setUsers(List<AccountInfo> users) {
        this.users = users;
    }

    public BatchAssignAppAuthorizationsReq withDelUsers(List<AccountInfo> delUsers) {
        this.delUsers = delUsers;
        return this;
    }

    public BatchAssignAppAuthorizationsReq addDelUsersItem(AccountInfo delUsersItem) {
        if (this.delUsers == null) {
            this.delUsers = new ArrayList<>();
        }
        this.delUsers.add(delUsersItem);
        return this;
    }

    public BatchAssignAppAuthorizationsReq withDelUsers(Consumer<List<AccountInfo>> delUsersSetter) {
        if (this.delUsers == null) {
            this.delUsers = new ArrayList<>();
        }
        delUsersSetter.accept(this.delUsers);
        return this;
    }

    /**
     * 取消授权用户列表，一次请求数量区间 [0, 100]。
     * @return delUsers
     */
    public List<AccountInfo> getDelUsers() {
        return delUsers;
    }

    public void setDelUsers(List<AccountInfo> delUsers) {
        this.delUsers = delUsers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAssignAppAuthorizationsReq that = (BatchAssignAppAuthorizationsReq) obj;
        return Objects.equals(this.appIds, that.appIds)
            && Objects.equals(this.authorizationType, that.authorizationType) && Objects.equals(this.users, that.users)
            && Objects.equals(this.delUsers, that.delUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appIds, authorizationType, users, delUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAssignAppAuthorizationsReq {\n");
        sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
        sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    delUsers: ").append(toIndentedString(delUsers)).append("\n");
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
