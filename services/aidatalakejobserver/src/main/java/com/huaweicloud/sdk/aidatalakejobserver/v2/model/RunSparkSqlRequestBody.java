package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行SparkSql作业的请求参数。
 */
public class RunSparkSqlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_context")

    private SparkSqlCatalogContext catalogContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<SparkSqlParameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_config")

    private Map<String, String> sparkConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private SparkSqlTimeout timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<SparkSqlLabel> labels = null;

    public RunSparkSqlRequestBody withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：端点名称，用于指定SparkSql作业运行的计算引擎。可在控制台的端点管理页面查看，或通过查询端点列表接口获取。 **约束限制**：不涉及。 **取值范围**：只能以英文小写字母开头，由英文小写字母、数字及中划线组成，以英文小写字母或数字结尾，且长度为1~63个字符。 **默认取值**：不涉及。 
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public RunSparkSqlRequestBody withCatalogContext(SparkSqlCatalogContext catalogContext) {
        this.catalogContext = catalogContext;
        return this;
    }

    public RunSparkSqlRequestBody withCatalogContext(Consumer<SparkSqlCatalogContext> catalogContextSetter) {
        if (this.catalogContext == null) {
            this.catalogContext = new SparkSqlCatalogContext();
            catalogContextSetter.accept(this.catalogContext);
        }

        return this;
    }

    /**
     * Get catalogContext
     * @return catalogContext
     */
    public SparkSqlCatalogContext getCatalogContext() {
        return catalogContext;
    }

    public void setCatalogContext(SparkSqlCatalogContext catalogContext) {
        this.catalogContext = catalogContext;
    }

    public RunSparkSqlRequestBody withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * **参数解释**：用户SQL语句，用于执行SparkSql作业。支持DDL、DCL、DQL、DML等多种SQL类型。 **约束限制**：不涉及。 **取值范围**：不超过500000个字符。 **默认取值**：不涉及。 
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public RunSparkSqlRequestBody withParameters(List<SparkSqlParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public RunSparkSqlRequestBody addParametersItem(SparkSqlParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public RunSparkSqlRequestBody withParameters(Consumer<List<SparkSqlParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * **参数解释**：用户SQL语句中的占位符参数列表，用于SQL参数化执行。数组中的每个元素为SparkSqlParameter对象，包含占位符的键、值和类型信息。 **约束限制**：占位符参数数量不能超过16条。 
     * @return parameters
     */
    public List<SparkSqlParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<SparkSqlParameter> parameters) {
        this.parameters = parameters;
    }

    public RunSparkSqlRequestBody withSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
        return this;
    }

    public RunSparkSqlRequestBody putSparkConfigItem(String key, String sparkConfigItem) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        this.sparkConfig.put(key, sparkConfigItem);
        return this;
    }

    public RunSparkSqlRequestBody withSparkConfig(Consumer<Map<String, String>> sparkConfigSetter) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        sparkConfigSetter.accept(this.sparkConfig);
        return this;
    }

    /**
     * **参数解释**：用户自定义Spark参数配置，用于优化作业性能。格式为key/value键值对，Key为参数名称，Value为参数值。例如：spark.executor.memory=4g。 **约束限制**：参数配置项数量不能超过100条，每个参数值的长度不超过1024个字符。 
     * @return sparkConfig
     */
    public Map<String, String> getSparkConfig() {
        return sparkConfig;
    }

    public void setSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
    }

    public RunSparkSqlRequestBody withTimeout(SparkSqlTimeout timeout) {
        this.timeout = timeout;
        return this;
    }

    public RunSparkSqlRequestBody withTimeout(Consumer<SparkSqlTimeout> timeoutSetter) {
        if (this.timeout == null) {
            this.timeout = new SparkSqlTimeout();
            timeoutSetter.accept(this.timeout);
        }

        return this;
    }

    /**
     * Get timeout
     * @return timeout
     */
    public SparkSqlTimeout getTimeout() {
        return timeout;
    }

    public void setTimeout(SparkSqlTimeout timeout) {
        this.timeout = timeout;
    }

    public RunSparkSqlRequestBody withLabels(List<SparkSqlLabel> labels) {
        this.labels = labels;
        return this;
    }

    public RunSparkSqlRequestBody addLabelsItem(SparkSqlLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public RunSparkSqlRequestBody withLabels(Consumer<List<SparkSqlLabel>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**：作业标签列表，用于标识和分类作业。数组中的每个元素为SparkSqlLabel对象，包含标签的键和值。 **约束限制**：标签数量不能超过16条。 
     * @return labels
     */
    public List<SparkSqlLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<SparkSqlLabel> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunSparkSqlRequestBody that = (RunSparkSqlRequestBody) obj;
        return Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.catalogContext, that.catalogContext)
            && Objects.equals(this.statement, that.statement) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.sparkConfig, that.sparkConfig) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointName, catalogContext, statement, parameters, sparkConfig, timeout, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSparkSqlRequestBody {\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    catalogContext: ").append(toIndentedString(catalogContext)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    sparkConfig: ").append(toIndentedString(sparkConfig)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
