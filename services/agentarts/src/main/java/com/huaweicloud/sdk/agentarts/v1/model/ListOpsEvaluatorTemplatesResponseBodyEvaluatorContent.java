package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估器具体实现逻辑，包括输入输出格式、提示词和模型配置。 **取值范围：** 不涉及。 
 */
public class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_schemas")

    private List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas> inputSchemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_schemas")

    private List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas> outputSchemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_evaluator")

    private ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator promptEvaluator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receive_chat_history")

    private Boolean receiveChatHistory;

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent withInputSchemas(
        List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas> inputSchemas) {
        this.inputSchemas = inputSchemas;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent addInputSchemasItem(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas inputSchemasItem) {
        if (this.inputSchemas == null) {
            this.inputSchemas = new ArrayList<>();
        }
        this.inputSchemas.add(inputSchemasItem);
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent withInputSchemas(
        Consumer<List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas>> inputSchemasSetter) {
        if (this.inputSchemas == null) {
            this.inputSchemas = new ArrayList<>();
        }
        inputSchemasSetter.accept(this.inputSchemas);
        return this;
    }

    /**
     * **参数解释：** 输入参数定义评估器接收的数据格式。 **取值范围：** 包含json_schema、key等的对象。 
     * @return inputSchemas
     */
    public List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas> getInputSchemas() {
        return inputSchemas;
    }

    public void setInputSchemas(List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas> inputSchemas) {
        this.inputSchemas = inputSchemas;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent withOutputSchemas(
        List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas> outputSchemas) {
        this.outputSchemas = outputSchemas;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent addOutputSchemasItem(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas outputSchemasItem) {
        if (this.outputSchemas == null) {
            this.outputSchemas = new ArrayList<>();
        }
        this.outputSchemas.add(outputSchemasItem);
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent withOutputSchemas(
        Consumer<List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas>> outputSchemasSetter) {
        if (this.outputSchemas == null) {
            this.outputSchemas = new ArrayList<>();
        }
        outputSchemasSetter.accept(this.outputSchemas);
        return this;
    }

    /**
     * **参数解释：** 输出参数定义。 **取值范围：** 不涉及。 
     * @return outputSchemas
     */
    public List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas> getOutputSchemas() {
        return outputSchemas;
    }

    public void setOutputSchemas(
        List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas> outputSchemas) {
        this.outputSchemas = outputSchemas;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent withPromptEvaluator(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator promptEvaluator) {
        this.promptEvaluator = promptEvaluator;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent withPromptEvaluator(
        Consumer<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator> promptEvaluatorSetter) {
        if (this.promptEvaluator == null) {
            this.promptEvaluator = new ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator();
            promptEvaluatorSetter.accept(this.promptEvaluator);
        }

        return this;
    }

    /**
     * Get promptEvaluator
     * @return promptEvaluator
     */
    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator getPromptEvaluator() {
        return promptEvaluator;
    }

    public void setPromptEvaluator(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator promptEvaluator) {
        this.promptEvaluator = promptEvaluator;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent withReceiveChatHistory(Boolean receiveChatHistory) {
        this.receiveChatHistory = receiveChatHistory;
        return this;
    }

    /**
     * **参数解释：** 是否接收聊天记录上下文。 **取值范围：** true: 接收, false: 不接收。 
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
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent that =
            (ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent) obj;
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
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent {\n");
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
