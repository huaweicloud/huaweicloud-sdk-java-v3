package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_download_url")

    private String reportDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_info")

    private ReportEntity reportInfo;

    public ShowReportResponse withReportDownloadUrl(String reportDownloadUrl) {
        this.reportDownloadUrl = reportDownloadUrl;
        return this;
    }

    /**
     * 报告下载链接
     * @return reportDownloadUrl
     */
    public String getReportDownloadUrl() {
        return reportDownloadUrl;
    }

    public void setReportDownloadUrl(String reportDownloadUrl) {
        this.reportDownloadUrl = reportDownloadUrl;
    }

    public ShowReportResponse withReportInfo(ReportEntity reportInfo) {
        this.reportInfo = reportInfo;
        return this;
    }

    public ShowReportResponse withReportInfo(Consumer<ReportEntity> reportInfoSetter) {
        if (this.reportInfo == null) {
            this.reportInfo = new ReportEntity();
            reportInfoSetter.accept(this.reportInfo);
        }

        return this;
    }

    /**
     * Get reportInfo
     * @return reportInfo
     */
    public ReportEntity getReportInfo() {
        return reportInfo;
    }

    public void setReportInfo(ReportEntity reportInfo) {
        this.reportInfo = reportInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportResponse that = (ShowReportResponse) obj;
        return Objects.equals(this.reportDownloadUrl, that.reportDownloadUrl)
            && Objects.equals(this.reportInfo, that.reportInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportDownloadUrl, reportInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportResponse {\n");
        sb.append("    reportDownloadUrl: ").append(toIndentedString(reportDownloadUrl)).append("\n");
        sb.append("    reportInfo: ").append(toIndentedString(reportInfo)).append("\n");
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
