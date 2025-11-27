package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceBindingSpec
 */
public class ResourceBindingSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private Object resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propagateDeps")

    private Boolean propagateDeps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicaRequirements")

    private Object replicaRequirements;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private Integer replicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "placement")

    private Placement placement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    private List<TargetCluster> clusters = null;

    public ResourceBindingSpec withResource(Object resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 要传播的Kubernetes资源引用
     * @return resource
     */
    public Object getResource() {
        return resource;
    }

    public void setResource(Object resource) {
        this.resource = resource;
    }

    public ResourceBindingSpec withPropagateDeps(Boolean propagateDeps) {
        this.propagateDeps = propagateDeps;
        return this;
    }

    /**
     * 是否自动传播相关资源
     * @return propagateDeps
     */
    public Boolean getPropagateDeps() {
        return propagateDeps;
    }

    public void setPropagateDeps(Boolean propagateDeps) {
        this.propagateDeps = propagateDeps;
    }

    public ResourceBindingSpec withReplicaRequirements(Object replicaRequirements) {
        this.replicaRequirements = replicaRequirements;
        return this;
    }

    /**
     * 定义每个副本的需求
     * @return replicaRequirements
     */
    public Object getReplicaRequirements() {
        return replicaRequirements;
    }

    public void setReplicaRequirements(Object replicaRequirements) {
        this.replicaRequirements = replicaRequirements;
    }

    public ResourceBindingSpec withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * 要创建的副本数量
     * @return replicas
     */
    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public ResourceBindingSpec withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }

    public ResourceBindingSpec withPlacement(Consumer<Placement> placementSetter) {
        if (this.placement == null) {
            this.placement = new Placement();
            placementSetter.accept(this.placement);
        }

        return this;
    }

    /**
     * Get placement
     * @return placement
     */
    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public ResourceBindingSpec withClusters(List<TargetCluster> clusters) {
        this.clusters = clusters;
        return this;
    }

    public ResourceBindingSpec addClustersItem(TargetCluster clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public ResourceBindingSpec withClusters(Consumer<List<TargetCluster>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * 目标成员集群列表
     * @return clusters
     */
    public List<TargetCluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<TargetCluster> clusters) {
        this.clusters = clusters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceBindingSpec that = (ResourceBindingSpec) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.propagateDeps, that.propagateDeps)
            && Objects.equals(this.replicaRequirements, that.replicaRequirements)
            && Objects.equals(this.replicas, that.replicas) && Objects.equals(this.placement, that.placement)
            && Objects.equals(this.clusters, that.clusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, propagateDeps, replicaRequirements, replicas, placement, clusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceBindingSpec {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    propagateDeps: ").append(toIndentedString(propagateDeps)).append("\n");
        sb.append("    replicaRequirements: ").append(toIndentedString(replicaRequirements)).append("\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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
