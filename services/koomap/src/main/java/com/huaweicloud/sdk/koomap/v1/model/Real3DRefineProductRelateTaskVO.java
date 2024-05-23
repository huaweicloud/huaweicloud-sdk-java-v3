package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 精修后处理成果数据关联任务。
 */
public class Real3DRefineProductRelateTaskVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_params")

    private String taskParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_exec_start_time")

    private String taskExecStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_exec_end_time")

    private String taskExecEndTime;

    public Real3DRefineProductRelateTaskVO withTaskId(String taskId) {
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

    public Real3DRefineProductRelateTaskVO withTaskName(String taskName) {
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

    public Real3DRefineProductRelateTaskVO withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 关联工作共享空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Real3DRefineProductRelateTaskVO withTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }

    /**
     * 原始实景三维建模任务参数。
     * @return taskParams
     */
    public String getTaskParams() {
        return taskParams;
    }

    public void setTaskParams(String taskParams) {
        this.taskParams = taskParams;
    }

    public Real3DRefineProductRelateTaskVO withTaskExecStartTime(String taskExecStartTime) {
        this.taskExecStartTime = taskExecStartTime;
        return this;
    }

    /**
     * 原始实景三维建模任务执行开始时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return taskExecStartTime
     */
    public String getTaskExecStartTime() {
        return taskExecStartTime;
    }

    public void setTaskExecStartTime(String taskExecStartTime) {
        this.taskExecStartTime = taskExecStartTime;
    }

    public Real3DRefineProductRelateTaskVO withTaskExecEndTime(String taskExecEndTime) {
        this.taskExecEndTime = taskExecEndTime;
        return this;
    }

    /**
     * 原始实景三维建模任务执行结束时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return taskExecEndTime
     */
    public String getTaskExecEndTime() {
        return taskExecEndTime;
    }

    public void setTaskExecEndTime(String taskExecEndTime) {
        this.taskExecEndTime = taskExecEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Real3DRefineProductRelateTaskVO that = (Real3DRefineProductRelateTaskVO) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.taskParams, that.taskParams)
            && Objects.equals(this.taskExecStartTime, that.taskExecStartTime)
            && Objects.equals(this.taskExecEndTime, that.taskExecEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, workspaceId, taskParams, taskExecStartTime, taskExecEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Real3DRefineProductRelateTaskVO {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    taskParams: ").append(toIndentedString(taskParams)).append("\n");
        sb.append("    taskExecStartTime: ").append(toIndentedString(taskExecStartTime)).append("\n");
        sb.append("    taskExecEndTime: ").append(toIndentedString(taskExecEndTime)).append("\n");
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
