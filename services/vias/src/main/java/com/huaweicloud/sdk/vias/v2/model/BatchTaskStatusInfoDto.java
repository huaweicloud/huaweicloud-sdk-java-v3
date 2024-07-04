package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchTaskStatusInfoDto
 */
public class BatchTaskStatusInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending")

    private Integer pending;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovering")

    private Integer recovering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starting")

    private Integer starting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrading")

    private Integer upgrading;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_failed")

    private Integer createFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_failed")

    private Integer startFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running")

    private Integer running;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopping")

    private Integer stopping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Integer stopped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal")

    private Integer abnormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeeded")

    private Integer succeeded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private Integer failed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleting")

    private Integer deleting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezing")

    private Integer freezing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen")

    private Integer frozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped_no_service")

    private Integer stoppedNoService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduling")

    private Integer scheduling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lack_of_resources")

    private Integer lackOfResources;

    public BatchTaskStatusInfoDto withPending(Integer pending) {
        this.pending = pending;
        return this;
    }

    /**
     * 等待中作业数量
     * @return pending
     */
    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    public BatchTaskStatusInfoDto withRecovering(Integer recovering) {
        this.recovering = recovering;
        return this;
    }

    /**
     * 恢复中作业数量
     * @return recovering
     */
    public Integer getRecovering() {
        return recovering;
    }

    public void setRecovering(Integer recovering) {
        this.recovering = recovering;
    }

    public BatchTaskStatusInfoDto withStarting(Integer starting) {
        this.starting = starting;
        return this;
    }

    /**
     * 启动中作业数量
     * @return starting
     */
    public Integer getStarting() {
        return starting;
    }

    public void setStarting(Integer starting) {
        this.starting = starting;
    }

    public BatchTaskStatusInfoDto withUpgrading(Integer upgrading) {
        this.upgrading = upgrading;
        return this;
    }

    /**
     * 升级中作业数量
     * @return upgrading
     */
    public Integer getUpgrading() {
        return upgrading;
    }

    public void setUpgrading(Integer upgrading) {
        this.upgrading = upgrading;
    }

    public BatchTaskStatusInfoDto withCreateFailed(Integer createFailed) {
        this.createFailed = createFailed;
        return this;
    }

    /**
     * 创建失败作业数量
     * @return createFailed
     */
    public Integer getCreateFailed() {
        return createFailed;
    }

    public void setCreateFailed(Integer createFailed) {
        this.createFailed = createFailed;
    }

    public BatchTaskStatusInfoDto withStartFailed(Integer startFailed) {
        this.startFailed = startFailed;
        return this;
    }

    /**
     * 启动失败作业数量
     * @return startFailed
     */
    public Integer getStartFailed() {
        return startFailed;
    }

    public void setStartFailed(Integer startFailed) {
        this.startFailed = startFailed;
    }

    public BatchTaskStatusInfoDto withRunning(Integer running) {
        this.running = running;
        return this;
    }

    /**
     * 运行中作业数量
     * @return running
     */
    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public BatchTaskStatusInfoDto withStopping(Integer stopping) {
        this.stopping = stopping;
        return this;
    }

    /**
     * 停止中作业数量
     * @return stopping
     */
    public Integer getStopping() {
        return stopping;
    }

    public void setStopping(Integer stopping) {
        this.stopping = stopping;
    }

    public BatchTaskStatusInfoDto withStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    /**
     * 已停止作业数量
     * @return stopped
     */
    public Integer getStopped() {
        return stopped;
    }

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    public BatchTaskStatusInfoDto withAbnormal(Integer abnormal) {
        this.abnormal = abnormal;
        return this;
    }

    /**
     * 异常作业数量
     * @return abnormal
     */
    public Integer getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(Integer abnormal) {
        this.abnormal = abnormal;
    }

    public BatchTaskStatusInfoDto withSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    /**
     * 运行成功作业数量
     * @return succeeded
     */
    public Integer getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
    }

    public BatchTaskStatusInfoDto withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * 运行失败作业数量
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public BatchTaskStatusInfoDto withDeleting(Integer deleting) {
        this.deleting = deleting;
        return this;
    }

    /**
     * 删除中作业数量
     * @return deleting
     */
    public Integer getDeleting() {
        return deleting;
    }

    public void setDeleting(Integer deleting) {
        this.deleting = deleting;
    }

    public BatchTaskStatusInfoDto withFreezing(Integer freezing) {
        this.freezing = freezing;
        return this;
    }

    /**
     * 冻结中作业数量
     * @return freezing
     */
    public Integer getFreezing() {
        return freezing;
    }

    public void setFreezing(Integer freezing) {
        this.freezing = freezing;
    }

    public BatchTaskStatusInfoDto withFrozen(Integer frozen) {
        this.frozen = frozen;
        return this;
    }

    /**
     * 已冻结作业数量
     * @return frozen
     */
    public Integer getFrozen() {
        return frozen;
    }

    public void setFrozen(Integer frozen) {
        this.frozen = frozen;
    }

    public BatchTaskStatusInfoDto withStoppedNoService(Integer stoppedNoService) {
        this.stoppedNoService = stoppedNoService;
        return this;
    }

    /**
     * 无服务的任务数量
     * @return stoppedNoService
     */
    public Integer getStoppedNoService() {
        return stoppedNoService;
    }

    public void setStoppedNoService(Integer stoppedNoService) {
        this.stoppedNoService = stoppedNoService;
    }

    public BatchTaskStatusInfoDto withScheduling(Integer scheduling) {
        this.scheduling = scheduling;
        return this;
    }

    /**
     * 调度中
     * @return scheduling
     */
    public Integer getScheduling() {
        return scheduling;
    }

    public void setScheduling(Integer scheduling) {
        this.scheduling = scheduling;
    }

    public BatchTaskStatusInfoDto withLackOfResources(Integer lackOfResources) {
        this.lackOfResources = lackOfResources;
        return this;
    }

    /**
     * 资源不足，创建失败
     * @return lackOfResources
     */
    public Integer getLackOfResources() {
        return lackOfResources;
    }

    public void setLackOfResources(Integer lackOfResources) {
        this.lackOfResources = lackOfResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchTaskStatusInfoDto that = (BatchTaskStatusInfoDto) obj;
        return Objects.equals(this.pending, that.pending) && Objects.equals(this.recovering, that.recovering)
            && Objects.equals(this.starting, that.starting) && Objects.equals(this.upgrading, that.upgrading)
            && Objects.equals(this.createFailed, that.createFailed)
            && Objects.equals(this.startFailed, that.startFailed) && Objects.equals(this.running, that.running)
            && Objects.equals(this.stopping, that.stopping) && Objects.equals(this.stopped, that.stopped)
            && Objects.equals(this.abnormal, that.abnormal) && Objects.equals(this.succeeded, that.succeeded)
            && Objects.equals(this.failed, that.failed) && Objects.equals(this.deleting, that.deleting)
            && Objects.equals(this.freezing, that.freezing) && Objects.equals(this.frozen, that.frozen)
            && Objects.equals(this.stoppedNoService, that.stoppedNoService)
            && Objects.equals(this.scheduling, that.scheduling)
            && Objects.equals(this.lackOfResources, that.lackOfResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pending,
            recovering,
            starting,
            upgrading,
            createFailed,
            startFailed,
            running,
            stopping,
            stopped,
            abnormal,
            succeeded,
            failed,
            deleting,
            freezing,
            frozen,
            stoppedNoService,
            scheduling,
            lackOfResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTaskStatusInfoDto {\n");
        sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
        sb.append("    recovering: ").append(toIndentedString(recovering)).append("\n");
        sb.append("    starting: ").append(toIndentedString(starting)).append("\n");
        sb.append("    upgrading: ").append(toIndentedString(upgrading)).append("\n");
        sb.append("    createFailed: ").append(toIndentedString(createFailed)).append("\n");
        sb.append("    startFailed: ").append(toIndentedString(startFailed)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    stopping: ").append(toIndentedString(stopping)).append("\n");
        sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
        sb.append("    abnormal: ").append(toIndentedString(abnormal)).append("\n");
        sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    deleting: ").append(toIndentedString(deleting)).append("\n");
        sb.append("    freezing: ").append(toIndentedString(freezing)).append("\n");
        sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
        sb.append("    stoppedNoService: ").append(toIndentedString(stoppedNoService)).append("\n");
        sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
        sb.append("    lackOfResources: ").append(toIndentedString(lackOfResources)).append("\n");
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
