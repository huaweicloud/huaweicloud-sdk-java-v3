package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAlertRuleRequestBody
 */
public class UpdateAlertRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_rule_name")

    private String alertRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script")

    private String script;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private JobStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode_setting")

    private IsapJobModeSettingDto jobModeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_output_setting")

    private IsapJobOutputSetting jobOutputSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private JobEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_id")

    private String outputTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_ids")

    private List<String> outputTableIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_names")

    private List<String> outputTableNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_status")

    private String publishStatus;

    public UpdateAlertRuleRequestBody withAlertRuleName(String alertRuleName) {
        this.alertRuleName = alertRuleName;
        return this;
    }

    /**
     * Alert rule name 告警规则名称
     * @return alertRuleName
     */
    public String getAlertRuleName() {
        return alertRuleName;
    }

    public void setAlertRuleName(String alertRuleName) {
        this.alertRuleName = alertRuleName;
    }

    public UpdateAlertRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Alert rule description 告警规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAlertRuleRequestBody withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * directory 目录分组
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public UpdateAlertRuleRequestBody withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * Job Script 作业脚本
     * @return script
     */
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public UpdateAlertRuleRequestBody withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public UpdateAlertRuleRequestBody withJobModeSetting(IsapJobModeSettingDto jobModeSetting) {
        this.jobModeSetting = jobModeSetting;
        return this;
    }

    public UpdateAlertRuleRequestBody withJobModeSetting(Consumer<IsapJobModeSettingDto> jobModeSettingSetter) {
        if (this.jobModeSetting == null) {
            this.jobModeSetting = new IsapJobModeSettingDto();
            jobModeSettingSetter.accept(this.jobModeSetting);
        }

        return this;
    }

    /**
     * Get jobModeSetting
     * @return jobModeSetting
     */
    public IsapJobModeSettingDto getJobModeSetting() {
        return jobModeSetting;
    }

    public void setJobModeSetting(IsapJobModeSettingDto jobModeSetting) {
        this.jobModeSetting = jobModeSetting;
    }

    public UpdateAlertRuleRequestBody withJobOutputSetting(IsapJobOutputSetting jobOutputSetting) {
        this.jobOutputSetting = jobOutputSetting;
        return this;
    }

    public UpdateAlertRuleRequestBody withJobOutputSetting(Consumer<IsapJobOutputSetting> jobOutputSettingSetter) {
        if (this.jobOutputSetting == null) {
            this.jobOutputSetting = new IsapJobOutputSetting();
            jobOutputSettingSetter.accept(this.jobOutputSetting);
        }

        return this;
    }

    /**
     * Get jobOutputSetting
     * @return jobOutputSetting
     */
    public IsapJobOutputSetting getJobOutputSetting() {
        return jobOutputSetting;
    }

    public void setJobOutputSetting(IsapJobOutputSetting jobOutputSetting) {
        this.jobOutputSetting = jobOutputSetting;
    }

    public UpdateAlertRuleRequestBody withEnvironment(JobEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public JobEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(JobEnvironment environment) {
        this.environment = environment;
    }

    public UpdateAlertRuleRequestBody withOutputTableId(String outputTableId) {
        this.outputTableId = outputTableId;
        return this;
    }

    /**
     * UUID
     * @return outputTableId
     */
    public String getOutputTableId() {
        return outputTableId;
    }

    public void setOutputTableId(String outputTableId) {
        this.outputTableId = outputTableId;
    }

    public UpdateAlertRuleRequestBody withOutputTableIds(List<String> outputTableIds) {
        this.outputTableIds = outputTableIds;
        return this;
    }

    public UpdateAlertRuleRequestBody addOutputTableIdsItem(String outputTableIdsItem) {
        if (this.outputTableIds == null) {
            this.outputTableIds = new ArrayList<>();
        }
        this.outputTableIds.add(outputTableIdsItem);
        return this;
    }

    public UpdateAlertRuleRequestBody withOutputTableIds(Consumer<List<String>> outputTableIdsSetter) {
        if (this.outputTableIds == null) {
            this.outputTableIds = new ArrayList<>();
        }
        outputTableIdsSetter.accept(this.outputTableIds);
        return this;
    }

    /**
     * 输出表ID列表
     * @return outputTableIds
     */
    public List<String> getOutputTableIds() {
        return outputTableIds;
    }

    public void setOutputTableIds(List<String> outputTableIds) {
        this.outputTableIds = outputTableIds;
    }

    public UpdateAlertRuleRequestBody withOutputTableNames(List<String> outputTableNames) {
        this.outputTableNames = outputTableNames;
        return this;
    }

    public UpdateAlertRuleRequestBody addOutputTableNamesItem(String outputTableNamesItem) {
        if (this.outputTableNames == null) {
            this.outputTableNames = new ArrayList<>();
        }
        this.outputTableNames.add(outputTableNamesItem);
        return this;
    }

    public UpdateAlertRuleRequestBody withOutputTableNames(Consumer<List<String>> outputTableNamesSetter) {
        if (this.outputTableNames == null) {
            this.outputTableNames = new ArrayList<>();
        }
        outputTableNamesSetter.accept(this.outputTableNames);
        return this;
    }

    /**
     * 输出表名称列表
     * @return outputTableNames
     */
    public List<String> getOutputTableNames() {
        return outputTableNames;
    }

    public void setOutputTableNames(List<String> outputTableNames) {
        this.outputTableNames = outputTableNames;
    }

    public UpdateAlertRuleRequestBody withPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    /**
     * 发布状态: 只适用行管租户，不对外暴露参数
     * @return publishStatus
     */
    public String getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAlertRuleRequestBody that = (UpdateAlertRuleRequestBody) obj;
        return Objects.equals(this.alertRuleName, that.alertRuleName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.script, that.script) && Objects.equals(this.status, that.status)
            && Objects.equals(this.jobModeSetting, that.jobModeSetting)
            && Objects.equals(this.jobOutputSetting, that.jobOutputSetting)
            && Objects.equals(this.environment, that.environment)
            && Objects.equals(this.outputTableId, that.outputTableId)
            && Objects.equals(this.outputTableIds, that.outputTableIds)
            && Objects.equals(this.outputTableNames, that.outputTableNames)
            && Objects.equals(this.publishStatus, that.publishStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertRuleName,
            description,
            directory,
            script,
            status,
            jobModeSetting,
            jobOutputSetting,
            environment,
            outputTableId,
            outputTableIds,
            outputTableNames,
            publishStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlertRuleRequestBody {\n");
        sb.append("    alertRuleName: ").append(toIndentedString(alertRuleName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobModeSetting: ").append(toIndentedString(jobModeSetting)).append("\n");
        sb.append("    jobOutputSetting: ").append(toIndentedString(jobOutputSetting)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    outputTableId: ").append(toIndentedString(outputTableId)).append("\n");
        sb.append("    outputTableIds: ").append(toIndentedString(outputTableIds)).append("\n");
        sb.append("    outputTableNames: ").append(toIndentedString(outputTableNames)).append("\n");
        sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
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
