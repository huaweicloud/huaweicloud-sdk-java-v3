package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeSelector
 */
public class NodeSelector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeSelectorTerms")

    private List<NodeSelectorTerm> nodeSelectorTerms = null;

    public NodeSelector withNodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
        return this;
    }

    public NodeSelector addNodeSelectorTermsItem(NodeSelectorTerm nodeSelectorTermsItem) {
        if (this.nodeSelectorTerms == null) {
            this.nodeSelectorTerms = new ArrayList<>();
        }
        this.nodeSelectorTerms.add(nodeSelectorTermsItem);
        return this;
    }

    public NodeSelector withNodeSelectorTerms(Consumer<List<NodeSelectorTerm>> nodeSelectorTermsSetter) {
        if (this.nodeSelectorTerms == null) {
            this.nodeSelectorTerms = new ArrayList<>();
        }
        nodeSelectorTermsSetter.accept(this.nodeSelectorTerms);
        return this;
    }

    /**
     * **参数解释**：必填项。节点选择器项的列表。这些项是“或”的关系。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return nodeSelectorTerms
     */
    public List<NodeSelectorTerm> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSelector that = (NodeSelector) obj;
        return Objects.equals(this.nodeSelectorTerms, that.nodeSelectorTerms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeSelectorTerms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSelector {\n");
        sb.append("    nodeSelectorTerms: ").append(toIndentedString(nodeSelectorTerms)).append("\n");
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
