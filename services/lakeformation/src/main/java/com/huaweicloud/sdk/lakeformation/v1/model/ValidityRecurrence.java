package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ValidityRecurrence
 */
public class ValidityRecurrence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private ValidityInterval interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private RecurrenceSchedule schedule;

    public ValidityRecurrence withInterval(ValidityInterval interval) {
        this.interval = interval;
        return this;
    }

    public ValidityRecurrence withInterval(Consumer<ValidityInterval> intervalSetter) {
        if (this.interval == null) {
            this.interval = new ValidityInterval();
            intervalSetter.accept(this.interval);
        }

        return this;
    }

    /**
     * Get interval
     * @return interval
     */
    public ValidityInterval getInterval() {
        return interval;
    }

    public void setInterval(ValidityInterval interval) {
        this.interval = interval;
    }

    public ValidityRecurrence withSchedule(RecurrenceSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public ValidityRecurrence withSchedule(Consumer<RecurrenceSchedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new RecurrenceSchedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public RecurrenceSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(RecurrenceSchedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidityRecurrence that = (ValidityRecurrence) obj;
        return Objects.equals(this.interval, that.interval) && Objects.equals(this.schedule, that.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interval, schedule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidityRecurrence {\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
