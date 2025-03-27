package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting")

    private Integer waiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicate")

    private Integer replicate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncing")

    private Integer syncing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Integer stopped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleting")

    private Integer deleting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cutovering")

    private Integer cutovering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable")

    private Integer unavailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopping")

    private Integer stopping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipping")

    private Integer skipping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished")

    private Integer finished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initialize")

    private Integer initialize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private Integer error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloning")

    private Integer cloning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unconfigured")

    private Integer unconfigured;

    public ShowOverviewResponse withWaiting(Integer waiting) {
        this.waiting = waiting;
        return this;
    }

    /**
     * 等待中
     * minimum: 0
     * maximum: 1000
     * @return waiting
     */
    public Integer getWaiting() {
        return waiting;
    }

    public void setWaiting(Integer waiting) {
        this.waiting = waiting;
    }

    public ShowOverviewResponse withReplicate(Integer replicate) {
        this.replicate = replicate;
        return this;
    }

    /**
     * 复制中
     * minimum: 0
     * maximum: 1000
     * @return replicate
     */
    public Integer getReplicate() {
        return replicate;
    }

    public void setReplicate(Integer replicate) {
        this.replicate = replicate;
    }

    public ShowOverviewResponse withSyncing(Integer syncing) {
        this.syncing = syncing;
        return this;
    }

    /**
     * 同步中
     * minimum: 0
     * maximum: 1000
     * @return syncing
     */
    public Integer getSyncing() {
        return syncing;
    }

    public void setSyncing(Integer syncing) {
        this.syncing = syncing;
    }

    public ShowOverviewResponse withStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    /**
     * 已暂停
     * minimum: 0
     * maximum: 1000
     * @return stopped
     */
    public Integer getStopped() {
        return stopped;
    }

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    public ShowOverviewResponse withDeleting(Integer deleting) {
        this.deleting = deleting;
        return this;
    }

    /**
     * 删除中
     * minimum: 0
     * maximum: 1000
     * @return deleting
     */
    public Integer getDeleting() {
        return deleting;
    }

    public void setDeleting(Integer deleting) {
        this.deleting = deleting;
    }

    public ShowOverviewResponse withCutovering(Integer cutovering) {
        this.cutovering = cutovering;
        return this;
    }

    /**
     * 启动目的端中
     * minimum: 0
     * maximum: 1000
     * @return cutovering
     */
    public Integer getCutovering() {
        return cutovering;
    }

    public void setCutovering(Integer cutovering) {
        this.cutovering = cutovering;
    }

    public ShowOverviewResponse withUnavailable(Integer unavailable) {
        this.unavailable = unavailable;
        return this;
    }

    /**
     * 环境校验不通过
     * minimum: 0
     * maximum: 1000
     * @return unavailable
     */
    public Integer getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(Integer unavailable) {
        this.unavailable = unavailable;
    }

    public ShowOverviewResponse withStopping(Integer stopping) {
        this.stopping = stopping;
        return this;
    }

    /**
     * 暂停中
     * minimum: 0
     * maximum: 1000
     * @return stopping
     */
    public Integer getStopping() {
        return stopping;
    }

    public void setStopping(Integer stopping) {
        this.stopping = stopping;
    }

    public ShowOverviewResponse withSkipping(Integer skipping) {
        this.skipping = skipping;
        return this;
    }

    /**
     * 跳过中
     * minimum: 0
     * maximum: 1000
     * @return skipping
     */
    public Integer getSkipping() {
        return skipping;
    }

    public void setSkipping(Integer skipping) {
        this.skipping = skipping;
    }

    public ShowOverviewResponse withFinished(Integer finished) {
        this.finished = finished;
        return this;
    }

    /**
     * 启动目的端完成
     * minimum: 0
     * maximum: 1000
     * @return finished
     */
    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public ShowOverviewResponse withInitialize(Integer initialize) {
        this.initialize = initialize;
        return this;
    }

    /**
     * 初始化
     * minimum: 0
     * maximum: 1000
     * @return initialize
     */
    public Integer getInitialize() {
        return initialize;
    }

    public void setInitialize(Integer initialize) {
        this.initialize = initialize;
    }

    public ShowOverviewResponse withError(Integer error) {
        this.error = error;
        return this;
    }

    /**
     * 错误
     * minimum: 0
     * maximum: 1000
     * @return error
     */
    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public ShowOverviewResponse withCloning(Integer cloning) {
        this.cloning = cloning;
        return this;
    }

    /**
     * 等待克隆完成
     * minimum: 0
     * maximum: 1000
     * @return cloning
     */
    public Integer getCloning() {
        return cloning;
    }

    public void setCloning(Integer cloning) {
        this.cloning = cloning;
    }

    public ShowOverviewResponse withUnconfigured(Integer unconfigured) {
        this.unconfigured = unconfigured;
        return this;
    }

    /**
     * 未配置目的端
     * minimum: 0
     * maximum: 1000
     * @return unconfigured
     */
    public Integer getUnconfigured() {
        return unconfigured;
    }

    public void setUnconfigured(Integer unconfigured) {
        this.unconfigured = unconfigured;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOverviewResponse that = (ShowOverviewResponse) obj;
        return Objects.equals(this.waiting, that.waiting) && Objects.equals(this.replicate, that.replicate)
            && Objects.equals(this.syncing, that.syncing) && Objects.equals(this.stopped, that.stopped)
            && Objects.equals(this.deleting, that.deleting) && Objects.equals(this.cutovering, that.cutovering)
            && Objects.equals(this.unavailable, that.unavailable) && Objects.equals(this.stopping, that.stopping)
            && Objects.equals(this.skipping, that.skipping) && Objects.equals(this.finished, that.finished)
            && Objects.equals(this.initialize, that.initialize) && Objects.equals(this.error, that.error)
            && Objects.equals(this.cloning, that.cloning) && Objects.equals(this.unconfigured, that.unconfigured);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waiting,
            replicate,
            syncing,
            stopped,
            deleting,
            cutovering,
            unavailable,
            stopping,
            skipping,
            finished,
            initialize,
            error,
            cloning,
            unconfigured);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOverviewResponse {\n");
        sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
        sb.append("    replicate: ").append(toIndentedString(replicate)).append("\n");
        sb.append("    syncing: ").append(toIndentedString(syncing)).append("\n");
        sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
        sb.append("    deleting: ").append(toIndentedString(deleting)).append("\n");
        sb.append("    cutovering: ").append(toIndentedString(cutovering)).append("\n");
        sb.append("    unavailable: ").append(toIndentedString(unavailable)).append("\n");
        sb.append("    stopping: ").append(toIndentedString(stopping)).append("\n");
        sb.append("    skipping: ").append(toIndentedString(skipping)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    initialize: ").append(toIndentedString(initialize)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    cloning: ").append(toIndentedString(cloning)).append("\n");
        sb.append("    unconfigured: ").append(toIndentedString(unconfigured)).append("\n");
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
