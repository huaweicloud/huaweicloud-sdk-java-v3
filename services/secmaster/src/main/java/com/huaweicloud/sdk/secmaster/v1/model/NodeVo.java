package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeVo
 */
public class NodeVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private List<ArgsVo> args = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_status")

    private NodeStatus nodeStatus;

    public NodeVo withArgs(List<ArgsVo> args) {
        this.args = args;
        return this;
    }

    public NodeVo addArgsItem(ArgsVo argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public NodeVo withArgs(Consumer<List<ArgsVo>> argsSetter) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * 相关描述信息
     * @return args
     */
    public List<ArgsVo> getArgs() {
        return args;
    }

    public void setArgs(List<ArgsVo> args) {
        this.args = args;
    }

    public NodeVo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * UUID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NodeVo withNodeStatus(NodeStatus nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    /**
     * Get nodeStatus
     * @return nodeStatus
     */
    public NodeStatus getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(NodeStatus nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeVo that = (NodeVo) obj;
        return Objects.equals(this.args, that.args) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeStatus, that.nodeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(args, nodeId, nodeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeVo {\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeStatus: ").append(toIndentedString(nodeStatus)).append("\n");
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
