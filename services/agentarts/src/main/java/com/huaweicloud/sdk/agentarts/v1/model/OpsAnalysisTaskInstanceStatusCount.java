package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpsAnalysisTaskInstanceStatusCount
 */
public class OpsAnalysisTaskInstanceStatusCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled")

    private Integer scheduled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running")

    private Integer running;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped")

    private Integer skipped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private Integer fail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Integer stopped;

    public OpsAnalysisTaskInstanceStatusCount withScheduled(Integer scheduled) {
        this.scheduled = scheduled;
        return this;
    }

    /**
     * **参数解释：** 待运行task_instance个数。 **取值范围：** 0-30的整数。
     * minimum: 0
     * maximum: 30
     * @return scheduled
     */
    public Integer getScheduled() {
        return scheduled;
    }

    public void setScheduled(Integer scheduled) {
        this.scheduled = scheduled;
    }

    public OpsAnalysisTaskInstanceStatusCount withRunning(Integer running) {
        this.running = running;
        return this;
    }

    /**
     * **参数解释：** 运行中task_instance个数。 **取值范围：** 0-30的整数。
     * @return running
     */
    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public OpsAnalysisTaskInstanceStatusCount withSkipped(Integer skipped) {
        this.skipped = skipped;
        return this;
    }

    /**
     * **参数解释：** 跳过task_instance个数。 **取值范围：** 0-30的整数。
     * @return skipped
     */
    public Integer getSkipped() {
        return skipped;
    }

    public void setSkipped(Integer skipped) {
        this.skipped = skipped;
    }

    public OpsAnalysisTaskInstanceStatusCount withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释：** 成功完成task_instance个数。 **取值范围：** 0-30的整数。
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public OpsAnalysisTaskInstanceStatusCount withFail(Integer fail) {
        this.fail = fail;
        return this;
    }

    /**
     * **参数解释：** 运行失败task_instance个数。 **取值范围：** 0-30的整数。
     * @return fail
     */
    public Integer getFail() {
        return fail;
    }

    public void setFail(Integer fail) {
        this.fail = fail;
    }

    public OpsAnalysisTaskInstanceStatusCount withStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    /**
     * **参数解释：** 已停止task_instance个数。 **取值范围：** 0-30的整数。
     * @return stopped
     */
    public Integer getStopped() {
        return stopped;
    }

    public void setStopped(Integer stopped) {
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
        OpsAnalysisTaskInstanceStatusCount that = (OpsAnalysisTaskInstanceStatusCount) obj;
        return Objects.equals(this.scheduled, that.scheduled) && Objects.equals(this.running, that.running)
            && Objects.equals(this.skipped, that.skipped) && Objects.equals(this.success, that.success)
            && Objects.equals(this.fail, that.fail) && Objects.equals(this.stopped, that.stopped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduled, running, skipped, success, fail, stopped);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsAnalysisTaskInstanceStatusCount {\n");
        sb.append("    scheduled: ").append(toIndentedString(scheduled)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
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
