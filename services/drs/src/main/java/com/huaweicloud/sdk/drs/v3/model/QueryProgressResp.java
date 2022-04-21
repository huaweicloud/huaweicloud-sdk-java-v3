package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取指定任务迁移进度响应体
 */
public class QueryProgressResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_trans_delay")

    private String increTransDelay;

    /**
     * 迁移模式
     */
    public static final class TaskModeEnum {

        /**
         * Enum FULL_TRANS_ for value: "FULL_TRANS: 全量"
         */
        public static final TaskModeEnum FULL_TRANS_ = new TaskModeEnum("FULL_TRANS: 全量");

        /**
         * Enum INCR_TRANS_ for value: "INCR_TRANS: 增量"
         */
        public static final TaskModeEnum INCR_TRANS_ = new TaskModeEnum("INCR_TRANS: 增量");

        /**
         * Enum FULL_INCR_TRANS_ for value: "FULL_INCR_TRANS: 全量+增量"
         */
        public static final TaskModeEnum FULL_INCR_TRANS_ = new TaskModeEnum("FULL_INCR_TRANS: 全量+增量");

        private static final Map<String, TaskModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskModeEnum> createStaticFields() {
            Map<String, TaskModeEnum> map = new HashMap<>();
            map.put("FULL_TRANS: 全量", FULL_TRANS_);
            map.put("INCR_TRANS: 增量", INCR_TRANS_);
            map.put("FULL_INCR_TRANS: 全量+增量", FULL_INCR_TRANS_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TaskModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TaskModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskModeEnum(value);
            }
            return result;
        }

        public static TaskModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TaskModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskModeEnum) {
                return this.value.equals(((TaskModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_mode")

    private TaskModeEnum taskMode;

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

    private Map<String, ProgressInfo> progressMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public QueryProgressResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务Id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryProgressResp withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 迁移百分比
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public QueryProgressResp withIncreTransDelay(String increTransDelay) {
        this.increTransDelay = increTransDelay;
        return this;
    }

    /**
     * 增量迁移时延
     * @return increTransDelay
     */
    public String getIncreTransDelay() {
        return increTransDelay;
    }

    public void setIncreTransDelay(String increTransDelay) {
        this.increTransDelay = increTransDelay;
    }

    public QueryProgressResp withTaskMode(TaskModeEnum taskMode) {
        this.taskMode = taskMode;
        return this;
    }

    /**
     * 迁移模式
     * @return taskMode
     */
    public TaskModeEnum getTaskMode() {
        return taskMode;
    }

    public void setTaskMode(TaskModeEnum taskMode) {
        this.taskMode = taskMode;
    }

    public QueryProgressResp withTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }

    /**
     * 任务状态
     * @return transferStatus
     */
    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public QueryProgressResp withProcessTime(String processTime) {
        this.processTime = processTime;
        return this;
    }

    /**
     * 迁移时间，时间戳
     * @return processTime
     */
    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }

    public QueryProgressResp withRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
        return this;
    }

    /**
     * 预计剩余时间
     * @return remainingTime
     */
    public String getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
    }

    public QueryProgressResp withProgressMap(Map<String, ProgressInfo> progressMap) {
        this.progressMap = progressMap;
        return this;
    }

    public QueryProgressResp putProgressMapItem(String key, ProgressInfo progressMapItem) {
        if (this.progressMap == null) {
            this.progressMap = new HashMap<>();
        }
        this.progressMap.put(key, progressMapItem);
        return this;
    }

    public QueryProgressResp withProgressMap(Consumer<Map<String, ProgressInfo>> progressMapSetter) {
        if (this.progressMap == null) {
            this.progressMap = new HashMap<>();
        }
        progressMapSetter.accept(this.progressMap);
        return this;
    }

    /**
     * 数据，结构，索引迁移进度信息体
     * @return progressMap
     */
    public Map<String, ProgressInfo> getProgressMap() {
        return progressMap;
    }

    public void setProgressMap(Map<String, ProgressInfo> progressMap) {
        this.progressMap = progressMap;
    }

    public QueryProgressResp withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public QueryProgressResp withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryProgressResp queryProgressResp = (QueryProgressResp) o;
        return Objects.equals(this.jobId, queryProgressResp.jobId)
            && Objects.equals(this.progress, queryProgressResp.progress)
            && Objects.equals(this.increTransDelay, queryProgressResp.increTransDelay)
            && Objects.equals(this.taskMode, queryProgressResp.taskMode)
            && Objects.equals(this.transferStatus, queryProgressResp.transferStatus)
            && Objects.equals(this.processTime, queryProgressResp.processTime)
            && Objects.equals(this.remainingTime, queryProgressResp.remainingTime)
            && Objects.equals(this.progressMap, queryProgressResp.progressMap)
            && Objects.equals(this.errorCode, queryProgressResp.errorCode)
            && Objects.equals(this.errorMsg, queryProgressResp.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            progress,
            increTransDelay,
            taskMode,
            transferStatus,
            processTime,
            remainingTime,
            progressMap,
            errorCode,
            errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryProgressResp {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    increTransDelay: ").append(toIndentedString(increTransDelay)).append("\n");
        sb.append("    taskMode: ").append(toIndentedString(taskMode)).append("\n");
        sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
        sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
        sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
        sb.append("    progressMap: ").append(toIndentedString(progressMap)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
