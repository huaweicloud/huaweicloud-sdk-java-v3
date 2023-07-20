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
public class ListTopicPartitionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<KafkaTopicPartitionResponsePartitions> partitions = null;

    public ListTopicPartitionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数
     * minimum: 0
     * maximum: 100
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTopicPartitionsResponse withPartitions(List<KafkaTopicPartitionResponsePartitions> partitions) {
        this.partitions = partitions;
        return this;
    }

    public ListTopicPartitionsResponse addPartitionsItem(KafkaTopicPartitionResponsePartitions partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public ListTopicPartitionsResponse withPartitions(
        Consumer<List<KafkaTopicPartitionResponsePartitions>> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /**
     * 分区数组
     * @return partitions
     */
    public List<KafkaTopicPartitionResponsePartitions> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<KafkaTopicPartitionResponsePartitions> partitions) {
        this.partitions = partitions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTopicPartitionsResponse that = (ListTopicPartitionsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.partitions, that.partitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, partitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicPartitionsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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
