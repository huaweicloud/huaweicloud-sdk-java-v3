package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 模型推理配置。 **取值范围：** 不涉及。 
 */
public class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temperature")

    private Float temperature;

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * **参数解释：** 模型唯一标识。 **取值范围：** 不涉及。 
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig withTemperature(
        Float temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * **参数解释：** 模型采样温度。 **取值范围：** 通常0.0到2.0。 
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig that =
            (ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig) obj;
        return Objects.equals(this.modelId, that.modelId) && Objects.equals(this.temperature, that.temperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelId, temperature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig {\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
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
