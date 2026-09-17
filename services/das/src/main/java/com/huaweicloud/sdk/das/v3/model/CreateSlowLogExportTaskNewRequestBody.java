package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建慢日志导出任务请求体
 */
public class CreateSlowLogExportTaskNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_type")

    private String exportType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_asc")

    private Boolean sortAsc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private String client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "killed")

    private String killed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_min")

    private Long executeTimeMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_max")

    private Long executeTimeMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_avg_execute_time")

    private Double minAvgExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_avg_execute_time")

    private Double maxAvgExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_max_examined")

    private Long rowsMaxExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_min_examined")

    private Long rowsMinExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuzzy_sql")

    private String fuzzySql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public CreateSlowLogExportTaskNewRequestBody withStartTime(Long startTime) {
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

    public CreateSlowLogExportTaskNewRequestBody withEndTime(Long endTime) {
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

    public CreateSlowLogExportTaskNewRequestBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public CreateSlowLogExportTaskNewRequestBody withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件目录
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public CreateSlowLogExportTaskNewRequestBody withExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }

    /**
     * 导出类型
     * @return exportType
     */
    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public CreateSlowLogExportTaskNewRequestBody withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public CreateSlowLogExportTaskNewRequestBody withSortAsc(Boolean sortAsc) {
        this.sortAsc = sortAsc;
        return this;
    }

    /**
     * 排序顺序（true：正序，false：逆序）
     * @return sortAsc
     */
    public Boolean getSortAsc() {
        return sortAsc;
    }

    public void setSortAsc(Boolean sortAsc) {
        this.sortAsc = sortAsc;
    }

    public CreateSlowLogExportTaskNewRequestBody withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * 客户端
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public CreateSlowLogExportTaskNewRequestBody withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public CreateSlowLogExportTaskNewRequestBody withKilled(String killed) {
        this.killed = killed;
        return this;
    }

    /**
     * 执行状态
     * @return killed
     */
    public String getKilled() {
        return killed;
    }

    public void setKilled(String killed) {
        this.killed = killed;
    }

    public CreateSlowLogExportTaskNewRequestBody withExecuteTimeMin(Long executeTimeMin) {
        this.executeTimeMin = executeTimeMin;
        return this;
    }

    /**
     * 最小执行时间（Unix timestamp），单位：毫秒
     * @return executeTimeMin
     */
    public Long getExecuteTimeMin() {
        return executeTimeMin;
    }

    public void setExecuteTimeMin(Long executeTimeMin) {
        this.executeTimeMin = executeTimeMin;
    }

    public CreateSlowLogExportTaskNewRequestBody withExecuteTimeMax(Long executeTimeMax) {
        this.executeTimeMax = executeTimeMax;
        return this;
    }

    /**
     * 最大执行时间（Unix timestamp），单位：毫秒
     * @return executeTimeMax
     */
    public Long getExecuteTimeMax() {
        return executeTimeMax;
    }

    public void setExecuteTimeMax(Long executeTimeMax) {
        this.executeTimeMax = executeTimeMax;
    }

    public CreateSlowLogExportTaskNewRequestBody withMinAvgExecuteTime(Double minAvgExecuteTime) {
        this.minAvgExecuteTime = minAvgExecuteTime;
        return this;
    }

    /**
     * 最小平均执行时间
     * @return minAvgExecuteTime
     */
    public Double getMinAvgExecuteTime() {
        return minAvgExecuteTime;
    }

    public void setMinAvgExecuteTime(Double minAvgExecuteTime) {
        this.minAvgExecuteTime = minAvgExecuteTime;
    }

    public CreateSlowLogExportTaskNewRequestBody withMaxAvgExecuteTime(Double maxAvgExecuteTime) {
        this.maxAvgExecuteTime = maxAvgExecuteTime;
        return this;
    }

    /**
     * 最大平均执行时间
     * @return maxAvgExecuteTime
     */
    public Double getMaxAvgExecuteTime() {
        return maxAvgExecuteTime;
    }

    public void setMaxAvgExecuteTime(Double maxAvgExecuteTime) {
        this.maxAvgExecuteTime = maxAvgExecuteTime;
    }

    public CreateSlowLogExportTaskNewRequestBody withRowsMaxExamined(Long rowsMaxExamined) {
        this.rowsMaxExamined = rowsMaxExamined;
        return this;
    }

    /**
     * 最大扫描行数
     * @return rowsMaxExamined
     */
    public Long getRowsMaxExamined() {
        return rowsMaxExamined;
    }

    public void setRowsMaxExamined(Long rowsMaxExamined) {
        this.rowsMaxExamined = rowsMaxExamined;
    }

    public CreateSlowLogExportTaskNewRequestBody withRowsMinExamined(Long rowsMinExamined) {
        this.rowsMinExamined = rowsMinExamined;
        return this;
    }

    /**
     * 最小扫描行数
     * @return rowsMinExamined
     */
    public Long getRowsMinExamined() {
        return rowsMinExamined;
    }

    public void setRowsMinExamined(Long rowsMinExamined) {
        this.rowsMinExamined = rowsMinExamined;
    }

    public CreateSlowLogExportTaskNewRequestBody withFuzzySql(String fuzzySql) {
        this.fuzzySql = fuzzySql;
        return this;
    }

    /**
     * 模糊SQL
     * @return fuzzySql
     */
    public String getFuzzySql() {
        return fuzzySql;
    }

    public void setFuzzySql(String fuzzySql) {
        this.fuzzySql = fuzzySql;
    }

    public CreateSlowLogExportTaskNewRequestBody withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作（可组合，用逗号分隔）
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public CreateSlowLogExportTaskNewRequestBody withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSlowLogExportTaskNewRequestBody that = (CreateSlowLogExportTaskNewRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.exportType, that.exportType) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortAsc, that.sortAsc) && Objects.equals(this.client, that.client)
            && Objects.equals(this.user, that.user) && Objects.equals(this.killed, that.killed)
            && Objects.equals(this.executeTimeMin, that.executeTimeMin)
            && Objects.equals(this.executeTimeMax, that.executeTimeMax)
            && Objects.equals(this.minAvgExecuteTime, that.minAvgExecuteTime)
            && Objects.equals(this.maxAvgExecuteTime, that.maxAvgExecuteTime)
            && Objects.equals(this.rowsMaxExamined, that.rowsMaxExamined)
            && Objects.equals(this.rowsMinExamined, that.rowsMinExamined)
            && Objects.equals(this.fuzzySql, that.fuzzySql) && Objects.equals(this.operation, that.operation)
            && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            bucketName,
            filePath,
            exportType,
            sortField,
            sortAsc,
            client,
            user,
            killed,
            executeTimeMin,
            executeTimeMax,
            minAvgExecuteTime,
            maxAvgExecuteTime,
            rowsMaxExamined,
            rowsMinExamined,
            fuzzySql,
            operation,
            timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSlowLogExportTaskNewRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortAsc: ").append(toIndentedString(sortAsc)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    killed: ").append(toIndentedString(killed)).append("\n");
        sb.append("    executeTimeMin: ").append(toIndentedString(executeTimeMin)).append("\n");
        sb.append("    executeTimeMax: ").append(toIndentedString(executeTimeMax)).append("\n");
        sb.append("    minAvgExecuteTime: ").append(toIndentedString(minAvgExecuteTime)).append("\n");
        sb.append("    maxAvgExecuteTime: ").append(toIndentedString(maxAvgExecuteTime)).append("\n");
        sb.append("    rowsMaxExamined: ").append(toIndentedString(rowsMaxExamined)).append("\n");
        sb.append("    rowsMinExamined: ").append(toIndentedString(rowsMinExamined)).append("\n");
        sb.append("    fuzzySql: ").append(toIndentedString(fuzzySql)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
