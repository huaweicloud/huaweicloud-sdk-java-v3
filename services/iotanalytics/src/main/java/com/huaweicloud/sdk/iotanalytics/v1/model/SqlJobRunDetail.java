package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SqlJobRunDetail
 */
public class SqlJobRunDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_row_count")

    private Long inputRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bad_row_count")

    private Long badRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_size")

    private Long inputSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_count")

    private Long resultCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_column_header")

    private Boolean withColumnHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public SqlJobRunDetail withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * 作业类型。
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public SqlJobRunDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业开始的时间。时间格式为ISO日期时间格式yyyy-MM-dd'T'HH:mm:ss'Z'
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SqlJobRunDetail withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 作业运行时长，单位毫秒。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public SqlJobRunDetail withInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
        return this;
    }

    /**
     * Insert作业执行过程中扫描的记录条数。
     * @return inputRowCount
     */
    public Long getInputRowCount() {
        return inputRowCount;
    }

    public void setInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
    }

    public SqlJobRunDetail withBadRowCount(Long badRowCount) {
        this.badRowCount = badRowCount;
        return this;
    }

    /**
     * Insert作业执行过程中扫描到的错误记录数。
     * @return badRowCount
     */
    public Long getBadRowCount() {
        return badRowCount;
    }

    public void setBadRowCount(Long badRowCount) {
        this.badRowCount = badRowCount;
    }

    public SqlJobRunDetail withInputSize(Long inputSize) {
        this.inputSize = inputSize;
        return this;
    }

    /**
     * 作业执行过程中扫描文件的大小。
     * @return inputSize
     */
    public Long getInputSize() {
        return inputSize;
    }

    public void setInputSize(Long inputSize) {
        this.inputSize = inputSize;
    }

    public SqlJobRunDetail withResultCount(Long resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    /**
     * 当前作业返回的结果总条数或insert作业插入的总条数。
     * @return resultCount
     */
    public Long getResultCount() {
        return resultCount;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public SqlJobRunDetail withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 记录其操作的表名称。类型为Import和Export作业才有“table_name”属性。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public SqlJobRunDetail withWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
        return this;
    }

    /**
     * Import类型的作业，记录其导入的数据是否包括列名。
     * @return withColumnHeader
     */
    public Boolean getWithColumnHeader() {
        return withColumnHeader;
    }

    public void setWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
    }

    public SqlJobRunDetail withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * SQL查询的相关列信息的Json字符串。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public SqlJobRunDetail withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * 作业执行的SQL语句。
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public SqlJobRunDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息。运行失败时，失败原因。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlJobRunDetail that = (SqlJobRunDetail) obj;
        return Objects.equals(this.sqlType, that.sqlType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.inputRowCount, that.inputRowCount)
            && Objects.equals(this.badRowCount, that.badRowCount) && Objects.equals(this.inputSize, that.inputSize)
            && Objects.equals(this.resultCount, that.resultCount) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.withColumnHeader, that.withColumnHeader) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.statement, that.statement) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlType,
            startTime,
            duration,
            inputRowCount,
            badRowCount,
            inputSize,
            resultCount,
            tableName,
            withColumnHeader,
            detail,
            statement,
            message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlJobRunDetail {\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    inputRowCount: ").append(toIndentedString(inputRowCount)).append("\n");
        sb.append("    badRowCount: ").append(toIndentedString(badRowCount)).append("\n");
        sb.append("    inputSize: ").append(toIndentedString(inputSize)).append("\n");
        sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    withColumnHeader: ").append(toIndentedString(withColumnHeader)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
