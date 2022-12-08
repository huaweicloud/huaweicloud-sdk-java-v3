package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群信息
 */
public class OprecordCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_infos")

    private List<NodeInfo> nodeInfos = null;

    public OprecordCluster withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public OprecordCluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OprecordCluster withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public OprecordCluster withNodeInfos(List<NodeInfo> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }

    public OprecordCluster addNodeInfosItem(NodeInfo nodeInfosItem) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        this.nodeInfos.add(nodeInfosItem);
        return this;
    }

    public OprecordCluster withNodeInfos(Consumer<List<NodeInfo>> nodeInfosSetter) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        nodeInfosSetter.accept(this.nodeInfos);
        return this;
    }

    /**
     * 节点信息
     * @return nodeInfos
     */
    public List<NodeInfo> getNodeInfos() {
        return nodeInfos;
    }

    public void setNodeInfos(List<NodeInfo> nodeInfos) {
        this.nodeInfos = nodeInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OprecordCluster oprecordCluster = (OprecordCluster) o;
        return Objects.equals(this.clusterType, oprecordCluster.clusterType)
            && Objects.equals(this.name, oprecordCluster.name)
            && Objects.equals(this.clusterId, oprecordCluster.clusterId)
            && Objects.equals(this.nodeInfos, oprecordCluster.nodeInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterType, name, clusterId, nodeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OprecordCluster {\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodeInfos: ").append(toIndentedString(nodeInfos)).append("\n");
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
