package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 给发布创建订阅时需要的参数。
 */
public class CreateSubscription4PublicationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_instance_id")

    private String subscriptionInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info")

    private ReplicationUserInfo userInfo;

    public CreateSubscription4PublicationInfo withSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }

    /**
     * 订阅服务器来源为云上实例时的订阅实例id。
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return subscriptionInstanceId;
    }

    public void setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
    }

    public CreateSubscription4PublicationInfo withUserInfo(ReplicationUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public CreateSubscription4PublicationInfo withUserInfo(Consumer<ReplicationUserInfo> userInfoSetter) {
        if (this.userInfo == null) {
            this.userInfo = new ReplicationUserInfo();
            userInfoSetter.accept(this.userInfo);
        }

        return this;
    }

    /**
     * Get userInfo
     * @return userInfo
     */
    public ReplicationUserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(ReplicationUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubscription4PublicationInfo that = (CreateSubscription4PublicationInfo) obj;
        return Objects.equals(this.subscriptionInstanceId, that.subscriptionInstanceId)
            && Objects.equals(this.userInfo, that.userInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionInstanceId, userInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscription4PublicationInfo {\n");
        sb.append("    subscriptionInstanceId: ").append(toIndentedString(subscriptionInstanceId)).append("\n");
        sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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
