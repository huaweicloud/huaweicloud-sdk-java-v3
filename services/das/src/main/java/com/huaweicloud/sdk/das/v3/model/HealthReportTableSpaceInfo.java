package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HealthReportTableSpaceInfo
 */
public class HealthReportTableSpaceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_engine")

    private String dbEngine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_size")

    private Long tableSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size")

    private Long dataSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_size")

    private Long indexSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private Long rows;

    public HealthReportTableSpaceInfo withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public HealthReportTableSpaceInfo withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 表名。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public HealthReportTableSpaceInfo withDbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
        return this;
    }

    /**
     * 数据库引擎。
     * @return dbEngine
     */
    public String getDbEngine() {
        return dbEngine;
    }

    public void setDbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
    }

    public HealthReportTableSpaceInfo withTableSize(Long tableSize) {
        this.tableSize = tableSize;
        return this;
    }

    /**
     * 表大小。
     * @return tableSize
     */
    public Long getTableSize() {
        return tableSize;
    }

    public void setTableSize(Long tableSize) {
        this.tableSize = tableSize;
    }

    public HealthReportTableSpaceInfo withDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * 数据大小。
     * @return dataSize
     */
    public Long getDataSize() {
        return dataSize;
    }

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    public HealthReportTableSpaceInfo withIndexSize(Long indexSize) {
        this.indexSize = indexSize;
        return this;
    }

    /**
     * 索引大小。
     * @return indexSize
     */
    public Long getIndexSize() {
        return indexSize;
    }

    public void setIndexSize(Long indexSize) {
        this.indexSize = indexSize;
    }

    public HealthReportTableSpaceInfo withRows(Long rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 行数量。
     * @return rows
     */
    public Long getRows() {
        return rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportTableSpaceInfo that = (HealthReportTableSpaceInfo) obj;
        return Objects.equals(this.database, that.database) && Objects.equals(this.table, that.table)
            && Objects.equals(this.dbEngine, that.dbEngine) && Objects.equals(this.tableSize, that.tableSize)
            && Objects.equals(this.dataSize, that.dataSize) && Objects.equals(this.indexSize, that.indexSize)
            && Objects.equals(this.rows, that.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, table, dbEngine, tableSize, dataSize, indexSize, rows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportTableSpaceInfo {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    dbEngine: ").append(toIndentedString(dbEngine)).append("\n");
        sb.append("    tableSize: ").append(toIndentedString(tableSize)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
        sb.append("    indexSize: ").append(toIndentedString(indexSize)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
