package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RedisModifyDBUserPrivilegeRequest
 */
public class RedisModifyDBUserPrivilegeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<RedisModifyDbUserPrivilegeRequestBody> users = null;

    public RedisModifyDBUserPrivilegeRequest withUsers(List<RedisModifyDbUserPrivilegeRequestBody> users) {
        this.users = users;
        return this;
    }

    public RedisModifyDBUserPrivilegeRequest addUsersItem(RedisModifyDbUserPrivilegeRequestBody usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public RedisModifyDBUserPrivilegeRequest withUsers(
        Consumer<List<RedisModifyDbUserPrivilegeRequestBody>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * Get users
     * @return users
     */
    public List<RedisModifyDbUserPrivilegeRequestBody> getUsers() {
        return users;
    }

    public void setUsers(List<RedisModifyDbUserPrivilegeRequestBody> users) {
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
        RedisModifyDBUserPrivilegeRequest that = (RedisModifyDBUserPrivilegeRequest) obj;
        return Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisModifyDBUserPrivilegeRequest {\n");
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
