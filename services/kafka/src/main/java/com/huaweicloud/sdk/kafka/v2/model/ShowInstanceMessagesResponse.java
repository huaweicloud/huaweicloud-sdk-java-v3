package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowInstanceMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<ShowInstanceMessagesRespMessages> messages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    public ShowInstanceMessagesResponse withMessages(List<ShowInstanceMessagesRespMessages> messages) {
        this.messages = messages;
        return this;
    }

    public ShowInstanceMessagesResponse addMessagesItem(ShowInstanceMessagesRespMessages messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public ShowInstanceMessagesResponse withMessages(Consumer<List<ShowInstanceMessagesRespMessages>> messagesSetter) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        messagesSetter.accept(this.messages);
        return this;
    }

    /** 消息列表。
     * 
     * @return messages */
    public List<ShowInstanceMessagesRespMessages> getMessages() {
        return messages;
    }

    public void setMessages(List<ShowInstanceMessagesRespMessages> messages) {
        this.messages = messages;
    }

    public ShowInstanceMessagesResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /** 消息总条数。
     * 
     * @return total */
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

    /** 消息条数。
     * 
     * @return size */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
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
        ShowInstanceMessagesResponse showInstanceMessagesResponse = (ShowInstanceMessagesResponse) o;
        return Objects.equals(this.messages, showInstanceMessagesResponse.messages)
            && Objects.equals(this.total, showInstanceMessagesResponse.total)
            && Objects.equals(this.size, showInstanceMessagesResponse.size);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
