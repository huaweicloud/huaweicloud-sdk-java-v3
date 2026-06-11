package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * top对象详情
 */
public class TopObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_id")

    private String rowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_count")

    private String executionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_generation_num")

    private String planGenerationNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execution_time")

    private String lastExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_worker_time")

    private String avgWorkerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_worker_time")

    private String totalWorkerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_worker_time")

    private String lastWorkerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_worker_time")

    private String minWorkerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_worker_time")

    private String maxWorkerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_reads")

    private String avgLogicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_reads")

    private String totalLogicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_logical_reads")

    private String lastLogicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_logical_reads")

    private String minLogicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_logical_reads")

    private String maxLogicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_writes")

    private String avgLogicalWrites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_writes")

    private String totalLogicalWrites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_logical_writes")

    private String lastLogicalWrites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_logical_writes")

    private String minLogicalWrites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_logical_writes")

    private String maxLogicalWrites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_io")

    private String avgLogicalIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_io")

    private String totalLogicalIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_logical_io")

    private String lastLogicalIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_logical_io")

    private String minLogicalIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_logical_io")

    private String maxLogicalIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_physical_reads")

    private String avgPhysicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_physical_reads")

    private String totalPhysicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_physical_reads")

    private String lastPhysicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_physical_reads")

    private String minPhysicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_physical_reads")

    private String maxPhysicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_elapsed_time")

    private String avgElapsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_elapsed_time")

    private String totalElapsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_elapsed_time")

    private String lastElapsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_elapsed_time")

    private String minElapsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_elapsed_time")

    private String maxElapsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows")

    private String avgRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rows")

    private String totalRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_rows")

    private String lastRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_rows")

    private String minRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows")

    private String maxRows;

    public TopObject withRowId(String rowId) {
        this.rowId = rowId;
        return this;
    }

    /**
     * id
     * @return rowId
     */
    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public TopObject withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public TopObject withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 模式
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public TopObject withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 对象名
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public TopObject withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 对象id
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public TopObject withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public TopObject withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * sql文本
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public TopObject withExecutionCount(String executionCount) {
        this.executionCount = executionCount;
        return this;
    }

    /**
     * 执行次数
     * @return executionCount
     */
    public String getExecutionCount() {
        return executionCount;
    }

    public void setExecutionCount(String executionCount) {
        this.executionCount = executionCount;
    }

    public TopObject withPlanGenerationNum(String planGenerationNum) {
        this.planGenerationNum = planGenerationNum;
        return this;
    }

    /**
     * 获取执行计划次数
     * @return planGenerationNum
     */
    public String getPlanGenerationNum() {
        return planGenerationNum;
    }

    public void setPlanGenerationNum(String planGenerationNum) {
        this.planGenerationNum = planGenerationNum;
    }

    public TopObject withLastExecutionTime(String lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
        return this;
    }

    /**
     * 最近执行时间
     * @return lastExecutionTime
     */
    public String getLastExecutionTime() {
        return lastExecutionTime;
    }

    public void setLastExecutionTime(String lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    public TopObject withAvgWorkerTime(String avgWorkerTime) {
        this.avgWorkerTime = avgWorkerTime;
        return this;
    }

    /**
     * 平均cpu耗时(单位为毫秒)
     * @return avgWorkerTime
     */
    public String getAvgWorkerTime() {
        return avgWorkerTime;
    }

    public void setAvgWorkerTime(String avgWorkerTime) {
        this.avgWorkerTime = avgWorkerTime;
    }

    public TopObject withTotalWorkerTime(String totalWorkerTime) {
        this.totalWorkerTime = totalWorkerTime;
        return this;
    }

    /**
     * 总cpu耗时(单位为毫秒)
     * @return totalWorkerTime
     */
    public String getTotalWorkerTime() {
        return totalWorkerTime;
    }

    public void setTotalWorkerTime(String totalWorkerTime) {
        this.totalWorkerTime = totalWorkerTime;
    }

    public TopObject withLastWorkerTime(String lastWorkerTime) {
        this.lastWorkerTime = lastWorkerTime;
        return this;
    }

    /**
     * 最近cpu耗时(单位为毫秒)
     * @return lastWorkerTime
     */
    public String getLastWorkerTime() {
        return lastWorkerTime;
    }

    public void setLastWorkerTime(String lastWorkerTime) {
        this.lastWorkerTime = lastWorkerTime;
    }

    public TopObject withMinWorkerTime(String minWorkerTime) {
        this.minWorkerTime = minWorkerTime;
        return this;
    }

    /**
     * 最小cpu耗时(单位为毫秒)
     * @return minWorkerTime
     */
    public String getMinWorkerTime() {
        return minWorkerTime;
    }

    public void setMinWorkerTime(String minWorkerTime) {
        this.minWorkerTime = minWorkerTime;
    }

    public TopObject withMaxWorkerTime(String maxWorkerTime) {
        this.maxWorkerTime = maxWorkerTime;
        return this;
    }

    /**
     * 最大cpu耗时(单位为毫秒)
     * @return maxWorkerTime
     */
    public String getMaxWorkerTime() {
        return maxWorkerTime;
    }

    public void setMaxWorkerTime(String maxWorkerTime) {
        this.maxWorkerTime = maxWorkerTime;
    }

    public TopObject withAvgLogicalReads(String avgLogicalReads) {
        this.avgLogicalReads = avgLogicalReads;
        return this;
    }

    /**
     * 平均逻辑读
     * @return avgLogicalReads
     */
    public String getAvgLogicalReads() {
        return avgLogicalReads;
    }

    public void setAvgLogicalReads(String avgLogicalReads) {
        this.avgLogicalReads = avgLogicalReads;
    }

    public TopObject withTotalLogicalReads(String totalLogicalReads) {
        this.totalLogicalReads = totalLogicalReads;
        return this;
    }

    /**
     * 总共逻辑读
     * @return totalLogicalReads
     */
    public String getTotalLogicalReads() {
        return totalLogicalReads;
    }

    public void setTotalLogicalReads(String totalLogicalReads) {
        this.totalLogicalReads = totalLogicalReads;
    }

    public TopObject withLastLogicalReads(String lastLogicalReads) {
        this.lastLogicalReads = lastLogicalReads;
        return this;
    }

    /**
     * 最近逻辑读
     * @return lastLogicalReads
     */
    public String getLastLogicalReads() {
        return lastLogicalReads;
    }

    public void setLastLogicalReads(String lastLogicalReads) {
        this.lastLogicalReads = lastLogicalReads;
    }

    public TopObject withMinLogicalReads(String minLogicalReads) {
        this.minLogicalReads = minLogicalReads;
        return this;
    }

    /**
     * 最小逻辑读
     * @return minLogicalReads
     */
    public String getMinLogicalReads() {
        return minLogicalReads;
    }

    public void setMinLogicalReads(String minLogicalReads) {
        this.minLogicalReads = minLogicalReads;
    }

    public TopObject withMaxLogicalReads(String maxLogicalReads) {
        this.maxLogicalReads = maxLogicalReads;
        return this;
    }

    /**
     * 最大逻辑读
     * @return maxLogicalReads
     */
    public String getMaxLogicalReads() {
        return maxLogicalReads;
    }

    public void setMaxLogicalReads(String maxLogicalReads) {
        this.maxLogicalReads = maxLogicalReads;
    }

    public TopObject withAvgLogicalWrites(String avgLogicalWrites) {
        this.avgLogicalWrites = avgLogicalWrites;
        return this;
    }

    /**
     * 平均逻辑写
     * @return avgLogicalWrites
     */
    public String getAvgLogicalWrites() {
        return avgLogicalWrites;
    }

    public void setAvgLogicalWrites(String avgLogicalWrites) {
        this.avgLogicalWrites = avgLogicalWrites;
    }

    public TopObject withTotalLogicalWrites(String totalLogicalWrites) {
        this.totalLogicalWrites = totalLogicalWrites;
        return this;
    }

    /**
     * 总共逻辑写
     * @return totalLogicalWrites
     */
    public String getTotalLogicalWrites() {
        return totalLogicalWrites;
    }

    public void setTotalLogicalWrites(String totalLogicalWrites) {
        this.totalLogicalWrites = totalLogicalWrites;
    }

    public TopObject withLastLogicalWrites(String lastLogicalWrites) {
        this.lastLogicalWrites = lastLogicalWrites;
        return this;
    }

    /**
     * 最近逻辑写
     * @return lastLogicalWrites
     */
    public String getLastLogicalWrites() {
        return lastLogicalWrites;
    }

    public void setLastLogicalWrites(String lastLogicalWrites) {
        this.lastLogicalWrites = lastLogicalWrites;
    }

    public TopObject withMinLogicalWrites(String minLogicalWrites) {
        this.minLogicalWrites = minLogicalWrites;
        return this;
    }

    /**
     * 最小逻辑写
     * @return minLogicalWrites
     */
    public String getMinLogicalWrites() {
        return minLogicalWrites;
    }

    public void setMinLogicalWrites(String minLogicalWrites) {
        this.minLogicalWrites = minLogicalWrites;
    }

    public TopObject withMaxLogicalWrites(String maxLogicalWrites) {
        this.maxLogicalWrites = maxLogicalWrites;
        return this;
    }

    /**
     * 最大逻辑写
     * @return maxLogicalWrites
     */
    public String getMaxLogicalWrites() {
        return maxLogicalWrites;
    }

    public void setMaxLogicalWrites(String maxLogicalWrites) {
        this.maxLogicalWrites = maxLogicalWrites;
    }

    public TopObject withAvgLogicalIo(String avgLogicalIo) {
        this.avgLogicalIo = avgLogicalIo;
        return this;
    }

    /**
     * 平均逻辑io
     * @return avgLogicalIo
     */
    public String getAvgLogicalIo() {
        return avgLogicalIo;
    }

    public void setAvgLogicalIo(String avgLogicalIo) {
        this.avgLogicalIo = avgLogicalIo;
    }

    public TopObject withTotalLogicalIo(String totalLogicalIo) {
        this.totalLogicalIo = totalLogicalIo;
        return this;
    }

    /**
     * 总共逻辑io
     * @return totalLogicalIo
     */
    public String getTotalLogicalIo() {
        return totalLogicalIo;
    }

    public void setTotalLogicalIo(String totalLogicalIo) {
        this.totalLogicalIo = totalLogicalIo;
    }

    public TopObject withLastLogicalIo(String lastLogicalIo) {
        this.lastLogicalIo = lastLogicalIo;
        return this;
    }

    /**
     * 最近逻辑io
     * @return lastLogicalIo
     */
    public String getLastLogicalIo() {
        return lastLogicalIo;
    }

    public void setLastLogicalIo(String lastLogicalIo) {
        this.lastLogicalIo = lastLogicalIo;
    }

    public TopObject withMinLogicalIo(String minLogicalIo) {
        this.minLogicalIo = minLogicalIo;
        return this;
    }

    /**
     * 最小逻辑io
     * @return minLogicalIo
     */
    public String getMinLogicalIo() {
        return minLogicalIo;
    }

    public void setMinLogicalIo(String minLogicalIo) {
        this.minLogicalIo = minLogicalIo;
    }

    public TopObject withMaxLogicalIo(String maxLogicalIo) {
        this.maxLogicalIo = maxLogicalIo;
        return this;
    }

    /**
     * 最大逻辑io
     * @return maxLogicalIo
     */
    public String getMaxLogicalIo() {
        return maxLogicalIo;
    }

    public void setMaxLogicalIo(String maxLogicalIo) {
        this.maxLogicalIo = maxLogicalIo;
    }

    public TopObject withAvgPhysicalReads(String avgPhysicalReads) {
        this.avgPhysicalReads = avgPhysicalReads;
        return this;
    }

    /**
     * 平均物理读
     * @return avgPhysicalReads
     */
    public String getAvgPhysicalReads() {
        return avgPhysicalReads;
    }

    public void setAvgPhysicalReads(String avgPhysicalReads) {
        this.avgPhysicalReads = avgPhysicalReads;
    }

    public TopObject withTotalPhysicalReads(String totalPhysicalReads) {
        this.totalPhysicalReads = totalPhysicalReads;
        return this;
    }

    /**
     * 总共物理读
     * @return totalPhysicalReads
     */
    public String getTotalPhysicalReads() {
        return totalPhysicalReads;
    }

    public void setTotalPhysicalReads(String totalPhysicalReads) {
        this.totalPhysicalReads = totalPhysicalReads;
    }

    public TopObject withLastPhysicalReads(String lastPhysicalReads) {
        this.lastPhysicalReads = lastPhysicalReads;
        return this;
    }

    /**
     * 最近物理读
     * @return lastPhysicalReads
     */
    public String getLastPhysicalReads() {
        return lastPhysicalReads;
    }

    public void setLastPhysicalReads(String lastPhysicalReads) {
        this.lastPhysicalReads = lastPhysicalReads;
    }

    public TopObject withMinPhysicalReads(String minPhysicalReads) {
        this.minPhysicalReads = minPhysicalReads;
        return this;
    }

    /**
     * 最小物理读
     * @return minPhysicalReads
     */
    public String getMinPhysicalReads() {
        return minPhysicalReads;
    }

    public void setMinPhysicalReads(String minPhysicalReads) {
        this.minPhysicalReads = minPhysicalReads;
    }

    public TopObject withMaxPhysicalReads(String maxPhysicalReads) {
        this.maxPhysicalReads = maxPhysicalReads;
        return this;
    }

    /**
     * 最大物理读
     * @return maxPhysicalReads
     */
    public String getMaxPhysicalReads() {
        return maxPhysicalReads;
    }

    public void setMaxPhysicalReads(String maxPhysicalReads) {
        this.maxPhysicalReads = maxPhysicalReads;
    }

    public TopObject withAvgElapsedTime(String avgElapsedTime) {
        this.avgElapsedTime = avgElapsedTime;
        return this;
    }

    /**
     * 平均执行耗时
     * @return avgElapsedTime
     */
    public String getAvgElapsedTime() {
        return avgElapsedTime;
    }

    public void setAvgElapsedTime(String avgElapsedTime) {
        this.avgElapsedTime = avgElapsedTime;
    }

    public TopObject withTotalElapsedTime(String totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
        return this;
    }

    /**
     * 总共执行耗时
     * @return totalElapsedTime
     */
    public String getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(String totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public TopObject withLastElapsedTime(String lastElapsedTime) {
        this.lastElapsedTime = lastElapsedTime;
        return this;
    }

    /**
     * 最近执行耗时
     * @return lastElapsedTime
     */
    public String getLastElapsedTime() {
        return lastElapsedTime;
    }

    public void setLastElapsedTime(String lastElapsedTime) {
        this.lastElapsedTime = lastElapsedTime;
    }

    public TopObject withMinElapsedTime(String minElapsedTime) {
        this.minElapsedTime = minElapsedTime;
        return this;
    }

    /**
     * 最小执行耗时
     * @return minElapsedTime
     */
    public String getMinElapsedTime() {
        return minElapsedTime;
    }

    public void setMinElapsedTime(String minElapsedTime) {
        this.minElapsedTime = minElapsedTime;
    }

    public TopObject withMaxElapsedTime(String maxElapsedTime) {
        this.maxElapsedTime = maxElapsedTime;
        return this;
    }

    /**
     * 最大执行耗时
     * @return maxElapsedTime
     */
    public String getMaxElapsedTime() {
        return maxElapsedTime;
    }

    public void setMaxElapsedTime(String maxElapsedTime) {
        this.maxElapsedTime = maxElapsedTime;
    }

    public TopObject withAvgRows(String avgRows) {
        this.avgRows = avgRows;
        return this;
    }

    /**
     * 平均返回行
     * @return avgRows
     */
    public String getAvgRows() {
        return avgRows;
    }

    public void setAvgRows(String avgRows) {
        this.avgRows = avgRows;
    }

    public TopObject withTotalRows(String totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * 总返回行
     * @return totalRows
     */
    public String getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(String totalRows) {
        this.totalRows = totalRows;
    }

    public TopObject withLastRows(String lastRows) {
        this.lastRows = lastRows;
        return this;
    }

    /**
     * 最近返回行
     * @return lastRows
     */
    public String getLastRows() {
        return lastRows;
    }

    public void setLastRows(String lastRows) {
        this.lastRows = lastRows;
    }

    public TopObject withMinRows(String minRows) {
        this.minRows = minRows;
        return this;
    }

    /**
     * 最小返回行
     * @return minRows
     */
    public String getMinRows() {
        return minRows;
    }

    public void setMinRows(String minRows) {
        this.minRows = minRows;
    }

    public TopObject withMaxRows(String maxRows) {
        this.maxRows = maxRows;
        return this;
    }

    /**
     * 最大返回行
     * @return maxRows
     */
    public String getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(String maxRows) {
        this.maxRows = maxRows;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopObject that = (TopObject) obj;
        return Objects.equals(this.rowId, that.rowId) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.objectName, that.objectName)
            && Objects.equals(this.objectId, that.objectId) && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.executionCount, that.executionCount)
            && Objects.equals(this.planGenerationNum, that.planGenerationNum)
            && Objects.equals(this.lastExecutionTime, that.lastExecutionTime)
            && Objects.equals(this.avgWorkerTime, that.avgWorkerTime)
            && Objects.equals(this.totalWorkerTime, that.totalWorkerTime)
            && Objects.equals(this.lastWorkerTime, that.lastWorkerTime)
            && Objects.equals(this.minWorkerTime, that.minWorkerTime)
            && Objects.equals(this.maxWorkerTime, that.maxWorkerTime)
            && Objects.equals(this.avgLogicalReads, that.avgLogicalReads)
            && Objects.equals(this.totalLogicalReads, that.totalLogicalReads)
            && Objects.equals(this.lastLogicalReads, that.lastLogicalReads)
            && Objects.equals(this.minLogicalReads, that.minLogicalReads)
            && Objects.equals(this.maxLogicalReads, that.maxLogicalReads)
            && Objects.equals(this.avgLogicalWrites, that.avgLogicalWrites)
            && Objects.equals(this.totalLogicalWrites, that.totalLogicalWrites)
            && Objects.equals(this.lastLogicalWrites, that.lastLogicalWrites)
            && Objects.equals(this.minLogicalWrites, that.minLogicalWrites)
            && Objects.equals(this.maxLogicalWrites, that.maxLogicalWrites)
            && Objects.equals(this.avgLogicalIo, that.avgLogicalIo)
            && Objects.equals(this.totalLogicalIo, that.totalLogicalIo)
            && Objects.equals(this.lastLogicalIo, that.lastLogicalIo)
            && Objects.equals(this.minLogicalIo, that.minLogicalIo)
            && Objects.equals(this.maxLogicalIo, that.maxLogicalIo)
            && Objects.equals(this.avgPhysicalReads, that.avgPhysicalReads)
            && Objects.equals(this.totalPhysicalReads, that.totalPhysicalReads)
            && Objects.equals(this.lastPhysicalReads, that.lastPhysicalReads)
            && Objects.equals(this.minPhysicalReads, that.minPhysicalReads)
            && Objects.equals(this.maxPhysicalReads, that.maxPhysicalReads)
            && Objects.equals(this.avgElapsedTime, that.avgElapsedTime)
            && Objects.equals(this.totalElapsedTime, that.totalElapsedTime)
            && Objects.equals(this.lastElapsedTime, that.lastElapsedTime)
            && Objects.equals(this.minElapsedTime, that.minElapsedTime)
            && Objects.equals(this.maxElapsedTime, that.maxElapsedTime) && Objects.equals(this.avgRows, that.avgRows)
            && Objects.equals(this.totalRows, that.totalRows) && Objects.equals(this.lastRows, that.lastRows)
            && Objects.equals(this.minRows, that.minRows) && Objects.equals(this.maxRows, that.maxRows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowId,
            databaseName,
            schemaName,
            objectName,
            objectId,
            objectType,
            sqlStatement,
            executionCount,
            planGenerationNum,
            lastExecutionTime,
            avgWorkerTime,
            totalWorkerTime,
            lastWorkerTime,
            minWorkerTime,
            maxWorkerTime,
            avgLogicalReads,
            totalLogicalReads,
            lastLogicalReads,
            minLogicalReads,
            maxLogicalReads,
            avgLogicalWrites,
            totalLogicalWrites,
            lastLogicalWrites,
            minLogicalWrites,
            maxLogicalWrites,
            avgLogicalIo,
            totalLogicalIo,
            lastLogicalIo,
            minLogicalIo,
            maxLogicalIo,
            avgPhysicalReads,
            totalPhysicalReads,
            lastPhysicalReads,
            minPhysicalReads,
            maxPhysicalReads,
            avgElapsedTime,
            totalElapsedTime,
            lastElapsedTime,
            minElapsedTime,
            maxElapsedTime,
            avgRows,
            totalRows,
            lastRows,
            minRows,
            maxRows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopObject {\n");
        sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    executionCount: ").append(toIndentedString(executionCount)).append("\n");
        sb.append("    planGenerationNum: ").append(toIndentedString(planGenerationNum)).append("\n");
        sb.append("    lastExecutionTime: ").append(toIndentedString(lastExecutionTime)).append("\n");
        sb.append("    avgWorkerTime: ").append(toIndentedString(avgWorkerTime)).append("\n");
        sb.append("    totalWorkerTime: ").append(toIndentedString(totalWorkerTime)).append("\n");
        sb.append("    lastWorkerTime: ").append(toIndentedString(lastWorkerTime)).append("\n");
        sb.append("    minWorkerTime: ").append(toIndentedString(minWorkerTime)).append("\n");
        sb.append("    maxWorkerTime: ").append(toIndentedString(maxWorkerTime)).append("\n");
        sb.append("    avgLogicalReads: ").append(toIndentedString(avgLogicalReads)).append("\n");
        sb.append("    totalLogicalReads: ").append(toIndentedString(totalLogicalReads)).append("\n");
        sb.append("    lastLogicalReads: ").append(toIndentedString(lastLogicalReads)).append("\n");
        sb.append("    minLogicalReads: ").append(toIndentedString(minLogicalReads)).append("\n");
        sb.append("    maxLogicalReads: ").append(toIndentedString(maxLogicalReads)).append("\n");
        sb.append("    avgLogicalWrites: ").append(toIndentedString(avgLogicalWrites)).append("\n");
        sb.append("    totalLogicalWrites: ").append(toIndentedString(totalLogicalWrites)).append("\n");
        sb.append("    lastLogicalWrites: ").append(toIndentedString(lastLogicalWrites)).append("\n");
        sb.append("    minLogicalWrites: ").append(toIndentedString(minLogicalWrites)).append("\n");
        sb.append("    maxLogicalWrites: ").append(toIndentedString(maxLogicalWrites)).append("\n");
        sb.append("    avgLogicalIo: ").append(toIndentedString(avgLogicalIo)).append("\n");
        sb.append("    totalLogicalIo: ").append(toIndentedString(totalLogicalIo)).append("\n");
        sb.append("    lastLogicalIo: ").append(toIndentedString(lastLogicalIo)).append("\n");
        sb.append("    minLogicalIo: ").append(toIndentedString(minLogicalIo)).append("\n");
        sb.append("    maxLogicalIo: ").append(toIndentedString(maxLogicalIo)).append("\n");
        sb.append("    avgPhysicalReads: ").append(toIndentedString(avgPhysicalReads)).append("\n");
        sb.append("    totalPhysicalReads: ").append(toIndentedString(totalPhysicalReads)).append("\n");
        sb.append("    lastPhysicalReads: ").append(toIndentedString(lastPhysicalReads)).append("\n");
        sb.append("    minPhysicalReads: ").append(toIndentedString(minPhysicalReads)).append("\n");
        sb.append("    maxPhysicalReads: ").append(toIndentedString(maxPhysicalReads)).append("\n");
        sb.append("    avgElapsedTime: ").append(toIndentedString(avgElapsedTime)).append("\n");
        sb.append("    totalElapsedTime: ").append(toIndentedString(totalElapsedTime)).append("\n");
        sb.append("    lastElapsedTime: ").append(toIndentedString(lastElapsedTime)).append("\n");
        sb.append("    minElapsedTime: ").append(toIndentedString(minElapsedTime)).append("\n");
        sb.append("    maxElapsedTime: ").append(toIndentedString(maxElapsedTime)).append("\n");
        sb.append("    avgRows: ").append(toIndentedString(avgRows)).append("\n");
        sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
        sb.append("    lastRows: ").append(toIndentedString(lastRows)).append("\n");
        sb.append("    minRows: ").append(toIndentedString(minRows)).append("\n");
        sb.append("    maxRows: ").append(toIndentedString(maxRows)).append("\n");
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
