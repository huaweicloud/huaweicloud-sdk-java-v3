package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：启动Flink作业的请求参数，包含作业名称、端点信息、作业配置、资源配置等信息。 **约束限制**：不涉及。
 */
public class RunFlinkJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private FlinkJobArtifact jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_agency")

    private String jobAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_config")

    private Map<String, String> flinkConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling_policy")

    private AutoscalingPolicy autoscalingPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_config")

    private FlinkJobImageConfig imageConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_config")

    private FlinkResourceConfig resourceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_mode")

    private FlinkJobExecutionMode executionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_strategy")

    private RestoreStrategy restoreStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging_config")

    private FlinkLoggingConfig loggingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<FlinkLabel> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public RunFlinkJobRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：作业名称，用于标识Flink作业。 **约束限制**：不涉及。 **取值范围**：长度为1~128个字符，以字母或数字开头和结尾，中间可包含字母、数字、下划线和中划线。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunFlinkJobRequestBody withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：作业运行的端点名称，用于指定作业执行环境。可通过[查询端点列表](ListV2Endpoints.xml)或[查询所有端点列表](ListV2AllEndpoints.xml)接口获取。 **约束限制**：不涉及。 **取值范围**：只能由英文小写字母、数字及中划线组成，以英文小写字母开头，以英文小写字母或数字结尾，且长度为1~63个字符。 **默认取值**：不涉及。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public RunFlinkJobRequestBody withJobConfig(FlinkJobArtifact jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public RunFlinkJobRequestBody withJobConfig(Consumer<FlinkJobArtifact> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new FlinkJobArtifact();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public FlinkJobArtifact getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(FlinkJobArtifact jobConfig) {
        this.jobConfig = jobConfig;
    }

    public RunFlinkJobRequestBody withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * **参数解释**：已部署作业ID，用于关联聚合Flink实例。 **约束限制**：不涉及。 **取值范围**：长度为1~64个字符，只能由英文字母、数字、下划线和中划线组成。 **默认取值**：不涉及。
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public RunFlinkJobRequestBody withJobAgency(String jobAgency) {
        this.jobAgency = jobAgency;
        return this;
    }

    /**
     * **参数解释**：用户自定义委托名称，用于授权作业访问OBS等外部资源。 **约束限制**：须为当前租户下已存在的委托，系统管理委托不可用于提交作业。 **取值范围**：长度为1~64个字符，字符组成不限制。 **默认取值**：不指定时默认使用端点作业委托。
     * @return jobAgency
     */
    public String getJobAgency() {
        return jobAgency;
    }

    public void setJobAgency(String jobAgency) {
        this.jobAgency = jobAgency;
    }

    public RunFlinkJobRequestBody withFlinkConfig(Map<String, String> flinkConfig) {
        this.flinkConfig = flinkConfig;
        return this;
    }

    public RunFlinkJobRequestBody putFlinkConfigItem(String key, String flinkConfigItem) {
        if (this.flinkConfig == null) {
            this.flinkConfig = new HashMap<>();
        }
        this.flinkConfig.put(key, flinkConfigItem);
        return this;
    }

    public RunFlinkJobRequestBody withFlinkConfig(Consumer<Map<String, String>> flinkConfigSetter) {
        if (this.flinkConfig == null) {
            this.flinkConfig = new HashMap<>();
        }
        flinkConfigSetter.accept(this.flinkConfig);
        return this;
    }

    /**
     * **参数解释**：用户自定义的Flink配置参数，为键值对形式。最多支持100个参数，每个值长度为1~1024个字符。不允许配置execution.checkpointing.dir、execution.checkpointing.savepoint-dir、high-availability.storageDir等系统保留参数，上述系统保留参数由平台根据端点配置自动填充并在查询响应中返回，无需用户配置。 **约束限制**：不涉及。
     * @return flinkConfig
     */
    public Map<String, String> getFlinkConfig() {
        return flinkConfig;
    }

    public void setFlinkConfig(Map<String, String> flinkConfig) {
        this.flinkConfig = flinkConfig;
    }

    public RunFlinkJobRequestBody withAutoscalingPolicy(AutoscalingPolicy autoscalingPolicy) {
        this.autoscalingPolicy = autoscalingPolicy;
        return this;
    }

    public RunFlinkJobRequestBody withAutoscalingPolicy(Consumer<AutoscalingPolicy> autoscalingPolicySetter) {
        if (this.autoscalingPolicy == null) {
            this.autoscalingPolicy = new AutoscalingPolicy();
            autoscalingPolicySetter.accept(this.autoscalingPolicy);
        }

        return this;
    }

    /**
     * Get autoscalingPolicy
     * @return autoscalingPolicy
     */
    public AutoscalingPolicy getAutoscalingPolicy() {
        return autoscalingPolicy;
    }

    public void setAutoscalingPolicy(AutoscalingPolicy autoscalingPolicy) {
        this.autoscalingPolicy = autoscalingPolicy;
    }

    public RunFlinkJobRequestBody withImageConfig(FlinkJobImageConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }

    public RunFlinkJobRequestBody withImageConfig(Consumer<FlinkJobImageConfig> imageConfigSetter) {
        if (this.imageConfig == null) {
            this.imageConfig = new FlinkJobImageConfig();
            imageConfigSetter.accept(this.imageConfig);
        }

        return this;
    }

    /**
     * Get imageConfig
     * @return imageConfig
     */
    public FlinkJobImageConfig getImageConfig() {
        return imageConfig;
    }

    public void setImageConfig(FlinkJobImageConfig imageConfig) {
        this.imageConfig = imageConfig;
    }

    public RunFlinkJobRequestBody withResourceConfig(FlinkResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    public RunFlinkJobRequestBody withResourceConfig(Consumer<FlinkResourceConfig> resourceConfigSetter) {
        if (this.resourceConfig == null) {
            this.resourceConfig = new FlinkResourceConfig();
            resourceConfigSetter.accept(this.resourceConfig);
        }

        return this;
    }

    /**
     * Get resourceConfig
     * @return resourceConfig
     */
    public FlinkResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    public void setResourceConfig(FlinkResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    public RunFlinkJobRequestBody withExecutionMode(FlinkJobExecutionMode executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * Get executionMode
     * @return executionMode
     */
    public FlinkJobExecutionMode getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(FlinkJobExecutionMode executionMode) {
        this.executionMode = executionMode;
    }

    public RunFlinkJobRequestBody withRestoreStrategy(RestoreStrategy restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
        return this;
    }

    public RunFlinkJobRequestBody withRestoreStrategy(Consumer<RestoreStrategy> restoreStrategySetter) {
        if (this.restoreStrategy == null) {
            this.restoreStrategy = new RestoreStrategy();
            restoreStrategySetter.accept(this.restoreStrategy);
        }

        return this;
    }

    /**
     * Get restoreStrategy
     * @return restoreStrategy
     */
    public RestoreStrategy getRestoreStrategy() {
        return restoreStrategy;
    }

    public void setRestoreStrategy(RestoreStrategy restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
    }

    public RunFlinkJobRequestBody withLoggingConfig(FlinkLoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
        return this;
    }

    public RunFlinkJobRequestBody withLoggingConfig(Consumer<FlinkLoggingConfig> loggingConfigSetter) {
        if (this.loggingConfig == null) {
            this.loggingConfig = new FlinkLoggingConfig();
            loggingConfigSetter.accept(this.loggingConfig);
        }

        return this;
    }

    /**
     * Get loggingConfig
     * @return loggingConfig
     */
    public FlinkLoggingConfig getLoggingConfig() {
        return loggingConfig;
    }

    public void setLoggingConfig(FlinkLoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    public RunFlinkJobRequestBody withLabels(List<FlinkLabel> labels) {
        this.labels = labels;
        return this;
    }

    public RunFlinkJobRequestBody addLabelsItem(FlinkLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public RunFlinkJobRequestBody withLabels(Consumer<List<FlinkLabel>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**：标签，用于作业分类和筛选。 **约束限制**：标签数量不能超过16条。
     * @return labels
     */
    public List<FlinkLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<FlinkLabel> labels) {
        this.labels = labels;
    }

    public RunFlinkJobRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：描述信息，用于说明作业用途。 **约束限制**：不涉及。 **取值范围**：长度为1~512个字符。 **默认取值**：不涉及。
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
        RunFlinkJobRequestBody that = (RunFlinkJobRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.jobConfig, that.jobConfig) && Objects.equals(this.deploymentId, that.deploymentId)
            && Objects.equals(this.jobAgency, that.jobAgency) && Objects.equals(this.flinkConfig, that.flinkConfig)
            && Objects.equals(this.autoscalingPolicy, that.autoscalingPolicy)
            && Objects.equals(this.imageConfig, that.imageConfig)
            && Objects.equals(this.resourceConfig, that.resourceConfig)
            && Objects.equals(this.executionMode, that.executionMode)
            && Objects.equals(this.restoreStrategy, that.restoreStrategy)
            && Objects.equals(this.loggingConfig, that.loggingConfig) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            endpointName,
            jobConfig,
            deploymentId,
            jobAgency,
            flinkConfig,
            autoscalingPolicy,
            imageConfig,
            resourceConfig,
            executionMode,
            restoreStrategy,
            loggingConfig,
            labels,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunFlinkJobRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    jobAgency: ").append(toIndentedString(jobAgency)).append("\n");
        sb.append("    flinkConfig: ").append(toIndentedString(flinkConfig)).append("\n");
        sb.append("    autoscalingPolicy: ").append(toIndentedString(autoscalingPolicy)).append("\n");
        sb.append("    imageConfig: ").append(toIndentedString(imageConfig)).append("\n");
        sb.append("    resourceConfig: ").append(toIndentedString(resourceConfig)).append("\n");
        sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
        sb.append("    restoreStrategy: ").append(toIndentedString(restoreStrategy)).append("\n");
        sb.append("    loggingConfig: ").append(toIndentedString(loggingConfig)).append("\n");
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
