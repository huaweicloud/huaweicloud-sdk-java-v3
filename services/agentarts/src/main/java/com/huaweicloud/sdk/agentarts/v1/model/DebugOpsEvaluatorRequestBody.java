package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 调试评估器的请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class DebugOpsEvaluatorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turn_type")

    private String turnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_config")

    private EvaluationOpsLLMConfig llmConfig;

    public DebugOpsEvaluatorRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 评估器的调试类型。 **约束限制：** 长度为0到100个字符。 **取值范围：** - llm: 基于大语言模型的调试 - code: 基于代码脚本的调试 **默认取值：** 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DebugOpsEvaluatorRequestBody withTurnType(String turnType) {
        this.turnType = turnType;
        return this;
    }

    /**
     * **参数解释：** 评估器的轮次类型。 **约束限制：** 长度为0到100个字符。 **取值范围：** - single: 单轮评估器 - multi: 多轮评估器 **默认取值：** 不涉及。 
     * @return turnType
     */
    public String getTurnType() {
        return turnType;
    }

    public void setTurnType(String turnType) {
        this.turnType = turnType;
    }

    public DebugOpsEvaluatorRequestBody withLlmConfig(EvaluationOpsLLMConfig llmConfig) {
        this.llmConfig = llmConfig;
        return this;
    }

    public DebugOpsEvaluatorRequestBody withLlmConfig(Consumer<EvaluationOpsLLMConfig> llmConfigSetter) {
        if (this.llmConfig == null) {
            this.llmConfig = new EvaluationOpsLLMConfig();
            llmConfigSetter.accept(this.llmConfig);
        }

        return this;
    }

    /**
     * Get llmConfig
     * @return llmConfig
     */
    public EvaluationOpsLLMConfig getLlmConfig() {
        return llmConfig;
    }

    public void setLlmConfig(EvaluationOpsLLMConfig llmConfig) {
        this.llmConfig = llmConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugOpsEvaluatorRequestBody that = (DebugOpsEvaluatorRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.turnType, that.turnType)
            && Objects.equals(this.llmConfig, that.llmConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, turnType, llmConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugOpsEvaluatorRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    turnType: ").append(toIndentedString(turnType)).append("\n");
        sb.append("    llmConfig: ").append(toIndentedString(llmConfig)).append("\n");
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
