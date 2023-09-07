package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ScheduledTaskPolicy
 */
public class ScheduledTaskPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_time")

    private String launchTime;

    /**
     * 非必选，不填写时计划任务为定时执行， 填写时，为周期执行，且只能填写DAILY，WEEKLY，MONTHLY 中的一种，分别为按天，按周，按月周期执行
     */
    public static final class RecurrenceTypeEnum {

        /**
         * Enum DAILY for value: "DAILY"
         */
        public static final RecurrenceTypeEnum DAILY = new RecurrenceTypeEnum("DAILY");

        /**
         * Enum WEEKLY for value: "WEEKLY"
         */
        public static final RecurrenceTypeEnum WEEKLY = new RecurrenceTypeEnum("WEEKLY");

        /**
         * Enum MONTHLY for value: "MONTHLY"
         */
        public static final RecurrenceTypeEnum MONTHLY = new RecurrenceTypeEnum("MONTHLY");

        private static final Map<String, RecurrenceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecurrenceTypeEnum> createStaticFields() {
            Map<String, RecurrenceTypeEnum> map = new HashMap<>();
            map.put("DAILY", DAILY);
            map.put("WEEKLY", WEEKLY);
            map.put("MONTHLY", MONTHLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecurrenceTypeEnum(String value) {
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
        public static RecurrenceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecurrenceTypeEnum(value));
        }

        public static RecurrenceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecurrenceTypeEnum) {
                return this.value.equals(((RecurrenceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recurrence_type")

    private RecurrenceTypeEnum recurrenceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recurrence_value")

    private String recurrenceValue;

    public ScheduledTaskPolicy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 非必选，仅当recurrence_type不为空时生效，表示计划任务的生效开始时间，格式为yyyy-MM-dd'T'HH:mm'Z'，不填写时默认为任务创建成功的时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ScheduledTaskPolicy withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 仅当recurrence_type不为空时生效且必选，表示计划任务的生效结束时间，格式为yyyy-MM-dd'T'HH:mm'Z'
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ScheduledTaskPolicy withLaunchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }

    /**
     * 必选，执行时间，采用UTC时间，recurrence_type不填写或为空时，格式为HH:mm, recurrence_type不为空时，格式为yyyy-MM-dd'T'HH:mm'Z'
     * @return launchTime
     */
    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    public ScheduledTaskPolicy withRecurrenceType(RecurrenceTypeEnum recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }

    /**
     * 非必选，不填写时计划任务为定时执行， 填写时，为周期执行，且只能填写DAILY，WEEKLY，MONTHLY 中的一种，分别为按天，按周，按月周期执行
     * @return recurrenceType
     */
    public RecurrenceTypeEnum getRecurrenceType() {
        return recurrenceType;
    }

    public void setRecurrenceType(RecurrenceTypeEnum recurrenceType) {
        this.recurrenceType = recurrenceType;
    }

    public ScheduledTaskPolicy withRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }

    /**
     * 仅当recurrence_type为WEEKLY，MONTHLY时必选，表示周期执行的具体日期，多个日期用,分割。recurrence_type为WEEKLY时，可填入1-7， recurrence_type为MONTHLY时，可填入1-31
     * @return recurrenceValue
     */
    public String getRecurrenceValue() {
        return recurrenceValue;
    }

    public void setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduledTaskPolicy that = (ScheduledTaskPolicy) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.launchTime, that.launchTime)
            && Objects.equals(this.recurrenceType, that.recurrenceType)
            && Objects.equals(this.recurrenceValue, that.recurrenceValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, launchTime, recurrenceType, recurrenceValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledTaskPolicy {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
        sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
        sb.append("    recurrenceValue: ").append(toIndentedString(recurrenceValue)).append("\n");
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
