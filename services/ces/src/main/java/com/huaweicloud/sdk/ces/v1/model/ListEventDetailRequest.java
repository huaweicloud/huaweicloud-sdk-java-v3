package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEventDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    /**
     * **参数解释**： 事件类型。 **约束限制**： 不涉及。 **取值范围**： 值为EVENT.SYS或EVENT.CUSTOM。 - EVENT.SYS：系统事件。 - EVENT.CUSTOM：自定义事件。 **默认取值**： 不涉及。 
     */
    public static final class EventTypeEnum {

        /**
         * Enum EVENT_SYS for value: "EVENT.SYS"
         */
        public static final EventTypeEnum EVENT_SYS = new EventTypeEnum("EVENT.SYS");

        /**
         * Enum EVENT_CUSTOM for value: "EVENT.CUSTOM"
         */
        public static final EventTypeEnum EVENT_CUSTOM = new EventTypeEnum("EVENT.CUSTOM");

        private static final Map<String, EventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypeEnum> createStaticFields() {
            Map<String, EventTypeEnum> map = new HashMap<>();
            map.put("EVENT.SYS", EVENT_SYS);
            map.put("EVENT.CUSTOM", EVENT_CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventTypeEnum(String value) {
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
        public static EventTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventTypeEnum(value));
        }

        public static EventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventTypeEnum) {
                return this.value.equals(((EventTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private EventTypeEnum eventType;

    /**
     * **参数解释**： 事件子类。 **约束限制**： 不涉及。 **取值范围**： 枚举类型 - SUB_EVENT.OPS: 运维事件 - SUB_EVENT.PLAN: 计划事件 - SUB_EVENT.CUSTOM: 自定义事件 **默认取值**： 不涉及。 
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
    @JsonProperty(value = "event_source")

    private String eventSource;

    /**
     * **参数解释**： 事件的级别。 **约束限制**： 不涉及。 **取值范围**： 值为Critical、Major、Minor、Info。 - Critical: 紧急 - Major: 重要 - Minor: 次要 - Info: 提示 **默认取值**： 不涉及。 
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
         * Enum INFO for value: "Info"
         */
        public static final EventLevelEnum INFO = new EventLevelEnum("Info");

        /**
         * Enum MINOR for value: "Minor"
         */
        public static final EventLevelEnum MINOR = new EventLevelEnum("Minor");

        private static final Map<String, EventLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventLevelEnum> createStaticFields() {
            Map<String, EventLevelEnum> map = new HashMap<>();
            map.put("Critical", CRITICAL);
            map.put("Major", MAJOR);
            map.put("Info", INFO);
            map.put("Minor", MINOR);
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

    /**
     * **参数解释**： 事件的状态。 **约束限制**： 不涉及。 **取值范围**： 值为normal、warning、incident。 - normal: 正常 - warning: 警告 - incident: 故障 **默认取值**： 不涉及。 
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListEventDetailRequest withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * **参数解释**： 事件名称，值为系统产生的事件名称或用户自定义上报的事件名称。 **约束限制**： 不涉及。 **取值范围**： 长度为[1,64]个字符。 **默认取值**： 不涉及。 
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ListEventDetailRequest withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释**： 事件类型。 **约束限制**： 不涉及。 **取值范围**： 值为EVENT.SYS或EVENT.CUSTOM。 - EVENT.SYS：系统事件。 - EVENT.CUSTOM：自定义事件。 **默认取值**： 不涉及。 
     * @return eventType
     */
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public ListEventDetailRequest withSubEventType(SubEventTypeEnum subEventType) {
        this.subEventType = subEventType;
        return this;
    }

    /**
     * **参数解释**： 事件子类。 **约束限制**： 不涉及。 **取值范围**： 枚举类型 - SUB_EVENT.OPS: 运维事件 - SUB_EVENT.PLAN: 计划事件 - SUB_EVENT.CUSTOM: 自定义事件 **默认取值**： 不涉及。 
     * @return subEventType
     */
    public SubEventTypeEnum getSubEventType() {
        return subEventType;
    }

    public void setSubEventType(SubEventTypeEnum subEventType) {
        this.subEventType = subEventType;
    }

    public ListEventDetailRequest withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * **参数解释**： 事件来源，取值为各云服务的命名空间。云服务的命名空间请参考“[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/en-us/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)”。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,32]个字符。 正则匹配：以字母开头，中间有一个点，包含字母、数字、下划线的字符串。 **默认取值**： 不涉及。 
     * @return eventSource
     */
    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public ListEventDetailRequest withEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * **参数解释**： 事件的级别。 **约束限制**： 不涉及。 **取值范围**： 值为Critical、Major、Minor、Info。 - Critical: 紧急 - Major: 重要 - Minor: 次要 - Info: 提示 **默认取值**： 不涉及。 
     * @return eventLevel
     */
    public EventLevelEnum getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
    }

    public ListEventDetailRequest withEventUser(String eventUser) {
        this.eventUser = eventUser;
        return this;
    }

    /**
     * **参数解释**： 上报事件监控数据时用户的名称，也可为projectID。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,64]个字符。 正则匹配：由零个或多个字母、数字、下划线、横线、斜杠、空格、@ 符号或点号组成的字符串。 **默认取值**： 不涉及。 
     * @return eventUser
     */
    public String getEventUser() {
        return eventUser;
    }

    public void setEventUser(String eventUser) {
        this.eventUser = eventUser;
    }

    public ListEventDetailRequest withEventState(EventStateEnum eventState) {
        this.eventState = eventState;
        return this;
    }

    /**
     * **参数解释**： 事件的状态。 **约束限制**： 不涉及。 **取值范围**： 值为normal、warning、incident。 - normal: 正常 - warning: 警告 - incident: 故障 **默认取值**： 不涉及。 
     * @return eventState
     */
    public EventStateEnum getEventState() {
        return eventState;
    }

    public void setEventState(EventStateEnum eventState) {
        this.eventState = eventState;
    }

    public ListEventDetailRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释**： 查询数据起始时间，UNIX时间戳，单位毫秒。例如：1605952700911。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * minimum: 1111111111111
     * maximum: 9999999999999
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListEventDetailRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释**： 查询数据截止时间，UNIX时间戳，单位毫秒。 **约束限制**： 其中from必须小于to。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * minimum: 1111111111111
     * maximum: 9999999999999
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListEventDetailRequest withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * **参数解释**： 分页起始值。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 0 
     * minimum: 0
     * maximum: 9999999999999
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public ListEventDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 单次查询的条数限制，用于限制结果数据条数。 **约束限制**： 不涉及。 **取值范围**： 大小为[1,100]的整数 **默认取值**： 100 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventDetailRequest that = (ListEventDetailRequest) obj;
        return Objects.equals(this.eventName, that.eventName) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.subEventType, that.subEventType)
            && Objects.equals(this.eventSource, that.eventSource) && Objects.equals(this.eventLevel, that.eventLevel)
            && Objects.equals(this.eventUser, that.eventUser) && Objects.equals(this.eventState, that.eventState)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.start, that.start) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName,
            eventType,
            subEventType,
            eventSource,
            eventLevel,
            eventUser,
            eventState,
            from,
            to,
            start,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventDetailRequest {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    subEventType: ").append(toIndentedString(subEventType)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
        sb.append("    eventUser: ").append(toIndentedString(eventUser)).append("\n");
        sb.append("    eventState: ").append(toIndentedString(eventState)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
