package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PollingPolicyRequest
 */
public class PollingPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private Integer order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_urns")

    private List<String> subscriptionUrns = null;

    public PollingPolicyRequest withOrder(Integer order) {
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

    public PollingPolicyRequest withSubscriptionUrns(List<String> subscriptionUrns) {
        this.subscriptionUrns = subscriptionUrns;
        return this;
    }

    public PollingPolicyRequest addSubscriptionUrnsItem(String subscriptionUrnsItem) {
        if (this.subscriptionUrns == null) {
            this.subscriptionUrns = new ArrayList<>();
        }
        this.subscriptionUrns.add(subscriptionUrnsItem);
        return this;
    }

    public PollingPolicyRequest withSubscriptionUrns(Consumer<List<String>> subscriptionUrnsSetter) {
        if (this.subscriptionUrns == null) {
            this.subscriptionUrns = new ArrayList<>();
        }
        subscriptionUrnsSetter.accept(this.subscriptionUrns);
        return this;
    }

    /**
     * 订阅终端urn列表。
     * @return subscriptionUrns
     */
    public List<String> getSubscriptionUrns() {
        return subscriptionUrns;
    }

    public void setSubscriptionUrns(List<String> subscriptionUrns) {
        this.subscriptionUrns = subscriptionUrns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PollingPolicyRequest that = (PollingPolicyRequest) obj;
        return Objects.equals(this.order, that.order) && Objects.equals(this.subscriptionUrns, that.subscriptionUrns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, subscriptionUrns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PollingPolicyRequest {\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    subscriptionUrns: ").append(toIndentedString(subscriptionUrns)).append("\n");
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
