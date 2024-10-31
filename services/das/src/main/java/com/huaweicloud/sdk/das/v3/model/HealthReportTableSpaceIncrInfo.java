package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HealthReportTableSpaceIncrInfo
 */
public class HealthReportTableSpaceIncrInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increment")

    private Long increment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyze_success")

    private Boolean analyzeSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public HealthReportTableSpaceIncrInfo withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public HealthReportTableSpaceIncrInfo withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 表名。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public HealthReportTableSpaceIncrInfo withIncrement(Long increment) {
        this.increment = increment;
        return this;
    }

    /**
     * 增长量。
     * @return increment
     */
    public Long getIncrement() {
        return increment;
    }

    public void setIncrement(Long increment) {
        this.increment = increment;
    }

    public HealthReportTableSpaceIncrInfo withAnalyzeSuccess(Boolean analyzeSuccess) {
        this.analyzeSuccess = analyzeSuccess;
        return this;
    }

    /**
     * 统计分析是否成功。
     * @return analyzeSuccess
     */
    public Boolean getAnalyzeSuccess() {
        return analyzeSuccess;
    }

    public void setAnalyzeSuccess(Boolean analyzeSuccess) {
        this.analyzeSuccess = analyzeSuccess;
    }

    public HealthReportTableSpaceIncrInfo withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportTableSpaceIncrInfo that = (HealthReportTableSpaceIncrInfo) obj;
        return Objects.equals(this.database, that.database) && Objects.equals(this.table, that.table)
            && Objects.equals(this.increment, that.increment)
            && Objects.equals(this.analyzeSuccess, that.analyzeSuccess)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, table, increment, analyzeSuccess, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportTableSpaceIncrInfo {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    increment: ").append(toIndentedString(increment)).append("\n");
        sb.append("    analyzeSuccess: ").append(toIndentedString(analyzeSuccess)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
