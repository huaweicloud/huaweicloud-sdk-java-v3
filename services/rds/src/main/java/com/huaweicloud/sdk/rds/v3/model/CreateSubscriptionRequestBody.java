package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建发布详情。
 */
public class CreateSubscriptionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    private List<CreateSubscriptionInfo> subscriptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_publication_id")

    private String currentPublicationId;

    public CreateSubscriptionRequestBody withSubscriptions(List<CreateSubscriptionInfo> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public CreateSubscriptionRequestBody addSubscriptionsItem(CreateSubscriptionInfo subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public CreateSubscriptionRequestBody withSubscriptions(Consumer<List<CreateSubscriptionInfo>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * 订阅详情。一次最多创建十个订阅。
     * @return subscriptions
     */
    public List<CreateSubscriptionInfo> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<CreateSubscriptionInfo> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public CreateSubscriptionRequestBody withCurrentPublicationId(String currentPublicationId) {
        this.currentPublicationId = currentPublicationId;
        return this;
    }

    /**
     * 给发布创建订阅时的发布id。给发布创建订阅时必传，不传时则为创建本地订阅。
     * @return currentPublicationId
     */
    public String getCurrentPublicationId() {
        return currentPublicationId;
    }

    public void setCurrentPublicationId(String currentPublicationId) {
        this.currentPublicationId = currentPublicationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubscriptionRequestBody that = (CreateSubscriptionRequestBody) obj;
        return Objects.equals(this.subscriptions, that.subscriptions)
            && Objects.equals(this.currentPublicationId, that.currentPublicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptions, currentPublicationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscriptionRequestBody {\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
        sb.append("    currentPublicationId: ").append(toIndentedString(currentPublicationId)).append("\n");
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
