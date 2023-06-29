package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ValidityInterval
 */
public class ValidityInterval {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days")

    private Integer days;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hours")

    private Integer hours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minutes")

    private Integer minutes;

    public ValidityInterval withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * 日
     * minimum: 1
     * maximum: 31
     * @return days
     */
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public ValidityInterval withHours(Integer hours) {
        this.hours = hours;
        return this;
    }

    /**
     * 时
     * minimum: 0
     * maximum: 23
     * @return hours
     */
    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public ValidityInterval withMinutes(Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * 分
     * minimum: 0
     * maximum: 59
     * @return minutes
     */
    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidityInterval that = (ValidityInterval) obj;
        return Objects.equals(this.days, that.days) && Objects.equals(this.hours, that.hours)
            && Objects.equals(this.minutes, that.minutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, hours, minutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidityInterval {\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
        sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
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
