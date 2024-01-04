package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListFactoryTaskOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_count")

    private Integer failCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_success_count")

    private Integer forceSuccessCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeze_count")

    private Integer freezeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_success_count")

    private Integer ignoreSuccessCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manual_stop_count")

    private Integer manualStopCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pause_count")

    private Integer pauseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_count")

    private Integer runningCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_exception_count")

    private Integer runningExceptionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_count")

    private Integer skipCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_confirm_count")

    private Integer waitingConfirmCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_count")

    private Integer waitingCount;

    public ListFactoryTaskOverviewResponse withFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }

    /**
     * 失败的实例数量
     * @return failCount
     */
    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public ListFactoryTaskOverviewResponse withForceSuccessCount(Integer forceSuccessCount) {
        this.forceSuccessCount = forceSuccessCount;
        return this;
    }

    /**
     * 强制成功的实例数量
     * @return forceSuccessCount
     */
    public Integer getForceSuccessCount() {
        return forceSuccessCount;
    }

    public void setForceSuccessCount(Integer forceSuccessCount) {
        this.forceSuccessCount = forceSuccessCount;
    }

    public ListFactoryTaskOverviewResponse withFreezeCount(Integer freezeCount) {
        this.freezeCount = freezeCount;
        return this;
    }

    /**
     * 冻结的实例数量
     * @return freezeCount
     */
    public Integer getFreezeCount() {
        return freezeCount;
    }

    public void setFreezeCount(Integer freezeCount) {
        this.freezeCount = freezeCount;
    }

    public ListFactoryTaskOverviewResponse withIgnoreSuccessCount(Integer ignoreSuccessCount) {
        this.ignoreSuccessCount = ignoreSuccessCount;
        return this;
    }

    /**
     * 忽略失败的实例数量
     * @return ignoreSuccessCount
     */
    public Integer getIgnoreSuccessCount() {
        return ignoreSuccessCount;
    }

    public void setIgnoreSuccessCount(Integer ignoreSuccessCount) {
        this.ignoreSuccessCount = ignoreSuccessCount;
    }

    public ListFactoryTaskOverviewResponse withManualStopCount(Integer manualStopCount) {
        this.manualStopCount = manualStopCount;
        return this;
    }

    /**
     * 取消的实例数量
     * @return manualStopCount
     */
    public Integer getManualStopCount() {
        return manualStopCount;
    }

    public void setManualStopCount(Integer manualStopCount) {
        this.manualStopCount = manualStopCount;
    }

    public ListFactoryTaskOverviewResponse withPauseCount(Integer pauseCount) {
        this.pauseCount = pauseCount;
        return this;
    }

    /**
     * 暂时的实例数量
     * @return pauseCount
     */
    public Integer getPauseCount() {
        return pauseCount;
    }

    public void setPauseCount(Integer pauseCount) {
        this.pauseCount = pauseCount;
    }

    public ListFactoryTaskOverviewResponse withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * 运行中的实例数量
     * @return runningCount
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    public ListFactoryTaskOverviewResponse withRunningExceptionCount(Integer runningExceptionCount) {
        this.runningExceptionCount = runningExceptionCount;
        return this;
    }

    /**
     * 异常的实例数量
     * @return runningExceptionCount
     */
    public Integer getRunningExceptionCount() {
        return runningExceptionCount;
    }

    public void setRunningExceptionCount(Integer runningExceptionCount) {
        this.runningExceptionCount = runningExceptionCount;
    }

    public ListFactoryTaskOverviewResponse withSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
        return this;
    }

    /**
     * 跳过的实例数量
     * @return skipCount
     */
    public Integer getSkipCount() {
        return skipCount;
    }

    public void setSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
    }

    public ListFactoryTaskOverviewResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 运行成功的实例数量
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public ListFactoryTaskOverviewResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 实例总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListFactoryTaskOverviewResponse withWaitingConfirmCount(Integer waitingConfirmCount) {
        this.waitingConfirmCount = waitingConfirmCount;
        return this;
    }

    /**
     * 待确认执行的实例数量
     * @return waitingConfirmCount
     */
    public Integer getWaitingConfirmCount() {
        return waitingConfirmCount;
    }

    public void setWaitingConfirmCount(Integer waitingConfirmCount) {
        this.waitingConfirmCount = waitingConfirmCount;
    }

    public ListFactoryTaskOverviewResponse withWaitingCount(Integer waitingCount) {
        this.waitingCount = waitingCount;
        return this;
    }

    /**
     * 等待运行的实例数量
     * @return waitingCount
     */
    public Integer getWaitingCount() {
        return waitingCount;
    }

    public void setWaitingCount(Integer waitingCount) {
        this.waitingCount = waitingCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryTaskOverviewResponse that = (ListFactoryTaskOverviewResponse) obj;
        return Objects.equals(this.failCount, that.failCount)
            && Objects.equals(this.forceSuccessCount, that.forceSuccessCount)
            && Objects.equals(this.freezeCount, that.freezeCount)
            && Objects.equals(this.ignoreSuccessCount, that.ignoreSuccessCount)
            && Objects.equals(this.manualStopCount, that.manualStopCount)
            && Objects.equals(this.pauseCount, that.pauseCount) && Objects.equals(this.runningCount, that.runningCount)
            && Objects.equals(this.runningExceptionCount, that.runningExceptionCount)
            && Objects.equals(this.skipCount, that.skipCount) && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.waitingConfirmCount, that.waitingConfirmCount)
            && Objects.equals(this.waitingCount, that.waitingCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failCount,
            forceSuccessCount,
            freezeCount,
            ignoreSuccessCount,
            manualStopCount,
            pauseCount,
            runningCount,
            runningExceptionCount,
            skipCount,
            successCount,
            totalCount,
            waitingConfirmCount,
            waitingCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryTaskOverviewResponse {\n");
        sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
        sb.append("    forceSuccessCount: ").append(toIndentedString(forceSuccessCount)).append("\n");
        sb.append("    freezeCount: ").append(toIndentedString(freezeCount)).append("\n");
        sb.append("    ignoreSuccessCount: ").append(toIndentedString(ignoreSuccessCount)).append("\n");
        sb.append("    manualStopCount: ").append(toIndentedString(manualStopCount)).append("\n");
        sb.append("    pauseCount: ").append(toIndentedString(pauseCount)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
        sb.append("    runningExceptionCount: ").append(toIndentedString(runningExceptionCount)).append("\n");
        sb.append("    skipCount: ").append(toIndentedString(skipCount)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    waitingConfirmCount: ").append(toIndentedString(waitingConfirmCount)).append("\n");
        sb.append("    waitingCount: ").append(toIndentedString(waitingCount)).append("\n");
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
