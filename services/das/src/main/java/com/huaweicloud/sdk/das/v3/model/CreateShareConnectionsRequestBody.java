package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateShareConnectionsRequestBody
 */
public class CreateShareConnectionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_conn_id")

    private String sharedConnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_time")

    private String expiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<ShareConnUserInfo> users = null;

    public CreateShareConnectionsRequestBody withSharedConnId(String sharedConnId) {
        this.sharedConnId = sharedConnId;
        return this;
    }

    /**
     * 共享连接ID
     * @return sharedConnId
     */
    public String getSharedConnId() {
        return sharedConnId;
    }

    public void setSharedConnId(String sharedConnId) {
        this.sharedConnId = sharedConnId;
    }

    public CreateShareConnectionsRequestBody withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * 过期时间
     * @return expiredTime
     */
    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public CreateShareConnectionsRequestBody withUsers(List<ShareConnUserInfo> users) {
        this.users = users;
        return this;
    }

    public CreateShareConnectionsRequestBody addUsersItem(ShareConnUserInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public CreateShareConnectionsRequestBody withUsers(Consumer<List<ShareConnUserInfo>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 用户
     * @return users
     */
    public List<ShareConnUserInfo> getUsers() {
        return users;
    }

    public void setUsers(List<ShareConnUserInfo> users) {
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
        CreateShareConnectionsRequestBody createShareConnectionsRequestBody = (CreateShareConnectionsRequestBody) o;
        return Objects.equals(this.sharedConnId, createShareConnectionsRequestBody.sharedConnId)
            && Objects.equals(this.expiredTime, createShareConnectionsRequestBody.expiredTime)
            && Objects.equals(this.users, createShareConnectionsRequestBody.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharedConnId, expiredTime, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateShareConnectionsRequestBody {\n");
        sb.append("    sharedConnId: ").append(toIndentedString(sharedConnId)).append("\n");
        sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
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
