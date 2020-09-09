package com.huaweicloud.sdk.dms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dms.v2.model.ConsumeMessageMessage;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ConsumeMessage
 */
public class ConsumeMessage  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private ConsumeMessageMessage message = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="handler")
    
    private String handler;

    public ConsumeMessage withMessage(ConsumeMessageMessage message) {
        this.message = message;
        return this;
    }

    public ConsumeMessage withMessage(Consumer<ConsumeMessageMessage> messageSetter) {
        if(this.message == null ){
            this.message = new ConsumeMessageMessage();
            messageSetter.accept(this.message);
        }
        
        return this;
    }


    /**
     * Get message
     * @return message
     */
    public ConsumeMessageMessage getMessage() {
        return message;
    }

    public void setMessage(ConsumeMessageMessage message) {
        this.message = message;
    }

    public ConsumeMessage withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    


    /**
     * 消息handler。
     * @return handler
     */
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsumeMessage consumeMessage = (ConsumeMessage) o;
        return Objects.equals(this.message, consumeMessage.message) &&
            Objects.equals(this.handler, consumeMessage.handler);
    }
    @Override
    public int hashCode() {
        return Objects.hash(message, handler);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumeMessage {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
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

