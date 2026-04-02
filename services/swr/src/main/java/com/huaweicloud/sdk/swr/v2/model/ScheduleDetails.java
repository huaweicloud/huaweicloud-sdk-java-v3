package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ScheduleDetails
 */
public class ScheduleDetails {

    /**
     * 计划类型。有效值为'None'（无）和 'Custom'（自定义）。  Custom' 表示按照指定的 cron 计划触发，而 'None' 则表示取消定时计划。 
     */
    public static final class TypeEnum {

        /**
         * Enum NONE for value: "None"
         */
        public static final TypeEnum NONE = new TypeEnum("None");

        /**
         * Enum CUSTOM for value: "Custom"
         */
        public static final TypeEnum CUSTOM = new TypeEnum("Custom");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("None", NONE);
            map.put("Custom", CUSTOM);
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

    private String cron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_scheduled_time")

    private String nextScheduledTime;

    public ScheduleDetails withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 计划类型。有效值为'None'（无）和 'Custom'（自定义）。  Custom' 表示按照指定的 cron 计划触发，而 'None' 则表示取消定时计划。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ScheduleDetails withCron(String cron) {
        this.cron = cron;
        return this;
    }

    /**
     * cron表达式，一种基于时间的任务调度器，type设置为Custom时，需要配置此值。
     * @return cron
     */
    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public ScheduleDetails withNextScheduledTime(String nextScheduledTime) {
        this.nextScheduledTime = nextScheduledTime;
        return this;
    }

    /**
     * 下次执行任务的时间。
     * @return nextScheduledTime
     */
    public String getNextScheduledTime() {
        return nextScheduledTime;
    }

    public void setNextScheduledTime(String nextScheduledTime) {
        this.nextScheduledTime = nextScheduledTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleDetails that = (ScheduleDetails) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.cron, that.cron)
            && Objects.equals(this.nextScheduledTime, that.nextScheduledTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cron, nextScheduledTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleDetails {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    nextScheduledTime: ").append(toIndentedString(nextScheduledTime)).append("\n");
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
