package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略有效期。
 */
public class JobScheduleDurationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_start_date")

    private String activeStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_end_date")

    private String activeEndDate;

    public JobScheduleDurationInfo withActiveStartDate(String activeStartDate) {
        this.activeStartDate = activeStartDate;
        return this;
    }

    /**
     * 第一次执行日期 yyyy-MM-dd。取值范围1990-01-01至2099-12-31
     * @return activeStartDate
     */
    public String getActiveStartDate() {
        return activeStartDate;
    }

    public void setActiveStartDate(String activeStartDate) {
        this.activeStartDate = activeStartDate;
    }

    public JobScheduleDurationInfo withActiveEndDate(String activeEndDate) {
        this.activeEndDate = activeEndDate;
        return this;
    }

    /**
     * 最后一次执行日期。默认不会结束 yyyy-MM-dd
     * @return activeEndDate
     */
    public String getActiveEndDate() {
        return activeEndDate;
    }

    public void setActiveEndDate(String activeEndDate) {
        this.activeEndDate = activeEndDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScheduleDurationInfo that = (JobScheduleDurationInfo) obj;
        return Objects.equals(this.activeStartDate, that.activeStartDate)
            && Objects.equals(this.activeEndDate, that.activeEndDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeStartDate, activeEndDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScheduleDurationInfo {\n");
        sb.append("    activeStartDate: ").append(toIndentedString(activeStartDate)).append("\n");
        sb.append("    activeEndDate: ").append(toIndentedString(activeEndDate)).append("\n");
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
