package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ResourcesRg */
public class ResourcesRg {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private Namespace namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<Dimension> dimensions = null;

    public ResourcesRg withNamespace(Namespace namespace) {
        this.namespace = namespace;
        return this;
    }

    public ResourcesRg withNamespace(Consumer<Namespace> namespaceSetter) {
        if (this.namespace == null) {
            this.namespace = new Namespace();
            namespaceSetter.accept(this.namespace);
        }

        return this;
    }

    /** Get namespace
     * 
     * @return namespace */
    public Namespace getNamespace() {
        return namespace;
    }

    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }

    public ResourcesRg withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ResourcesRg addDimensionsItem(Dimension dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ResourcesRg withDimensions(Consumer<List<Dimension>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /** 资源实例的维度信息
     * 
     * @return dimensions */
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesRg resourcesRg = (ResourcesRg) o;
        return Objects.equals(this.namespace, resourcesRg.namespace)
            && Objects.equals(this.dimensions, resourcesRg.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, dimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcesRg {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
