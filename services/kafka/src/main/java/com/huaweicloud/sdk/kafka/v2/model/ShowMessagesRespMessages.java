package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowMessagesRespMessages
 */
public class ShowMessagesRespMessages  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partition")
    
    private Integer partition;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_offset")
    
    private Integer messageOffset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public ShowMessagesRespMessages withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    


    /**
     * topic名称。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    

    public ShowMessagesRespMessages withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    


    /**
     * 分区编号。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    

    public ShowMessagesRespMessages withMessageOffset(Integer messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    


    /**
     * 消息编号。
     * @return messageOffset
     */
    public Integer getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(Integer messageOffset) {
        this.messageOffset = messageOffset;
    }

    

    public ShowMessagesRespMessages withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 消息大小，单位字节。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
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
        ShowMessagesRespMessages showMessagesRespMessages = (ShowMessagesRespMessages) o;
        return Objects.equals(this.topic, showMessagesRespMessages.topic) &&
            Objects.equals(this.partition, showMessagesRespMessages.partition) &&
            Objects.equals(this.messageOffset, showMessagesRespMessages.messageOffset) &&
            Objects.equals(this.size, showMessagesRespMessages.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topic, partition, messageOffset, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMessagesRespMessages {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    messageOffset: ").append(toIndentedString(messageOffset)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

