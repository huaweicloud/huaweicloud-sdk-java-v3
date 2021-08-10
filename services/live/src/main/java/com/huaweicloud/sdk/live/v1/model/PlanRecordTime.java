package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/** PlanRecordTime */
public class PlanRecordTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private LocalDate startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private LocalDate endTime;

    public PlanRecordTime withStartTime(LocalDate startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 录制开始时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间。
     * 
     * @return startTime */
    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public PlanRecordTime withEndTime(LocalDate endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 录制结束时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间。如果填写，填写的时间必须晚于当前时间。如果不填写，则在计划录制触发后不停止。
     * 
     * @return endTime */
    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanRecordTime planRecordTime = (PlanRecordTime) o;
        return Objects.equals(this.startTime, planRecordTime.startTime)
            && Objects.equals(this.endTime, planRecordTime.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanRecordTime {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
