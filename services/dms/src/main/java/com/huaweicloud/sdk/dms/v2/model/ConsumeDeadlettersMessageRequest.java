package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ConsumeDeadlettersMessageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private String queueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_group_id")

    private String consumerGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_msgs")

    private Integer maxMsgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_wait")

    private Integer timeWait;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ack_wait")

    private Integer ackWait;

    public ConsumeDeadlettersMessageRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /** 指定的队列ID。
     * 
     * @return queueId */
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

    /** 消费组的ID。
     * 
     * @return consumerGroupId */
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

    /** 获取可消费的死信消息的条数。 >单次消费返回的消息数量可能会少于指定条数，但多次消费最终可获取全部消息。 取值范围：1~10。 默认值：10
     * 
     * @return maxMsgs */
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

    /** 设定消费组中可消费的死信为0时的读取消息等待时间。 如果在等待时间内有新的死信消息，则立即返回消费结果，如果等待时间内没有新的死信消息，则到等待时间后返回消费结果。 取值范围：1~60s 默认值：3s
     * 说明：不带该参数或者配置为空，都默认为3s。
     * 
     * @return timeWait */
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

    /** commit提交超时时间，在该时间内提交确认，确认有效，如果超过指定时间，系统会报消息确认超时，或handler无效。 取值范围：15~300s 默认值：30s 说明：不带该参数或者配置为空，都默认为30s。
     * 
     * @return ackWait */
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
        return Objects.equals(this.queueId, consumeDeadlettersMessageRequest.queueId)
            && Objects.equals(this.consumerGroupId, consumeDeadlettersMessageRequest.consumerGroupId)
            && Objects.equals(this.maxMsgs, consumeDeadlettersMessageRequest.maxMsgs)
            && Objects.equals(this.timeWait, consumeDeadlettersMessageRequest.timeWait)
            && Objects.equals(this.ackWait, consumeDeadlettersMessageRequest.ackWait);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
