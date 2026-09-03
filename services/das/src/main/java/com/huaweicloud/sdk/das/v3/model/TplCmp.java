package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SQL模板对比项
 */
public class TplCmp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template")

    private String sqlTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_sample_string")

    private String sqlSampleString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_names")

    private List<String> dbNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

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
    @JsonProperty(value = "max_cost")

    private Double maxCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_sent")

    private Double avgRowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_sent")

    private Double maxRowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_affected")

    private Double avgRowsAffected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_affected")

    private Double maxRowsAffected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_lock_time")

    private Double avgLockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_lock_time")

    private Double maxLockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rows_examined")

    private Double totalRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_examined")

    private Double avgRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_examined")

    private Double maxRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cost_ratio")

    private String totalCostRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_examined_ratio")

    private String totalExaminedRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_num_ratio")

    private String executeNumRatio;

    public TplCmp withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * SQL模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TplCmp withSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
        return this;
    }

    /**
     * SQL模板
     * @return sqlTemplate
     */
    public String getSqlTemplate() {
        return sqlTemplate;
    }

    public void setSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
    }

    public TplCmp withSqlSampleString(String sqlSampleString) {
        this.sqlSampleString = sqlSampleString;
        return this;
    }

    /**
     * SQL样例
     * @return sqlSampleString
     */
    public String getSqlSampleString() {
        return sqlSampleString;
    }

    public void setSqlSampleString(String sqlSampleString) {
        this.sqlSampleString = sqlSampleString;
    }

    public TplCmp withDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    public TplCmp addDbNamesItem(String dbNamesItem) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        this.dbNames.add(dbNamesItem);
        return this;
    }

    public TplCmp withDbNames(Consumer<List<String>> dbNamesSetter) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        dbNamesSetter.accept(this.dbNames);
        return this;
    }

    /**
     * 数据库列表
     * @return dbNames
     */
    public List<String> getDbNames() {
        return dbNames;
    }

    public void setDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
    }

    public TplCmp withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public TplCmp withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * SQL类型
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public TplCmp withExecuteNum(Long executeNum) {
        this.executeNum = executeNum;
        return this;
    }

    /**
     * 执行次数
     * @return executeNum
     */
    public Long getExecuteNum() {
        return executeNum;
    }

    public void setExecuteNum(Long executeNum) {
        this.executeNum = executeNum;
    }

    public TplCmp withTotalCost(Double totalCost) {
        this.totalCost = totalCost;
        return this;
    }

    /**
     * 总执行耗时 ms
     * @return totalCost
     */
    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public TplCmp withAvgCost(Double avgCost) {
        this.avgCost = avgCost;
        return this;
    }

    /**
     * 平均执行耗时 ms
     * @return avgCost
     */
    public Double getAvgCost() {
        return avgCost;
    }

    public void setAvgCost(Double avgCost) {
        this.avgCost = avgCost;
    }

    public TplCmp withMaxCost(Double maxCost) {
        this.maxCost = maxCost;
        return this;
    }

    /**
     * 最大执行耗时 ms
     * @return maxCost
     */
    public Double getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(Double maxCost) {
        this.maxCost = maxCost;
    }

    public TplCmp withAvgRowsSent(Double avgRowsSent) {
        this.avgRowsSent = avgRowsSent;
        return this;
    }

    /**
     * 平均返回行数
     * @return avgRowsSent
     */
    public Double getAvgRowsSent() {
        return avgRowsSent;
    }

    public void setAvgRowsSent(Double avgRowsSent) {
        this.avgRowsSent = avgRowsSent;
    }

    public TplCmp withMaxRowsSent(Double maxRowsSent) {
        this.maxRowsSent = maxRowsSent;
        return this;
    }

    /**
     * 最大返回行数
     * @return maxRowsSent
     */
    public Double getMaxRowsSent() {
        return maxRowsSent;
    }

    public void setMaxRowsSent(Double maxRowsSent) {
        this.maxRowsSent = maxRowsSent;
    }

    public TplCmp withAvgRowsAffected(Double avgRowsAffected) {
        this.avgRowsAffected = avgRowsAffected;
        return this;
    }

    /**
     * 平均影响行数
     * @return avgRowsAffected
     */
    public Double getAvgRowsAffected() {
        return avgRowsAffected;
    }

    public void setAvgRowsAffected(Double avgRowsAffected) {
        this.avgRowsAffected = avgRowsAffected;
    }

    public TplCmp withMaxRowsAffected(Double maxRowsAffected) {
        this.maxRowsAffected = maxRowsAffected;
        return this;
    }

    /**
     * 最大影响行数
     * @return maxRowsAffected
     */
    public Double getMaxRowsAffected() {
        return maxRowsAffected;
    }

    public void setMaxRowsAffected(Double maxRowsAffected) {
        this.maxRowsAffected = maxRowsAffected;
    }

    public TplCmp withAvgLockTime(Double avgLockTime) {
        this.avgLockTime = avgLockTime;
        return this;
    }

    /**
     * 平均锁等待时间
     * @return avgLockTime
     */
    public Double getAvgLockTime() {
        return avgLockTime;
    }

    public void setAvgLockTime(Double avgLockTime) {
        this.avgLockTime = avgLockTime;
    }

    public TplCmp withMaxLockTime(Double maxLockTime) {
        this.maxLockTime = maxLockTime;
        return this;
    }

    /**
     * 最大锁等待时间
     * @return maxLockTime
     */
    public Double getMaxLockTime() {
        return maxLockTime;
    }

    public void setMaxLockTime(Double maxLockTime) {
        this.maxLockTime = maxLockTime;
    }

    public TplCmp withTotalRowsExamined(Double totalRowsExamined) {
        this.totalRowsExamined = totalRowsExamined;
        return this;
    }

    /**
     * 总扫描行数
     * @return totalRowsExamined
     */
    public Double getTotalRowsExamined() {
        return totalRowsExamined;
    }

    public void setTotalRowsExamined(Double totalRowsExamined) {
        this.totalRowsExamined = totalRowsExamined;
    }

    public TplCmp withAvgRowsExamined(Double avgRowsExamined) {
        this.avgRowsExamined = avgRowsExamined;
        return this;
    }

    /**
     * 平均扫描行数
     * @return avgRowsExamined
     */
    public Double getAvgRowsExamined() {
        return avgRowsExamined;
    }

    public void setAvgRowsExamined(Double avgRowsExamined) {
        this.avgRowsExamined = avgRowsExamined;
    }

    public TplCmp withMaxRowsExamined(Double maxRowsExamined) {
        this.maxRowsExamined = maxRowsExamined;
        return this;
    }

    /**
     * 最大扫描行数
     * @return maxRowsExamined
     */
    public Double getMaxRowsExamined() {
        return maxRowsExamined;
    }

    public void setMaxRowsExamined(Double maxRowsExamined) {
        this.maxRowsExamined = maxRowsExamined;
    }

    public TplCmp withTotalCostRatio(String totalCostRatio) {
        this.totalCostRatio = totalCostRatio;
        return this;
    }

    /**
     * 执行耗时占比
     * @return totalCostRatio
     */
    public String getTotalCostRatio() {
        return totalCostRatio;
    }

    public void setTotalCostRatio(String totalCostRatio) {
        this.totalCostRatio = totalCostRatio;
    }

    public TplCmp withTotalExaminedRatio(String totalExaminedRatio) {
        this.totalExaminedRatio = totalExaminedRatio;
        return this;
    }

    /**
     * 扫描行数占比
     * @return totalExaminedRatio
     */
    public String getTotalExaminedRatio() {
        return totalExaminedRatio;
    }

    public void setTotalExaminedRatio(String totalExaminedRatio) {
        this.totalExaminedRatio = totalExaminedRatio;
    }

    public TplCmp withExecuteNumRatio(String executeNumRatio) {
        this.executeNumRatio = executeNumRatio;
        return this;
    }

    /**
     * 执行次数占比
     * @return executeNumRatio
     */
    public String getExecuteNumRatio() {
        return executeNumRatio;
    }

    public void setExecuteNumRatio(String executeNumRatio) {
        this.executeNumRatio = executeNumRatio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TplCmp that = (TplCmp) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.sqlTemplate, that.sqlTemplate)
            && Objects.equals(this.sqlSampleString, that.sqlSampleString) && Objects.equals(this.dbNames, that.dbNames)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.sqlType, that.sqlType)
            && Objects.equals(this.executeNum, that.executeNum) && Objects.equals(this.totalCost, that.totalCost)
            && Objects.equals(this.avgCost, that.avgCost) && Objects.equals(this.maxCost, that.maxCost)
            && Objects.equals(this.avgRowsSent, that.avgRowsSent) && Objects.equals(this.maxRowsSent, that.maxRowsSent)
            && Objects.equals(this.avgRowsAffected, that.avgRowsAffected)
            && Objects.equals(this.maxRowsAffected, that.maxRowsAffected)
            && Objects.equals(this.avgLockTime, that.avgLockTime) && Objects.equals(this.maxLockTime, that.maxLockTime)
            && Objects.equals(this.totalRowsExamined, that.totalRowsExamined)
            && Objects.equals(this.avgRowsExamined, that.avgRowsExamined)
            && Objects.equals(this.maxRowsExamined, that.maxRowsExamined)
            && Objects.equals(this.totalCostRatio, that.totalCostRatio)
            && Objects.equals(this.totalExaminedRatio, that.totalExaminedRatio)
            && Objects.equals(this.executeNumRatio, that.executeNumRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId,
            sqlTemplate,
            sqlSampleString,
            dbNames,
            dbName,
            sqlType,
            executeNum,
            totalCost,
            avgCost,
            maxCost,
            avgRowsSent,
            maxRowsSent,
            avgRowsAffected,
            maxRowsAffected,
            avgLockTime,
            maxLockTime,
            totalRowsExamined,
            avgRowsExamined,
            maxRowsExamined,
            totalCostRatio,
            totalExaminedRatio,
            executeNumRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TplCmp {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    sqlTemplate: ").append(toIndentedString(sqlTemplate)).append("\n");
        sb.append("    sqlSampleString: ").append(toIndentedString(sqlSampleString)).append("\n");
        sb.append("    dbNames: ").append(toIndentedString(dbNames)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    executeNum: ").append(toIndentedString(executeNum)).append("\n");
        sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
        sb.append("    avgCost: ").append(toIndentedString(avgCost)).append("\n");
        sb.append("    maxCost: ").append(toIndentedString(maxCost)).append("\n");
        sb.append("    avgRowsSent: ").append(toIndentedString(avgRowsSent)).append("\n");
        sb.append("    maxRowsSent: ").append(toIndentedString(maxRowsSent)).append("\n");
        sb.append("    avgRowsAffected: ").append(toIndentedString(avgRowsAffected)).append("\n");
        sb.append("    maxRowsAffected: ").append(toIndentedString(maxRowsAffected)).append("\n");
        sb.append("    avgLockTime: ").append(toIndentedString(avgLockTime)).append("\n");
        sb.append("    maxLockTime: ").append(toIndentedString(maxLockTime)).append("\n");
        sb.append("    totalRowsExamined: ").append(toIndentedString(totalRowsExamined)).append("\n");
        sb.append("    avgRowsExamined: ").append(toIndentedString(avgRowsExamined)).append("\n");
        sb.append("    maxRowsExamined: ").append(toIndentedString(maxRowsExamined)).append("\n");
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
