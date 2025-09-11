package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteSubscriptionsRequestBody
 */
public class BatchDeleteSubscriptionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_urns")

    private List<BatchDeleteSubscriptionsRequestItemInfo> subscriptionUrns = null;

    public BatchDeleteSubscriptionsRequestBody withSubscriptionUrns(
        List<BatchDeleteSubscriptionsRequestItemInfo> subscriptionUrns) {
        this.subscriptionUrns = subscriptionUrns;
        return this;
    }

    public BatchDeleteSubscriptionsRequestBody addSubscriptionUrnsItem(
        BatchDeleteSubscriptionsRequestItemInfo subscriptionUrnsItem) {
        if (this.subscriptionUrns == null) {
            this.subscriptionUrns = new ArrayList<>();
        }
        this.subscriptionUrns.add(subscriptionUrnsItem);
        return this;
    }

    public BatchDeleteSubscriptionsRequestBody withSubscriptionUrns(
        Consumer<List<BatchDeleteSubscriptionsRequestItemInfo>> subscriptionUrnsSetter) {
        if (this.subscriptionUrns == null) {
            this.subscriptionUrns = new ArrayList<>();
        }
        subscriptionUrnsSetter.accept(this.subscriptionUrns);
        return this;
    }

    /**
     * 订阅者信息列表。
     * @return subscriptionUrns
     */
    public List<BatchDeleteSubscriptionsRequestItemInfo> getSubscriptionUrns() {
        return subscriptionUrns;
    }

    public void setSubscriptionUrns(List<BatchDeleteSubscriptionsRequestItemInfo> subscriptionUrns) {
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
        BatchDeleteSubscriptionsRequestBody that = (BatchDeleteSubscriptionsRequestBody) obj;
        return Objects.equals(this.subscriptionUrns, that.subscriptionUrns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionUrns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteSubscriptionsRequestBody {\n");
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
