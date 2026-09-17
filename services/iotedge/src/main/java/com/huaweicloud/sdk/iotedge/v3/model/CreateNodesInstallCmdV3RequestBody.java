package com.huaweicloud.sdk.iotedge.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateNodesInstallCmdV3RequestBody
 */
public class CreateNodesInstallCmdV3RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_info")

    private List<NodeConfig> nodeInfo = null;

    public CreateNodesInstallCmdV3RequestBody withNodeInfo(List<NodeConfig> nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public CreateNodesInstallCmdV3RequestBody addNodeInfoItem(NodeConfig nodeInfoItem) {
        if (this.nodeInfo == null) {
            this.nodeInfo = new ArrayList<>();
        }
        this.nodeInfo.add(nodeInfoItem);
        return this;
    }

    public CreateNodesInstallCmdV3RequestBody withNodeInfo(Consumer<List<NodeConfig>> nodeInfoSetter) {
        if (this.nodeInfo == null) {
            this.nodeInfo = new ArrayList<>();
        }
        nodeInfoSetter.accept(this.nodeInfo);
        return this;
    }

    /**
     * 集群节点名称列表
     * @return nodeInfo
     */
    public List<NodeConfig> getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(List<NodeConfig> nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNodesInstallCmdV3RequestBody that = (CreateNodesInstallCmdV3RequestBody) obj;
        return Objects.equals(this.nodeInfo, that.nodeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNodesInstallCmdV3RequestBody {\n");
        sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
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
