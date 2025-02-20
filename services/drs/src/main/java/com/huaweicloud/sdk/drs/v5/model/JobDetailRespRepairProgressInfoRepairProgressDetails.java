package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修复进度明细
 */
public class JobDetailRespRepairProgressInfoRepairProgressDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

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
    @JsonProperty(value = "total_row_count")

    private Integer totalRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_row_count")

    private Integer completeRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_row_count")

    private Integer filterRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repaired_row_count")

    private Integer repairedRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_row_count")

    private Integer failedRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_status")

    private Integer repairStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public JobDetailRespRepairProgressInfoRepairProgressDetails withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * 对比任务ID。
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 库名。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withTableName(String tableName) {
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

    public JobDetailRespRepairProgressInfoRepairProgressDetails withTotalRowCount(Integer totalRowCount) {
        this.totalRowCount = totalRowCount;
        return this;
    }

    /**
     * 总行数。
     * @return totalRowCount
     */
    public Integer getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(Integer totalRowCount) {
        this.totalRowCount = totalRowCount;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withCompleteRowCount(Integer completeRowCount) {
        this.completeRowCount = completeRowCount;
        return this;
    }

    /**
     * 完成行数。
     * @return completeRowCount
     */
    public Integer getCompleteRowCount() {
        return completeRowCount;
    }

    public void setCompleteRowCount(Integer completeRowCount) {
        this.completeRowCount = completeRowCount;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withFilterRowCount(Integer filterRowCount) {
        this.filterRowCount = filterRowCount;
        return this;
    }

    /**
     * 过滤行数。
     * @return filterRowCount
     */
    public Integer getFilterRowCount() {
        return filterRowCount;
    }

    public void setFilterRowCount(Integer filterRowCount) {
        this.filterRowCount = filterRowCount;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withRepairedRowCount(Integer repairedRowCount) {
        this.repairedRowCount = repairedRowCount;
        return this;
    }

    /**
     * 已修复行数。
     * @return repairedRowCount
     */
    public Integer getRepairedRowCount() {
        return repairedRowCount;
    }

    public void setRepairedRowCount(Integer repairedRowCount) {
        this.repairedRowCount = repairedRowCount;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withFailedRowCount(Integer failedRowCount) {
        this.failedRowCount = failedRowCount;
        return this;
    }

    /**
     * 失败行数。
     * @return failedRowCount
     */
    public Integer getFailedRowCount() {
        return failedRowCount;
    }

    public void setFailedRowCount(Integer failedRowCount) {
        this.failedRowCount = failedRowCount;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withRepairStatus(Integer repairStatus) {
        this.repairStatus = repairStatus;
        return this;
    }

    /**
     * 修复状态。
     * @return repairStatus
     */
    public Integer getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(Integer repairStatus) {
        this.repairStatus = repairStatus;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public JobDetailRespRepairProgressInfoRepairProgressDetails withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobDetailRespRepairProgressInfoRepairProgressDetails that =
            (JobDetailRespRepairProgressInfoRepairProgressDetails) obj;
        return Objects.equals(this.queryId, that.queryId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.totalRowCount, that.totalRowCount)
            && Objects.equals(this.completeRowCount, that.completeRowCount)
            && Objects.equals(this.filterRowCount, that.filterRowCount)
            && Objects.equals(this.repairedRowCount, that.repairedRowCount)
            && Objects.equals(this.failedRowCount, that.failedRowCount)
            && Objects.equals(this.repairStatus, that.repairStatus) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryId,
            dbName,
            schemaName,
            tableName,
            totalRowCount,
            completeRowCount,
            filterRowCount,
            repairedRowCount,
            failedRowCount,
            repairStatus,
            startTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDetailRespRepairProgressInfoRepairProgressDetails {\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
        sb.append("    completeRowCount: ").append(toIndentedString(completeRowCount)).append("\n");
        sb.append("    filterRowCount: ").append(toIndentedString(filterRowCount)).append("\n");
        sb.append("    repairedRowCount: ").append(toIndentedString(repairedRowCount)).append("\n");
        sb.append("    failedRowCount: ").append(toIndentedString(failedRowCount)).append("\n");
        sb.append("    repairStatus: ").append(toIndentedString(repairStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
