package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecoverRecord
 */
public class RecoverRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_start_at")

    private Long recoverStartAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_end_at")

    private Long recoverEndAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover")

    private String recover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault_scenario")

    private String faultScenario;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_task")

    private String relatedTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_result")

    private String recoverResult;

    public RecoverRecord withRecoverStartAt(Long recoverStartAt) {
        this.recoverStartAt = recoverStartAt;
        return this;
    }

    /**
     * **参数描述**：本次故障容忍策略开始执行时间的unix时间戳，单位为秒(s)，同时也是故障发生时间。 **取值范围**：不涉及。
     * @return recoverStartAt
     */
    public Long getRecoverStartAt() {
        return recoverStartAt;
    }

    public void setRecoverStartAt(Long recoverStartAt) {
        this.recoverStartAt = recoverStartAt;
    }

    public RecoverRecord withRecoverEndAt(Long recoverEndAt) {
        this.recoverEndAt = recoverEndAt;
        return this;
    }

    /**
     * **参数描述**：本次故障容忍策略结束时间的unix时间戳，单位为秒(s)。 **取值范围**：不涉及。
     * @return recoverEndAt
     */
    public Long getRecoverEndAt() {
        return recoverEndAt;
    }

    public void setRecoverEndAt(Long recoverEndAt) {
        this.recoverEndAt = recoverEndAt;
    }

    public RecoverRecord withRecover(String recover) {
        this.recover = recover;
        return this;
    }

    /**
     * **参数描述**：本次故障容忍策略。 **取值范围**：枚举值如下： - npu_step_retry: Step重计算 - npu_proc_restart: NPU原地热恢复 - proc_restart: 进程原地重启 - pod_reschedule: Pod级重调度 - job_reschedule: Job级重调度 - job_reschedule_with_taint: 隔离式Job重调度
     * @return recover
     */
    public String getRecover() {
        return recover;
    }

    public void setRecover(String recover) {
        this.recover = recover;
    }

    public RecoverRecord withFaultScenario(String faultScenario) {
        this.faultScenario = faultScenario;
        return this;
    }

    /**
     * **参数描述**：本次故障场景。 **取值范围**：枚举值如下： - chip_fault: 芯片故障 - node_fault: 节点故障 - job_failed: 作业失败退出 - job_hanged: 作业卡死 - job_subhealth: 作业亚健康 - error_in_log: 日志异常
     * @return faultScenario
     */
    public String getFaultScenario() {
        return faultScenario;
    }

    public void setFaultScenario(String faultScenario) {
        this.faultScenario = faultScenario;
    }

    public RecoverRecord withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数描述**：本次故障原因。 **取值范围**：不涉及。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public RecoverRecord withRelatedTask(String relatedTask) {
        this.relatedTask = relatedTask;
        return this;
    }

    /**
     * **参数描述**：引发本次运行结束的task worker ID(如worker-0)。 **取值范围**：不涉及。
     * @return relatedTask
     */
    public String getRelatedTask() {
        return relatedTask;
    }

    public void setRelatedTask(String relatedTask) {
        this.relatedTask = relatedTask;
    }

    public RecoverRecord withRecoverResult(String recoverResult) {
        this.recoverResult = recoverResult;
        return this;
    }

    /**
     * **参数描述**：本次故障执行结果。 **取值范围**：枚举值如下： - recovering: 执行中 - success: 成功 - failed: 失败 - downgrade: 策略降级 - terminated: 策略被终止 - quotaExceeded: 策略执行次数超限制
     * @return recoverResult
     */
    public String getRecoverResult() {
        return recoverResult;
    }

    public void setRecoverResult(String recoverResult) {
        this.recoverResult = recoverResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecoverRecord that = (RecoverRecord) obj;
        return Objects.equals(this.recoverStartAt, that.recoverStartAt)
            && Objects.equals(this.recoverEndAt, that.recoverEndAt) && Objects.equals(this.recover, that.recover)
            && Objects.equals(this.faultScenario, that.faultScenario) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.relatedTask, that.relatedTask)
            && Objects.equals(this.recoverResult, that.recoverResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recoverStartAt, recoverEndAt, recover, faultScenario, reason, relatedTask, recoverResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecoverRecord {\n");
        sb.append("    recoverStartAt: ").append(toIndentedString(recoverStartAt)).append("\n");
        sb.append("    recoverEndAt: ").append(toIndentedString(recoverEndAt)).append("\n");
        sb.append("    recover: ").append(toIndentedString(recover)).append("\n");
        sb.append("    faultScenario: ").append(toIndentedString(faultScenario)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    relatedTask: ").append(toIndentedString(relatedTask)).append("\n");
        sb.append("    recoverResult: ").append(toIndentedString(recoverResult)).append("\n");
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
