package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模型优化任务参数。
 */
public class OpsTuningParamSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actor_optimizer_lr")

    private String actorOptimizerLr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_batch_size")

    private Integer trainBatchSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollout_num")

    private Integer rolloutNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "epoch_num")

    private Integer epochNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ckpt_save_step")

    private Integer ckptSaveStep;

    public OpsTuningParamSetting withActorOptimizerLr(String actorOptimizerLr) {
        this.actorOptimizerLr = actorOptimizerLr;
        return this;
    }

    /**
     * **参数解释：** 优化器学习率，控制模型参数更新的步长。  **约束限制：** 数值过大可能导致训练震荡，过小可能导致收敛缓慢。  **取值范围：** 科学计数法字符串，如1.0E-5。  **默认取值：** 无
     * @return actorOptimizerLr
     */
    public String getActorOptimizerLr() {
        return actorOptimizerLr;
    }

    public void setActorOptimizerLr(String actorOptimizerLr) {
        this.actorOptimizerLr = actorOptimizerLr;
    }

    public OpsTuningParamSetting withTrainBatchSize(Integer trainBatchSize) {
        this.trainBatchSize = trainBatchSize;
        return this;
    }

    /**
     * **参数解释：** 批大小，单次训练迭代中使用的样本数量。  **约束限制：** 不涉及  **取值范围：** 正整数，单位为个样本。  **默认取值：** 无
     * minimum: 1
     * maximum: 10000
     * @return trainBatchSize
     */
    public Integer getTrainBatchSize() {
        return trainBatchSize;
    }

    public void setTrainBatchSize(Integer trainBatchSize) {
        this.trainBatchSize = trainBatchSize;
    }

    public OpsTuningParamSetting withRolloutNum(Integer rolloutNum) {
        this.rolloutNum = rolloutNum;
        return this;
    }

    /**
     * **参数解释：** 分组大小，GRPO算法中每次生成用于对比的样本组数量。  **约束限制：** 不涉及  **取值范围：** 正整数，单位为个分组。  **默认取值：** 无
     * minimum: 1
     * maximum: 10000
     * @return rolloutNum
     */
    public Integer getRolloutNum() {
        return rolloutNum;
    }

    public void setRolloutNum(Integer rolloutNum) {
        this.rolloutNum = rolloutNum;
    }

    public OpsTuningParamSetting withEpochNum(Integer epochNum) {
        this.epochNum = epochNum;
        return this;
    }

    /**
     * **参数解释：** 训练轮数，全量数据集被模型训练的次数。  **约束限制：** 不涉及  **取值范围：** 取值范围：1到1000的正整数，单位为轮。  **默认取值：** 无
     * minimum: 1
     * maximum: 10000
     * @return epochNum
     */
    public Integer getEpochNum() {
        return epochNum;
    }

    public void setEpochNum(Integer epochNum) {
        this.epochNum = epochNum;
    }

    public OpsTuningParamSetting withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * **参数解释：** 最大长度，模型生成序列的最大Token数。  **约束限制：** 不涉及  **取值范围：** 1到100000的正整数，单位为个Token。  **默认取值：** 无
     * minimum: 1
     * maximum: 100000
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public OpsTuningParamSetting withCkptSaveStep(Integer ckptSaveStep) {
        this.ckptSaveStep = ckptSaveStep;
        return this;
    }

    /**
     * **参数解释：** 保存频率，每隔多少个训练步保存一次模型检查点。  **约束限制：** 不涉及  **取值范围：** 1到10000的正整数，单位为步。  **默认取值：** 无
     * minimum: 1
     * maximum: 10000
     * @return ckptSaveStep
     */
    public Integer getCkptSaveStep() {
        return ckptSaveStep;
    }

    public void setCkptSaveStep(Integer ckptSaveStep) {
        this.ckptSaveStep = ckptSaveStep;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTuningParamSetting that = (OpsTuningParamSetting) obj;
        return Objects.equals(this.actorOptimizerLr, that.actorOptimizerLr)
            && Objects.equals(this.trainBatchSize, that.trainBatchSize)
            && Objects.equals(this.rolloutNum, that.rolloutNum) && Objects.equals(this.epochNum, that.epochNum)
            && Objects.equals(this.maxLength, that.maxLength) && Objects.equals(this.ckptSaveStep, that.ckptSaveStep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorOptimizerLr, trainBatchSize, rolloutNum, epochNum, maxLength, ckptSaveStep);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTuningParamSetting {\n");
        sb.append("    actorOptimizerLr: ").append(toIndentedString(actorOptimizerLr)).append("\n");
        sb.append("    trainBatchSize: ").append(toIndentedString(trainBatchSize)).append("\n");
        sb.append("    rolloutNum: ").append(toIndentedString(rolloutNum)).append("\n");
        sb.append("    epochNum: ").append(toIndentedString(epochNum)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    ckptSaveStep: ").append(toIndentedString(ckptSaveStep)).append("\n");
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
