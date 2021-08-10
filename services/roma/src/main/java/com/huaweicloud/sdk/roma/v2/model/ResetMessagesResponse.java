package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ResetMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_offset")

    private Long messageOffset;

    public ResetMessagesResponse withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** topic名称。
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ResetMessagesResponse withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /** 分区。
     * 
     * @return partition */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public ResetMessagesResponse withMessageOffset(Long messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    /** 消息偏移量。
     * 
     * @return messageOffset */
    public Long getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(Long messageOffset) {
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
        ResetMessagesResponse resetMessagesResponse = (ResetMessagesResponse) o;
        return Objects.equals(this.topic, resetMessagesResponse.topic)
            && Objects.equals(this.partition, resetMessagesResponse.partition)
            && Objects.equals(this.messageOffset, resetMessagesResponse.messageOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, partition, messageOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetMessagesResponse {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    messageOffset: ").append(toIndentedString(messageOffset)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
