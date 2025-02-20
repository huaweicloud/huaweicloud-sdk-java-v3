package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSubscriptionUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_users")

    private List<ListSubscriptionUserResponseItemInfo> subscriptionUsers = null;

    public ListSubscriptionUserResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListSubscriptionUserResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 订阅用户数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSubscriptionUserResponse withSubscriptionUsers(
        List<ListSubscriptionUserResponseItemInfo> subscriptionUsers) {
        this.subscriptionUsers = subscriptionUsers;
        return this;
    }

    public ListSubscriptionUserResponse addSubscriptionUsersItem(
        ListSubscriptionUserResponseItemInfo subscriptionUsersItem) {
        if (this.subscriptionUsers == null) {
            this.subscriptionUsers = new ArrayList<>();
        }
        this.subscriptionUsers.add(subscriptionUsersItem);
        return this;
    }

    public ListSubscriptionUserResponse withSubscriptionUsers(
        Consumer<List<ListSubscriptionUserResponseItemInfo>> subscriptionUsersSetter) {
        if (this.subscriptionUsers == null) {
            this.subscriptionUsers = new ArrayList<>();
        }
        subscriptionUsersSetter.accept(this.subscriptionUsers);
        return this;
    }

    /**
     * 订阅用户信息列表。
     * @return subscriptionUsers
     */
    public List<ListSubscriptionUserResponseItemInfo> getSubscriptionUsers() {
        return subscriptionUsers;
    }

    public void setSubscriptionUsers(List<ListSubscriptionUserResponseItemInfo> subscriptionUsers) {
        this.subscriptionUsers = subscriptionUsers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionUserResponse that = (ListSubscriptionUserResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.count, that.count)
            && Objects.equals(this.subscriptionUsers, that.subscriptionUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, count, subscriptionUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionUserResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    subscriptionUsers: ").append(toIndentedString(subscriptionUsers)).append("\n");
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
