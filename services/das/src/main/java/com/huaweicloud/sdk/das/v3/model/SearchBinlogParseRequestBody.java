package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查看binlog解析详情请求体
 */
public class SearchBinlogParseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_list")

    private List<String> typeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private Integer curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_list")

    private List<FilterColumn> columnList = null;

    public SearchBinlogParseRequestBody withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 解析任务ID
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public SearchBinlogParseRequestBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间（Unix timestamp），单位：毫秒
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public SearchBinlogParseRequestBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间（Unix timestamp），单位：毫秒
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public SearchBinlogParseRequestBody withDbName(String dbName) {
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

    public SearchBinlogParseRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public SearchBinlogParseRequestBody withTypeList(List<String> typeList) {
        this.typeList = typeList;
        return this;
    }

    public SearchBinlogParseRequestBody addTypeListItem(String typeListItem) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        this.typeList.add(typeListItem);
        return this;
    }

    public SearchBinlogParseRequestBody withTypeList(Consumer<List<String>> typeListSetter) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        typeListSetter.accept(this.typeList);
        return this;
    }

    /**
     * SQL类型列表。取值范围：insert、update、delete、ddl
     * @return typeList
     */
    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    public SearchBinlogParseRequestBody withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 页码
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public SearchBinlogParseRequestBody withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 每页记录数
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public SearchBinlogParseRequestBody withColumnList(List<FilterColumn> columnList) {
        this.columnList = columnList;
        return this;
    }

    public SearchBinlogParseRequestBody addColumnListItem(FilterColumn columnListItem) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        this.columnList.add(columnListItem);
        return this;
    }

    public SearchBinlogParseRequestBody withColumnList(Consumer<List<FilterColumn>> columnListSetter) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        columnListSetter.accept(this.columnList);
        return this;
    }

    /**
     * 筛选条件列表
     * @return columnList
     */
    public List<FilterColumn> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<FilterColumn> columnList) {
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
        SearchBinlogParseRequestBody that = (SearchBinlogParseRequestBody) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.typeList, that.typeList)
            && Objects.equals(this.curPage, that.curPage) && Objects.equals(this.perPage, that.perPage)
            && Objects.equals(this.columnList, that.columnList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, startTime, endTime, dbName, tableName, typeList, curPage, perPage, columnList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchBinlogParseRequestBody {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
