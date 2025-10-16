package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行一次执行时间。
 */
public class JobScheduleOneTimeOccurrenceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_start_date")

    private String activeStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_start_time")

    private String activeStartTime;

    public JobScheduleOneTimeOccurrenceInfo withActiveStartDate(String activeStartDate) {
        this.activeStartDate = activeStartDate;
        return this;
    }

    /**
     * 执行日期 yyyy-MM-dd。取值范围1990-01-01至2099-12-31
     * @return activeStartDate
     */
    public String getActiveStartDate() {
        return activeStartDate;
    }

    public void setActiveStartDate(String activeStartDate) {
        this.activeStartDate = activeStartDate;
    }

    public JobScheduleOneTimeOccurrenceInfo withActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
        return this;
    }

    /**
     * 执行时间。HH:mm:ss
     * @return activeStartTime
     */
    public String getActiveStartTime() {
        return activeStartTime;
    }

    public void setActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScheduleOneTimeOccurrenceInfo that = (JobScheduleOneTimeOccurrenceInfo) obj;
        return Objects.equals(this.activeStartDate, that.activeStartDate)
            && Objects.equals(this.activeStartTime, that.activeStartTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeStartDate, activeStartTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScheduleOneTimeOccurrenceInfo {\n");
        sb.append("    activeStartDate: ").append(toIndentedString(activeStartDate)).append("\n");
        sb.append("    activeStartTime: ").append(toIndentedString(activeStartTime)).append("\n");
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
