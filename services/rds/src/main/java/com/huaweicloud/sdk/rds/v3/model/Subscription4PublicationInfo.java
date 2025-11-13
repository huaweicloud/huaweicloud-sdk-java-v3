package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 发布下的订阅信息。
 */
public class Subscription4PublicationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_instance_name")

    private String subscriptionInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_instance_ip")

    private String subscriptionInstanceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_instance_id")

    private String subscriptionInstanceId;

    public Subscription4PublicationInfo withSubscriptionInstanceName(String subscriptionInstanceName) {
        this.subscriptionInstanceName = subscriptionInstanceName;
        return this;
    }

    /**
     * 订阅服务器名称。
     * @return subscriptionInstanceName
     */
    public String getSubscriptionInstanceName() {
        return subscriptionInstanceName;
    }

    public void setSubscriptionInstanceName(String subscriptionInstanceName) {
        this.subscriptionInstanceName = subscriptionInstanceName;
    }

    public Subscription4PublicationInfo withSubscriptionInstanceIp(String subscriptionInstanceIp) {
        this.subscriptionInstanceIp = subscriptionInstanceIp;
        return this;
    }

    /**
     * 订阅服务器ip。
     * @return subscriptionInstanceIp
     */
    public String getSubscriptionInstanceIp() {
        return subscriptionInstanceIp;
    }

    public void setSubscriptionInstanceIp(String subscriptionInstanceIp) {
        this.subscriptionInstanceIp = subscriptionInstanceIp;
    }

    public Subscription4PublicationInfo withSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }

    /**
     * 订阅实例id。
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return subscriptionInstanceId;
    }

    public void setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Subscription4PublicationInfo that = (Subscription4PublicationInfo) obj;
        return Objects.equals(this.subscriptionInstanceName, that.subscriptionInstanceName)
            && Objects.equals(this.subscriptionInstanceIp, that.subscriptionInstanceIp)
            && Objects.equals(this.subscriptionInstanceId, that.subscriptionInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionInstanceName, subscriptionInstanceIp, subscriptionInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subscription4PublicationInfo {\n");
        sb.append("    subscriptionInstanceName: ").append(toIndentedString(subscriptionInstanceName)).append("\n");
        sb.append("    subscriptionInstanceIp: ").append(toIndentedString(subscriptionInstanceIp)).append("\n");
        sb.append("    subscriptionInstanceId: ").append(toIndentedString(subscriptionInstanceId)).append("\n");
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
