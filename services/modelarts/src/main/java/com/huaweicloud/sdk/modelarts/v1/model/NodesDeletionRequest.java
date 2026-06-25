package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除节点请求体。
 */
public class NodesDeletionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteNodeNames")

    private List<String> deleteNodeNames = null;

    public NodesDeletionRequest withDeleteNodeNames(List<String> deleteNodeNames) {
        this.deleteNodeNames = deleteNodeNames;
        return this;
    }

    public NodesDeletionRequest addDeleteNodeNamesItem(String deleteNodeNamesItem) {
        if (this.deleteNodeNames == null) {
            this.deleteNodeNames = new ArrayList<>();
        }
        this.deleteNodeNames.add(deleteNodeNamesItem);
        return this;
    }

    public NodesDeletionRequest withDeleteNodeNames(Consumer<List<String>> deleteNodeNamesSetter) {
        if (this.deleteNodeNames == null) {
            this.deleteNodeNames = new ArrayList<>();
        }
        deleteNodeNamesSetter.accept(this.deleteNodeNames);
        return this;
    }

    /**
     * **参数解释**：待删除的节点名称列表。 **约束限制**：不涉及。
     * @return deleteNodeNames
     */
    public List<String> getDeleteNodeNames() {
        return deleteNodeNames;
    }

    public void setDeleteNodeNames(List<String> deleteNodeNames) {
        this.deleteNodeNames = deleteNodeNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodesDeletionRequest that = (NodesDeletionRequest) obj;
        return Objects.equals(this.deleteNodeNames, that.deleteNodeNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteNodeNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodesDeletionRequest {\n");
        sb.append("    deleteNodeNames: ").append(toIndentedString(deleteNodeNames)).append("\n");
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
