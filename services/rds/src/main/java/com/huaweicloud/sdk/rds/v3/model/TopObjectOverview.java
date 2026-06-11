package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * top对象总览
 */
public class TopObjectOverview {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_cpu_time")

    private Double avgCpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_cpu_time_percentage")

    private Double avgCpuTimePercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_execution_time")

    private Double avgExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_execution_time_percentage")

    private Double avgExecutionTimePercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_io")

    private Double avgLogicalIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_io_percentage")

    private Double avgLogicalIoPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_reads")

    private Double avgLogicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_reads_percentage")

    private Double avgLogicalReadsPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_writes")

    private Double avgLogicalWrites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_writes_percentage")

    private Double avgLogicalWritesPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_physical_reads")

    private Double avgPhysicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_physical_reads_percentage")

    private Double avgPhysicalReadsPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows")

    private Double avgRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_percentage")

    private Double avgRowsPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_id")

    private String rowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu_time")

    private Double totalCpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu_time_percentage")

    private Double totalCpuTimePercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_execution_time")

    private Double totalExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_execution_time_percentage")

    private Double totalExecutionTimePercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_execution_count")

    private Double totalExecutionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_io")

    private Double totalLogicalIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_io_percentage")

    private Double totalLogicalIoPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_reads")

    private Double totalLogicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_reads_percentage")

    private Double totalLogicalReadsPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_writes")

    private Double totalLogicalWrites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_writes_percentage")

    private Double totalLogicalWritesPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_physical_reads")

    private Double totalPhysicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_physical_reads_percentage")

    private Double totalPhysicalReadsPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rows")

    private Double totalRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rows_percentage")

    private Double totalRowsPercentage;

    public TopObjectOverview withAvgCpuTime(Double avgCpuTime) {
        this.avgCpuTime = avgCpuTime;
        return this;
    }

    /**
     * 平均cpu耗时(单位为毫秒)
     * @return avgCpuTime
     */
    public Double getAvgCpuTime() {
        return avgCpuTime;
    }

    public void setAvgCpuTime(Double avgCpuTime) {
        this.avgCpuTime = avgCpuTime;
    }

    public TopObjectOverview withAvgCpuTimePercentage(Double avgCpuTimePercentage) {
        this.avgCpuTimePercentage = avgCpuTimePercentage;
        return this;
    }

    /**
     * 平均cpu耗时百分比
     * @return avgCpuTimePercentage
     */
    public Double getAvgCpuTimePercentage() {
        return avgCpuTimePercentage;
    }

    public void setAvgCpuTimePercentage(Double avgCpuTimePercentage) {
        this.avgCpuTimePercentage = avgCpuTimePercentage;
    }

    public TopObjectOverview withAvgExecutionTime(Double avgExecutionTime) {
        this.avgExecutionTime = avgExecutionTime;
        return this;
    }

    /**
     * 平均执行耗时(单位为毫秒)
     * @return avgExecutionTime
     */
    public Double getAvgExecutionTime() {
        return avgExecutionTime;
    }

    public void setAvgExecutionTime(Double avgExecutionTime) {
        this.avgExecutionTime = avgExecutionTime;
    }

    public TopObjectOverview withAvgExecutionTimePercentage(Double avgExecutionTimePercentage) {
        this.avgExecutionTimePercentage = avgExecutionTimePercentage;
        return this;
    }

    /**
     * 平均执行耗时百分比
     * @return avgExecutionTimePercentage
     */
    public Double getAvgExecutionTimePercentage() {
        return avgExecutionTimePercentage;
    }

    public void setAvgExecutionTimePercentage(Double avgExecutionTimePercentage) {
        this.avgExecutionTimePercentage = avgExecutionTimePercentage;
    }

    public TopObjectOverview withAvgLogicalIo(Double avgLogicalIo) {
        this.avgLogicalIo = avgLogicalIo;
        return this;
    }

