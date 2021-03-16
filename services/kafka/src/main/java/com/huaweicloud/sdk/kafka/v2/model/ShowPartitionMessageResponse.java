package com.huaweicloud.sdk.kafka.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionMessageRespMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPartitionMessageResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private List<ShowPartitionMessageRespMessage> message = null;
    
    public ShowPartitionMessageResponse withMessage(List<ShowPartitionMessageRespMessage> message) {
        this.message = message;
        return this;
    }

    
    public ShowPartitionMessageResponse addMessageItem(ShowPartitionMessageRespMessage messageItem) {
        this.message.add(messageItem);
        return this;
    }

    public ShowPartitionMessageResponse withMessage(Consumer<List<ShowPartitionMessageRespMessage>> messageSetter) {
        if(this.message == null ){
            this.message = new ArrayList<>();
        }
        messageSetter.accept(this.message);
        return this;
    }

    /**
     * 消息列表。
     * @return message
     */
    public List<ShowPartitionMessageRespMessage> getMessage() {
        return message;
    }

    public void setMessage(List<ShowPartitionMessageRespMessage> message) {
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
        ShowPartitionMessageResponse showPartitionMessageResponse = (ShowPartitionMessageResponse) o;
        return Objects.equals(this.message, showPartitionMessageResponse.message);
    }
    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartitionMessageResponse {\n");
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

