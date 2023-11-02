package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 成果模型关联任务。
 */
public class Real3DProductRelateTaskVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_params")

    private String taskParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_exec_start_time")

    private String taskExecStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_exec_end_time")

    private String taskExecEndTime;

    public Real3DProductRelateTaskVO withTaskId(String taskId) {
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

    public Real3DProductRelateTaskVO withTaskName(String taskName) {
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

    public Real3DProductRelateTaskVO withTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }

    /**
     * 任务建模参数。
     * @return taskParams
     */
    public String getTaskParams() {
        return taskParams;
    }

    public void setTaskParams(String taskParams) {
        this.taskParams = taskParams;
    }

    public Real3DProductRelateTaskVO withTaskExecStartTime(String taskExecStartTime) {
        this.taskExecStartTime = taskExecStartTime;
        return this;
    }

    /**
     * 任务执行开始时间。返回UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return taskExecStartTime
     */
    public String getTaskExecStartTime() {
        return taskExecStartTime;
    }

    public void setTaskExecStartTime(String taskExecStartTime) {
        this.taskExecStartTime = taskExecStartTime;
    }

    public Real3DProductRelateTaskVO withTaskExecEndTime(String taskExecEndTime) {
        this.taskExecEndTime = taskExecEndTime;
        return this;
    }

    /**
     * 任务执行结束时间。返回UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
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
        Real3DProductRelateTaskVO that = (Real3DProductRelateTaskVO) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskParams, that.taskParams)
            && Objects.equals(this.taskExecStartTime, that.taskExecStartTime)
            && Objects.equals(this.taskExecEndTime, that.taskExecEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, taskParams, taskExecStartTime, taskExecEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Real3DProductRelateTaskVO {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
