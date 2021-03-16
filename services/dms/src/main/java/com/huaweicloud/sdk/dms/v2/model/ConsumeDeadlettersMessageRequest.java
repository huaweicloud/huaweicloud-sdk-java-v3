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
public class ConsumeDeadlettersMessageRequest  {



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

    public ConsumeDeadlettersMessageRequest withQueueId(String queueId) {
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

    

    public ConsumeDeadlettersMessageRequest withConsumerGroupId(String consumerGroupId) {
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

    

    public ConsumeDeadlettersMessageRequest withMaxMsgs(Integer maxMsgs) {
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

    

    public ConsumeDeadlettersMessageRequest withTimeWait(Integer timeWait) {
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

    

    public ConsumeDeadlettersMessageRequest withAckWait(Integer ackWait) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsumeDeadlettersMessageRequest consumeDeadlettersMessageRequest = (ConsumeDeadlettersMessageRequest) o;
        return Objects.equals(this.queueId, consumeDeadlettersMessageRequest.queueId) &&
            Objects.equals(this.consumerGroupId, consumeDeadlettersMessageRequest.consumerGroupId) &&
            Objects.equals(this.maxMsgs, consumeDeadlettersMessageRequest.maxMsgs) &&
            Objects.equals(this.timeWait, consumeDeadlettersMessageRequest.timeWait) &&
            Objects.equals(this.ackWait, consumeDeadlettersMessageRequest.ackWait);
    }
    @Override
    public int hashCode() {
        return Objects.hash(queueId, consumerGroupId, maxMsgs, timeWait, ackWait);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumeDeadlettersMessageRequest {\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    consumerGroupId: ").append(toIndentedString(consumerGroupId)).append("\n");
        sb.append("    maxMsgs: ").append(toIndentedString(maxMsgs)).append("\n");
        sb.append("    timeWait: ").append(toIndentedString(timeWait)).append("\n");
        sb.append("    ackWait: ").append(toIndentedString(ackWait)).append("\n");
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

