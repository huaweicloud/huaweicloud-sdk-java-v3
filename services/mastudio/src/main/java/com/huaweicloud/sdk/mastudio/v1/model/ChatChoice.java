package com.huaweicloud.sdk.mastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 通用文本响应
 */
public class ChatChoice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private MessageItem message;

    public ChatChoice withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 回复的索引
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public ChatChoice withMessage(MessageItem message) {
        this.message = message;
        return this;
    }

    public ChatChoice withMessage(Consumer<MessageItem> messageSetter) {
        if (this.message == null) {
            this.message = new MessageItem();
            messageSetter.accept(this.message);
        }

        return this;
    }

    /**
     * Get message
     * @return message
     */
    public MessageItem getMessage() {
        return message;
    }

    public void setMessage(MessageItem message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatChoice that = (ChatChoice) obj;
        return Objects.equals(this.index, that.index) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatChoice {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
