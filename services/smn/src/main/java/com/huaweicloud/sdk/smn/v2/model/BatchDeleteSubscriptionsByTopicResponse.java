package com.huaweicloud.sdk.smn.v2.model;

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
public class BatchDeleteSubscriptionsByTopicResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions_result")

    private List<BatchDeleteSubscriptionsResponseItemInfo> subscriptionsResult = null;

    public BatchDeleteSubscriptionsByTopicResponse withSubscriptionsResult(
        List<BatchDeleteSubscriptionsResponseItemInfo> subscriptionsResult) {
        this.subscriptionsResult = subscriptionsResult;
        return this;
    }

    public BatchDeleteSubscriptionsByTopicResponse addSubscriptionsResultItem(
        BatchDeleteSubscriptionsResponseItemInfo subscriptionsResultItem) {
        if (this.subscriptionsResult == null) {
            this.subscriptionsResult = new ArrayList<>();
        }
        this.subscriptionsResult.add(subscriptionsResultItem);
        return this;
    }

    public BatchDeleteSubscriptionsByTopicResponse withSubscriptionsResult(
        Consumer<List<BatchDeleteSubscriptionsResponseItemInfo>> subscriptionsResultSetter) {
        if (this.subscriptionsResult == null) {
            this.subscriptionsResult = new ArrayList<>();
        }
        subscriptionsResultSetter.accept(this.subscriptionsResult);
        return this;
    }

    /**
     * 取消订阅结果列表。
     * @return subscriptionsResult
     */
    public List<BatchDeleteSubscriptionsResponseItemInfo> getSubscriptionsResult() {
        return subscriptionsResult;
    }

    public void setSubscriptionsResult(List<BatchDeleteSubscriptionsResponseItemInfo> subscriptionsResult) {
        this.subscriptionsResult = subscriptionsResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteSubscriptionsByTopicResponse that = (BatchDeleteSubscriptionsByTopicResponse) obj;
        return Objects.equals(this.subscriptionsResult, that.subscriptionsResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionsResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteSubscriptionsByTopicResponse {\n");
        sb.append("    subscriptionsResult: ").append(toIndentedString(subscriptionsResult)).append("\n");
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
