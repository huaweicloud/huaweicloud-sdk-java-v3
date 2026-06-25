package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchRebootPoolNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNames")

    private List<String> nodeNames = null;

    public BatchRebootPoolNodesResponse withNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }

    public BatchRebootPoolNodesResponse addNodeNamesItem(String nodeNamesItem) {
        if (this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        this.nodeNames.add(nodeNamesItem);
        return this;
    }

    public BatchRebootPoolNodesResponse withNodeNames(Consumer<List<String>> nodeNamesSetter) {
        if (this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        nodeNamesSetter.accept(this.nodeNames);
        return this;
    }

    /**
     * **参数解释**：节点名称集合。 **约束限制**：不涉及。
     * @return nodeNames
     */
    public List<String> getNodeNames() {
        return nodeNames;
    }

    public void setNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRebootPoolNodesResponse that = (BatchRebootPoolNodesResponse) obj;
        return Objects.equals(this.nodeNames, that.nodeNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRebootPoolNodesResponse {\n");
        sb.append("    nodeNames: ").append(toIndentedString(nodeNames)).append("\n");
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
