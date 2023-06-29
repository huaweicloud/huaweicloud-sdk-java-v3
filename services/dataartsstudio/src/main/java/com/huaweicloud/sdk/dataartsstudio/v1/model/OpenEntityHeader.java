package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpenEntityHeader
 */
public class OpenEntityHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private List<Connection> connection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_text")

    private String displayText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagHeader> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification_names")

    private List<String> classificationNames = null;

    public OpenEntityHeader withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 属性
     * @return attributes
     */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public OpenEntityHeader withConnection(List<Connection> connection) {
        this.connection = connection;
        return this;
    }

    public OpenEntityHeader addConnectionItem(Connection connectionItem) {
        if (this.connection == null) {
            this.connection = new ArrayList<>();
        }
        this.connection.add(connectionItem);
        return this;
    }

    public OpenEntityHeader withConnection(Consumer<List<Connection>> connectionSetter) {
        if (this.connection == null) {
            this.connection = new ArrayList<>();
        }
        connectionSetter.accept(this.connection);
        return this;
    }

    /**
     * 数据连接
     * @return connection
     */
    public List<Connection> getConnection() {
        return connection;
    }

    public void setConnection(List<Connection> connection) {
        this.connection = connection;
    }

    public OpenEntityHeader withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * 展示文档
     * @return displayText
     */
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public OpenEntityHeader withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 资产guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public OpenEntityHeader withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 类型名称
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public OpenEntityHeader withTags(List<TagHeader> tags) {
        this.tags = tags;
        return this;
    }

    public OpenEntityHeader addTagsItem(TagHeader tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public OpenEntityHeader withTags(Consumer<List<TagHeader>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<TagHeader> getTags() {
        return tags;
    }

    public void setTags(List<TagHeader> tags) {
        this.tags = tags;
    }

    public OpenEntityHeader withClassificationNames(List<String> classificationNames) {
        this.classificationNames = classificationNames;
        return this;
    }

    public OpenEntityHeader addClassificationNamesItem(String classificationNamesItem) {
        if (this.classificationNames == null) {
            this.classificationNames = new ArrayList<>();
        }
        this.classificationNames.add(classificationNamesItem);
        return this;
    }

    public OpenEntityHeader withClassificationNames(Consumer<List<String>> classificationNamesSetter) {
        if (this.classificationNames == null) {
            this.classificationNames = new ArrayList<>();
        }
        classificationNamesSetter.accept(this.classificationNames);
        return this;
    }

    /**
     * 分类名称列表
     * @return classificationNames
     */
    public List<String> getClassificationNames() {
        return classificationNames;
    }

    public void setClassificationNames(List<String> classificationNames) {
        this.classificationNames = classificationNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenEntityHeader that = (OpenEntityHeader) obj;
        return Objects.equals(this.attributes, that.attributes) && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.displayText, that.displayText) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.typeName, that.typeName) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.classificationNames, that.classificationNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes, connection, displayText, guid, typeName, tags, classificationNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenEntityHeader {\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    classificationNames: ").append(toIndentedString(classificationNames)).append("\n");
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
