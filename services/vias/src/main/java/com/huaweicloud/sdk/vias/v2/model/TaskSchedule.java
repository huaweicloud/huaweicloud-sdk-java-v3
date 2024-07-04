package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 定时任务参数，定时周期 仅支持周模式
 */
public class TaskSchedule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

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
    @JsonProperty(value = "periods")

    private List<List<Object>> periods = null;

    public TaskSchedule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 计划任务的类型，使用计划任务时必填。可选类型weekly（每周执行）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TaskSchedule withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 用户所处的时区，使用计划任务时必填。精确到分钟
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public TaskSchedule withDaysOfWeek(List<Integer> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    public TaskSchedule addDaysOfWeekItem(Integer daysOfWeekItem) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        this.daysOfWeek.add(daysOfWeekItem);
        return this;
    }

    public TaskSchedule withDaysOfWeek(Consumer<List<Integer>> daysOfWeekSetter) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        daysOfWeekSetter.accept(this.daysOfWeek);
        return this;
    }

    /**
     * 任务会在一周的哪几天执行，当且仅当计划任务类型为weekly时，该字段需填且必填。1~7分别指代星期一至星期日
     * @return daysOfWeek
     */
    public List<Integer> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<Integer> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public TaskSchedule withDaysOfMonth(List<Integer> daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
        return this;
    }

    public TaskSchedule addDaysOfMonthItem(Integer daysOfMonthItem) {
        if (this.daysOfMonth == null) {
            this.daysOfMonth = new ArrayList<>();
        }
        this.daysOfMonth.add(daysOfMonthItem);
        return this;
    }

    public TaskSchedule withDaysOfMonth(Consumer<List<Integer>> daysOfMonthSetter) {
        if (this.daysOfMonth == null) {
            this.daysOfMonth = new ArrayList<>();
        }
        daysOfMonthSetter.accept(this.daysOfMonth);
        return this;
    }

    /**
     * 任务会在一个月的哪几天执行，当且仅当计划任务类型为monthly时，该字段需填且必填。1~31分别指代一个月中的1日至31日，当前系统不支持该参数。
     * @return daysOfMonth
     */
    public List<Integer> getDaysOfMonth() {
        return daysOfMonth;
    }

    public void setDaysOfMonth(List<Integer> daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
    }

    public TaskSchedule withPeriods(List<List<Object>> periods) {
        this.periods = periods;
        return this;
    }

    public TaskSchedule addPeriodsItem(List<Object> periodsItem) {
        if (this.periods == null) {
            this.periods = new ArrayList<>();
        }
        this.periods.add(periodsItem);
        return this;
    }

    public TaskSchedule withPeriods(Consumer<List<List<Object>>> periodsSetter) {
        if (this.periods == null) {
            this.periods = new ArrayList<>();
        }
        periodsSetter.accept(this.periods);
        return this;
    }

    /**
     * 时间段模式配置，指定周计划或者月计划中具体每天任务的执行时间段，至少需指定一个时间段
     * @return periods
     */
    public List<List<Object>> getPeriods() {
        return periods;
    }

    public void setPeriods(List<List<Object>> periods) {
        this.periods = periods;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskSchedule that = (TaskSchedule) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.daysOfWeek, that.daysOfWeek) && Objects.equals(this.daysOfMonth, that.daysOfMonth)
            && Objects.equals(this.periods, that.periods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, timezone, daysOfWeek, daysOfMonth, periods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskSchedule {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
        sb.append("    daysOfMonth: ").append(toIndentedString(daysOfMonth)).append("\n");
        sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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
