package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ShowInstanceTopicDetailRespPartitions */
public class ShowInstanceTopicDetailRespPartitions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leader")

    private Integer leader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leo")

    private Integer leo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw")

    private Integer hw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lso")

    private Integer lso;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_timestamp")

    private Long lastUpdateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private List<ShowInstanceTopicDetailRespReplicas> replicas = null;

    public ShowInstanceTopicDetailRespPartitions withPartition(Integer partition) {
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

    public ShowInstanceTopicDetailRespPartitions withLeader(Integer leader) {
        this.leader = leader;
        return this;
    }

    /** leader副本所在节点的id。
     * 
     * @return leader */
    public Integer getLeader() {
        return leader;
    }

    public void setLeader(Integer leader) {
        this.leader = leader;
    }

    public ShowInstanceTopicDetailRespPartitions withLeo(Integer leo) {
        this.leo = leo;
        return this;
    }

    /** 分区leader副本的LEO（Log End Offset）。
     * 
     * @return leo */
    public Integer getLeo() {
        return leo;
    }

    public void setLeo(Integer leo) {
        this.leo = leo;
    }

    public ShowInstanceTopicDetailRespPartitions withHw(Integer hw) {
        this.hw = hw;
        return this;
    }

    /** 分区高水位（HW，High Watermark）。
     * 
     * @return hw */
    public Integer getHw() {
        return hw;
    }

    public void setHw(Integer hw) {
        this.hw = hw;
    }

    public ShowInstanceTopicDetailRespPartitions withLso(Integer lso) {
        this.lso = lso;
        return this;
    }

    /** 分区leader副本的LSO（Log Start Offset）。
     * 
     * @return lso */
    public Integer getLso() {
        return lso;
    }

    public void setLso(Integer lso) {
        this.lso = lso;
    }

    public ShowInstanceTopicDetailRespPartitions withLastUpdateTimestamp(Long lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        return this;
    }

    /** 分区上次写入消息的时间。
     * 
     * @return lastUpdateTimestamp */
    public Long getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Long lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    public ShowInstanceTopicDetailRespPartitions withReplicas(List<ShowInstanceTopicDetailRespReplicas> replicas) {
        this.replicas = replicas;
        return this;
    }

    public ShowInstanceTopicDetailRespPartitions addReplicasItem(ShowInstanceTopicDetailRespReplicas replicasItem) {
        if (this.replicas == null) {
            this.replicas = new ArrayList<>();
        }
        this.replicas.add(replicasItem);
        return this;
    }

    public ShowInstanceTopicDetailRespPartitions withReplicas(
        Consumer<List<ShowInstanceTopicDetailRespReplicas>> replicasSetter) {
        if (this.replicas == null) {
            this.replicas = new ArrayList<>();
        }
        replicasSetter.accept(this.replicas);
        return this;
    }

    /** 副本列表。
     * 
     * @return replicas */
    public List<ShowInstanceTopicDetailRespReplicas> getReplicas() {
        return replicas;
    }

    public void setReplicas(List<ShowInstanceTopicDetailRespReplicas> replicas) {
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
        ShowInstanceTopicDetailRespPartitions showInstanceTopicDetailRespPartitions =
            (ShowInstanceTopicDetailRespPartitions) o;
        return Objects.equals(this.partition, showInstanceTopicDetailRespPartitions.partition)
            && Objects.equals(this.leader, showInstanceTopicDetailRespPartitions.leader)
            && Objects.equals(this.leo, showInstanceTopicDetailRespPartitions.leo)
            && Objects.equals(this.hw, showInstanceTopicDetailRespPartitions.hw)
            && Objects.equals(this.lso, showInstanceTopicDetailRespPartitions.lso)
            && Objects.equals(this.lastUpdateTimestamp, showInstanceTopicDetailRespPartitions.lastUpdateTimestamp)
            && Objects.equals(this.replicas, showInstanceTopicDetailRespPartitions.replicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partition, leader, leo, hw, lso, lastUpdateTimestamp, replicas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceTopicDetailRespPartitions {\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
        sb.append("    leo: ").append(toIndentedString(leo)).append("\n");
        sb.append("    hw: ").append(toIndentedString(hw)).append("\n");
        sb.append("    lso: ").append(toIndentedString(lso)).append("\n");
        sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
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
