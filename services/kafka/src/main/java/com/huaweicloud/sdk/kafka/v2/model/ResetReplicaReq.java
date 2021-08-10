package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 期望调整的分区副本分配情况。 */
public class ResetReplicaReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<ResetReplicaReqPartitions> partitions = null;

    public ResetReplicaReq withPartitions(List<ResetReplicaReqPartitions> partitions) {
        this.partitions = partitions;
        return this;
    }

    public ResetReplicaReq addPartitionsItem(ResetReplicaReqPartitions partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public ResetReplicaReq withPartitions(Consumer<List<ResetReplicaReqPartitions>> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /** 期望调整的分区副本分配情况。
     * 
     * @return partitions */
    public List<ResetReplicaReqPartitions> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<ResetReplicaReqPartitions> partitions) {
        this.partitions = partitions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetReplicaReq resetReplicaReq = (ResetReplicaReq) o;
        return Objects.equals(this.partitions, resetReplicaReq.partitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetReplicaReq {\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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
