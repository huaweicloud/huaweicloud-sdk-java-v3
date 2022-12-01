package com.huaweicloud.sdk.ief.v1.model;

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
public class ShowBatchJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Integer createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_total_count")

    private Integer taskTotalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_failed_count")

    private Integer taskFailedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_success_count")

    private Integer taskSuccessCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_data")

    private String taskData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<Task> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<Target> targets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Integer updatedAt;

    public ShowBatchJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 批量处理作业ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowBatchJobResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 批量处理作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowBatchJobResponse withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 批量作业类型，支持以下选项： - node_upgrade： 节点升级 - deployment_deploy：应用部署 - deployment_upgrade：应用升级
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ShowBatchJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowBatchJobResponse withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间戳
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public ShowBatchJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowBatchJobResponse withTaskTotalCount(Integer taskTotalCount) {
        this.taskTotalCount = taskTotalCount;
        return this;
    }

    /**
     * 任务总数
     * @return taskTotalCount
     */
    public Integer getTaskTotalCount() {
        return taskTotalCount;
    }

    public void setTaskTotalCount(Integer taskTotalCount) {
        this.taskTotalCount = taskTotalCount;
    }

    public ShowBatchJobResponse withTaskFailedCount(Integer taskFailedCount) {
        this.taskFailedCount = taskFailedCount;
        return this;
    }

    /**
     * 任务项执行成功数
     * @return taskFailedCount
     */
    public Integer getTaskFailedCount() {
        return taskFailedCount;
    }

    public void setTaskFailedCount(Integer taskFailedCount) {
        this.taskFailedCount = taskFailedCount;
    }

    public ShowBatchJobResponse withTaskSuccessCount(Integer taskSuccessCount) {
        this.taskSuccessCount = taskSuccessCount;
        return this;
    }

    /**
     * 任务项执行失败数
     * @return taskSuccessCount
     */
    public Integer getTaskSuccessCount() {
        return taskSuccessCount;
    }

    public void setTaskSuccessCount(Integer taskSuccessCount) {
        this.taskSuccessCount = taskSuccessCount;
    }

    public ShowBatchJobResponse withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 批量作业对象类型，支持如下选项： - node：边缘节点 - node_group：边缘节点组 - deployment：边缘应用
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public ShowBatchJobResponse withTaskData(String taskData) {
        this.taskData = taskData;
        return this;
    }

    /**
     * 批量作业内容，仅在批量应用部署和批量应用升级时需要填写，填入的内容为：使用json结构体编写的创建应用部署接口请求体deployment参数，并将其转换为字符串
     * @return taskData
     */
    public String getTaskData() {
        return taskData;
    }

    public void setTaskData(String taskData) {
        this.taskData = taskData;
    }

    public ShowBatchJobResponse withTasks(List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ShowBatchJobResponse addTasksItem(Task tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowBatchJobResponse withTasks(Consumer<List<Task>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 任务项详情
     * @return tasks
     */
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public ShowBatchJobResponse withTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    public ShowBatchJobResponse addTargetsItem(Target targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public ShowBatchJobResponse withTargets(Consumer<List<Target>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 批量处理对象详情
     * @return targets
     */
    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    public ShowBatchJobResponse withUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 状态更新时间戳
     * @return updatedAt
     */
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBatchJobResponse showBatchJobResponse = (ShowBatchJobResponse) o;
        return Objects.equals(this.jobId, showBatchJobResponse.jobId)
            && Objects.equals(this.jobName, showBatchJobResponse.jobName)
            && Objects.equals(this.jobType, showBatchJobResponse.jobType)
            && Objects.equals(this.description, showBatchJobResponse.description)
            && Objects.equals(this.createdAt, showBatchJobResponse.createdAt)
            && Objects.equals(this.status, showBatchJobResponse.status)
            && Objects.equals(this.taskTotalCount, showBatchJobResponse.taskTotalCount)
            && Objects.equals(this.taskFailedCount, showBatchJobResponse.taskFailedCount)
            && Objects.equals(this.taskSuccessCount, showBatchJobResponse.taskSuccessCount)
            && Objects.equals(this.targetType, showBatchJobResponse.targetType)
            && Objects.equals(this.taskData, showBatchJobResponse.taskData)
            && Objects.equals(this.tasks, showBatchJobResponse.tasks)
            && Objects.equals(this.targets, showBatchJobResponse.targets)
            && Objects.equals(this.updatedAt, showBatchJobResponse.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            jobName,
            jobType,
            description,
            createdAt,
            status,
            taskTotalCount,
            taskFailedCount,
            taskSuccessCount,
            targetType,
            taskData,
            tasks,
            targets,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskTotalCount: ").append(toIndentedString(taskTotalCount)).append("\n");
        sb.append("    taskFailedCount: ").append(toIndentedString(taskFailedCount)).append("\n");
        sb.append("    taskSuccessCount: ").append(toIndentedString(taskSuccessCount)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    taskData: ").append(toIndentedString(taskData)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
