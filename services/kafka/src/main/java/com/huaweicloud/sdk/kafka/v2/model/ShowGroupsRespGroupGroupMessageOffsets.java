package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowGroupsRespGroupGroupMessageOffsets
 */
public class ShowGroupsRespGroupGroupMessageOffsets  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partition")
    
    private Integer partition;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lag")
    
    private Integer lag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_current_offset")
    
    private Integer messageCurrentOffset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_log_end_offset")
    
    private Integer messageLogEndOffset;

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

    public ShowGroupsRespGroupGroupMessageOffsets withLag(Integer lag) {
        this.lag = lag;
        return this;
    }

    


    /**
     * 剩余可消费消息数，即消息堆积数。
     * @return lag
     */
    public Integer getLag() {
        return lag;
    }

    public void setLag(Integer lag) {
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

    public ShowGroupsRespGroupGroupMessageOffsets withMessageCurrentOffset(Integer messageCurrentOffset) {
        this.messageCurrentOffset = messageCurrentOffset;
        return this;
    }

    


    /**
     * 当前消费进度。
     * @return messageCurrentOffset
     */
    public Integer getMessageCurrentOffset() {
        return messageCurrentOffset;
    }

    public void setMessageCurrentOffset(Integer messageCurrentOffset) {
        this.messageCurrentOffset = messageCurrentOffset;
    }

    public ShowGroupsRespGroupGroupMessageOffsets withMessageLogEndOffset(Integer messageLogEndOffset) {
        this.messageLogEndOffset = messageLogEndOffset;
        return this;
    }

    


    /**
     * 最大消息位置（LEO）。
     * @return messageLogEndOffset
     */
    public Integer getMessageLogEndOffset() {
        return messageLogEndOffset;
    }

    public void setMessageLogEndOffset(Integer messageLogEndOffset) {
        this.messageLogEndOffset = messageLogEndOffset;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGroupsRespGroupGroupMessageOffsets showGroupsRespGroupGroupMessageOffsets = (ShowGroupsRespGroupGroupMessageOffsets) o;
        return Objects.equals(this.partition, showGroupsRespGroupGroupMessageOffsets.partition) &&
            Objects.equals(this.lag, showGroupsRespGroupGroupMessageOffsets.lag) &&
            Objects.equals(this.topic, showGroupsRespGroupGroupMessageOffsets.topic) &&
            Objects.equals(this.messageCurrentOffset, showGroupsRespGroupGroupMessageOffsets.messageCurrentOffset) &&
            Objects.equals(this.messageLogEndOffset, showGroupsRespGroupGroupMessageOffsets.messageLogEndOffset);
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

