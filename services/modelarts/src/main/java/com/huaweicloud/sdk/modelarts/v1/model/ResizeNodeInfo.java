package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResizeNodeInfo
 */
public class ResizeNodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batchUID")

    private String batchUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteNodeNames")

    private List<String> deleteNodeNames = null;

    public ResizeNodeInfo withBatchUID(String batchUID) {
        this.batchUID = batchUID;
        return this;
    }

    /**
     * **参数解释**：节点批次ID，批次变更时需要，可以从节点的os.modelarts.node/batch.uid标签中获取。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return batchUID
     */
    public String getBatchUID() {
        return batchUID;
    }

    public void setBatchUID(String batchUID) {
        this.batchUID = batchUID;
    }

    public ResizeNodeInfo withDeleteNodeNames(List<String> deleteNodeNames) {
        this.deleteNodeNames = deleteNodeNames;
        return this;
    }

    public ResizeNodeInfo addDeleteNodeNamesItem(String deleteNodeNamesItem) {
        if (this.deleteNodeNames == null) {
            this.deleteNodeNames = new ArrayList<>();
        }
        this.deleteNodeNames.add(deleteNodeNamesItem);
        return this;
    }

    public ResizeNodeInfo withDeleteNodeNames(Consumer<List<String>> deleteNodeNamesSetter) {
        if (this.deleteNodeNames == null) {
            this.deleteNodeNames = new ArrayList<>();
        }
        deleteNodeNamesSetter.accept(this.deleteNodeNames);
        return this;
    }

    /**
     * **参数解释**：批次缩容场景，指定要缩容的节点名称列表。 **约束限制**：不涉及。
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
        ResizeNodeInfo that = (ResizeNodeInfo) obj;
        return Objects.equals(this.batchUID, that.batchUID)
            && Objects.equals(this.deleteNodeNames, that.deleteNodeNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchUID, deleteNodeNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeNodeInfo {\n");
        sb.append("    batchUID: ").append(toIndentedString(batchUID)).append("\n");
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
