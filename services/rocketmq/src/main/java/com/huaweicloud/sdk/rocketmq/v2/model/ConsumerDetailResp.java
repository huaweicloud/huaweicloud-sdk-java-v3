package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConsumerDetailResp
 */
public class ConsumerDetailResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag")

    private Long lag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_offset")

    private Long maxOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_offset")

    private Long consumerOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<Brokers> brokers = null;

    public ConsumerDetailResp withLag(Long lag) {
        this.lag = lag;
        return this;
    }

    /**
     * 消费堆积总数
     * @return lag
     */
    public Long getLag() {
        return lag;
    }

    public void setLag(Long lag) {
        this.lag = lag;
    }

    public ConsumerDetailResp withMaxOffset(Long maxOffset) {
        this.maxOffset = maxOffset;
        return this;
    }

    /**
     * 消息总数
     * @return maxOffset
     */
    public Long getMaxOffset() {
        return maxOffset;
    }

    public void setMaxOffset(Long maxOffset) {
        this.maxOffset = maxOffset;
    }

    public ConsumerDetailResp withConsumerOffset(Long consumerOffset) {
        this.consumerOffset = consumerOffset;
        return this;
    }

    /**
     * 已消费消息数
     * @return consumerOffset
     */
    public Long getConsumerOffset() {
        return consumerOffset;
    }

    public void setConsumerOffset(Long consumerOffset) {
        this.consumerOffset = consumerOffset;
    }

    public ConsumerDetailResp withBrokers(List<Brokers> brokers) {
        this.brokers = brokers;
        return this;
    }

    public ConsumerDetailResp addBrokersItem(Brokers brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public ConsumerDetailResp withBrokers(Consumer<List<Brokers>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * Topic关联代理（当查询topic消费“详情”才显示此参数）。
     * @return brokers
     */
    public List<Brokers> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<Brokers> brokers) {
        this.brokers = brokers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumerDetailResp that = (ConsumerDetailResp) obj;
        return Objects.equals(this.lag, that.lag) && Objects.equals(this.maxOffset, that.maxOffset)
            && Objects.equals(this.consumerOffset, that.consumerOffset) && Objects.equals(this.brokers, that.brokers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lag, maxOffset, consumerOffset, brokers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumerDetailResp {\n");
        sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
        sb.append("    maxOffset: ").append(toIndentedString(maxOffset)).append("\n");
        sb.append("    consumerOffset: ").append(toIndentedString(consumerOffset)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
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
