package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 定义了Iceberg表的schema结构，包含字段定义，数据类型和schema元数据。
 */
public class IcebergSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_id")

    private Integer schemaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier_field_ids")

    private List<Integer> identifierFieldIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<IcebergStructField> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_keys")

    private List<Integer> primaryKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_column_id")

    private Integer lastColumnId;

    public IcebergSchema withSchemaId(Integer schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
     * 用来记录Iceberg表模式演化历史中模式版本的id。
     * minimum: 0
     * maximum: 2147483647
     * @return schemaId
     */
    public Integer getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(Integer schemaId) {
        this.schemaId = schemaId;
    }

    public IcebergSchema withIdentifierFieldIds(List<Integer> identifierFieldIds) {
        this.identifierFieldIds = identifierFieldIds;
        return this;
    }

    public IcebergSchema addIdentifierFieldIdsItem(Integer identifierFieldIdsItem) {
        if (this.identifierFieldIds == null) {
            this.identifierFieldIds = new ArrayList<>();
        }
        this.identifierFieldIds.add(identifierFieldIdsItem);
        return this;
    }

    public IcebergSchema withIdentifierFieldIds(Consumer<List<Integer>> identifierFieldIdsSetter) {
        if (this.identifierFieldIds == null) {
            this.identifierFieldIds = new ArrayList<>();
        }
        identifierFieldIdsSetter.accept(this.identifierFieldIds);
        return this;
    }

    /**
     * 字段identifier的列表，可以识别表中的记录，用作行级操作以及去重。
     * @return identifierFieldIds
     */
    public List<Integer> getIdentifierFieldIds() {
        return identifierFieldIds;
    }

    public void setIdentifierFieldIds(List<Integer> identifierFieldIds) {
        this.identifierFieldIds = identifierFieldIds;
    }

    public IcebergSchema withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 固定为struct。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IcebergSchema withFields(List<IcebergStructField> fields) {
        this.fields = fields;
        return this;
    }

    public IcebergSchema addFieldsItem(IcebergStructField fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public IcebergSchema withFields(Consumer<List<IcebergStructField>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * IcebergStructField的列表。
     * @return fields
     */
    public List<IcebergStructField> getFields() {
        return fields;
    }

    public void setFields(List<IcebergStructField> fields) {
        this.fields = fields;
    }

    public IcebergSchema withPrimaryKeys(List<Integer> primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }

    public IcebergSchema addPrimaryKeysItem(Integer primaryKeysItem) {
        if (this.primaryKeys == null) {
            this.primaryKeys = new ArrayList<>();
        }
        this.primaryKeys.add(primaryKeysItem);
        return this;
    }

    public IcebergSchema withPrimaryKeys(Consumer<List<Integer>> primaryKeysSetter) {
        if (this.primaryKeys == null) {
            this.primaryKeys = new ArrayList<>();
        }
        primaryKeysSetter.accept(this.primaryKeys);
        return this;
    }

    /**
     * 用来指定哪些field是主键，列表内填写field_id。
     * @return primaryKeys
     */
    public List<Integer> getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List<Integer> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public IcebergSchema withLastColumnId(Integer lastColumnId) {
        this.lastColumnId = lastColumnId;
        return this;
    }

    /**
     * 为该表分配的最高列ID。
     * minimum: 1
     * maximum: 2147483647
     * @return lastColumnId
     */
    public Integer getLastColumnId() {
        return lastColumnId;
    }

    public void setLastColumnId(Integer lastColumnId) {
        this.lastColumnId = lastColumnId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcebergSchema that = (IcebergSchema) obj;
        return Objects.equals(this.schemaId, that.schemaId)
            && Objects.equals(this.identifierFieldIds, that.identifierFieldIds) && Objects.equals(this.type, that.type)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.primaryKeys, that.primaryKeys)
            && Objects.equals(this.lastColumnId, that.lastColumnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaId, identifierFieldIds, type, fields, primaryKeys, lastColumnId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IcebergSchema {\n");
        sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
        sb.append("    identifierFieldIds: ").append(toIndentedString(identifierFieldIds)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    primaryKeys: ").append(toIndentedString(primaryKeys)).append("\n");
        sb.append("    lastColumnId: ").append(toIndentedString(lastColumnId)).append("\n");
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
