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
public class ShowDataTransformationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_transformation_id")

    private String dataTransformationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_transformation_name")

    private String dataTransformationName;

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
    @JsonProperty(value = "process_status")

    private JobProcessStatus processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_error")

    private DataTransformationProcessError processError;

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

    public ShowDataTransformationResponse withDataTransformationId(String dataTransformationId) {
        this.dataTransformationId = dataTransformationId;
        return this;
    }

    /**
     * UUID
     * @return dataTransformationId
     */
    public String getDataTransformationId() {
        return dataTransformationId;
    }

    public void setDataTransformationId(String dataTransformationId) {
        this.dataTransformationId = dataTransformationId;
    }

    public ShowDataTransformationResponse withDataTransformationName(String dataTransformationName) {
        this.dataTransformationName = dataTransformationName;
        return this;
    }

    /**
     * 数据转换名称
     * @return dataTransformationName
     */
    public String getDataTransformationName() {
        return dataTransformationName;
    }

    public void setDataTransformationName(String dataTransformationName) {
        this.dataTransformationName = dataTransformationName;
    }

    public ShowDataTransformationResponse withScript(String script) {
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

    public ShowDataTransformationResponse withStatus(JobStatus status) {
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

    public ShowDataTransformationResponse withDirectory(String directory) {
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

    public ShowDataTransformationResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据转换描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowDataTransformationResponse withJobMode(IsapJobMode jobMode) {
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

    public ShowDataTransformationResponse withJobModeSetting(IsapJobModeSettingVo jobModeSetting) {
        this.jobModeSetting = jobModeSetting;
        return this;
    }

    public ShowDataTransformationResponse withJobModeSetting(Consumer<IsapJobModeSettingVo> jobModeSettingSetter) {
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

    public ShowDataTransformationResponse withProcessStatus(JobProcessStatus processStatus) {
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

    public ShowDataTransformationResponse withProcessError(DataTransformationProcessError processError) {
        this.processError = processError;
        return this;
    }

    /**
     * Get processError
     * @return processError
     */
    public DataTransformationProcessError getProcessError() {
        return processError;
    }

    public void setProcessError(DataTransformationProcessError processError) {
        this.processError = processError;
    }

    public ShowDataTransformationResponse withEnvironment(JobEnvironment environment) {
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

    public ShowDataTransformationResponse withOutputTableId(String outputTableId) {
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

    public ShowDataTransformationResponse withOutputTableName(String outputTableName) {
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

    public ShowDataTransformationResponse withOutputTableIds(List<String> outputTableIds) {
        this.outputTableIds = outputTableIds;
        return this;
    }

    public ShowDataTransformationResponse addOutputTableIdsItem(String outputTableIdsItem) {
        if (this.outputTableIds == null) {
            this.outputTableIds = new ArrayList<>();
        }
        this.outputTableIds.add(outputTableIdsItem);
        return this;
    }

    public ShowDataTransformationResponse withOutputTableIds(Consumer<List<String>> outputTableIdsSetter) {
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

    public ShowDataTransformationResponse withOutputTableNames(List<String> outputTableNames) {
        this.outputTableNames = outputTableNames;
        return this;
    }

    public ShowDataTransformationResponse addOutputTableNamesItem(String outputTableNamesItem) {
        if (this.outputTableNames == null) {
            this.outputTableNames = new ArrayList<>();
        }
        this.outputTableNames.add(outputTableNamesItem);
        return this;
    }

    public ShowDataTransformationResponse withOutputTableNames(Consumer<List<String>> outputTableNamesSetter) {
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

    public ShowDataTransformationResponse withCreateBy(String createBy) {
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

    public ShowDataTransformationResponse withCreateTime(Long createTime) {
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

    public ShowDataTransformationResponse withUpdateBy(String updateBy) {
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

    public ShowDataTransformationResponse withUpdateTime(Long updateTime) {
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

    public ShowDataTransformationResponse withDeleteTime(Long deleteTime) {
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
        ShowDataTransformationResponse that = (ShowDataTransformationResponse) obj;
        return Objects.equals(this.dataTransformationId, that.dataTransformationId)
            && Objects.equals(this.dataTransformationName, that.dataTransformationName)
            && Objects.equals(this.script, that.script) && Objects.equals(this.status, that.status)
            && Objects.equals(this.directory, that.directory) && Objects.equals(this.description, that.description)
            && Objects.equals(this.jobMode, that.jobMode) && Objects.equals(this.jobModeSetting, that.jobModeSetting)
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
        return Objects.hash(dataTransformationId,
            dataTransformationName,
            script,
            status,
            directory,
            description,
            jobMode,
            jobModeSetting,
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
        sb.append("class ShowDataTransformationResponse {\n");
        sb.append("    dataTransformationId: ").append(toIndentedString(dataTransformationId)).append("\n");
        sb.append("    dataTransformationName: ").append(toIndentedString(dataTransformationName)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    jobMode: ").append(toIndentedString(jobMode)).append("\n");
        sb.append("    jobModeSetting: ").append(toIndentedString(jobModeSetting)).append("\n");
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
