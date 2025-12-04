package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<MessagesEntity> messages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    public ShowInstanceMessagesResponse withMessages(List<MessagesEntity> messages) {
        this.messages = messages;
        return this;
    }

    public ShowInstanceMessagesResponse addMessagesItem(MessagesEntity messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public ShowInstanceMessagesResponse withMessages(Consumer<List<MessagesEntity>> messagesSetter) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        messagesSetter.accept(this.messages);
        return this;
    }

    /**
     * **参数解释**： 消息列表。
     * @return messages
     */
    public List<MessagesEntity> getMessages() {
        return messages;
    }

    public void setMessages(List<MessagesEntity> messages) {
        this.messages = messages;
    }

    public ShowInstanceMessagesResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 消息总条数。 **取值范围**： 不涉及。
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ShowInstanceMessagesResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**： 每页消息条数。 **取值范围**： 不涉及。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceMessagesResponse that = (ShowInstanceMessagesResponse) obj;
        return Objects.equals(this.messages, that.messages) && Objects.equals(this.total, that.total)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messages, total, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceMessagesResponse {\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
