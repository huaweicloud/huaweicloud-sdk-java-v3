package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池的metadata信息。
 */
public class PoolMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private PoolMetaLabels labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private PoolMetaAnnotations annotations;

    public PoolMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：资源池的ID。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PoolMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**：资源池的创建时间。例如\"2025-11-01T03:49:41Z\"。 **取值范围**：不涉及。
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public PoolMetadata withLabels(PoolMetaLabels labels) {
        this.labels = labels;
        return this;
    }

    public PoolMetadata withLabels(Consumer<PoolMetaLabels> labelsSetter) {
        if (this.labels == null) {
            this.labels = new PoolMetaLabels();
            labelsSetter.accept(this.labels);
        }

        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    public PoolMetaLabels getLabels() {
        return labels;
    }

    public void setLabels(PoolMetaLabels labels) {
        this.labels = labels;
    }

    public PoolMetadata withAnnotations(PoolMetaAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public PoolMetadata withAnnotations(Consumer<PoolMetaAnnotations> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new PoolMetaAnnotations();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public PoolMetaAnnotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(PoolMetaAnnotations annotations) {
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
        PoolMetadata that = (PoolMetadata) obj;
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
        sb.append("class PoolMetadata {\n");
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
