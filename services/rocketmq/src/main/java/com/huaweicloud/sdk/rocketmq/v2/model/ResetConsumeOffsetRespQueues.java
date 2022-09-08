package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResetConsumeOffsetRespQueues
 */
public class ResetConsumeOffsetRespQueues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_name")

    private String brokerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private Integer queueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_offset")

    private Long timestampOffset;

    public ResetConsumeOffsetRespQueues withBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }

    /**
     * 队列所在的broker。
     * @return brokerName
     */
    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public ResetConsumeOffsetRespQueues withQueueId(Integer queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * 队列ID。
     * @return queueId
     */
    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public ResetConsumeOffsetRespQueues withTimestampOffset(Long timestampOffset) {
        this.timestampOffset = timestampOffset;
        return this;
    }

    /**
     * 重置消费进度。
     * @return timestampOffset
     */
    public Long getTimestampOffset() {
        return timestampOffset;
    }

    public void setTimestampOffset(Long timestampOffset) {
        this.timestampOffset = timestampOffset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetConsumeOffsetRespQueues resetConsumeOffsetRespQueues = (ResetConsumeOffsetRespQueues) o;
        return Objects.equals(this.brokerName, resetConsumeOffsetRespQueues.brokerName)
            && Objects.equals(this.queueId, resetConsumeOffsetRespQueues.queueId)
            && Objects.equals(this.timestampOffset, resetConsumeOffsetRespQueues.timestampOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brokerName, queueId, timestampOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetConsumeOffsetRespQueues {\n");
        sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    timestampOffset: ").append(toIndentedString(timestampOffset)).append("\n");
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
