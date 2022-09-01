package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWeeklyReportsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_start_date")

    @JacksonXmlProperty(localName = "period_start_date")

    private String periodStartDate;

    public ListWeeklyReportsRequest withPeriodStartDate(String periodStartDate) {
        this.periodStartDate = periodStartDate;
        return this;
    }

    /**
     * 每周的起始时间
     * @return periodStartDate
     */
    public String getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(String periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWeeklyReportsRequest listWeeklyReportsRequest = (ListWeeklyReportsRequest) o;
        return Objects.equals(this.periodStartDate, listWeeklyReportsRequest.periodStartDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodStartDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWeeklyReportsRequest {\n");
        sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
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
