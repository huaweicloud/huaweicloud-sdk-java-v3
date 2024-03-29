package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产详情实体
 */
public class OpenEntityWithExtInfoEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private Connection connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private BigDecimal createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_text")

    private String displayText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationship_attributes")

    private Object relationshipAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private BigDecimal updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagHeader> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification_names")

    private List<String> classificationNames = null;

    public OpenEntityWithExtInfoEntity withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 属性Map<String, Object>
     * @return attributes
     */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public OpenEntityWithExtInfoEntity withConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public OpenEntityWithExtInfoEntity withConnection(Consumer<Connection> connectionSetter) {
        if (this.connection == null) {
            this.connection = new Connection();
            connectionSetter.accept(this.connection);
        }

        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public OpenEntityWithExtInfoEntity withCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public BigDecimal getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
    }

    public OpenEntityWithExtInfoEntity withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建人
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public OpenEntityWithExtInfoEntity withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * 资产的名称
     * @return displayText
     */
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public OpenEntityWithExtInfoEntity withGuid(String guid) {
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

    public OpenEntityWithExtInfoEntity withRelationshipAttributes(Object relationshipAttributes) {
        this.relationshipAttributes = relationshipAttributes;
        return this;
    }

    /**
     * 相关的属性 Map<String, Object>
     * @return relationshipAttributes
     */
    public Object getRelationshipAttributes() {
        return relationshipAttributes;
    }

    public void setRelationshipAttributes(Object relationshipAttributes) {
        this.relationshipAttributes = relationshipAttributes;
    }

    public OpenEntityWithExtInfoEntity withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 资产类型
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public OpenEntityWithExtInfoEntity withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * 更新人
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public OpenEntityWithExtInfoEntity withUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public BigDecimal getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
    }

    public OpenEntityWithExtInfoEntity withTags(List<TagHeader> tags) {
        this.tags = tags;
        return this;
    }

    public OpenEntityWithExtInfoEntity addTagsItem(TagHeader tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public OpenEntityWithExtInfoEntity withTags(Consumer<List<TagHeader>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签 List<TagHeader>
     * @return tags
     */
    public List<TagHeader> getTags() {
        return tags;
    }

    public void setTags(List<TagHeader> tags) {
        this.tags = tags;
    }

    public OpenEntityWithExtInfoEntity withClassificationNames(List<String> classificationNames) {
        this.classificationNames = classificationNames;
        return this;
    }

    public OpenEntityWithExtInfoEntity addClassificationNamesItem(String classificationNamesItem) {
        if (this.classificationNames == null) {
            this.classificationNames = new ArrayList<>();
        }
        this.classificationNames.add(classificationNamesItem);
        return this;
    }

    public OpenEntityWithExtInfoEntity withClassificationNames(Consumer<List<String>> classificationNamesSetter) {
        if (this.classificationNames == null) {
            this.classificationNames = new ArrayList<>();
        }
        classificationNamesSetter.accept(this.classificationNames);
        return this;
    }

    /**
     * 分类名称 List<String>
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
        OpenEntityWithExtInfoEntity that = (OpenEntityWithExtInfoEntity) obj;
        return Objects.equals(this.attributes, that.attributes) && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.displayText, that.displayText) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.relationshipAttributes, that.relationshipAttributes)
            && Objects.equals(this.typeName, that.typeName) && Objects.equals(this.updatedBy, that.updatedBy)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.classificationNames, that.classificationNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes,
            connection,
            createTime,
            createdBy,
            displayText,
            guid,
            relationshipAttributes,
            typeName,
            updatedBy,
            updateTime,
            tags,
            classificationNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenEntityWithExtInfoEntity {\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    relationshipAttributes: ").append(toIndentedString(relationshipAttributes)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
