package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 用于智能生成评估步骤的大模型配置。  **约束限制：** model_id必填；max_tokens、temperature、top_p未传时使用默认值。  **取值范围：** 仅支持系统已接入的大模型。  **默认取值：** 不涉及。 
 */
public class GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tokens")

    private Integer maxTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temperature")

    private Double temperature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_p")

    private Double topP;

    public GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * **参数解释：** 用于生成评估步骤的大模型标识符。  **约束限制：** 必须是系统支持的模型ID。  **取值范围：** 1到128个字符，支持英文、数字、点号、下划线（_）、中划线（-）和冒号。  **默认取值：** 不涉及。 
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig withMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * **参数解释：** 模型生成的最大token数量，用于控制输出长度。  **约束限制：** 必须为正整数。  **取值范围：** 1到8192。  **默认取值：** 1000。 
     * minimum: 1
     * maximum: 8192
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * **参数解释：** 温度参数，控制模型输出的随机性和创造性。值越低输出越确定，值越高输出越多样。  **约束限制：** 必须在0到1之间。  **取值范围：** 0到1。  **默认取值：** 0.1。 
     * minimum: 0
     * maximum: 1
     * @return temperature
     */
    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig withTopP(Double topP) {
        this.topP = topP;
        return this;
    }

    /**
     * **参数解释：** 核采样参数，控制模型从概率累积分布中采样的范围。  **约束限制：** 必须在0到1之间。  **取值范围：** 0到1。  **默认取值：** 0.3。 
     * minimum: 0
     * maximum: 1
     * @return topP
     */
    public Double getTopP() {
        return topP;
    }

    public void setTopP(Double topP) {
        this.topP = topP;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig that =
            (GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig) obj;
        return Objects.equals(this.modelId, that.modelId) && Objects.equals(this.maxTokens, that.maxTokens)
            && Objects.equals(this.temperature, that.temperature) && Objects.equals(this.topP, that.topP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelId, maxTokens, temperature, topP);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig {\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
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
