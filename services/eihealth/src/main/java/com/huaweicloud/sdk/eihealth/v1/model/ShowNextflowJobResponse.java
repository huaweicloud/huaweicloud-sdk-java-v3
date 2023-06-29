package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNextflowJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_ignore_failed_tasks")

    private Boolean hasIgnoreFailedTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_name")

    private String workflowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_line")

    private String commandLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<NextflowParamsDto> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nextflow_parameters")

    private Map<String, Object> nextflowParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_files")

    private List<String> configFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_context")

    private String configContext;

    public ShowNextflowJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowNextflowJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowNextflowJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowNextflowJobResponse withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ShowNextflowJobResponse addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowNextflowJobResponse withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 作业标签
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ShowNextflowJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业运行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowNextflowJobResponse withHasIgnoreFailedTasks(Boolean hasIgnoreFailedTasks) {
        this.hasIgnoreFailedTasks = hasIgnoreFailedTasks;
        return this;
    }

    /**
     * 是否包含已被忽略的失败tasks
     * @return hasIgnoreFailedTasks
     */
    public Boolean getHasIgnoreFailedTasks() {
        return hasIgnoreFailedTasks;
    }

    public void setHasIgnoreFailedTasks(Boolean hasIgnoreFailedTasks) {
        this.hasIgnoreFailedTasks = hasIgnoreFailedTasks;
    }

    public ShowNextflowJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowNextflowJobResponse withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 作业完成时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public ShowNextflowJobResponse withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * 作业运行失败描述信息，当作业执行失败时会返回
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public ShowNextflowJobResponse withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 作业运行失败原因，当作业执行失败时会返回
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ShowNextflowJobResponse withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * 流程名称
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public ShowNextflowJobResponse withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 流程id
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public ShowNextflowJobResponse withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * nextflow执行命令
     * @return commandLine
     */
    public String getCommandLine() {
        return commandLine;
    }

    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }

    public ShowNextflowJobResponse withParams(List<NextflowParamsDto> params) {
        this.params = params;
        return this;
    }

    public ShowNextflowJobResponse addParamsItem(NextflowParamsDto paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public ShowNextflowJobResponse withParams(Consumer<List<NextflowParamsDto>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 作业参数列表
     * @return params
     */
    public List<NextflowParamsDto> getParams() {
        return params;
    }

    public void setParams(List<NextflowParamsDto> params) {
        this.params = params;
    }

    public ShowNextflowJobResponse withNextflowParameters(Map<String, Object> nextflowParameters) {
        this.nextflowParameters = nextflowParameters;
        return this;
    }

    public ShowNextflowJobResponse putNextflowParametersItem(String key, Object nextflowParametersItem) {
        if (this.nextflowParameters == null) {
            this.nextflowParameters = new HashMap<>();
        }
        this.nextflowParameters.put(key, nextflowParametersItem);
        return this;
    }

    public ShowNextflowJobResponse withNextflowParameters(Consumer<Map<String, Object>> nextflowParametersSetter) {
        if (this.nextflowParameters == null) {
            this.nextflowParameters = new HashMap<>();
        }
        nextflowParametersSetter.accept(this.nextflowParameters);
        return this;
    }

    /**
     * nextflow流程返回的全量参数列表
     * @return nextflowParameters
     */
    public Map<String, Object> getNextflowParameters() {
        return nextflowParameters;
    }

    public void setNextflowParameters(Map<String, Object> nextflowParameters) {
        this.nextflowParameters = nextflowParameters;
    }

    public ShowNextflowJobResponse withConfigFiles(List<String> configFiles) {
        this.configFiles = configFiles;
        return this;
    }

    public ShowNextflowJobResponse addConfigFilesItem(String configFilesItem) {
        if (this.configFiles == null) {
            this.configFiles = new ArrayList<>();
        }
        this.configFiles.add(configFilesItem);
        return this;
    }

    public ShowNextflowJobResponse withConfigFiles(Consumer<List<String>> configFilesSetter) {
        if (this.configFiles == null) {
            this.configFiles = new ArrayList<>();
        }
        configFilesSetter.accept(this.configFiles);
        return this;
    }

    /**
     * 作业标签
     * @return configFiles
     */
    public List<String> getConfigFiles() {
        return configFiles;
    }

    public void setConfigFiles(List<String> configFiles) {
        this.configFiles = configFiles;
    }

    public ShowNextflowJobResponse withConfigContext(String configContext) {
        this.configContext = configContext;
        return this;
    }

    /**
     * nextflow config文件内容
     * @return configContext
     */
    public String getConfigContext() {
        return configContext;
    }

    public void setConfigContext(String configContext) {
        this.configContext = configContext;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNextflowJobResponse that = (ShowNextflowJobResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.hasIgnoreFailedTasks, that.hasIgnoreFailedTasks)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.failedMessage, that.failedMessage)
            && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.workflowName, that.workflowName) && Objects.equals(this.workflowId, that.workflowId)
            && Objects.equals(this.commandLine, that.commandLine) && Objects.equals(this.params, that.params)
            && Objects.equals(this.nextflowParameters, that.nextflowParameters)
            && Objects.equals(this.configFiles, that.configFiles)
            && Objects.equals(this.configContext, that.configContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            labels,
            status,
            hasIgnoreFailedTasks,
            createTime,
            finishTime,
            failedMessage,
            failedReason,
            workflowName,
            workflowId,
            commandLine,
            params,
            nextflowParameters,
            configFiles,
            configContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNextflowJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    hasIgnoreFailedTasks: ").append(toIndentedString(hasIgnoreFailedTasks)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    commandLine: ").append(toIndentedString(commandLine)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    nextflowParameters: ").append(toIndentedString(nextflowParameters)).append("\n");
        sb.append("    configFiles: ").append(toIndentedString(configFiles)).append("\n");
        sb.append("    configContext: ").append(toIndentedString(configContext)).append("\n");
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
