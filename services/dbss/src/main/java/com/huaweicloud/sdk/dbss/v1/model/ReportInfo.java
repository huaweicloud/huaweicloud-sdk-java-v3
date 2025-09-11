package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReportInfo
 */
public class ReportInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report")

    private ReportBean report;

    public ReportInfo withReport(ReportBean report) {
        this.report = report;
        return this;
    }

    public ReportInfo withReport(Consumer<ReportBean> reportSetter) {
        if (this.report == null) {
            this.report = new ReportBean();
            reportSetter.accept(this.report);
        }

        return this;
    }

    /**
     * Get report
     * @return report
     */
    public ReportBean getReport() {
        return report;
    }

    public void setReport(ReportBean report) {
        this.report = report;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportInfo that = (ReportInfo) obj;
        return Objects.equals(this.report, that.report);
    }

    @Override
    public int hashCode() {
        return Objects.hash(report);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportInfo {\n");
        sb.append("    report: ").append(toIndentedString(report)).append("\n");
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
