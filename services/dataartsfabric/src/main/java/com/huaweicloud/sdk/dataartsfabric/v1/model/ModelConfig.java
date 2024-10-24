package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模型配置
 */
public class ModelConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_model_config")

    private LlmModelConfig llmModelConfig;

    public ModelConfig withLlmModelConfig(LlmModelConfig llmModelConfig) {
        this.llmModelConfig = llmModelConfig;
        return this;
    }

    public ModelConfig withLlmModelConfig(Consumer<LlmModelConfig> llmModelConfigSetter) {
        if (this.llmModelConfig == null) {
            this.llmModelConfig = new LlmModelConfig();
            llmModelConfigSetter.accept(this.llmModelConfig);
        }

        return this;
    }

    /**
     * Get llmModelConfig
     * @return llmModelConfig
     */
    public LlmModelConfig getLlmModelConfig() {
        return llmModelConfig;
    }

    public void setLlmModelConfig(LlmModelConfig llmModelConfig) {
        this.llmModelConfig = llmModelConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelConfig that = (ModelConfig) obj;
        return Objects.equals(this.llmModelConfig, that.llmModelConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(llmModelConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelConfig {\n");
        sb.append("    llmModelConfig: ").append(toIndentedString(llmModelConfig)).append("\n");
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
