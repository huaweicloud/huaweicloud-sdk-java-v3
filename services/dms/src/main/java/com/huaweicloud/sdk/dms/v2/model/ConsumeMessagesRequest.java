package com.huaweicloud.sdk.dms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ConsumeMessagesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_id")
    
    private String queueId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consumer_group_id")
    
    private String consumerGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_msgs")
    
    private Integer maxMsgs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_wait")
    
    private Integer timeWait;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ack_wait")
    
    private Integer ackWait;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private String tag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_type")
    
    private String tagType;

    public ConsumeMessagesRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    


    /**
     * 指定的队列ID。
     * @return queueId
     */
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    

    public ConsumeMessagesRequest withConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }

    


    /**
     * 消费组的ID。
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return consumerGroupId;
    }

    public void setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
    }

    

    public ConsumeMessagesRequest withMaxMsgs(Integer maxMsgs) {
        this.maxMsgs = maxMsgs;
        return this;
    }

    


    /**
     * 获取可消费的消息的条数。  取值范围：1~10。  默认值：10
     * @return maxMsgs
     */
    public Integer getMaxMsgs() {
        return maxMsgs;
    }

    public void setMaxMsgs(Integer maxMsgs) {
        this.maxMsgs = maxMsgs;
    }

    

    public ConsumeMessagesRequest withTimeWait(Integer timeWait) {
        this.timeWait = timeWait;
        return this;
    }

    


    /**
     * 设定队列可消费的消息为0时的读取消息等待时间。  如果在等待时间内有新的消息，则立即返回消费结果，如果等待时间内没有新的消息，则到等待时间后返回消费结果。  取值范围：1~60s  默认值：3s  说明：不带该参数或者配置为空，都默认为3s。
     * @return timeWait
     */
    public Integer getTimeWait() {
        return timeWait;
    }

    public void setTimeWait(Integer timeWait) {
        this.timeWait = timeWait;
    }

    

    public ConsumeMessagesRequest withAckWait(Integer ackWait) {
        this.ackWait = ackWait;
        return this;
    }

    


    /**
     * 提交确认消费的超时时间，客户端需要在该时间内提交消费确认，如果超过指定时间，没有确认消费，系统会报消息确认超时或handler无效，则默认为消费失败。  取值范围：15~300s  默认值：30s  说明：不带该参数或者配置为空，都默认为30s。
     * @return ackWait
     */
    public Integer getAckWait() {
        return ackWait;
    }

    public void setAckWait(Integer ackWait) {
        this.ackWait = ackWait;
    }

    

    public ConsumeMessagesRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 添加标签后可以按照Tag进行过滤，只消费匹配上标签的消息。  Tag的数量不超过3个。  每个Tag长度不超过64。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    

    public ConsumeMessagesRequest withTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }

    


    /**
     * 多个消息标签的过滤类型。  取值范围： - and：必须所有标签匹配上，才能消费消息。 - or：只要有一条标签匹配上，就可以消费消息。  默认值为：or。
     * @return tagType
     */
    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsumeMessagesRequest consumeMessagesRequest = (ConsumeMessagesRequest) o;
        return Objects.equals(this.queueId, consumeMessagesRequest.queueId) &&
            Objects.equals(this.consumerGroupId, consumeMessagesRequest.consumerGroupId) &&
            Objects.equals(this.maxMsgs, consumeMessagesRequest.maxMsgs) &&
            Objects.equals(this.timeWait, consumeMessagesRequest.timeWait) &&
            Objects.equals(this.ackWait, consumeMessagesRequest.ackWait) &&
            Objects.equals(this.tag, consumeMessagesRequest.tag) &&
            Objects.equals(this.tagType, consumeMessagesRequest.tagType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(queueId, consumerGroupId, maxMsgs, timeWait, ackWait, tag, tagType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumeMessagesRequest {\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    consumerGroupId: ").append(toIndentedString(consumerGroupId)).append("\n");
        sb.append("    maxMsgs: ").append(toIndentedString(maxMsgs)).append("\n");
        sb.append("    timeWait: ").append(toIndentedString(timeWait)).append("\n");
        sb.append("    ackWait: ").append(toIndentedString(ackWait)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
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

