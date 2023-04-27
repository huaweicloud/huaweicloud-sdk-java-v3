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
     * Topic列表（当查询topic消费“列表”时才显示此参数）。
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
     * Topic总数（当查询topic消费“列表”时才显示此参数）。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowConsumerListOrDetailsResponse showConsumerListOrDetailsResponse = (ShowConsumerListOrDetailsResponse) o;
        return Objects.equals(this.topics, showConsumerListOrDetailsResponse.topics)
            && Objects.equals(this.total, showConsumerListOrDetailsResponse.total)
            && Objects.equals(this.brokers, showConsumerListOrDetailsResponse.brokers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topics, total, brokers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConsumerListOrDetailsResponse {\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
