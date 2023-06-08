package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务执行状态统计对象，用于统计任务的整体执行情况。
 */
public class TaskProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processing")

    private Integer processing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private Integer fail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waitting")

    private Integer waitting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_wait_retry")

    private Integer failWaitRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Integer stopped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed")

    private Integer removed;

    public TaskProgress withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 子任务总个数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public TaskProgress withProcessing(Integer processing) {
        this.processing = processing;
        return this;
    }

    /**
     * 正在执行的子任务个数。
     * @return processing
     */
    public Integer getProcessing() {
        return processing;
    }

    public void setProcessing(Integer processing) {
        this.processing = processing;
    }

    public TaskProgress withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * 执行成功的子任务个数。
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public TaskProgress withFail(Integer fail) {
        this.fail = fail;
        return this;
    }

    /**
     * 执行失败的的子任务个数。
     * @return fail
     */
    public Integer getFail() {
        return fail;
    }

    public void setFail(Integer fail) {
        this.fail = fail;
    }

    public TaskProgress withWaitting(Integer waitting) {
        this.waitting = waitting;
        return this;
    }

    /**
     * 等待执行的子任务个数。
     * @return waitting
     */
    public Integer getWaitting() {
        return waitting;
    }

    public void setWaitting(Integer waitting) {
        this.waitting = waitting;
    }

    public TaskProgress withFailWaitRetry(Integer failWaitRetry) {
        this.failWaitRetry = failWaitRetry;
        return this;
    }

    /**
     * 失败等待重试的子任务个数。
     * @return failWaitRetry
     */
    public Integer getFailWaitRetry() {
        return failWaitRetry;
    }

    public void setFailWaitRetry(Integer failWaitRetry) {
        this.failWaitRetry = failWaitRetry;
    }

    public TaskProgress withStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    /**
     * 停止的子任务个数。
     * @return stopped
     */
    public Integer getStopped() {
        return stopped;
    }

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    public TaskProgress withRemoved(Integer removed) {
        this.removed = removed;
        return this;
    }

    /**
     * 移除的子任务个数。
     * @return removed
     */
    public Integer getRemoved() {
        return removed;
    }

    public void setRemoved(Integer removed) {
        this.removed = removed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskProgress taskProgress = (TaskProgress) o;
        return Objects.equals(this.total, taskProgress.total)
            && Objects.equals(this.processing, taskProgress.processing)
            && Objects.equals(this.success, taskProgress.success) && Objects.equals(this.fail, taskProgress.fail)
            && Objects.equals(this.waitting, taskProgress.waitting)
            && Objects.equals(this.failWaitRetry, taskProgress.failWaitRetry)
            && Objects.equals(this.stopped, taskProgress.stopped) && Objects.equals(this.removed, taskProgress.removed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, processing, success, fail, waitting, failWaitRetry, stopped, removed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskProgress {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
        sb.append("    waitting: ").append(toIndentedString(waitting)).append("\n");
        sb.append("    failWaitRetry: ").append(toIndentedString(failWaitRetry)).append("\n");
        sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
        sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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
