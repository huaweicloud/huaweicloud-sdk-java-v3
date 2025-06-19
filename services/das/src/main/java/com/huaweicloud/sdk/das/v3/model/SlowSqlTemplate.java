package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SlowSqlTemplate
 */
public class SlowSqlTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template")

    private String sqlTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_sample")

    private String sqlSample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_sample_user")

    private String sqlSampleUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_names")

    private List<String> dbNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_count")

    private Long executeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_execute_time")

    private Double avgExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_execute_time")

    private Double maxExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_lock_wait_time")

    private Double avgLockWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_lock_wait_time")

    private Double maxLockWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_examined")

    private Double avgRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_examined")

    private Double maxRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_sent")

    private Double avgRowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_sent")

    private Double maxRowsSent;

    public SlowSqlTemplate withSqlTemplate(String sqlTemplate) {
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

    public SlowSqlTemplate withSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
        return this;
    }

    /**
     * SQL模板ID。
     * @return sqlTemplateId
     */
    public String getSqlTemplateId() {
        return sqlTemplateId;
    }

    public void setSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
    }

    public SlowSqlTemplate withSqlSample(String sqlSample) {
        this.sqlSample = sqlSample;
        return this;
    }

    /**
     * SQL样本。
     * @return sqlSample
     */
    public String getSqlSample() {
        return sqlSample;
    }

    public void setSqlSample(String sqlSample) {
        this.sqlSample = sqlSample;
    }

    public SlowSqlTemplate withSqlSampleUser(String sqlSampleUser) {
        this.sqlSampleUser = sqlSampleUser;
        return this;
    }

    /**
     * SQL样本执行用户。
     * @return sqlSampleUser
     */
    public String getSqlSampleUser() {
        return sqlSampleUser;
    }

    public void setSqlSampleUser(String sqlSampleUser) {
        this.sqlSampleUser = sqlSampleUser;
    }

    public SlowSqlTemplate withDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    public SlowSqlTemplate addDbNamesItem(String dbNamesItem) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        this.dbNames.add(dbNamesItem);
        return this;
    }

    public SlowSqlTemplate withDbNames(Consumer<List<String>> dbNamesSetter) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        dbNamesSetter.accept(this.dbNames);
        return this;
    }

    /**
     * 库名。
     * @return dbNames
     */
    public List<String> getDbNames() {
        return dbNames;
    }

    public void setDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
    }

    public SlowSqlTemplate withExecuteCount(Long executeCount) {
        this.executeCount = executeCount;
        return this;
    }

    /**
     * 执行次数。
     * @return executeCount
     */
    public Long getExecuteCount() {
        return executeCount;
    }

    public void setExecuteCount(Long executeCount) {
        this.executeCount = executeCount;
    }

    public SlowSqlTemplate withAvgExecuteTime(Double avgExecuteTime) {
        this.avgExecuteTime = avgExecuteTime;
        return this;
    }

    /**
     * 平均执行耗时(ms)。
     * @return avgExecuteTime
     */
    public Double getAvgExecuteTime() {
        return avgExecuteTime;
    }

    public void setAvgExecuteTime(Double avgExecuteTime) {
        this.avgExecuteTime = avgExecuteTime;
    }

    public SlowSqlTemplate withMaxExecuteTime(Double maxExecuteTime) {
        this.maxExecuteTime = maxExecuteTime;
        return this;
    }

    /**
     * 最大执行耗时(ms)。
     * @return maxExecuteTime
     */
    public Double getMaxExecuteTime() {
        return maxExecuteTime;
    }

    public void setMaxExecuteTime(Double maxExecuteTime) {
        this.maxExecuteTime = maxExecuteTime;
    }

    public SlowSqlTemplate withAvgLockWaitTime(Double avgLockWaitTime) {
        this.avgLockWaitTime = avgLockWaitTime;
        return this;
    }

    /**
     * 平均锁等待时间(ms)。
     * @return avgLockWaitTime
     */
    public Double getAvgLockWaitTime() {
        return avgLockWaitTime;
    }

    public void setAvgLockWaitTime(Double avgLockWaitTime) {
        this.avgLockWaitTime = avgLockWaitTime;
    }

    public SlowSqlTemplate withMaxLockWaitTime(Double maxLockWaitTime) {
        this.maxLockWaitTime = maxLockWaitTime;
        return this;
    }

    /**
     * 最大锁等待时间(ms)。
     * @return maxLockWaitTime
     */
    public Double getMaxLockWaitTime() {
        return maxLockWaitTime;
    }

    public void setMaxLockWaitTime(Double maxLockWaitTime) {
        this.maxLockWaitTime = maxLockWaitTime;
    }

    public SlowSqlTemplate withAvgRowsExamined(Double avgRowsExamined) {
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

    public SlowSqlTemplate withMaxRowsExamined(Double maxRowsExamined) {
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

    public SlowSqlTemplate withAvgRowsSent(Double avgRowsSent) {
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

    public SlowSqlTemplate withMaxRowsSent(Double maxRowsSent) {
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
        SlowSqlTemplate that = (SlowSqlTemplate) obj;
        return Objects.equals(this.sqlTemplate, that.sqlTemplate)
            && Objects.equals(this.sqlTemplateId, that.sqlTemplateId) && Objects.equals(this.sqlSample, that.sqlSample)
            && Objects.equals(this.sqlSampleUser, that.sqlSampleUser) && Objects.equals(this.dbNames, that.dbNames)
            && Objects.equals(this.executeCount, that.executeCount)
            && Objects.equals(this.avgExecuteTime, that.avgExecuteTime)
            && Objects.equals(this.maxExecuteTime, that.maxExecuteTime)
            && Objects.equals(this.avgLockWaitTime, that.avgLockWaitTime)
            && Objects.equals(this.maxLockWaitTime, that.maxLockWaitTime)
            && Objects.equals(this.avgRowsExamined, that.avgRowsExamined)
            && Objects.equals(this.maxRowsExamined, that.maxRowsExamined)
            && Objects.equals(this.avgRowsSent, that.avgRowsSent) && Objects.equals(this.maxRowsSent, that.maxRowsSent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlTemplate,
            sqlTemplateId,
            sqlSample,
            sqlSampleUser,
            dbNames,
            executeCount,
            avgExecuteTime,
            maxExecuteTime,
            avgLockWaitTime,
            maxLockWaitTime,
            avgRowsExamined,
            maxRowsExamined,
            avgRowsSent,
            maxRowsSent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowSqlTemplate {\n");
        sb.append("    sqlTemplate: ").append(toIndentedString(sqlTemplate)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
        sb.append("    sqlSample: ").append(toIndentedString(sqlSample)).append("\n");
        sb.append("    sqlSampleUser: ").append(toIndentedString(sqlSampleUser)).append("\n");
        sb.append("    dbNames: ").append(toIndentedString(dbNames)).append("\n");
        sb.append("    executeCount: ").append(toIndentedString(executeCount)).append("\n");
        sb.append("    avgExecuteTime: ").append(toIndentedString(avgExecuteTime)).append("\n");
        sb.append("    maxExecuteTime: ").append(toIndentedString(maxExecuteTime)).append("\n");
        sb.append("    avgLockWaitTime: ").append(toIndentedString(avgLockWaitTime)).append("\n");
        sb.append("    maxLockWaitTime: ").append(toIndentedString(maxLockWaitTime)).append("\n");
        sb.append("    avgRowsExamined: ").append(toIndentedString(avgRowsExamined)).append("\n");
        sb.append("    maxRowsExamined: ").append(toIndentedString(maxRowsExamined)).append("\n");
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
