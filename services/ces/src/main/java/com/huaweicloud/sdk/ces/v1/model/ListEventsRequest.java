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
public class ListEventsRequest {

    /**
     * 事件类型，值为EVENT.SYS或EVENT.CUSTOM，EVENT.SYS表示系统事件，EVENT.CUSTOM表示自定义事件。
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
     * 事件子类, 枚举类型：SUB_EVENT.OPS 运维事件, SUB_EVENT.PLAN 计划事件，SUB_EVENT.CUSTOM 自定义事件
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
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListEventsRequest withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，值为EVENT.SYS或EVENT.CUSTOM，EVENT.SYS表示系统事件，EVENT.CUSTOM表示自定义事件。
     * @return eventType
     */
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public ListEventsRequest withSubEventType(SubEventTypeEnum subEventType) {
        this.subEventType = subEventType;
        return this;
    }

    /**
     * 事件子类, 枚举类型：SUB_EVENT.OPS 运维事件, SUB_EVENT.PLAN 计划事件，SUB_EVENT.CUSTOM 自定义事件
     * @return subEventType
     */
    public SubEventTypeEnum getSubEventType() {
        return subEventType;
    }

    public void setSubEventType(SubEventTypeEnum subEventType) {
        this.subEventType = subEventType;
    }

    public ListEventsRequest withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 事件名称，值为系统产生的事件名称，或用户自定义上报的事件名称。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ListEventsRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 查询数据起始时间，UNIX时间戳，单位毫秒；例如：1605952700911。
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

    public ListEventsRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 查询数据截止时间UNIX时间戳，单位毫秒。from必须小于to，例如：1606557500911。
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

    public ListEventsRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * 分页起始值，默认值为0。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public ListEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的条数限制，取值范围[0,100]，默认值为100，用于限制结果数据条数。
     * minimum: 0
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
        ListEventsRequest that = (ListEventsRequest) obj;
        return Objects.equals(this.eventType, that.eventType) && Objects.equals(this.subEventType, that.subEventType)
            && Objects.equals(this.eventName, that.eventName) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.start, that.start)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, subEventType, eventName, from, to, start, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsRequest {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    subEventType: ").append(toIndentedString(subEventType)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
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
