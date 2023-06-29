package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskRuntimeDto
 */
public class TaskRuntimeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_running_time")

    private Integer actualRunningTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tasks")

    private List<SubTaskRuntimeDto> subTasks = null;

    public TaskRuntimeDto withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 作业子任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskRuntimeDto withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业子任务运行创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TaskRuntimeDto withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 作业子任务运行结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public TaskRuntimeDto withActualRunningTime(Integer actualRunningTime) {
        this.actualRunningTime = actualRunningTime;
        return this;
    }

    /**
     * 作业子任务实际运行时间
     * @return actualRunningTime
     */
    public Integer getActualRunningTime() {
        return actualRunningTime;
    }

    public void setActualRunningTime(Integer actualRunningTime) {
        this.actualRunningTime = actualRunningTime;
    }

    public TaskRuntimeDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业子任务运行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskRuntimeDto withSubTasks(List<SubTaskRuntimeDto> subTasks) {
        this.subTasks = subTasks;
        return this;
    }

    public TaskRuntimeDto addSubTasksItem(SubTaskRuntimeDto subTasksItem) {
        if (this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        this.subTasks.add(subTasksItem);
        return this;
    }

    public TaskRuntimeDto withSubTasks(Consumer<List<SubTaskRuntimeDto>> subTasksSetter) {
        if (this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        subTasksSetter.accept(this.subTasks);
        return this;
    }

    /**
     * 作业子任务的并发实例列表
     * @return subTasks
     */
    public List<SubTaskRuntimeDto> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTaskRuntimeDto> subTasks) {
        this.subTasks = subTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskRuntimeDto that = (TaskRuntimeDto) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.actualRunningTime, that.actualRunningTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.subTasks, that.subTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, createTime, finishTime, actualRunningTime, status, subTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskRuntimeDto {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    actualRunningTime: ").append(toIndentedString(actualRunningTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
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
