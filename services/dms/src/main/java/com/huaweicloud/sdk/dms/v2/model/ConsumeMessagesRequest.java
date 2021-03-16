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
     * Get queueId
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
     * Get consumerGroupId
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
     * Get maxMsgs
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
     * Get timeWait
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
     * Get ackWait
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
     * Get tag
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
     * Get tagType
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

