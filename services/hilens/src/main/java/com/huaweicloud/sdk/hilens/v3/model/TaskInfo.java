package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取作业详情
 */
public class TaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private String timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streams")

    private TaskStream streams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_pod_number")

    private Integer okPodNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_pod_number")

    private Integer curPodNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_pod_number")

    private Integer sumPodNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_pod_number")

    private Integer failPodNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_pod_number")

    private Integer pendingPodNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private List<TaskStatus> taskStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_task_id")

    private String userTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time_info")

    private StartTimeInfo startTimeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_usage_estimate")

    private TaskSourceUsageEstimate sourceUsageEstimate;

    public TaskInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskInfo withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 作业创建时间
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public TaskInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskInfo withStreams(TaskStream streams) {
        this.streams = streams;
        return this;
    }

    public TaskInfo withStreams(Consumer<TaskStream> streamsSetter) {
        if (this.streams == null) {
            this.streams = new TaskStream();
            streamsSetter.accept(this.streams);
        }

        return this;
    }

    /**
     * Get streams
     * @return streams
     */
    public TaskStream getStreams() {
        return streams;
    }

    public void setStreams(TaskStream streams) {
        this.streams = streams;
    }

    public TaskInfo withOkPodNumber(Integer okPodNumber) {
        this.okPodNumber = okPodNumber;
        return this;
    }

    /**
     * 在实例上运行成功的作业数
     * @return okPodNumber
     */
    public Integer getOkPodNumber() {
        return okPodNumber;
    }

    public void setOkPodNumber(Integer okPodNumber) {
        this.okPodNumber = okPodNumber;
    }

    public TaskInfo withCurPodNumber(Integer curPodNumber) {
        this.curPodNumber = curPodNumber;
        return this;
    }

    /**
     * 在实例上正在运行的作业数
     * @return curPodNumber
     */
    public Integer getCurPodNumber() {
        return curPodNumber;
    }

    public void setCurPodNumber(Integer curPodNumber) {
        this.curPodNumber = curPodNumber;
    }

    public TaskInfo withSumPodNumber(Integer sumPodNumber) {
        this.sumPodNumber = sumPodNumber;
        return this;
    }

    /**
     * 在实例上运行过的作业总数
     * @return sumPodNumber
     */
    public Integer getSumPodNumber() {
        return sumPodNumber;
    }

    public void setSumPodNumber(Integer sumPodNumber) {
        this.sumPodNumber = sumPodNumber;
    }

    public TaskInfo withFailPodNumber(Integer failPodNumber) {
        this.failPodNumber = failPodNumber;
        return this;
    }

    /**
     * 在实例上运行失败的作业数
     * @return failPodNumber
     */
    public Integer getFailPodNumber() {
        return failPodNumber;
    }

    public void setFailPodNumber(Integer failPodNumber) {
        this.failPodNumber = failPodNumber;
    }

    public TaskInfo withPendingPodNumber(Integer pendingPodNumber) {
        this.pendingPodNumber = pendingPodNumber;
        return this;
    }

    /**
     * 在实例上等待运行的作业数
     * @return pendingPodNumber
     */
    public Integer getPendingPodNumber() {
        return pendingPodNumber;
    }

    public void setPendingPodNumber(Integer pendingPodNumber) {
        this.pendingPodNumber = pendingPodNumber;
    }

    public TaskInfo withTaskStatus(List<TaskStatus> taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    public TaskInfo addTaskStatusItem(TaskStatus taskStatusItem) {
        if (this.taskStatus == null) {
            this.taskStatus = new ArrayList<>();
        }
        this.taskStatus.add(taskStatusItem);
        return this;
    }

    public TaskInfo withTaskStatus(Consumer<List<TaskStatus>> taskStatusSetter) {
        if (this.taskStatus == null) {
            this.taskStatus = new ArrayList<>();
        }
        taskStatusSetter.accept(this.taskStatus);
        return this;
    }

    /**
     * 作业状态信息
     * @return taskStatus
     */
    public List<TaskStatus> getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(List<TaskStatus> taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 作业id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskInfo withUserTaskId(String userTaskId) {
        this.userTaskId = userTaskId;
        return this;
    }

    /**
     * 用户作业id
     * @return userTaskId
     */
    public String getUserTaskId() {
        return userTaskId;
    }

    public void setUserTaskId(String userTaskId) {
        this.userTaskId = userTaskId;
    }

    public TaskInfo withStartTimeInfo(StartTimeInfo startTimeInfo) {
        this.startTimeInfo = startTimeInfo;
        return this;
    }

    public TaskInfo withStartTimeInfo(Consumer<StartTimeInfo> startTimeInfoSetter) {
        if (this.startTimeInfo == null) {
            this.startTimeInfo = new StartTimeInfo();
            startTimeInfoSetter.accept(this.startTimeInfo);
        }

        return this;
    }

    /**
     * Get startTimeInfo
     * @return startTimeInfo
     */
    public StartTimeInfo getStartTimeInfo() {
        return startTimeInfo;
    }

    public void setStartTimeInfo(StartTimeInfo startTimeInfo) {
        this.startTimeInfo = startTimeInfo;
    }

    public TaskInfo withSourceUsageEstimate(TaskSourceUsageEstimate sourceUsageEstimate) {
        this.sourceUsageEstimate = sourceUsageEstimate;
        return this;
    }

    public TaskInfo withSourceUsageEstimate(Consumer<TaskSourceUsageEstimate> sourceUsageEstimateSetter) {
        if (this.sourceUsageEstimate == null) {
            this.sourceUsageEstimate = new TaskSourceUsageEstimate();
            sourceUsageEstimateSetter.accept(this.sourceUsageEstimate);
        }

        return this;
    }

    /**
     * Get sourceUsageEstimate
     * @return sourceUsageEstimate
     */
    public TaskSourceUsageEstimate getSourceUsageEstimate() {
        return sourceUsageEstimate;
    }

    public void setSourceUsageEstimate(TaskSourceUsageEstimate sourceUsageEstimate) {
        this.sourceUsageEstimate = sourceUsageEstimate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInfo taskInfo = (TaskInfo) o;
        return Objects.equals(this.name, taskInfo.name) && Objects.equals(this.timestamp, taskInfo.timestamp)
            && Objects.equals(this.description, taskInfo.description) && Objects.equals(this.streams, taskInfo.streams)
            && Objects.equals(this.okPodNumber, taskInfo.okPodNumber)
            && Objects.equals(this.curPodNumber, taskInfo.curPodNumber)
            && Objects.equals(this.sumPodNumber, taskInfo.sumPodNumber)
            && Objects.equals(this.failPodNumber, taskInfo.failPodNumber)
            && Objects.equals(this.pendingPodNumber, taskInfo.pendingPodNumber)
            && Objects.equals(this.taskStatus, taskInfo.taskStatus) && Objects.equals(this.taskId, taskInfo.taskId)
            && Objects.equals(this.userTaskId, taskInfo.userTaskId)
            && Objects.equals(this.startTimeInfo, taskInfo.startTimeInfo)
            && Objects.equals(this.sourceUsageEstimate, taskInfo.sourceUsageEstimate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            timestamp,
            description,
            streams,
            okPodNumber,
            curPodNumber,
            sumPodNumber,
            failPodNumber,
            pendingPodNumber,
            taskStatus,
            taskId,
            userTaskId,
            startTimeInfo,
            sourceUsageEstimate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
        sb.append("    okPodNumber: ").append(toIndentedString(okPodNumber)).append("\n");
        sb.append("    curPodNumber: ").append(toIndentedString(curPodNumber)).append("\n");
        sb.append("    sumPodNumber: ").append(toIndentedString(sumPodNumber)).append("\n");
        sb.append("    failPodNumber: ").append(toIndentedString(failPodNumber)).append("\n");
        sb.append("    pendingPodNumber: ").append(toIndentedString(pendingPodNumber)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    userTaskId: ").append(toIndentedString(userTaskId)).append("\n");
        sb.append("    startTimeInfo: ").append(toIndentedString(startTimeInfo)).append("\n");
        sb.append("    sourceUsageEstimate: ").append(toIndentedString(sourceUsageEstimate)).append("\n");
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
