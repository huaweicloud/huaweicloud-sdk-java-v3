package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAlertRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_rule_id")

    private String alertRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_rule_name")

    private String alertRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script")

    private String script;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private JobStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode")

    private IsapJobMode jobMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode_setting")

    private IsapJobModeSettingVo jobModeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_output_setting")

    private AlertRuleJobSetting jobOutputSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private JobProcessStatus processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_error")

    private AlertRuleProcessError processError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private JobEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_id")

    private String outputTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_name")

    private String outputTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_ids")

    private List<String> outputTableIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_names")

    private List<String> outputTableNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Long deleteTime;

    public UpdateAlertRuleResponse withAlertRuleId(String alertRuleId) {
        this.alertRuleId = alertRuleId;
        return this;
    }

    /**
     * UUID
     * @return alertRuleId
     */
    public String getAlertRuleId() {
        return alertRuleId;
    }

    public void setAlertRuleId(String alertRuleId) {
        this.alertRuleId = alertRuleId;
    }

    public UpdateAlertRuleResponse withAlertRuleName(String alertRuleName) {
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

    public UpdateAlertRuleResponse withScript(String script) {
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

    public UpdateAlertRuleResponse withStatus(JobStatus status) {
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

    public UpdateAlertRuleResponse withDirectory(String directory) {
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

    public UpdateAlertRuleResponse withDescription(String description) {
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

    public UpdateAlertRuleResponse withJobMode(IsapJobMode jobMode) {
        this.jobMode = jobMode;
        return this;
    }

    /**
     * Get jobMode
     * @return jobMode
     */
    public IsapJobMode getJobMode() {
        return jobMode;
    }

    public void setJobMode(IsapJobMode jobMode) {
        this.jobMode = jobMode;
    }

    public UpdateAlertRuleResponse withJobModeSetting(IsapJobModeSettingVo jobModeSetting) {
        this.jobModeSetting = jobModeSetting;
        return this;
    }

    public UpdateAlertRuleResponse withJobModeSetting(Consumer<IsapJobModeSettingVo> jobModeSettingSetter) {
        if (this.jobModeSetting == null) {
            this.jobModeSetting = new IsapJobModeSettingVo();
            jobModeSettingSetter.accept(this.jobModeSetting);
        }

        return this;
    }

    /**
     * Get jobModeSetting
     * @return jobModeSetting
     */
    public IsapJobModeSettingVo getJobModeSetting() {
        return jobModeSetting;
    }

    public void setJobModeSetting(IsapJobModeSettingVo jobModeSetting) {
        this.jobModeSetting = jobModeSetting;
    }

    public UpdateAlertRuleResponse withJobOutputSetting(AlertRuleJobSetting jobOutputSetting) {
        this.jobOutputSetting = jobOutputSetting;
        return this;
    }

    public UpdateAlertRuleResponse withJobOutputSetting(Consumer<AlertRuleJobSetting> jobOutputSettingSetter) {
        if (this.jobOutputSetting == null) {
            this.jobOutputSetting = new AlertRuleJobSetting();
            jobOutputSettingSetter.accept(this.jobOutputSetting);
        }

        return this;
    }

    /**
     * Get jobOutputSetting
     * @return jobOutputSetting
     */
    public AlertRuleJobSetting getJobOutputSetting() {
        return jobOutputSetting;
    }

    public void setJobOutputSetting(AlertRuleJobSetting jobOutputSetting) {
        this.jobOutputSetting = jobOutputSetting;
    }

    public UpdateAlertRuleResponse withProcessStatus(JobProcessStatus processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * Get processStatus
     * @return processStatus
     */
    public JobProcessStatus getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(JobProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    public UpdateAlertRuleResponse withProcessError(AlertRuleProcessError processError) {
        this.processError = processError;
        return this;
    }

    /**
     * Get processError
     * @return processError
     */
    public AlertRuleProcessError getProcessError() {
        return processError;
    }

    public void setProcessError(AlertRuleProcessError processError) {
        this.processError = processError;
    }

    public UpdateAlertRuleResponse withEnvironment(JobEnvironment environment) {
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

    public UpdateAlertRuleResponse withOutputTableId(String outputTableId) {
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

    public UpdateAlertRuleResponse withOutputTableName(String outputTableName) {
        this.outputTableName = outputTableName;
        return this;
    }

    /**
     * 表名称
     * @return outputTableName
     */
    public String getOutputTableName() {
        return outputTableName;
    }

    public void setOutputTableName(String outputTableName) {
        this.outputTableName = outputTableName;
    }

    public UpdateAlertRuleResponse withOutputTableIds(List<String> outputTableIds) {
        this.outputTableIds = outputTableIds;
        return this;
    }

    public UpdateAlertRuleResponse addOutputTableIdsItem(String outputTableIdsItem) {
        if (this.outputTableIds == null) {
            this.outputTableIds = new ArrayList<>();
        }
        this.outputTableIds.add(outputTableIdsItem);
        return this;
    }

    public UpdateAlertRuleResponse withOutputTableIds(Consumer<List<String>> outputTableIdsSetter) {
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

    public UpdateAlertRuleResponse withOutputTableNames(List<String> outputTableNames) {
        this.outputTableNames = outputTableNames;
        return this;
    }

    public UpdateAlertRuleResponse addOutputTableNamesItem(String outputTableNamesItem) {
        if (this.outputTableNames == null) {
            this.outputTableNames = new ArrayList<>();
        }
        this.outputTableNames.add(outputTableNamesItem);
        return this;
    }

    public UpdateAlertRuleResponse withOutputTableNames(Consumer<List<String>> outputTableNamesSetter) {
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

    public UpdateAlertRuleResponse withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建者
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public UpdateAlertRuleResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UpdateAlertRuleResponse withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新者
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public UpdateAlertRuleResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateAlertRuleResponse withDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return deleteTime
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAlertRuleResponse that = (UpdateAlertRuleResponse) obj;
        return Objects.equals(this.alertRuleId, that.alertRuleId)
            && Objects.equals(this.alertRuleName, that.alertRuleName) && Objects.equals(this.script, that.script)
            && Objects.equals(this.status, that.status) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.description, that.description) && Objects.equals(this.jobMode, that.jobMode)
            && Objects.equals(this.jobModeSetting, that.jobModeSetting)
            && Objects.equals(this.jobOutputSetting, that.jobOutputSetting)
            && Objects.equals(this.processStatus, that.processStatus)
            && Objects.equals(this.processError, that.processError)
            && Objects.equals(this.environment, that.environment)
            && Objects.equals(this.outputTableId, that.outputTableId)
            && Objects.equals(this.outputTableName, that.outputTableName)
            && Objects.equals(this.outputTableIds, that.outputTableIds)
            && Objects.equals(this.outputTableNames, that.outputTableNames)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.deleteTime, that.deleteTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertRuleId,
            alertRuleName,
            script,
            status,
            directory,
            description,
            jobMode,
            jobModeSetting,
            jobOutputSetting,
            processStatus,
            processError,
            environment,
            outputTableId,
            outputTableName,
            outputTableIds,
            outputTableNames,
            createBy,
            createTime,
            updateBy,
            updateTime,
            deleteTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlertRuleResponse {\n");
        sb.append("    alertRuleId: ").append(toIndentedString(alertRuleId)).append("\n");
        sb.append("    alertRuleName: ").append(toIndentedString(alertRuleName)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    jobMode: ").append(toIndentedString(jobMode)).append("\n");
        sb.append("    jobModeSetting: ").append(toIndentedString(jobModeSetting)).append("\n");
        sb.append("    jobOutputSetting: ").append(toIndentedString(jobOutputSetting)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    processError: ").append(toIndentedString(processError)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    outputTableId: ").append(toIndentedString(outputTableId)).append("\n");
        sb.append("    outputTableName: ").append(toIndentedString(outputTableName)).append("\n");
        sb.append("    outputTableIds: ").append(toIndentedString(outputTableIds)).append("\n");
        sb.append("    outputTableNames: ").append(toIndentedString(outputTableNames)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
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
