package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResetMessagesReq
 */
public class ResetMessagesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partition")
    
    private Integer partition;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_offset")
    
    private BigDecimal messageOffset;

    public ResetMessagesReq withTopic(String topic) {
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

    

    public ResetMessagesReq withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    


    /**
     * 分区。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    

    public ResetMessagesReq withMessageOffset(BigDecimal messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    


    /**
     * 消息偏移量。
     * @return messageOffset
     */
    public BigDecimal getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(BigDecimal messageOffset) {
        this.messageOffset = messageOffset;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetMessagesReq resetMessagesReq = (ResetMessagesReq) o;
        return Objects.equals(this.topic, resetMessagesReq.topic) &&
            Objects.equals(this.partition, resetMessagesReq.partition) &&
            Objects.equals(this.messageOffset, resetMessagesReq.messageOffset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topic, partition, messageOffset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetMessagesReq {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    messageOffset: ").append(toIndentedString(messageOffset)).append("\n");
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