    /**
     * 平均逻辑io
     * @return avgLogicalIo
     */
    public Double getAvgLogicalIo() {
        return avgLogicalIo;
    }

    public void setAvgLogicalIo(Double avgLogicalIo) {
        this.avgLogicalIo = avgLogicalIo;
    }

    public TopObjectOverview withAvgLogicalIoPercentage(Double avgLogicalIoPercentage) {
        this.avgLogicalIoPercentage = avgLogicalIoPercentage;
        return this;
    }

    /**
     * 平均逻辑io百分比
     * @return avgLogicalIoPercentage
     */
    public Double getAvgLogicalIoPercentage() {
        return avgLogicalIoPercentage;
    }

    public void setAvgLogicalIoPercentage(Double avgLogicalIoPercentage) {
        this.avgLogicalIoPercentage = avgLogicalIoPercentage;
    }

    public TopObjectOverview withAvgLogicalReads(Double avgLogicalReads) {
        this.avgLogicalReads = avgLogicalReads;
        return this;
    }

    /**
     * 平均逻辑读
     * @return avgLogicalReads
     */
    public Double getAvgLogicalReads() {
        return avgLogicalReads;
    }

    public void setAvgLogicalReads(Double avgLogicalReads) {
        this.avgLogicalReads = avgLogicalReads;
    }

    public TopObjectOverview withAvgLogicalReadsPercentage(Double avgLogicalReadsPercentage) {
        this.avgLogicalReadsPercentage = avgLogicalReadsPercentage;
        return this;
    }

    /**
     * 平均逻辑读百分比
     * @return avgLogicalReadsPercentage
     */
    public Double getAvgLogicalReadsPercentage() {
        return avgLogicalReadsPercentage;
    }

    public void setAvgLogicalReadsPercentage(Double avgLogicalReadsPercentage) {
        this.avgLogicalReadsPercentage = avgLogicalReadsPercentage;
    }

    public TopObjectOverview withAvgLogicalWrites(Double avgLogicalWrites) {
        this.avgLogicalWrites = avgLogicalWrites;
        return this;
    }

    /**
     * 平均逻辑写
     * @return avgLogicalWrites
     */
    public Double getAvgLogicalWrites() {
        return avgLogicalWrites;
    }

    public void setAvgLogicalWrites(Double avgLogicalWrites) {
        this.avgLogicalWrites = avgLogicalWrites;
    }

    public TopObjectOverview withAvgLogicalWritesPercentage(Double avgLogicalWritesPercentage) {
        this.avgLogicalWritesPercentage = avgLogicalWritesPercentage;
        return this;
    }

    /**
     * 平均逻辑写百分比
     * @return avgLogicalWritesPercentage
     */
    public Double getAvgLogicalWritesPercentage() {
        return avgLogicalWritesPercentage;
    }

    public void setAvgLogicalWritesPercentage(Double avgLogicalWritesPercentage) {
        this.avgLogicalWritesPercentage = avgLogicalWritesPercentage;
    }

    public TopObjectOverview withAvgPhysicalReads(Double avgPhysicalReads) {
        this.avgPhysicalReads = avgPhysicalReads;
        return this;
    }

    /**
     * 平均物理读
     * @return avgPhysicalReads
     */
    public Double getAvgPhysicalReads() {
        return avgPhysicalReads;
    }

    public void setAvgPhysicalReads(Double avgPhysicalReads) {
        this.avgPhysicalReads = avgPhysicalReads;
    }

    public TopObjectOverview withAvgPhysicalReadsPercentage(Double avgPhysicalReadsPercentage) {
        this.avgPhysicalReadsPercentage = avgPhysicalReadsPercentage;
        return this;
    }

    /**
     * 平均物理读百分比
     * @return avgPhysicalReadsPercentage
     */
    public Double getAvgPhysicalReadsPercentage() {
        return avgPhysicalReadsPercentage;
    }

    public void setAvgPhysicalReadsPercentage(Double avgPhysicalReadsPercentage) {
        this.avgPhysicalReadsPercentage = avgPhysicalReadsPercentage;
    }

