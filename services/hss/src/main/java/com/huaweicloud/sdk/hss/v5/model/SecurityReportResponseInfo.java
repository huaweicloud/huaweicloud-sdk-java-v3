package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询报告总览页
 */
public class SecurityReportResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private Integer reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_sub_id")

    private Integer reportSubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_report")

    private Boolean defaultReport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_create_time")

    private Long latestCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_name")

    private String reportName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_category")

    private String reportCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_status")

    private String reportStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_create_time")

    private Long reportCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sending_period")

    private String sendingPeriod;

    public SecurityReportResponseInfo withReportId(Integer reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**: 报告ID **取值范围**: 字符长度10-2147483647位 
     * minimum: 0
     * maximum: 2147483647
     * @return reportId
     */
    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public SecurityReportResponseInfo withReportSubId(Integer reportSubId) {
        this.reportSubId = reportSubId;
        return this;
    }

    /**
     * **参数解释**: 报告子ID **取值范围**: 字符长度10-2147483647位 
     * minimum: 0
     * maximum: 2147483647
     * @return reportSubId
     */
    public Integer getReportSubId() {
        return reportSubId;
    }

    public void setReportSubId(Integer reportSubId) {
        this.reportSubId = reportSubId;
    }

    public SecurityReportResponseInfo withDefaultReport(Boolean defaultReport) {
        this.defaultReport = defaultReport;
        return this;
    }

    /**
     * **参数解释**: 是否是默认的，默认的不能删除 **取值范围**: - true ：是。 - false ：否。 
     * @return defaultReport
     */
    public Boolean getDefaultReport() {
        return defaultReport;
    }

    public void setDefaultReport(Boolean defaultReport) {
        this.defaultReport = defaultReport;
    }

    public SecurityReportResponseInfo withLatestCreateTime(Long latestCreateTime) {
        this.latestCreateTime = latestCreateTime;
        return this;
    }

    /**
     * **参数解释**： 最近生成时间，毫秒(如果返回值为null，代表暂未生成) **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestCreateTime
     */
    public Long getLatestCreateTime() {
        return latestCreateTime;
    }

    public void setLatestCreateTime(Long latestCreateTime) {
        this.latestCreateTime = latestCreateTime;
    }

    public SecurityReportResponseInfo withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * **参数解释**: 报告名称 **取值范围**: 字符长度1-128位 
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public SecurityReportResponseInfo withReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
        return this;
    }

    /**
     * **参数解释**: 报告类别 **取值范围**: - daily_report：安全日报 - weekly_report：安全周报 - monthly_report：安全月报 - custom_report：自定义报告 
     * @return reportCategory
     */
    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public SecurityReportResponseInfo withReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }

    /**
     * **参数解释**: 报告开启状态 **取值范围**:   - opened：开启   - closed：关闭 
     * @return reportStatus
     */
    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public SecurityReportResponseInfo withReportCreateTime(Long reportCreateTime) {
        this.reportCreateTime = reportCreateTime;
        return this;
    }

    /**
     * **参数解释**： 报告创建时间 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return reportCreateTime
     */
    public Long getReportCreateTime() {
        return reportCreateTime;
    }

    public void setReportCreateTime(Long reportCreateTime) {
        this.reportCreateTime = reportCreateTime;
    }

    public SecurityReportResponseInfo withSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
        return this;
    }

    /**
     * **参数解释**: 报告发送的时间段 **取值范围**:   - morning：代表0点到6点   - noon：代表6点到12点   - afternoon：代表12点到18点   - evening：代表18点到24点 
     * @return sendingPeriod
     */
    public String getSendingPeriod() {
        return sendingPeriod;
    }

    public void setSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportResponseInfo that = (SecurityReportResponseInfo) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.reportSubId, that.reportSubId)
            && Objects.equals(this.defaultReport, that.defaultReport)
            && Objects.equals(this.latestCreateTime, that.latestCreateTime)
            && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportCategory, that.reportCategory)
            && Objects.equals(this.reportStatus, that.reportStatus)
            && Objects.equals(this.reportCreateTime, that.reportCreateTime)
            && Objects.equals(this.sendingPeriod, that.sendingPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId,
            reportSubId,
            defaultReport,
            latestCreateTime,
            reportName,
            reportCategory,
            reportStatus,
            reportCreateTime,
            sendingPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportResponseInfo {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    reportSubId: ").append(toIndentedString(reportSubId)).append("\n");
        sb.append("    defaultReport: ").append(toIndentedString(defaultReport)).append("\n");
        sb.append("    latestCreateTime: ").append(toIndentedString(latestCreateTime)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
        sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
        sb.append("    reportCreateTime: ").append(toIndentedString(reportCreateTime)).append("\n");
        sb.append("    sendingPeriod: ").append(toIndentedString(sendingPeriod)).append("\n");
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
