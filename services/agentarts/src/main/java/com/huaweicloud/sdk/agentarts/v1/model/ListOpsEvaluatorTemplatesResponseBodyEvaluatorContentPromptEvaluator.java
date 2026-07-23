package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 包含评估过程中使用的提示词内容和模型配置。 **取值范围：** 不涉及。 
 */
public class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_list")

    private List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList> messageList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config")

    private ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig modelConfig;

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator withMessageList(
        List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList> messageList) {
        this.messageList = messageList;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator addMessageListItem(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList messageListItem) {
        if (this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        this.messageList.add(messageListItem);
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator withMessageList(
        Consumer<List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList>> messageListSetter) {
        if (this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        messageListSetter.accept(this.messageList);
        return this;
    }

    /**
     * **参数解释：** 提示词信息列表。 **取值范围：** 不涉及。 
     * @return messageList
     */
    public List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList> getMessageList() {
        return messageList;
    }

    public void setMessageList(
        List<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList> messageList) {
        this.messageList = messageList;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator withModelConfig(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator withModelConfig(
        Consumer<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig> modelConfigSetter) {
        if (this.modelConfig == null) {
            this.modelConfig = new ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig();
            modelConfigSetter.accept(this.modelConfig);
        }

        return this;
    }

    /**
     * Get modelConfig
     * @return modelConfig
     */
    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig getModelConfig() {
        return modelConfig;
    }

    public void setModelConfig(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorModelConfig modelConfig) {
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
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator that =
            (ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator) obj;
        return Objects.equals(this.messageList, that.messageList) && Objects.equals(this.modelConfig, that.modelConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageList, modelConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluator {\n");
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
