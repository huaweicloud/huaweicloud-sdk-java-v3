package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportFullSqlStat
 */
public class HealthReportFullSqlStat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_full_sql")

    private Boolean collectFullSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_top_templates")

    private List<HealthReportSqlTemplate> executeTopTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_rows_examined_top_templates")

    private List<HealthReportSqlTemplate> sumRowsExaminedTopTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_cost_top_templates")

    private List<HealthReportSqlTemplate> avgCostTopTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyze_success")

    private Boolean analyzeSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public HealthReportFullSqlStat withCollectFullSql(Boolean collectFullSql) {
        this.collectFullSql = collectFullSql;
        return this;
    }

    /**
     * 是否收集全量SQL。
     * @return collectFullSql
     */
    public Boolean getCollectFullSql() {
        return collectFullSql;
    }

    public void setCollectFullSql(Boolean collectFullSql) {
        this.collectFullSql = collectFullSql;
    }

    public HealthReportFullSqlStat withExecuteTopTemplates(List<HealthReportSqlTemplate> executeTopTemplates) {
        this.executeTopTemplates = executeTopTemplates;
        return this;
    }

    public HealthReportFullSqlStat addExecuteTopTemplatesItem(HealthReportSqlTemplate executeTopTemplatesItem) {
        if (this.executeTopTemplates == null) {
            this.executeTopTemplates = new ArrayList<>();
        }
        this.executeTopTemplates.add(executeTopTemplatesItem);
        return this;
    }

    public HealthReportFullSqlStat withExecuteTopTemplates(
        Consumer<List<HealthReportSqlTemplate>> executeTopTemplatesSetter) {
        if (this.executeTopTemplates == null) {
            this.executeTopTemplates = new ArrayList<>();
        }
        executeTopTemplatesSetter.accept(this.executeTopTemplates);
        return this;
    }

    /**
     * 全量SQL Top总执行次数列表。
     * @return executeTopTemplates
     */
    public List<HealthReportSqlTemplate> getExecuteTopTemplates() {
        return executeTopTemplates;
    }

    public void setExecuteTopTemplates(List<HealthReportSqlTemplate> executeTopTemplates) {
        this.executeTopTemplates = executeTopTemplates;
    }

    public HealthReportFullSqlStat withSumRowsExaminedTopTemplates(
        List<HealthReportSqlTemplate> sumRowsExaminedTopTemplates) {
        this.sumRowsExaminedTopTemplates = sumRowsExaminedTopTemplates;
        return this;
    }

    public HealthReportFullSqlStat addSumRowsExaminedTopTemplatesItem(
        HealthReportSqlTemplate sumRowsExaminedTopTemplatesItem) {
        if (this.sumRowsExaminedTopTemplates == null) {
            this.sumRowsExaminedTopTemplates = new ArrayList<>();
        }
        this.sumRowsExaminedTopTemplates.add(sumRowsExaminedTopTemplatesItem);
        return this;
    }

    public HealthReportFullSqlStat withSumRowsExaminedTopTemplates(
        Consumer<List<HealthReportSqlTemplate>> sumRowsExaminedTopTemplatesSetter) {
        if (this.sumRowsExaminedTopTemplates == null) {
            this.sumRowsExaminedTopTemplates = new ArrayList<>();
        }
        sumRowsExaminedTopTemplatesSetter.accept(this.sumRowsExaminedTopTemplates);
        return this;
    }

    /**
     * 全量SQL Top总扫描行数列表。
     * @return sumRowsExaminedTopTemplates
     */
    public List<HealthReportSqlTemplate> getSumRowsExaminedTopTemplates() {
        return sumRowsExaminedTopTemplates;
    }

    public void setSumRowsExaminedTopTemplates(List<HealthReportSqlTemplate> sumRowsExaminedTopTemplates) {
        this.sumRowsExaminedTopTemplates = sumRowsExaminedTopTemplates;
    }

    public HealthReportFullSqlStat withAvgCostTopTemplates(List<HealthReportSqlTemplate> avgCostTopTemplates) {
        this.avgCostTopTemplates = avgCostTopTemplates;
        return this;
    }

    public HealthReportFullSqlStat addAvgCostTopTemplatesItem(HealthReportSqlTemplate avgCostTopTemplatesItem) {
        if (this.avgCostTopTemplates == null) {
            this.avgCostTopTemplates = new ArrayList<>();
        }
        this.avgCostTopTemplates.add(avgCostTopTemplatesItem);
        return this;
    }

    public HealthReportFullSqlStat withAvgCostTopTemplates(
        Consumer<List<HealthReportSqlTemplate>> avgCostTopTemplatesSetter) {
        if (this.avgCostTopTemplates == null) {
            this.avgCostTopTemplates = new ArrayList<>();
        }
        avgCostTopTemplatesSetter.accept(this.avgCostTopTemplates);
        return this;
    }

    /**
     * 全量SQL Top平均执行耗时列表。
     * @return avgCostTopTemplates
     */
    public List<HealthReportSqlTemplate> getAvgCostTopTemplates() {
        return avgCostTopTemplates;
    }

    public void setAvgCostTopTemplates(List<HealthReportSqlTemplate> avgCostTopTemplates) {
        this.avgCostTopTemplates = avgCostTopTemplates;
    }

    public HealthReportFullSqlStat withAnalyzeSuccess(Boolean analyzeSuccess) {
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

    public HealthReportFullSqlStat withErrorMessage(String errorMessage) {
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
        HealthReportFullSqlStat that = (HealthReportFullSqlStat) obj;
        return Objects.equals(this.collectFullSql, that.collectFullSql)
            && Objects.equals(this.executeTopTemplates, that.executeTopTemplates)
            && Objects.equals(this.sumRowsExaminedTopTemplates, that.sumRowsExaminedTopTemplates)
            && Objects.equals(this.avgCostTopTemplates, that.avgCostTopTemplates)
            && Objects.equals(this.analyzeSuccess, that.analyzeSuccess)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectFullSql,
            executeTopTemplates,
            sumRowsExaminedTopTemplates,
            avgCostTopTemplates,
            analyzeSuccess,
            errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportFullSqlStat {\n");
        sb.append("    collectFullSql: ").append(toIndentedString(collectFullSql)).append("\n");
        sb.append("    executeTopTemplates: ").append(toIndentedString(executeTopTemplates)).append("\n");
        sb.append("    sumRowsExaminedTopTemplates: ")
            .append(toIndentedString(sumRowsExaminedTopTemplates))
            .append("\n");
        sb.append("    avgCostTopTemplates: ").append(toIndentedString(avgCostTopTemplates)).append("\n");
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
