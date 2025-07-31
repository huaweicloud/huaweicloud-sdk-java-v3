package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务信息
 */
public class ListTasksResponseInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_time")

    private Integer estimatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_scan_info")

    private ListTasksResponseInfoClusterScanInfo clusterScanInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iac_scan_info")

    private ListTasksResponseInfoIacScanInfo iacScanInfo;

    public ListTasksResponseInfoDataList withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 本次创建任务的id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListTasksResponseInfoDataList withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，包含如下   - cluster_scan：集群扫描   - iac_scan：iac扫描
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ListTasksResponseInfoDataList withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListTasksResponseInfoDataList withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 任务触发类型，包含如下   - manual：手动创建的任务   - schedule：定时任务
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public ListTasksResponseInfoDataList withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态，包含如下   - ready：等待执行   - running：运行中   - finished：任务结束
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ListTasksResponseInfoDataList withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListTasksResponseInfoDataList withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListTasksResponseInfoDataList withEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
        return this;
    }

    /**
     * 预计当前任务结束还需要的时间，单位为分钟
     * minimum: 0
     * maximum: 2000000
     * @return estimatedTime
     */
    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public ListTasksResponseInfoDataList withClusterScanInfo(ListTasksResponseInfoClusterScanInfo clusterScanInfo) {
        this.clusterScanInfo = clusterScanInfo;
        return this;
    }

    public ListTasksResponseInfoDataList withClusterScanInfo(
        Consumer<ListTasksResponseInfoClusterScanInfo> clusterScanInfoSetter) {
        if (this.clusterScanInfo == null) {
            this.clusterScanInfo = new ListTasksResponseInfoClusterScanInfo();
            clusterScanInfoSetter.accept(this.clusterScanInfo);
        }

        return this;
    }

    /**
     * Get clusterScanInfo
     * @return clusterScanInfo
     */
    public ListTasksResponseInfoClusterScanInfo getClusterScanInfo() {
        return clusterScanInfo;
    }

    public void setClusterScanInfo(ListTasksResponseInfoClusterScanInfo clusterScanInfo) {
        this.clusterScanInfo = clusterScanInfo;
    }

    public ListTasksResponseInfoDataList withIacScanInfo(ListTasksResponseInfoIacScanInfo iacScanInfo) {
        this.iacScanInfo = iacScanInfo;
        return this;
    }

    public ListTasksResponseInfoDataList withIacScanInfo(Consumer<ListTasksResponseInfoIacScanInfo> iacScanInfoSetter) {
        if (this.iacScanInfo == null) {
            this.iacScanInfo = new ListTasksResponseInfoIacScanInfo();
            iacScanInfoSetter.accept(this.iacScanInfo);
        }

        return this;
    }

    /**
     * Get iacScanInfo
     * @return iacScanInfo
     */
    public ListTasksResponseInfoIacScanInfo getIacScanInfo() {
        return iacScanInfo;
    }

    public void setIacScanInfo(ListTasksResponseInfoIacScanInfo iacScanInfo) {
        this.iacScanInfo = iacScanInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksResponseInfoDataList that = (ListTasksResponseInfoDataList) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.estimatedTime, that.estimatedTime)
            && Objects.equals(this.clusterScanInfo, that.clusterScanInfo)
            && Objects.equals(this.iacScanInfo, that.iacScanInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskType,
            taskName,
            triggerType,
            taskStatus,
            startTime,
            endTime,
            estimatedTime,
            clusterScanInfo,
            iacScanInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksResponseInfoDataList {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
        sb.append("    clusterScanInfo: ").append(toIndentedString(clusterScanInfo)).append("\n");
        sb.append("    iacScanInfo: ").append(toIndentedString(iacScanInfo)).append("\n");
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
