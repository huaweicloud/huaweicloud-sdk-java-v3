package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SynthesisTaskStats
 */
public class SynthesisTaskStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_uncommitted")

    private Integer changeUncommitted;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    public SynthesisTaskStats withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 合成数据总条数。 **取值范围：** 0-10000。 
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public SynthesisTaskStats withChangeUncommitted(Integer changeUncommitted) {
        this.changeUncommitted = changeUncommitted;
        return this;
    }

    /**
     * **参数解释：** 标识当前草稿态相对于最新发布版本是否有尚未提交的变更。 **约束限制：** 不涉及。 **取值范围：** 0-10000。 
     * minimum: 0
     * maximum: 10000
     * @return changeUncommitted
     */
    public Integer getChangeUncommitted() {
        return changeUncommitted;
    }

    public void setChangeUncommitted(Integer changeUncommitted) {
        this.changeUncommitted = changeUncommitted;
    }

    public SynthesisTaskStats withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释：** 合成数据success状态总条数。 **取值范围：** 0-10000。 
     * minimum: 0
     * maximum: 10000
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public SynthesisTaskStats withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * **参数解释：** 合成数据failed状态总条数。 **取值范围：** 0-10000。 
     * minimum: 0
     * maximum: 10000
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public SynthesisTaskStats withRunning(Integer running) {
        this.running = running;
        return this;
    }

    /**
     * **参数解释：** 合成数据running状态总条数。 **取值范围：** 0-10000。 
     * minimum: 0
     * maximum: 10000
     * @return running
     */
    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public SynthesisTaskStats withPending(Integer pending) {
        this.pending = pending;
        return this;
    }

    /**
     * **参数解释：** 合成数据pending状态总条数。 **取值范围：** 0-10000。 
     * minimum: 0
     * maximum: 10000
     * @return pending
     */
    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    public SynthesisTaskStats withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * **参数解释：** 任务执行的百分比进度。 **取值范围：** 0%到100%。 
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SynthesisTaskStats that = (SynthesisTaskStats) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.changeUncommitted, that.changeUncommitted)
            && Objects.equals(this.success, that.success) && Objects.equals(this.failed, that.failed)
            && Objects.equals(this.running, that.running) && Objects.equals(this.pending, that.pending)
            && Objects.equals(this.progress, that.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, changeUncommitted, success, failed, running, pending, progress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SynthesisTaskStats {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    changeUncommitted: ").append(toIndentedString(changeUncommitted)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
