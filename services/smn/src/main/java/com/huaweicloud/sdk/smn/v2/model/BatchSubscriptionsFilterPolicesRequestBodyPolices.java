package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchSubscriptionsFilterPolicesRequestBodyPolices
 */
public class BatchSubscriptionsFilterPolicesRequestBodyPolices {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_urn")

    private String subscriptionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_polices")

    private List<SubscriptionsFilterPolicy> filterPolices = null;

    public BatchSubscriptionsFilterPolicesRequestBodyPolices withSubscriptionUrn(String subscriptionUrn) {
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

    public BatchSubscriptionsFilterPolicesRequestBodyPolices withFilterPolices(
        List<SubscriptionsFilterPolicy> filterPolices) {
        this.filterPolices = filterPolices;
        return this;
    }

    public BatchSubscriptionsFilterPolicesRequestBodyPolices addFilterPolicesItem(
        SubscriptionsFilterPolicy filterPolicesItem) {
        if (this.filterPolices == null) {
            this.filterPolices = new ArrayList<>();
        }
        this.filterPolices.add(filterPolicesItem);
        return this;
    }

    public BatchSubscriptionsFilterPolicesRequestBodyPolices withFilterPolices(
        Consumer<List<SubscriptionsFilterPolicy>> filterPolicesSetter) {
        if (this.filterPolices == null) {
            this.filterPolices = new ArrayList<>();
        }
        filterPolicesSetter.accept(this.filterPolices);
        return this;
    }

    /**
     * 订阅者的过滤策略。策略name不能重复
     * @return filterPolices
     */
    public List<SubscriptionsFilterPolicy> getFilterPolices() {
        return filterPolices;
    }

    public void setFilterPolices(List<SubscriptionsFilterPolicy> filterPolices) {
        this.filterPolices = filterPolices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSubscriptionsFilterPolicesRequestBodyPolices that =
            (BatchSubscriptionsFilterPolicesRequestBodyPolices) obj;
        return Objects.equals(this.subscriptionUrn, that.subscriptionUrn)
            && Objects.equals(this.filterPolices, that.filterPolices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionUrn, filterPolices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSubscriptionsFilterPolicesRequestBodyPolices {\n");
        sb.append("    subscriptionUrn: ").append(toIndentedString(subscriptionUrn)).append("\n");
        sb.append("    filterPolices: ").append(toIndentedString(filterPolices)).append("\n");
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
