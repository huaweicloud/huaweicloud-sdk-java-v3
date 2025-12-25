package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 列信息
 */
public class SchemaColumns {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "array")

    private Boolean array;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_data_type")

    private String columnDataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_data_type_setting")

    private String columnDataTypeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_sequence_number")

    private Integer columnSequenceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type_setting")

    private String columnTypeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depth")

    private Integer depth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nullable")

    private Boolean nullable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "own_name")

    private String ownName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

    public SchemaColumns withArray(Boolean array) {
        this.array = array;
        return this;
    }

    /**
     * 是否为数组
     * @return array
     */
    public Boolean getArray() {
        return array;
    }

    public void setArray(Boolean array) {
        this.array = array;
    }

    public SchemaColumns withColumnDataType(String columnDataType) {
        this.columnDataType = columnDataType;
        return this;
    }

    /**
     * 列数据类型，例如 TIMESTAMP 或 INT
     * @return columnDataType
     */
    public String getColumnDataType() {
        return columnDataType;
    }

    public void setColumnDataType(String columnDataType) {
        this.columnDataType = columnDataType;
    }

    public SchemaColumns withColumnDataTypeSetting(String columnDataTypeSetting) {
        this.columnDataTypeSetting = columnDataTypeSetting;
        return this;
    }

    /**
     * 数据类型设置
     * @return columnDataTypeSetting
     */
    public String getColumnDataTypeSetting() {
        return columnDataTypeSetting;
    }

    public void setColumnDataTypeSetting(String columnDataTypeSetting) {
        this.columnDataTypeSetting = columnDataTypeSetting;
    }

    public SchemaColumns withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名称
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public SchemaColumns withColumnSequenceNumber(Integer columnSequenceNumber) {
        this.columnSequenceNumber = columnSequenceNumber;
        return this;
    }

    /**
     * 列顺序号
     * @return columnSequenceNumber
     */
    public Integer getColumnSequenceNumber() {
        return columnSequenceNumber;
    }

    public void setColumnSequenceNumber(Integer columnSequenceNumber) {
        this.columnSequenceNumber = columnSequenceNumber;
    }

    public SchemaColumns withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 列类型，例如 PHYSICAL
     * @return columnType
     */
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public SchemaColumns withColumnTypeSetting(String columnTypeSetting) {
        this.columnTypeSetting = columnTypeSetting;
        return this;
    }

    /**
     * 列类型设置
     * @return columnTypeSetting
     */
    public String getColumnTypeSetting() {
        return columnTypeSetting;
    }

    public void setColumnTypeSetting(String columnTypeSetting) {
        this.columnTypeSetting = columnTypeSetting;
    }

    public SchemaColumns withDepth(Integer depth) {
        this.depth = depth;
        return this;
    }

    /**
     * 深度
     * @return depth
     */
    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public SchemaColumns withNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    /**
     * 是否允许为空
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public SchemaColumns withOwnName(String ownName) {
        this.ownName = ownName;
        return this;
    }

    /**
     * 自有名称
     * @return ownName
     */
    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName;
    }

    public SchemaColumns withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * 父名称
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchemaColumns that = (SchemaColumns) obj;
        return Objects.equals(this.array, that.array) && Objects.equals(this.columnDataType, that.columnDataType)
            && Objects.equals(this.columnDataTypeSetting, that.columnDataTypeSetting)
            && Objects.equals(this.columnName, that.columnName)
            && Objects.equals(this.columnSequenceNumber, that.columnSequenceNumber)
            && Objects.equals(this.columnType, that.columnType)
            && Objects.equals(this.columnTypeSetting, that.columnTypeSetting) && Objects.equals(this.depth, that.depth)
            && Objects.equals(this.nullable, that.nullable) && Objects.equals(this.ownName, that.ownName)
            && Objects.equals(this.parentName, that.parentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(array,
            columnDataType,
            columnDataTypeSetting,
            columnName,
            columnSequenceNumber,
            columnType,
            columnTypeSetting,
            depth,
            nullable,
            ownName,
            parentName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaColumns {\n");
        sb.append("    array: ").append(toIndentedString(array)).append("\n");
        sb.append("    columnDataType: ").append(toIndentedString(columnDataType)).append("\n");
        sb.append("    columnDataTypeSetting: ").append(toIndentedString(columnDataTypeSetting)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnSequenceNumber: ").append(toIndentedString(columnSequenceNumber)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    columnTypeSetting: ").append(toIndentedString(columnTypeSetting)).append("\n");
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
        sb.append("    ownName: ").append(toIndentedString(ownName)).append("\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
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
