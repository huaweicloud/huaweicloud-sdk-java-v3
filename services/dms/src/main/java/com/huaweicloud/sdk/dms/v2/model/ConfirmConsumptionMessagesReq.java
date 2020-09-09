package com.huaweicloud.sdk.dms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dms.v2.model.ConfirmDeadLettersMessagesReqMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ConfirmConsumptionMessagesReq
 */
public class ConfirmConsumptionMessagesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private List<ConfirmDeadLettersMessagesReqMessage> message = null;
    
    public ConfirmConsumptionMessagesReq withMessage(List<ConfirmDeadLettersMessagesReqMessage> message) {
        this.message = message;
        return this;
    }

    
    public ConfirmConsumptionMessagesReq addMessageItem(ConfirmDeadLettersMessagesReqMessage messageItem) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        this.message.add(messageItem);
        return this;
    }

    public ConfirmConsumptionMessagesReq withMessage(Consumer<List<ConfirmDeadLettersMessagesReqMessage>> messageSetter) {
        if(this.message == null ){
            this.message = new ArrayList<>();
        }
        messageSetter.accept(this.message);
        return this;
    }

    /**
     * 确认消息数组。
     * @return message
     */
    public List<ConfirmDeadLettersMessagesReqMessage> getMessage() {
        return message;
    }

    public void setMessage(List<ConfirmDeadLettersMessagesReqMessage> message) {
        this.message = message;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmConsumptionMessagesReq confirmConsumptionMessagesReq = (ConfirmConsumptionMessagesReq) o;
        return Objects.equals(this.message, confirmConsumptionMessagesReq.message);
    }
    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmConsumptionMessagesReq {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

