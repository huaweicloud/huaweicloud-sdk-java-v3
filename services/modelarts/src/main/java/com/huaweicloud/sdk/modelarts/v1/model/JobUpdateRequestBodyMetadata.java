package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：训练作业元信息。 **约束限制**：不涉及。
 */
public class JobUpdateRequestBodyMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotation")

    private Map<String, String> annotation = null;

    public JobUpdateRequestBodyMetadata withAnnotation(Map<String, String> annotation) {
        this.annotation = annotation;
        return this;
    }

    public JobUpdateRequestBodyMetadata putAnnotationItem(String key, String annotationItem) {
        if (this.annotation == null) {
            this.annotation = new HashMap<>();
        }
        this.annotation.put(key, annotationItem);
        return this;
    }

    public JobUpdateRequestBodyMetadata withAnnotation(Consumer<Map<String, String>> annotationSetter) {
        if (this.annotation == null) {
            this.annotation = new HashMap<>();
        }
        annotationSetter.accept(this.annotation);
        return this;
    }

    /**
     * **参数解释**：训练作业高级功能配置。可选取值如下：   - \"jupyter-lab/enable\": \"true\"（JupyterLab训练应用程序） **约束限制**：不涉及。
     * @return annotation
     */
    public Map<String, String> getAnnotation() {
        return annotation;
    }

    public void setAnnotation(Map<String, String> annotation) {
        this.annotation = annotation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobUpdateRequestBodyMetadata that = (JobUpdateRequestBodyMetadata) obj;
        return Objects.equals(this.annotation, that.annotation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobUpdateRequestBodyMetadata {\n");
        sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
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
