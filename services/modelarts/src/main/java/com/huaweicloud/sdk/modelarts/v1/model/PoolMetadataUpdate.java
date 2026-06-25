package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池元数据更新信息。
 */
public class PoolMetadataUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private PoolMetadataUpdateAnnotations annotations;

    public PoolMetadataUpdate withAnnotations(PoolMetadataUpdateAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public PoolMetadataUpdate withAnnotations(Consumer<PoolMetadataUpdateAnnotations> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new PoolMetadataUpdateAnnotations();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public PoolMetadataUpdateAnnotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(PoolMetadataUpdateAnnotations annotations) {
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
        PoolMetadataUpdate that = (PoolMetadataUpdate) obj;
        return Objects.equals(this.annotations, that.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMetadataUpdate {\n");
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
