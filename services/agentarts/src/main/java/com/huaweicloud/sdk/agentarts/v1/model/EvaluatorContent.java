package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估器内容对象，定义评估器的核心配置及输入Schema。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class EvaluatorContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_evaluator")

    private PromptEvaluator promptEvaluator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_schemas")

    private List<Object> inputSchemas = null;

    public EvaluatorContent withPromptEvaluator(PromptEvaluator promptEvaluator) {
        this.promptEvaluator = promptEvaluator;
        return this;
    }

    public EvaluatorContent withPromptEvaluator(Consumer<PromptEvaluator> promptEvaluatorSetter) {
        if (this.promptEvaluator == null) {
            this.promptEvaluator = new PromptEvaluator();
            promptEvaluatorSetter.accept(this.promptEvaluator);
        }

        return this;
    }

    /**
     * Get promptEvaluator
     * @return promptEvaluator
     */
    public PromptEvaluator getPromptEvaluator() {
        return promptEvaluator;
    }

    public void setPromptEvaluator(PromptEvaluator promptEvaluator) {
        this.promptEvaluator = promptEvaluator;
    }

    public EvaluatorContent withInputSchemas(List<Object> inputSchemas) {
        this.inputSchemas = inputSchemas;
        return this;
    }

    public EvaluatorContent addInputSchemasItem(Object inputSchemasItem) {
        if (this.inputSchemas == null) {
            this.inputSchemas = new ArrayList<>();
        }
        this.inputSchemas.add(inputSchemasItem);
        return this;
    }

    public EvaluatorContent withInputSchemas(Consumer<List<Object>> inputSchemasSetter) {
        if (this.inputSchemas == null) {
            this.inputSchemas = new ArrayList<>();
        }
        inputSchemasSetter.accept(this.inputSchemas);
        return this;
    }

    /**
     * **参数解释：** 评估器输入参数的Schema定义列表。 
     * @return inputSchemas
     */
    public List<Object> getInputSchemas() {
        return inputSchemas;
    }

    public void setInputSchemas(List<Object> inputSchemas) {
        this.inputSchemas = inputSchemas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluatorContent that = (EvaluatorContent) obj;
        return Objects.equals(this.promptEvaluator, that.promptEvaluator)
            && Objects.equals(this.inputSchemas, that.inputSchemas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promptEvaluator, inputSchemas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluatorContent {\n");
        sb.append("    promptEvaluator: ").append(toIndentedString(promptEvaluator)).append("\n");
        sb.append("    inputSchemas: ").append(toIndentedString(inputSchemas)).append("\n");
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
