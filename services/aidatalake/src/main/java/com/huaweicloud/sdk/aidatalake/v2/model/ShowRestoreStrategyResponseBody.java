package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：恢复策略配置，包含恢复类型restore_type的取值及各类型对应的参数。 
 */
public class ShowRestoreStrategyResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_type")

    private FlinkJobRestoreType restoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "savepoint_id")

    private String savepointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_path")

    private String checkpointPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_non_restored_state")

    private Boolean allowNonRestoredState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_start_time_in_ms")

    private Long jobStartTimeInMs;

    public ShowRestoreStrategyResponseBody withRestoreType(FlinkJobRestoreType restoreType) {
        this.restoreType = restoreType;
        return this;
    }

    /**
     * Get restoreType
     * @return restoreType
     */
    public FlinkJobRestoreType getRestoreType() {
        return restoreType;
    }

    public void setRestoreType(FlinkJobRestoreType restoreType) {
        this.restoreType = restoreType;
    }

    public ShowRestoreStrategyResponseBody withSavepointId(String savepointId) {
        this.savepointId = savepointId;
        return this;
    }

    /**
     * **参数解释**：Savepoint的ID，唯一标识一个快照。当restore_type为FROM_SAVEPOINT_ID时返回。 **取值范围**：UUIDv7格式，固定36位，由英文小写字母、数字及中划线组成。 
     * @return savepointId
     */
    public String getSavepointId() {
        return savepointId;
    }

    public void setSavepointId(String savepointId) {
        this.savepointId = savepointId;
    }

    public ShowRestoreStrategyResponseBody withCheckpointPath(String checkpointPath) {
        this.checkpointPath = checkpointPath;
        return this;
    }

    /**
     * **参数解释**：Checkpoint的存储路径，指向_metadata文件的上一级目录。仅当restore_type为FROM_CHECKPOINT_PATH时返回。 **取值范围**：1~512个字符，需以obs://开头。 
     * @return checkpointPath
     */
    public String getCheckpointPath() {
        return checkpointPath;
    }

    public void setCheckpointPath(String checkpointPath) {
        this.checkpointPath = checkpointPath;
    }

    public ShowRestoreStrategyResponseBody withAllowNonRestoredState(Boolean allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
        return this;
    }

    /**
     * **参数解释**：允许忽略部分算子状态。仅当restore_type为FROM_SAVEPOINT_ID或FROM_CHECKPOINT_PATH时返回。 **取值范围**：   - true：允许忽略部分算子状态。设为true时，如果快照中包含当前作业不再使用的算子状态，将跳过这些状态而非报错。   - false：不允许忽略算子状态。 
     * @return allowNonRestoredState
     */
    public Boolean getAllowNonRestoredState() {
        return allowNonRestoredState;
    }

    public void setAllowNonRestoredState(Boolean allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
    }

    public ShowRestoreStrategyResponseBody withJobStartTimeInMs(Long jobStartTimeInMs) {
        this.jobStartTimeInMs = jobStartTimeInMs;
        return this;
    }

    /**
     * **参数解释**：源表的数据消费起始时间戳，用于指定作业启动后从源表的哪个时间点开始消费数据。仅当restore_type为FROM_SPECIFIED_TIMESTAMP时返回，且仅支持Kafka源表。 **取值范围**：0~4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return jobStartTimeInMs
     */
    public Long getJobStartTimeInMs() {
        return jobStartTimeInMs;
    }

    public void setJobStartTimeInMs(Long jobStartTimeInMs) {
        this.jobStartTimeInMs = jobStartTimeInMs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRestoreStrategyResponseBody that = (ShowRestoreStrategyResponseBody) obj;
        return Objects.equals(this.restoreType, that.restoreType) && Objects.equals(this.savepointId, that.savepointId)
            && Objects.equals(this.checkpointPath, that.checkpointPath)
            && Objects.equals(this.allowNonRestoredState, that.allowNonRestoredState)
            && Objects.equals(this.jobStartTimeInMs, that.jobStartTimeInMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreType, savepointId, checkpointPath, allowNonRestoredState, jobStartTimeInMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRestoreStrategyResponseBody {\n");
        sb.append("    restoreType: ").append(toIndentedString(restoreType)).append("\n");
        sb.append("    savepointId: ").append(toIndentedString(savepointId)).append("\n");
        sb.append("    checkpointPath: ").append(toIndentedString(checkpointPath)).append("\n");
        sb.append("    allowNonRestoredState: ").append(toIndentedString(allowNonRestoredState)).append("\n");
        sb.append("    jobStartTimeInMs: ").append(toIndentedString(jobStartTimeInMs)).append("\n");
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
