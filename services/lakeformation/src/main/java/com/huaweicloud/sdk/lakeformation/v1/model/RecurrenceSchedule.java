package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecurrenceSchedule
 */
public class RecurrenceSchedule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_of_month")

    private String dayOfMonth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_of_week")

    private String dayOfWeek;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour")

    private String hour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minute")

    private String minute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month")

    private String month;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "year")

    private String year;

    public RecurrenceSchedule withDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    /**
     * 日期按月
     * @return dayOfMonth
     */
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public RecurrenceSchedule withDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * 日期按星期
     * @return dayOfWeek
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public RecurrenceSchedule withHour(String hour) {
        this.hour = hour;
        return this;
    }

    /**
     * 时
     * @return hour
     */
    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public RecurrenceSchedule withMinute(String minute) {
        this.minute = minute;
        return this;
    }

    /**
     * 分
     * @return minute
     */
    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public RecurrenceSchedule withMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * 月
     * @return month
     */
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public RecurrenceSchedule withYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * 年
     * @return year
     */
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecurrenceSchedule that = (RecurrenceSchedule) obj;
        return Objects.equals(this.dayOfMonth, that.dayOfMonth) && Objects.equals(this.dayOfWeek, that.dayOfWeek)
            && Objects.equals(this.hour, that.hour) && Objects.equals(this.minute, that.minute)
            && Objects.equals(this.month, that.month) && Objects.equals(this.year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayOfMonth, dayOfWeek, hour, minute, month, year);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecurrenceSchedule {\n");
        sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
        sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
        sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
        sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
