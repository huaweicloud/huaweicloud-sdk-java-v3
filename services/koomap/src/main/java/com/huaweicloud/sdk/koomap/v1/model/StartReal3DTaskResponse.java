package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartReal3DTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_type")

    private String modelingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_description")

    private String taskDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_params")

    private ModelingParams modelingParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinate_sys")

    private String coordinateSys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_marker")

    private Boolean hasMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_code")

    private String folderCode;

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
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_stage")

    private Integer completeStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_stage")

    private Integer totalStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_progress")

    private String taskProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_start_time")

    private String execStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_stop_time")

    private String execStopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_message")

    private String failMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "AT_progress")

    private String atProgress;

    public StartReal3DTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public StartReal3DTaskResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public StartReal3DTaskResponse withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型。 - REAL3D-UNCTRL（无控建模） - REAL3D-CTRL（有控建模）
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public StartReal3DTaskResponse withModelingType(String modelingType) {
        this.modelingType = modelingType;
        return this;
    }

    /**
     * 建模类型。  - Mesh：纹理模型实景三维建模。 - Nerf：显式辐射场实景三维建模。
     * @return modelingType
     */
    public String getModelingType() {
        return modelingType;
    }

    public void setModelingType(String modelingType) {
        this.modelingType = modelingType;
    }

    public StartReal3DTaskResponse withTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }

    /**
     * 任务描述。
     * @return taskDescription
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public StartReal3DTaskResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 任务所属工作共享空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public StartReal3DTaskResponse withModelingParams(ModelingParams modelingParams) {
        this.modelingParams = modelingParams;
        return this;
    }

    public StartReal3DTaskResponse withModelingParams(Consumer<ModelingParams> modelingParamsSetter) {
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

    public StartReal3DTaskResponse withCoordinateSys(String coordinateSys) {
        this.coordinateSys = coordinateSys;
        return this;
    }

    /**
     * 建模坐标系。
     * @return coordinateSys
     */
    public String getCoordinateSys() {
        return coordinateSys;
    }

    public void setCoordinateSys(String coordinateSys) {
        this.coordinateSys = coordinateSys;
    }

    public StartReal3DTaskResponse withHasMarker(Boolean hasMarker) {
        this.hasMarker = hasMarker;
        return this;
    }

    /**
     * 是否添加了刺点。
     * @return hasMarker
     */
    public Boolean getHasMarker() {
        return hasMarker;
    }

    public void setHasMarker(Boolean hasMarker) {
        this.hasMarker = hasMarker;
    }

    public StartReal3DTaskResponse withFolderCode(String folderCode) {
        this.folderCode = folderCode;
        return this;
    }

    /**
     * 任务绑定的倾斜影像的影像code。
     * @return folderCode
     */
    public String getFolderCode() {
        return folderCode;
    }

    public void setFolderCode(String folderCode) {
        this.folderCode = folderCode;
    }

    public StartReal3DTaskResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。格式为UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StartReal3DTaskResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 任务更新时间。格式为UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public StartReal3DTaskResponse withTenantDomainId(String tenantDomainId) {
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

    public StartReal3DTaskResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 任务创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public StartReal3DTaskResponse withLatestOperator(String latestOperator) {
        this.latestOperator = latestOperator;
        return this;
    }

    /**
     * 任务最近操作人。
     * @return latestOperator
     */
    public String getLatestOperator() {
        return latestOperator;
    }

    public void setLatestOperator(String latestOperator) {
        this.latestOperator = latestOperator;
    }

    public StartReal3DTaskResponse withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务当前状态。 - INIT（初始化） - PENDING（等待中） - STARTING（启动中） - START_FAILED（启动失败） - RUNNING（运行中） - SUCCESS（运行成功） - FAILED（运行失败） - STOPPING（停止中） - STOP_SUCCESS（已停止） - ARCHIVED（已归档） - BUNDLE_SUCCESS（空三建模成功）
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public StartReal3DTaskResponse withCompleteStage(Integer completeStage) {
        this.completeStage = completeStage;
        return this;
    }

    /**
     * 建模已完成作业步骤数。
     * @return completeStage
     */
    public Integer getCompleteStage() {
        return completeStage;
    }

    public void setCompleteStage(Integer completeStage) {
        this.completeStage = completeStage;
    }

    public StartReal3DTaskResponse withTotalStage(Integer totalStage) {
        this.totalStage = totalStage;
        return this;
    }

    /**
     * 建模总作业步骤数。
     * @return totalStage
     */
    public Integer getTotalStage() {
        return totalStage;
    }

    public void setTotalStage(Integer totalStage) {
        this.totalStage = totalStage;
    }

    public StartReal3DTaskResponse withTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
        return this;
    }

    /**
     * 任务进度。该字段为字符串表示的保留两位小数的浮点型数值，取值范围：0.00~1.00。
     * @return taskProgress
     */
    public String getTaskProgress() {
        return taskProgress;
    }

    public void setTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
    }

    public StartReal3DTaskResponse withExecStartTime(String execStartTime) {
        this.execStartTime = execStartTime;
        return this;
    }

    /**
     * 任务执行开始时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return execStartTime
     */
    public String getExecStartTime() {
        return execStartTime;
    }

    public void setExecStartTime(String execStartTime) {
        this.execStartTime = execStartTime;
    }

    public StartReal3DTaskResponse withExecStopTime(String execStopTime) {
        this.execStopTime = execStopTime;
        return this;
    }

    /**
     * 任务执行结束时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return execStopTime
     */
    public String getExecStopTime() {
        return execStopTime;
    }

    public void setExecStopTime(String execStopTime) {
        this.execStopTime = execStopTime;
    }

    public StartReal3DTaskResponse withFailMessage(String failMessage) {
        this.failMessage = failMessage;
        return this;
    }

    /**
     * 失败消息。当任务执行失败时，该字段显示任务的失败原因，用于辅助定位问题。
     * @return failMessage
     */
    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }

    public StartReal3DTaskResponse withAtProgress(String atProgress) {
        this.atProgress = atProgress;
        return this;
    }

    /**
     * 空三建模进度，取值范围：0.00~1.00。展示有控建模任务空三建模阶段的执行进度。因为空三建模仅在有控建模任务中执行，无控建模任务中该字段取值始终为null。
     * @return atProgress
     */
    public String getAtProgress() {
        return atProgress;
    }

    public void setAtProgress(String atProgress) {
        this.atProgress = atProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartReal3DTaskResponse that = (StartReal3DTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.modelingType, that.modelingType)
            && Objects.equals(this.taskDescription, that.taskDescription)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.modelingParams, that.modelingParams)
            && Objects.equals(this.coordinateSys, that.coordinateSys) && Objects.equals(this.hasMarker, that.hasMarker)
            && Objects.equals(this.folderCode, that.folderCode) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.tenantDomainId, that.tenantDomainId) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.latestOperator, that.latestOperator)
            && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.completeStage, that.completeStage)
            && Objects.equals(this.totalStage, that.totalStage) && Objects.equals(this.taskProgress, that.taskProgress)
            && Objects.equals(this.execStartTime, that.execStartTime)
            && Objects.equals(this.execStopTime, that.execStopTime)
            && Objects.equals(this.failMessage, that.failMessage) && Objects.equals(this.atProgress, that.atProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            taskType,
            modelingType,
            taskDescription,
            workspaceId,
            modelingParams,
            coordinateSys,
            hasMarker,
            folderCode,
            createTime,
            updateTime,
            tenantDomainId,
            creator,
            latestOperator,
            taskStatus,
            completeStage,
            totalStage,
            taskProgress,
            execStartTime,
            execStopTime,
            failMessage,
            atProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartReal3DTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    modelingType: ").append(toIndentedString(modelingType)).append("\n");
        sb.append("    taskDescription: ").append(toIndentedString(taskDescription)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    modelingParams: ").append(toIndentedString(modelingParams)).append("\n");
        sb.append("    coordinateSys: ").append(toIndentedString(coordinateSys)).append("\n");
        sb.append("    hasMarker: ").append(toIndentedString(hasMarker)).append("\n");
        sb.append("    folderCode: ").append(toIndentedString(folderCode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    tenantDomainId: ").append(toIndentedString(tenantDomainId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    latestOperator: ").append(toIndentedString(latestOperator)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    completeStage: ").append(toIndentedString(completeStage)).append("\n");
        sb.append("    totalStage: ").append(toIndentedString(totalStage)).append("\n");
        sb.append("    taskProgress: ").append(toIndentedString(taskProgress)).append("\n");
        sb.append("    execStartTime: ").append(toIndentedString(execStartTime)).append("\n");
        sb.append("    execStopTime: ").append(toIndentedString(execStopTime)).append("\n");
        sb.append("    failMessage: ").append(toIndentedString(failMessage)).append("\n");
        sb.append("    atProgress: ").append(toIndentedString(atProgress)).append("\n");
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
