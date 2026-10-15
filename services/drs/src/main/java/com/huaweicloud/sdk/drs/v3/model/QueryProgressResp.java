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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_trans_delay_millis")

    private String increTransDelayMillis;

    /**
     * **参数解释**：  任务迁移模式，指定数据复制任务的执行方式。  **约束限制**：  单主灾备场景仅支持选择FULL_INCR_TRANS（全量+增量）。  **取值范围**：  - FULL_TRANS：全量迁移，仅迁移历史数据，迁移完成后任务结束 - INCR_TRANS：增量迁移，仅同步新增数据变更，适用于持续同步场景 - FULL_INCR_TRANS：全量+增量迁移，先迁移历史数据再持续同步增量，适用于平滑切换场景  **默认取值**：  不涉及
     */
    public static final class TaskModeEnum {

        /**
         * Enum FULL_TRANS for value: "FULL_TRANS"
         */
        public static final TaskModeEnum FULL_TRANS = new TaskModeEnum("FULL_TRANS");

        /**
         * Enum FULL_INCR_TRANS for value: "FULL_INCR_TRANS"
         */
        public static final TaskModeEnum FULL_INCR_TRANS = new TaskModeEnum("FULL_INCR_TRANS");

        /**
         * Enum INCR_TRANS for value: "INCR_TRANS"
         */
        public static final TaskModeEnum INCR_TRANS = new TaskModeEnum("INCR_TRANS");

        private static final Map<String, TaskModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskModeEnum> createStaticFields() {
            Map<String, TaskModeEnum> map = new HashMap<>();
            map.put("FULL_TRANS", FULL_TRANS);
            map.put("FULL_INCR_TRANS", FULL_INCR_TRANS);
            map.put("INCR_TRANS", INCR_TRANS);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskModeEnum(value));
        }

        public static TaskModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_rows_rate")

    private Long applyRowsRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_bytes_rate")

    private Long applyBytesRate;

    public QueryProgressResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  迁移任务ID，用于唯一标识一个数据复制任务，在查询、修改、删除等操作中作为任务的识别凭证。  **约束限制**：  不涉及。  **取值范围**：  UUID格式字符串。  **默认取值**：  不涉及
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
     * **参数解释**：  迁移百分比，表示当前任务的数据迁移完成进度。  **约束限制**：  不涉及。  **取值范围**：  0-100。  **默认取值**：  不涉及
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
     * **参数解释**：  增量迁移时延。当任务处于增量阶段时，该值表示源库与目标库之间的数据同步延迟。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return increTransDelay
     */
    public String getIncreTransDelay() {
        return increTransDelay;
    }

    public void setIncreTransDelay(String increTransDelay) {
        this.increTransDelay = increTransDelay;
    }

    public QueryProgressResp withIncreTransDelayMillis(String increTransDelayMillis) {
        this.increTransDelayMillis = increTransDelayMillis;
        return this;
    }

    /**
     * **参数解释**：  增量迁移时延，与incre_trans_delay含义相同，但以毫秒为单位提供更精确的时延信息。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return increTransDelayMillis
     */
    public String getIncreTransDelayMillis() {
        return increTransDelayMillis;
    }

    public void setIncreTransDelayMillis(String increTransDelayMillis) {
        this.increTransDelayMillis = increTransDelayMillis;
    }

    public QueryProgressResp withTaskMode(TaskModeEnum taskMode) {
        this.taskMode = taskMode;
        return this;
    }

    /**
     * **参数解释**：  任务迁移模式，指定数据复制任务的执行方式。  **约束限制**：  单主灾备场景仅支持选择FULL_INCR_TRANS（全量+增量）。  **取值范围**：  - FULL_TRANS：全量迁移，仅迁移历史数据，迁移完成后任务结束 - INCR_TRANS：增量迁移，仅同步新增数据变更，适用于持续同步场景 - FULL_INCR_TRANS：全量+增量迁移，先迁移历史数据再持续同步增量，适用于平滑切换场景  **默认取值**：  不涉及
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
     * **参数解释**：  任务当前传输状态，表示数据迁移任务所处的运行阶段，可用于判断任务是否正常推进。  **约束限制**：  不涉及。  **取值范围**：  - CREATING：创建中 - CREATE_FAILED：创建失败 - CONFIGURATION：配置中 - WAITING_FOR_START：等待启动中 - RELEASE_RESOURCE_COMPLETE：已结束 - DELETED：已删除 - INCRE_TRANSFER_STARTED：增量迁移中 - INCRE_TRANSFER_FAILED：增量迁移失败 - FULL_TRANSFER_STARTED：全量迁移中 - FULL_TRANSFER_COMPLETE：全量迁移完成 - PAUSING：暂停中 - FULL_TRANSFER_FAILED：全量迁移失败  **默认取值**：  不涉及
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
     * **参数解释**：  迁移时间，格式为毫秒级Unix时间戳，表示任务最近一次进度更新时间。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  预计剩余完成时间，单位为秒。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  数据、结构、索引迁移进度信息体，详情请参见ProgressInfo定义。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  错误码，当任务报错时返回的错误代码。  **约束限制**：  不涉及。  **取值范围**：  格式为DRS.XXXXXX。  **默认取值**：  不涉及
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
     * **参数解释**：  错误详细信息，当任务执行失败时返回的具体错误描述。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public QueryProgressResp withApplyRowsRate(Long applyRowsRate) {
        this.applyRowsRate = applyRowsRate;
        return this;
    }

    /**
     * **参数解释**：  增量迁移RPS。  **约束限制**：  值为-1时代表任务尚未进入到增量状态。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return applyRowsRate
     */
    public Long getApplyRowsRate() {
        return applyRowsRate;
    }

    public void setApplyRowsRate(Long applyRowsRate) {
        this.applyRowsRate = applyRowsRate;
    }

    public QueryProgressResp withApplyBytesRate(Long applyBytesRate) {
        this.applyBytesRate = applyBytesRate;
        return this;
    }

    /**
     * **参数解释**：  增量迁移网络流量。  **约束限制**：  值为-1时代表任务尚未进入到增量状态。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return applyBytesRate
     */
    public Long getApplyBytesRate() {
        return applyBytesRate;
    }

    public void setApplyBytesRate(Long applyBytesRate) {
        this.applyBytesRate = applyBytesRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryProgressResp that = (QueryProgressResp) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.increTransDelay, that.increTransDelay)
            && Objects.equals(this.increTransDelayMillis, that.increTransDelayMillis)
            && Objects.equals(this.taskMode, that.taskMode) && Objects.equals(this.transferStatus, that.transferStatus)
            && Objects.equals(this.processTime, that.processTime)
            && Objects.equals(this.remainingTime, that.remainingTime)
            && Objects.equals(this.progressMap, that.progressMap) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.applyRowsRate, that.applyRowsRate)
            && Objects.equals(this.applyBytesRate, that.applyBytesRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            progress,
            increTransDelay,
            increTransDelayMillis,
            taskMode,
            transferStatus,
            processTime,
            remainingTime,
            progressMap,
            errorCode,
            errorMsg,
            applyRowsRate,
            applyBytesRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryProgressResp {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    increTransDelay: ").append(toIndentedString(increTransDelay)).append("\n");
        sb.append("    increTransDelayMillis: ").append(toIndentedString(increTransDelayMillis)).append("\n");
        sb.append("    taskMode: ").append(toIndentedString(taskMode)).append("\n");
        sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
        sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
        sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
        sb.append("    progressMap: ").append(toIndentedString(progressMap)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    applyRowsRate: ").append(toIndentedString(applyRowsRate)).append("\n");
        sb.append("    applyBytesRate: ").append(toIndentedString(applyBytesRate)).append("\n");
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
