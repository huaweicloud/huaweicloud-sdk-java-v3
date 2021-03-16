package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.smn.v2.model.UpdateMessageTemplateRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateMessageTemplateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_template_id")
    
    private String messageTemplateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateMessageTemplateRequestBody body;

    public UpdateMessageTemplateRequest withMessageTemplateId(String messageTemplateId) {
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

    

    public UpdateMessageTemplateRequest withBody(UpdateMessageTemplateRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateMessageTemplateRequest withBody(Consumer<UpdateMessageTemplateRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateMessageTemplateRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateMessageTemplateRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateMessageTemplateRequestBody body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMessageTemplateRequest updateMessageTemplateRequest = (UpdateMessageTemplateRequest) o;
        return Objects.equals(this.messageTemplateId, updateMessageTemplateRequest.messageTemplateId) &&
            Objects.equals(this.body, updateMessageTemplateRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(messageTemplateId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMessageTemplateRequest {\n");
        sb.append("    messageTemplateId: ").append(toIndentedString(messageTemplateId)).append("\n");
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

