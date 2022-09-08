package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SendMessagesReq
 */
public class SendMessagesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_id")

    private Boolean returnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<SendMessageEntity> messages = null;

    public SendMessagesReq withReturnId(Boolean returnId) {
        this.returnId = returnId;
        return this;
    }

    /**
     * 发送消息成功后，是否返回Message ID，默认为false，设置为true时，返回参数才有Message ID。
     * @return returnId
     */
    public Boolean getReturnId() {
        return returnId;
    }

    public void setReturnId(Boolean returnId) {
        this.returnId = returnId;
    }

    public SendMessagesReq withMessages(List<SendMessageEntity> messages) {
        this.messages = messages;
        return this;
    }

    public SendMessagesReq addMessagesItem(SendMessageEntity messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public SendMessagesReq withMessages(Consumer<List<SendMessageEntity>> messagesSetter) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        messagesSetter.accept(this.messages);
        return this;
    }

    /**
     * 消息列表。
     * @return messages
     */
    public List<SendMessageEntity> getMessages() {
        return messages;
    }

    public void setMessages(List<SendMessageEntity> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendMessagesReq sendMessagesReq = (SendMessagesReq) o;
        return Objects.equals(this.returnId, sendMessagesReq.returnId)
            && Objects.equals(this.messages, sendMessagesReq.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnId, messages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendMessagesReq {\n");
        sb.append("    returnId: ").append(toIndentedString(returnId)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
