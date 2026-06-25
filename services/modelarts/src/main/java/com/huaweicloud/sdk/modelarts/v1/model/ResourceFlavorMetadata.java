package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：资源规格的元信息。
 */
public class ResourceFlavorMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private ResourceFlavorLabel labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private ResourceFlavorAnnotation annotations;

    public ResourceFlavorMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：资源规格的ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceFlavorMetadata withLabels(ResourceFlavorLabel labels) {
        this.labels = labels;
        return this;
    }

    public ResourceFlavorMetadata withLabels(Consumer<ResourceFlavorLabel> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ResourceFlavorLabel();
            labelsSetter.accept(this.labels);
        }

        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    public ResourceFlavorLabel getLabels() {
        return labels;
    }

    public void setLabels(ResourceFlavorLabel labels) {
        this.labels = labels;
    }

    public ResourceFlavorMetadata withAnnotations(ResourceFlavorAnnotation annotations) {
        this.annotations = annotations;
        return this;
    }

    public ResourceFlavorMetadata withAnnotations(Consumer<ResourceFlavorAnnotation> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new ResourceFlavorAnnotation();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public ResourceFlavorAnnotation getAnnotations() {
        return annotations;
    }

    public void setAnnotations(ResourceFlavorAnnotation annotations) {
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
        ResourceFlavorMetadata that = (ResourceFlavorMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.annotations, that.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, labels, annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFlavorMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
