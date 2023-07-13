package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConsumerGroup
 */
public class ConsumerGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broadcast")

    private Boolean broadcast;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<String> brokers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_max_time")

    private BigDecimal retryMaxTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_beginning")

    private Boolean fromBeginning;

    public ConsumerGroup withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否可以消费。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ConsumerGroup withBroadcast(Boolean broadcast) {
        this.broadcast = broadcast;
        return this;
    }

    /**
     * 是否广播。
     * @return broadcast
     */
    public Boolean getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Boolean broadcast) {
        this.broadcast = broadcast;
    }

    public ConsumerGroup withBrokers(List<String> brokers) {
        this.brokers = brokers;
        return this;
    }

    public ConsumerGroup addBrokersItem(String brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public ConsumerGroup withBrokers(Consumer<List<String>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * 关联的代理列表。
     * @return brokers
     */
    public List<String> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<String> brokers) {
        this.brokers = brokers;
    }

    public ConsumerGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消费组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConsumerGroup withRetryMaxTime(BigDecimal retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
        return this;
    }

    /**
     * 最大重试次数。
     * @return retryMaxTime
     */
    public BigDecimal getRetryMaxTime() {
        return retryMaxTime;
    }

    public void setRetryMaxTime(BigDecimal retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
    }

    public ConsumerGroup withFromBeginning(Boolean fromBeginning) {
        this.fromBeginning = fromBeginning;
        return this;
    }

    /**
     * 是否重头消费。
     * @return fromBeginning
     */
    public Boolean getFromBeginning() {
        return fromBeginning;
    }

    public void setFromBeginning(Boolean fromBeginning) {
        this.fromBeginning = fromBeginning;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumerGroup that = (ConsumerGroup) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.broadcast, that.broadcast)
            && Objects.equals(this.brokers, that.brokers) && Objects.equals(this.name, that.name)
            && Objects.equals(this.retryMaxTime, that.retryMaxTime)
            && Objects.equals(this.fromBeginning, that.fromBeginning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, broadcast, brokers, name, retryMaxTime, fromBeginning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumerGroup {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    retryMaxTime: ").append(toIndentedString(retryMaxTime)).append("\n");
        sb.append("    fromBeginning: ").append(toIndentedString(fromBeginning)).append("\n");
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
