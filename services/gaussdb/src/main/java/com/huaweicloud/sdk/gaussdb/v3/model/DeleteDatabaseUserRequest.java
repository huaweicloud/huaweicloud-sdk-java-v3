package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除数据库用户请求体。
 */
public class DeleteDatabaseUserRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<ListDeleteDatabaseUserRequest> users = null;

    public DeleteDatabaseUserRequest withUsers(List<ListDeleteDatabaseUserRequest> users) {
        this.users = users;
        return this;
    }

    public DeleteDatabaseUserRequest addUsersItem(ListDeleteDatabaseUserRequest usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public DeleteDatabaseUserRequest withUsers(Consumer<List<ListDeleteDatabaseUserRequest>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 准备删除的数据库用户列表，列表最大长度为50。
     * @return users
     */
    public List<ListDeleteDatabaseUserRequest> getUsers() {
        return users;
    }

    public void setUsers(List<ListDeleteDatabaseUserRequest> users) {
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
        DeleteDatabaseUserRequest that = (DeleteDatabaseUserRequest) obj;
        return Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDatabaseUserRequest {\n");
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
