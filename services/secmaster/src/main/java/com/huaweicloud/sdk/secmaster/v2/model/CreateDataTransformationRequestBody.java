package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateDataTransformationRequestBody
 */
public class CreateDataTransformationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_transformation_name")

    private String dataTransformationName;

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
    @JsonProperty(value = "job_mode")

    private IsapJobMode jobMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode_setting")

    private IsapJobModeSettingDto jobModeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private JobEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_id")

    private String outputTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong")

    private String belong;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_quota_amount")

    private Float cuQuotaAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_table_id")

    private List<String> inputTableId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_table_names")

    private List<String> inputTableNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_ids")

    private List<String> outputTableIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table_names")

    private List<String> outputTableNames = null;

    public CreateDataTransformationRequestBody withDataTransformationName(String dataTransformationName) {
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

    public CreateDataTransformationRequestBody withDescription(String description) {
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

    public CreateDataTransformationRequestBody withDirectory(String directory) {
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

    public CreateDataTransformationRequestBody withScript(String script) {
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

    public CreateDataTransformationRequestBody withStatus(JobStatus status) {
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

    public CreateDataTransformationRequestBody withJobMode(IsapJobMode jobMode) {
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

    public CreateDataTransformationRequestBody withJobModeSetting(IsapJobModeSettingDto jobModeSetting) {
        this.jobModeSetting = jobModeSetting;
        return this;
    }

    public CreateDataTransformationRequestBody withJobModeSetting(
        Consumer<IsapJobModeSettingDto> jobModeSettingSetter) {
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

    public CreateDataTransformationRequestBody withEnvironment(JobEnvironment environment) {
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

    public CreateDataTransformationRequestBody withOutputTableId(String outputTableId) {
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

    public CreateDataTransformationRequestBody withBelong(String belong) {
        this.belong = belong;
        return this;
    }

    /**
     * 归属
     * @return belong
     */
    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public CreateDataTransformationRequestBody withCuQuotaAmount(Float cuQuotaAmount) {
        this.cuQuotaAmount = cuQuotaAmount;
        return this;
    }

    /**
     * 数量
     * minimum: 0
     * maximum: 99999
     * @return cuQuotaAmount
     */
    public Float getCuQuotaAmount() {
        return cuQuotaAmount;
    }

    public void setCuQuotaAmount(Float cuQuotaAmount) {
        this.cuQuotaAmount = cuQuotaAmount;
    }

    public CreateDataTransformationRequestBody withInputTableId(List<String> inputTableId) {
        this.inputTableId = inputTableId;
        return this;
    }

    public CreateDataTransformationRequestBody addInputTableIdItem(String inputTableIdItem) {
        if (this.inputTableId == null) {
            this.inputTableId = new ArrayList<>();
        }
        this.inputTableId.add(inputTableIdItem);
        return this;
    }

    public CreateDataTransformationRequestBody withInputTableId(Consumer<List<String>> inputTableIdSetter) {
        if (this.inputTableId == null) {
            this.inputTableId = new ArrayList<>();
        }
        inputTableIdSetter.accept(this.inputTableId);
        return this;
    }

    /**
     * 输入表ID
     * @return inputTableId
     */
    public List<String> getInputTableId() {
        return inputTableId;
    }

    public void setInputTableId(List<String> inputTableId) {
        this.inputTableId = inputTableId;
    }

    public CreateDataTransformationRequestBody withInputTableNames(List<String> inputTableNames) {
        this.inputTableNames = inputTableNames;
        return this;
    }

    public CreateDataTransformationRequestBody addInputTableNamesItem(String inputTableNamesItem) {
        if (this.inputTableNames == null) {
            this.inputTableNames = new ArrayList<>();
        }
        this.inputTableNames.add(inputTableNamesItem);
        return this;
    }

    public CreateDataTransformationRequestBody withInputTableNames(Consumer<List<String>> inputTableNamesSetter) {
        if (this.inputTableNames == null) {
            this.inputTableNames = new ArrayList<>();
        }
        inputTableNamesSetter.accept(this.inputTableNames);
        return this;
    }

    /**
     * 输入表名称列表
     * @return inputTableNames
     */
    public List<String> getInputTableNames() {
        return inputTableNames;
    }

    public void setInputTableNames(List<String> inputTableNames) {
        this.inputTableNames = inputTableNames;
    }

    public CreateDataTransformationRequestBody withOutputTableIds(List<String> outputTableIds) {
        this.outputTableIds = outputTableIds;
        return this;
    }

    public CreateDataTransformationRequestBody addOutputTableIdsItem(String outputTableIdsItem) {
        if (this.outputTableIds == null) {
            this.outputTableIds = new ArrayList<>();
        }
        this.outputTableIds.add(outputTableIdsItem);
        return this;
    }

    public CreateDataTransformationRequestBody withOutputTableIds(Consumer<List<String>> outputTableIdsSetter) {
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

    public CreateDataTransformationRequestBody withOutputTableNames(List<String> outputTableNames) {
        this.outputTableNames = outputTableNames;
        return this;
    }

    public CreateDataTransformationRequestBody addOutputTableNamesItem(String outputTableNamesItem) {
        if (this.outputTableNames == null) {
            this.outputTableNames = new ArrayList<>();
        }
        this.outputTableNames.add(outputTableNamesItem);
        return this;
    }

    public CreateDataTransformationRequestBody withOutputTableNames(Consumer<List<String>> outputTableNamesSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDataTransformationRequestBody that = (CreateDataTransformationRequestBody) obj;
        return Objects.equals(this.dataTransformationName, that.dataTransformationName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.script, that.script) && Objects.equals(this.status, that.status)
            && Objects.equals(this.jobMode, that.jobMode) && Objects.equals(this.jobModeSetting, that.jobModeSetting)
            && Objects.equals(this.environment, that.environment)
            && Objects.equals(this.outputTableId, that.outputTableId) && Objects.equals(this.belong, that.belong)
            && Objects.equals(this.cuQuotaAmount, that.cuQuotaAmount)
            && Objects.equals(this.inputTableId, that.inputTableId)
            && Objects.equals(this.inputTableNames, that.inputTableNames)
            && Objects.equals(this.outputTableIds, that.outputTableIds)
            && Objects.equals(this.outputTableNames, that.outputTableNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataTransformationName,
            description,
            directory,
            script,
            status,
            jobMode,
            jobModeSetting,
            environment,
            outputTableId,
            belong,
            cuQuotaAmount,
            inputTableId,
            inputTableNames,
            outputTableIds,
            outputTableNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDataTransformationRequestBody {\n");
        sb.append("    dataTransformationName: ").append(toIndentedString(dataTransformationName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobMode: ").append(toIndentedString(jobMode)).append("\n");
        sb.append("    jobModeSetting: ").append(toIndentedString(jobModeSetting)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    outputTableId: ").append(toIndentedString(outputTableId)).append("\n");
        sb.append("    belong: ").append(toIndentedString(belong)).append("\n");
        sb.append("    cuQuotaAmount: ").append(toIndentedString(cuQuotaAmount)).append("\n");
        sb.append("    inputTableId: ").append(toIndentedString(inputTableId)).append("\n");
        sb.append("    inputTableNames: ").append(toIndentedString(inputTableNames)).append("\n");
        sb.append("    outputTableIds: ").append(toIndentedString(outputTableIds)).append("\n");
        sb.append("    outputTableNames: ").append(toIndentedString(outputTableNames)).append("\n");
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
