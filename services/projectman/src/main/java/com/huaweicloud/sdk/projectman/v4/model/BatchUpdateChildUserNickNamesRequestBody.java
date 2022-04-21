package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateChildUserNickNamesRequestBody
 */
public class BatchUpdateChildUserNickNamesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<UpdateChildUserNickNameRequestBody> users = null;

    public BatchUpdateChildUserNickNamesRequestBody withUsers(List<UpdateChildUserNickNameRequestBody> users) {
        this.users = users;
        return this;
    }

    public BatchUpdateChildUserNickNamesRequestBody addUsersItem(UpdateChildUserNickNameRequestBody usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public BatchUpdateChildUserNickNamesRequestBody withUsers(
        Consumer<List<UpdateChildUserNickNameRequestBody>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 修改的用户列表
     * @return users
     */
    public List<UpdateChildUserNickNameRequestBody> getUsers() {
        return users;
    }

    public void setUsers(List<UpdateChildUserNickNameRequestBody> users) {
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
        BatchUpdateChildUserNickNamesRequestBody batchUpdateChildUserNickNamesRequestBody =
            (BatchUpdateChildUserNickNamesRequestBody) o;
        return Objects.equals(this.users, batchUpdateChildUserNickNamesRequestBody.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateChildUserNickNamesRequestBody {\n");
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
