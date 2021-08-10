package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ResetReplicaReqPartitions */
public class ResetReplicaReqPartitions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private List<Integer> replicas = null;

    public ResetReplicaReqPartitions withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /** 分区ID。
     * 
     * @return partition */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public ResetReplicaReqPartitions withReplicas(List<Integer> replicas) {
        this.replicas = replicas;
        return this;
    }

    public ResetReplicaReqPartitions addReplicasItem(Integer replicasItem) {
        if (this.replicas == null) {
            this.replicas = new ArrayList<>();
        }
        this.replicas.add(replicasItem);
        return this;
    }

    public ResetReplicaReqPartitions withReplicas(Consumer<List<Integer>> replicasSetter) {
        if (this.replicas == null) {
            this.replicas = new ArrayList<>();
        }
        replicasSetter.accept(this.replicas);
        return this;
    }

    /** 副本期望所在的broker ID。其中Array首位为leader副本，所有分区需要有同样数量的副本，副本数不能大于总broker的数量。
     * 
     * @return replicas */
    public List<Integer> getReplicas() {
        return replicas;
    }

    public void setReplicas(List<Integer> replicas) {
        this.replicas = replicas;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetReplicaReqPartitions resetReplicaReqPartitions = (ResetReplicaReqPartitions) o;
        return Objects.equals(this.partition, resetReplicaReqPartitions.partition)
            && Objects.equals(this.replicas, resetReplicaReqPartitions.replicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partition, replicas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetReplicaReqPartitions {\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
