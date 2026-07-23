package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 模型配置定义使用的模型参数。 **取值范围：** 不涉及。 
 */
public class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tokens")

    private Integer maxTokens;

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
    @JsonProperty(value = "top_p")

    private Float topP;

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig withMaxTokens(
        Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * **参数解释：** 最大Token限制模型生成长度。 **取值范围：** 由具体模型能力决定。 
     * minimum: 0
     * maximum: 2147483647
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig withModelId(
        String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * **参数解释：** 模型的唯一标识符。 **取值范围：** 系统预置的模型ID。 
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig withModelName(
        String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：** 模型的显示名称。 **取值范围：** 不涉及。 
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig withTemperature(
        Float temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * **参数解释：** 温度控制生成内容的随机性。 **取值范围：** 不涉及。 
     * minimum: 0
     * maximum: 2147483647
     * @return temperature
     */
    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig withTopP(Float topP) {
        this.topP = topP;
        return this;
    }

    /**
     * **参数解释：** 核采样控制词汇选择范围。 **取值范围：** 不涉及。 
     * minimum: 0
     * maximum: 2147483647
     * @return topP
     */
    public Float getTopP() {
        return topP;
    }

    public void setTopP(Float topP) {
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
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig that =
            (ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig) obj;
        return Objects.equals(this.maxTokens, that.maxTokens) && Objects.equals(this.modelId, that.modelId)
            && Objects.equals(this.modelName, that.modelName) && Objects.equals(this.temperature, that.temperature)
            && Objects.equals(this.topP, that.topP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxTokens, modelId, modelName, temperature, topP);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig {\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
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
