package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 报告统计周期的结束时间
 */
public class ReportRuleRequestEndTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day")

    private Integer day;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week")

    private Integer week;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month")

    private Integer month;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public ReportRuleRequestEndTime withDay(Integer day) {
        this.day = day;
        return this;
    }

    /**
     * 报告统计周期的日期，前一天为-1，当天为0
     * minimum: -1
     * maximum: 32
     * @return day
     */
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public ReportRuleRequestEndTime withWeek(Integer week) {
        this.week = week;
        return this;
    }

    /**
     * 报告统计周期的日期，前一周为-1，本周为0
     * minimum: -1
     * maximum: 32
     * @return week
     */
    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public ReportRuleRequestEndTime withMonth(Integer month) {
        this.month = month;
        return this;
    }

    /**
     * 报告统计周期的日期，上一月为-1，本月为0
     * minimum: -6
     * maximum: 32
     * @return month
     */
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public ReportRuleRequestEndTime withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 报告统计周期的结束，具体时间，时分秒格式
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportRuleRequestEndTime that = (ReportRuleRequestEndTime) obj;
        return Objects.equals(this.day, that.day) && Objects.equals(this.week, that.week)
            && Objects.equals(this.month, that.month) && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, week, month, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportRuleRequestEndTime {\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
        sb.append("    week: ").append(toIndentedString(week)).append("\n");
        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
