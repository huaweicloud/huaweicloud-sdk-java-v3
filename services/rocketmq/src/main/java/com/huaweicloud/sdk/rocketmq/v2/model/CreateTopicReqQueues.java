package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * CreateTopicReqQueues
 */
public class CreateTopicReqQueues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker")

    private String broker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_num")

    private BigDecimal queueNum;

    public CreateTopicReqQueues withBroker(String broker) {
        this.broker = broker;
        return this;
    }

    /**
     * 关联的代理。
     * @return broker
     */
    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public CreateTopicReqQueues withQueueNum(BigDecimal queueNum) {
        this.queueNum = queueNum;
        return this;
    }

    /**
     * 队列数，范围1~50。
     * @return queueNum
     */
    public BigDecimal getQueueNum() {
        return queueNum;
    }

    public void setQueueNum(BigDecimal queueNum) {
        this.queueNum = queueNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTopicReqQueues that = (CreateTopicReqQueues) obj;
        return Objects.equals(this.broker, that.broker) && Objects.equals(this.queueNum, that.queueNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(broker, queueNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTopicReqQueues {\n");
        sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
        sb.append("    queueNum: ").append(toIndentedString(queueNum)).append("\n");
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
