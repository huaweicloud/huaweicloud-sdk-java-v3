package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * binlog事件详情
 */
public class EventRowsVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private Long eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private Long position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_names")

    private List<String> columnNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_keys")

    private List<String> primaryKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_rows")

    private Integer affectRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_pairs")

    private List<RowPairDto> rowPairs = null;

    public EventRowsVo withEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 事件ID
     * @return eventId
     */
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public EventRowsVo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public EventRowsVo withPosition(Long position) {
        this.position = position;
        return this;
    }

    /**
     * 解析位置
     * @return position
     */
    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public EventRowsVo withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 事件发生时间，单位毫秒
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public EventRowsVo withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 变更的数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public EventRowsVo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 变更的表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public EventRowsVo withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * 变更的SQL类型。取值范围：insert、update、delete、ddl
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public EventRowsVo withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * 变更的SQL语句
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public EventRowsVo withColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }

    public EventRowsVo addColumnNamesItem(String columnNamesItem) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        this.columnNames.add(columnNamesItem);
        return this;
    }

    public EventRowsVo withColumnNames(Consumer<List<String>> columnNamesSetter) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        columnNamesSetter.accept(this.columnNames);
        return this;
    }

    /**
     * 变更的列名称列表
     * @return columnNames
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    public EventRowsVo withPrimaryKeys(List<String> primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }

    public EventRowsVo addPrimaryKeysItem(String primaryKeysItem) {
        if (this.primaryKeys == null) {
            this.primaryKeys = new ArrayList<>();
        }
        this.primaryKeys.add(primaryKeysItem);
        return this;
    }

    public EventRowsVo withPrimaryKeys(Consumer<List<String>> primaryKeysSetter) {
        if (this.primaryKeys == null) {
            this.primaryKeys = new ArrayList<>();
        }
        primaryKeysSetter.accept(this.primaryKeys);
        return this;
    }

    /**
     * 变更的主键列表
     * @return primaryKeys
     */
    public List<String> getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List<String> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public EventRowsVo withAffectRows(Integer affectRows) {
        this.affectRows = affectRows;
        return this;
    }

    /**
     * 变更影响的行数
     * @return affectRows
     */
    public Integer getAffectRows() {
        return affectRows;
    }

    public void setAffectRows(Integer affectRows) {
        this.affectRows = affectRows;
    }

    public EventRowsVo withRowPairs(List<RowPairDto> rowPairs) {
        this.rowPairs = rowPairs;
        return this;
    }

    public EventRowsVo addRowPairsItem(RowPairDto rowPairsItem) {
        if (this.rowPairs == null) {
            this.rowPairs = new ArrayList<>();
        }
        this.rowPairs.add(rowPairsItem);
        return this;
    }

    public EventRowsVo withRowPairs(Consumer<List<RowPairDto>> rowPairsSetter) {
        if (this.rowPairs == null) {
            this.rowPairs = new ArrayList<>();
        }
        rowPairsSetter.accept(this.rowPairs);
        return this;
    }

    /**
     * 变更数据详情
     * @return rowPairs
     */
    public List<RowPairDto> getRowPairs() {
        return rowPairs;
    }

    public void setRowPairs(List<RowPairDto> rowPairs) {
        this.rowPairs = rowPairs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventRowsVo that = (EventRowsVo) obj;
        return Objects.equals(this.eventId, that.eventId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.position, that.position) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.sqlType, that.sqlType) && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.columnNames, that.columnNames) && Objects.equals(this.primaryKeys, that.primaryKeys)
            && Objects.equals(this.affectRows, that.affectRows) && Objects.equals(this.rowPairs, that.rowPairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId,
            fileName,
            position,
            timestamp,
            dbName,
            tableName,
            sqlType,
            sqlStatement,
            columnNames,
            primaryKeys,
            affectRows,
            rowPairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventRowsVo {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
        sb.append("    primaryKeys: ").append(toIndentedString(primaryKeys)).append("\n");
        sb.append("    affectRows: ").append(toIndentedString(affectRows)).append("\n");
        sb.append("    rowPairs: ").append(toIndentedString(rowPairs)).append("\n");
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
