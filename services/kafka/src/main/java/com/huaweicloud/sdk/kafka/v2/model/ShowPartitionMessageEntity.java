package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 消息体。
 */
public class ShowPartitionMessageEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

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

    public ShowPartitionMessageEntity withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**： 消息的key。 **取值范围**： 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ShowPartitionMessageEntity withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 消息内容。 **取值范围**： 不涉及
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ShowPartitionMessageEntity withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释**： Topic名称。 **取值范围**： 不涉及
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ShowPartitionMessageEntity withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
     * **参数解释**： 分区编号。 **取值范围**： 不涉及
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public ShowPartitionMessageEntity withMessageOffset(Long messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    /**
     * **参数解释**： 消息位置。 **取值范围**： 不涉及
     * @return messageOffset
     */
    public Long getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(Long messageOffset) {
        this.messageOffset = messageOffset;
    }

    public ShowPartitionMessageEntity withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**： 消息大小，单位字节。 **取值范围**： 不涉及
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowPartitionMessageEntity withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * **参数解释**： 生产消息的时间。 格式为Unix时间戳。单位为毫秒。 **取值范围**： 不涉及
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
        ShowPartitionMessageEntity that = (ShowPartitionMessageEntity) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.topic, that.topic) && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.messageOffset, that.messageOffset) && Objects.equals(this.size, that.size)
            && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, topic, partition, messageOffset, size, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartitionMessageEntity {\n");
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
