package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 支持补离散时间任务
 */
public class SupplementDataRespSupplementDataInstanceTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days")

    private List<String> days = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_of_day")

    private String timeOfDay;

    public SupplementDataRespSupplementDataInstanceTime withDays(List<String> days) {
        this.days = days;
        return this;
    }

    public SupplementDataRespSupplementDataInstanceTime addDaysItem(String daysItem) {
        if (this.days == null) {
            this.days = new ArrayList<>();
        }
        this.days.add(daysItem);
        return this;
    }

    public SupplementDataRespSupplementDataInstanceTime withDays(Consumer<List<String>> daysSetter) {
        if (this.days == null) {
            this.days = new ArrayList<>();
        }
        daysSetter.accept(this.days);
        return this;
    }

    /**
     * 支持离散的天
     * @return days
     */
    public List<String> getDays() {
        return days;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

    public SupplementDataRespSupplementDataInstanceTime withTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
        return this;
    }

    /**
     * 一天中的时间段
     * @return timeOfDay
     */
    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupplementDataRespSupplementDataInstanceTime that = (SupplementDataRespSupplementDataInstanceTime) obj;
        return Objects.equals(this.days, that.days) && Objects.equals(this.timeOfDay, that.timeOfDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, timeOfDay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplementDataRespSupplementDataInstanceTime {\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
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
