package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpsTuningStepMetric
 */
public class OpsTuningStepMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reward_value")

    private Double rewardValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eval_reward_value")

    private Double evalRewardValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_consume")

    private Double timeConsume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_length")

    private Double responseLength;

    public OpsTuningStepMetric withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * **参数解释：** 训练迭代步数，单位：step。  **取值范围：** 大于等于0的整数。
     * minimum: 1
     * maximum: 1000
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public OpsTuningStepMetric withRewardValue(Double rewardValue) {
        this.rewardValue = rewardValue;
        return this;
    }

    /**
     * **参数解释：** 在该步数下计算得出的奖励值，反映模型生成结果的质量。  **取值范围：** 浮点数。
     * minimum: 0
     * maximum: 1E+5
     * @return rewardValue
     */
    public Double getRewardValue() {
        return rewardValue;
    }

    public void setRewardValue(Double rewardValue) {
        this.rewardValue = rewardValue;
    }

    public OpsTuningStepMetric withEvalRewardValue(Double evalRewardValue) {
        this.evalRewardValue = evalRewardValue;
        return this;
    }

    /**
     * **参数解释：** 在该步数下计算得出验证集上的奖励值，反映模型生成结果的质量。  **取值范围：** 浮点数。
     * minimum: 0
     * maximum: 1E+5
     * @return evalRewardValue
     */
    public Double getEvalRewardValue() {
        return evalRewardValue;
    }

    public void setEvalRewardValue(Double evalRewardValue) {
        this.evalRewardValue = evalRewardValue;
    }

    public OpsTuningStepMetric withTimeConsume(Double timeConsume) {
        this.timeConsume = timeConsume;
        return this;
    }

    /**
     * **参数解释：** 该步数的耗时时长，单位：秒。  **取值范围**： 大于等于0的浮点数。
     * minimum: 0
     * maximum: 1E+5
     * @return timeConsume
     */
    public Double getTimeConsume() {
        return timeConsume;
    }

    public void setTimeConsume(Double timeConsume) {
        this.timeConsume = timeConsume;
    }

    public OpsTuningStepMetric withResponseLength(Double responseLength) {
        this.responseLength = responseLength;
        return this;
    }

    /**
     * **参数解释：** 模型在该步数生成的平均响应长度，单位：token。  **取值范围：** 大于等于0的浮点数。
     * minimum: 0
     * maximum: 1E+5
     * @return responseLength
     */
    public Double getResponseLength() {
        return responseLength;
    }

    public void setResponseLength(Double responseLength) {
        this.responseLength = responseLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTuningStepMetric that = (OpsTuningStepMetric) obj;
        return Objects.equals(this.step, that.step) && Objects.equals(this.rewardValue, that.rewardValue)
            && Objects.equals(this.evalRewardValue, that.evalRewardValue)
            && Objects.equals(this.timeConsume, that.timeConsume)
            && Objects.equals(this.responseLength, that.responseLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(step, rewardValue, evalRewardValue, timeConsume, responseLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTuningStepMetric {\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    rewardValue: ").append(toIndentedString(rewardValue)).append("\n");
        sb.append("    evalRewardValue: ").append(toIndentedString(evalRewardValue)).append("\n");
        sb.append("    timeConsume: ").append(toIndentedString(timeConsume)).append("\n");
        sb.append("    responseLength: ").append(toIndentedString(responseLength)).append("\n");
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
