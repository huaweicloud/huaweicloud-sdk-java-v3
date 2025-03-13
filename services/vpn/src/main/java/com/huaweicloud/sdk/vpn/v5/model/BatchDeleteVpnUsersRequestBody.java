package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteVpnUsersRequestBody
 */
public class BatchDeleteVpnUsersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<OpVpnUser> users = null;

    public BatchDeleteVpnUsersRequestBody withUsers(List<OpVpnUser> users) {
        this.users = users;
        return this;
    }

    public BatchDeleteVpnUsersRequestBody addUsersItem(OpVpnUser usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public BatchDeleteVpnUsersRequestBody withUsers(Consumer<List<OpVpnUser>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 用户列表
     * @return users
     */
    public List<OpVpnUser> getUsers() {
        return users;
    }

    public void setUsers(List<OpVpnUser> users) {
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
        BatchDeleteVpnUsersRequestBody that = (BatchDeleteVpnUsersRequestBody) obj;
        return Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteVpnUsersRequestBody {\n");
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
