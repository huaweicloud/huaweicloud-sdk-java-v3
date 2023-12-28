package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowGroupsRespGroupGroupMessageOffsets
 */
public class ShowGroupsRespGroupGroupMessageOffsets {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag")

    private Long lag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_current_offset")

    private Long messageCurrentOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_log_end_offset")

    private Long messageLogEndOffset;

    public ShowGroupsRespGroupGroupMessageOffsets withPartition(Integer partition) {
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

    public ShowGroupsRespGroupGroupMessageOffsets withLag(Long lag) {
        this.lag = lag;
        return this;
    }

    /**
     * 剩余可消费消息数，即消息堆积数。
     * @return lag
     */
    public Long getLag() {
        return lag;
    }

    public void setLag(Long lag) {
        this.lag = lag;
    }

    public ShowGroupsRespGroupGroupMessageOffsets withTopic(String topic) {
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

    public ShowGroupsRespGroupGroupMessageOffsets withMessageCurrentOffset(Long messageCurrentOffset) {
        this.messageCurrentOffset = messageCurrentOffset;
        return this;
    }

    /**
     * 当前消费进度。
     * @return messageCurrentOffset
     */
    public Long getMessageCurrentOffset() {
        return messageCurrentOffset;
    }

    public void setMessageCurrentOffset(Long messageCurrentOffset) {
        this.messageCurrentOffset = messageCurrentOffset;
    }

    public ShowGroupsRespGroupGroupMessageOffsets withMessageLogEndOffset(Long messageLogEndOffset) {
        this.messageLogEndOffset = messageLogEndOffset;
        return this;
    }

    /**
     * 最大消息位置（LEO）。
     * @return messageLogEndOffset
     */
    public Long getMessageLogEndOffset() {
        return messageLogEndOffset;
    }

    public void setMessageLogEndOffset(Long messageLogEndOffset) {
        this.messageLogEndOffset = messageLogEndOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGroupsRespGroupGroupMessageOffsets that = (ShowGroupsRespGroupGroupMessageOffsets) obj;
        return Objects.equals(this.partition, that.partition) && Objects.equals(this.lag, that.lag)
            && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.messageCurrentOffset, that.messageCurrentOffset)
            && Objects.equals(this.messageLogEndOffset, that.messageLogEndOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partition, lag, topic, messageCurrentOffset, messageLogEndOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupsRespGroupGroupMessageOffsets {\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    messageCurrentOffset: ").append(toIndentedString(messageCurrentOffset)).append("\n");
        sb.append("    messageLogEndOffset: ").append(toIndentedString(messageLogEndOffset)).append("\n");
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
