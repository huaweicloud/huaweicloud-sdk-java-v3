package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 报告配置实体
 */
public class ReportSettingEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_id")

    private String settingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_count")

    private Integer reportCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_template_id")

    private String reportTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_content")

    private ReportSetting settingContent;

    public ReportSettingEntity withSettingId(String settingId) {
        this.settingId = settingId;
        return this;
    }

    /**
     * 配置ID
     * @return settingId
     */
    public String getSettingId() {
        return settingId;
    }

    public void setSettingId(String settingId) {
        this.settingId = settingId;
    }

    public ReportSettingEntity withReportCount(Integer reportCount) {
        this.reportCount = reportCount;
        return this;
    }

    /**
     * 本配置所有已经生成的报告数量，不包含已经删除的报告
     * @return reportCount
     */
    public Integer getReportCount() {
        return reportCount;
    }

    public void setReportCount(Integer reportCount) {
        this.reportCount = reportCount;
    }

    public ReportSettingEntity withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 报告配置的创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ReportSettingEntity withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 报告配置的上一次更新时间
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ReportSettingEntity withReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
        return this;
    }

    /**
     * 报告关联的模板ID
     * @return reportTemplateId
     */
    public String getReportTemplateId() {
        return reportTemplateId;
    }

    public void setReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
    }

    public ReportSettingEntity withSettingContent(ReportSetting settingContent) {
        this.settingContent = settingContent;
        return this;
    }

    public ReportSettingEntity withSettingContent(Consumer<ReportSetting> settingContentSetter) {
        if (this.settingContent == null) {
            this.settingContent = new ReportSetting();
            settingContentSetter.accept(this.settingContent);
        }

        return this;
    }

    /**
     * Get settingContent
     * @return settingContent
     */
    public ReportSetting getSettingContent() {
        return settingContent;
    }

    public void setSettingContent(ReportSetting settingContent) {
        this.settingContent = settingContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportSettingEntity that = (ReportSettingEntity) obj;
        return Objects.equals(this.settingId, that.settingId) && Objects.equals(this.reportCount, that.reportCount)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.reportTemplateId, that.reportTemplateId)
            && Objects.equals(this.settingContent, that.settingContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settingId, reportCount, createTime, lastUpdateTime, reportTemplateId, settingContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportSettingEntity {\n");
        sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
        sb.append("    reportCount: ").append(toIndentedString(reportCount)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    reportTemplateId: ").append(toIndentedString(reportTemplateId)).append("\n");
        sb.append("    settingContent: ").append(toIndentedString(settingContent)).append("\n");
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
