package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TopicAssignment
 */
public class TopicAssignment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_brokers")

    private List<Integer> partitionBrokers = null;

    public TopicAssignment withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
     * 手动指定分配方案时的分区号。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public TopicAssignment withPartitionBrokers(List<Integer> partitionBrokers) {
        this.partitionBrokers = partitionBrokers;
        return this;
    }

    public TopicAssignment addPartitionBrokersItem(Integer partitionBrokersItem) {
        if (this.partitionBrokers == null) {
            this.partitionBrokers = new ArrayList<>();
        }
        this.partitionBrokers.add(partitionBrokersItem);
        return this;
    }

    public TopicAssignment withPartitionBrokers(Consumer<List<Integer>> partitionBrokersSetter) {
        if (this.partitionBrokers == null) {
            this.partitionBrokers = new ArrayList<>();
        }
        partitionBrokersSetter.accept(this.partitionBrokers);
        return this;
    }

    /**
     * 手动指定某个分区将要分配的broker列表
     * @return partitionBrokers
     */
    public List<Integer> getPartitionBrokers() {
        return partitionBrokers;
    }

    public void setPartitionBrokers(List<Integer> partitionBrokers) {
        this.partitionBrokers = partitionBrokers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopicAssignment topicAssignment = (TopicAssignment) o;
        return Objects.equals(this.partition, topicAssignment.partition)
            && Objects.equals(this.partitionBrokers, topicAssignment.partitionBrokers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partition, partitionBrokers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicAssignment {\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    partitionBrokers: ").append(toIndentedString(partitionBrokers)).append("\n");
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
