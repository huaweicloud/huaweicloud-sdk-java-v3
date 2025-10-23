package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryTopSqlsResult
 */
public class QueryTopSqlsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_count")

    private String executionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_count_percent")

    private String executionCountPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu_time")

    private String totalCpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu_time_percent")

    private String totalCpuTimePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_cpu_time")

    private String avgCpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_cpu_time_percent")

    private String avgCpuTimePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_duration_time")

    private String totalDurationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_duration_time_percent")

    private String totalDurationTimePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_duration_time")

    private String avgDurationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_duration_time_percent")

    private String avgDurationTimePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rows")

    private String totalRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rows_percent")

    private String totalRowsPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows")

    private String avgRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_percent")

    private String avgRowsPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_reads")

    private String totalLogicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_reads_percent")

    private String totalLogicalReadsPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_reads")

    private String avgLogicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_reads_percent")

    private String avgLogicalReadsPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_write")

    private String avgLogicalWrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_write_percent")

    private String avgLogicalWritePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_write")

    private String totalLogicalWrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_write_percent")

    private String totalLogicalWritePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_physical_reads")

    private String avgPhysicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_physical_reads_percent")

    private String avgPhysicalReadsPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_physical_reads")

    private String totalPhysicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_physical_reads_percent")

    private String totalPhysicalReadsPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execution_time")

    private String lastExecutionTime;

    public QueryTopSqlsResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 对查询计算的二进制哈希值，用于标识具有类似逻辑的查询。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryTopSqlsResult withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * 当前执行的SQL语句。
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public QueryTopSqlsResult withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * SQL全文。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public QueryTopSqlsResult withDbName(String dbName) {
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

    public QueryTopSqlsResult withExecutionCount(String executionCount) {
        this.executionCount = executionCount;
        return this;
    }

    /**
     * 执行总次数。
     * @return executionCount
     */
    public String getExecutionCount() {
        return executionCount;
    }

    public void setExecutionCount(String executionCount) {
        this.executionCount = executionCount;
    }

    public QueryTopSqlsResult withExecutionCountPercent(String executionCountPercent) {
        this.executionCountPercent = executionCountPercent;
        return this;
    }

    /**
     * 执行总次数百分比，范围0.0000-1.0000。
     * @return executionCountPercent
     */
    public String getExecutionCountPercent() {
        return executionCountPercent;
    }

    public void setExecutionCountPercent(String executionCountPercent) {
        this.executionCountPercent = executionCountPercent;
    }

    public QueryTopSqlsResult withTotalCpuTime(String totalCpuTime) {
        this.totalCpuTime = totalCpuTime;
        return this;
    }

    /**
     * 总CPU耗时，单位ms。
     * @return totalCpuTime
     */
    public String getTotalCpuTime() {
        return totalCpuTime;
    }

    public void setTotalCpuTime(String totalCpuTime) {
        this.totalCpuTime = totalCpuTime;
    }

    public QueryTopSqlsResult withTotalCpuTimePercent(String totalCpuTimePercent) {
        this.totalCpuTimePercent = totalCpuTimePercent;
        return this;
    }

    /**
     * 总CPU耗时百分比，范围0.0000-1.0000。
     * @return totalCpuTimePercent
     */
    public String getTotalCpuTimePercent() {
        return totalCpuTimePercent;
    }

    public void setTotalCpuTimePercent(String totalCpuTimePercent) {
        this.totalCpuTimePercent = totalCpuTimePercent;
    }

    public QueryTopSqlsResult withAvgCpuTime(String avgCpuTime) {
        this.avgCpuTime = avgCpuTime;
        return this;
    }

    /**
     * 平均CPU耗时，单位ms。
     * @return avgCpuTime
     */
    public String getAvgCpuTime() {
        return avgCpuTime;
    }

    public void setAvgCpuTime(String avgCpuTime) {
        this.avgCpuTime = avgCpuTime;
    }

    public QueryTopSqlsResult withAvgCpuTimePercent(String avgCpuTimePercent) {
        this.avgCpuTimePercent = avgCpuTimePercent;
        return this;
    }

    /**
     * 平均CPU耗时百分比，范围0.0000-1.0000。
     * @return avgCpuTimePercent
     */
    public String getAvgCpuTimePercent() {
        return avgCpuTimePercent;
    }

    public void setAvgCpuTimePercent(String avgCpuTimePercent) {
        this.avgCpuTimePercent = avgCpuTimePercent;
    }

    public QueryTopSqlsResult withTotalDurationTime(String totalDurationTime) {
        this.totalDurationTime = totalDurationTime;
        return this;
    }

    /**
     * 总执行耗时。
     * @return totalDurationTime
     */
    public String getTotalDurationTime() {
        return totalDurationTime;
    }

    public void setTotalDurationTime(String totalDurationTime) {
        this.totalDurationTime = totalDurationTime;
    }

    public QueryTopSqlsResult withTotalDurationTimePercent(String totalDurationTimePercent) {
        this.totalDurationTimePercent = totalDurationTimePercent;
        return this;
    }

    /**
     * 总执行耗时百分比，范围0.0000-1.0000。
     * @return totalDurationTimePercent
     */
    public String getTotalDurationTimePercent() {
        return totalDurationTimePercent;
    }

    public void setTotalDurationTimePercent(String totalDurationTimePercent) {
        this.totalDurationTimePercent = totalDurationTimePercent;
    }

    public QueryTopSqlsResult withAvgDurationTime(String avgDurationTime) {
        this.avgDurationTime = avgDurationTime;
        return this;
    }

    /**
     * 平均执行耗时。
     * @return avgDurationTime
     */
    public String getAvgDurationTime() {
        return avgDurationTime;
    }

    public void setAvgDurationTime(String avgDurationTime) {
        this.avgDurationTime = avgDurationTime;
    }

    public QueryTopSqlsResult withAvgDurationTimePercent(String avgDurationTimePercent) {
        this.avgDurationTimePercent = avgDurationTimePercent;
        return this;
    }

    /**
     * 平均执行耗时百分比，范围0.0000-1.0000。
     * @return avgDurationTimePercent
     */
    public String getAvgDurationTimePercent() {
        return avgDurationTimePercent;
    }

    public void setAvgDurationTimePercent(String avgDurationTimePercent) {
        this.avgDurationTimePercent = avgDurationTimePercent;
    }

    public QueryTopSqlsResult withTotalRows(String totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * 总返回行。
     * @return totalRows
     */
    public String getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(String totalRows) {
        this.totalRows = totalRows;
    }

    public QueryTopSqlsResult withTotalRowsPercent(String totalRowsPercent) {
        this.totalRowsPercent = totalRowsPercent;
        return this;
    }

    /**
     * 总返回行百分比，范围0.0000-1.0000。
     * @return totalRowsPercent
     */
    public String getTotalRowsPercent() {
        return totalRowsPercent;
    }

    public void setTotalRowsPercent(String totalRowsPercent) {
        this.totalRowsPercent = totalRowsPercent;
    }

    public QueryTopSqlsResult withAvgRows(String avgRows) {
        this.avgRows = avgRows;
        return this;
    }

    /**
     * 平均返回行。
     * @return avgRows
     */
    public String getAvgRows() {
        return avgRows;
    }

    public void setAvgRows(String avgRows) {
        this.avgRows = avgRows;
    }

    public QueryTopSqlsResult withAvgRowsPercent(String avgRowsPercent) {
        this.avgRowsPercent = avgRowsPercent;
        return this;
    }

    /**
     * 平均返回行百分比，范围0.0000-1.0000。
     * @return avgRowsPercent
     */
    public String getAvgRowsPercent() {
        return avgRowsPercent;
    }

    public void setAvgRowsPercent(String avgRowsPercent) {
        this.avgRowsPercent = avgRowsPercent;
    }

    public QueryTopSqlsResult withTotalLogicalReads(String totalLogicalReads) {
        this.totalLogicalReads = totalLogicalReads;
        return this;
    }

    /**
     * 总逻辑读消耗。
     * @return totalLogicalReads
     */
    public String getTotalLogicalReads() {
        return totalLogicalReads;
    }

    public void setTotalLogicalReads(String totalLogicalReads) {
        this.totalLogicalReads = totalLogicalReads;
    }

    public QueryTopSqlsResult withTotalLogicalReadsPercent(String totalLogicalReadsPercent) {
        this.totalLogicalReadsPercent = totalLogicalReadsPercent;
        return this;
    }

    /**
     * 总逻辑读百分比，范围0.0000-1.0000。
     * @return totalLogicalReadsPercent
     */
    public String getTotalLogicalReadsPercent() {
        return totalLogicalReadsPercent;
    }

    public void setTotalLogicalReadsPercent(String totalLogicalReadsPercent) {
        this.totalLogicalReadsPercent = totalLogicalReadsPercent;
    }

    public QueryTopSqlsResult withAvgLogicalReads(String avgLogicalReads) {
        this.avgLogicalReads = avgLogicalReads;
        return this;
    }

    /**
     * 平均逻辑读消耗。
     * @return avgLogicalReads
     */
    public String getAvgLogicalReads() {
        return avgLogicalReads;
    }

    public void setAvgLogicalReads(String avgLogicalReads) {
        this.avgLogicalReads = avgLogicalReads;
    }

    public QueryTopSqlsResult withAvgLogicalReadsPercent(String avgLogicalReadsPercent) {
        this.avgLogicalReadsPercent = avgLogicalReadsPercent;
        return this;
    }

    /**
     * 平均逻辑读百分比，范围0.0000-1.0000。
     * @return avgLogicalReadsPercent
     */
    public String getAvgLogicalReadsPercent() {
        return avgLogicalReadsPercent;
    }

    public void setAvgLogicalReadsPercent(String avgLogicalReadsPercent) {
        this.avgLogicalReadsPercent = avgLogicalReadsPercent;
    }

    public QueryTopSqlsResult withAvgLogicalWrite(String avgLogicalWrite) {
        this.avgLogicalWrite = avgLogicalWrite;
        return this;
    }

    /**
     * 平均逻辑写消耗。
     * @return avgLogicalWrite
     */
    public String getAvgLogicalWrite() {
        return avgLogicalWrite;
    }

    public void setAvgLogicalWrite(String avgLogicalWrite) {
        this.avgLogicalWrite = avgLogicalWrite;
    }

    public QueryTopSqlsResult withAvgLogicalWritePercent(String avgLogicalWritePercent) {
        this.avgLogicalWritePercent = avgLogicalWritePercent;
        return this;
    }

    /**
     * 平均逻辑写百分比，范围0.0000-1.0000。
     * @return avgLogicalWritePercent
     */
    public String getAvgLogicalWritePercent() {
        return avgLogicalWritePercent;
    }

    public void setAvgLogicalWritePercent(String avgLogicalWritePercent) {
        this.avgLogicalWritePercent = avgLogicalWritePercent;
    }

    public QueryTopSqlsResult withTotalLogicalWrite(String totalLogicalWrite) {
        this.totalLogicalWrite = totalLogicalWrite;
        return this;
    }

    /**
     * 总逻辑写消耗。
     * @return totalLogicalWrite
     */
    public String getTotalLogicalWrite() {
        return totalLogicalWrite;
    }

    public void setTotalLogicalWrite(String totalLogicalWrite) {
        this.totalLogicalWrite = totalLogicalWrite;
    }

    public QueryTopSqlsResult withTotalLogicalWritePercent(String totalLogicalWritePercent) {
        this.totalLogicalWritePercent = totalLogicalWritePercent;
        return this;
    }

    /**
     * 总逻辑写百分比，范围0.0000-1.0000。
     * @return totalLogicalWritePercent
     */
    public String getTotalLogicalWritePercent() {
        return totalLogicalWritePercent;
    }

    public void setTotalLogicalWritePercent(String totalLogicalWritePercent) {
        this.totalLogicalWritePercent = totalLogicalWritePercent;
    }

    public QueryTopSqlsResult withAvgPhysicalReads(String avgPhysicalReads) {
        this.avgPhysicalReads = avgPhysicalReads;
        return this;
    }

    /**
     * 平均物理读消耗。
     * @return avgPhysicalReads
     */
    public String getAvgPhysicalReads() {
        return avgPhysicalReads;
    }

    public void setAvgPhysicalReads(String avgPhysicalReads) {
        this.avgPhysicalReads = avgPhysicalReads;
    }

    public QueryTopSqlsResult withAvgPhysicalReadsPercent(String avgPhysicalReadsPercent) {
        this.avgPhysicalReadsPercent = avgPhysicalReadsPercent;
        return this;
    }

    /**
     * 平均物理读百分比，范围0.0000-1.0000。
     * @return avgPhysicalReadsPercent
     */
    public String getAvgPhysicalReadsPercent() {
        return avgPhysicalReadsPercent;
    }

    public void setAvgPhysicalReadsPercent(String avgPhysicalReadsPercent) {
        this.avgPhysicalReadsPercent = avgPhysicalReadsPercent;
    }

    public QueryTopSqlsResult withTotalPhysicalReads(String totalPhysicalReads) {
        this.totalPhysicalReads = totalPhysicalReads;
        return this;
    }

    /**
     * 总物理读消耗。
     * @return totalPhysicalReads
     */
    public String getTotalPhysicalReads() {
        return totalPhysicalReads;
    }

    public void setTotalPhysicalReads(String totalPhysicalReads) {
        this.totalPhysicalReads = totalPhysicalReads;
    }

    public QueryTopSqlsResult withTotalPhysicalReadsPercent(String totalPhysicalReadsPercent) {
        this.totalPhysicalReadsPercent = totalPhysicalReadsPercent;
        return this;
    }

    /**
     * 总物理读百分比，范围0.0000-1.0000。
     * @return totalPhysicalReadsPercent
     */
    public String getTotalPhysicalReadsPercent() {
        return totalPhysicalReadsPercent;
    }

    public void setTotalPhysicalReadsPercent(String totalPhysicalReadsPercent) {
        this.totalPhysicalReadsPercent = totalPhysicalReadsPercent;
    }

    public QueryTopSqlsResult withLastExecutionTime(String lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
        return this;
    }

    /**
     * 上次执行时间。
     * @return lastExecutionTime
     */
    public String getLastExecutionTime() {
        return lastExecutionTime;
    }

    public void setLastExecutionTime(String lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryTopSqlsResult that = (QueryTopSqlsResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.statement, that.statement)
            && Objects.equals(this.query, that.query) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.executionCount, that.executionCount)
            && Objects.equals(this.executionCountPercent, that.executionCountPercent)
            && Objects.equals(this.totalCpuTime, that.totalCpuTime)
            && Objects.equals(this.totalCpuTimePercent, that.totalCpuTimePercent)
            && Objects.equals(this.avgCpuTime, that.avgCpuTime)
            && Objects.equals(this.avgCpuTimePercent, that.avgCpuTimePercent)
            && Objects.equals(this.totalDurationTime, that.totalDurationTime)
            && Objects.equals(this.totalDurationTimePercent, that.totalDurationTimePercent)
            && Objects.equals(this.avgDurationTime, that.avgDurationTime)
            && Objects.equals(this.avgDurationTimePercent, that.avgDurationTimePercent)
            && Objects.equals(this.totalRows, that.totalRows)
            && Objects.equals(this.totalRowsPercent, that.totalRowsPercent)
            && Objects.equals(this.avgRows, that.avgRows) && Objects.equals(this.avgRowsPercent, that.avgRowsPercent)
            && Objects.equals(this.totalLogicalReads, that.totalLogicalReads)
            && Objects.equals(this.totalLogicalReadsPercent, that.totalLogicalReadsPercent)
            && Objects.equals(this.avgLogicalReads, that.avgLogicalReads)
            && Objects.equals(this.avgLogicalReadsPercent, that.avgLogicalReadsPercent)
            && Objects.equals(this.avgLogicalWrite, that.avgLogicalWrite)
            && Objects.equals(this.avgLogicalWritePercent, that.avgLogicalWritePercent)
            && Objects.equals(this.totalLogicalWrite, that.totalLogicalWrite)
            && Objects.equals(this.totalLogicalWritePercent, that.totalLogicalWritePercent)
            && Objects.equals(this.avgPhysicalReads, that.avgPhysicalReads)
            && Objects.equals(this.avgPhysicalReadsPercent, that.avgPhysicalReadsPercent)
            && Objects.equals(this.totalPhysicalReads, that.totalPhysicalReads)
            && Objects.equals(this.totalPhysicalReadsPercent, that.totalPhysicalReadsPercent)
            && Objects.equals(this.lastExecutionTime, that.lastExecutionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            statement,
            query,
            dbName,
            executionCount,
            executionCountPercent,
            totalCpuTime,
            totalCpuTimePercent,
            avgCpuTime,
            avgCpuTimePercent,
            totalDurationTime,
            totalDurationTimePercent,
            avgDurationTime,
            avgDurationTimePercent,
            totalRows,
            totalRowsPercent,
            avgRows,
            avgRowsPercent,
            totalLogicalReads,
            totalLogicalReadsPercent,
            avgLogicalReads,
            avgLogicalReadsPercent,
            avgLogicalWrite,
            avgLogicalWritePercent,
            totalLogicalWrite,
            totalLogicalWritePercent,
            avgPhysicalReads,
            avgPhysicalReadsPercent,
            totalPhysicalReads,
            totalPhysicalReadsPercent,
            lastExecutionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTopSqlsResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    executionCount: ").append(toIndentedString(executionCount)).append("\n");
        sb.append("    executionCountPercent: ").append(toIndentedString(executionCountPercent)).append("\n");
        sb.append("    totalCpuTime: ").append(toIndentedString(totalCpuTime)).append("\n");
        sb.append("    totalCpuTimePercent: ").append(toIndentedString(totalCpuTimePercent)).append("\n");
        sb.append("    avgCpuTime: ").append(toIndentedString(avgCpuTime)).append("\n");
        sb.append("    avgCpuTimePercent: ").append(toIndentedString(avgCpuTimePercent)).append("\n");
        sb.append("    totalDurationTime: ").append(toIndentedString(totalDurationTime)).append("\n");
        sb.append("    totalDurationTimePercent: ").append(toIndentedString(totalDurationTimePercent)).append("\n");
        sb.append("    avgDurationTime: ").append(toIndentedString(avgDurationTime)).append("\n");
        sb.append("    avgDurationTimePercent: ").append(toIndentedString(avgDurationTimePercent)).append("\n");
        sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
        sb.append("    totalRowsPercent: ").append(toIndentedString(totalRowsPercent)).append("\n");
        sb.append("    avgRows: ").append(toIndentedString(avgRows)).append("\n");
        sb.append("    avgRowsPercent: ").append(toIndentedString(avgRowsPercent)).append("\n");
        sb.append("    totalLogicalReads: ").append(toIndentedString(totalLogicalReads)).append("\n");
        sb.append("    totalLogicalReadsPercent: ").append(toIndentedString(totalLogicalReadsPercent)).append("\n");
        sb.append("    avgLogicalReads: ").append(toIndentedString(avgLogicalReads)).append("\n");
        sb.append("    avgLogicalReadsPercent: ").append(toIndentedString(avgLogicalReadsPercent)).append("\n");
        sb.append("    avgLogicalWrite: ").append(toIndentedString(avgLogicalWrite)).append("\n");
        sb.append("    avgLogicalWritePercent: ").append(toIndentedString(avgLogicalWritePercent)).append("\n");
        sb.append("    totalLogicalWrite: ").append(toIndentedString(totalLogicalWrite)).append("\n");
        sb.append("    totalLogicalWritePercent: ").append(toIndentedString(totalLogicalWritePercent)).append("\n");
        sb.append("    avgPhysicalReads: ").append(toIndentedString(avgPhysicalReads)).append("\n");
        sb.append("    avgPhysicalReadsPercent: ").append(toIndentedString(avgPhysicalReadsPercent)).append("\n");
        sb.append("    totalPhysicalReads: ").append(toIndentedString(totalPhysicalReads)).append("\n");
        sb.append("    totalPhysicalReadsPercent: ").append(toIndentedString(totalPhysicalReadsPercent)).append("\n");
        sb.append("    lastExecutionTime: ").append(toIndentedString(lastExecutionTime)).append("\n");
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
