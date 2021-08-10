package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<ShowMessagesRespMessages> messages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages_count")

    private Integer messagesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offsets_count")

    private Integer offsetsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ShowMessagesResponse withMessages(List<ShowMessagesRespMessages> messages) {
        this.messages = messages;
        return this;
    }

    public ShowMessagesResponse addMessagesItem(ShowMessagesRespMessages messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public ShowMessagesResponse withMessages(Consumer<List<ShowMessagesRespMessages>> messagesSetter) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        messagesSetter.accept(this.messages);
        return this;
    }

    /** 消息列表。
     * 
     * @return messages */
    public List<ShowMessagesRespMessages> getMessages() {
        return messages;
    }

    public void setMessages(List<ShowMessagesRespMessages> messages) {
        this.messages = messages;
    }

    public ShowMessagesResponse withMessagesCount(Integer messagesCount) {
        this.messagesCount = messagesCount;
        return this;
    }

    /** 消息总数。
     * 
     * @return messagesCount */
    public Integer getMessagesCount() {
        return messagesCount;
    }

    public void setMessagesCount(Integer messagesCount) {
        this.messagesCount = messagesCount;
    }

    public ShowMessagesResponse withOffsetsCount(Integer offsetsCount) {
        this.offsetsCount = offsetsCount;
        return this;
    }

    /** 总页数。
     * 
     * @return offsetsCount */
    public Integer getOffsetsCount() {
        return offsetsCount;
    }

    public void setOffsetsCount(Integer offsetsCount) {
        this.offsetsCount = offsetsCount;
    }

    public ShowMessagesResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 当前页数。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMessagesResponse showMessagesResponse = (ShowMessagesResponse) o;
        return Objects.equals(this.messages, showMessagesResponse.messages)
            && Objects.equals(this.messagesCount, showMessagesResponse.messagesCount)
            && Objects.equals(this.offsetsCount, showMessagesResponse.offsetsCount)
            && Objects.equals(this.offset, showMessagesResponse.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messages, messagesCount, offsetsCount, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMessagesResponse {\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    messagesCount: ").append(toIndentedString(messagesCount)).append("\n");
        sb.append("    offsetsCount: ").append(toIndentedString(offsetsCount)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
