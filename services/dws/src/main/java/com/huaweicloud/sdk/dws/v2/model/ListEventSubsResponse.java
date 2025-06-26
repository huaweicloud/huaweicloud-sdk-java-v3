package com.huaweicloud.sdk.dws.v2.model;

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
public class ListEventSubsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_subscriptions")

    private List<EventSubscriptionResponse> eventSubscriptions = null;

    public ListEventSubsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 事件订阅总数。 **取值范围**： 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListEventSubsResponse withEventSubscriptions(List<EventSubscriptionResponse> eventSubscriptions) {
        this.eventSubscriptions = eventSubscriptions;
        return this;
    }

    public ListEventSubsResponse addEventSubscriptionsItem(EventSubscriptionResponse eventSubscriptionsItem) {
        if (this.eventSubscriptions == null) {
            this.eventSubscriptions = new ArrayList<>();
        }
        this.eventSubscriptions.add(eventSubscriptionsItem);
        return this;
    }

    public ListEventSubsResponse withEventSubscriptions(
        Consumer<List<EventSubscriptionResponse>> eventSubscriptionsSetter) {
        if (this.eventSubscriptions == null) {
            this.eventSubscriptions = new ArrayList<>();
        }
        eventSubscriptionsSetter.accept(this.eventSubscriptions);
        return this;
    }

    /**
     * **参数解释**： 事件订阅详情列表。 **取值范围**： 不涉及。
     * @return eventSubscriptions
     */
    public List<EventSubscriptionResponse> getEventSubscriptions() {
        return eventSubscriptions;
    }

    public void setEventSubscriptions(List<EventSubscriptionResponse> eventSubscriptions) {
        this.eventSubscriptions = eventSubscriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventSubsResponse that = (ListEventSubsResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.eventSubscriptions, that.eventSubscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, eventSubscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventSubsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    eventSubscriptions: ").append(toIndentedString(eventSubscriptions)).append("\n");
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
