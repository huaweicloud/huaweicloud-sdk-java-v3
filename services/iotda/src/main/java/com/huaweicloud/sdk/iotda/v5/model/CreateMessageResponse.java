package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateMessageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    @JacksonXmlProperty(localName = "message_id")

    private String messageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private MessageResult result;

    public CreateMessageResponse withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * 消息id，由用户生成（推荐使用UUID），同一个设备下唯一， 如果用户不填写，则由物联网平台生成。
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public CreateMessageResponse withResult(MessageResult result) {
        this.result = result;
        return this;
    }

    public CreateMessageResponse withResult(Consumer<MessageResult> resultSetter) {
        if (this.result == null) {
            this.result = new MessageResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public MessageResult getResult() {
        return result;
    }

    public void setResult(MessageResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMessageResponse createMessageResponse = (CreateMessageResponse) o;
        return Objects.equals(this.messageId, createMessageResponse.messageId)
            && Objects.equals(this.result, createMessageResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageResponse {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
