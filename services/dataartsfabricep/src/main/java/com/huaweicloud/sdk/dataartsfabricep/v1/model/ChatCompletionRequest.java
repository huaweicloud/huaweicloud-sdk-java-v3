package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 大语言模型LLM的请求体
 */
public class ChatCompletionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<ChatMessage> messages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tokens")

    private Integer maxTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temperature")

    private Double temperature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_p")

    private Double topP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private Boolean stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_penalty")

    private Double frequencyPenalty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "presence_penalty")

    private Double presencePenalty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n")

    private Integer n;

    public ChatCompletionRequest withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 模型名称
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ChatCompletionRequest withMessages(List<ChatMessage> messages) {
        this.messages = messages;
        return this;
    }

    public ChatCompletionRequest addMessagesItem(ChatMessage messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public ChatCompletionRequest withMessages(Consumer<List<ChatMessage>> messagesSetter) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        messagesSetter.accept(this.messages);
        return this;
    }

    /**
     * 消息
     * @return messages
     */
    public List<ChatMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ChatMessage> messages) {
        this.messages = messages;
    }

    public ChatCompletionRequest withMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * 要在聊天完成中生成的最大token数。 输入token和生成token的总长度受模型的上下文长度限制。
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public ChatCompletionRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Temperature是用于调整随机程度的数字。介于0和2之间。较高的值（如0.8）将使输出更随机，而较低的值（如0.2）将使输出更集中和确定性。
     * minimum: 0
     * maximum: 2
     * @return temperature
     */
    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public ChatCompletionRequest withTopP(Double topP) {
        this.topP = topP;
        return this;
    }

    /**
     * 核心采样，用于控制 AI 模型根据累积概率考虑的标记范围。
     * minimum: 0
     * maximum: 1
     * @return topP
     */
    public Double getTopP() {
        return topP;
    }

    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public ChatCompletionRequest withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 是否支持流式返回。如果设置，将发送部分消息增量。token变得可用时，将作为仅数据服务器发送的事件发送。
     * @return stream
     */
    public Boolean getStream() {
        return stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public ChatCompletionRequest withFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }

    /**
     * 数字介于-2.0和2.0之间。 频率惩罚，控制文本中词汇的重复度，避免生成文本中某些词汇或短语出现过于频繁。正值会根据它们在文本中的现有频率惩罚新令牌，从而降低模型逐字重复同一行的可能性。
     * minimum: -2
     * maximum: 2
     * @return frequencyPenalty
     */
    public Double getFrequencyPenalty() {
        return frequencyPenalty;
    }

    public void setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public ChatCompletionRequest withPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }

    /**
     * 数字介于-2.0和2.0之间。存在惩罚，控制文本中话题的重复度，避免在对话或文本中反复讨论相同的主题或观点。正值会根据到目前为止它们是否出现在文本中来惩罚新令牌，从而增加模型谈论新主题的可能性。
     * minimum: -2
     * maximum: 2
     * @return presencePenalty
     */
    public Double getPresencePenalty() {
        return presencePenalty;
    }

    public void setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public ChatCompletionRequest withN(Integer n) {
        this.n = n;
        return this;
    }

    /**
     * 要为每个输入消息生成多少个聊天完成选项。请注意，您将根据所有选项中生成的token数收取费用。将n保持为1，以最小化成本。
     * @return n
     */
    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatCompletionRequest that = (ChatCompletionRequest) obj;
        return Objects.equals(this.model, that.model) && Objects.equals(this.messages, that.messages)
            && Objects.equals(this.maxTokens, that.maxTokens) && Objects.equals(this.temperature, that.temperature)
            && Objects.equals(this.topP, that.topP) && Objects.equals(this.stream, that.stream)
            && Objects.equals(this.frequencyPenalty, that.frequencyPenalty)
            && Objects.equals(this.presencePenalty, that.presencePenalty) && Objects.equals(this.n, that.n);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(model, messages, maxTokens, temperature, topP, stream, frequencyPenalty, presencePenalty, n);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequest {\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
        sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
        sb.append("    n: ").append(toIndentedString(n)).append("\n");
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
