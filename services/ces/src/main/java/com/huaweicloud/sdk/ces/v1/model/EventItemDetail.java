package com.huaweicloud.sdk.ces.v1.model;

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
 * 
 */
public class EventItemDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    /**
     * 事件状态。  枚举类型：normal\\warning\\incident
     */
    public static final class EventStateEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final EventStateEnum NORMAL = new EventStateEnum("normal");

        /**
         * Enum WARNING for value: "warning"
         */
        public static final EventStateEnum WARNING = new EventStateEnum("warning");

        /**
         * Enum INCIDENT for value: "incident"
         */
        public static final EventStateEnum INCIDENT = new EventStateEnum("incident");

        private static final Map<String, EventStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventStateEnum> createStaticFields() {
            Map<String, EventStateEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("warning", WARNING);
            map.put("incident", INCIDENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventStateEnum(String value) {
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
        public static EventStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventStateEnum(value));
        }

        public static EventStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventStateEnum) {
                return this.value.equals(((EventStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_state")

    private EventStateEnum eventState;

    /**
     * 事件级别。  枚举类型：Critical, Major, Minor, Info
     */
    public static final class EventLevelEnum {

        /**
         * Enum CRITICAL for value: "Critical"
         */
        public static final EventLevelEnum CRITICAL = new EventLevelEnum("Critical");

        /**
         * Enum MAJOR for value: "Major"
         */
        public static final EventLevelEnum MAJOR = new EventLevelEnum("Major");

        /**
         * Enum MINOR for value: "Minor"
         */
        public static final EventLevelEnum MINOR = new EventLevelEnum("Minor");

        /**
         * Enum INFO for value: "Info"
         */
        public static final EventLevelEnum INFO = new EventLevelEnum("Info");

        private static final Map<String, EventLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventLevelEnum> createStaticFields() {
            Map<String, EventLevelEnum> map = new HashMap<>();
            map.put("Critical", CRITICAL);
            map.put("Major", MAJOR);
            map.put("Minor", MINOR);
            map.put("Info", INFO);
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
    @JsonProperty(value = "event_user")

    private String eventUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<MetricsDimension> dimensions = null;

    public EventItemDetail withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 事件内容，最大长度4096。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EventItemDetail withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 所属分组。  资源分组对应的ID，必须传存在的分组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public EventItemDetail withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID，支持字母、数字_ -：，最大长度128。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public EventItemDetail withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称，支持字母 中文 数字_ -. ，最大长度128。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public EventItemDetail withEventState(EventStateEnum eventState) {
        this.eventState = eventState;
        return this;
    }

    /**
     * 事件状态。  枚举类型：normal\\warning\\incident
     * @return eventState
     */
    public EventStateEnum getEventState() {
        return eventState;
    }

    public void setEventState(EventStateEnum eventState) {
        this.eventState = eventState;
    }

    public EventItemDetail withEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * 事件级别。  枚举类型：Critical, Major, Minor, Info
     * @return eventLevel
     */
    public EventLevelEnum getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
    }

    public EventItemDetail withEventUser(String eventUser) {
        this.eventUser = eventUser;
        return this;
    }

    /**
     * 事件用户。  支持字母 数字_ -/空格 ，最大长度64。
     * @return eventUser
     */
    public String getEventUser() {
        return eventUser;
    }

    public void setEventUser(String eventUser) {
        this.eventUser = eventUser;
    }

    public EventItemDetail withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型。 枚举类型，EVENT.SYS或EVENT.CUSTOM，EVENT.SYS为系统事件，用户自已不能上报，只能传EVENT.CUSTOM。
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public EventItemDetail withDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public EventItemDetail addDimensionsItem(MetricsDimension dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public EventItemDetail withDimensions(Consumer<List<MetricsDimension>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 一个或者多个资源维度。
     * @return dimensions
     */
    public List<MetricsDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventItemDetail that = (EventItemDetail) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.eventState, that.eventState) && Objects.equals(this.eventLevel, that.eventLevel)
            && Objects.equals(this.eventUser, that.eventUser) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.dimensions, that.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(content, groupId, resourceId, resourceName, eventState, eventLevel, eventUser, eventType, dimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventItemDetail {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    eventState: ").append(toIndentedString(eventState)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
        sb.append("    eventUser: ").append(toIndentedString(eventUser)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
