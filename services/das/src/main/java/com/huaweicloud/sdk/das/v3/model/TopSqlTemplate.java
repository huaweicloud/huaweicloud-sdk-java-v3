package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TopSqlTemplate
 */
public class TopSqlTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template")

    private String sqlTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_sample_string")

    private String sqlSampleString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_num")

    private Long executeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cost")

    private Double totalCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_cost")

    private Double avgCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_sent")

    private Double avgRowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_affected")

    private Double avgRowsAffected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_lock_time")

    private Double avgLockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rows_examined")

    private Double totalRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_examined")

    private Double avgRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cost_ratio")

    private String totalCostRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_examined_ratio")

    private String totalExaminedRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_num_ratio")

    private String executeNumRatio;

    public TopSqlTemplate withSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
        return this;
    }

    /**
     * SQL模板。
     * @return sqlTemplate
     */
    public String getSqlTemplate() {
        return sqlTemplate;
    }

    public void setSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
    }

    public TopSqlTemplate withSqlSampleString(String sqlSampleString) {
        this.sqlSampleString = sqlSampleString;
        return this;
    }

    /**
     * SQL样本。
     * @return sqlSampleString
     */
    public String getSqlSampleString() {
        return sqlSampleString;
    }

    public void setSqlSampleString(String sqlSampleString) {
        this.sqlSampleString = sqlSampleString;
    }

    public TopSqlTemplate withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * SQL操作类型。
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public TopSqlTemplate withDbName(String dbName) {
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

    public TopSqlTemplate withExecuteNum(Long executeNum) {
        this.executeNum = executeNum;
        return this;
    }

    /**
     * 总执行次数。
     * @return executeNum
     */
    public Long getExecuteNum() {
        return executeNum;
    }

    public void setExecuteNum(Long executeNum) {
        this.executeNum = executeNum;
    }

    public TopSqlTemplate withTotalCost(Double totalCost) {
        this.totalCost = totalCost;
        return this;
    }

    /**
     * 总耗时(ms)。
     * @return totalCost
     */
    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public TopSqlTemplate withAvgCost(Double avgCost) {
        this.avgCost = avgCost;
        return this;
    }

    /**
     * 平均耗时(ms)。
     * @return avgCost
     */
    public Double getAvgCost() {
        return avgCost;
    }

    public void setAvgCost(Double avgCost) {
        this.avgCost = avgCost;
    }

    public TopSqlTemplate withAvgRowsSent(Double avgRowsSent) {
        this.avgRowsSent = avgRowsSent;
        return this;
    }

    /**
     * 平均返回行数。
     * @return avgRowsSent
     */
    public Double getAvgRowsSent() {
        return avgRowsSent;
    }

    public void setAvgRowsSent(Double avgRowsSent) {
        this.avgRowsSent = avgRowsSent;
    }

    public TopSqlTemplate withAvgRowsAffected(Double avgRowsAffected) {
        this.avgRowsAffected = avgRowsAffected;
        return this;
    }

    /**
     * 平均影响行数。
     * @return avgRowsAffected
     */
    public Double getAvgRowsAffected() {
        return avgRowsAffected;
    }

    public void setAvgRowsAffected(Double avgRowsAffected) {
        this.avgRowsAffected = avgRowsAffected;
    }

    public TopSqlTemplate withAvgLockTime(Double avgLockTime) {
        this.avgLockTime = avgLockTime;
        return this;
    }

    /**
     * 平均锁等待耗时(ms)。
     * @return avgLockTime
     */
    public Double getAvgLockTime() {
        return avgLockTime;
    }

    public void setAvgLockTime(Double avgLockTime) {
        this.avgLockTime = avgLockTime;
    }

    public TopSqlTemplate withTotalRowsExamined(Double totalRowsExamined) {
        this.totalRowsExamined = totalRowsExamined;
        return this;
    }

    /**
     * 总扫描行数。
     * @return totalRowsExamined
     */
    public Double getTotalRowsExamined() {
        return totalRowsExamined;
    }

    public void setTotalRowsExamined(Double totalRowsExamined) {
        this.totalRowsExamined = totalRowsExamined;
    }

    public TopSqlTemplate withAvgRowsExamined(Double avgRowsExamined) {
        this.avgRowsExamined = avgRowsExamined;
        return this;
    }

    /**
     * 平均扫描行数。
     * @return avgRowsExamined
     */
    public Double getAvgRowsExamined() {
        return avgRowsExamined;
    }

    public void setAvgRowsExamined(Double avgRowsExamined) {
        this.avgRowsExamined = avgRowsExamined;
    }

    public TopSqlTemplate withTotalCostRatio(String totalCostRatio) {
        this.totalCostRatio = totalCostRatio;
        return this;
    }

    /**
     * 总耗时占比。
     * @return totalCostRatio
     */
    public String getTotalCostRatio() {
        return totalCostRatio;
    }

    public void setTotalCostRatio(String totalCostRatio) {
        this.totalCostRatio = totalCostRatio;
    }

    public TopSqlTemplate withTotalExaminedRatio(String totalExaminedRatio) {
        this.totalExaminedRatio = totalExaminedRatio;
        return this;
    }

    /**
     * 扫描行数占比。
     * @return totalExaminedRatio
     */
    public String getTotalExaminedRatio() {
        return totalExaminedRatio;
    }

    public void setTotalExaminedRatio(String totalExaminedRatio) {
        this.totalExaminedRatio = totalExaminedRatio;
    }

    public TopSqlTemplate withExecuteNumRatio(String executeNumRatio) {
        this.executeNumRatio = executeNumRatio;
        return this;
    }

    /**
     * 执行次数占比。
     * @return executeNumRatio
     */
    public String getExecuteNumRatio() {
        return executeNumRatio;
    }

    public void setExecuteNumRatio(String executeNumRatio) {
        this.executeNumRatio = executeNumRatio;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopSqlTemplate topSqlTemplate = (TopSqlTemplate) o;
        return Objects.equals(this.sqlTemplate, topSqlTemplate.sqlTemplate)
            && Objects.equals(this.sqlSampleString, topSqlTemplate.sqlSampleString)
            && Objects.equals(this.sqlType, topSqlTemplate.sqlType)
            && Objects.equals(this.dbName, topSqlTemplate.dbName)
            && Objects.equals(this.executeNum, topSqlTemplate.executeNum)
            && Objects.equals(this.totalCost, topSqlTemplate.totalCost)
            && Objects.equals(this.avgCost, topSqlTemplate.avgCost)
            && Objects.equals(this.avgRowsSent, topSqlTemplate.avgRowsSent)
            && Objects.equals(this.avgRowsAffected, topSqlTemplate.avgRowsAffected)
            && Objects.equals(this.avgLockTime, topSqlTemplate.avgLockTime)
            && Objects.equals(this.totalRowsExamined, topSqlTemplate.totalRowsExamined)
            && Objects.equals(this.avgRowsExamined, topSqlTemplate.avgRowsExamined)
            && Objects.equals(this.totalCostRatio, topSqlTemplate.totalCostRatio)
            && Objects.equals(this.totalExaminedRatio, topSqlTemplate.totalExaminedRatio)
            && Objects.equals(this.executeNumRatio, topSqlTemplate.executeNumRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlTemplate,
            sqlSampleString,
            sqlType,
            dbName,
            executeNum,
            totalCost,
            avgCost,
            avgRowsSent,
            avgRowsAffected,
            avgLockTime,
            totalRowsExamined,
            avgRowsExamined,
            totalCostRatio,
            totalExaminedRatio,
            executeNumRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopSqlTemplate {\n");
        sb.append("    sqlTemplate: ").append(toIndentedString(sqlTemplate)).append("\n");
        sb.append("    sqlSampleString: ").append(toIndentedString(sqlSampleString)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    executeNum: ").append(toIndentedString(executeNum)).append("\n");
        sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
        sb.append("    avgCost: ").append(toIndentedString(avgCost)).append("\n");
        sb.append("    avgRowsSent: ").append(toIndentedString(avgRowsSent)).append("\n");
        sb.append("    avgRowsAffected: ").append(toIndentedString(avgRowsAffected)).append("\n");
        sb.append("    avgLockTime: ").append(toIndentedString(avgLockTime)).append("\n");
        sb.append("    totalRowsExamined: ").append(toIndentedString(totalRowsExamined)).append("\n");
        sb.append("    avgRowsExamined: ").append(toIndentedString(avgRowsExamined)).append("\n");
        sb.append("    totalCostRatio: ").append(toIndentedString(totalCostRatio)).append("\n");
        sb.append("    totalExaminedRatio: ").append(toIndentedString(totalExaminedRatio)).append("\n");
        sb.append("    executeNumRatio: ").append(toIndentedString(executeNumRatio)).append("\n");
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
