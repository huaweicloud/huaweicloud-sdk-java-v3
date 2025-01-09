package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置应用授权。
 */
public class AssignAppAuthorizationsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_type")

    private AssignType authorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<AccountInfo> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del_users")

    private List<AccountInfo> delUsers = null;

    public AssignAppAuthorizationsReq withAuthorizationType(AssignType authorizationType) {
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

    public AssignAppAuthorizationsReq withUsers(List<AccountInfo> users) {
        this.users = users;
        return this;
    }

    public AssignAppAuthorizationsReq addUsersItem(AccountInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public AssignAppAuthorizationsReq withUsers(Consumer<List<AccountInfo>> usersSetter) {
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

    public AssignAppAuthorizationsReq withDelUsers(List<AccountInfo> delUsers) {
        this.delUsers = delUsers;
        return this;
    }

    public AssignAppAuthorizationsReq addDelUsersItem(AccountInfo delUsersItem) {
        if (this.delUsers == null) {
            this.delUsers = new ArrayList<>();
        }
        this.delUsers.add(delUsersItem);
        return this;
    }

    public AssignAppAuthorizationsReq withDelUsers(Consumer<List<AccountInfo>> delUsersSetter) {
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
        AssignAppAuthorizationsReq that = (AssignAppAuthorizationsReq) obj;
        return Objects.equals(this.authorizationType, that.authorizationType) && Objects.equals(this.users, that.users)
            && Objects.equals(this.delUsers, that.delUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationType, users, delUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignAppAuthorizationsReq {\n");
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
