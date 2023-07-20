package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * KafkaTopicPartitionResponsePartitions
 */
public class KafkaTopicPartitionResponsePartitions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_offset")

    private Long startOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_offset")

    private Long lastOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_count")

    private Long messageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    public KafkaTopicPartitionResponsePartitions withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
     * 分区ID
     * minimum: 0
     * maximum: 100
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public KafkaTopicPartitionResponsePartitions withStartOffset(Long startOffset) {
        this.startOffset = startOffset;
        return this;
    }

    /**
     * 起始偏移量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startOffset
     */
    public Long getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(Long startOffset) {
        this.startOffset = startOffset;
    }

    public KafkaTopicPartitionResponsePartitions withLastOffset(Long lastOffset) {
        this.lastOffset = lastOffset;
        return this;
    }

    /**
     * 最后偏移量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastOffset
     */
    public Long getLastOffset() {
        return lastOffset;
    }

    public void setLastOffset(Long lastOffset) {
        this.lastOffset = lastOffset;
    }

    public KafkaTopicPartitionResponsePartitions withMessageCount(Long messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * 分区消息数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return messageCount
     */
    public Long getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(Long messageCount) {
        this.messageCount = messageCount;
    }

    public KafkaTopicPartitionResponsePartitions withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最近更新时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaTopicPartitionResponsePartitions that = (KafkaTopicPartitionResponsePartitions) obj;
        return Objects.equals(this.partition, that.partition) && Objects.equals(this.startOffset, that.startOffset)
            && Objects.equals(this.lastOffset, that.lastOffset) && Objects.equals(this.messageCount, that.messageCount)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partition, startOffset, lastOffset, messageCount, lastUpdateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaTopicPartitionResponsePartitions {\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
        sb.append("    lastOffset: ").append(toIndentedString(lastOffset)).append("\n");
        sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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
