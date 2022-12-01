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
     * 迁移状态。
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobProgressInfo jobProgressInfo = (JobProgressInfo) o;
        return Objects.equals(this.progress, jobProgressInfo.progress)
            && Objects.equals(this.incrTransDelay, jobProgressInfo.incrTransDelay)
            && Objects.equals(this.incrTransDelayMillis, jobProgressInfo.incrTransDelayMillis)
            && Objects.equals(this.taskMode, jobProgressInfo.taskMode)
            && Objects.equals(this.transferStatus, jobProgressInfo.transferStatus)
            && Objects.equals(this.processTime, jobProgressInfo.processTime)
            && Objects.equals(this.remainingTime, jobProgressInfo.remainingTime)
            && Objects.equals(this.progressMap, jobProgressInfo.progressMap);
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
