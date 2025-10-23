package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowAlarmSummaryResponseBodyStatistics
 */
public class ShowAlarmSummaryResponseBodyStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "counts")

    private Integer counts;

    public ShowAlarmSummaryResponseBodyStatistics withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 告警级别，取值范围:1,2,3,4
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ShowAlarmSummaryResponseBodyStatistics withCounts(Integer counts) {
        this.counts = counts;
        return this;
    }

    /**
     * 告警数量
     * @return counts
     */
    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAlarmSummaryResponseBodyStatistics that = (ShowAlarmSummaryResponseBodyStatistics) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.counts, that.counts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, counts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmSummaryResponseBodyStatistics {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
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
