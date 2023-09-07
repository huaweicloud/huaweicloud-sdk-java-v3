package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Schedule
 */
public class Schedule {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum EXECUTE_ONCE for value: "EXECUTE_ONCE"
         */
        public static final TypeEnum EXECUTE_ONCE = new TypeEnum("EXECUTE_ONCE");

        /**
         * Enum EVENT_TRIGGER for value: "EVENT_TRIGGER"
         */
        public static final TypeEnum EVENT_TRIGGER = new TypeEnum("EVENT_TRIGGER");

        /**
         * Enum RUN_ONCE for value: "RUN_ONCE"
         */
        public static final TypeEnum RUN_ONCE = new TypeEnum("RUN_ONCE");

        /**
         * Enum CRON for value: "CRON"
         */
        public static final TypeEnum CRON = new TypeEnum("CRON");

        /**
         * Enum EVENT for value: "EVENT"
         */
        public static final TypeEnum EVENT = new TypeEnum("EVENT");

        /**
         * Enum SCHEDULE for value: "SCHEDULE"
         */
        public static final TypeEnum SCHEDULE = new TypeEnum("SCHEDULE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("EXECUTE_ONCE", EXECUTE_ONCE);
            map.put("EVENT_TRIGGER", EVENT_TRIGGER);
            map.put("RUN_ONCE", RUN_ONCE);
            map.put("CRON", CRON);
            map.put("EVENT", EVENT);
            map.put("SCHEDULE", SCHEDULE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron")

    private Cron cron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private Event event;

    public Schedule withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Schedule withCron(Cron cron) {
        this.cron = cron;
        return this;
    }

    public Schedule withCron(Consumer<Cron> cronSetter) {
        if (this.cron == null) {
            this.cron = new Cron();
            cronSetter.accept(this.cron);
        }

        return this;
    }

    /**
     * Get cron
     * @return cron
     */
    public Cron getCron() {
        return cron;
    }

    public void setCron(Cron cron) {
        this.cron = cron;
    }

    public Schedule withEvent(Event event) {
        this.event = event;
        return this;
    }

    public Schedule withEvent(Consumer<Event> eventSetter) {
        if (this.event == null) {
            this.event = new Event();
            eventSetter.accept(this.event);
        }

        return this;
    }

    /**
     * Get event
     * @return event
     */
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Schedule that = (Schedule) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.cron, that.cron)
            && Objects.equals(this.event, that.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cron, event);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Schedule {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
