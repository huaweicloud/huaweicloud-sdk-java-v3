package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数描述**：不同状态下作业个数。
 */
public class WorkloadStatisticsStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Queue")

    private Integer queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Pending")

    private Integer pending;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Abnormal")

    private Integer abnormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Terminating")

    private Integer terminating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Creating")

    private Integer creating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Running")

    private Integer running;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Completed")

    private Integer completed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Terminated")

    private Integer terminated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Failed")

    private Integer failed;

    public WorkloadStatisticsStatus withQueue(Integer queue) {
        this.queue = queue;
        return this;
    }

    /**
     * **参数描述**： 排队中的作业个数。 **取值范围**： 不涉及。
     * @return queue
     */
    public Integer getQueue() {
        return queue;
    }

    public void setQueue(Integer queue) {
        this.queue = queue;
    }

    public WorkloadStatisticsStatus withPending(Integer pending) {
        this.pending = pending;
        return this;
    }

    /**
     * **参数描述**： 等待中的作业个数。 **取值范围**： 不涉及。
     * @return pending
     */
    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    public WorkloadStatisticsStatus withAbnormal(Integer abnormal) {
        this.abnormal = abnormal;
        return this;
    }

    /**
     * **参数描述**： 异常的作业个数。 **取值范围**： 不涉及。
     * @return abnormal
     */
    public Integer getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(Integer abnormal) {
        this.abnormal = abnormal;
    }

    public WorkloadStatisticsStatus withTerminating(Integer terminating) {
        this.terminating = terminating;
        return this;
    }

    /**
     * **参数描述**： 终止中的作业个数。 **取值范围**： 不涉及。
     * @return terminating
     */
    public Integer getTerminating() {
        return terminating;
    }

    public void setTerminating(Integer terminating) {
        this.terminating = terminating;
    }

    public WorkloadStatisticsStatus withCreating(Integer creating) {
        this.creating = creating;
        return this;
    }

    /**
     * **参数描述**： 创建中的作业个数。 **取值范围**： 不涉及。
     * @return creating
     */
    public Integer getCreating() {
        return creating;
    }

    public void setCreating(Integer creating) {
        this.creating = creating;
    }

    public WorkloadStatisticsStatus withRunning(Integer running) {
        this.running = running;
        return this;
    }

    /**
     * **参数描述**： 运行中的作业个数。 **取值范围**： 不涉及。
     * @return running
     */
    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public WorkloadStatisticsStatus withCompleted(Integer completed) {
        this.completed = completed;
        return this;
    }

    /**
     * **参数描述**： 已完成的作业个数。 **取值范围**： 不涉及。
     * @return completed
     */
    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public WorkloadStatisticsStatus withTerminated(Integer terminated) {
        this.terminated = terminated;
        return this;
    }

    /**
     * **参数描述**： 已终止的作业个数。 **取值范围**： 不涉及。
     * @return terminated
     */
    public Integer getTerminated() {
        return terminated;
    }

    public void setTerminated(Integer terminated) {
        this.terminated = terminated;
    }

    public WorkloadStatisticsStatus withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * **参数描述**：运行失败的作业个数。  **取值范围**： 不涉及。
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadStatisticsStatus that = (WorkloadStatisticsStatus) obj;
        return Objects.equals(this.queue, that.queue) && Objects.equals(this.pending, that.pending)
            && Objects.equals(this.abnormal, that.abnormal) && Objects.equals(this.terminating, that.terminating)
            && Objects.equals(this.creating, that.creating) && Objects.equals(this.running, that.running)
            && Objects.equals(this.completed, that.completed) && Objects.equals(this.terminated, that.terminated)
            && Objects.equals(this.failed, that.failed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queue, pending, abnormal, terminating, creating, running, completed, terminated, failed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadStatisticsStatus {\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
        sb.append("    abnormal: ").append(toIndentedString(abnormal)).append("\n");
        sb.append("    terminating: ").append(toIndentedString(terminating)).append("\n");
        sb.append("    creating: ").append(toIndentedString(creating)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    terminated: ").append(toIndentedString(terminated)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
