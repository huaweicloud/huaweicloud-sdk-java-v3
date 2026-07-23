package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：**   数据合成任务的运行明细统计对象。 **取值范围：**   不涉及。 
 */
public class EvaluationOpsSynthesisStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private Integer failed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running")

    private Integer running;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending")

    private Integer pending;

    public EvaluationOpsSynthesisStats withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：**   任务计划生成的总样本条数。 **取值范围：**   0-500。 
     * minimum: 0
     * maximum: 500
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public EvaluationOpsSynthesisStats withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * **参数解释：**   当前任务执行的百分比进度。 **取值范围：**   0-100。 
     * minimum: 0
     * maximum: 100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public EvaluationOpsSynthesisStats withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释：**   当前已成功生成的样本总数。 **取值范围：**   0-500。 
     * minimum: 0
     * maximum: 500
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public EvaluationOpsSynthesisStats withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * **参数解释：**   在合成过程中失败的样本总数。 **取值范围：**   0-500。 
     * minimum: 0
     * maximum: 500
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public EvaluationOpsSynthesisStats withRunning(Integer running) {
        this.running = running;
        return this;
    }

    /**
     * **参数解释：**   当前正处于活跃生成阶段的样本条数。 **取值范围：**   0-500。 
     * minimum: 0
     * maximum: 500
     * @return running
     */
    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public EvaluationOpsSynthesisStats withPending(Integer pending) {
        this.pending = pending;
        return this;
    }

    /**
     * **参数解释：**   尚未开始执行、在队列中等待的样本条数。 **取值范围：**   0-500。 
     * minimum: 0
     * maximum: 500
     * @return pending
     */
    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsSynthesisStats that = (EvaluationOpsSynthesisStats) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.success, that.success) && Objects.equals(this.failed, that.failed)
            && Objects.equals(this.running, that.running) && Objects.equals(this.pending, that.pending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, progress, success, failed, running, pending);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsSynthesisStats {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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
