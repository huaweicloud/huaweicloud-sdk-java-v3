package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 提示词信息包含评估过程中的提示词内容。 **取值范围：** 不涉及。 
 */
public class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_list")

    private List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList> messageList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config")

    private ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig modelConfig;

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator withMessageList(
        List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList> messageList) {
        this.messageList = messageList;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator addMessageListItem(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList messageListItem) {
        if (this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        this.messageList.add(messageListItem);
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator withMessageList(
        Consumer<List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList>> messageListSetter) {
        if (this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        messageListSetter.accept(this.messageList);
        return this;
    }

    /**
     * **参数解释：** prompt 信息列表包含各种角色提示词。 **取值范围：** 不涉及。 
     * @return messageList
     */
    public List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList> getMessageList() {
        return messageList;
    }

    public void setMessageList(
        List<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList> messageList) {
        this.messageList = messageList;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator withModelConfig(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator withModelConfig(
        Consumer<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig> modelConfigSetter) {
        if (this.modelConfig == null) {
            this.modelConfig =
                new ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig();
            modelConfigSetter.accept(this.modelConfig);
        }

        return this;
    }

    /**
     * Get modelConfig
     * @return modelConfig
     */
    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig getModelConfig() {
        return modelConfig;
    }

    public void setModelConfig(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorModelConfig modelConfig) {
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
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator that =
            (ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator) obj;
        return Objects.equals(this.messageList, that.messageList) && Objects.equals(this.modelConfig, that.modelConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageList, modelConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluator {\n");
        sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
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
