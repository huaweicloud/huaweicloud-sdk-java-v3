package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMonthlyOperaReportNotifyInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_month")

    private Integer currentMonth;

    public ShowMonthlyOperaReportNotifyInfoResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * close:不显示弹框 open：显示弹框
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowMonthlyOperaReportNotifyInfoResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 称号 -vul-fix-master: 补洞大师 -vul-fix-expert: 漏洞修复小能手 -baseline-fix: 风险配置修复高手 -malware-file: 防病毒先锋 -ransomware-event: 防勒索达人 -web-tamper-event: 网站守卫
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowMonthlyOperaReportNotifyInfoResponse withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * 当前用户唯一标识，报告时间，返回字符串：2024-04
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public ShowMonthlyOperaReportNotifyInfoResponse withCurrentMonth(Integer currentMonth) {
        this.currentMonth = currentMonth;
        return this;
    }

    /**
     * 当前月份，6
     * minimum: 1
     * maximum: 12
     * @return currentMonth
     */
    public Integer getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(Integer currentMonth) {
        this.currentMonth = currentMonth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMonthlyOperaReportNotifyInfoResponse that = (ShowMonthlyOperaReportNotifyInfoResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.title, that.title)
            && Objects.equals(this.reportId, that.reportId) && Objects.equals(this.currentMonth, that.currentMonth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, title, reportId, currentMonth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonthlyOperaReportNotifyInfoResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    currentMonth: ").append(toIndentedString(currentMonth)).append("\n");
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
