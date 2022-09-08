package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMqsInstanceMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<ShowMqsInstanceMessagesRespMessages> messages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private BigDecimal size;

    public ShowMqsInstanceMessagesResponse withMessages(List<ShowMqsInstanceMessagesRespMessages> messages) {
        this.messages = messages;
        return this;
    }

    public ShowMqsInstanceMessagesResponse addMessagesItem(ShowMqsInstanceMessagesRespMessages messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public ShowMqsInstanceMessagesResponse withMessages(
        Consumer<List<ShowMqsInstanceMessagesRespMessages>> messagesSetter) {
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
    public List<ShowMqsInstanceMessagesRespMessages> getMessages() {
        return messages;
    }

    public void setMessages(List<ShowMqsInstanceMessagesRespMessages> messages) {
        this.messages = messages;
    }

    public ShowMqsInstanceMessagesResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 消息总数。
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ShowMqsInstanceMessagesResponse withSize(BigDecimal size) {
        this.size = size;
        return this;
    }

    /**
     * 返回总条数。
     * @return size
     */
    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMqsInstanceMessagesResponse showMqsInstanceMessagesResponse = (ShowMqsInstanceMessagesResponse) o;
        return Objects.equals(this.messages, showMqsInstanceMessagesResponse.messages)
            && Objects.equals(this.total, showMqsInstanceMessagesResponse.total)
            && Objects.equals(this.size, showMqsInstanceMessagesResponse.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messages, total, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMqsInstanceMessagesResponse {\n");
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
