package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业监控信息。
 */
public class JobMonitorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_position")

    private String consumePosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_position")

    private String originPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_status")

    private String runningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_task_props")

    private Object totalTaskProps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_info")

    private List<MonitorTaskInfo> taskInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_progress")

    private SnapshotProgressInfo snapshotProgress;

    public JobMonitorInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 任务更新时间，毫秒时间戳。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public JobMonitorInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 作业源信息。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public JobMonitorInfo withConsumePosition(String consumePosition) {
        this.consumePosition = consumePosition;
        return this;
    }

    /**
     * 作业消费位点。
     * @return consumePosition
     */
    public String getConsumePosition() {
        return consumePosition;
    }

    public void setConsumePosition(String consumePosition) {
        this.consumePosition = consumePosition;
    }

    public JobMonitorInfo withOriginPosition(String originPosition) {
        this.originPosition = originPosition;
        return this;
    }

    /**
     * 起始位点。
     * @return originPosition
     */
    public String getOriginPosition() {
        return originPosition;
    }

    public void setOriginPosition(String originPosition) {
        this.originPosition = originPosition;
    }

    public JobMonitorInfo withRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }

    /**
     * 作业全量增量运行状态。 - INITIALIZING：初始化 - BINLOG：增量同步 - SNAPSHOT：全量同步
     * @return runningStatus
     */
    public String getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
    }

    public JobMonitorInfo withTotalTaskProps(Object totalTaskProps) {
        this.totalTaskProps = totalTaskProps;
        return this;
    }

    /**
     * 单节点聚合后的监控指标。
     * @return totalTaskProps
     */
    public Object getTotalTaskProps() {
        return totalTaskProps;
    }

    public void setTotalTaskProps(Object totalTaskProps) {
        this.totalTaskProps = totalTaskProps;
    }

    public JobMonitorInfo withTaskInfo(List<MonitorTaskInfo> taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }

    public JobMonitorInfo addTaskInfoItem(MonitorTaskInfo taskInfoItem) {
        if (this.taskInfo == null) {
            this.taskInfo = new ArrayList<>();
        }
        this.taskInfo.add(taskInfoItem);
        return this;
    }

    public JobMonitorInfo withTaskInfo(Consumer<List<MonitorTaskInfo>> taskInfoSetter) {
        if (this.taskInfo == null) {
            this.taskInfo = new ArrayList<>();
        }
        taskInfoSetter.accept(this.taskInfo);
        return this;
    }

    /**
     * 连接列表。
     * @return taskInfo
     */
    public List<MonitorTaskInfo> getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(List<MonitorTaskInfo> taskInfo) {
        this.taskInfo = taskInfo;
    }

    public JobMonitorInfo withSnapshotProgress(SnapshotProgressInfo snapshotProgress) {
        this.snapshotProgress = snapshotProgress;
        return this;
    }

    public JobMonitorInfo withSnapshotProgress(Consumer<SnapshotProgressInfo> snapshotProgressSetter) {
        if (this.snapshotProgress == null) {
            this.snapshotProgress = new SnapshotProgressInfo();
            snapshotProgressSetter.accept(this.snapshotProgress);
        }

        return this;
    }

    /**
     * Get snapshotProgress
     * @return snapshotProgress
     */
    public SnapshotProgressInfo getSnapshotProgress() {
        return snapshotProgress;
    }

    public void setSnapshotProgress(SnapshotProgressInfo snapshotProgress) {
        this.snapshotProgress = snapshotProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobMonitorInfo that = (JobMonitorInfo) obj;
        return Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.consumePosition, that.consumePosition)
            && Objects.equals(this.originPosition, that.originPosition)
            && Objects.equals(this.runningStatus, that.runningStatus)
            && Objects.equals(this.totalTaskProps, that.totalTaskProps) && Objects.equals(this.taskInfo, that.taskInfo)
            && Objects.equals(this.snapshotProgress, that.snapshotProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateTime,
            nodeId,
            consumePosition,
            originPosition,
            runningStatus,
            totalTaskProps,
            taskInfo,
            snapshotProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobMonitorInfo {\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    consumePosition: ").append(toIndentedString(consumePosition)).append("\n");
        sb.append("    originPosition: ").append(toIndentedString(originPosition)).append("\n");
        sb.append("    runningStatus: ").append(toIndentedString(runningStatus)).append("\n");
        sb.append("    totalTaskProps: ").append(toIndentedString(totalTaskProps)).append("\n");
        sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
        sb.append("    snapshotProgress: ").append(toIndentedString(snapshotProgress)).append("\n");
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
