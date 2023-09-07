package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库列信息
 */
public class QueryColumnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key_or_unique_index")

    private String primaryKeyOrUniqueIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_mapped_name")

    private String columnMappedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_filtered")

    private Boolean isFiltered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_partition_key")

    private Boolean isPartitionKey;

    public QueryColumnInfo withColumnName(String columnName) {
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

    public QueryColumnInfo withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 列类型
     * @return columnType
     */
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public QueryColumnInfo withPrimaryKeyOrUniqueIndex(String primaryKeyOrUniqueIndex) {
        this.primaryKeyOrUniqueIndex = primaryKeyOrUniqueIndex;
        return this;
    }

    /**
     * 主键或者唯一索引
     * @return primaryKeyOrUniqueIndex
     */
    public String getPrimaryKeyOrUniqueIndex() {
        return primaryKeyOrUniqueIndex;
    }

    public void setPrimaryKeyOrUniqueIndex(String primaryKeyOrUniqueIndex) {
        this.primaryKeyOrUniqueIndex = primaryKeyOrUniqueIndex;
    }

    public QueryColumnInfo withColumnMappedName(String columnMappedName) {
        this.columnMappedName = columnMappedName;
        return this;
    }

    /**
     * 列映射后的名称
     * @return columnMappedName
     */
    public String getColumnMappedName() {
        return columnMappedName;
    }

    public void setColumnMappedName(String columnMappedName) {
        this.columnMappedName = columnMappedName;
    }

    public QueryColumnInfo withIsFiltered(Boolean isFiltered) {
        this.isFiltered = isFiltered;
        return this;
    }

    /**
     * 该列是否过滤
     * @return isFiltered
     */
    public Boolean getIsFiltered() {
        return isFiltered;
    }

    public void setIsFiltered(Boolean isFiltered) {
        this.isFiltered = isFiltered;
    }

    public QueryColumnInfo withIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
        return this;
    }

    /**
     * 该列是否partitionKey
     * @return isPartitionKey
     */
    public Boolean getIsPartitionKey() {
        return isPartitionKey;
    }

    public void setIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryColumnInfo that = (QueryColumnInfo) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnType, that.columnType)
            && Objects.equals(this.primaryKeyOrUniqueIndex, that.primaryKeyOrUniqueIndex)
            && Objects.equals(this.columnMappedName, that.columnMappedName)
            && Objects.equals(this.isFiltered, that.isFiltered)
            && Objects.equals(this.isPartitionKey, that.isPartitionKey);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(columnName, columnType, primaryKeyOrUniqueIndex, columnMappedName, isFiltered, isPartitionKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryColumnInfo {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    primaryKeyOrUniqueIndex: ").append(toIndentedString(primaryKeyOrUniqueIndex)).append("\n");
        sb.append("    columnMappedName: ").append(toIndentedString(columnMappedName)).append("\n");
        sb.append("    isFiltered: ").append(toIndentedString(isFiltered)).append("\n");
        sb.append("    isPartitionKey: ").append(toIndentedString(isPartitionKey)).append("\n");
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
