package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecurityReportSubscriptionSummaryResponse
 */
public class SecurityReportSubscriptionSummaryResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_name")

    private String reportName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sending_period")

    private String sendingPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_category")

    private String reportCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_status")

    private String reportStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_enterprise_project")

    private Boolean isAllEnterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_eps_id")

    private String templateEpsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_report_created")

    private Boolean isReportCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_create_time")

    private Long latestCreateTime;

    public SecurityReportSubscriptionSummaryResponse withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * **参数解释：** 订阅ID **取值范围：** 不涉及
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public SecurityReportSubscriptionSummaryResponse withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释：** 报告ID **取值范围：** 不涉及
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public SecurityReportSubscriptionSummaryResponse withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * **参数解释：** 报告模板名称 **取值范围：** 只能由中文、字母、数字和括号内所列符号（_-.:：）组成，且不能超过256个字符长度。
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public SecurityReportSubscriptionSummaryResponse withSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
        return this;
    }

    /**
     * **参数解释：** 发送时间段 **取值范围：** - morning：00:00~06:00 - noon：06:00~12:00 - afternoon：12:00~18:00 - evening：18:00~24:00
     * @return sendingPeriod
     */
    public String getSendingPeriod() {
        return sendingPeriod;
    }

    public void setSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
    }

    public SecurityReportSubscriptionSummaryResponse withReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
        return this;
    }

    /**
     * **参数解释：** 报告类型 **取值范围：** - daily_report：安全日报 - weekly_report：安全周报 - monthly_report：安全月报 - custom_report：自定义报告
     * @return reportCategory
     */
    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public SecurityReportSubscriptionSummaryResponse withReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }

    /**
     * **参数解释：** 开启状态 **取值范围：** - opened：已开启 - closed：已关闭
     * @return reportStatus
     */
    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public SecurityReportSubscriptionSummaryResponse withIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
        return this;
    }

    /**
     * **参数解释：** 是否是所有企业项目 **取值范围：** - true：是所有企业项目 - false：不是所有企业项目
     * @return isAllEnterpriseProject
     */
    public Boolean getIsAllEnterpriseProject() {
        return isAllEnterpriseProject;
    }

    public void setIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
    }

    public SecurityReportSubscriptionSummaryResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 企业项目ID，当前报告统计的企业项目范围 **取值范围：** 不涉及
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SecurityReportSubscriptionSummaryResponse withTemplateEpsId(String templateEpsId) {
        this.templateEpsId = templateEpsId;
        return this;
    }

    /**
     * **参数解释：** 报告所属项目，生成的报告所归属的企业项目 **取值范围：** 不涉及
     * @return templateEpsId
     */
    public String getTemplateEpsId() {
        return templateEpsId;
    }

    public void setTemplateEpsId(String templateEpsId) {
        this.templateEpsId = templateEpsId;
    }

    public SecurityReportSubscriptionSummaryResponse withIsReportCreated(Boolean isReportCreated) {
        this.isReportCreated = isReportCreated;
        return this;
    }

    /**
     * **参数解释：** 报告生成状态 **取值范围：** - true：已生成 - false：暂未生成
     * @return isReportCreated
     */
    public Boolean getIsReportCreated() {
        return isReportCreated;
    }

    public void setIsReportCreated(Boolean isReportCreated) {
        this.isReportCreated = isReportCreated;
    }

    public SecurityReportSubscriptionSummaryResponse withLatestCreateTime(Long latestCreateTime) {
        this.latestCreateTime = latestCreateTime;
        return this;
    }

    /**
     * **参数解释：** 报告生成时间 **取值范围：** 13位毫秒时间戳
     * @return latestCreateTime
     */
    public Long getLatestCreateTime() {
        return latestCreateTime;
    }

    public void setLatestCreateTime(Long latestCreateTime) {
        this.latestCreateTime = latestCreateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportSubscriptionSummaryResponse that = (SecurityReportSubscriptionSummaryResponse) obj;
        return Objects.equals(this.subscriptionId, that.subscriptionId) && Objects.equals(this.reportId, that.reportId)
            && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.sendingPeriod, that.sendingPeriod)
            && Objects.equals(this.reportCategory, that.reportCategory)
            && Objects.equals(this.reportStatus, that.reportStatus)
            && Objects.equals(this.isAllEnterpriseProject, that.isAllEnterpriseProject)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.templateEpsId, that.templateEpsId)
            && Objects.equals(this.isReportCreated, that.isReportCreated)
            && Objects.equals(this.latestCreateTime, that.latestCreateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId,
            reportId,
            reportName,
            sendingPeriod,
            reportCategory,
            reportStatus,
            isAllEnterpriseProject,
            enterpriseProjectId,
            templateEpsId,
            isReportCreated,
            latestCreateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportSubscriptionSummaryResponse {\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    sendingPeriod: ").append(toIndentedString(sendingPeriod)).append("\n");
        sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
        sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
        sb.append("    isAllEnterpriseProject: ").append(toIndentedString(isAllEnterpriseProject)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    templateEpsId: ").append(toIndentedString(templateEpsId)).append("\n");
        sb.append("    isReportCreated: ").append(toIndentedString(isReportCreated)).append("\n");
        sb.append("    latestCreateTime: ").append(toIndentedString(latestCreateTime)).append("\n");
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
