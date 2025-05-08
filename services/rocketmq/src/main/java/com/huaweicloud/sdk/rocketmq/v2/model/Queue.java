package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Queue
 */
public class Queue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag")

    private Long lag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_offset")

    private Long brokerOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_offset")

    private Long consumerOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_message_time")

    private Long lastMessageTime;

    public Queue withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 队列ID。 **取值范围**： 不涉及。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Queue withLag(Long lag) {
        this.lag = lag;
        return this;
    }

    /**
     * **参数解释**： 队列消费堆积总数。 **取值范围**： 不涉及。
     * @return lag
     */
    public Long getLag() {
        return lag;
    }

    public void setLag(Long lag) {
        this.lag = lag;
    }

    public Queue withBrokerOffset(Long brokerOffset) {
        this.brokerOffset = brokerOffset;
        return this;
    }

    /**
     * **参数解释**： 队列消息总数。 **取值范围**： 不涉及。
     * @return brokerOffset
     */
    public Long getBrokerOffset() {
        return brokerOffset;
    }

    public void setBrokerOffset(Long brokerOffset) {
        this.brokerOffset = brokerOffset;
    }

    public Queue withConsumerOffset(Long consumerOffset) {
        this.consumerOffset = consumerOffset;
        return this;
    }

    /**
     * **参数解释**： 已消费消息数。 **取值范围**： 不涉及。
     * @return consumerOffset
     */
    public Long getConsumerOffset() {
        return consumerOffset;
    }

    public void setConsumerOffset(Long consumerOffset) {
        this.consumerOffset = consumerOffset;
    }

    public Queue withLastMessageTime(Long lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
        return this;
    }

    /**
     * **参数解释**： 最新消费消息的存储时间，Unix毫秒时间戳格式。 **取值范围**： 不涉及。
     * @return lastMessageTime
     */
    public Long getLastMessageTime() {
        return lastMessageTime;
    }

    public void setLastMessageTime(Long lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Queue that = (Queue) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.lag, that.lag)
            && Objects.equals(this.brokerOffset, that.brokerOffset)
            && Objects.equals(this.consumerOffset, that.consumerOffset)
            && Objects.equals(this.lastMessageTime, that.lastMessageTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lag, brokerOffset, consumerOffset, lastMessageTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Queue {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
        sb.append("    brokerOffset: ").append(toIndentedString(brokerOffset)).append("\n");
        sb.append("    consumerOffset: ").append(toIndentedString(consumerOffset)).append("\n");
        sb.append("    lastMessageTime: ").append(toIndentedString(lastMessageTime)).append("\n");
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
