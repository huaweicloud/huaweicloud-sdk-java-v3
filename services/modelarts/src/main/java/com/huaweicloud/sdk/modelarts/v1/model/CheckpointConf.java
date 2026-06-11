package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 断点配置信息
 */
public class CheckpointConf {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_id")

    private String checkpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "save_checkpoints_max")

    private Integer saveCheckpointsMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped_steps")

    private Integer skippedSteps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_training")

    private Integer restoreTraining;

    public CheckpointConf withCheckpointId(String checkpointId) {
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

    public CheckpointConf withSaveCheckpointsMax(Integer saveCheckpointsMax) {
        this.saveCheckpointsMax = saveCheckpointsMax;
        return this;
    }

    /**
     * 保存续训任务的步数。 0：关闭不保，-1：自动无限制。
     * minimum: -1
     * maximum: 2147483647
     * @return saveCheckpointsMax
     */
    public Integer getSaveCheckpointsMax() {
        return saveCheckpointsMax;
    }

    public void setSaveCheckpointsMax(Integer saveCheckpointsMax) {
        this.saveCheckpointsMax = saveCheckpointsMax;
    }

    public CheckpointConf withSkippedSteps(Integer skippedSteps) {
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

    public CheckpointConf withRestoreTraining(Integer restoreTraining) {
        this.restoreTraining = restoreTraining;
        return this;
    }

    /**
     * 是否续训任务。  0：非续训,，1:续训。
     * minimum: 0
     * maximum: 2147483647
     * @return restoreTraining
     */
    public Integer getRestoreTraining() {
        return restoreTraining;
    }

    public void setRestoreTraining(Integer restoreTraining) {
        this.restoreTraining = restoreTraining;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckpointConf that = (CheckpointConf) obj;
        return Objects.equals(this.checkpointId, that.checkpointId)
            && Objects.equals(this.saveCheckpointsMax, that.saveCheckpointsMax)
            && Objects.equals(this.skippedSteps, that.skippedSteps)
            && Objects.equals(this.restoreTraining, that.restoreTraining);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpointId, saveCheckpointsMax, skippedSteps, restoreTraining);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointConf {\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
        sb.append("    saveCheckpointsMax: ").append(toIndentedString(saveCheckpointsMax)).append("\n");
        sb.append("    skippedSteps: ").append(toIndentedString(skippedSteps)).append("\n");
        sb.append("    restoreTraining: ").append(toIndentedString(restoreTraining)).append("\n");
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
