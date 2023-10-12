package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MeshExtendParams
 */
public class MeshExtendParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    private List<MeshCluster> clusters = null;

    public MeshExtendParams withClusters(List<MeshCluster> clusters) {
        this.clusters = clusters;
        return this;
    }

    public MeshExtendParams addClustersItem(MeshCluster clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public MeshExtendParams withClusters(Consumer<List<MeshCluster>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * 网格内集群信息，仅基础版使用
     * @return clusters
     */
    public List<MeshCluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<MeshCluster> clusters) {
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
        MeshExtendParams that = (MeshExtendParams) obj;
        return Objects.equals(this.clusters, that.clusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeshExtendParams {\n");
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
