package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 慢SQL统计信息数据项
 */
public class ReplaySlowSqlTemplateResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template")

    private String sqlTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_md5")

    private String sqlTemplateMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_name")

    private String targetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private String queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_latency")

    private Long minLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_latency")

    private Long maxLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_latency")

    private Long avgLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_latency")

    private Long totalLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ReplaySlowSqlTemplateResp withSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
        return this;
    }

    /**
     * SQL语句模板
     * @return sqlTemplate
     */
    public String getSqlTemplate() {
        return sqlTemplate;
    }

    public void setSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
    }

    public ReplaySlowSqlTemplateResp withSqlTemplateMd5(String sqlTemplateMd5) {
        this.sqlTemplateMd5 = sqlTemplateMd5;
        return this;
    }

    /**
     * SQL语句模板MD5
     * @return sqlTemplateMd5
     */
    public String getSqlTemplateMd5() {
        return sqlTemplateMd5;
    }

    public void setSqlTemplateMd5(String sqlTemplateMd5) {
        this.sqlTemplateMd5 = sqlTemplateMd5;
    }

    public ReplaySlowSqlTemplateResp withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * 目标库别名
     * @return targetName
     */
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public ReplaySlowSqlTemplateResp withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ReplaySlowSqlTemplateResp withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * SQL类型 取值：SELECT, INSERT, DELETE, UPDATE, DDL
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public ReplaySlowSqlTemplateResp withMinLatency(Long minLatency) {
        this.minLatency = minLatency;
        return this;
    }

    /**
     * SQL执行最小耗时
     * @return minLatency
     */
    public Long getMinLatency() {
        return minLatency;
    }

    public void setMinLatency(Long minLatency) {
        this.minLatency = minLatency;
    }

    public ReplaySlowSqlTemplateResp withMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
        return this;
    }

    /**
     * SQL执行最大耗时
     * @return maxLatency
     */
    public Long getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }

    public ReplaySlowSqlTemplateResp withAvgLatency(Long avgLatency) {
        this.avgLatency = avgLatency;
        return this;
    }

    /**
     * SQL执行平均耗时
     * @return avgLatency
     */
    public Long getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(Long avgLatency) {
        this.avgLatency = avgLatency;
    }

    public ReplaySlowSqlTemplateResp withTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
        return this;
    }

    /**
     * SQL执行总的耗时
     * @return totalLatency
     */
    public Long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    public ReplaySlowSqlTemplateResp withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 目标库类型
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public ReplaySlowSqlTemplateResp withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * SQL数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplaySlowSqlTemplateResp that = (ReplaySlowSqlTemplateResp) obj;
        return Objects.equals(this.sqlTemplate, that.sqlTemplate)
            && Objects.equals(this.sqlTemplateMd5, that.sqlTemplateMd5)
            && Objects.equals(this.targetName, that.targetName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.queryType, that.queryType) && Objects.equals(this.minLatency, that.minLatency)
            && Objects.equals(this.maxLatency, that.maxLatency) && Objects.equals(this.avgLatency, that.avgLatency)
            && Objects.equals(this.totalLatency, that.totalLatency) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlTemplate,
            sqlTemplateMd5,
            targetName,
            schemaName,
            queryType,
            minLatency,
            maxLatency,
            avgLatency,
            totalLatency,
            targetType,
            count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplaySlowSqlTemplateResp {\n");
        sb.append("    sqlTemplate: ").append(toIndentedString(sqlTemplate)).append("\n");
        sb.append("    sqlTemplateMd5: ").append(toIndentedString(sqlTemplateMd5)).append("\n");
        sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    minLatency: ").append(toIndentedString(minLatency)).append("\n");
        sb.append("    maxLatency: ").append(toIndentedString(maxLatency)).append("\n");
        sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
        sb.append("    totalLatency: ").append(toIndentedString(totalLatency)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
