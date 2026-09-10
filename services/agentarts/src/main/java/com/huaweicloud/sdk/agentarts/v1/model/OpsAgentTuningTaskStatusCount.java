package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务状态数据。
 */
public class OpsAgentTuningTaskStatusCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "draft")

    private Integer draft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running")

    private Integer running;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Integer stopped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private Integer fail;

    public OpsAgentTuningTaskStatusCount withDraft(Integer draft) {
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

    public OpsAgentTuningTaskStatusCount withRunning(Integer running) {
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

    public OpsAgentTuningTaskStatusCount withStopped(Integer stopped) {
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

    public OpsAgentTuningTaskStatusCount withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释：** 成功任务个数。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public OpsAgentTuningTaskStatusCount withFail(Integer fail) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsAgentTuningTaskStatusCount that = (OpsAgentTuningTaskStatusCount) obj;
        return Objects.equals(this.draft, that.draft) && Objects.equals(this.running, that.running)
            && Objects.equals(this.stopped, that.stopped) && Objects.equals(this.success, that.success)
            && Objects.equals(this.fail, that.fail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(draft, running, stopped, success, fail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsAgentTuningTaskStatusCount {\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
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
