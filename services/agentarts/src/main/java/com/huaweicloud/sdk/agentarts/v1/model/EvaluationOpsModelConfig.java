package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EvaluationOpsModelConfig
 */
public class EvaluationOpsModelConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temperature")

    private Float temperature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tokens")

    private Integer maxTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_p")

    private Float topP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_penalty")

    private Float frequencyPenalty;

    public EvaluationOpsModelConfig withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * **参数解释：**   指定调用的大模型唯一标识符，通过模型列表接口获取。 
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public EvaluationOpsModelConfig withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：**   模型的显示名称。 **取值范围：**   任意字符串。 
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public EvaluationOpsModelConfig withTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * **参数解释：**   采样温度参数，用于控制输出的随机性。数值低更聚焦，数值高更具创造性。 **取值范围：**   0.0到2.0。 
     * minimum: 0
     * maximum: 2
     * @return temperature
     */
    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public EvaluationOpsModelConfig withMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * **参数解释：**   单次推理生成的最大Token数量限制。 **取值范围：**   1-32000。 
     * minimum: 1
     * maximum: 32000
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public EvaluationOpsModelConfig withTopP(Float topP) {
        this.topP = topP;
        return this;
    }

    /**
     * **参数解释：**   核采样参数。 **取值范围：**   0.0到1.0。 
     * minimum: 0
     * maximum: 1
     * @return topP
     */
    public Float getTopP() {
        return topP;
    }

    public void setTopP(Float topP) {
        this.topP = topP;
    }

    public EvaluationOpsModelConfig withFrequencyPenalty(Float frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }

    /**
     * **参数解释：**   频率惩罚系数，降低内容重复倾向。 **取值范围：**   -2.0到2.0。 
     * minimum: -2
     * maximum: 2
     * @return frequencyPenalty
     */
    public Float getFrequencyPenalty() {
        return frequencyPenalty;
    }

    public void setFrequencyPenalty(Float frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsModelConfig that = (EvaluationOpsModelConfig) obj;
        return Objects.equals(this.modelId, that.modelId) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.temperature, that.temperature) && Objects.equals(this.maxTokens, that.maxTokens)
            && Objects.equals(this.topP, that.topP) && Objects.equals(this.frequencyPenalty, that.frequencyPenalty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelId, modelName, temperature, maxTokens, topP, frequencyPenalty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsModelConfig {\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
        sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
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
