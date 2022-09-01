package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Metadata
 */
public class Metadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    @JacksonXmlProperty(localName = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    @JacksonXmlProperty(localName = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_severity")

    @JacksonXmlProperty(localName = "event_severity")

    private String eventSeverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    @JacksonXmlProperty(localName = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    @JacksonXmlProperty(localName = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    @JacksonXmlProperty(localName = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_provider")

    @JacksonXmlProperty(localName = "resource_provider")

    private String resourceProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_alarm_type")

    @JacksonXmlProperty(localName = "lts_alarm_type")

    private String ltsAlarmType;

    public Metadata withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 告警类型
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Metadata withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 告警id
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Metadata withEventSeverity(String eventSeverity) {
        this.eventSeverity = eventSeverity;
        return this;
    }

    /**
     * 告警级别
     * @return eventSeverity
     */
    public String getEventSeverity() {
        return eventSeverity;
    }

    public void setEventSeverity(String eventSeverity) {
        this.eventSeverity = eventSeverity;
    }

    public Metadata withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 告警名称
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Metadata withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Metadata withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 日志组/流名称
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Metadata withResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    /**
     * 告警源
     * @return resourceProvider
     */
    public String getResourceProvider() {
        return resourceProvider;
    }

    public void setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    public Metadata withLtsAlarmType(String ltsAlarmType) {
        this.ltsAlarmType = ltsAlarmType;
        return this;
    }

    /**
     * 告警规则类型(SQL/关键词)
     * @return ltsAlarmType
     */
    public String getLtsAlarmType() {
        return ltsAlarmType;
    }

    public void setLtsAlarmType(String ltsAlarmType) {
        this.ltsAlarmType = ltsAlarmType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) o;
        return Objects.equals(this.eventType, metadata.eventType) && Objects.equals(this.eventId, metadata.eventId)
            && Objects.equals(this.eventSeverity, metadata.eventSeverity)
            && Objects.equals(this.eventName, metadata.eventName)
            && Objects.equals(this.resourceType, metadata.resourceType)
            && Objects.equals(this.resourceId, metadata.resourceId)
            && Objects.equals(this.resourceProvider, metadata.resourceProvider)
            && Objects.equals(this.ltsAlarmType, metadata.ltsAlarmType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType,
            eventId,
            eventSeverity,
            eventName,
            resourceType,
            resourceId,
            resourceProvider,
            ltsAlarmType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventSeverity: ").append(toIndentedString(eventSeverity)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceProvider: ").append(toIndentedString(resourceProvider)).append("\n");
        sb.append("    ltsAlarmType: ").append(toIndentedString(ltsAlarmType)).append("\n");
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
