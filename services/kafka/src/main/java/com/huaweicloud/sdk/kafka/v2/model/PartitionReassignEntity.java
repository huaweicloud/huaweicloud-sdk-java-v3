package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PartitionReassignEntity
 */
public class PartitionReassignEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<Integer> brokers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_factor")

    private Integer replicationFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignment")

    private List<TopicAssignment> assignment = null;

    public PartitionReassignEntity withTopic(String topic) {
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

    public PartitionReassignEntity withBrokers(List<Integer> brokers) {
        this.brokers = brokers;
        return this;
    }

    public PartitionReassignEntity addBrokersItem(Integer brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public PartitionReassignEntity withBrokers(Consumer<List<Integer>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * 分区重平衡到的broker列表，自动生成分配方案时需指定该参数。
     * @return brokers
     */
    public List<Integer> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<Integer> brokers) {
        this.brokers = brokers;
    }

    public PartitionReassignEntity withReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }

    /**
     * 副本因子，自动生成分配方案时可指定。
     * @return replicationFactor
     */
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    public PartitionReassignEntity withAssignment(List<TopicAssignment> assignment) {
        this.assignment = assignment;
        return this;
    }

    public PartitionReassignEntity addAssignmentItem(TopicAssignment assignmentItem) {
        if (this.assignment == null) {
            this.assignment = new ArrayList<>();
        }
        this.assignment.add(assignmentItem);
        return this;
    }

    public PartitionReassignEntity withAssignment(Consumer<List<TopicAssignment>> assignmentSetter) {
        if (this.assignment == null) {
            this.assignment = new ArrayList<>();
        }
        assignmentSetter.accept(this.assignment);
        return this;
    }

    /**
     * 手动指定的分配方案。brokers 参数与该参数不能同时为空。
     * @return assignment
     */
    public List<TopicAssignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<TopicAssignment> assignment) {
        this.assignment = assignment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartitionReassignEntity partitionReassignEntity = (PartitionReassignEntity) o;
        return Objects.equals(this.topic, partitionReassignEntity.topic)
            && Objects.equals(this.brokers, partitionReassignEntity.brokers)
            && Objects.equals(this.replicationFactor, partitionReassignEntity.replicationFactor)
            && Objects.equals(this.assignment, partitionReassignEntity.assignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, brokers, replicationFactor, assignment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartitionReassignEntity {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    replicationFactor: ").append(toIndentedString(replicationFactor)).append("\n");
        sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
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
