package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：空节点选择器或空节点选择器项不匹配任何对象。 **约束限制**：要求是按“与”（AND）逻辑进行组合。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class NodeSelectorTerm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchExpressions")

    private List<NodeSelectorRequirement> matchExpressions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchFields")

    private List<NodeSelectorRequirement> matchFields = null;

    public NodeSelectorTerm withMatchExpressions(List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public NodeSelectorTerm addMatchExpressionsItem(NodeSelectorRequirement matchExpressionsItem) {
        if (this.matchExpressions == null) {
            this.matchExpressions = new ArrayList<>();
        }
        this.matchExpressions.add(matchExpressionsItem);
        return this;
    }

    public NodeSelectorTerm withMatchExpressions(Consumer<List<NodeSelectorRequirement>> matchExpressionsSetter) {
        if (this.matchExpressions == null) {
            this.matchExpressions = new ArrayList<>();
        }
        matchExpressionsSetter.accept(this.matchExpressions);
        return this;
    }

    /**
     * **参数解释**：按节点标签列出的节点选择器要求。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return matchExpressions
     */
    public List<NodeSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public NodeSelectorTerm withMatchFields(List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
        return this;
    }

    public NodeSelectorTerm addMatchFieldsItem(NodeSelectorRequirement matchFieldsItem) {
        if (this.matchFields == null) {
            this.matchFields = new ArrayList<>();
        }
        this.matchFields.add(matchFieldsItem);
        return this;
    }

    public NodeSelectorTerm withMatchFields(Consumer<List<NodeSelectorRequirement>> matchFieldsSetter) {
        if (this.matchFields == null) {
            this.matchFields = new ArrayList<>();
        }
        matchFieldsSetter.accept(this.matchFields);
        return this;
    }

    /**
     * **参数解释**：按节点字段列出的节点选择器要求。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return matchFields
     */
    public List<NodeSelectorRequirement> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSelectorTerm that = (NodeSelectorTerm) obj;
        return Objects.equals(this.matchExpressions, that.matchExpressions)
            && Objects.equals(this.matchFields, that.matchFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchExpressions, matchFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSelectorTerm {\n");
        sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
        sb.append("    matchFields: ").append(toIndentedString(matchFields)).append("\n");
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
