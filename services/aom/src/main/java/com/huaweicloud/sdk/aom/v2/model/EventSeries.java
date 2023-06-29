package com.huaweicloud.sdk.aom.v2.model;

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
 * 事件或者告警统计值统计结果元数据。
 */
public class EventSeries {

    /**
     * 事件或者告警级别枚举类型。
     */
    public static final class EventSeverityEnum {

        /**
         * Enum CRITICAL for value: "Critical"
         */
        public static final EventSeverityEnum CRITICAL = new EventSeverityEnum("Critical");

        /**
         * Enum MAJOR for value: "Major"
         */
        public static final EventSeverityEnum MAJOR = new EventSeverityEnum("Major");

        /**
         * Enum MINOR for value: "Minor"
         */
        public static final EventSeverityEnum MINOR = new EventSeverityEnum("Minor");

        /**
         * Enum INFO for value: "Info"
         */
        public static final EventSeverityEnum INFO = new EventSeverityEnum("Info");

        private static final Map<String, EventSeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventSeverityEnum> createStaticFields() {
            Map<String, EventSeverityEnum> map = new HashMap<>();
            map.put("Critical", CRITICAL);
            map.put("Major", MAJOR);
            map.put("Minor", MINOR);
            map.put("Info", INFO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventSeverityEnum(String value) {
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
        public static EventSeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventSeverityEnum(value));
        }

        public static EventSeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventSeverityEnum) {
                return this.value.equals(((EventSeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_severity")

    private EventSeverityEnum eventSeverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<Integer> values = null;

    public EventSeries withEventSeverity(EventSeverityEnum eventSeverity) {
        this.eventSeverity = eventSeverity;
        return this;
    }

    /**
     * 事件或者告警级别枚举类型。
     * @return eventSeverity
     */
    public EventSeverityEnum getEventSeverity() {
        return eventSeverity;
    }

    public void setEventSeverity(EventSeverityEnum eventSeverity) {
        this.eventSeverity = eventSeverity;
    }

    public EventSeries withValues(List<Integer> values) {
        this.values = values;
        return this;
    }

    public EventSeries addValuesItem(Integer valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public EventSeries withValues(Consumer<List<Integer>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 事件或者告警统计结果。
     * @return values
     */
    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventSeries that = (EventSeries) obj;
        return Objects.equals(this.eventSeverity, that.eventSeverity) && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSeverity, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSeries {\n");
        sb.append("    eventSeverity: ").append(toIndentedString(eventSeverity)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
