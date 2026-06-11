package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Arrow Schema中的字段定义，包含字段名、类型、是否可空及元数据。
 */
public class ArrowField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private ArrowType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nullable")

    private Boolean nullable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<ArrowField> children = null;

    public ArrowField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrowField withType(ArrowType type) {
        this.type = type;
        return this;
    }

    public ArrowField withType(Consumer<ArrowType> typeSetter) {
        if (this.type == null) {
            this.type = new ArrowType();
            typeSetter.accept(this.type);
        }

        return this;
    }

    /**
     * Get type
     * @return type
     */
    public ArrowType getType() {
        return type;
    }

    public void setType(ArrowType type) {
        this.type = type;
    }

    public ArrowField withNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    /**
     * 字段是否允许为null。
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public ArrowField withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public ArrowField putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public ArrowField withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 字段的元数据信息。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public ArrowField withChildren(List<ArrowField> children) {
        this.children = children;
        return this;
    }

    public ArrowField addChildrenItem(ArrowField childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ArrowField withChildren(Consumer<List<ArrowField>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * Get children
     * @return children
     */
    public List<ArrowField> getChildren() {
        return children;
    }

    public void setChildren(List<ArrowField> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArrowField that = (ArrowField) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.nullable, that.nullable) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, nullable, metadata, children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArrowField {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
