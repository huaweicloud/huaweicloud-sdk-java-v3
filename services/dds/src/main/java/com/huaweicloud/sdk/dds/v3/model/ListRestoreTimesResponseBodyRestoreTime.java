package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListRestoreTimesResponseBodyRestoreTime
 */
public class ListRestoreTimesResponseBodyRestoreTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ListRestoreTimesResponseBodyRestoreTime withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 可恢复时间段的起始时间点，UNIX时间戳格式，单位是毫秒，时区是UTC。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListRestoreTimesResponseBodyRestoreTime withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 可恢复时间段的起始时间点，UNIX时间戳格式，单位是毫秒，时区是UTC。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
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
        ListRestoreTimesResponseBodyRestoreTime listRestoreTimesResponseBodyRestoreTime =
            (ListRestoreTimesResponseBodyRestoreTime) o;
        return Objects.equals(this.startTime, listRestoreTimesResponseBodyRestoreTime.startTime)
            && Objects.equals(this.endTime, listRestoreTimesResponseBodyRestoreTime.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRestoreTimesResponseBodyRestoreTime {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
