package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChatMessage
 */
public class ChatMessage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reasoning_content")

    private String reasoningContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_calls")

    private List<ToolCall> toolCalls = null;

    public ChatMessage withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**： 对话内容。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ChatMessage withReasoningContent(String reasoningContent) {
        this.reasoningContent = reasoningContent;
        return this;
    }

    /**
     * **参数解释**： 深度搜索思维链内容。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return reasoningContent
     */
    public String getReasoningContent() {
        return reasoningContent;
    }

    public void setReasoningContent(String reasoningContent) {
        this.reasoningContent = reasoningContent;
    }

    public ChatMessage withToolCalls(List<ToolCall> toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }

    public ChatMessage addToolCallsItem(ToolCall toolCallsItem) {
        if (this.toolCalls == null) {
            this.toolCalls = new ArrayList<>();
        }
        this.toolCalls.add(toolCallsItem);
        return this;
    }

    public ChatMessage withToolCalls(Consumer<List<ToolCall>> toolCallsSetter) {
        if (this.toolCalls == null) {
            this.toolCalls = new ArrayList<>();
        }
        toolCallsSetter.accept(this.toolCalls);
        return this;
    }

    /**
     * **参数解释**： 工具调用列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return toolCalls
     */
    public List<ToolCall> getToolCalls() {
        return toolCalls;
    }

    public void setToolCalls(List<ToolCall> toolCalls) {
        this.toolCalls = toolCalls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatMessage that = (ChatMessage) obj;
        return Objects.equals(this.content, that.content)
            && Objects.equals(this.reasoningContent, that.reasoningContent)
            && Objects.equals(this.toolCalls, that.toolCalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, reasoningContent, toolCalls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatMessage {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    reasoningContent: ").append(toIndentedString(reasoningContent)).append("\n");
        sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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
