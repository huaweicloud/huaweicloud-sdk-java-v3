package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowReplayProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Long progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parse_count")

    private Long parseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replay_count")

    private Long replayCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_mode")

    private String taskMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_time")

    private Long processTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_status")

    private String transferStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_time")

    private Long maxTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_time")

    private Long minTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "now_time")

    private Long nowTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_export_time")

    private Long minExportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_export_time")

    private Long maxExportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replay_sql_now_list")

    private List<ReplaySqlNowInfo> replaySqlNowList = null;

    public ShowReplayProgressResponse withProgress(Long progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 回放进度的百分数
     * @return progress
     */
    public Long getProgress() {
        return progress;
    }

    public void setProgress(Long progress) {
        this.progress = progress;
    }

    public ShowReplayProgressResponse withParseCount(Long parseCount) {
        this.parseCount = parseCount;
        return this;
    }

    /**
     * 需要解析的总数
     * @return parseCount
     */
    public Long getParseCount() {
        return parseCount;
    }

    public void setParseCount(Long parseCount) {
        this.parseCount = parseCount;
    }

    public ShowReplayProgressResponse withReplayCount(Long replayCount) {
        this.replayCount = replayCount;
        return this;
    }

    /**
     * 回放的总数
     * @return replayCount
     */
    public Long getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(Long replayCount) {
        this.replayCount = replayCount;
    }

    public ShowReplayProgressResponse withTaskMode(String taskMode) {
        this.taskMode = taskMode;
        return this;
    }

    /**
     * 迁移模式
     * @return taskMode
     */
    public String getTaskMode() {
        return taskMode;
    }

    public void setTaskMode(String taskMode) {
        this.taskMode = taskMode;
    }

    public ShowReplayProgressResponse withProcessTime(Long processTime) {
        this.processTime = processTime;
        return this;
    }

    /**
     * 迁移时间
     * @return processTime
     */
    public Long getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Long processTime) {
        this.processTime = processTime;
    }

    public ShowReplayProgressResponse withTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }

    /**
     * 迁移状态
     * @return transferStatus
     */
    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public ShowReplayProgressResponse withMaxTime(Long maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    /**
     * 回放最大时间
     * @return maxTime
     */
    public Long getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Long maxTime) {
        this.maxTime = maxTime;
    }

    public ShowReplayProgressResponse withMinTime(Long minTime) {
        this.minTime = minTime;
        return this;
    }

    /**
     * 回放最小时间
     * @return minTime
     */
    public Long getMinTime() {
        return minTime;
    }

    public void setMinTime(Long minTime) {
        this.minTime = minTime;
    }

    public ShowReplayProgressResponse withNowTime(Long nowTime) {
        this.nowTime = nowTime;
        return this;
    }

    /**
     * 回放当前时间
     * @return nowTime
     */
    public Long getNowTime() {
        return nowTime;
    }

    public void setNowTime(Long nowTime) {
        this.nowTime = nowTime;
    }

    public ShowReplayProgressResponse withMinExportTime(Long minExportTime) {
        this.minExportTime = minExportTime;
        return this;
    }

    /**
     * 回放报告最小时间
     * @return minExportTime
     */
    public Long getMinExportTime() {
        return minExportTime;
    }

    public void setMinExportTime(Long minExportTime) {
        this.minExportTime = minExportTime;
    }

    public ShowReplayProgressResponse withMaxExportTime(Long maxExportTime) {
        this.maxExportTime = maxExportTime;
        return this;
    }

    /**
     * 回放报告最大时间
     * @return maxExportTime
     */
    public Long getMaxExportTime() {
        return maxExportTime;
    }

    public void setMaxExportTime(Long maxExportTime) {
        this.maxExportTime = maxExportTime;
    }

    public ShowReplayProgressResponse withReplaySqlNowList(List<ReplaySqlNowInfo> replaySqlNowList) {
        this.replaySqlNowList = replaySqlNowList;
        return this;
    }

    public ShowReplayProgressResponse addReplaySqlNowListItem(ReplaySqlNowInfo replaySqlNowListItem) {
        if (this.replaySqlNowList == null) {
            this.replaySqlNowList = new ArrayList<>();
        }
        this.replaySqlNowList.add(replaySqlNowListItem);
        return this;
    }

    public ShowReplayProgressResponse withReplaySqlNowList(Consumer<List<ReplaySqlNowInfo>> replaySqlNowListSetter) {
        if (this.replaySqlNowList == null) {
            this.replaySqlNowList = new ArrayList<>();
        }
        replaySqlNowListSetter.accept(this.replaySqlNowList);
        return this;
    }

    /**
     * 正在回放的sql列表
     * @return replaySqlNowList
     */
    public List<ReplaySqlNowInfo> getReplaySqlNowList() {
        return replaySqlNowList;
    }

    public void setReplaySqlNowList(List<ReplaySqlNowInfo> replaySqlNowList) {
        this.replaySqlNowList = replaySqlNowList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReplayProgressResponse that = (ShowReplayProgressResponse) obj;
        return Objects.equals(this.progress, that.progress) && Objects.equals(this.parseCount, that.parseCount)
            && Objects.equals(this.replayCount, that.replayCount) && Objects.equals(this.taskMode, that.taskMode)
            && Objects.equals(this.processTime, that.processTime)
            && Objects.equals(this.transferStatus, that.transferStatus) && Objects.equals(this.maxTime, that.maxTime)
            && Objects.equals(this.minTime, that.minTime) && Objects.equals(this.nowTime, that.nowTime)
            && Objects.equals(this.minExportTime, that.minExportTime)
            && Objects.equals(this.maxExportTime, that.maxExportTime)
            && Objects.equals(this.replaySqlNowList, that.replaySqlNowList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress,
            parseCount,
            replayCount,
            taskMode,
            processTime,
            transferStatus,
            maxTime,
            minTime,
            nowTime,
            minExportTime,
            maxExportTime,
            replaySqlNowList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplayProgressResponse {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    parseCount: ").append(toIndentedString(parseCount)).append("\n");
        sb.append("    replayCount: ").append(toIndentedString(replayCount)).append("\n");
        sb.append("    taskMode: ").append(toIndentedString(taskMode)).append("\n");
        sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
        sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
        sb.append("    maxTime: ").append(toIndentedString(maxTime)).append("\n");
        sb.append("    minTime: ").append(toIndentedString(minTime)).append("\n");
        sb.append("    nowTime: ").append(toIndentedString(nowTime)).append("\n");
        sb.append("    minExportTime: ").append(toIndentedString(minExportTime)).append("\n");
        sb.append("    maxExportTime: ").append(toIndentedString(maxExportTime)).append("\n");
        sb.append("    replaySqlNowList: ").append(toIndentedString(replaySqlNowList)).append("\n");
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
