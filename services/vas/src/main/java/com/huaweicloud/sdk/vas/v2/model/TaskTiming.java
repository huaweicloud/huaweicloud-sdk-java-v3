package com.huaweicloud.sdk.vas.v2.model;

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
 * 计划任务的配置项，选填。计划任务不支持obs输入，对于url输入则仅支持rtmp和rtsp两种形式。
 */
public class TaskTiming {

    /**
     * 计划任务的类型，使用计划任务时必填。可选类型分别为once（仅执行一次），daily（每日执行），weekly（每周执行），monthly（每月执行）。
     */
    public static final class TypeEnum {

        /**
         * Enum ONCE for value: "once"
         */
        public static final TypeEnum ONCE = new TypeEnum("once");

        /**
         * Enum DAILY for value: "daily"
         */
        public static final TypeEnum DAILY = new TypeEnum("daily");

        /**
         * Enum WEEKLY for value: "weekly"
         */
        public static final TypeEnum WEEKLY = new TypeEnum("weekly");

        /**
         * Enum MONTHLY for value: "monthly"
         */
        public static final TypeEnum MONTHLY = new TypeEnum("monthly");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("once", ONCE);
            map.put("daily", DAILY);
            map.put("weekly", WEEKLY);
            map.put("monthly", MONTHLY);
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
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days_of_week")

    private List<Integer> daysOfWeek = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days_of_month")

    private List<Integer> daysOfMonth = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periods")

    private List<TaskTimingPeriods> periods = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private TaskTimingFrequency frequency;

    public TaskTiming withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 计划任务的类型，使用计划任务时必填。可选类型分别为once（仅执行一次），daily（每日执行），weekly（每周执行），monthly（每月执行）。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public TaskTiming withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 用户所处的时区，使用计划任务时必填。精确到分钟。
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public TaskTiming withDaysOfWeek(List<Integer> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    public TaskTiming addDaysOfWeekItem(Integer daysOfWeekItem) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        this.daysOfWeek.add(daysOfWeekItem);
        return this;
    }

    public TaskTiming withDaysOfWeek(Consumer<List<Integer>> daysOfWeekSetter) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        daysOfWeekSetter.accept(this.daysOfWeek);
        return this;
    }

    /**
     * 作业会在一周的哪几天执行，当且仅当计划任务类型为weekly时，该字段需填且必填。1~7分别指代星期一至星期日。
     * @return daysOfWeek
     */
    public List<Integer> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<Integer> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public TaskTiming withDaysOfMonth(List<Integer> daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
        return this;
    }

    public TaskTiming addDaysOfMonthItem(Integer daysOfMonthItem) {
        if (this.daysOfMonth == null) {
            this.daysOfMonth = new ArrayList<>();
        }
        this.daysOfMonth.add(daysOfMonthItem);
        return this;
    }

    public TaskTiming withDaysOfMonth(Consumer<List<Integer>> daysOfMonthSetter) {
        if (this.daysOfMonth == null) {
            this.daysOfMonth = new ArrayList<>();
        }
        daysOfMonthSetter.accept(this.daysOfMonth);
        return this;
    }

    /**
     * 作业会在一个月的哪几天执行，当且仅当计划任务类型为monthly时，该字段需填且必填。1~31分别指代一个月中的1日至31日。
     * @return daysOfMonth
     */
    public List<Integer> getDaysOfMonth() {
        return daysOfMonth;
    }

    public void setDaysOfMonth(List<Integer> daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
    }

    public TaskTiming withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 作业的执行日。当且仅当计划任务类型为once且为频率模式时，该字段需填且必填。格式形如yyyy-MM-dd。
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TaskTiming withPeriods(List<TaskTimingPeriods> periods) {
        this.periods = periods;
        return this;
    }

    public TaskTiming addPeriodsItem(TaskTimingPeriods periodsItem) {
        if (this.periods == null) {
            this.periods = new ArrayList<>();
        }
        this.periods.add(periodsItem);
        return this;
    }

    public TaskTiming withPeriods(Consumer<List<TaskTimingPeriods>> periodsSetter) {
        if (this.periods == null) {
            this.periods = new ArrayList<>();
        }
        periodsSetter.accept(this.periods);
        return this;
    }

    /**
     * 时间段模式配置。和frequency字段二选一，不可共存。时间段模式下，至少需指定一个时间段。
     * @return periods
     */
    public List<TaskTimingPeriods> getPeriods() {
        return periods;
    }

    public void setPeriods(List<TaskTimingPeriods> periods) {
        this.periods = periods;
    }

    public TaskTiming withFrequency(TaskTimingFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public TaskTiming withFrequency(Consumer<TaskTimingFrequency> frequencySetter) {
        if (this.frequency == null) {
            this.frequency = new TaskTimingFrequency();
            frequencySetter.accept(this.frequency);
        }

        return this;
    }

    /**
     * Get frequency
     * @return frequency
     */
    public TaskTimingFrequency getFrequency() {
        return frequency;
    }

    public void setFrequency(TaskTimingFrequency frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskTiming that = (TaskTiming) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.daysOfWeek, that.daysOfWeek) && Objects.equals(this.daysOfMonth, that.daysOfMonth)
            && Objects.equals(this.date, that.date) && Objects.equals(this.periods, that.periods)
            && Objects.equals(this.frequency, that.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, timezone, daysOfWeek, daysOfMonth, date, periods, frequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskTiming {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
        sb.append("    daysOfMonth: ").append(toIndentedString(daysOfMonth)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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
