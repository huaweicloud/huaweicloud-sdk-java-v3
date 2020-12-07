package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteMessageTemplateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_template_id")
    
    private String messageTemplateId;

    public DeleteMessageTemplateRequest withMessageTemplateId(String messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
        return this;
    }

    


    /**
     * Get messageTemplateId
     * @return messageTemplateId
     */
    public String getMessageTemplateId() {
        return messageTemplateId;
    }

    public void setMessageTemplateId(String messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteMessageTemplateRequest deleteMessageTemplateRequest = (DeleteMessageTemplateRequest) o;
        return Objects.equals(this.messageTemplateId, deleteMessageTemplateRequest.messageTemplateId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(messageTemplateId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMessageTemplateRequest {\n");
        sb.append("    messageTemplateId: ").append(toIndentedString(messageTemplateId)).append("\n");
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

