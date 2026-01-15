package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务进度信息。
 */
public class JobProgressInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incr_trans_delay")

    private String incrTransDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incr_trans_delay_millis")

    private String incrTransDelayMillis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_mode")

    private String taskMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_status")

    private String transferStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_time")

    private String processTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_time")

    private String remainingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress_map")

    private Map<String, ProgressCompleteInfo> progressMap = null;

    public JobProgressInfo withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 迁移对比百分比。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public JobProgressInfo withIncrTransDelay(String incrTransDelay) {
        this.incrTransDelay = incrTransDelay;
        return this;
    }

    /**
     * 增量迁移时延（单位：s）。
     * @return incrTransDelay
     */
    public String getIncrTransDelay() {
        return incrTransDelay;
    }

    public void setIncrTransDelay(String incrTransDelay) {
        this.incrTransDelay = incrTransDelay;
    }

    public JobProgressInfo withIncrTransDelayMillis(String incrTransDelayMillis) {
        this.incrTransDelayMillis = incrTransDelayMillis;
        return this;
    }

    /**
     * 增量迁移时延（单位：ms）。
     * @return incrTransDelayMillis
     */
    public String getIncrTransDelayMillis() {
        return incrTransDelayMillis;
    }

    public void setIncrTransDelayMillis(String incrTransDelayMillis) {
        this.incrTransDelayMillis = incrTransDelayMillis;
    }

    public JobProgressInfo withTaskMode(String taskMode) {
        this.taskMode = taskMode;
        return this;
    }

    /**
     * 迁移模式。
     * @return taskMode
     */
    public String getTaskMode() {
        return taskMode;
    }

    public void setTaskMode(String taskMode) {
        this.taskMode = taskMode;
    }

    public JobProgressInfo withTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }

    /**
     * 迁移状态。 CREATING:创建中 - CREATE_FAILED:创建失败 - CONFIGURATION:配置中 - STARTJOBING:启动中 - WAITING_FOR_START:等待启动中 - START_JOB_FAILED:启动失败 - PAUSING:已暂停 - FULL_TRANSFER_STARTED:全量开始,灾备场景下为初始化 - FULL_TRANSFER_FAILED:全量失败,灾备场景下为初始化失败 - FULL_TRANSFER_COMPLETE:全量完成,灾备场景下为初始化完成 - INCRE_TRANSFER_STARTED:增量开始,灾备场景下为灾备中 - INCRE_TRANSFER_FAILED:增量失败,灾备场景下为灾备异常 - RELEASE_RESOURCE_STARTED:结束任务中 - RELEASE_RESOURCE_FAILED:结束任务失败 - RELEASE_RESOURCE_COMPLETE:已结束 - REBUILD_NODE_STARTED:故障恢复中 - REBUILD_NODE_FAILED:故障恢复失败 - CHANGE_JOB_STARTED:任务变更中 - CHANGE_JOB_FAILED:任务变更失败 - DELETED:已删除 - CHILD_TRANSFER_STARTING:再编辑子任务启动中 - CHILD_TRANSFER_STARTED:再编辑子任务迁移中 - CHILD_TRANSFER_COMPLETE:再编辑子任务迁移完成 - CHILD_TRANSFER_FAILED:再编辑子任务迁移失败 - RELEASE_CHILD_TRANSFER_STARTED:再编辑子任务结束中 - RELEASE_CHILD_TRANSFER_COMPLETE:再编辑子任务已结束 - NODE_UPGRADE_START:升级开始 - NODE_UPGRADE_COMPLETE:升级完成 - NODE_UPGRADE_FAILED:升级失败
     * @return transferStatus
     */
    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public JobProgressInfo withProcessTime(String processTime) {
        this.processTime = processTime;
        return this;
    }

    /**
     * 迁移时间。
     * @return processTime
     */
    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }

    public JobProgressInfo withRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
        return this;
    }

    /**
     * 预计剩余时间。
     * @return remainingTime
     */
    public String getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
    }

    public JobProgressInfo withProgressMap(Map<String, ProgressCompleteInfo> progressMap) {
        this.progressMap = progressMap;
        return this;
    }

    public JobProgressInfo putProgressMapItem(String key, ProgressCompleteInfo progressMapItem) {
        if (this.progressMap == null) {
            this.progressMap = new HashMap<>();
        }
        this.progressMap.put(key, progressMapItem);
        return this;
    }

    public JobProgressInfo withProgressMap(Consumer<Map<String, ProgressCompleteInfo>> progressMapSetter) {
        if (this.progressMap == null) {
            this.progressMap = new HashMap<>();
        }
        progressMapSetter.accept(this.progressMap);
        return this;
    }

    /**
     * 全量迁移进度详情。
     * @return progressMap
     */
    public Map<String, ProgressCompleteInfo> getProgressMap() {
        return progressMap;
    }

    public void setProgressMap(Map<String, ProgressCompleteInfo> progressMap) {
        this.progressMap = progressMap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobProgressInfo that = (JobProgressInfo) obj;
        return Objects.equals(this.progress, that.progress) && Objects.equals(this.incrTransDelay, that.incrTransDelay)
            && Objects.equals(this.incrTransDelayMillis, that.incrTransDelayMillis)
            && Objects.equals(this.taskMode, that.taskMode) && Objects.equals(this.transferStatus, that.transferStatus)
            && Objects.equals(this.processTime, that.processTime)
            && Objects.equals(this.remainingTime, that.remainingTime)
            && Objects.equals(this.progressMap, that.progressMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress,
            incrTransDelay,
            incrTransDelayMillis,
            taskMode,
            transferStatus,
            processTime,
            remainingTime,
            progressMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobProgressInfo {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    incrTransDelay: ").append(toIndentedString(incrTransDelay)).append("\n");
        sb.append("    incrTransDelayMillis: ").append(toIndentedString(incrTransDelayMillis)).append("\n");
        sb.append("    taskMode: ").append(toIndentedString(taskMode)).append("\n");
        sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
        sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
        sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
        sb.append("    progressMap: ").append(toIndentedString(progressMap)).append("\n");
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
