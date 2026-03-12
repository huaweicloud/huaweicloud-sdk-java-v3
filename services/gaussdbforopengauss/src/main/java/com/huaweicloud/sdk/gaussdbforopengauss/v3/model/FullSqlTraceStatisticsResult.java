package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 链路详情信息
 */
public class FullSqlTraceStatisticsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_rate")

    private Double hitRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_time")

    private Integer dbTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Integer cpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_time")

    private Integer ioTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private Integer executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_rows")

    private Integer scanRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_rows")

    private Integer updateRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_rows")

    private Integer insertRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_rows")

    private Integer deleteRows;

    public FullSqlTraceStatisticsResult withHitRate(Double hitRate) {
        this.hitRate = hitRate;
        return this;
    }

    /**
     * **参数解释**: 命中率。 **取值范围**: 不涉及。
     * @return hitRate
     */
    public Double getHitRate() {
        return hitRate;
    }

    public void setHitRate(Double hitRate) {
        this.hitRate = hitRate;
    }

    public FullSqlTraceStatisticsResult withDbTime(Integer dbTime) {
        this.dbTime = dbTime;
        return this;
    }

    /**
     * **参数解释**: 有效DB时间花费。 **取值范围**: 不涉及。
     * @return dbTime
     */
    public Integer getDbTime() {
        return dbTime;
    }

    public void setDbTime(Integer dbTime) {
        this.dbTime = dbTime;
    }

    public FullSqlTraceStatisticsResult withCpuTime(Integer cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * **参数解释**: CPU时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return cpuTime
     */
    public Integer getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Integer cpuTime) {
        this.cpuTime = cpuTime;
    }

    public FullSqlTraceStatisticsResult withIoTime(Integer ioTime) {
        this.ioTime = ioTime;
        return this;
    }

    /**
     * **参数解释**: IO时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return ioTime
     */
    public Integer getIoTime() {
        return ioTime;
    }

    public void setIoTime(Integer ioTime) {
        this.ioTime = ioTime;
    }

    public FullSqlTraceStatisticsResult withExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * **参数解释**: 执行器内执行时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return executionTime
     */
    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    public FullSqlTraceStatisticsResult withScanRows(Integer scanRows) {
        this.scanRows = scanRows;
        return this;
    }

    /**
     * **参数解释**: 扫描行数。 **取值范围**: 不涉及。
     * @return scanRows
     */
    public Integer getScanRows() {
        return scanRows;
    }

    public void setScanRows(Integer scanRows) {
        this.scanRows = scanRows;
    }

    public FullSqlTraceStatisticsResult withUpdateRows(Integer updateRows) {
        this.updateRows = updateRows;
        return this;
    }

    /**
     * **参数解释**: 更新行数。 **取值范围**: 不涉及。
     * @return updateRows
     */
    public Integer getUpdateRows() {
        return updateRows;
    }

    public void setUpdateRows(Integer updateRows) {
        this.updateRows = updateRows;
    }

    public FullSqlTraceStatisticsResult withInsertRows(Integer insertRows) {
        this.insertRows = insertRows;
        return this;
    }

    /**
     * **参数解释**: 插入行数。 **取值范围**: 不涉及。
     * @return insertRows
     */
    public Integer getInsertRows() {
        return insertRows;
    }

    public void setInsertRows(Integer insertRows) {
        this.insertRows = insertRows;
    }

    public FullSqlTraceStatisticsResult withDeleteRows(Integer deleteRows) {
        this.deleteRows = deleteRows;
        return this;
    }

    /**
     * **参数解释**: 删除行数。 **取值范围**: 不涉及。
     * @return deleteRows
     */
    public Integer getDeleteRows() {
        return deleteRows;
    }

    public void setDeleteRows(Integer deleteRows) {
        this.deleteRows = deleteRows;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullSqlTraceStatisticsResult that = (FullSqlTraceStatisticsResult) obj;
        return Objects.equals(this.hitRate, that.hitRate) && Objects.equals(this.dbTime, that.dbTime)
            && Objects.equals(this.cpuTime, that.cpuTime) && Objects.equals(this.ioTime, that.ioTime)
            && Objects.equals(this.executionTime, that.executionTime) && Objects.equals(this.scanRows, that.scanRows)
            && Objects.equals(this.updateRows, that.updateRows) && Objects.equals(this.insertRows, that.insertRows)
            && Objects.equals(this.deleteRows, that.deleteRows);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(hitRate, dbTime, cpuTime, ioTime, executionTime, scanRows, updateRows, insertRows, deleteRows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSqlTraceStatisticsResult {\n");
        sb.append("    hitRate: ").append(toIndentedString(hitRate)).append("\n");
        sb.append("    dbTime: ").append(toIndentedString(dbTime)).append("\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
        sb.append("    ioTime: ").append(toIndentedString(ioTime)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    scanRows: ").append(toIndentedString(scanRows)).append("\n");
        sb.append("    updateRows: ").append(toIndentedString(updateRows)).append("\n");
        sb.append("    insertRows: ").append(toIndentedString(insertRows)).append("\n");
        sb.append("    deleteRows: ").append(toIndentedString(deleteRows)).append("\n");
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
