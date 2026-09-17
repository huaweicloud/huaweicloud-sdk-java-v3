package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重试binlog解析任务部分请求体
 */
public class RetryBinlogPartRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_id")

    private List<String> errorId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_list")

    private List<ColumnInfo> columnList = null;

    public RetryBinlogPartRequestBody withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * binlog解析任务ID
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public RetryBinlogPartRequestBody withErrorId(List<String> errorId) {
        this.errorId = errorId;
        return this;
    }

    public RetryBinlogPartRequestBody addErrorIdItem(String errorIdItem) {
        if (this.errorId == null) {
            this.errorId = new ArrayList<>();
        }
        this.errorId.add(errorIdItem);
        return this;
    }

    public RetryBinlogPartRequestBody withErrorId(Consumer<List<String>> errorIdSetter) {
        if (this.errorId == null) {
            this.errorId = new ArrayList<>();
        }
        errorIdSetter.accept(this.errorId);
        return this;
    }

    /**
     * binlog解析错误ID
     * @return errorId
     */
    public List<String> getErrorId() {
        return errorId;
    }

    public void setErrorId(List<String> errorId) {
        this.errorId = errorId;
    }

    public RetryBinlogPartRequestBody withDbName(String dbName) {
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

    public RetryBinlogPartRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 数据库表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public RetryBinlogPartRequestBody withColumnList(List<ColumnInfo> columnList) {
        this.columnList = columnList;
        return this;
    }

    public RetryBinlogPartRequestBody addColumnListItem(ColumnInfo columnListItem) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        this.columnList.add(columnListItem);
        return this;
    }

    public RetryBinlogPartRequestBody withColumnList(Consumer<List<ColumnInfo>> columnListSetter) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        columnListSetter.accept(this.columnList);
        return this;
    }

    /**
     * 列表信息
     * @return columnList
     */
    public List<ColumnInfo> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<ColumnInfo> columnList) {
        this.columnList = columnList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryBinlogPartRequestBody that = (RetryBinlogPartRequestBody) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.errorId, that.errorId)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.columnList, that.columnList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, errorId, dbName, tableName, columnList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryBinlogPartRequestBody {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    columnList: ").append(toIndentedString(columnList)).append("\n");
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
