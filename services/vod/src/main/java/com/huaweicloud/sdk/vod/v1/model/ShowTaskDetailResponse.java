package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_task")

    private WorkflowTask workflowTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_media_task")

    private EditMediaTask editMediaTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_context")

    private String sessionContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    public ShowTaskDetailResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务Id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowTaskDetailResponse withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ShowTaskDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态，包含就绪，处理中，成功，失败，已取消
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowTaskDetailResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowTaskDetailResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ShowTaskDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务开始时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowTaskDetailResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始处理时间，多个任务则是第一个任务的开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowTaskDetailResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务处理结束时间，多个任务则是最后一个任务的结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowTaskDetailResponse withWorkflowTask(WorkflowTask workflowTask) {
        this.workflowTask = workflowTask;
        return this;
    }

    public ShowTaskDetailResponse withWorkflowTask(Consumer<WorkflowTask> workflowTaskSetter) {
        if (this.workflowTask == null) {
            this.workflowTask = new WorkflowTask();
            workflowTaskSetter.accept(this.workflowTask);
        }

        return this;
    }

    /**
     * Get workflowTask
     * @return workflowTask
     */
    public WorkflowTask getWorkflowTask() {
        return workflowTask;
    }

    public void setWorkflowTask(WorkflowTask workflowTask) {
        this.workflowTask = workflowTask;
    }

    public ShowTaskDetailResponse withEditMediaTask(EditMediaTask editMediaTask) {
        this.editMediaTask = editMediaTask;
        return this;
    }

    public ShowTaskDetailResponse withEditMediaTask(Consumer<EditMediaTask> editMediaTaskSetter) {
        if (this.editMediaTask == null) {
            this.editMediaTask = new EditMediaTask();
            editMediaTaskSetter.accept(this.editMediaTask);
        }

        return this;
    }

    /**
     * Get editMediaTask
     * @return editMediaTask
     */
    public EditMediaTask getEditMediaTask() {
        return editMediaTask;
    }

    public void setEditMediaTask(EditMediaTask editMediaTask) {
        this.editMediaTask = editMediaTask;
    }

    public ShowTaskDetailResponse withSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
        return this;
    }

    /**
     * 用户自定义数据
     * @return sessionContext
     */
    public String getSessionContext() {
        return sessionContext;
    }

    public void setSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
    }

    public ShowTaskDetailResponse withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 客户回调地址
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskDetailResponse that = (ShowTaskDetailResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.workflowTask, that.workflowTask)
            && Objects.equals(this.editMediaTask, that.editMediaTask)
            && Objects.equals(this.sessionContext, that.sessionContext)
            && Objects.equals(this.callbackUrl, that.callbackUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskType,
            status,
            errorCode,
            errorMsg,
            createTime,
            startTime,
            endTime,
            workflowTask,
            editMediaTask,
            sessionContext,
            callbackUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskDetailResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    workflowTask: ").append(toIndentedString(workflowTask)).append("\n");
        sb.append("    editMediaTask: ").append(toIndentedString(editMediaTask)).append("\n");
        sb.append("    sessionContext: ").append(toIndentedString(sessionContext)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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
