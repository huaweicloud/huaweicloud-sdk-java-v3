package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除订阅。
 */
public class DeleteSubscriptionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_ids")

    private List<String> subscriptionIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_subscription")

    private Boolean cleanSubscription;

    public DeleteSubscriptionRequestBody withSubscriptionIds(List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }

    public DeleteSubscriptionRequestBody addSubscriptionIdsItem(String subscriptionIdsItem) {
        if (this.subscriptionIds == null) {
            this.subscriptionIds = new ArrayList<>();
        }
        this.subscriptionIds.add(subscriptionIdsItem);
        return this;
    }

    public DeleteSubscriptionRequestBody withSubscriptionIds(Consumer<List<String>> subscriptionIdsSetter) {
        if (this.subscriptionIds == null) {
            this.subscriptionIds = new ArrayList<>();
        }
        subscriptionIdsSetter.accept(this.subscriptionIds);
        return this;
    }

    /**
     * 删除的订阅id列表。每次删除的订阅必须属于同一实例。
     * @return subscriptionIds
     */
    public List<String> getSubscriptionIds() {
        return subscriptionIds;
    }

    public void setSubscriptionIds(List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }

    public DeleteSubscriptionRequestBody withCleanSubscription(Boolean cleanSubscription) {
        this.cleanSubscription = cleanSubscription;
        return this;
    }

    /**
     * 清理订阅配置。默认为false。  true：清理。 false：不清理。
     * @return cleanSubscription
     */
    public Boolean getCleanSubscription() {
        return cleanSubscription;
    }

    public void setCleanSubscription(Boolean cleanSubscription) {
        this.cleanSubscription = cleanSubscription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteSubscriptionRequestBody that = (DeleteSubscriptionRequestBody) obj;
        return Objects.equals(this.subscriptionIds, that.subscriptionIds)
            && Objects.equals(this.cleanSubscription, that.cleanSubscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionIds, cleanSubscription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSubscriptionRequestBody {\n");
        sb.append("    subscriptionIds: ").append(toIndentedString(subscriptionIds)).append("\n");
        sb.append("    cleanSubscription: ").append(toIndentedString(cleanSubscription)).append("\n");
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
