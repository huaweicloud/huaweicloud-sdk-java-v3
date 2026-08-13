package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Paimon Schema中的字段定义，包含字段名、类型、是否可空及元数据。
 */
public class PaimonField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private PaimonType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nullable")

    private Boolean nullable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<PaimonField> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public PaimonField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaimonField withType(PaimonType type) {
        this.type = type;
        return this;
    }

    public PaimonField withType(Consumer<PaimonType> typeSetter) {
        if (this.type == null) {
            this.type = new PaimonType();
            typeSetter.accept(this.type);
        }

        return this;
    }

    /**
     * Get type
     * @return type
     */
    public PaimonType getType() {
        return type;
    }

    public void setType(PaimonType type) {
        this.type = type;
    }

    public PaimonField withNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    /**
     * 字段是否允许为null
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public PaimonField withChildren(List<PaimonField> children) {
        this.children = children;
        return this;
    }

    public PaimonField addChildrenItem(PaimonField childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public PaimonField withChildren(Consumer<List<PaimonField>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子字段
     * @return children
     */
    public List<PaimonField> getChildren() {
        return children;
    }

    public void setChildren(List<PaimonField> children) {
        this.children = children;
    }

    public PaimonField withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 字段描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PaimonField that = (PaimonField) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.nullable, that.nullable) && Objects.equals(this.children, that.children)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, nullable, children, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaimonField {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
