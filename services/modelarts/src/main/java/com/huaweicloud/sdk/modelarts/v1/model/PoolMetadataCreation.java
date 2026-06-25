package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建资源池时metadata信息。
 */
public class PoolMetadataCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private PoolLabelsCreation labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private PoolAnnotationsCreation annotations;

    public PoolMetadataCreation withLabels(PoolLabelsCreation labels) {
        this.labels = labels;
        return this;
    }

    public PoolMetadataCreation withLabels(Consumer<PoolLabelsCreation> labelsSetter) {
        if (this.labels == null) {
            this.labels = new PoolLabelsCreation();
            labelsSetter.accept(this.labels);
        }

        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    public PoolLabelsCreation getLabels() {
        return labels;
    }

    public void setLabels(PoolLabelsCreation labels) {
        this.labels = labels;
    }

    public PoolMetadataCreation withAnnotations(PoolAnnotationsCreation annotations) {
        this.annotations = annotations;
        return this;
    }

    public PoolMetadataCreation withAnnotations(Consumer<PoolAnnotationsCreation> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new PoolAnnotationsCreation();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public PoolAnnotationsCreation getAnnotations() {
        return annotations;
    }

    public void setAnnotations(PoolAnnotationsCreation annotations) {
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
        PoolMetadataCreation that = (PoolMetadataCreation) obj;
        return Objects.equals(this.labels, that.labels) && Objects.equals(this.annotations, that.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels, annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMetadataCreation {\n");
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
