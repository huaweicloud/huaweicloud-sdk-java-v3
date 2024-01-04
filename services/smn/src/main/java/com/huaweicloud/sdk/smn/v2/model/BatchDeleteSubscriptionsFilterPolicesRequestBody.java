package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteSubscriptionsFilterPolicesRequestBody
 */
public class BatchDeleteSubscriptionsFilterPolicesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_urns")

    private List<String> subscriptionUrns = null;

    public BatchDeleteSubscriptionsFilterPolicesRequestBody withSubscriptionUrns(List<String> subscriptionUrns) {
        this.subscriptionUrns = subscriptionUrns;
        return this;
    }

    public BatchDeleteSubscriptionsFilterPolicesRequestBody addSubscriptionUrnsItem(String subscriptionUrnsItem) {
        if (this.subscriptionUrns == null) {
            this.subscriptionUrns = new ArrayList<>();
        }
        this.subscriptionUrns.add(subscriptionUrnsItem);
        return this;
    }

    public BatchDeleteSubscriptionsFilterPolicesRequestBody withSubscriptionUrns(
        Consumer<List<String>> subscriptionUrnsSetter) {
        if (this.subscriptionUrns == null) {
            this.subscriptionUrns = new ArrayList<>();
        }
        subscriptionUrnsSetter.accept(this.subscriptionUrns);
        return this;
    }

    /**
     * 订阅者的唯一的资源标识，可通过[查询订阅者列表](ListSubscriptions.xml)获取该标识。
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
        BatchDeleteSubscriptionsFilterPolicesRequestBody that = (BatchDeleteSubscriptionsFilterPolicesRequestBody) obj;
        return Objects.equals(this.subscriptionUrns, that.subscriptionUrns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionUrns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteSubscriptionsFilterPolicesRequestBody {\n");
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
