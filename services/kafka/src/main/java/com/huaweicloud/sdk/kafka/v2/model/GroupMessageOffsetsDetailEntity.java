package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 消费组消息位点详情
 */
public class GroupMessageOffsetsDetailEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private String partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_current_offset")

    private String messageCurrentOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_log_start_offset")

    private Integer messageLogStartOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag")

    private Integer lag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_log_end_offset")

    private Integer messageLogEndOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_id")

    private String consumerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    public GroupMessageOffsetsDetailEntity withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * 分区
     * @return partition
     */
    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public GroupMessageOffsetsDetailEntity withMessageCurrentOffset(String messageCurrentOffset) {
        this.messageCurrentOffset = messageCurrentOffset;
        return this;
    }

    /**
     * 消息当前位点
     * @return messageCurrentOffset
     */
    public String getMessageCurrentOffset() {
        return messageCurrentOffset;
    }

    public void setMessageCurrentOffset(String messageCurrentOffset) {
        this.messageCurrentOffset = messageCurrentOffset;
    }

    public GroupMessageOffsetsDetailEntity withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * topic名称
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public GroupMessageOffsetsDetailEntity withMessageLogStartOffset(Integer messageLogStartOffset) {
        this.messageLogStartOffset = messageLogStartOffset;
        return this;
    }

    /**
     * 消息开始位点
     * @return messageLogStartOffset
     */
    public Integer getMessageLogStartOffset() {
        return messageLogStartOffset;
    }

    public void setMessageLogStartOffset(Integer messageLogStartOffset) {
        this.messageLogStartOffset = messageLogStartOffset;
    }

    public GroupMessageOffsetsDetailEntity withLag(Integer lag) {
        this.lag = lag;
        return this;
    }

    /**
     * 剩余可消费消息数，即消息堆积数
     * @return lag
     */
    public Integer getLag() {
        return lag;
    }

    public void setLag(Integer lag) {
        this.lag = lag;
    }

    public GroupMessageOffsetsDetailEntity withMessageLogEndOffset(Integer messageLogEndOffset) {
        this.messageLogEndOffset = messageLogEndOffset;
        return this;
    }

    /**
     * 消息结束位点
     * @return messageLogEndOffset
     */
    public Integer getMessageLogEndOffset() {
        return messageLogEndOffset;
    }

    public void setMessageLogEndOffset(Integer messageLogEndOffset) {
        this.messageLogEndOffset = messageLogEndOffset;
    }

    public GroupMessageOffsetsDetailEntity withConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }

    /**
     * 消费者Id
     * @return consumerId
     */
    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public GroupMessageOffsetsDetailEntity withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * host名称
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public GroupMessageOffsetsDetailEntity withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 客户端Id
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupMessageOffsetsDetailEntity that = (GroupMessageOffsetsDetailEntity) obj;
        return Objects.equals(this.partition, that.partition)
            && Objects.equals(this.messageCurrentOffset, that.messageCurrentOffset)
            && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.messageLogStartOffset, that.messageLogStartOffset)
            && Objects.equals(this.lag, that.lag) && Objects.equals(this.messageLogEndOffset, that.messageLogEndOffset)
            && Objects.equals(this.consumerId, that.consumerId) && Objects.equals(this.host, that.host)
            && Objects.equals(this.clientId, that.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partition,
            messageCurrentOffset,
            topic,
            messageLogStartOffset,
            lag,
            messageLogEndOffset,
            consumerId,
            host,
            clientId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupMessageOffsetsDetailEntity {\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    messageCurrentOffset: ").append(toIndentedString(messageCurrentOffset)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    messageLogStartOffset: ").append(toIndentedString(messageLogStartOffset)).append("\n");
        sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
        sb.append("    messageLogEndOffset: ").append(toIndentedString(messageLogEndOffset)).append("\n");
        sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
