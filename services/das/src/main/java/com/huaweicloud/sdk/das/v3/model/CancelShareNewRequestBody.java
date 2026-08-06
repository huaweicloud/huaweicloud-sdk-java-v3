package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CancelShareNewRequestBody
 */
public class CancelShareNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_conn_id")

    private String sharedConnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<CancelShareNewRequestBodyUsers> users = null;

    public CancelShareNewRequestBody withSharedConnId(String sharedConnId) {
        this.sharedConnId = sharedConnId;
        return this;
    }

    /**
     * 共享链接ID
     * @return sharedConnId
     */
    public String getSharedConnId() {
        return sharedConnId;
    }

    public void setSharedConnId(String sharedConnId) {
        this.sharedConnId = sharedConnId;
    }

    public CancelShareNewRequestBody withUsers(List<CancelShareNewRequestBodyUsers> users) {
        this.users = users;
        return this;
    }

    public CancelShareNewRequestBody addUsersItem(CancelShareNewRequestBodyUsers usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public CancelShareNewRequestBody withUsers(Consumer<List<CancelShareNewRequestBodyUsers>> usersSetter) {
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
    public List<CancelShareNewRequestBodyUsers> getUsers() {
        return users;
    }

    public void setUsers(List<CancelShareNewRequestBodyUsers> users) {
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
        CancelShareNewRequestBody that = (CancelShareNewRequestBody) obj;
        return Objects.equals(this.sharedConnId, that.sharedConnId) && Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharedConnId, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelShareNewRequestBody {\n");
        sb.append("    sharedConnId: ").append(toIndentedString(sharedConnId)).append("\n");
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
