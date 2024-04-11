package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StartInstanceRequestBody
 */
public class StartInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    public StartInstanceRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public StartInstanceRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public StartInstanceRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 需要启动的节点的ID，取值不能为null，如果为空列表则启动整个实例
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
        StartInstanceRequestBody that = (StartInstanceRequestBody) obj;
        return Objects.equals(this.nodeIds, that.nodeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartInstanceRequestBody {\n");
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
