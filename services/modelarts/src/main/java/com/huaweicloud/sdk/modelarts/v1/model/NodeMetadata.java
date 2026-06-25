package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：节点metadata信息。
 */
public class NodeMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private NodeLabels labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private NodeVOAnnotations annotations;

    public NodeMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：节点名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**：创建时间。 **取值范围**：不涉及。
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public NodeMetadata withLabels(NodeLabels labels) {
        this.labels = labels;
        return this;
    }

    public NodeMetadata withLabels(Consumer<NodeLabels> labelsSetter) {
        if (this.labels == null) {
            this.labels = new NodeLabels();
            labelsSetter.accept(this.labels);
        }

        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    public NodeLabels getLabels() {
        return labels;
    }

    public void setLabels(NodeLabels labels) {
        this.labels = labels;
    }

    public NodeMetadata withAnnotations(NodeVOAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public NodeMetadata withAnnotations(Consumer<NodeVOAnnotations> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new NodeVOAnnotations();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public NodeVOAnnotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(NodeVOAnnotations annotations) {
        this.annotations = annotations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeMetadata that = (NodeMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.annotations, that.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationTimestamp, labels, annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
