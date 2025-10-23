package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 报告实体
 */
public class ReportEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_name")

    private String reportName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_generated_time")

    private String reportGeneratedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_setting_id")

    private String reportSettingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_setting_name")

    private String reportSettingName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_template")

    private String reportTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_template_id")

    private String reportTemplateId;

    public ReportEntity withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * 报告ID
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public ReportEntity withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * 报告名称
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public ReportEntity withReportGeneratedTime(String reportGeneratedTime) {
        this.reportGeneratedTime = reportGeneratedTime;
        return this;
    }

    /**
     * 报告生成时间
     * @return reportGeneratedTime
     */
    public String getReportGeneratedTime() {
        return reportGeneratedTime;
    }

    public void setReportGeneratedTime(String reportGeneratedTime) {
        this.reportGeneratedTime = reportGeneratedTime;
    }

    public ReportEntity withReportSettingId(String reportSettingId) {
        this.reportSettingId = reportSettingId;
        return this;
    }

    /**
     * 报告配置ID
     * @return reportSettingId
     */
    public String getReportSettingId() {
        return reportSettingId;
    }

    public void setReportSettingId(String reportSettingId) {
        this.reportSettingId = reportSettingId;
    }

    public ReportEntity withReportSettingName(String reportSettingName) {
        this.reportSettingName = reportSettingName;
        return this;
    }

    /**
     * 报告配置名称
     * @return reportSettingName
     */
    public String getReportSettingName() {
        return reportSettingName;
    }

    public void setReportSettingName(String reportSettingName) {
        this.reportSettingName = reportSettingName;
    }

    public ReportEntity withReportTemplate(String reportTemplate) {
        this.reportTemplate = reportTemplate;
        return this;
    }

    /**
     * 报告模板名称
     * @return reportTemplate
     */
    public String getReportTemplate() {
        return reportTemplate;
    }

    public void setReportTemplate(String reportTemplate) {
        this.reportTemplate = reportTemplate;
    }

    public ReportEntity withReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
        return this;
    }

    /**
     * 报告模板ID
     * @return reportTemplateId
     */
    public String getReportTemplateId() {
        return reportTemplateId;
    }

    public void setReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportEntity that = (ReportEntity) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportGeneratedTime, that.reportGeneratedTime)
            && Objects.equals(this.reportSettingId, that.reportSettingId)
            && Objects.equals(this.reportSettingName, that.reportSettingName)
            && Objects.equals(this.reportTemplate, that.reportTemplate)
            && Objects.equals(this.reportTemplateId, that.reportTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId,
            reportName,
            reportGeneratedTime,
            reportSettingId,
            reportSettingName,
            reportTemplate,
            reportTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportEntity {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    reportGeneratedTime: ").append(toIndentedString(reportGeneratedTime)).append("\n");
        sb.append("    reportSettingId: ").append(toIndentedString(reportSettingId)).append("\n");
        sb.append("    reportSettingName: ").append(toIndentedString(reportSettingName)).append("\n");
        sb.append("    reportTemplate: ").append(toIndentedString(reportTemplate)).append("\n");
        sb.append("    reportTemplateId: ").append(toIndentedString(reportTemplateId)).append("\n");
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
