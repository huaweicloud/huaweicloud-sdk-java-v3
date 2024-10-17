package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TimeRangeBean
 */
public class TimeRangeBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    /**
     * 请求查询的时间段，和start_time，end_time不能同时使用，同时传该参数优先级更高。 - HALF_HOUR - HOUR - THREE_HOUR - TWELVE_HOUR - DAY - WEEK - MONTH
     */
    public static final class TimeRangeEnum {

        /**
         * Enum HALF_HOUR for value: "HALF_HOUR"
         */
        public static final TimeRangeEnum HALF_HOUR = new TimeRangeEnum("HALF_HOUR");

        /**
         * Enum _HOUR for value: " HOUR"
         */
        public static final TimeRangeEnum _HOUR = new TimeRangeEnum(" HOUR");

        /**
         * Enum _THREE_HOUR for value: " THREE_HOUR"
         */
        public static final TimeRangeEnum _THREE_HOUR = new TimeRangeEnum(" THREE_HOUR");

        /**
         * Enum _TWELVE_HOUR for value: " TWELVE_HOUR"
         */
        public static final TimeRangeEnum _TWELVE_HOUR = new TimeRangeEnum(" TWELVE_HOUR");

        /**
         * Enum _DAY for value: " DAY"
         */
        public static final TimeRangeEnum _DAY = new TimeRangeEnum(" DAY");

        /**
         * Enum _WEEK for value: " WEEK"
         */
        public static final TimeRangeEnum _WEEK = new TimeRangeEnum(" WEEK");

        /**
         * Enum _MONTH for value: " MONTH"
         */
        public static final TimeRangeEnum _MONTH = new TimeRangeEnum(" MONTH");

        private static final Map<String, TimeRangeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeRangeEnum> createStaticFields() {
            Map<String, TimeRangeEnum> map = new HashMap<>();
            map.put("HALF_HOUR", HALF_HOUR);
            map.put(" HOUR", _HOUR);
            map.put(" THREE_HOUR", _THREE_HOUR);
            map.put(" TWELVE_HOUR", _TWELVE_HOUR);
            map.put(" DAY", _DAY);
            map.put(" WEEK", _WEEK);
            map.put(" MONTH", _MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeRangeEnum(String value) {
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
        public static TimeRangeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimeRangeEnum(value));
        }

        public static TimeRangeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeRangeEnum) {
                return this.value.equals(((TimeRangeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private TimeRangeEnum timeRange;

    public TimeRangeBean withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 开始时间，必须和end_time成对出现。格式必须为yyyy-MM-dd HH:mm:ss。UTC时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public TimeRangeBean withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 结束时间，必须和start_time成对出现。格式必须为yyyy-MM-dd HH:mm:ss。UTC时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public TimeRangeBean withTimeRange(TimeRangeEnum timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * 请求查询的时间段，和start_time，end_time不能同时使用，同时传该参数优先级更高。 - HALF_HOUR - HOUR - THREE_HOUR - TWELVE_HOUR - DAY - WEEK - MONTH
     * @return timeRange
     */
    public TimeRangeEnum getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRangeEnum timeRange) {
        this.timeRange = timeRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeRangeBean that = (TimeRangeBean) obj;
        return Objects.equals(this.endTime, that.endTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.timeRange, that.timeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, startTime, timeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeRangeBean {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
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
