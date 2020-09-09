package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResetMessageOffsetReq
 */
public class ResetMessageOffsetReq  {



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
    @JsonProperty(value="timestamp")
    
    private Integer timestamp;

    public ResetMessageOffsetReq withTopic(String topic) {
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

    public ResetMessageOffsetReq withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    


    /**
     * 分区编号，默认值为-1，若传入值为-1，则重置所有分区。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public ResetMessageOffsetReq withMessageOffset(Integer messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    


    /**
     * 重置的消费进度到指定偏移量。 如果传入offset小于当前最小的offset，则重置到最小的offset。 如果大于最大的offset，则重置到最大的offset。 message_offset、timestamp二者必选其一。 
     * @return messageOffset
     */
    public Integer getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(Integer messageOffset) {
        this.messageOffset = messageOffset;
    }

    public ResetMessageOffsetReq withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 重置的消费进度到指定时间，格式为unix时间戳。 如果传入timestamp早于当前最早的timestamp，则重置到最早的timestamp。 如果晚于最晚的timestamp，则重置到最晚的timestamp。 message_offset、timestamp二者必选其一。 
     * @return timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetMessageOffsetReq resetMessageOffsetReq = (ResetMessageOffsetReq) o;
        return Objects.equals(this.topic, resetMessageOffsetReq.topic) &&
            Objects.equals(this.partition, resetMessageOffsetReq.partition) &&
            Objects.equals(this.messageOffset, resetMessageOffsetReq.messageOffset) &&
            Objects.equals(this.timestamp, resetMessageOffsetReq.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topic, partition, messageOffset, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetMessageOffsetReq {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    messageOffset: ").append(toIndentedString(messageOffset)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

