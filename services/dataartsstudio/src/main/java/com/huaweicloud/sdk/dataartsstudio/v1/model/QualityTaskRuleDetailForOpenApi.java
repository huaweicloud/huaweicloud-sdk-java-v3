package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QualityTaskRuleDetailForOpenApi
 */
public class QualityTaskRuleDetailForOpenApi {

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
    @JsonProperty(value = "ignore_error")

    private Boolean ignoreError;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_abnormal_table")

    private Boolean exportAbnormalTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_database")

    private String abnormalTableDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_schema")

    private String abnormalTableSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table")

    private String abnormalTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_prefix")

    private String abnormalTablePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_suffix")

    private String abnormalTableSuffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_columns")

    private String abnormalTableColumns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_sql")

    private String abnormalTableSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_out_config")

    private Boolean abnormalTableOutConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_include_null_value")

    private Boolean abnormalTableIncludeNullValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_out_data_number")

    private Integer abnormalTableOutDataNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score_switch")

    private Boolean scoreSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score_schema")

    private String scoreSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score_table")

    private String scoreTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score_expression")

    private String scoreExpression;

    public QualityTaskRuleDetailForOpenApi withId(Long id) {
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

    public QualityTaskRuleDetailForOpenApi withSubRuleName(String subRuleName) {
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

    public QualityTaskRuleDetailForOpenApi withType(String type) {
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

    public QualityTaskRuleDetailForOpenApi withTemplateId(Long templateId) {
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

    public QualityTaskRuleDetailForOpenApi withConnection(String connection) {
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

    public QualityTaskRuleDetailForOpenApi withConnectionType(String connectionType) {
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

    public QualityTaskRuleDetailForOpenApi withDatabases(String databases) {
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

    public QualityTaskRuleDetailForOpenApi withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 自定义规则中的SQL脚本，系统内置规则时返回
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public QualityTaskRuleDetailForOpenApi withTables(String tables) {
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

    public QualityTaskRuleDetailForOpenApi withReferenceTables(String referenceTables) {
        this.referenceTables = referenceTables;
        return this;
    }

    /**
     * 跨字段规则中的参考表名，当存在多个值时以逗号分隔
     * @return referenceTables
     */
    public String getReferenceTables() {
        return referenceTables;
    }

    public void setReferenceTables(String referenceTables) {
        this.referenceTables = referenceTables;
    }

    public QualityTaskRuleDetailForOpenApi withColumns(String columns) {
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

    public QualityTaskRuleDetailForOpenApi withReferenceColumns(String referenceColumns) {
        this.referenceColumns = referenceColumns;
        return this;
    }

    /**
     * 跨字段规则中的参考字段名，当存在多个值时以逗号分隔
     * @return referenceColumns
     */
    public String getReferenceColumns() {
        return referenceColumns;
    }

    public void setReferenceColumns(String referenceColumns) {
        this.referenceColumns = referenceColumns;
    }

    public QualityTaskRuleDetailForOpenApi withIgnoreError(Boolean ignoreError) {
        this.ignoreError = ignoreError;
        return this;
    }

    /**
     * 是否忽视规则错误
     * @return ignoreError
     */
    public Boolean getIgnoreError() {
        return ignoreError;
    }

    public void setIgnoreError(Boolean ignoreError) {
        this.ignoreError = ignoreError;
    }

    public QualityTaskRuleDetailForOpenApi withDimension(String dimension) {
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

    public QualityTaskRuleDetailForOpenApi withQueue(String queue) {
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

    public QualityTaskRuleDetailForOpenApi withRegularExpression(String regularExpression) {
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

    public QualityTaskRuleDetailForOpenApi withTemplateArguments(String templateArguments) {
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

    public QualityTaskRuleDetailForOpenApi withWeight(Integer weight) {
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

    public QualityTaskRuleDetailForOpenApi withCalculationRange(String calculationRange) {
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

    public QualityTaskRuleDetailForOpenApi withCalculationRangeSql(String calculationRangeSql) {
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

    public QualityTaskRuleDetailForOpenApi withAlarmCondition(String alarmCondition) {
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

    public QualityTaskRuleDetailForOpenApi withExportAbnormalTable(Boolean exportAbnormalTable) {
        this.exportAbnormalTable = exportAbnormalTable;
        return this;
    }

    /**
     * 是否导出异常数据
     * @return exportAbnormalTable
     */
    public Boolean getExportAbnormalTable() {
        return exportAbnormalTable;
    }

    public void setExportAbnormalTable(Boolean exportAbnormalTable) {
        this.exportAbnormalTable = exportAbnormalTable;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTableDatabase(String abnormalTableDatabase) {
        this.abnormalTableDatabase = abnormalTableDatabase;
        return this;
    }

    /**
     * 异常表数据库
     * @return abnormalTableDatabase
     */
    public String getAbnormalTableDatabase() {
        return abnormalTableDatabase;
    }

    public void setAbnormalTableDatabase(String abnormalTableDatabase) {
        this.abnormalTableDatabase = abnormalTableDatabase;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTableSchema(String abnormalTableSchema) {
        this.abnormalTableSchema = abnormalTableSchema;
        return this;
    }

    /**
     * 异常表Schema
     * @return abnormalTableSchema
     */
    public String getAbnormalTableSchema() {
        return abnormalTableSchema;
    }

    public void setAbnormalTableSchema(String abnormalTableSchema) {
        this.abnormalTableSchema = abnormalTableSchema;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTable(String abnormalTable) {
        this.abnormalTable = abnormalTable;
        return this;
    }

    /**
     * 异常字段所在的表
     * @return abnormalTable
     */
    public String getAbnormalTable() {
        return abnormalTable;
    }

    public void setAbnormalTable(String abnormalTable) {
        this.abnormalTable = abnormalTable;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTablePrefix(String abnormalTablePrefix) {
        this.abnormalTablePrefix = abnormalTablePrefix;
        return this;
    }

    /**
     * 异常表前缀
     * @return abnormalTablePrefix
     */
    public String getAbnormalTablePrefix() {
        return abnormalTablePrefix;
    }

    public void setAbnormalTablePrefix(String abnormalTablePrefix) {
        this.abnormalTablePrefix = abnormalTablePrefix;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTableSuffix(String abnormalTableSuffix) {
        this.abnormalTableSuffix = abnormalTableSuffix;
        return this;
    }

    /**
     * 异常表后缀
     * @return abnormalTableSuffix
     */
    public String getAbnormalTableSuffix() {
        return abnormalTableSuffix;
    }

    public void setAbnormalTableSuffix(String abnormalTableSuffix) {
        this.abnormalTableSuffix = abnormalTableSuffix;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTableColumns(String abnormalTableColumns) {
        this.abnormalTableColumns = abnormalTableColumns;
        return this;
    }

    /**
     * 异常字段名，当存在多个值时以逗号分隔
     * @return abnormalTableColumns
     */
    public String getAbnormalTableColumns() {
        return abnormalTableColumns;
    }

    public void setAbnormalTableColumns(String abnormalTableColumns) {
        this.abnormalTableColumns = abnormalTableColumns;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTableSql(String abnormalTableSql) {
        this.abnormalTableSql = abnormalTableSql;
        return this;
    }

    /**
     * 异常表SQL
     * @return abnormalTableSql
     */
    public String getAbnormalTableSql() {
        return abnormalTableSql;
    }

    public void setAbnormalTableSql(String abnormalTableSql) {
        this.abnormalTableSql = abnormalTableSql;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTableOutConfig(Boolean abnormalTableOutConfig) {
        this.abnormalTableOutConfig = abnormalTableOutConfig;
        return this;
    }

    /**
     * 异常表是否输出规则配置
     * @return abnormalTableOutConfig
     */
    public Boolean getAbnormalTableOutConfig() {
        return abnormalTableOutConfig;
    }

    public void setAbnormalTableOutConfig(Boolean abnormalTableOutConfig) {
        this.abnormalTableOutConfig = abnormalTableOutConfig;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTableIncludeNullValue(Boolean abnormalTableIncludeNullValue) {
        this.abnormalTableIncludeNullValue = abnormalTableIncludeNullValue;
        return this;
    }

    /**
     * 异常表是否包含空值
     * @return abnormalTableIncludeNullValue
     */
    public Boolean getAbnormalTableIncludeNullValue() {
        return abnormalTableIncludeNullValue;
    }

    public void setAbnormalTableIncludeNullValue(Boolean abnormalTableIncludeNullValue) {
        this.abnormalTableIncludeNullValue = abnormalTableIncludeNullValue;
    }

    public QualityTaskRuleDetailForOpenApi withAbnormalTableOutDataNumber(Integer abnormalTableOutDataNumber) {
        this.abnormalTableOutDataNumber = abnormalTableOutDataNumber;
        return this;
    }

    /**
     * 异常表输出行数, 0代表全量输出
     * @return abnormalTableOutDataNumber
     */
    public Integer getAbnormalTableOutDataNumber() {
        return abnormalTableOutDataNumber;
    }

    public void setAbnormalTableOutDataNumber(Integer abnormalTableOutDataNumber) {
        this.abnormalTableOutDataNumber = abnormalTableOutDataNumber;
    }

    public QualityTaskRuleDetailForOpenApi withScoreSwitch(Boolean scoreSwitch) {
        this.scoreSwitch = scoreSwitch;
        return this;
    }

    /**
     * 是否开启质量评分
     * @return scoreSwitch
     */
    public Boolean getScoreSwitch() {
        return scoreSwitch;
    }

    public void setScoreSwitch(Boolean scoreSwitch) {
        this.scoreSwitch = scoreSwitch;
    }

    public QualityTaskRuleDetailForOpenApi withScoreSchema(String scoreSchema) {
        this.scoreSchema = scoreSchema;
        return this;
    }

    /**
     * 质量评分表所在schema
     * @return scoreSchema
     */
    public String getScoreSchema() {
        return scoreSchema;
    }

    public void setScoreSchema(String scoreSchema) {
        this.scoreSchema = scoreSchema;
    }

    public QualityTaskRuleDetailForOpenApi withScoreTable(String scoreTable) {
        this.scoreTable = scoreTable;
        return this;
    }

    /**
     * 质量评分表名
     * @return scoreTable
     */
    public String getScoreTable() {
        return scoreTable;
    }

    public void setScoreTable(String scoreTable) {
        this.scoreTable = scoreTable;
    }

    public QualityTaskRuleDetailForOpenApi withScoreExpression(String scoreExpression) {
        this.scoreExpression = scoreExpression;
        return this;
    }

    /**
     * 质量评分表达式
     * @return scoreExpression
     */
    public String getScoreExpression() {
        return scoreExpression;
    }

    public void setScoreExpression(String scoreExpression) {
        this.scoreExpression = scoreExpression;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualityTaskRuleDetailForOpenApi qualityTaskRuleDetailForOpenApi = (QualityTaskRuleDetailForOpenApi) o;
        return Objects.equals(this.id, qualityTaskRuleDetailForOpenApi.id)
            && Objects.equals(this.subRuleName, qualityTaskRuleDetailForOpenApi.subRuleName)
            && Objects.equals(this.type, qualityTaskRuleDetailForOpenApi.type)
            && Objects.equals(this.templateId, qualityTaskRuleDetailForOpenApi.templateId)
            && Objects.equals(this.connection, qualityTaskRuleDetailForOpenApi.connection)
            && Objects.equals(this.connectionType, qualityTaskRuleDetailForOpenApi.connectionType)
            && Objects.equals(this.databases, qualityTaskRuleDetailForOpenApi.databases)
            && Objects.equals(this.sql, qualityTaskRuleDetailForOpenApi.sql)
            && Objects.equals(this.tables, qualityTaskRuleDetailForOpenApi.tables)
            && Objects.equals(this.referenceTables, qualityTaskRuleDetailForOpenApi.referenceTables)
            && Objects.equals(this.columns, qualityTaskRuleDetailForOpenApi.columns)
            && Objects.equals(this.referenceColumns, qualityTaskRuleDetailForOpenApi.referenceColumns)
            && Objects.equals(this.ignoreError, qualityTaskRuleDetailForOpenApi.ignoreError)
            && Objects.equals(this.dimension, qualityTaskRuleDetailForOpenApi.dimension)
            && Objects.equals(this.queue, qualityTaskRuleDetailForOpenApi.queue)
            && Objects.equals(this.regularExpression, qualityTaskRuleDetailForOpenApi.regularExpression)
            && Objects.equals(this.templateArguments, qualityTaskRuleDetailForOpenApi.templateArguments)
            && Objects.equals(this.weight, qualityTaskRuleDetailForOpenApi.weight)
            && Objects.equals(this.calculationRange, qualityTaskRuleDetailForOpenApi.calculationRange)
            && Objects.equals(this.calculationRangeSql, qualityTaskRuleDetailForOpenApi.calculationRangeSql)
            && Objects.equals(this.alarmCondition, qualityTaskRuleDetailForOpenApi.alarmCondition)
            && Objects.equals(this.exportAbnormalTable, qualityTaskRuleDetailForOpenApi.exportAbnormalTable)
            && Objects.equals(this.abnormalTableDatabase, qualityTaskRuleDetailForOpenApi.abnormalTableDatabase)
            && Objects.equals(this.abnormalTableSchema, qualityTaskRuleDetailForOpenApi.abnormalTableSchema)
            && Objects.equals(this.abnormalTable, qualityTaskRuleDetailForOpenApi.abnormalTable)
            && Objects.equals(this.abnormalTablePrefix, qualityTaskRuleDetailForOpenApi.abnormalTablePrefix)
            && Objects.equals(this.abnormalTableSuffix, qualityTaskRuleDetailForOpenApi.abnormalTableSuffix)
            && Objects.equals(this.abnormalTableColumns, qualityTaskRuleDetailForOpenApi.abnormalTableColumns)
            && Objects.equals(this.abnormalTableSql, qualityTaskRuleDetailForOpenApi.abnormalTableSql)
            && Objects.equals(this.abnormalTableOutConfig, qualityTaskRuleDetailForOpenApi.abnormalTableOutConfig)
            && Objects.equals(this.abnormalTableIncludeNullValue,
                qualityTaskRuleDetailForOpenApi.abnormalTableIncludeNullValue)
            && Objects.equals(this.abnormalTableOutDataNumber,
                qualityTaskRuleDetailForOpenApi.abnormalTableOutDataNumber)
            && Objects.equals(this.scoreSwitch, qualityTaskRuleDetailForOpenApi.scoreSwitch)
            && Objects.equals(this.scoreSchema, qualityTaskRuleDetailForOpenApi.scoreSchema)
            && Objects.equals(this.scoreTable, qualityTaskRuleDetailForOpenApi.scoreTable)
            && Objects.equals(this.scoreExpression, qualityTaskRuleDetailForOpenApi.scoreExpression);
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
            ignoreError,
            dimension,
            queue,
            regularExpression,
            templateArguments,
            weight,
            calculationRange,
            calculationRangeSql,
            alarmCondition,
            exportAbnormalTable,
            abnormalTableDatabase,
            abnormalTableSchema,
            abnormalTable,
            abnormalTablePrefix,
            abnormalTableSuffix,
            abnormalTableColumns,
            abnormalTableSql,
            abnormalTableOutConfig,
            abnormalTableIncludeNullValue,
            abnormalTableOutDataNumber,
            scoreSwitch,
            scoreSchema,
            scoreTable,
            scoreExpression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityTaskRuleDetailForOpenApi {\n");
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
        sb.append("    ignoreError: ").append(toIndentedString(ignoreError)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    regularExpression: ").append(toIndentedString(regularExpression)).append("\n");
        sb.append("    templateArguments: ").append(toIndentedString(templateArguments)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    calculationRange: ").append(toIndentedString(calculationRange)).append("\n");
        sb.append("    calculationRangeSql: ").append(toIndentedString(calculationRangeSql)).append("\n");
        sb.append("    alarmCondition: ").append(toIndentedString(alarmCondition)).append("\n");
        sb.append("    exportAbnormalTable: ").append(toIndentedString(exportAbnormalTable)).append("\n");
        sb.append("    abnormalTableDatabase: ").append(toIndentedString(abnormalTableDatabase)).append("\n");
        sb.append("    abnormalTableSchema: ").append(toIndentedString(abnormalTableSchema)).append("\n");
        sb.append("    abnormalTable: ").append(toIndentedString(abnormalTable)).append("\n");
        sb.append("    abnormalTablePrefix: ").append(toIndentedString(abnormalTablePrefix)).append("\n");
        sb.append("    abnormalTableSuffix: ").append(toIndentedString(abnormalTableSuffix)).append("\n");
        sb.append("    abnormalTableColumns: ").append(toIndentedString(abnormalTableColumns)).append("\n");
        sb.append("    abnormalTableSql: ").append(toIndentedString(abnormalTableSql)).append("\n");
        sb.append("    abnormalTableOutConfig: ").append(toIndentedString(abnormalTableOutConfig)).append("\n");
        sb.append("    abnormalTableIncludeNullValue: ")
            .append(toIndentedString(abnormalTableIncludeNullValue))
            .append("\n");
        sb.append("    abnormalTableOutDataNumber: ").append(toIndentedString(abnormalTableOutDataNumber)).append("\n");
        sb.append("    scoreSwitch: ").append(toIndentedString(scoreSwitch)).append("\n");
        sb.append("    scoreSchema: ").append(toIndentedString(scoreSchema)).append("\n");
        sb.append("    scoreTable: ").append(toIndentedString(scoreTable)).append("\n");
        sb.append("    scoreExpression: ").append(toIndentedString(scoreExpression)).append("\n");
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
