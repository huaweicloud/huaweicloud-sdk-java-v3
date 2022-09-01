package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSubscriptionsByTopicResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_count")

    @JacksonXmlProperty(localName = "subscription_count")

    private Integer subscriptionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    @JacksonXmlProperty(localName = "subscriptions")

    private List<ListSubscriptionsItem> subscriptions = null;

    public ListSubscriptionsByTopicResponse withRequestId(String requestId) {
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

    public ListSubscriptionsByTopicResponse withSubscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
        return this;
    }

    /**
     * 订阅者个数。
     * @return subscriptionCount
     */
    public Integer getSubscriptionCount() {
        return subscriptionCount;
    }

    public void setSubscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
    }

    public ListSubscriptionsByTopicResponse withSubscriptions(List<ListSubscriptionsItem> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public ListSubscriptionsByTopicResponse addSubscriptionsItem(ListSubscriptionsItem subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public ListSubscriptionsByTopicResponse withSubscriptions(
        Consumer<List<ListSubscriptionsItem>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * Subscription结构体。
     * @return subscriptions
     */
    public List<ListSubscriptionsItem> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<ListSubscriptionsItem> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubscriptionsByTopicResponse listSubscriptionsByTopicResponse = (ListSubscriptionsByTopicResponse) o;
        return Objects.equals(this.requestId, listSubscriptionsByTopicResponse.requestId)
            && Objects.equals(this.subscriptionCount, listSubscriptionsByTopicResponse.subscriptionCount)
            && Objects.equals(this.subscriptions, listSubscriptionsByTopicResponse.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, subscriptionCount, subscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionsByTopicResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    subscriptionCount: ").append(toIndentedString(subscriptionCount)).append("\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
