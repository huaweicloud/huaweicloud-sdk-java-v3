package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConsistencyRuleDetailForOpenApi
 */
public class ConsistencyRuleDetailForOpenApi {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_rule_name")

    private String subRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Long templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    private String connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private String databases;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private String tables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_tables")

    private String referenceTables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private String columns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_columns")

    private String referenceColumns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private String dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regular_expression")

    private String regularExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_arguments")

    private String templateArguments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calculation_range")

    private String calculationRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calculation_range_sql")

    private String calculationRangeSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_condition")

    private String alarmCondition;

    public ConsistencyRuleDetailForOpenApi withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 子规则ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ConsistencyRuleDetailForOpenApi withSubRuleName(String subRuleName) {
        this.subRuleName = subRuleName;
        return this;
    }

    /**
     * 子规则名称
     * @return subRuleName
     */
    public String getSubRuleName() {
        return subRuleName;
    }

    public void setSubRuleName(String subRuleName) {
        this.subRuleName = subRuleName;
    }

    public ConsistencyRuleDetailForOpenApi withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * SingleDatabase:库级规则，SingleTable:表级规则,SingleColumn:字段级规则,CrossColumn:跨字段规则,Customize:自定义规则
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConsistencyRuleDetailForOpenApi withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 规则模板ID
     * @return templateId
     */
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public ConsistencyRuleDetailForOpenApi withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * 数据连接ID
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public ConsistencyRuleDetailForOpenApi withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * 数据连接类型
     * @return connectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public ConsistencyRuleDetailForOpenApi withDatabases(String databases) {
        this.databases = databases;
        return this;
    }

    /**
     * 数据库名，当存在多个值时以逗号分隔
     * @return databases
     */
    public String getDatabases() {
        return databases;
    }

    public void setDatabases(String databases) {
        this.databases = databases;
    }

    public ConsistencyRuleDetailForOpenApi withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 自定义规则中的SQL脚本
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public ConsistencyRuleDetailForOpenApi withTables(String tables) {
        this.tables = tables;
        return this;
    }

    /**
     * 表名，当存在多个值时以逗号分隔
     * @return tables
     */
    public String getTables() {
        return tables;
    }

    public void setTables(String tables) {
        this.tables = tables;
    }

    public ConsistencyRuleDetailForOpenApi withReferenceTables(String referenceTables) {
        this.referenceTables = referenceTables;
        return this;
    }

    /**
     * 对照表名，当存在多个值时以逗号分隔
     * @return referenceTables
     */
    public String getReferenceTables() {
        return referenceTables;
    }

    public void setReferenceTables(String referenceTables) {
        this.referenceTables = referenceTables;
    }

    public ConsistencyRuleDetailForOpenApi withColumns(String columns) {
        this.columns = columns;
        return this;
    }

    /**
     * 字段名，当存在多个值时以逗号分隔
     * @return columns
     */
    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public ConsistencyRuleDetailForOpenApi withReferenceColumns(String referenceColumns) {
        this.referenceColumns = referenceColumns;
        return this;
    }

    /**
     * 对照列名，当存在多个值时以逗号分隔
     * @return referenceColumns
     */
    public String getReferenceColumns() {
        return referenceColumns;
    }

    public void setReferenceColumns(String referenceColumns) {
        this.referenceColumns = referenceColumns;
    }

    public ConsistencyRuleDetailForOpenApi withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * 维度
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public ConsistencyRuleDetailForOpenApi withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * DLI队列
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public ConsistencyRuleDetailForOpenApi withRegularExpression(String regularExpression) {
        this.regularExpression = regularExpression;
        return this;
    }

    /**
     * 当规则模板为正则表达式校验时的正则表达式
     * @return regularExpression
     */
    public String getRegularExpression() {
        return regularExpression;
    }

    public void setRegularExpression(String regularExpression) {
        this.regularExpression = regularExpression;
    }

    public ConsistencyRuleDetailForOpenApi withTemplateArguments(String templateArguments) {
        this.templateArguments = templateArguments;
        return this;
    }

    /**
     * 模板参数
     * @return templateArguments
     */
    public String getTemplateArguments() {
        return templateArguments;
    }

    public void setTemplateArguments(String templateArguments) {
        this.templateArguments = templateArguments;
    }

    public ConsistencyRuleDetailForOpenApi withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 规则权重
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public ConsistencyRuleDetailForOpenApi withCalculationRange(String calculationRange) {
        this.calculationRange = calculationRange;
        return this;
    }

    /**
     * 计算范围
     * @return calculationRange
     */
    public String getCalculationRange() {
        return calculationRange;
    }

    public void setCalculationRange(String calculationRange) {
        this.calculationRange = calculationRange;
    }

    public ConsistencyRuleDetailForOpenApi withCalculationRangeSql(String calculationRangeSql) {
        this.calculationRangeSql = calculationRangeSql;
        return this;
    }

    /**
     * 计算范围SQL
     * @return calculationRangeSql
     */
    public String getCalculationRangeSql() {
        return calculationRangeSql;
    }

    public void setCalculationRangeSql(String calculationRangeSql) {
        this.calculationRangeSql = calculationRangeSql;
    }

    public ConsistencyRuleDetailForOpenApi withAlarmCondition(String alarmCondition) {
        this.alarmCondition = alarmCondition;
        return this;
    }

    /**
     * 告警表达式
     * @return alarmCondition
     */
    public String getAlarmCondition() {
        return alarmCondition;
    }

    public void setAlarmCondition(String alarmCondition) {
        this.alarmCondition = alarmCondition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsistencyRuleDetailForOpenApi that = (ConsistencyRuleDetailForOpenApi) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.subRuleName, that.subRuleName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.connectionType, that.connectionType)
            && Objects.equals(this.databases, that.databases) && Objects.equals(this.sql, that.sql)
            && Objects.equals(this.tables, that.tables) && Objects.equals(this.referenceTables, that.referenceTables)
            && Objects.equals(this.columns, that.columns)
            && Objects.equals(this.referenceColumns, that.referenceColumns)
            && Objects.equals(this.dimension, that.dimension) && Objects.equals(this.queue, that.queue)
            && Objects.equals(this.regularExpression, that.regularExpression)
            && Objects.equals(this.templateArguments, that.templateArguments)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.calculationRange, that.calculationRange)
            && Objects.equals(this.calculationRangeSql, that.calculationRangeSql)
            && Objects.equals(this.alarmCondition, that.alarmCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            subRuleName,
            type,
            templateId,
            connection,
            connectionType,
            databases,
            sql,
            tables,
            referenceTables,
            columns,
            referenceColumns,
            dimension,
            queue,
            regularExpression,
            templateArguments,
            weight,
            calculationRange,
            calculationRangeSql,
            alarmCondition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsistencyRuleDetailForOpenApi {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    subRuleName: ").append(toIndentedString(subRuleName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
        sb.append("    referenceTables: ").append(toIndentedString(referenceTables)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    referenceColumns: ").append(toIndentedString(referenceColumns)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    regularExpression: ").append(toIndentedString(regularExpression)).append("\n");
        sb.append("    templateArguments: ").append(toIndentedString(templateArguments)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    calculationRange: ").append(toIndentedString(calculationRange)).append("\n");
        sb.append("    calculationRangeSql: ").append(toIndentedString(calculationRangeSql)).append("\n");
        sb.append("    alarmCondition: ").append(toIndentedString(alarmCondition)).append("\n");
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
