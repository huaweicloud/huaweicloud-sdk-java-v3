package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组件外部数据源
 */
public class ComponentExternalDatasource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private List<String> types = null;

    public ComponentExternalDatasource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 外部数据源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentExternalDatasource withTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public ComponentExternalDatasource addTypesItem(String typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public ComponentExternalDatasource withTypes(Consumer<List<String>> typesSetter) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * 外部数据源类型
     * @return types
     */
    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentExternalDatasource that = (ComponentExternalDatasource) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.types, that.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, types);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentExternalDatasource {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
