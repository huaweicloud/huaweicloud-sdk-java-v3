package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估器信息包含具体的实现逻辑，如输入输出规范等。 **取值范围：** 不涉及。 
 */
public class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_schemas")

    private List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas> inputSchemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_schemas")

    private List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentOutputSchemas> outputSchemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_evaluator")

    private ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator promptEvaluator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receive_chat_history")

    private Boolean receiveChatHistory;

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent withInputSchemas(
        List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas> inputSchemas) {
        this.inputSchemas = inputSchemas;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent addInputSchemasItem(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas inputSchemasItem) {
        if (this.inputSchemas == null) {
            this.inputSchemas = new ArrayList<>();
        }
        this.inputSchemas.add(inputSchemasItem);
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent withInputSchemas(
        Consumer<List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas>> inputSchemasSetter) {
        if (this.inputSchemas == null) {
            this.inputSchemas = new ArrayList<>();
        }
        inputSchemasSetter.accept(this.inputSchemas);
        return this;
    }

    /**
     * **参数解释：** 输入参数定义列表。 **取值范围：** 不涉及。 
     * @return inputSchemas
     */
    public List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas> getInputSchemas() {
        return inputSchemas;
    }

    public void setInputSchemas(
        List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas> inputSchemas) {
        this.inputSchemas = inputSchemas;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent withOutputSchemas(
        List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentOutputSchemas> outputSchemas) {
        this.outputSchemas = outputSchemas;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent addOutputSchemasItem(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentOutputSchemas outputSchemasItem) {
        if (this.outputSchemas == null) {
            this.outputSchemas = new ArrayList<>();
        }
        this.outputSchemas.add(outputSchemasItem);
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent withOutputSchemas(
        Consumer<List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentOutputSchemas>> outputSchemasSetter) {
        if (this.outputSchemas == null) {
            this.outputSchemas = new ArrayList<>();
        }
        outputSchemasSetter.accept(this.outputSchemas);
        return this;
    }

    /**
     * **参数解释：** 输出参数定义评估器返回值的格式和结构。 **取值范围：** 不涉及。 
     * @return outputSchemas
     */
    public List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentOutputSchemas> getOutputSchemas() {
        return outputSchemas;
    }

    public void setOutputSchemas(
        List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentOutputSchemas> outputSchemas) {
        this.outputSchemas = outputSchemas;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent withPromptEvaluator(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator promptEvaluator) {
        this.promptEvaluator = promptEvaluator;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent withPromptEvaluator(
        Consumer<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator> promptEvaluatorSetter) {
        if (this.promptEvaluator == null) {
            this.promptEvaluator = new ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator();
            promptEvaluatorSetter.accept(this.promptEvaluator);
        }

        return this;
    }

    /**
     * Get promptEvaluator
     * @return promptEvaluator
     */
    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator getPromptEvaluator() {
        return promptEvaluator;
    }

    public void setPromptEvaluator(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator promptEvaluator) {
        this.promptEvaluator = promptEvaluator;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent withReceiveChatHistory(
        Boolean receiveChatHistory) {
        this.receiveChatHistory = receiveChatHistory;
        return this;
    }

    /**
     * **参数解释：** 标识是否需要接收对话历史。 **取值范围：** true (是), false (否)。 
     * @return receiveChatHistory
     */
    public Boolean getReceiveChatHistory() {
        return receiveChatHistory;
    }

    public void setReceiveChatHistory(Boolean receiveChatHistory) {
        this.receiveChatHistory = receiveChatHistory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent that =
            (ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent) obj;
        return Objects.equals(this.inputSchemas, that.inputSchemas)
            && Objects.equals(this.outputSchemas, that.outputSchemas)
            && Objects.equals(this.promptEvaluator, that.promptEvaluator)
            && Objects.equals(this.receiveChatHistory, that.receiveChatHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputSchemas, outputSchemas, promptEvaluator, receiveChatHistory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent {\n");
        sb.append("    inputSchemas: ").append(toIndentedString(inputSchemas)).append("\n");
        sb.append("    outputSchemas: ").append(toIndentedString(outputSchemas)).append("\n");
        sb.append("    promptEvaluator: ").append(toIndentedString(promptEvaluator)).append("\n");
        sb.append("    receiveChatHistory: ").append(toIndentedString(receiveChatHistory)).append("\n");
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
