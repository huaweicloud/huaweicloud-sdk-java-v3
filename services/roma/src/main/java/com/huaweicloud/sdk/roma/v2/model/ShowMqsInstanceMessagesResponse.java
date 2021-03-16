package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.ShowMqsInstanceMessagesRespMessages;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowMqsInstanceMessagesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="messages")
    
    private List<ShowMqsInstanceMessagesRespMessages> messages = null;
    
    public ShowMqsInstanceMessagesResponse withMessages(List<ShowMqsInstanceMessagesRespMessages> messages) {
        this.messages = messages;
        return this;
    }

    
    public ShowMqsInstanceMessagesResponse addMessagesItem(ShowMqsInstanceMessagesRespMessages messagesItem) {
        this.messages.add(messagesItem);
        return this;
    }

    public ShowMqsInstanceMessagesResponse withMessages(Consumer<List<ShowMqsInstanceMessagesRespMessages>> messagesSetter) {
        if(this.messages == null ){
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMqsInstanceMessagesResponse showMqsInstanceMessagesResponse = (ShowMqsInstanceMessagesResponse) o;
        return Objects.equals(this.messages, showMqsInstanceMessagesResponse.messages);
    }
    @Override
    public int hashCode() {
        return Objects.hash(messages);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMqsInstanceMessagesResponse {\n");
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

