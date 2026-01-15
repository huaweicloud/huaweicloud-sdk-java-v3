package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 列信息
 */
public class ColumnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_type")

    private String keyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_mapped_name")

    private String columnMappedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Boolean partition;

    public ColumnInfo withColumnName(String columnName) {
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

    public ColumnInfo withColumnType(String columnType) {
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

    public ColumnInfo withKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * 列的键类型。
     * @return keyType
     */
    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public ColumnInfo withColumnMappedName(String columnMappedName) {
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

    public ColumnInfo withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 该列是否过滤
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ColumnInfo withPartition(Boolean partition) {
        this.partition = partition;
        return this;
    }

    /**
     * 该列是否partitionKey
     * @return partition
     */
    public Boolean getPartition() {
        return partition;
    }

    public void setPartition(Boolean partition) {
        this.partition = partition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnInfo that = (ColumnInfo) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnType, that.columnType)
            && Objects.equals(this.keyType, that.keyType)
            && Objects.equals(this.columnMappedName, that.columnMappedName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.partition, that.partition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, columnType, keyType, columnMappedName, status, partition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnInfo {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
        sb.append("    columnMappedName: ").append(toIndentedString(columnMappedName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
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
