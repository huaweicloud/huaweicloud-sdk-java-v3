package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 微服务引擎专享版CCE节点列表
 */
public class SpecClusterNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_nodes")

    private List<ClusterNode> clusterNodes = null;

    public SpecClusterNode withClusterNodes(List<ClusterNode> clusterNodes) {
        this.clusterNodes = clusterNodes;
        return this;
    }

    public SpecClusterNode addClusterNodesItem(ClusterNode clusterNodesItem) {
        if (this.clusterNodes == null) {
            this.clusterNodes = new ArrayList<>();
        }
        this.clusterNodes.add(clusterNodesItem);
        return this;
    }

    public SpecClusterNode withClusterNodes(Consumer<List<ClusterNode>> clusterNodesSetter) {
        if (this.clusterNodes == null) {
            this.clusterNodes = new ArrayList<>();
        }
        clusterNodesSetter.accept(this.clusterNodes);
        return this;
    }

    /**
     * CCE节点信息。
     * @return clusterNodes
     */
    public List<ClusterNode> getClusterNodes() {
        return clusterNodes;
    }

    public void setClusterNodes(List<ClusterNode> clusterNodes) {
        this.clusterNodes = clusterNodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpecClusterNode specClusterNode = (SpecClusterNode) o;
        return Objects.equals(this.clusterNodes, specClusterNode.clusterNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecClusterNode {\n");
        sb.append("    clusterNodes: ").append(toIndentedString(clusterNodes)).append("\n");
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
