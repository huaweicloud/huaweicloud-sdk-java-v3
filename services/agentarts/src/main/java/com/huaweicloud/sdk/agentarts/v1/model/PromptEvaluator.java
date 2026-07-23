package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 提示词评估器对象，定义基于Prompt的评估逻辑及模型配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class PromptEvaluator {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_list")

    private List<Object> messageList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config")

    private EvaluationOpsModelConfig modelConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_source_type")

    private Integer promptSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_template_key")

    private String promptTemplateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_template_name")

    private String promptTemplateName;

    public PromptEvaluator withMessageList(List<Object> messageList) {
        this.messageList = messageList;
        return this;
    }

    public PromptEvaluator addMessageListItem(Object messageListItem) {
        if (this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        this.messageList.add(messageListItem);
        return this;
    }

    public PromptEvaluator withMessageList(Consumer<List<Object>> messageListSetter) {
        if (this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        messageListSetter.accept(this.messageList);
        return this;
    }

    /**
     * **参数解释：** 消息列表，包含评估过程中的对话记录或消息对象。 
     * @return messageList
     */
    public List<Object> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Object> messageList) {
        this.messageList = messageList;
    }

    public PromptEvaluator withModelConfig(EvaluationOpsModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }

    public PromptEvaluator withModelConfig(Consumer<EvaluationOpsModelConfig> modelConfigSetter) {
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

    public PromptEvaluator withPromptSourceType(Integer promptSourceType) {
        this.promptSourceType = promptSourceType;
        return this;
    }

    /**
     * **参数解释：** 提示词（Prompt）的来源类型。 
     * minimum: 0
     * maximum: 10000
     * @return promptSourceType
     */
    public Integer getPromptSourceType() {
        return promptSourceType;
    }

    public void setPromptSourceType(Integer promptSourceType) {
        this.promptSourceType = promptSourceType;
    }

    public PromptEvaluator withPromptTemplateKey(String promptTemplateKey) {
        this.promptTemplateKey = promptTemplateKey;
        return this;
    }

    /**
     * **参数解释：** 提示词模板的唯一关键字（Key）。 
     * @return promptTemplateKey
     */
    public String getPromptTemplateKey() {
        return promptTemplateKey;
    }

    public void setPromptTemplateKey(String promptTemplateKey) {
        this.promptTemplateKey = promptTemplateKey;
    }

    public PromptEvaluator withPromptTemplateName(String promptTemplateName) {
        this.promptTemplateName = promptTemplateName;
        return this;
    }

    /**
     * **参数解释：** 提示词模板的显示名称。 
     * @return promptTemplateName
     */
    public String getPromptTemplateName() {
        return promptTemplateName;
    }

    public void setPromptTemplateName(String promptTemplateName) {
        this.promptTemplateName = promptTemplateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PromptEvaluator that = (PromptEvaluator) obj;
        return Objects.equals(this.messageList, that.messageList) && Objects.equals(this.modelConfig, that.modelConfig)
            && Objects.equals(this.promptSourceType, that.promptSourceType)
            && Objects.equals(this.promptTemplateKey, that.promptTemplateKey)
            && Objects.equals(this.promptTemplateName, that.promptTemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageList, modelConfig, promptSourceType, promptTemplateKey, promptTemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromptEvaluator {\n");
        sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
        sb.append("    modelConfig: ").append(toIndentedString(modelConfig)).append("\n");
        sb.append("    promptSourceType: ").append(toIndentedString(promptSourceType)).append("\n");
        sb.append("    promptTemplateKey: ").append(toIndentedString(promptTemplateKey)).append("\n");
        sb.append("    promptTemplateName: ").append(toIndentedString(promptTemplateName)).append("\n");
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
