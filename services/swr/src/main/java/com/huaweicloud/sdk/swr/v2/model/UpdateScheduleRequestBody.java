package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateScheduleRequestBody
 */
public class UpdateScheduleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private ScheduleObj schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private GcParameters parameters;

    public UpdateScheduleRequestBody withSchedule(ScheduleObj schedule) {
        this.schedule = schedule;
        return this;
    }

    public UpdateScheduleRequestBody withSchedule(Consumer<ScheduleObj> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new ScheduleObj();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public ScheduleObj getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleObj schedule) {
        this.schedule = schedule;
    }

    public UpdateScheduleRequestBody withParameters(GcParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public UpdateScheduleRequestBody withParameters(Consumer<GcParameters> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new GcParameters();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public GcParameters getParameters() {
        return parameters;
    }

    public void setParameters(GcParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateScheduleRequestBody that = (UpdateScheduleRequestBody) obj;
        return Objects.equals(this.schedule, that.schedule) && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScheduleRequestBody {\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
