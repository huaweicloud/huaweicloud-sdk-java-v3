package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点限制检查状态
 */
public class NodeCheckStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeStageStatus")

    private List<NodeStageStatus> nodeStageStatus = null;

    public NodeCheckStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 状态，取值如下 - Init: 初始化 - Running 运行中 - Success 成功 - Failed 失败
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public NodeCheckStatus withNodeStageStatus(List<NodeStageStatus> nodeStageStatus) {
        this.nodeStageStatus = nodeStageStatus;
        return this;
    }

    public NodeCheckStatus addNodeStageStatusItem(NodeStageStatus nodeStageStatusItem) {
        if (this.nodeStageStatus == null) {
            this.nodeStageStatus = new ArrayList<>();
        }
        this.nodeStageStatus.add(nodeStageStatusItem);
        return this;
    }

    public NodeCheckStatus withNodeStageStatus(Consumer<List<NodeStageStatus>> nodeStageStatusSetter) {
        if (this.nodeStageStatus == null) {
            this.nodeStageStatus = new ArrayList<>();
        }
        nodeStageStatusSetter.accept(this.nodeStageStatus);
        return this;
    }

    /**
     * 节点检查状态
     * @return nodeStageStatus
     */
    public List<NodeStageStatus> getNodeStageStatus() {
        return nodeStageStatus;
    }

    public void setNodeStageStatus(List<NodeStageStatus> nodeStageStatus) {
        this.nodeStageStatus = nodeStageStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeCheckStatus that = (NodeCheckStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.nodeStageStatus, that.nodeStageStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, nodeStageStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeCheckStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    nodeStageStatus: ").append(toIndentedString(nodeStageStatus)).append("\n");
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
