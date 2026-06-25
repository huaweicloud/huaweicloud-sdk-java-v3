package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchLockPoolNodesRequestBody
 */
public class BatchLockPoolNodesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNames")

    private List<String> nodeNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    public BatchLockPoolNodesRequestBody withNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }

    public BatchLockPoolNodesRequestBody addNodeNamesItem(String nodeNamesItem) {
        if (this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        this.nodeNames.add(nodeNamesItem);
        return this;
    }

    public BatchLockPoolNodesRequestBody withNodeNames(Consumer<List<String>> nodeNamesSetter) {
        if (this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        nodeNamesSetter.accept(this.nodeNames);
        return this;
    }

    /**
     * **参数解释**：需要变更锁状态的节点名称列表。 **约束限制**：不涉及。
     * @return nodeNames
     */
    public List<String> getNodeNames() {
        return nodeNames;
    }

    public void setNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
    }

    public BatchLockPoolNodesRequestBody withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public BatchLockPoolNodesRequestBody addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public BatchLockPoolNodesRequestBody withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释**：变更的功能类型。 **约束限制**：不涉及。
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchLockPoolNodesRequestBody that = (BatchLockPoolNodesRequestBody) obj;
        return Objects.equals(this.nodeNames, that.nodeNames) && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNames, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchLockPoolNodesRequestBody {\n");
        sb.append("    nodeNames: ").append(toIndentedString(nodeNames)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
