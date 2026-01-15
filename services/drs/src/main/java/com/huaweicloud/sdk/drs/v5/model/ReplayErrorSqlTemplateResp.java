package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回放异常SQL数据项
 */
public class ReplayErrorSqlTemplateResp {

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
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ReplayErrorSqlTemplateResp withSqlTemplate(String sqlTemplate) {
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

    public ReplayErrorSqlTemplateResp withSqlTemplateMd5(String sqlTemplateMd5) {
        this.sqlTemplateMd5 = sqlTemplateMd5;
        return this;
    }

    /**
     * SQL模板MD5
     * @return sqlTemplateMd5
     */
    public String getSqlTemplateMd5() {
        return sqlTemplateMd5;
    }

    public void setSqlTemplateMd5(String sqlTemplateMd5) {
        this.sqlTemplateMd5 = sqlTemplateMd5;
    }

    public ReplayErrorSqlTemplateResp withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * 目标库昵称
     * @return targetName
     */
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public ReplayErrorSqlTemplateResp withSchemaName(String schemaName) {
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

    public ReplayErrorSqlTemplateResp withQueryType(String queryType) {
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

    public ReplayErrorSqlTemplateResp withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 目标库类型 取值：mysql,taurusha,sqlserver,postgresql,ddm,mongodb,awsdocumentdb,hwmongodb,hwpostgresql,oracle,taurus,gaussdb,kafka,mrsKafka,cassandra,dynamo,dws,gaussdbv5,gaussdbv5ha,gaussmongodb,multigaussdbv5,dmq,gaussdbt,gaussdbtha,gaussdb300,elasticsearch,db2,tidb,redis,gaussredis,rediscluster,mariadb,oceanbase,informix,gaussdbv1,gausscassandra,geminidynamo,dds,tauruslite
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public ReplayErrorSqlTemplateResp withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 归类的SQL数量
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
        ReplayErrorSqlTemplateResp that = (ReplayErrorSqlTemplateResp) obj;
        return Objects.equals(this.sqlTemplate, that.sqlTemplate)
            && Objects.equals(this.sqlTemplateMd5, that.sqlTemplateMd5)
            && Objects.equals(this.targetName, that.targetName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.queryType, that.queryType) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlTemplate, sqlTemplateMd5, targetName, schemaName, queryType, targetType, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplayErrorSqlTemplateResp {\n");
        sb.append("    sqlTemplate: ").append(toIndentedString(sqlTemplate)).append("\n");
        sb.append("    sqlTemplateMd5: ").append(toIndentedString(sqlTemplateMd5)).append("\n");
        sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
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
