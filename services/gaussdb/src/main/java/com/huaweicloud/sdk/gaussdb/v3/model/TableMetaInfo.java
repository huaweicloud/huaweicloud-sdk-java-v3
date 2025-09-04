package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TableMetaInfo
 */
public class TableMetaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra")

    private String extra;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_nullable")

    private String isNullable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_default")

    private String columnDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_key")

    private String columnKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    public TableMetaInfo withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 列的数据类型
     * @return columnType
     */
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public TableMetaInfo withExtra(String extra) {
        this.extra = extra;
        return this;
    }

    /**
     * 额外的信息，例如是否是自动递增列
     * @return extra
     */
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public TableMetaInfo withIsNullable(String isNullable) {
        this.isNullable = isNullable;
        return this;
    }

    /**
     * 是否允许为NULL
     * @return isNullable
     */
    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public TableMetaInfo withColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
        return this;
    }

    /**
     * 列的默认值
     * @return columnDefault
     */
    public String getColumnDefault() {
        return columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    public TableMetaInfo withColumnKey(String columnKey) {
        this.columnKey = columnKey;
        return this;
    }

    /**
     * 是否是索引列
     * @return columnKey
     */
    public String getColumnKey() {
        return columnKey;
    }

    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }

    public TableMetaInfo withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableMetaInfo that = (TableMetaInfo) obj;
        return Objects.equals(this.columnType, that.columnType) && Objects.equals(this.extra, that.extra)
            && Objects.equals(this.isNullable, that.isNullable)
            && Objects.equals(this.columnDefault, that.columnDefault) && Objects.equals(this.columnKey, that.columnKey)
            && Objects.equals(this.columnName, that.columnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnType, extra, isNullable, columnDefault, columnKey, columnName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableMetaInfo {\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
        sb.append("    isNullable: ").append(toIndentedString(isNullable)).append("\n");
        sb.append("    columnDefault: ").append(toIndentedString(columnDefault)).append("\n");
        sb.append("    columnKey: ").append(toIndentedString(columnKey)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
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
