package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * KafkaTopicProducerResponseProducers
 */
public class KafkaTopicProducerResponseProducers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "producer_address")

    private String producerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_address")

    private String brokerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_time")

    private Long joinTime;

    public KafkaTopicProducerResponseProducers withProducerAddress(String producerAddress) {
        this.producerAddress = producerAddress;
        return this;
    }

    /**
     * 生产者地址
     * @return producerAddress
     */
    public String getProducerAddress() {
        return producerAddress;
    }

    public void setProducerAddress(String producerAddress) {
        this.producerAddress = producerAddress;
    }

    public KafkaTopicProducerResponseProducers withBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
        return this;
    }

    /**
     * broker地址
     * @return brokerAddress
     */
    public String getBrokerAddress() {
        return brokerAddress;
    }

    public void setBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
    }

    public KafkaTopicProducerResponseProducers withJoinTime(Long joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    /**
     * 加入时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return joinTime
     */
    public Long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Long joinTime) {
        this.joinTime = joinTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaTopicProducerResponseProducers that = (KafkaTopicProducerResponseProducers) obj;
        return Objects.equals(this.producerAddress, that.producerAddress)
            && Objects.equals(this.brokerAddress, that.brokerAddress) && Objects.equals(this.joinTime, that.joinTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producerAddress, brokerAddress, joinTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaTopicProducerResponseProducers {\n");
        sb.append("    producerAddress: ").append(toIndentedString(producerAddress)).append("\n");
        sb.append("    brokerAddress: ").append(toIndentedString(brokerAddress)).append("\n");
        sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
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
