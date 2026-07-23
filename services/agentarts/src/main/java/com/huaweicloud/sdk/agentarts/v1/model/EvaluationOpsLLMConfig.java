package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 大语言模型（LLM）的评估配置对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class EvaluationOpsLLMConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_prompt")

    private String systemPrompt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config")

    private EvaluationOpsModelConfig modelConfig;

    public EvaluationOpsLLMConfig withSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }

    /**
     * **参数解释：** 系统提示词（System Prompt），定义模型的角色与规则。 **约束限制：** 0到10000字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return systemPrompt
     */
    public String getSystemPrompt() {
        return systemPrompt;
    }

    public void setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
    }

    public EvaluationOpsLLMConfig withModelConfig(EvaluationOpsModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }

    public EvaluationOpsLLMConfig withModelConfig(Consumer<EvaluationOpsModelConfig> modelConfigSetter) {
        if (this.modelConfig == null) {
            this.modelConfig = new EvaluationOpsModelConfig();
            modelConfigSetter.accept(this.modelConfig);
        }

        return this;
    }

    /**
     * Get modelConfig
     * @return modelConfig
     */
    public EvaluationOpsModelConfig getModelConfig() {
        return modelConfig;
    }

    public void setModelConfig(EvaluationOpsModelConfig modelConfig) {
        this.modelConfig = modelConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsLLMConfig that = (EvaluationOpsLLMConfig) obj;
        return Objects.equals(this.systemPrompt, that.systemPrompt)
            && Objects.equals(this.modelConfig, that.modelConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemPrompt, modelConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsLLMConfig {\n");
        sb.append("    systemPrompt: ").append(toIndentedString(systemPrompt)).append("\n");
        sb.append("    modelConfig: ").append(toIndentedString(modelConfig)).append("\n");
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
