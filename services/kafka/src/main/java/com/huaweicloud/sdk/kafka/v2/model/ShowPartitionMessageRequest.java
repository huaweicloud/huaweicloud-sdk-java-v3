package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPartitionMessageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    @JacksonXmlProperty(localName = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    @JacksonXmlProperty(localName = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_offset")

    @JacksonXmlProperty(localName = "message_offset")

    private String messageOffset;

    public ShowPartitionMessageRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowPartitionMessageRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Topic名称。  Topic名称必现以字母开头且只支持大小写字母、中横线、下划线以及数字。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ShowPartitionMessageRequest withPartition(Integer partition) {
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

    public ShowPartitionMessageRequest withMessageOffset(String messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    /**
     * 消息位置。
     * @return messageOffset
     */
    public String getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(String messageOffset) {
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
        ShowPartitionMessageRequest showPartitionMessageRequest = (ShowPartitionMessageRequest) o;
        return Objects.equals(this.instanceId, showPartitionMessageRequest.instanceId)
            && Objects.equals(this.topic, showPartitionMessageRequest.topic)
            && Objects.equals(this.partition, showPartitionMessageRequest.partition)
            && Objects.equals(this.messageOffset, showPartitionMessageRequest.messageOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, topic, partition, messageOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartitionMessageRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
