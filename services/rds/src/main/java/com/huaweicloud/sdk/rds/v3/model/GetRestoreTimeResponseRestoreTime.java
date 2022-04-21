package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetRestoreTimeResponseRestoreTime
 */
public class GetRestoreTimeResponseRestoreTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Integer endTime;

    public GetRestoreTimeResponseRestoreTime withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 可恢复时间段的起始时间点，UNIX时间戳格式，单位是毫秒，时区是UTC。
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public GetRestoreTimeResponseRestoreTime withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 可恢复时间段的结束时间点，UNIX时间戳格式，单位是毫秒，时区是UTC。
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
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
        GetRestoreTimeResponseRestoreTime getRestoreTimeResponseRestoreTime = (GetRestoreTimeResponseRestoreTime) o;
        return Objects.equals(this.startTime, getRestoreTimeResponseRestoreTime.startTime)
            && Objects.equals(this.endTime, getRestoreTimeResponseRestoreTime.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRestoreTimeResponseRestoreTime {\n");
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
