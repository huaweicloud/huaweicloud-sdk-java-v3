package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListTracedEventsRespResult
 */
public class ListTracedEventsRespResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_name")

    private String subscriptionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_provider")

    private String sourceProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_received_time")

    private Integer eventReceivedTime;

    public ListTracedEventsRespResult withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

    /**
     * Get subscriptionName
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public ListTracedEventsRespResult withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * Get sourceName
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public ListTracedEventsRespResult withSourceProvider(String sourceProvider) {
        this.sourceProvider = sourceProvider;
        return this;
    }

    /**
     * Get sourceProvider
     * @return sourceProvider
     */
    public String getSourceProvider() {
        return sourceProvider;
    }

    public void setSourceProvider(String sourceProvider) {
        this.sourceProvider = sourceProvider;
    }

    public ListTracedEventsRespResult withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get eventType
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ListTracedEventsRespResult withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * Get eventId
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public ListTracedEventsRespResult withEventReceivedTime(Integer eventReceivedTime) {
        this.eventReceivedTime = eventReceivedTime;
        return this;
    }

    /**
     * Get eventReceivedTime
     * @return eventReceivedTime
     */
    public Integer getEventReceivedTime() {
        return eventReceivedTime;
    }

    public void setEventReceivedTime(Integer eventReceivedTime) {
        this.eventReceivedTime = eventReceivedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTracedEventsRespResult listTracedEventsRespResult = (ListTracedEventsRespResult) o;
        return Objects.equals(this.subscriptionName, listTracedEventsRespResult.subscriptionName)
            && Objects.equals(this.sourceName, listTracedEventsRespResult.sourceName)
            && Objects.equals(this.sourceProvider, listTracedEventsRespResult.sourceProvider)
            && Objects.equals(this.eventType, listTracedEventsRespResult.eventType)
            && Objects.equals(this.eventId, listTracedEventsRespResult.eventId)
            && Objects.equals(this.eventReceivedTime, listTracedEventsRespResult.eventReceivedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionName, sourceName, sourceProvider, eventType, eventId, eventReceivedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTracedEventsRespResult {\n");
        sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    sourceProvider: ").append(toIndentedString(sourceProvider)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventReceivedTime: ").append(toIndentedString(eventReceivedTime)).append("\n");
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
