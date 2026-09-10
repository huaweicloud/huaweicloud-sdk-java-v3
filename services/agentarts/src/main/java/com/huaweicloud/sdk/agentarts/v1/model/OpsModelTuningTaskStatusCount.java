package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务状态数据。
 */
public class OpsModelTuningTaskStatusCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "draft")

    private Integer draft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training")

    private Integer training;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopping")

    private Integer stopping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Integer stopped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private Integer fail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleting")

    private Integer deleting;

    public OpsModelTuningTaskStatusCount withDraft(Integer draft) {
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

    public OpsModelTuningTaskStatusCount withTraining(Integer training) {
        this.training = training;
        return this;
    }

    /**
     * **参数解释：** 训练中任务个数。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return training
     */
    public Integer getTraining() {
        return training;
    }

    public void setTraining(Integer training) {
        this.training = training;
    }

    public OpsModelTuningTaskStatusCount withStopping(Integer stopping) {
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

    public OpsModelTuningTaskStatusCount withStopped(Integer stopped) {
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

    public OpsModelTuningTaskStatusCount withSuccess(Integer success) {
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

    public OpsModelTuningTaskStatusCount withFail(Integer fail) {
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

    public OpsModelTuningTaskStatusCount withDeleting(Integer deleting) {
        this.deleting = deleting;
        return this;
    }

    /**
     * **参数解释：** 删除中任务个数。  **取值范围：** 0-1000的整数。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsModelTuningTaskStatusCount that = (OpsModelTuningTaskStatusCount) obj;
        return Objects.equals(this.draft, that.draft) && Objects.equals(this.training, that.training)
            && Objects.equals(this.stopping, that.stopping) && Objects.equals(this.stopped, that.stopped)
            && Objects.equals(this.success, that.success) && Objects.equals(this.fail, that.fail)
            && Objects.equals(this.deleting, that.deleting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(draft, training, stopping, stopped, success, fail, deleting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsModelTuningTaskStatusCount {\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    training: ").append(toIndentedString(training)).append("\n");
        sb.append("    stopping: ").append(toIndentedString(stopping)).append("\n");
        sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
        sb.append("    deleting: ").append(toIndentedString(deleting)).append("\n");
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
