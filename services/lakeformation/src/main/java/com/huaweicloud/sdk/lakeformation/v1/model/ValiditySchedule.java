package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ValiditySchedule
 */
public class ValiditySchedule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recurrences")

    private List<ValidityRecurrence> recurrences = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public ValiditySchedule withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * end时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ValiditySchedule withRecurrences(List<ValidityRecurrence> recurrences) {
        this.recurrences = recurrences;
        return this;
    }

    public ValiditySchedule addRecurrencesItem(ValidityRecurrence recurrencesItem) {
        if (this.recurrences == null) {
            this.recurrences = new ArrayList<>();
        }
        this.recurrences.add(recurrencesItem);
        return this;
    }

    public ValiditySchedule withRecurrences(Consumer<List<ValidityRecurrence>> recurrencesSetter) {
        if (this.recurrences == null) {
            this.recurrences = new ArrayList<>();
        }
        recurrencesSetter.accept(this.recurrences);
        return this;
    }

    /**
     * 策略递归
     * @return recurrences
     */
    public List<ValidityRecurrence> getRecurrences() {
        return recurrences;
    }

    public void setRecurrences(List<ValidityRecurrence> recurrences) {
        this.recurrences = recurrences;
    }

    public ValiditySchedule withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ValiditySchedule withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时间域
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValiditySchedule validitySchedule = (ValiditySchedule) o;
        return Objects.equals(this.endTime, validitySchedule.endTime)
            && Objects.equals(this.recurrences, validitySchedule.recurrences)
            && Objects.equals(this.startTime, validitySchedule.startTime)
            && Objects.equals(this.timeZone, validitySchedule.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, recurrences, startTime, timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValiditySchedule {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    recurrences: ").append(toIndentedString(recurrences)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
