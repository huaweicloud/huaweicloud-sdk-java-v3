package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 消息体。
 */
public class ShowPartitionMessageRespMessage  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;

    public ShowPartitionMessageRespMessage withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 消息的key。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public ShowPartitionMessageRespMessage withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 消息内容。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    public ShowPartitionMessageRespMessage withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    


    /**
     * Topic名称。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    

    public ShowPartitionMessageRespMessage withPartition(Integer partition) {
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

    

    public ShowPartitionMessageRespMessage withMessageOffset(Integer messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    


    /**
     * 消息位置。
     * @return messageOffset
     */
    public Integer getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(Integer messageOffset) {
        this.messageOffset = messageOffset;
    }

    

    public ShowPartitionMessageRespMessage withSize(Integer size) {
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

    

    public ShowPartitionMessageRespMessage withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 消息时间戳。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
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
        ShowPartitionMessageRespMessage showPartitionMessageRespMessage = (ShowPartitionMessageRespMessage) o;
        return Objects.equals(this.key, showPartitionMessageRespMessage.key) &&
            Objects.equals(this.value, showPartitionMessageRespMessage.value) &&
            Objects.equals(this.topic, showPartitionMessageRespMessage.topic) &&
            Objects.equals(this.partition, showPartitionMessageRespMessage.partition) &&
            Objects.equals(this.messageOffset, showPartitionMessageRespMessage.messageOffset) &&
            Objects.equals(this.size, showPartitionMessageRespMessage.size) &&
            Objects.equals(this.timestamp, showPartitionMessageRespMessage.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value, topic, partition, messageOffset, size, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartitionMessageRespMessage {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    messageOffset: ").append(toIndentedString(messageOffset)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

