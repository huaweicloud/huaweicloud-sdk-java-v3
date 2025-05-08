package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * topic流控配置
 */
public class KafkaTopicQuota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "producer-byte-rate")

    private Integer producerByteRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer-byte-rate")

    private Integer consumerByteRate;

    public KafkaTopicQuota withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * topic名称
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public KafkaTopicQuota withProducerByteRate(Integer producerByteRate) {
        this.producerByteRate = producerByteRate;
        return this;
    }

    /**
     * 生产者速率
     * @return producerByteRate
     */
    public Integer getProducerByteRate() {
        return producerByteRate;
    }

    public void setProducerByteRate(Integer producerByteRate) {
        this.producerByteRate = producerByteRate;
    }

    public KafkaTopicQuota withConsumerByteRate(Integer consumerByteRate) {
        this.consumerByteRate = consumerByteRate;
        return this;
    }

    /**
     * 消费者速率
     * @return consumerByteRate
     */
    public Integer getConsumerByteRate() {
        return consumerByteRate;
    }

    public void setConsumerByteRate(Integer consumerByteRate) {
        this.consumerByteRate = consumerByteRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaTopicQuota that = (KafkaTopicQuota) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.producerByteRate, that.producerByteRate)
            && Objects.equals(this.consumerByteRate, that.consumerByteRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, producerByteRate, consumerByteRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaTopicQuota {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    producerByteRate: ").append(toIndentedString(producerByteRate)).append("\n");
        sb.append("    consumerByteRate: ").append(toIndentedString(consumerByteRate)).append("\n");
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
