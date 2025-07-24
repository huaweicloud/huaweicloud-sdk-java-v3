package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EventInfo
 */
public class EventInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    private String messageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_message")

    private String eventMessage;

    /**
     * 事件级别，枚举类型：critical, major, minor, info
     */
    public static final class EventLevelEnum {

        /**
         * Enum CRITICAL for value: "critical"
         */
        public static final EventLevelEnum CRITICAL = new EventLevelEnum("critical");

        /**
         * Enum MAJOR for value: "major"
         */
        public static final EventLevelEnum MAJOR = new EventLevelEnum("major");

        /**
         * Enum MINOR for value: "minor"
         */
        public static final EventLevelEnum MINOR = new EventLevelEnum("minor");

        /**
         * Enum INFO for value: "info"
         */
        public static final EventLevelEnum INFO = new EventLevelEnum("info");

        private static final Map<String, EventLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventLevelEnum> createStaticFields() {
            Map<String, EventLevelEnum> map = new HashMap<>();
            map.put("critical", CRITICAL);
            map.put("major", MAJOR);
            map.put("minor", MINOR);
            map.put("info", INFO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventLevelEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EventLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventLevelEnum(value));
        }

        public static EventLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventLevelEnum) {
                return this.value.equals(((EventLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_level")

    private EventLevelEnum eventLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_event")

    private String originEvent;

    public EventInfo withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 事件ID
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public EventInfo withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * 描述ID
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public EventInfo withEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
        return this;
    }

    /**
     * 事件描述
     * @return eventMessage
     */
    public String getEventMessage() {
        return eventMessage;
    }

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    public EventInfo withEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * 事件级别，枚举类型：critical, major, minor, info
     * @return eventLevel
     */
    public EventLevelEnum getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
    }

    public EventInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 事件状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EventInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID，最大长度128
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public EventInfo withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 事件发生时间，UNIX时间戳，单位毫秒
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public EventInfo withOriginEvent(String originEvent) {
        this.originEvent = originEvent;
        return this;
    }

    /**
     * 原始事件，最大长度4096
     * @return originEvent
     */
    public String getOriginEvent() {
        return originEvent;
    }

    public void setOriginEvent(String originEvent) {
        this.originEvent = originEvent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventInfo that = (EventInfo) obj;
        return Objects.equals(this.eventId, that.eventId) && Objects.equals(this.messageId, that.messageId)
            && Objects.equals(this.eventMessage, that.eventMessage) && Objects.equals(this.eventLevel, that.eventLevel)
            && Objects.equals(this.status, that.status) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.time, that.time) && Objects.equals(this.originEvent, that.originEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, messageId, eventMessage, eventLevel, status, resourceId, time, originEvent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventInfo {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    eventMessage: ").append(toIndentedString(eventMessage)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    originEvent: ").append(toIndentedString(originEvent)).append("\n");
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
