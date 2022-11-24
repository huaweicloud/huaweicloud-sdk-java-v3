package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 此参数在请求实体中，采用json字符串格式。
 */
public class TimeRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_time_zone")

    private String sqlTimeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time_gt")

    private Boolean startTimeGt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time_lt")

    private Boolean endTimeLt;

    public TimeRange withSqlTimeZone(String sqlTimeZone) {
        this.sqlTimeZone = sqlTimeZone;
        return this;
    }

    /**
     * 时区信息，默认为“UTC”。
     * @return sqlTimeZone
     */
    public String getSqlTimeZone() {
        return sqlTimeZone;
    }

    public void setSqlTimeZone(String sqlTimeZone) {
        this.sqlTimeZone = sqlTimeZone;
    }

    public TimeRange withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 搜索起始时间（UTC时间，毫秒级）。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public TimeRange withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 搜索起始时间（UTC时间，毫秒级）。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public TimeRange withStartTimeGt(Boolean startTimeGt) {
        this.startTimeGt = startTimeGt;
        return this;
    }

    /**
     * 搜索是否包含起始时间点，默认为false。
     * @return startTimeGt
     */
    public Boolean getStartTimeGt() {
        return startTimeGt;
    }

    public void setStartTimeGt(Boolean startTimeGt) {
        this.startTimeGt = startTimeGt;
    }

    public TimeRange withEndTimeLt(Boolean endTimeLt) {
        this.endTimeLt = endTimeLt;
        return this;
    }

    /**
     * 搜索是否包含结束时间点，默认为false。
     * @return endTimeLt
     */
    public Boolean getEndTimeLt() {
        return endTimeLt;
    }

    public void setEndTimeLt(Boolean endTimeLt) {
        this.endTimeLt = endTimeLt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimeRange timeRange = (TimeRange) o;
        return Objects.equals(this.sqlTimeZone, timeRange.sqlTimeZone)
            && Objects.equals(this.startTime, timeRange.startTime) && Objects.equals(this.endTime, timeRange.endTime)
            && Objects.equals(this.startTimeGt, timeRange.startTimeGt)
            && Objects.equals(this.endTimeLt, timeRange.endTimeLt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlTimeZone, startTime, endTime, startTimeGt, endTimeLt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeRange {\n");
        sb.append("    sqlTimeZone: ").append(toIndentedString(sqlTimeZone)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTimeGt: ").append(toIndentedString(startTimeGt)).append("\n");
        sb.append("    endTimeLt: ").append(toIndentedString(endTimeLt)).append("\n");
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
