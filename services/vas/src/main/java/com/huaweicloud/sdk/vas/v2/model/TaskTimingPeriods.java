package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskTimingPeriods
 */
public class TaskTimingPeriods {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_at")

    private String beginAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private String endAt;

    public TaskTimingPeriods withBeginAt(String beginAt) {
        this.beginAt = beginAt;
        return this;
    }

    /**
     * 单个时间段执行的起始时间，和end_at需成对出现。计划任务类型为once时，格式为yyyy-MM-ddThh:mm:ss，其余计划任务类型时，格式为hh:mm:ss。
     * @return beginAt
     */
    public String getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }

    public TaskTimingPeriods withEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 单个时间段执行的结束时间，和begin_at需成对出现。计划任务类型为once时，格式为yyyy-MM-ddThh:mm:ss，其余计划任务类型时，格式为hh:mm:ss。
     * @return endAt
     */
    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskTimingPeriods taskTimingPeriods = (TaskTimingPeriods) o;
        return Objects.equals(this.beginAt, taskTimingPeriods.beginAt)
            && Objects.equals(this.endAt, taskTimingPeriods.endAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginAt, endAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskTimingPeriods {\n");
        sb.append("    beginAt: ").append(toIndentedString(beginAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
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
