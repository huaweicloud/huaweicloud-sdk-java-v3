package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 报告发送规则
 */
public class ReportRuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private String cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private String rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_title")

    private String emailTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_to")

    private String emailTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_content")

    private String emailContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_file_type")

    private String reportFileType;

    public ReportRuleInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 报告发送规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReportRuleInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ReportRuleInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ReportRuleInfo withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * 数据周期
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public ReportRuleInfo withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * cron表达式
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public ReportRuleInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 报告数据周期开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ReportRuleInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 报告数据周期结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ReportRuleInfo withEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
        return this;
    }

    /**
     * 邮件标题
     * @return emailTitle
     */
    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }

    public ReportRuleInfo withEmailTo(String emailTo) {
        this.emailTo = emailTo;
        return this;
    }

    /**
     * 收件人邮箱
     * @return emailTo
     */
    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public ReportRuleInfo withEmailContent(String emailContent) {
        this.emailContent = emailContent;
        return this;
    }

    /**
     * 邮件内容
     * @return emailContent
     */
    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public ReportRuleInfo withReportFileType(String reportFileType) {
        this.reportFileType = reportFileType;
        return this;
    }

    /**
     * 报告类型，支持图片、pdf、html
     * @return reportFileType
     */
    public String getReportFileType() {
        return reportFileType;
    }

    public void setReportFileType(String reportFileType) {
        this.reportFileType = reportFileType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportRuleInfo that = (ReportRuleInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.cycle, that.cycle)
            && Objects.equals(this.rule, that.rule) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.emailTitle, that.emailTitle)
            && Objects.equals(this.emailTo, that.emailTo) && Objects.equals(this.emailContent, that.emailContent)
            && Objects.equals(this.reportFileType, that.reportFileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            workspaceId,
            cycle,
            rule,
            startTime,
            endTime,
            emailTitle,
            emailTo,
            emailContent,
            reportFileType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportRuleInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    emailTitle: ").append(toIndentedString(emailTitle)).append("\n");
        sb.append("    emailTo: ").append(toIndentedString(emailTo)).append("\n");
        sb.append("    emailContent: ").append(toIndentedString(emailContent)).append("\n");
        sb.append("    reportFileType: ").append(toIndentedString(reportFileType)).append("\n");
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
