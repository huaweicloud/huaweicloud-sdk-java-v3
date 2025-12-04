package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReduceNodeOpenRequest
 */
public class ReduceNodeOpenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    public ReduceNodeOpenRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ReduceNodeOpenRequest withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public ReduceNodeOpenRequest addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public ReduceNodeOpenRequest withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 节点id列表。
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
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
        ReduceNodeOpenRequest that = (ReduceNodeOpenRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeIds, that.nodeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, nodeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReduceNodeOpenRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
