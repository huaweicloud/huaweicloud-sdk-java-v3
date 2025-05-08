package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowConsumerListOrDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<String> topics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

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

    public ShowConsumerListOrDetailsResponse withTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public ShowConsumerListOrDetailsResponse addTopicsItem(String topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ShowConsumerListOrDetailsResponse withTopics(Consumer<List<String>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * **参数解释**： Topic列表（当查询Topic消费“列表”时才显示此参数）。
     * @return topics
     */
    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public ShowConsumerListOrDetailsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： Topic总数（当查询Topic消费“列表”时才显示此参数）。 **取值范围**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowConsumerListOrDetailsResponse withLag(Long lag) {
        this.lag = lag;
        return this;
    }

    /**
     * **参数解释**： 消费堆积总数。 **取值范围**： 不涉及。
     * @return lag
     */
    public Long getLag() {
        return lag;
    }

    public void setLag(Long lag) {
        this.lag = lag;
    }

    public ShowConsumerListOrDetailsResponse withMaxOffset(Long maxOffset) {
        this.maxOffset = maxOffset;
        return this;
    }

    /**
     * **参数解释**： 消息总数。 **取值范围**： 不涉及。
     * @return maxOffset
     */
    public Long getMaxOffset() {
        return maxOffset;
    }

    public void setMaxOffset(Long maxOffset) {
        this.maxOffset = maxOffset;
    }

    public ShowConsumerListOrDetailsResponse withConsumerOffset(Long consumerOffset) {
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

    public ShowConsumerListOrDetailsResponse withBrokers(List<Brokers> brokers) {
        this.brokers = brokers;
        return this;
    }

    public ShowConsumerListOrDetailsResponse addBrokersItem(Brokers brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public ShowConsumerListOrDetailsResponse withBrokers(Consumer<List<Brokers>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * **参数解释**： Topic关联代理（当查询Topic消费“详情”才显示此参数）。
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
        ShowConsumerListOrDetailsResponse that = (ShowConsumerListOrDetailsResponse) obj;
        return Objects.equals(this.topics, that.topics) && Objects.equals(this.total, that.total)
            && Objects.equals(this.lag, that.lag) && Objects.equals(this.maxOffset, that.maxOffset)
            && Objects.equals(this.consumerOffset, that.consumerOffset) && Objects.equals(this.brokers, that.brokers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topics, total, lag, maxOffset, consumerOffset, brokers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConsumerListOrDetailsResponse {\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
