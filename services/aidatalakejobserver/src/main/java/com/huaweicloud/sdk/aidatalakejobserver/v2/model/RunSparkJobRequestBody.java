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
 * 启动Spark作业的请求参数， job_config：作业配置参数，根据作业类型自动选择对应的参数结构（SparkJarParameter、SparkPyParameter或SparkSqlScriptParameter）。 resource_config：Spark作业的资源配置。 image：Spark镜像配置信息。 restore_strategy：Spark作业的运行及恢复策略。 logging_config：Spark作业日志配置。
 */
public class RunSparkJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private Object jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_agency")

    private String jobAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_config")

    private SparkResourceConfig resourceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_config")

    private Map<String, String> sparkConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private SparkJobImageConfig image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging_config")

    private SparkLoggingConfig loggingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_strategy")

    private SparkRestoreStrategy restoreStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<SparkJobLabel> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public RunSparkJobRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：Spark作业名称，用于标识作业。 **约束限制**：不涉及。 **取值范围**：长度为1~128个字符。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunSparkJobRequestBody withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：端点名称，用于指定Spark作业执行环境。 **约束限制**：不涉及。 **取值范围**：只能由英文小写字母、数字及中划线组成，以英文小写字母开头，以英文小写字母或数字结尾，且长度为1~63个字符。 **默认取值**：不涉及。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public RunSparkJobRequestBody withJobConfig(Object jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public RunSparkJobRequestBody withJobConfig(Consumer<Object> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new Object();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * **参数解释**：作业配置参数，用于指定Spark作业的类型和执行参数。根据作业类型自动选择对应的参数结构：spark_jar_job对应SparkJarParameter，spark_python_job对应SparkPyParameter，spark_sql_scripting_job对应SparkSqlScriptParameter。 **约束限制**：不涉及。
     * @return jobConfig
     */
    public Object getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(Object jobConfig) {
        this.jobConfig = jobConfig;
    }

    public RunSparkJobRequestBody withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * **参数解释**：Catalog名称，用于指定作业使用的数据目录。 **约束限制**：不涉及。 **取值范围**：长度不超过128个字符。 **默认取值**：不涉及。
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public RunSparkJobRequestBody withJobAgency(String jobAgency) {
        this.jobAgency = jobAgency;
        return this;
    }

    /**
     * **参数解释**：自定义委托名称，用于作业操作OBS对象、转储日志、访问DLI元数据等。 **约束限制**：不涉及。 **取值范围**：长度为1~64个字符。 **默认取值**：不涉及。
     * @return jobAgency
     */
    public String getJobAgency() {
        return jobAgency;
    }

    public void setJobAgency(String jobAgency) {
        this.jobAgency = jobAgency;
    }

    public RunSparkJobRequestBody withResourceConfig(SparkResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    public RunSparkJobRequestBody withResourceConfig(Consumer<SparkResourceConfig> resourceConfigSetter) {
        if (this.resourceConfig == null) {
            this.resourceConfig = new SparkResourceConfig();
            resourceConfigSetter.accept(this.resourceConfig);
        }

        return this;
    }

    /**
     * Get resourceConfig
     * @return resourceConfig
     */
    public SparkResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    public void setResourceConfig(SparkResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    public RunSparkJobRequestBody withSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
        return this;
    }

    public RunSparkJobRequestBody putSparkConfigItem(String key, String sparkConfigItem) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        this.sparkConfig.put(key, sparkConfigItem);
        return this;
    }

    public RunSparkJobRequestBody withSparkConfig(Consumer<Map<String, String>> sparkConfigSetter) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        sparkConfigSetter.accept(this.sparkConfig);
        return this;
    }

    /**
     * **参数解释**：用户自定义Spark参数配置，用于优化Spark作业性能。 **约束限制**：最多支持100个参数。
     * @return sparkConfig
     */
    public Map<String, String> getSparkConfig() {
        return sparkConfig;
    }

    public void setSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
    }

    public RunSparkJobRequestBody withImage(SparkJobImageConfig image) {
        this.image = image;
        return this;
    }

    public RunSparkJobRequestBody withImage(Consumer<SparkJobImageConfig> imageSetter) {
        if (this.image == null) {
            this.image = new SparkJobImageConfig();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public SparkJobImageConfig getImage() {
        return image;
    }

    public void setImage(SparkJobImageConfig image) {
        this.image = image;
    }

    public RunSparkJobRequestBody withLoggingConfig(SparkLoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
        return this;
    }

    public RunSparkJobRequestBody withLoggingConfig(Consumer<SparkLoggingConfig> loggingConfigSetter) {
        if (this.loggingConfig == null) {
            this.loggingConfig = new SparkLoggingConfig();
            loggingConfigSetter.accept(this.loggingConfig);
        }

        return this;
    }

    /**
     * Get loggingConfig
     * @return loggingConfig
     */
    public SparkLoggingConfig getLoggingConfig() {
        return loggingConfig;
    }

    public void setLoggingConfig(SparkLoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    public RunSparkJobRequestBody withRestoreStrategy(SparkRestoreStrategy restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
        return this;
    }

    public RunSparkJobRequestBody withRestoreStrategy(Consumer<SparkRestoreStrategy> restoreStrategySetter) {
        if (this.restoreStrategy == null) {
            this.restoreStrategy = new SparkRestoreStrategy();
            restoreStrategySetter.accept(this.restoreStrategy);
        }

        return this;
    }

    /**
     * Get restoreStrategy
     * @return restoreStrategy
     */
    public SparkRestoreStrategy getRestoreStrategy() {
        return restoreStrategy;
    }

    public void setRestoreStrategy(SparkRestoreStrategy restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
    }

    public RunSparkJobRequestBody withLabels(List<SparkJobLabel> labels) {
        this.labels = labels;
        return this;
    }

    public RunSparkJobRequestBody addLabelsItem(SparkJobLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public RunSparkJobRequestBody withLabels(Consumer<List<SparkJobLabel>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**：作业标签列表，用于标识和分类作业。 **约束限制**：标签数量不能超过16条。
     * @return labels
     */
    public List<SparkJobLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<SparkJobLabel> labels) {
        this.labels = labels;
    }

    public RunSparkJobRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：Spark作业描述信息，用于说明作业用途。 **约束限制**：不涉及。 **取值范围**：长度为1~512个字符。 **默认取值**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunSparkJobRequestBody that = (RunSparkJobRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.jobConfig, that.jobConfig) && Objects.equals(this.catalogName, that.catalogName)
            && Objects.equals(this.jobAgency, that.jobAgency)
            && Objects.equals(this.resourceConfig, that.resourceConfig)
            && Objects.equals(this.sparkConfig, that.sparkConfig) && Objects.equals(this.image, that.image)
            && Objects.equals(this.loggingConfig, that.loggingConfig)
            && Objects.equals(this.restoreStrategy, that.restoreStrategy) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            endpointName,
            jobConfig,
            catalogName,
            jobAgency,
            resourceConfig,
            sparkConfig,
            image,
            loggingConfig,
            restoreStrategy,
            labels,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSparkJobRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    jobAgency: ").append(toIndentedString(jobAgency)).append("\n");
        sb.append("    resourceConfig: ").append(toIndentedString(resourceConfig)).append("\n");
        sb.append("    sparkConfig: ").append(toIndentedString(sparkConfig)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    loggingConfig: ").append(toIndentedString(loggingConfig)).append("\n");
        sb.append("    restoreStrategy: ").append(toIndentedString(restoreStrategy)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
