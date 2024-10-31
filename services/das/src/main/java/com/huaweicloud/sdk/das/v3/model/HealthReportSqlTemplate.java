package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportSqlTemplate
 */
public class HealthReportSqlTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<String> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "times")

    private Long times;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_query_time")

    private Double avgQueryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_query_time")

    private Double maxQueryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_examined")

    private Double avgRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_examined")

    private Double maxRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_rows_examined")

    private Double sumRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_sent")

    private Double avgRowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_sent")

    private Double maxRowsSent;

    public HealthReportSqlTemplate withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模版ID。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public HealthReportSqlTemplate withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 模版内容。
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public HealthReportSqlTemplate withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public HealthReportSqlTemplate addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public HealthReportSqlTemplate withDatabases(Consumer<List<String>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库列表。
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    public HealthReportSqlTemplate withTimes(Long times) {
        this.times = times;
        return this;
    }

    /**
     * 执行次数。
     * @return times
     */
    public Long getTimes() {
        return times;
    }

    public void setTimes(Long times) {
        this.times = times;
    }

    public HealthReportSqlTemplate withAvgQueryTime(Double avgQueryTime) {
        this.avgQueryTime = avgQueryTime;
        return this;
    }

    /**
     * 平均执行时间。
     * @return avgQueryTime
     */
    public Double getAvgQueryTime() {
        return avgQueryTime;
    }

    public void setAvgQueryTime(Double avgQueryTime) {
        this.avgQueryTime = avgQueryTime;
    }

    public HealthReportSqlTemplate withMaxQueryTime(Double maxQueryTime) {
        this.maxQueryTime = maxQueryTime;
        return this;
    }

    /**
     * 最大执行时间。
     * @return maxQueryTime
     */
    public Double getMaxQueryTime() {
        return maxQueryTime;
    }

    public void setMaxQueryTime(Double maxQueryTime) {
        this.maxQueryTime = maxQueryTime;
    }

    public HealthReportSqlTemplate withAvgRowsExamined(Double avgRowsExamined) {
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

    public HealthReportSqlTemplate withMaxRowsExamined(Double maxRowsExamined) {
        this.maxRowsExamined = maxRowsExamined;
        return this;
    }

    /**
     * 最大扫描行数。
     * @return maxRowsExamined
     */
    public Double getMaxRowsExamined() {
        return maxRowsExamined;
    }

    public void setMaxRowsExamined(Double maxRowsExamined) {
        this.maxRowsExamined = maxRowsExamined;
    }

    public HealthReportSqlTemplate withSumRowsExamined(Double sumRowsExamined) {
        this.sumRowsExamined = sumRowsExamined;
        return this;
    }

    /**
     * 总扫描行数。
     * @return sumRowsExamined
     */
    public Double getSumRowsExamined() {
        return sumRowsExamined;
    }

    public void setSumRowsExamined(Double sumRowsExamined) {
        this.sumRowsExamined = sumRowsExamined;
    }

    public HealthReportSqlTemplate withAvgRowsSent(Double avgRowsSent) {
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

    public HealthReportSqlTemplate withMaxRowsSent(Double maxRowsSent) {
        this.maxRowsSent = maxRowsSent;
        return this;
    }

    /**
     * 最大返回行数。
     * @return maxRowsSent
     */
    public Double getMaxRowsSent() {
        return maxRowsSent;
    }

    public void setMaxRowsSent(Double maxRowsSent) {
        this.maxRowsSent = maxRowsSent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportSqlTemplate that = (HealthReportSqlTemplate) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.template, that.template)
            && Objects.equals(this.databases, that.databases) && Objects.equals(this.times, that.times)
            && Objects.equals(this.avgQueryTime, that.avgQueryTime)
            && Objects.equals(this.maxQueryTime, that.maxQueryTime)
            && Objects.equals(this.avgRowsExamined, that.avgRowsExamined)
            && Objects.equals(this.maxRowsExamined, that.maxRowsExamined)
            && Objects.equals(this.sumRowsExamined, that.sumRowsExamined)
            && Objects.equals(this.avgRowsSent, that.avgRowsSent) && Objects.equals(this.maxRowsSent, that.maxRowsSent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId,
            template,
            databases,
            times,
            avgQueryTime,
            maxQueryTime,
            avgRowsExamined,
            maxRowsExamined,
            sumRowsExamined,
            avgRowsSent,
            maxRowsSent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportSqlTemplate {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    times: ").append(toIndentedString(times)).append("\n");
        sb.append("    avgQueryTime: ").append(toIndentedString(avgQueryTime)).append("\n");
        sb.append("    maxQueryTime: ").append(toIndentedString(maxQueryTime)).append("\n");
        sb.append("    avgRowsExamined: ").append(toIndentedString(avgRowsExamined)).append("\n");
        sb.append("    maxRowsExamined: ").append(toIndentedString(maxRowsExamined)).append("\n");
        sb.append("    sumRowsExamined: ").append(toIndentedString(sumRowsExamined)).append("\n");
        sb.append("    avgRowsSent: ").append(toIndentedString(avgRowsSent)).append("\n");
        sb.append("    maxRowsSent: ").append(toIndentedString(maxRowsSent)).append("\n");
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
