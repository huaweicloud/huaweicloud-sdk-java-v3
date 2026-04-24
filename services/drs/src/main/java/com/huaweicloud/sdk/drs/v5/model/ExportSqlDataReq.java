package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出流量回放任务SQL文件请求体
 */
public class ExportSqlDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_names")

    private List<String> fieldNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ExportSqlDataReq withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 导出的sql文件类型。取值范围： - abnormal_sql ：异常sql列表 - abnormal_sql_detail ：异常sql详情 - slow_sql ：慢sql列表 - slow_sql_detail ： 慢sql详情
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ExportSqlDataReq withFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }

    public ExportSqlDataReq addFieldNamesItem(String fieldNamesItem) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        this.fieldNames.add(fieldNamesItem);
        return this;
    }

    public ExportSqlDataReq withFieldNames(Consumer<List<String>> fieldNamesSetter) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        fieldNamesSetter.accept(this.fieldNames);
        return this;
    }

    /**
     * 导出的字段名。file_type为时为error_sql_detail、slow_sql_detail必填。取值范围： -id ：自增ID -gmtCreate ：创建时间 -gmtModified ：修改时间 -shardId ：分片ID -startTimestamp ：源库SQL开始执行时间戳 -executeTimePartition ：回放时间分区 -schemaName ：库名 -queryType ：SQL类型 -sqlStatement ：SQL内容 -sqlTemplate ：SQL模板 -errorInfo ：异常信息 -targetType ：目标库类型
     * @return fieldNames
     */
    public List<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public ExportSqlDataReq withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ExportSqlDataReq withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportSqlDataReq that = (ExportSqlDataReq) obj;
        return Objects.equals(this.fileType, that.fileType) && Objects.equals(this.fieldNames, that.fieldNames)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileType, fieldNames, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSqlDataReq {\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
