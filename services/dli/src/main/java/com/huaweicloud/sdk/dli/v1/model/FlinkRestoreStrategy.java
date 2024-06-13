package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Flink 作业的启动策略。
 */
public class FlinkRestoreStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_type")

    private String restoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_non_restored_state")

    private Boolean allowNonRestoredState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_start_time_in_ms")

    private Integer jobStartTimeInMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "savepoint_id")

    private String savepointId;

    public FlinkRestoreStrategy withRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }

    /**
     * 启动位点类型。 NONE：无状态启动。 LATEST_SAVEPOINT：最新的作业快照启动。 FROM_SAVEPOINT：从指定快照启动。 LATEST_STATE：最新状态启动。
     * @return restoreType
     */
    public String getRestoreType() {
        return restoreType;
    }

    public void setRestoreType(String restoreType) {
        this.restoreType = restoreType;
    }

    public FlinkRestoreStrategy withAllowNonRestoredState(Boolean allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
        return this;
    }

    /**
     * 允许忽略部分算子状态。仅当作业选择有状态恢复时需要设置。
     * @return allowNonRestoredState
     */
    public Boolean getAllowNonRestoredState() {
        return allowNonRestoredState;
    }

    public void setAllowNonRestoredState(Boolean allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
    }

    public FlinkRestoreStrategy withJobStartTimeInMs(Integer jobStartTimeInMs) {
        this.jobStartTimeInMs = jobStartTimeInMs;
        return this;
    }

    /**
     * 无状态启动时间，需输入 13 位时间戳。当选择无状态启动时，可以设置本参数让所有支持 startTime 的源表均从该时刻开始读取数据。
     * @return jobStartTimeInMs
     */
    public Integer getJobStartTimeInMs() {
        return jobStartTimeInMs;
    }

    public void setJobStartTimeInMs(Integer jobStartTimeInMs) {
        this.jobStartTimeInMs = jobStartTimeInMs;
    }

    public FlinkRestoreStrategy withSavepointId(String savepointId) {
        this.savepointId = savepointId;
        return this;
    }

    /**
     * 启动作业快照 ID，启动策略为 FROM_SAVEPOINT 时必填。
     * @return savepointId
     */
    public String getSavepointId() {
        return savepointId;
    }

    public void setSavepointId(String savepointId) {
        this.savepointId = savepointId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkRestoreStrategy that = (FlinkRestoreStrategy) obj;
        return Objects.equals(this.restoreType, that.restoreType)
            && Objects.equals(this.allowNonRestoredState, that.allowNonRestoredState)
            && Objects.equals(this.jobStartTimeInMs, that.jobStartTimeInMs)
            && Objects.equals(this.savepointId, that.savepointId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreType, allowNonRestoredState, jobStartTimeInMs, savepointId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkRestoreStrategy {\n");
        sb.append("    restoreType: ").append(toIndentedString(restoreType)).append("\n");
        sb.append("    allowNonRestoredState: ").append(toIndentedString(allowNonRestoredState)).append("\n");
        sb.append("    jobStartTimeInMs: ").append(toIndentedString(jobStartTimeInMs)).append("\n");
        sb.append("    savepointId: ").append(toIndentedString(savepointId)).append("\n");
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
