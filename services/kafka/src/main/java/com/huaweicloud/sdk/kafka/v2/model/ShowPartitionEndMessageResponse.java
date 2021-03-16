package com.huaweicloud.sdk.kafka.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPartitionEndMessageResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partition")
    
    private Integer partition;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_offset")
    
    private Integer messageOffset;

    public ShowPartitionEndMessageResponse withTopic(String topic) {
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

    

    public ShowPartitionEndMessageResponse withPartition(Integer partition) {
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

    

    public ShowPartitionEndMessageResponse withMessageOffset(Integer messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    


    /**
     * 最新消息位置。
     * @return messageOffset
     */
    public Integer getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(Integer messageOffset) {
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
        ShowPartitionEndMessageResponse showPartitionEndMessageResponse = (ShowPartitionEndMessageResponse) o;
        return Objects.equals(this.topic, showPartitionEndMessageResponse.topic) &&
            Objects.equals(this.partition, showPartitionEndMessageResponse.partition) &&
            Objects.equals(this.messageOffset, showPartitionEndMessageResponse.messageOffset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topic, partition, messageOffset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartitionEndMessageResponse {\n");
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

