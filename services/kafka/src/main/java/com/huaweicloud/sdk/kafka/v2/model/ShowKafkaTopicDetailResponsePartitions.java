package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowKafkaTopicDetailResponsePartitions
 */
public class ShowKafkaTopicDetailResponsePartitions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leader")

    private Integer leader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private List<Integer> replicas = null;

    public ShowKafkaTopicDetailResponsePartitions withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
     * **参数解释**： 分区编号。  **取值范围**： 不涉及。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public ShowKafkaTopicDetailResponsePartitions withLeader(Integer leader) {
        this.leader = leader;
        return this;
    }

    /**
     * **参数解释**： leader副本所在节点的ID。  **取值范围**： 不涉及。
     * @return leader
     */
    public Integer getLeader() {
        return leader;
    }

    public void setLeader(Integer leader) {
        this.leader = leader;
    }

    public ShowKafkaTopicDetailResponsePartitions withReplicas(List<Integer> replicas) {
        this.replicas = replicas;
        return this;
    }

    public ShowKafkaTopicDetailResponsePartitions addReplicasItem(Integer replicasItem) {
        if (this.replicas == null) {
            this.replicas = new ArrayList<>();
        }
        this.replicas.add(replicasItem);
        return this;
    }

    public ShowKafkaTopicDetailResponsePartitions withReplicas(Consumer<List<Integer>> replicasSetter) {
        if (this.replicas == null) {
            this.replicas = new ArrayList<>();
        }
        replicasSetter.accept(this.replicas);
        return this;
    }

    /**
     * **参数解释**： 副本列表。
     * @return replicas
     */
    public List<Integer> getReplicas() {
        return replicas;
    }

    public void setReplicas(List<Integer> replicas) {
        this.replicas = replicas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKafkaTopicDetailResponsePartitions that = (ShowKafkaTopicDetailResponsePartitions) obj;
        return Objects.equals(this.partition, that.partition) && Objects.equals(this.leader, that.leader)
            && Objects.equals(this.replicas, that.replicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partition, leader, replicas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKafkaTopicDetailResponsePartitions {\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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
