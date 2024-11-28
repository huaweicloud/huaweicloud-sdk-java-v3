package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件通知对象。
 */
public class Event {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    /**
     * 本次事件通知的基础事件列表，基础事件类型如下。  SECRET_VERSION_CREATED：版本创建 SECRET_VERSION_EXPIRED：版本过期 SECRET_ROTATED：凭据轮转 SECRET_DELETED：凭据删除  列表包含的基础事件类型不能重复。
     */
    public static final class EventTypesEnum {

        /**
         * Enum SECRET_VERSION_CREATED for value: "SECRET_VERSION_CREATED"
         */
        public static final EventTypesEnum SECRET_VERSION_CREATED = new EventTypesEnum("SECRET_VERSION_CREATED");

        /**
         * Enum SECRET_VERSION_EXPIRED for value: "SECRET_VERSION_EXPIRED"
         */
        public static final EventTypesEnum SECRET_VERSION_EXPIRED = new EventTypesEnum("SECRET_VERSION_EXPIRED");

        /**
         * Enum SECRET_ROTATED for value: "SECRET_ROTATED"
         */
        public static final EventTypesEnum SECRET_ROTATED = new EventTypesEnum("SECRET_ROTATED");

        /**
         * Enum SECRET_DELETED for value: "SECRET_DELETED"
         */
        public static final EventTypesEnum SECRET_DELETED = new EventTypesEnum("SECRET_DELETED");

        /**
         * Enum SECRET_ROTATED_FAILED for value: "SECRET_ROTATED_FAILED"
         */
        public static final EventTypesEnum SECRET_ROTATED_FAILED = new EventTypesEnum("SECRET_ROTATED_FAILED");

        private static final Map<String, EventTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypesEnum> createStaticFields() {
            Map<String, EventTypesEnum> map = new HashMap<>();
            map.put("SECRET_VERSION_CREATED", SECRET_VERSION_CREATED);
            map.put("SECRET_VERSION_EXPIRED", SECRET_VERSION_EXPIRED);
            map.put("SECRET_ROTATED", SECRET_ROTATED);
            map.put("SECRET_DELETED", SECRET_DELETED);
            map.put("SECRET_ROTATED_FAILED", SECRET_ROTATED_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventTypesEnum(String value) {
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
        public static EventTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventTypesEnum(value));
        }

        public static EventTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventTypesEnum) {
                return this.value.equals(((EventTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_types")

    private List<EventTypesEnum> eventTypes = null;

    /**
     * 事件通知状态，取值如下。  ENABLED：表示启用状态 DISABLED：表示禁用状态
     */
    public static final class StateEnum {

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final StateEnum ENABLED = new StateEnum("ENABLED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final StateEnum DISABLED = new StateEnum("DISABLED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("ENABLED", ENABLED);
            map.put("DISABLED", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification")

    private Notification notification;

    public Event withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件通知名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 事件通知的资源标识符。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Event withEventTypes(List<EventTypesEnum> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public Event addEventTypesItem(EventTypesEnum eventTypesItem) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    public Event withEventTypes(Consumer<List<EventTypesEnum>> eventTypesSetter) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        eventTypesSetter.accept(this.eventTypes);
        return this;
    }

    /**
     * 设置事件的基础事件类型列表,。  约束：数组大小：最小1，最大12。
     * @return eventTypes
     */
    public List<EventTypesEnum> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<EventTypesEnum> eventTypes) {
        this.eventTypes = eventTypes;
    }

    public Event withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 事件通知状态，取值如下。  ENABLED：表示启用状态 DISABLED：表示禁用状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public Event withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 事件通知创建时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * minimum: 0
     * maximum: 13
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Event withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 事件通知上次更新时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * minimum: 0
     * maximum: 13
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Event withNotification(Notification notification) {
        this.notification = notification;
        return this;
    }

    public Event withNotification(Consumer<Notification> notificationSetter) {
        if (this.notification == null) {
            this.notification = new Notification();
            notificationSetter.accept(this.notification);
        }

        return this;
    }

    /**
     * Get notification
     * @return notification
     */
    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event that = (Event) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.eventId, that.eventId)
            && Objects.equals(this.eventTypes, that.eventTypes) && Objects.equals(this.state, that.state)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.notification, that.notification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, eventId, eventTypes, state, createTime, updateTime, notification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
