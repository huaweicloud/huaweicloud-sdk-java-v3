package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 列信息
 */
public class Column {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_increment")

    private Boolean autoIncrement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_name")

    private String realName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly")

    private Boolean readonly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_binary")

    private Boolean isBinary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "int_data_type")

    private Integer intDataType;

    public Column withAutoIncrement(Boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
        return this;
    }

    /**
     * 是否自增
     * @return autoIncrement
     */
    public Boolean getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    public Column withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Column withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Column withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Column withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Column withRealName(String realName) {
        this.realName = realName;
        return this;
    }

    /**
     * 实际名称
     * @return realName
     */
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Column withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 尺寸大小
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Column withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Column withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public Column withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    /**
     * 是否只读
     * @return readonly
     */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    public Column withIsBinary(Boolean isBinary) {
        this.isBinary = isBinary;
        return this;
    }

    /**
     * 是否二进制
     * @return isBinary
     */
    public Boolean getIsBinary() {
        return isBinary;
    }

    public void setIsBinary(Boolean isBinary) {
        this.isBinary = isBinary;
    }

    public Column withIntDataType(Integer intDataType) {
        this.intDataType = intDataType;
        return this;
    }

    /**
     * 数据类型
     * @return intDataType
     */
    public Integer getIntDataType() {
        return intDataType;
    }

    public void setIntDataType(Integer intDataType) {
        this.intDataType = intDataType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Column that = (Column) obj;
        return Objects.equals(this.autoIncrement, that.autoIncrement) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.label, that.label)
            && Objects.equals(this.name, that.name) && Objects.equals(this.realName, that.realName)
            && Objects.equals(this.size, that.size) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.readonly, that.readonly)
            && Objects.equals(this.isBinary, that.isBinary) && Objects.equals(this.intDataType, that.intDataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoIncrement,
            dataType,
            dbName,
            label,
            name,
            realName,
            size,
            tableName,
            schemaName,
            readonly,
            isBinary,
            intDataType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Column {\n");
        sb.append("    autoIncrement: ").append(toIndentedString(autoIncrement)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
        sb.append("    isBinary: ").append(toIndentedString(isBinary)).append("\n");
        sb.append("    intDataType: ").append(toIndentedString(intDataType)).append("\n");
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
