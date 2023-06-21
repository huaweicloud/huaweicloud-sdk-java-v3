package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceOverviewVo
 */
public class InstanceOverviewVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private String runStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_status")

    private String notifyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public InstanceOverviewVo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InstanceOverviewVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceOverviewVo withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * task id
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public InstanceOverviewVo withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * QUALITY_TASK:质量作业,CONSISTENCY_TASK:对账作业
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public InstanceOverviewVo withRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * RUNNING:运行中,FAILED:失败,ALARMING:报警,SUCCESS:正常
     * @return runStatus
     */
    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    public InstanceOverviewVo withNotifyStatus(String notifyStatus) {
        this.notifyStatus = notifyStatus;
        return this;
    }

    /**
     * NOT_TRIGGERED:未触发,SUCCESS:成功,FAILED:失败
     * @return notifyStatus
     */
    public String getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(String notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    public InstanceOverviewVo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public InstanceOverviewVo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceOverviewVo instanceOverviewVo = (InstanceOverviewVo) o;
        return Objects.equals(this.id, instanceOverviewVo.id) && Objects.equals(this.name, instanceOverviewVo.name)
            && Objects.equals(this.taskId, instanceOverviewVo.taskId)
            && Objects.equals(this.taskType, instanceOverviewVo.taskType)
            && Objects.equals(this.runStatus, instanceOverviewVo.runStatus)
            && Objects.equals(this.notifyStatus, instanceOverviewVo.notifyStatus)
            && Objects.equals(this.startTime, instanceOverviewVo.startTime)
            && Objects.equals(this.endTime, instanceOverviewVo.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, taskId, taskType, runStatus, notifyStatus, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceOverviewVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    notifyStatus: ").append(toIndentedString(notifyStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
