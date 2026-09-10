package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class PublishChatRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_id")

    private String chatId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PublishChatReq body;

    public PublishChatRequest withChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * **参数解释**： 对话ID。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return chatId
     */
    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public PublishChatRequest withBody(PublishChatReq body) {
        this.body = body;
        return this;
    }

    public PublishChatRequest withBody(Consumer<PublishChatReq> bodySetter) {
        if (this.body == null) {
            this.body = new PublishChatReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PublishChatReq getBody() {
        return body;
    }

    public void setBody(PublishChatReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublishChatRequest that = (PublishChatRequest) obj;
        return Objects.equals(this.chatId, that.chatId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishChatRequest {\n");
        sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
