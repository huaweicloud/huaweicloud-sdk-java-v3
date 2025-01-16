package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PollingPolicyResponse
 */
public class PollingPolicyResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private Integer order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    private List<PollingPolicySubscriptionDetails> subscriptions = null;

    public PollingPolicyResponse withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * 当前轮询的序号。
     * minimum: 1
     * maximum: 3
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public PollingPolicyResponse withSubscriptions(List<PollingPolicySubscriptionDetails> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public PollingPolicyResponse addSubscriptionsItem(PollingPolicySubscriptionDetails subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public PollingPolicyResponse withSubscriptions(
        Consumer<List<PollingPolicySubscriptionDetails>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * 订阅终端urn列表。
     * @return subscriptions
     */
    public List<PollingPolicySubscriptionDetails> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<PollingPolicySubscriptionDetails> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PollingPolicyResponse that = (PollingPolicyResponse) obj;
        return Objects.equals(this.order, that.order) && Objects.equals(this.subscriptions, that.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, subscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PollingPolicyResponse {\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
