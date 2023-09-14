package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 运行时间段
 */
public class SupplementDataInfoSupplementDataRunTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_of_day")

    private String timeOfDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_of_week")

    private String dayOfWeek;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_of_month")

    private String dayOfMonth;

    public SupplementDataInfoSupplementDataRunTime withTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
        return this;
    }

    /**
     * 每天的可补数据时间段，如：每天的10点15分到23点30分，表示：10:15-23:30
     * @return timeOfDay
     */
    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public SupplementDataInfoSupplementDataRunTime withDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * 每周的星期几可以补数据，如：每周一，周三的每天10点15分到23点30分。
     * @return dayOfWeek
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public SupplementDataInfoSupplementDataRunTime withDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    /**
     * 每个月的哪几天可以补数据，如每月1号，3号，表示：1,3
     * @return dayOfMonth
     */
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupplementDataInfoSupplementDataRunTime that = (SupplementDataInfoSupplementDataRunTime) obj;
        return Objects.equals(this.timeOfDay, that.timeOfDay) && Objects.equals(this.dayOfWeek, that.dayOfWeek)
            && Objects.equals(this.dayOfMonth, that.dayOfMonth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeOfDay, dayOfWeek, dayOfMonth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplementDataInfoSupplementDataRunTime {\n");
        sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
        sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
        sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
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
