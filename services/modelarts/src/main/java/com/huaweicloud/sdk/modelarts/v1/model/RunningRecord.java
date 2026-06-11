package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业运行及故障恢复记录。
 */
public class RunningRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xpu_start_at")

    private Long xpuStartAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_type")

    private String startType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_reason")

    private String endReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_related_task")

    private String endRelatedTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_recover")

    private String endRecover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_recover_before_downgrade")

    private String endRecoverBeforeDowngrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_records")

    private List<RecoverRecord> recoverRecords = null;

    public RunningRecord withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 本次运行开始时间的unix时间戳，单位为秒(s)。
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public RunningRecord withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 本次运行结束时间的unix时间戳，单位为秒(s)。
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public RunningRecord withXpuStartAt(Long xpuStartAt) {
        this.xpuStartAt = xpuStartAt;
        return this;
    }

    /**
     * **参数解释**：本次运行加速卡启动时间的unix时间戳，单位为秒(s)。 **取值范围**：不涉及。
     * @return xpuStartAt
     */
    public Long getXpuStartAt() {
        return xpuStartAt;
    }

    public void setXpuStartAt(Long xpuStartAt) {
        this.xpuStartAt = xpuStartAt;
    }

    public RunningRecord withStartType(String startType) {
        this.startType = startType;
        return this;
    }

    /**
     * 本地运行的启动方式： - init_or_rescheduled：代表本次启动为被调度后的首次运行，包括初次启动及调度恢复后的运行。 - restarted：代表本次启动非被调度后的首次运行，为进程重启后的运行。
     * @return startType
     */
    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType;
    }

    public RunningRecord withEndReason(String endReason) {
        this.endReason = endReason;
        return this;
    }

    /**
     * 本次运行结束原因。
     * @return endReason
     */
    public String getEndReason() {
        return endReason;
    }

    public void setEndReason(String endReason) {
        this.endReason = endReason;
    }

    public RunningRecord withEndRelatedTask(String endRelatedTask) {
        this.endRelatedTask = endRelatedTask;
        return this;
    }

    /**
     * 引发本次运行结束的task worker ID(如worker-0)。
     * @return endRelatedTask
     */
    public String getEndRelatedTask() {
        return endRelatedTask;
    }

    public void setEndRelatedTask(String endRelatedTask) {
        this.endRelatedTask = endRelatedTask;
    }

    public RunningRecord withEndRecover(String endRecover) {
        this.endRecover = endRecover;
        return this;
    }

    /**
     * 本次运行结束后所采取的故障容忍策略，枚举值如下： - npu_proc_restart: NPU原地热恢复 - gpu_proc_restart: GPU原地热恢复 - proc_restart: 进程原地重启 - pod_reschedule: Pod级重调度 - job_reschedule: Job级重调度 - job_reschedule_with_taint: 隔离式Job重调度
     * @return endRecover
     */
    public String getEndRecover() {
        return endRecover;
    }

    public void setEndRecover(String endRecover) {
        this.endRecover = endRecover;
    }

    public RunningRecord withEndRecoverBeforeDowngrade(String endRecoverBeforeDowngrade) {
        this.endRecoverBeforeDowngrade = endRecoverBeforeDowngrade;
        return this;
    }

    /**
     * 本次运行结束后在故障容忍策略降级前所采取的容忍策略，取值范围同end_recover。
     * @return endRecoverBeforeDowngrade
     */
    public String getEndRecoverBeforeDowngrade() {
        return endRecoverBeforeDowngrade;
    }

    public void setEndRecoverBeforeDowngrade(String endRecoverBeforeDowngrade) {
        this.endRecoverBeforeDowngrade = endRecoverBeforeDowngrade;
    }

    public RunningRecord withRecoverRecords(List<RecoverRecord> recoverRecords) {
        this.recoverRecords = recoverRecords;
        return this;
    }

    public RunningRecord addRecoverRecordsItem(RecoverRecord recoverRecordsItem) {
        if (this.recoverRecords == null) {
            this.recoverRecords = new ArrayList<>();
        }
        this.recoverRecords.add(recoverRecordsItem);
        return this;
    }

    public RunningRecord withRecoverRecords(Consumer<List<RecoverRecord>> recoverRecordsSetter) {
        if (this.recoverRecords == null) {
            this.recoverRecords = new ArrayList<>();
        }
        recoverRecordsSetter.accept(this.recoverRecords);
        return this;
    }

    /**
     * **参数解释**：本次运行异常结束时采取的所有故障容忍策略详情。
     * @return recoverRecords
     */
    public List<RecoverRecord> getRecoverRecords() {
        return recoverRecords;
    }

    public void setRecoverRecords(List<RecoverRecord> recoverRecords) {
        this.recoverRecords = recoverRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunningRecord that = (RunningRecord) obj;
        return Objects.equals(this.startAt, that.startAt) && Objects.equals(this.endAt, that.endAt)
            && Objects.equals(this.xpuStartAt, that.xpuStartAt) && Objects.equals(this.startType, that.startType)
            && Objects.equals(this.endReason, that.endReason)
            && Objects.equals(this.endRelatedTask, that.endRelatedTask)
            && Objects.equals(this.endRecover, that.endRecover)
            && Objects.equals(this.endRecoverBeforeDowngrade, that.endRecoverBeforeDowngrade)
            && Objects.equals(this.recoverRecords, that.recoverRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startAt,
            endAt,
            xpuStartAt,
            startType,
            endReason,
            endRelatedTask,
            endRecover,
            endRecoverBeforeDowngrade,
            recoverRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunningRecord {\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    xpuStartAt: ").append(toIndentedString(xpuStartAt)).append("\n");
        sb.append("    startType: ").append(toIndentedString(startType)).append("\n");
        sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
        sb.append("    endRelatedTask: ").append(toIndentedString(endRelatedTask)).append("\n");
        sb.append("    endRecover: ").append(toIndentedString(endRecover)).append("\n");
        sb.append("    endRecoverBeforeDowngrade: ").append(toIndentedString(endRecoverBeforeDowngrade)).append("\n");
        sb.append("    recoverRecords: ").append(toIndentedString(recoverRecords)).append("\n");
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
