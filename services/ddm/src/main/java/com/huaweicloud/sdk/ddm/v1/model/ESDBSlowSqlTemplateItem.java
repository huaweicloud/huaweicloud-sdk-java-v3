package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ESDBSlowSqlTemplateItem
 */
public class ESDBSlowSqlTemplateItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_sample")

    private String querySample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_times")

    private BigDecimal executeTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_examined")

    private BigDecimal avgRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_time")

    private BigDecimal maxTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_time")

    private BigDecimal avgTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_examined")

    private BigDecimal maxRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined_sum")

    private BigDecimal rowsExaminedSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_time_sum")

    private BigDecimal costTimeSum;

    public ESDBSlowSqlTemplateItem withQuerySample(String querySample) {
        this.querySample = querySample;
        return this;
    }

    /**
     * **参数解释**：  示例。  **参数范围**：  不涉及。
     * @return querySample
     */
    public String getQuerySample() {
        return querySample;
    }

    public void setQuerySample(String querySample) {
        this.querySample = querySample;
    }

    public ESDBSlowSqlTemplateItem withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释**：  数据库。  **参数范围**：  不涉及。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ESDBSlowSqlTemplateItem withExecuteTimes(BigDecimal executeTimes) {
        this.executeTimes = executeTimes;
        return this;
    }

    /**
     * **参数解释**：  执行时间。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 9.223372036854775E+18
     * @return executeTimes
     */
    public BigDecimal getExecuteTimes() {
        return executeTimes;
    }

    public void setExecuteTimes(BigDecimal executeTimes) {
        this.executeTimes = executeTimes;
    }

    public ESDBSlowSqlTemplateItem withAvgRowsExamined(BigDecimal avgRowsExamined) {
        this.avgRowsExamined = avgRowsExamined;
        return this;
    }

    /**
     * **参数解释**：  平均检查行数。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 9.223372036854775E+18
     * @return avgRowsExamined
     */
    public BigDecimal getAvgRowsExamined() {
        return avgRowsExamined;
    }

    public void setAvgRowsExamined(BigDecimal avgRowsExamined) {
        this.avgRowsExamined = avgRowsExamined;
    }

    public ESDBSlowSqlTemplateItem withMaxTime(BigDecimal maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    /**
     * **参数解释**：  最大时间。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 9.223372036854775E+18
     * @return maxTime
     */
    public BigDecimal getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(BigDecimal maxTime) {
        this.maxTime = maxTime;
    }

    public ESDBSlowSqlTemplateItem withAvgTime(BigDecimal avgTime) {
        this.avgTime = avgTime;
        return this;
    }

    /**
     * **参数解释**：  平均时间。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 9.223372036854775E+18
     * @return avgTime
     */
    public BigDecimal getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(BigDecimal avgTime) {
        this.avgTime = avgTime;
    }

    public ESDBSlowSqlTemplateItem withMaxRowsExamined(BigDecimal maxRowsExamined) {
        this.maxRowsExamined = maxRowsExamined;
        return this;
    }

    /**
     * **参数解释**：  最大检查行数。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 9.223372036854775E+18
     * @return maxRowsExamined
     */
    public BigDecimal getMaxRowsExamined() {
        return maxRowsExamined;
    }

    public void setMaxRowsExamined(BigDecimal maxRowsExamined) {
        this.maxRowsExamined = maxRowsExamined;
    }

    public ESDBSlowSqlTemplateItem withRowsExaminedSum(BigDecimal rowsExaminedSum) {
        this.rowsExaminedSum = rowsExaminedSum;
        return this;
    }

    /**
     * **参数解释**：  总检查行数。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 9.223372036854775E+18
     * @return rowsExaminedSum
     */
    public BigDecimal getRowsExaminedSum() {
        return rowsExaminedSum;
    }

    public void setRowsExaminedSum(BigDecimal rowsExaminedSum) {
        this.rowsExaminedSum = rowsExaminedSum;
    }

    public ESDBSlowSqlTemplateItem withCostTimeSum(BigDecimal costTimeSum) {
        this.costTimeSum = costTimeSum;
        return this;
    }

    /**
     * **参数解释**：  总耗时。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 9.223372036854775E+18
     * @return costTimeSum
     */
    public BigDecimal getCostTimeSum() {
        return costTimeSum;
    }

    public void setCostTimeSum(BigDecimal costTimeSum) {
        this.costTimeSum = costTimeSum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ESDBSlowSqlTemplateItem that = (ESDBSlowSqlTemplateItem) obj;
        return Objects.equals(this.querySample, that.querySample) && Objects.equals(this.database, that.database)
            && Objects.equals(this.executeTimes, that.executeTimes)
            && Objects.equals(this.avgRowsExamined, that.avgRowsExamined) && Objects.equals(this.maxTime, that.maxTime)
            && Objects.equals(this.avgTime, that.avgTime) && Objects.equals(this.maxRowsExamined, that.maxRowsExamined)
            && Objects.equals(this.rowsExaminedSum, that.rowsExaminedSum)
            && Objects.equals(this.costTimeSum, that.costTimeSum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(querySample,
            database,
            executeTimes,
            avgRowsExamined,
            maxTime,
            avgTime,
            maxRowsExamined,
            rowsExaminedSum,
            costTimeSum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ESDBSlowSqlTemplateItem {\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    executeTimes: ").append(toIndentedString(executeTimes)).append("\n");
        sb.append("    avgRowsExamined: ").append(toIndentedString(avgRowsExamined)).append("\n");
        sb.append("    maxTime: ").append(toIndentedString(maxTime)).append("\n");
        sb.append("    avgTime: ").append(toIndentedString(avgTime)).append("\n");
        sb.append("    maxRowsExamined: ").append(toIndentedString(maxRowsExamined)).append("\n");
        sb.append("    rowsExaminedSum: ").append(toIndentedString(rowsExaminedSum)).append("\n");
        sb.append("    costTimeSum: ").append(toIndentedString(costTimeSum)).append("\n");
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
