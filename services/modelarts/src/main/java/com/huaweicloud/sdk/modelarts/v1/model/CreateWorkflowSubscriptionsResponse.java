package com.huaweicloud.sdk.modelarts.v1.model;

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
public class CreateWorkflowSubscriptionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urns")

    private List<String> topicUrns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity")

    private String entity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<String> events = null;

    public CreateWorkflowSubscriptionsResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreateWorkflowSubscriptionsResponse withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * 订阅ID，唯一性标识。创建订阅时，后台自动生成。
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public CreateWorkflowSubscriptionsResponse withTopicUrns(List<String> topicUrns) {
        this.topicUrns = topicUrns;
        return this;
    }

    public CreateWorkflowSubscriptionsResponse addTopicUrnsItem(String topicUrnsItem) {
        if (this.topicUrns == null) {
            this.topicUrns = new ArrayList<>();
        }
        this.topicUrns.add(topicUrnsItem);
        return this;
    }

    public CreateWorkflowSubscriptionsResponse withTopicUrns(Consumer<List<String>> topicUrnsSetter) {
        if (this.topicUrns == null) {
            this.topicUrns = new ArrayList<>();
        }
        topicUrnsSetter.accept(this.topicUrns);
        return this;
    }

    /**
     * 订阅的主题。
     * @return topicUrns
     */
    public List<String> getTopicUrns() {
        return topicUrns;
    }

    public void setTopicUrns(List<String> topicUrns) {
        this.topicUrns = topicUrns;
    }

    public CreateWorkflowSubscriptionsResponse withEntity(String entity) {
        this.entity = entity;
        return this;
    }

    /**
     * 订阅的主体。
     * @return entity
     */
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public CreateWorkflowSubscriptionsResponse withEvents(List<String> events) {
        this.events = events;
        return this;
    }

    public CreateWorkflowSubscriptionsResponse addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public CreateWorkflowSubscriptionsResponse withEvents(Consumer<List<String>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 订阅的事件。
     * @return events
     */
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkflowSubscriptionsResponse that = (CreateWorkflowSubscriptionsResponse) obj;
        return Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.subscriptionId, that.subscriptionId)
            && Objects.equals(this.topicUrns, that.topicUrns) && Objects.equals(this.entity, that.entity)
            && Objects.equals(this.events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, subscriptionId, topicUrns, entity, events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkflowSubscriptionsResponse {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    topicUrns: ").append(toIndentedString(topicUrns)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
