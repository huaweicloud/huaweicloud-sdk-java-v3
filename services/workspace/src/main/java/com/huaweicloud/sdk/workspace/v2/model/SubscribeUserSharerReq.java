package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户订阅协同请求体。
 */
public class SubscribeUserSharerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_sharer_sku")

    private String userSharerSku;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<User> users = null;

    public SubscribeUserSharerReq withUserSharerSku(String userSharerSku) {
        this.userSharerSku = userSharerSku;
        return this;
    }

    /**
     * 用户协同资源SKU码。
     * @return userSharerSku
     */
    public String getUserSharerSku() {
        return userSharerSku;
    }

    public void setUserSharerSku(String userSharerSku) {
        this.userSharerSku = userSharerSku;
    }

    public SubscribeUserSharerReq withUsers(List<User> users) {
        this.users = users;
        return this;
    }

    public SubscribeUserSharerReq addUsersItem(User usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public SubscribeUserSharerReq withUsers(Consumer<List<User>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 开通协同的的用户列表。
     * @return users
     */
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
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
        SubscribeUserSharerReq that = (SubscribeUserSharerReq) obj;
        return Objects.equals(this.userSharerSku, that.userSharerSku) && Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userSharerSku, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeUserSharerReq {\n");
        sb.append("    userSharerSku: ").append(toIndentedString(userSharerSku)).append("\n");
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