    public TopObjectOverview withAvgRows(Double avgRows) {
        this.avgRows = avgRows;
        return this;
    }

    /**
     * 平均返回行
     * @return avgRows
     */
    public Double getAvgRows() {
        return avgRows;
    }

    public void setAvgRows(Double avgRows) {
        this.avgRows = avgRows;
    }

    public TopObjectOverview withAvgRowsPercentage(Double avgRowsPercentage) {
        this.avgRowsPercentage = avgRowsPercentage;
        return this;
    }

    /**
     * 平均返回行百分比
     * @return avgRowsPercentage
     */
    public Double getAvgRowsPercentage() {
        return avgRowsPercentage;
    }

    public void setAvgRowsPercentage(Double avgRowsPercentage) {
        this.avgRowsPercentage = avgRowsPercentage;
    }

    public TopObjectOverview withDatabaseName(String databaseName) {
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

    public TopObjectOverview withObjectId(String objectId) {
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

    public TopObjectOverview withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 对象名称
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public TopObjectOverview withRowId(String rowId) {
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

    public TopObjectOverview withObjectType(String objectType) {
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

    public TopObjectOverview withSchemaName(String schemaName) {
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

    public TopObjectOverview withTotalCpuTime(Double totalCpuTime) {
        this.totalCpuTime = totalCpuTime;
        return this;
    }

    /**
     * 总cpu耗时(单位为毫秒)
     * @return totalCpuTime
     */
    public Double getTotalCpuTime() {
        return totalCpuTime;
    }

    public void setTotalCpuTime(Double totalCpuTime) {
        this.totalCpuTime = totalCpuTime;
    }

    public TopObjectOverview withTotalCpuTimePercentage(Double totalCpuTimePercentage) {
        this.totalCpuTimePercentage = totalCpuTimePercentage;
        return this;
    }

    /**
     * 总cpu耗时百分比
     * @return totalCpuTimePercentage
     */
    public Double getTotalCpuTimePercentage() {
        return totalCpuTimePercentage;
    }

    public void setTotalCpuTimePercentage(Double totalCpuTimePercentage) {
        this.totalCpuTimePercentage = totalCpuTimePercentage;
    }

    public TopObjectOverview withTotalExecutionTime(Double totalExecutionTime) {
        this.totalExecutionTime = totalExecutionTime;
        return this;
    }

    /**
     * 总执行耗时(单位为毫秒)
     * @return totalExecutionTime
     */
    public Double getTotalExecutionTime() {
        return totalExecutionTime;
    }

    public void setTotalExecutionTime(Double totalExecutionTime) {
        this.totalExecutionTime = totalExecutionTime;
    }

    public TopObjectOverview withTotalExecutionTimePercentage(Double totalExecutionTimePercentage) {
        this.totalExecutionTimePercentage = totalExecutionTimePercentage;
        return this;
    }

    /**
     * 总执行耗时百分比
     * @return totalExecutionTimePercentage
     */
    public Double getTotalExecutionTimePercentage() {
        return totalExecutionTimePercentage;
    }

    public void setTotalExecutionTimePercentage(Double totalExecutionTimePercentage) {
        this.totalExecutionTimePercentage = totalExecutionTimePercentage;
    }

    public TopObjectOverview withTotalExecutionCount(Double totalExecutionCount) {
        this.totalExecutionCount = totalExecutionCount;
        return this;
    }

    /**
     * 总执行次数
     * @return totalExecutionCount
     */
    public Double getTotalExecutionCount() {
        return totalExecutionCount;
    }

    public void setTotalExecutionCount(Double totalExecutionCount) {
        this.totalExecutionCount = totalExecutionCount;
    }

    public TopObjectOverview withTotalLogicalIo(Double totalLogicalIo) {
        this.totalLogicalIo = totalLogicalIo;
        return this;
    }

    /**
     * 总逻辑io
     * @return totalLogicalIo
     */
    public Double getTotalLogicalIo() {
        return totalLogicalIo;
    }

    public void setTotalLogicalIo(Double totalLogicalIo) {
        this.totalLogicalIo = totalLogicalIo;
    }

    public TopObjectOverview withTotalLogicalIoPercentage(Double totalLogicalIoPercentage) {
        this.totalLogicalIoPercentage = totalLogicalIoPercentage;
        return this;
    }

    /**
     * 总逻辑io百分比
     * @return totalLogicalIoPercentage
     */
    public Double getTotalLogicalIoPercentage() {
        return totalLogicalIoPercentage;
    }

    public void setTotalLogicalIoPercentage(Double totalLogicalIoPercentage) {
        this.totalLogicalIoPercentage = totalLogicalIoPercentage;
    }

    public TopObjectOverview withTotalLogicalReads(Double totalLogicalReads) {
        this.totalLogicalReads = totalLogicalReads;
        return this;
    }

    /**
     * 总逻辑读
     * @return totalLogicalReads
     */
    public Double getTotalLogicalReads() {
        return totalLogicalReads;
    }

    public void setTotalLogicalReads(Double totalLogicalReads) {
        this.totalLogicalReads = totalLogicalReads;
    }

    public TopObjectOverview withTotalLogicalReadsPercentage(Double totalLogicalReadsPercentage) {
        this.totalLogicalReadsPercentage = totalLogicalReadsPercentage;
        return this;
    }

    /**
     * 总逻辑读百分比
     * @return totalLogicalReadsPercentage
     */
    public Double getTotalLogicalReadsPercentage() {
        return totalLogicalReadsPercentage;
    }

    public void setTotalLogicalReadsPercentage(Double totalLogicalReadsPercentage) {
        this.totalLogicalReadsPercentage = totalLogicalReadsPercentage;
    }

    public TopObjectOverview withTotalLogicalWrites(Double totalLogicalWrites) {
        this.totalLogicalWrites = totalLogicalWrites;
        return this;
    }

    /**
     * 总逻辑写
     * @return totalLogicalWrites
     */
    public Double getTotalLogicalWrites() {
        return totalLogicalWrites;
    }

    public void setTotalLogicalWrites(Double totalLogicalWrites) {
        this.totalLogicalWrites = totalLogicalWrites;
    }

    public TopObjectOverview withTotalLogicalWritesPercentage(Double totalLogicalWritesPercentage) {
        this.totalLogicalWritesPercentage = totalLogicalWritesPercentage;
        return this;
    }

    /**
     * 总逻辑写百分比
     * @return totalLogicalWritesPercentage
     */
    public Double getTotalLogicalWritesPercentage() {
        return totalLogicalWritesPercentage;
    }

    public void setTotalLogicalWritesPercentage(Double totalLogicalWritesPercentage) {
        this.totalLogicalWritesPercentage = totalLogicalWritesPercentage;
    }

    public TopObjectOverview withTotalPhysicalReads(Double totalPhysicalReads) {
        this.totalPhysicalReads = totalPhysicalReads;
        return this;
    }

    /**
     * 总物理读
     * @return totalPhysicalReads
     */
    public Double getTotalPhysicalReads() {
        return totalPhysicalReads;
    }

    public void setTotalPhysicalReads(Double totalPhysicalReads) {
        this.totalPhysicalReads = totalPhysicalReads;
    }

    public TopObjectOverview withTotalPhysicalReadsPercentage(Double totalPhysicalReadsPercentage) {
        this.totalPhysicalReadsPercentage = totalPhysicalReadsPercentage;
        return this;
    }

    /**
     * 总物理读百分比
     * @return totalPhysicalReadsPercentage
     */
    public Double getTotalPhysicalReadsPercentage() {
        return totalPhysicalReadsPercentage;
    }

    public void setTotalPhysicalReadsPercentage(Double totalPhysicalReadsPercentage) {
        this.totalPhysicalReadsPercentage = totalPhysicalReadsPercentage;
    }

    public TopObjectOverview withTotalRows(Double totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * 总返回行
     * @return totalRows
     */
    public Double getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Double totalRows) {
        this.totalRows = totalRows;
    }

    public TopObjectOverview withTotalRowsPercentage(Double totalRowsPercentage) {
        this.totalRowsPercentage = totalRowsPercentage;
        return this;
    }

    /**
     * 总返回行百分比
     * @return totalRowsPercentage
     */
    public Double getTotalRowsPercentage() {
        return totalRowsPercentage;
    }

    public void setTotalRowsPercentage(Double totalRowsPercentage) {
        this.totalRowsPercentage = totalRowsPercentage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopObjectOverview that = (TopObjectOverview) obj;
        return Objects.equals(this.avgCpuTime, that.avgCpuTime)
            && Objects.equals(this.avgCpuTimePercentage, that.avgCpuTimePercentage)
            && Objects.equals(this.avgExecutionTime, that.avgExecutionTime)
            && Objects.equals(this.avgExecutionTimePercentage, that.avgExecutionTimePercentage)
            && Objects.equals(this.avgLogicalIo, that.avgLogicalIo)
            && Objects.equals(this.avgLogicalIoPercentage, that.avgLogicalIoPercentage)
            && Objects.equals(this.avgLogicalReads, that.avgLogicalReads)
            && Objects.equals(this.avgLogicalReadsPercentage, that.avgLogicalReadsPercentage)
            && Objects.equals(this.avgLogicalWrites, that.avgLogicalWrites)
            && Objects.equals(this.avgLogicalWritesPercentage, that.avgLogicalWritesPercentage)
            && Objects.equals(this.avgPhysicalReads, that.avgPhysicalReads)
            && Objects.equals(this.avgPhysicalReadsPercentage, that.avgPhysicalReadsPercentage)
            && Objects.equals(this.avgRows, that.avgRows)
            && Objects.equals(this.avgRowsPercentage, that.avgRowsPercentage)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.objectName, that.objectName) && Objects.equals(this.rowId, that.rowId)
            && Objects.equals(this.objectType, that.objectType) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.totalCpuTime, that.totalCpuTime)
            && Objects.equals(this.totalCpuTimePercentage, that.totalCpuTimePercentage)
            && Objects.equals(this.totalExecutionTime, that.totalExecutionTime)
            && Objects.equals(this.totalExecutionTimePercentage, that.totalExecutionTimePercentage)
            && Objects.equals(this.totalExecutionCount, that.totalExecutionCount)
            && Objects.equals(this.totalLogicalIo, that.totalLogicalIo)
            && Objects.equals(this.totalLogicalIoPercentage, that.totalLogicalIoPercentage)
            && Objects.equals(this.totalLogicalReads, that.totalLogicalReads)
            && Objects.equals(this.totalLogicalReadsPercentage, that.totalLogicalReadsPercentage)
            && Objects.equals(this.totalLogicalWrites, that.totalLogicalWrites)
            && Objects.equals(this.totalLogicalWritesPercentage, that.totalLogicalWritesPercentage)
            && Objects.equals(this.totalPhysicalReads, that.totalPhysicalReads)
            && Objects.equals(this.totalPhysicalReadsPercentage, that.totalPhysicalReadsPercentage)
            && Objects.equals(this.totalRows, that.totalRows)
            && Objects.equals(this.totalRowsPercentage, that.totalRowsPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avgCpuTime,
            avgCpuTimePercentage,
            avgExecutionTime,
            avgExecutionTimePercentage,
            avgLogicalIo,
            avgLogicalIoPercentage,
            avgLogicalReads,
            avgLogicalReadsPercentage,
            avgLogicalWrites,
            avgLogicalWritesPercentage,
            avgPhysicalReads,
            avgPhysicalReadsPercentage,
            avgRows,
            avgRowsPercentage,
            databaseName,
            objectId,
            objectName,
            rowId,
            objectType,
            schemaName,
            totalCpuTime,
            totalCpuTimePercentage,
            totalExecutionTime,
            totalExecutionTimePercentage,
            totalExecutionCount,
            totalLogicalIo,
            totalLogicalIoPercentage,
            totalLogicalReads,
            totalLogicalReadsPercentage,
            totalLogicalWrites,
            totalLogicalWritesPercentage,
            totalPhysicalReads,
            totalPhysicalReadsPercentage,
            totalRows,
            totalRowsPercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopObjectOverview {\n");
        sb.append("    avgCpuTime: ").append(toIndentedString(avgCpuTime)).append("\n");
        sb.append("    avgCpuTimePercentage: ").append(toIndentedString(avgCpuTimePercentage)).append("\n");
        sb.append("    avgExecutionTime: ").append(toIndentedString(avgExecutionTime)).append("\n");
        sb.append("    avgExecutionTimePercentage: ").append(toIndentedString(avgExecutionTimePercentage)).append("\n");
        sb.append("    avgLogicalIo: ").append(toIndentedString(avgLogicalIo)).append("\n");
        sb.append("    avgLogicalIoPercentage: ").append(toIndentedString(avgLogicalIoPercentage)).append("\n");
        sb.append("    avgLogicalReads: ").append(toIndentedString(avgLogicalReads)).append("\n");
        sb.append("    avgLogicalReadsPercentage: ").append(toIndentedString(avgLogicalReadsPercentage)).append("\n");
        sb.append("    avgLogicalWrites: ").append(toIndentedString(avgLogicalWrites)).append("\n");
        sb.append("    avgLogicalWritesPercentage: ").append(toIndentedString(avgLogicalWritesPercentage)).append("\n");
        sb.append("    avgPhysicalReads: ").append(toIndentedString(avgPhysicalReads)).append("\n");
        sb.append("    avgPhysicalReadsPercentage: ").append(toIndentedString(avgPhysicalReadsPercentage)).append("\n");
        sb.append("    avgRows: ").append(toIndentedString(avgRows)).append("\n");
        sb.append("    avgRowsPercentage: ").append(toIndentedString(avgRowsPercentage)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    totalCpuTime: ").append(toIndentedString(totalCpuTime)).append("\n");
        sb.append("    totalCpuTimePercentage: ").append(toIndentedString(totalCpuTimePercentage)).append("\n");
        sb.append("    totalExecutionTime: ").append(toIndentedString(totalExecutionTime)).append("\n");
        sb.append("    totalExecutionTimePercentage: ")
            .append(toIndentedString(totalExecutionTimePercentage))
            .append("\n");
        sb.append("    totalExecutionCount: ").append(toIndentedString(totalExecutionCount)).append("\n");
        sb.append("    totalLogicalIo: ").append(toIndentedString(totalLogicalIo)).append("\n");
        sb.append("    totalLogicalIoPercentage: ").append(toIndentedString(totalLogicalIoPercentage)).append("\n");
        sb.append("    totalLogicalReads: ").append(toIndentedString(totalLogicalReads)).append("\n");
        sb.append("    totalLogicalReadsPercentage: ")
            .append(toIndentedString(totalLogicalReadsPercentage))
            .append("\n");
        sb.append("    totalLogicalWrites: ").append(toIndentedString(totalLogicalWrites)).append("\n");
        sb.append("    totalLogicalWritesPercentage: ")
            .append(toIndentedString(totalLogicalWritesPercentage))
            .append("\n");
        sb.append("    totalPhysicalReads: ").append(toIndentedString(totalPhysicalReads)).append("\n");
        sb.append("    totalPhysicalReadsPercentage: ")
            .append(toIndentedString(totalPhysicalReadsPercentage))
            .append("\n");
        sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
        sb.append("    totalRowsPercentage: ").append(toIndentedString(totalRowsPercentage)).append("\n");
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
