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
public class ShowEventItemDetailResp {

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
     * **参数解释**： 事件状态。 **取值范围**： 枚举类型：normal\\warning\\incident。 - normal: 正常 - warning: 警告 - incident: 故障 
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
     * **参数解释**： 事件级别。 **取值范围**： 枚举类型：Critical, Major, Minor, Info。 - Critical: 紧急 - Major: 重要 - Minor: 次要 - Info: 提示 
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

    /**
     * **参数解释**： 事件子类。 **取值范围**： 枚举类型。 当事件类型为系统事件时，参数值为SUB_EVENT.OPS或SUB_EVENT.PLAN。 当事件类型为自定义事件时，参数值为SUB_EVENT.CUSTOM。 - SUB_EVENT.OPS：运维事件。 - SUB_EVENT.PLAN：计划事件。 - SUB_EVENT.CUSTOM：自定义事件。 
     */
    public static final class SubEventTypeEnum {

        /**
         * Enum SUB_EVENT_OPS for value: "SUB_EVENT.OPS"
         */
        public static final SubEventTypeEnum SUB_EVENT_OPS = new SubEventTypeEnum("SUB_EVENT.OPS");

        /**
         * Enum SUB_EVENT_PLAN for value: "SUB_EVENT.PLAN"
         */
        public static final SubEventTypeEnum SUB_EVENT_PLAN = new SubEventTypeEnum("SUB_EVENT.PLAN");

        /**
         * Enum SUB_EVENT_CUSTOM for value: "SUB_EVENT.CUSTOM"
         */
        public static final SubEventTypeEnum SUB_EVENT_CUSTOM = new SubEventTypeEnum("SUB_EVENT.CUSTOM");

        private static final Map<String, SubEventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SubEventTypeEnum> createStaticFields() {
            Map<String, SubEventTypeEnum> map = new HashMap<>();
            map.put("SUB_EVENT.OPS", SUB_EVENT_OPS);
            map.put("SUB_EVENT.PLAN", SUB_EVENT_PLAN);
            map.put("SUB_EVENT.CUSTOM", SUB_EVENT_CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SubEventTypeEnum(String value) {
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
        public static SubEventTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SubEventTypeEnum(value));
        }

        public static SubEventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubEventTypeEnum) {
                return this.value.equals(((SubEventTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_event_type")

    private SubEventTypeEnum subEventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<MetricsDimensionResp> dimensions = null;

    public ShowEventItemDetailResp withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**： 事件内容。 **取值范围**： 长度为[1,4096]个字符。 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowEventItemDetailResp withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 所属分组。 **取值范围**： 长度只能为24个字符。 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowEventItemDetailResp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**： 资源ID。 **取值范围**： 长度为[1,128]个字符。 
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowEventItemDetailResp withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释**： 资源名称。 **取值范围**： 长度为[1,128]个字符。 
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ShowEventItemDetailResp withEventState(EventStateEnum eventState) {
        this.eventState = eventState;
        return this;
    }

    /**
     * **参数解释**： 事件状态。 **取值范围**： 枚举类型：normal\\warning\\incident。 - normal: 正常 - warning: 警告 - incident: 故障 
     * @return eventState
     */
    public EventStateEnum getEventState() {
        return eventState;
    }

    public void setEventState(EventStateEnum eventState) {
        this.eventState = eventState;
    }

    public ShowEventItemDetailResp withEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * **参数解释**： 事件级别。 **取值范围**： 枚举类型：Critical, Major, Minor, Info。 - Critical: 紧急 - Major: 重要 - Minor: 次要 - Info: 提示 
     * @return eventLevel
     */
    public EventLevelEnum getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
    }

    public ShowEventItemDetailResp withEventUser(String eventUser) {
        this.eventUser = eventUser;
        return this;
    }

    /**
     * **参数解释**： 事件用户。 **取值范围**： 下划线、横线、斜杠、@ 符号或点号组成，长度为[0,64]个字符。 
     * @return eventUser
     */
    public String getEventUser() {
        return eventUser;
    }

    public void setEventUser(String eventUser) {
        this.eventUser = eventUser;
    }

    public ShowEventItemDetailResp withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释**： 事件类型。 **取值范围**： 枚举类型：EVENT.SYS，EVENT.CUSTOM - EVENT.SYS: 系统事件。 - EVENT.CUSTOM: 自定义事件。 
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ShowEventItemDetailResp withSubEventType(SubEventTypeEnum subEventType) {
        this.subEventType = subEventType;
        return this;
    }

    /**
     * **参数解释**： 事件子类。 **取值范围**： 枚举类型。 当事件类型为系统事件时，参数值为SUB_EVENT.OPS或SUB_EVENT.PLAN。 当事件类型为自定义事件时，参数值为SUB_EVENT.CUSTOM。 - SUB_EVENT.OPS：运维事件。 - SUB_EVENT.PLAN：计划事件。 - SUB_EVENT.CUSTOM：自定义事件。 
     * @return subEventType
     */
    public SubEventTypeEnum getSubEventType() {
        return subEventType;
    }

    public void setSubEventType(SubEventTypeEnum subEventType) {
        this.subEventType = subEventType;
    }

    public ShowEventItemDetailResp withDimensions(List<MetricsDimensionResp> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ShowEventItemDetailResp addDimensionsItem(MetricsDimensionResp dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ShowEventItemDetailResp withDimensions(Consumer<List<MetricsDimensionResp>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * **参数解释**： 事件的维度，根据维度描述资源信息。 用于指定资源、资源分组的事件告警场景中，支持按维度配置告警规则。 **取值范围**： 目前最大支持4个维度 
     * @return dimensions
     */
    public List<MetricsDimensionResp> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricsDimensionResp> dimensions) {
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
        ShowEventItemDetailResp that = (ShowEventItemDetailResp) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.eventState, that.eventState) && Objects.equals(this.eventLevel, that.eventLevel)
            && Objects.equals(this.eventUser, that.eventUser) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.subEventType, that.subEventType) && Objects.equals(this.dimensions, that.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content,
            groupId,
            resourceId,
            resourceName,
            eventState,
            eventLevel,
            eventUser,
            eventType,
            subEventType,
            dimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventItemDetailResp {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    eventState: ").append(toIndentedString(eventState)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
        sb.append("    eventUser: ").append(toIndentedString(eventUser)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    subEventType: ").append(toIndentedString(subEventType)).append("\n");
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
