package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TimeRange
 */
public class TimeRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_type")

    private String timeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private String end;

    public TimeRange withTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }

    /**
     * 可选值：ddlUpdateTime、dataUpdateTime、ddlCreateTime
     * @return timeType
     */
    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public TimeRange withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * 开始时间
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public TimeRange withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * 结束时间
     * @return end
     */
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeRange that = (TimeRange) obj;
        return Objects.equals(this.timeType, that.timeType) && Objects.equals(this.start, that.start)
            && Objects.equals(this.end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeType, start, end);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeRange {\n");
        sb.append("    timeType: ").append(toIndentedString(timeType)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
