package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowMessagesRespMessages
 */
public class ShowMessagesRespMessages {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_offset")

    private Long messageOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    public ShowMessagesRespMessages withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释**： topic名称。 **取值范围**： 不涉及。
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
     * **参数解释**： 分区编号。 **取值范围**： 不涉及。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public ShowMessagesRespMessages withMessageOffset(Long messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    /**
     * **参数解释**： 消息编号。 **取值范围**： 不涉及。
     * @return messageOffset
     */
    public Long getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(Long messageOffset) {
        this.messageOffset = messageOffset;
    }

    public ShowMessagesRespMessages withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**： 消息大小，单位字节。 **取值范围**： 不涉及。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowMessagesRespMessages withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * **参数解释**： 生产消息的时间。 格式为Unix时间戳。单位为毫秒。 **取值范围**： 不涉及。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMessagesRespMessages that = (ShowMessagesRespMessages) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.messageOffset, that.messageOffset) && Objects.equals(this.size, that.size)
            && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, partition, messageOffset, size, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMessagesRespMessages {\n");
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
