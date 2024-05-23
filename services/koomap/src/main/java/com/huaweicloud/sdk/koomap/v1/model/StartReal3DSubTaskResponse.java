package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartReal3DSubTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_id")

    private String subtaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_name")

    private String subtaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_params")

    private ModelingParams modelingParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_status")

    private String subtaskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_path")

    private String modelPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refine_product_id")

    private String refineProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_domain_id")

    private String tenantDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_operator")

    private String latestOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_progress")

    private String subtaskProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_start_time")

    private String execStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_stop_time")

    private String execStopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_message")

    private String failMessage;

    public StartReal3DSubTaskResponse withSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }

    /**
     * 实景三维精修后处理任务ID。
     * @return subtaskId
     */
    public String getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
    }

    public StartReal3DSubTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 原始实景三维建模任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public StartReal3DSubTaskResponse withSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
        return this;
    }

    /**
     * 精修后处理任务别名。
     * @return subtaskName
     */
    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    public StartReal3DSubTaskResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 原始实景三维建模任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public StartReal3DSubTaskResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 原始实景三维建模任务所属工作共享空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public StartReal3DSubTaskResponse withModelingParams(ModelingParams modelingParams) {
        this.modelingParams = modelingParams;
        return this;
    }

    public StartReal3DSubTaskResponse withModelingParams(Consumer<ModelingParams> modelingParamsSetter) {
        if (this.modelingParams == null) {
            this.modelingParams = new ModelingParams();
            modelingParamsSetter.accept(this.modelingParams);
        }

        return this;
    }

    /**
     * Get modelingParams
     * @return modelingParams
     */
    public ModelingParams getModelingParams() {
        return modelingParams;
    }

    public void setModelingParams(ModelingParams modelingParams) {
        this.modelingParams = modelingParams;
    }

    public StartReal3DSubTaskResponse withSubtaskStatus(String subtaskStatus) {
        this.subtaskStatus = subtaskStatus;
        return this;
    }

    /**
     * 实景三维精修后处理任务当前状态。 - INIT（初始化） - UPLOADING（上传中） - UPLOAD_SUCCESS（上传成功） - UPLOAD_FAILED（上传失败） - PENDING（等待中） - STARTING（启动中） - START_FAILED（启动失败） - RUNNING（运行中） - SUCCESS（运行成功） - FAILED（运行失败） - STOPPING（停止中） - STOP_SUCCESS（已停止）
     * @return subtaskStatus
     */
    public String getSubtaskStatus() {
        return subtaskStatus;
    }

    public void setSubtaskStatus(String subtaskStatus) {
        this.subtaskStatus = subtaskStatus;
    }

    public StartReal3DSubTaskResponse withModelPath(String modelPath) {
        this.modelPath = modelPath;
        return this;
    }

    /**
     * 模型数据上传路径。
     * @return modelPath
     */
    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath;
    }

    public StartReal3DSubTaskResponse withRefineProductId(String refineProductId) {
        this.refineProductId = refineProductId;
        return this;
    }

    /**
     * 精修后处理任务成果数据ID。
     * @return refineProductId
     */
    public String getRefineProductId() {
        return refineProductId;
    }

    public void setRefineProductId(String refineProductId) {
        this.refineProductId = refineProductId;
    }

    public StartReal3DSubTaskResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 精修后处理任务创建时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StartReal3DSubTaskResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 精修后处理任务更新时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public StartReal3DSubTaskResponse withTenantDomainId(String tenantDomainId) {
        this.tenantDomainId = tenantDomainId;
        return this;
    }

    /**
     * 华为云IAM租户账号ID。
     * @return tenantDomainId
     */
    public String getTenantDomainId() {
        return tenantDomainId;
    }

    public void setTenantDomainId(String tenantDomainId) {
        this.tenantDomainId = tenantDomainId;
    }

    public StartReal3DSubTaskResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 精修后处理任务创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public StartReal3DSubTaskResponse withLatestOperator(String latestOperator) {
        this.latestOperator = latestOperator;
        return this;
    }

    /**
     * 精修后处理任务最近操作人。
     * @return latestOperator
     */
    public String getLatestOperator() {
        return latestOperator;
    }

    public void setLatestOperator(String latestOperator) {
        this.latestOperator = latestOperator;
    }

    public StartReal3DSubTaskResponse withSubtaskProgress(String subtaskProgress) {
        this.subtaskProgress = subtaskProgress;
        return this;
    }

    /**
     * 精修后处理任务进度。该字段为保留两位小数的浮点型数值字符串，数值表示范围为0.00~1.00。
     * @return subtaskProgress
     */
    public String getSubtaskProgress() {
        return subtaskProgress;
    }

    public void setSubtaskProgress(String subtaskProgress) {
        this.subtaskProgress = subtaskProgress;
    }

    public StartReal3DSubTaskResponse withExecStartTime(String execStartTime) {
        this.execStartTime = execStartTime;
        return this;
    }

    /**
     * 精修后处理任务执行开始时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return execStartTime
     */
    public String getExecStartTime() {
        return execStartTime;
    }

    public void setExecStartTime(String execStartTime) {
        this.execStartTime = execStartTime;
    }

    public StartReal3DSubTaskResponse withExecStopTime(String execStopTime) {
        this.execStopTime = execStopTime;
        return this;
    }

    /**
     * 精修后处理任务执行结束时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return execStopTime
     */
    public String getExecStopTime() {
        return execStopTime;
    }

    public void setExecStopTime(String execStopTime) {
        this.execStopTime = execStopTime;
    }

    public StartReal3DSubTaskResponse withFailMessage(String failMessage) {
        this.failMessage = failMessage;
        return this;
    }

    /**
     * 失败消息。当精修后处理任务执行失败时，该字段显示任务的失败原因，用于辅助定位问题。
     * @return failMessage
     */
    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartReal3DSubTaskResponse that = (StartReal3DSubTaskResponse) obj;
        return Objects.equals(this.subtaskId, that.subtaskId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.subtaskName, that.subtaskName) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.modelingParams, that.modelingParams)
            && Objects.equals(this.subtaskStatus, that.subtaskStatus) && Objects.equals(this.modelPath, that.modelPath)
            && Objects.equals(this.refineProductId, that.refineProductId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.tenantDomainId, that.tenantDomainId) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.latestOperator, that.latestOperator)
            && Objects.equals(this.subtaskProgress, that.subtaskProgress)
            && Objects.equals(this.execStartTime, that.execStartTime)
            && Objects.equals(this.execStopTime, that.execStopTime)
            && Objects.equals(this.failMessage, that.failMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subtaskId,
            taskId,
            subtaskName,
            taskName,
            workspaceId,
            modelingParams,
            subtaskStatus,
            modelPath,
            refineProductId,
            createTime,
            updateTime,
            tenantDomainId,
            creator,
            latestOperator,
            subtaskProgress,
            execStartTime,
            execStopTime,
            failMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartReal3DSubTaskResponse {\n");
        sb.append("    subtaskId: ").append(toIndentedString(subtaskId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    subtaskName: ").append(toIndentedString(subtaskName)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    modelingParams: ").append(toIndentedString(modelingParams)).append("\n");
        sb.append("    subtaskStatus: ").append(toIndentedString(subtaskStatus)).append("\n");
        sb.append("    modelPath: ").append(toIndentedString(modelPath)).append("\n");
        sb.append("    refineProductId: ").append(toIndentedString(refineProductId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    tenantDomainId: ").append(toIndentedString(tenantDomainId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    latestOperator: ").append(toIndentedString(latestOperator)).append("\n");
        sb.append("    subtaskProgress: ").append(toIndentedString(subtaskProgress)).append("\n");
        sb.append("    execStartTime: ").append(toIndentedString(execStartTime)).append("\n");
        sb.append("    execStopTime: ").append(toIndentedString(execStopTime)).append("\n");
        sb.append("    failMessage: ").append(toIndentedString(failMessage)).append("\n");
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
