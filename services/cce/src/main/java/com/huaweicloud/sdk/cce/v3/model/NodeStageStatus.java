package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点检查状态
 */
public class NodeStageStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeInfo")

    private NodeInfo nodeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "itemsStatus")

    private List<PreCheckItemStatus> itemsStatus = null;

    public NodeStageStatus withNodeInfo(NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public NodeStageStatus withNodeInfo(Consumer<NodeInfo> nodeInfoSetter) {
        if (this.nodeInfo == null) {
            this.nodeInfo = new NodeInfo();
            nodeInfoSetter.accept(this.nodeInfo);
        }

        return this;
    }

    /**
     * Get nodeInfo
     * @return nodeInfo
     */
    public NodeInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public NodeStageStatus withItemsStatus(List<PreCheckItemStatus> itemsStatus) {
        this.itemsStatus = itemsStatus;
        return this;
    }

    public NodeStageStatus addItemsStatusItem(PreCheckItemStatus itemsStatusItem) {
        if (this.itemsStatus == null) {
            this.itemsStatus = new ArrayList<>();
        }
        this.itemsStatus.add(itemsStatusItem);
        return this;
    }

    public NodeStageStatus withItemsStatus(Consumer<List<PreCheckItemStatus>> itemsStatusSetter) {
        if (this.itemsStatus == null) {
            this.itemsStatus = new ArrayList<>();
        }
        itemsStatusSetter.accept(this.itemsStatus);
        return this;
    }

    /**
     * 检查项状态集合
     * @return itemsStatus
     */
    public List<PreCheckItemStatus> getItemsStatus() {
        return itemsStatus;
    }

    public void setItemsStatus(List<PreCheckItemStatus> itemsStatus) {
        this.itemsStatus = itemsStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeStageStatus that = (NodeStageStatus) obj;
        return Objects.equals(this.nodeInfo, that.nodeInfo) && Objects.equals(this.itemsStatus, that.itemsStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeInfo, itemsStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeStageStatus {\n");
        sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
        sb.append("    itemsStatus: ").append(toIndentedString(itemsStatus)).append("\n");
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
