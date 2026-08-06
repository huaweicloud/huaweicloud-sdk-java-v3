package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HealthReportTableSpaceTopDataDto
 */
public class HealthReportTableSpaceTopDataDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private Double file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Double data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free")

    private Double free;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_rate")

    private Double freeRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Double index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_count")

    private Long rowsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    public HealthReportTableSpaceTopDataDto withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 库名
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public HealthReportTableSpaceTopDataDto withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public HealthReportTableSpaceTopDataDto withFile(Double file) {
        this.file = file;
        return this;
    }

    /**
     * 物理文件大小，单位MB
     * @return file
     */
    public Double getFile() {
        return file;
    }

    public void setFile(Double file) {
        this.file = file;
    }

    public HealthReportTableSpaceTopDataDto withData(Double data) {
        this.data = data;
        return this;
    }

    /**
     * 数据空间，单位MB
     * @return data
     */
    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }

    public HealthReportTableSpaceTopDataDto withFree(Double free) {
        this.free = free;
        return this;
    }

    /**
     * 碎片空间，单位MB
     * @return free
     */
    public Double getFree() {
        return free;
    }

    public void setFree(Double free) {
        this.free = free;
    }

    public HealthReportTableSpaceTopDataDto withFreeRate(Double freeRate) {
        this.freeRate = freeRate;
        return this;
    }

    /**
     * 碎片率
     * @return freeRate
     */
    public Double getFreeRate() {
        return freeRate;
    }

    public void setFreeRate(Double freeRate) {
        this.freeRate = freeRate;
    }

    public HealthReportTableSpaceTopDataDto withIndex(Double index) {
        this.index = index;
        return this;
    }

    /**
     * 索引空间，单位MB
     * @return index
     */
    public Double getIndex() {
        return index;
    }

    public void setIndex(Double index) {
        this.index = index;
    }

    public HealthReportTableSpaceTopDataDto withRowsCount(Long rowsCount) {
        this.rowsCount = rowsCount;
        return this;
    }

    /**
     * 行数
     * @return rowsCount
     */
    public Long getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(Long rowsCount) {
        this.rowsCount = rowsCount;
    }

    public HealthReportTableSpaceTopDataDto withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 采集时间
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportTableSpaceTopDataDto that = (HealthReportTableSpaceTopDataDto) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.file, that.file) && Objects.equals(this.data, that.data)
            && Objects.equals(this.free, that.free) && Objects.equals(this.freeRate, that.freeRate)
            && Objects.equals(this.index, that.index) && Objects.equals(this.rowsCount, that.rowsCount)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, tableName, file, data, free, freeRate, index, rowsCount, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportTableSpaceTopDataDto {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    free: ").append(toIndentedString(free)).append("\n");
        sb.append("    freeRate: ").append(toIndentedString(freeRate)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    rowsCount: ").append(toIndentedString(rowsCount)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
