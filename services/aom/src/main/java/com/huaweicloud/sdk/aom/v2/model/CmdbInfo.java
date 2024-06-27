package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CmdbInfo
 */
public class CmdbInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<NodeInfo> nodeIds = null;

    public CmdbInfo withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CmdbInfo withNodeIds(List<NodeInfo> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public CmdbInfo addNodeIdsItem(NodeInfo nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public CmdbInfo withNodeIds(Consumer<List<NodeInfo>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 节点信息列表。
     * @return nodeIds
     */
    public List<NodeInfo> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<NodeInfo> nodeIds) {
        this.nodeIds = nodeIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CmdbInfo that = (CmdbInfo) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.nodeIds, that.nodeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, nodeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CmdbInfo {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
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
