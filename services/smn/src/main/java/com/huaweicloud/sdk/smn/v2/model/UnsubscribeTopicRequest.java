package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UnsubscribeTopicRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_urn")

    private String subscriptionUrn;

    public UnsubscribeTopicRequest withSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
        return this;
    }

    /**
     * 订阅者的唯一的资源标识，可通过[查询订阅者列表](ListSubscriptions.xml)获取该标识。
     * @return subscriptionUrn
     */
    public String getSubscriptionUrn() {
        return subscriptionUrn;
    }

    public void setSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnsubscribeTopicRequest that = (UnsubscribeTopicRequest) obj;
        return Objects.equals(this.subscriptionUrn, that.subscriptionUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnsubscribeTopicRequest {\n");
        sb.append("    subscriptionUrn: ").append(toIndentedString(subscriptionUrn)).append("\n");
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
