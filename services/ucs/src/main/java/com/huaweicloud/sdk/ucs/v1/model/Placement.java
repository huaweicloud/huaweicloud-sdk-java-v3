package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Placement
 */
public class Placement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterAffinity")

    private ClusterAffinity clusterAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterTolerations")

    private List<Toleration> clusterTolerations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicaScheduling")

    private Object replicaScheduling;

    public Placement withClusterAffinity(ClusterAffinity clusterAffinity) {
        this.clusterAffinity = clusterAffinity;
        return this;
    }

    public Placement withClusterAffinity(Consumer<ClusterAffinity> clusterAffinitySetter) {
        if (this.clusterAffinity == null) {
            this.clusterAffinity = new ClusterAffinity();
            clusterAffinitySetter.accept(this.clusterAffinity);
        }

        return this;
    }

    /**
     * Get clusterAffinity
     * @return clusterAffinity
     */
    public ClusterAffinity getClusterAffinity() {
        return clusterAffinity;
    }

    public void setClusterAffinity(ClusterAffinity clusterAffinity) {
        this.clusterAffinity = clusterAffinity;
    }

    public Placement withClusterTolerations(List<Toleration> clusterTolerations) {
        this.clusterTolerations = clusterTolerations;
        return this;
    }

    public Placement addClusterTolerationsItem(Toleration clusterTolerationsItem) {
        if (this.clusterTolerations == null) {
            this.clusterTolerations = new ArrayList<>();
        }
        this.clusterTolerations.add(clusterTolerationsItem);
        return this;
    }

    public Placement withClusterTolerations(Consumer<List<Toleration>> clusterTolerationsSetter) {
        if (this.clusterTolerations == null) {
            this.clusterTolerations = new ArrayList<>();
        }
        clusterTolerationsSetter.accept(this.clusterTolerations);
        return this;
    }

    /**
     * 集群容忍规则
     * @return clusterTolerations
     */
    public List<Toleration> getClusterTolerations() {
        return clusterTolerations;
    }

    public void setClusterTolerations(List<Toleration> clusterTolerations) {
        this.clusterTolerations = clusterTolerations;
    }

    public Placement withReplicaScheduling(Object replicaScheduling) {
        this.replicaScheduling = replicaScheduling;
        return this;
    }

    /**
     * 定义如何在成员集群间分配副本
     * @return replicaScheduling
     */
    public Object getReplicaScheduling() {
        return replicaScheduling;
    }

    public void setReplicaScheduling(Object replicaScheduling) {
        this.replicaScheduling = replicaScheduling;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Placement that = (Placement) obj;
        return Objects.equals(this.clusterAffinity, that.clusterAffinity)
            && Objects.equals(this.clusterTolerations, that.clusterTolerations)
            && Objects.equals(this.replicaScheduling, that.replicaScheduling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterAffinity, clusterTolerations, replicaScheduling);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Placement {\n");
        sb.append("    clusterAffinity: ").append(toIndentedString(clusterAffinity)).append("\n");
        sb.append("    clusterTolerations: ").append(toIndentedString(clusterTolerations)).append("\n");
        sb.append("    replicaScheduling: ").append(toIndentedString(replicaScheduling)).append("\n");
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
