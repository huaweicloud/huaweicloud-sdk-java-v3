package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 表倾斜率或脏页率列表。
 */
public class ListTablesStatisticDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_owner")

    private String tableOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_size")

    private String tableSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skew_rate")

    private Double skewRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_page_rate")

    private Double dirtyPageRate;

    public ListTablesStatisticDto withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListTablesStatisticDto withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ListTablesStatisticDto withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ListTablesStatisticDto withTableOwner(String tableOwner) {
        this.tableOwner = tableOwner;
        return this;
    }

    /**
     * 所属用户。
     * @return tableOwner
     */
    public String getTableOwner() {
        return tableOwner;
    }

    public void setTableOwner(String tableOwner) {
        this.tableOwner = tableOwner;
    }

    public ListTablesStatisticDto withTableSize(String tableSize) {
        this.tableSize = tableSize;
        return this;
    }

    /**
     * 表大小。
     * @return tableSize
     */
    public String getTableSize() {
        return tableSize;
    }

    public void setTableSize(String tableSize) {
        this.tableSize = tableSize;
    }

    public ListTablesStatisticDto withSkewRate(Double skewRate) {
        this.skewRate = skewRate;
        return this;
    }

    /**
     * 表倾斜率。
     * @return skewRate
     */
    public Double getSkewRate() {
        return skewRate;
    }

    public void setSkewRate(Double skewRate) {
        this.skewRate = skewRate;
    }

    public ListTablesStatisticDto withDirtyPageRate(Double dirtyPageRate) {
        this.dirtyPageRate = dirtyPageRate;
        return this;
    }

    /**
     * 脏页率。
     * @return dirtyPageRate
     */
    public Double getDirtyPageRate() {
        return dirtyPageRate;
    }

    public void setDirtyPageRate(Double dirtyPageRate) {
        this.dirtyPageRate = dirtyPageRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTablesStatisticDto that = (ListTablesStatisticDto) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.tableOwner, that.tableOwner)
            && Objects.equals(this.tableSize, that.tableSize) && Objects.equals(this.skewRate, that.skewRate)
            && Objects.equals(this.dirtyPageRate, that.dirtyPageRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, schemaName, tableName, tableOwner, tableSize, skewRate, dirtyPageRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTablesStatisticDto {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableOwner: ").append(toIndentedString(tableOwner)).append("\n");
        sb.append("    tableSize: ").append(toIndentedString(tableSize)).append("\n");
        sb.append("    skewRate: ").append(toIndentedString(skewRate)).append("\n");
        sb.append("    dirtyPageRate: ").append(toIndentedString(dirtyPageRate)).append("\n");
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
