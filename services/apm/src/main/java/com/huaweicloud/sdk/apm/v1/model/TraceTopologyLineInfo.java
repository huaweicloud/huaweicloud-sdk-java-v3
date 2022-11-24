package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 拓扑图上线条的的信息。
 */
public class TraceTopologyLineInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_used")

    private Long timeUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "argument")

    private String argument;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    public TraceTopologyLineInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public TraceTopologyLineInfo withTimeUsed(Long timeUsed) {
        this.timeUsed = timeUsed;
        return this;
    }

    /**
     * 耗时。
     * @return timeUsed
     */
    public Long getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Long timeUsed) {
        this.timeUsed = timeUsed;
    }

    public TraceTopologyLineInfo withArgument(String argument) {
        this.argument = argument;
        return this;
    }

    /**
     * 参数信息，比如调用的url信息等。
     * @return argument
     */
    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

    public TraceTopologyLineInfo withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * event的id。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TraceTopologyLineInfo traceTopologyLineInfo = (TraceTopologyLineInfo) o;
        return Objects.equals(this.startTime, traceTopologyLineInfo.startTime)
            && Objects.equals(this.timeUsed, traceTopologyLineInfo.timeUsed)
            && Objects.equals(this.argument, traceTopologyLineInfo.argument)
            && Objects.equals(this.eventId, traceTopologyLineInfo.eventId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, timeUsed, argument, eventId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TraceTopologyLineInfo {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    timeUsed: ").append(toIndentedString(timeUsed)).append("\n");
        sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
