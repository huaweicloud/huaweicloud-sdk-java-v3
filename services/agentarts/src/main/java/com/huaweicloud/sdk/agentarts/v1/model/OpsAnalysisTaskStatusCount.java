package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务状态数据。
 */
public class OpsAnalysisTaskStatusCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "draft")

    private Integer draft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled")

    private Integer scheduled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running")

    private Integer running;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paused")

    private Integer paused;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed")

    private Integer completed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private Integer fail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopping")

    private Integer stopping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Integer stopped;

    public OpsAnalysisTaskStatusCount withDraft(Integer draft) {
        this.draft = draft;
        return this;
    }

    /**
     * **参数解释：** 草稿任务个数。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return draft
     */
    public Integer getDraft() {
        return draft;
    }

    public void setDraft(Integer draft) {
        this.draft = draft;
    }

    public OpsAnalysisTaskStatusCount withScheduled(Integer scheduled) {
        this.scheduled = scheduled;
        return this;
    }

    /**
     * **参数解释：** 待运行的任务个数。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return scheduled
     */
    public Integer getScheduled() {
        return scheduled;
    }

    public void setScheduled(Integer scheduled) {
        this.scheduled = scheduled;
    }

    public OpsAnalysisTaskStatusCount withRunning(Integer running) {
        this.running = running;
        return this;
    }

    /**
     * **参数解释：** 运行中任务个数。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return running
     */
    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public OpsAnalysisTaskStatusCount withPaused(Integer paused) {
        this.paused = paused;
        return this;
    }

    /**
     * **参数解释：** 已暂停任务个数。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return paused
     */
    public Integer getPaused() {
        return paused;
    }

    public void setPaused(Integer paused) {
        this.paused = paused;
    }

    public OpsAnalysisTaskStatusCount withCompleted(Integer completed) {
        this.completed = completed;
        return this;
    }

    /**
     * **参数解释：** 完成的任务个数。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return completed
     */
    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public OpsAnalysisTaskStatusCount withFail(Integer fail) {
        this.fail = fail;
        return this;
    }

    /**
     * **参数解释：** 失败任务个数。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return fail
     */
    public Integer getFail() {
        return fail;
    }

    public void setFail(Integer fail) {
        this.fail = fail;
    }

    public OpsAnalysisTaskStatusCount withStopping(Integer stopping) {
        this.stopping = stopping;
        return this;
    }

    /**
     * **参数解释：** 停止中任务个数。  **取值范围：** 0-1000的整数。
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

    public OpsAnalysisTaskStatusCount withStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    /**
     * **参数解释：** 已停止任务个数。  **取值范围：** 0-1000的整数。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsAnalysisTaskStatusCount that = (OpsAnalysisTaskStatusCount) obj;
        return Objects.equals(this.draft, that.draft) && Objects.equals(this.scheduled, that.scheduled)
            && Objects.equals(this.running, that.running) && Objects.equals(this.paused, that.paused)
            && Objects.equals(this.completed, that.completed) && Objects.equals(this.fail, that.fail)
            && Objects.equals(this.stopping, that.stopping) && Objects.equals(this.stopped, that.stopped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(draft, scheduled, running, paused, completed, fail, stopping, stopped);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsAnalysisTaskStatusCount {\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    scheduled: ").append(toIndentedString(scheduled)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
        sb.append("    stopping: ").append(toIndentedString(stopping)).append("\n");
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
