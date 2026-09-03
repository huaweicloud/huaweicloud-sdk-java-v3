package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 续训任务信息
 */
public class ContinueTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_id")

    private String checkpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_model_id")

    private String sourceModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_model_name")

    private String sourceModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "epoch")

    private Integer epoch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private Integer steps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_best")

    private Boolean isBest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped_steps")

    private Integer skippedSteps;

    public ContinueTask withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    /**
     * 断点ID
     * @return checkpointId
     */
    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public ContinueTask withSourceModelId(String sourceModelId) {
        this.sourceModelId = sourceModelId;
        return this;
    }

    /**
     * 续训任务模型ID
     * @return sourceModelId
     */
    public String getSourceModelId() {
        return sourceModelId;
    }

    public void setSourceModelId(String sourceModelId) {
        this.sourceModelId = sourceModelId;
    }

    public ContinueTask withSourceModelName(String sourceModelName) {
        this.sourceModelName = sourceModelName;
        return this;
    }

    /**
     * 续训任务模型名称
     * @return sourceModelName
     */
    public String getSourceModelName() {
        return sourceModelName;
    }

    public void setSourceModelName(String sourceModelName) {
        this.sourceModelName = sourceModelName;
    }

    public ContinueTask withEpoch(Integer epoch) {
        this.epoch = epoch;
        return this;
    }

    /**
     * 轮数。
     * minimum: 0
     * maximum: 2147483647
     * @return epoch
     */
    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    public ContinueTask withSteps(Integer steps) {
        this.steps = steps;
        return this;
    }

    /**
     * 步数。
     * minimum: 0
     * maximum: 2147483647
     * @return steps
     */
    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public ContinueTask withIsBest(Boolean isBest) {
        this.isBest = isBest;
        return this;
    }

    /**
     * 是否最优
     * @return isBest
     */
    public Boolean getIsBest() {
        return isBest;
    }

    public void setIsBest(Boolean isBest) {
        this.isBest = isBest;
    }

    public ContinueTask withSkippedSteps(Integer skippedSteps) {
        this.skippedSteps = skippedSteps;
        return this;
    }

    /**
     * 跳过步数，0表示不跳过。
     * minimum: 0
     * maximum: 2147483647
     * @return skippedSteps
     */
    public Integer getSkippedSteps() {
        return skippedSteps;
    }

    public void setSkippedSteps(Integer skippedSteps) {
        this.skippedSteps = skippedSteps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContinueTask that = (ContinueTask) obj;
        return Objects.equals(this.checkpointId, that.checkpointId)
            && Objects.equals(this.sourceModelId, that.sourceModelId)
            && Objects.equals(this.sourceModelName, that.sourceModelName) && Objects.equals(this.epoch, that.epoch)
            && Objects.equals(this.steps, that.steps) && Objects.equals(this.isBest, that.isBest)
            && Objects.equals(this.skippedSteps, that.skippedSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpointId, sourceModelId, sourceModelName, epoch, steps, isBest, skippedSteps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContinueTask {\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
        sb.append("    sourceModelId: ").append(toIndentedString(sourceModelId)).append("\n");
        sb.append("    sourceModelName: ").append(toIndentedString(sourceModelName)).append("\n");
        sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    isBest: ").append(toIndentedString(isBest)).append("\n");
        sb.append("    skippedSteps: ").append(toIndentedString(skippedSteps)).append("\n");
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
