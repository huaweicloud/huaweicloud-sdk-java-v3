package com.huaweicloud.sdk.kafka.v2.model;

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
public class ListTopicProducersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "producers")

    private List<KafkaTopicProducerResponseProducers> producers = null;

    public ListTopicProducersResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 总条数。 **取值范围**： 0~10000。
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTopicProducersResponse withProducers(List<KafkaTopicProducerResponseProducers> producers) {
        this.producers = producers;
        return this;
    }

    public ListTopicProducersResponse addProducersItem(KafkaTopicProducerResponseProducers producersItem) {
        if (this.producers == null) {
            this.producers = new ArrayList<>();
        }
        this.producers.add(producersItem);
        return this;
    }

    public ListTopicProducersResponse withProducers(
        Consumer<List<KafkaTopicProducerResponseProducers>> producersSetter) {
        if (this.producers == null) {
            this.producers = new ArrayList<>();
        }
        producersSetter.accept(this.producers);
        return this;
    }

    /**
     * **参数解释**： 生产者列表。
     * @return producers
     */
    public List<KafkaTopicProducerResponseProducers> getProducers() {
        return producers;
    }

    public void setProducers(List<KafkaTopicProducerResponseProducers> producers) {
        this.producers = producers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTopicProducersResponse that = (ListTopicProducersResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.producers, that.producers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, producers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicProducersResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    producers: ").append(toIndentedString(producers)).append("\n");
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
