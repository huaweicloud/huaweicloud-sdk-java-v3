package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：**   各状态任务数量的统计信息（success/partial_success/running/pending/failed/stopped）。 **约束限制：**   不涉及。 **取值范围：**   不涉及。 
 */
public class ListOpsSynthesisTasksResponseBodyTotalTaskStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Long success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partial_success")

    private Long partialSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running")

    private Long running;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending")

    private Long pending;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private Long failed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Long stopped;

    public ListOpsSynthesisTasksResponseBodyTotalTaskStatus withSuccess(Long success) {
        this.success = success;
        return this;
    }

    /**
     * 成功任务数
     * @return success
     */
    public Long getSuccess() {
        return success;
    }

    public void setSuccess(Long success) {
        this.success = success;
    }

    public ListOpsSynthesisTasksResponseBodyTotalTaskStatus withPartialSuccess(Long partialSuccess) {
        this.partialSuccess = partialSuccess;
        return this;
    }

    /**
     * 部分成功任务数
     * @return partialSuccess
     */
    public Long getPartialSuccess() {
        return partialSuccess;
    }

    public void setPartialSuccess(Long partialSuccess) {
        this.partialSuccess = partialSuccess;
    }

    public ListOpsSynthesisTasksResponseBodyTotalTaskStatus withRunning(Long running) {
        this.running = running;
        return this;
    }

    /**
     * 运行中任务数
     * @return running
     */
    public Long getRunning() {
        return running;
    }

    public void setRunning(Long running) {
        this.running = running;
    }

    public ListOpsSynthesisTasksResponseBodyTotalTaskStatus withPending(Long pending) {
        this.pending = pending;
        return this;
    }

    /**
     * 待执行任务数
     * @return pending
     */
    public Long getPending() {
        return pending;
    }

    public void setPending(Long pending) {
        this.pending = pending;
    }

    public ListOpsSynthesisTasksResponseBodyTotalTaskStatus withFailed(Long failed) {
        this.failed = failed;
        return this;
    }

    /**
     * 失败任务数
     * @return failed
     */
    public Long getFailed() {
        return failed;
    }

    public void setFailed(Long failed) {
        this.failed = failed;
    }

    public ListOpsSynthesisTasksResponseBodyTotalTaskStatus withStopped(Long stopped) {
        this.stopped = stopped;
        return this;
    }

    /**
     * 已停止任务数
     * @return stopped
     */
    public Long getStopped() {
        return stopped;
    }

    public void setStopped(Long stopped) {
        this.stopped = stopped;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsSynthesisTasksResponseBodyTotalTaskStatus that = (ListOpsSynthesisTasksResponseBodyTotalTaskStatus) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.partialSuccess, that.partialSuccess)
            && Objects.equals(this.running, that.running) && Objects.equals(this.pending, that.pending)
            && Objects.equals(this.failed, that.failed) && Objects.equals(this.stopped, that.stopped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, partialSuccess, running, pending, failed, stopped);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsSynthesisTasksResponseBodyTotalTaskStatus {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    partialSuccess: ").append(toIndentedString(partialSuccess)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
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
