package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourceMetricsMetadata
 */
public class ResourceMetricsMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Object labels;

    public ResourceMetricsMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：资源指标的名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceMetricsMetadata withLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    /**
     * **参数解释**：资源指标的标签信息
     * @return labels
     */
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceMetricsMetadata that = (ResourceMetricsMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceMetricsMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
