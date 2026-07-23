package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: AgentRuntime版本数据结构。 **取值范围**: 不涉及。 
 */
public class CoreRunRuntimeVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_source")

    private CoreRunArtifactSourceResp artifactSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_config")

    private CoreRunOutboundNetworkResp networkConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_variables")

    private List<CoreRunEnvironmentVariableResp> environmentVariables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoke_config")

    private CoreRunInvokeConfigResp invokeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observability")

    private CoreRunObservabilityResp observability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_config")

    private CoreRunStorageConfig storageConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_config")

    private CoreHealthCheckConfig healthConfig;

    public CoreRunRuntimeVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 版本名称，默认为v1、v2自增长，用户也可自定义。 **取值范围**: 以小写字母或数字开头，以小写字母或数字结尾，可以包含小写字母、数字和中划线，长度为2-24个字符。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CoreRunRuntimeVersion withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 版本描述（创建/更新版本时可选）。 **取值范围**: 长度为 0 - 4096 个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CoreRunRuntimeVersion withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**: 创建时间（系统自动生成，UTC时区）。 **取值范围**: 不涉及。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CoreRunRuntimeVersion withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**: 最近更新时间（系统自动生成，版本更新/标签修改时刷新）。 **取值范围**: 不涉及。 
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CoreRunRuntimeVersion withArtifactSource(CoreRunArtifactSourceResp artifactSource) {
        this.artifactSource = artifactSource;
        return this;
    }

    public CoreRunRuntimeVersion withArtifactSource(Consumer<CoreRunArtifactSourceResp> artifactSourceSetter) {
        if (this.artifactSource == null) {
            this.artifactSource = new CoreRunArtifactSourceResp();
            artifactSourceSetter.accept(this.artifactSource);
        }

        return this;
    }

    /**
     * Get artifactSource
     * @return artifactSource
     */
    public CoreRunArtifactSourceResp getArtifactSource() {
        return artifactSource;
    }

    public void setArtifactSource(CoreRunArtifactSourceResp artifactSource) {
        this.artifactSource = artifactSource;
    }

    public CoreRunRuntimeVersion withNetworkConfig(CoreRunOutboundNetworkResp networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }

    public CoreRunRuntimeVersion withNetworkConfig(Consumer<CoreRunOutboundNetworkResp> networkConfigSetter) {
        if (this.networkConfig == null) {
            this.networkConfig = new CoreRunOutboundNetworkResp();
            networkConfigSetter.accept(this.networkConfig);
        }

        return this;
    }

    /**
     * Get networkConfig
     * @return networkConfig
     */
    public CoreRunOutboundNetworkResp getNetworkConfig() {
        return networkConfig;
    }

    public void setNetworkConfig(CoreRunOutboundNetworkResp networkConfig) {
        this.networkConfig = networkConfig;
    }

    public CoreRunRuntimeVersion withEnvironmentVariables(List<CoreRunEnvironmentVariableResp> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    public CoreRunRuntimeVersion addEnvironmentVariablesItem(CoreRunEnvironmentVariableResp environmentVariablesItem) {
        if (this.environmentVariables == null) {
            this.environmentVariables = new ArrayList<>();
        }
        this.environmentVariables.add(environmentVariablesItem);
        return this;
    }

    public CoreRunRuntimeVersion withEnvironmentVariables(
        Consumer<List<CoreRunEnvironmentVariableResp>> environmentVariablesSetter) {
        if (this.environmentVariables == null) {
            this.environmentVariables = new ArrayList<>();
        }
        environmentVariablesSetter.accept(this.environmentVariables);
        return this;
    }

    /**
     * **参数解释**: 环境变量配置列表，用于配置运行时环境变量。 **取值范围**: 支持0 - 1024个元素。 
     * @return environmentVariables
     */
    public List<CoreRunEnvironmentVariableResp> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(List<CoreRunEnvironmentVariableResp> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public CoreRunRuntimeVersion withInvokeConfig(CoreRunInvokeConfigResp invokeConfig) {
        this.invokeConfig = invokeConfig;
        return this;
    }

    public CoreRunRuntimeVersion withInvokeConfig(Consumer<CoreRunInvokeConfigResp> invokeConfigSetter) {
        if (this.invokeConfig == null) {
            this.invokeConfig = new CoreRunInvokeConfigResp();
            invokeConfigSetter.accept(this.invokeConfig);
        }

        return this;
    }

    /**
     * Get invokeConfig
     * @return invokeConfig
     */
    public CoreRunInvokeConfigResp getInvokeConfig() {
        return invokeConfig;
    }

    public void setInvokeConfig(CoreRunInvokeConfigResp invokeConfig) {
        this.invokeConfig = invokeConfig;
    }

    public CoreRunRuntimeVersion withObservability(CoreRunObservabilityResp observability) {
        this.observability = observability;
        return this;
    }

    public CoreRunRuntimeVersion withObservability(Consumer<CoreRunObservabilityResp> observabilitySetter) {
        if (this.observability == null) {
            this.observability = new CoreRunObservabilityResp();
            observabilitySetter.accept(this.observability);
        }

        return this;
    }

    /**
     * Get observability
     * @return observability
     */
    public CoreRunObservabilityResp getObservability() {
        return observability;
    }

    public void setObservability(CoreRunObservabilityResp observability) {
        this.observability = observability;
    }

    public CoreRunRuntimeVersion withStorageConfig(CoreRunStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }

    public CoreRunRuntimeVersion withStorageConfig(Consumer<CoreRunStorageConfig> storageConfigSetter) {
        if (this.storageConfig == null) {
            this.storageConfig = new CoreRunStorageConfig();
            storageConfigSetter.accept(this.storageConfig);
        }

        return this;
    }

    /**
     * Get storageConfig
     * @return storageConfig
     */
    public CoreRunStorageConfig getStorageConfig() {
        return storageConfig;
    }

    public void setStorageConfig(CoreRunStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
    }

    public CoreRunRuntimeVersion withHealthConfig(CoreHealthCheckConfig healthConfig) {
        this.healthConfig = healthConfig;
        return this;
    }

    public CoreRunRuntimeVersion withHealthConfig(Consumer<CoreHealthCheckConfig> healthConfigSetter) {
        if (this.healthConfig == null) {
            this.healthConfig = new CoreHealthCheckConfig();
            healthConfigSetter.accept(this.healthConfig);
        }

        return this;
    }

    /**
     * Get healthConfig
     * @return healthConfig
     */
    public CoreHealthCheckConfig getHealthConfig() {
        return healthConfig;
    }

    public void setHealthConfig(CoreHealthCheckConfig healthConfig) {
        this.healthConfig = healthConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunRuntimeVersion that = (CoreRunRuntimeVersion) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.artifactSource, that.artifactSource)
            && Objects.equals(this.networkConfig, that.networkConfig)
            && Objects.equals(this.environmentVariables, that.environmentVariables)
            && Objects.equals(this.invokeConfig, that.invokeConfig)
            && Objects.equals(this.observability, that.observability)
            && Objects.equals(this.storageConfig, that.storageConfig)
            && Objects.equals(this.healthConfig, that.healthConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            description,
            createdAt,
            updatedAt,
            artifactSource,
            networkConfig,
            environmentVariables,
            invokeConfig,
            observability,
            storageConfig,
            healthConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunRuntimeVersion {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    artifactSource: ").append(toIndentedString(artifactSource)).append("\n");
        sb.append("    networkConfig: ").append(toIndentedString(networkConfig)).append("\n");
        sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
        sb.append("    invokeConfig: ").append(toIndentedString(invokeConfig)).append("\n");
        sb.append("    observability: ").append(toIndentedString(observability)).append("\n");
        sb.append("    storageConfig: ").append(toIndentedString(storageConfig)).append("\n");
        sb.append("    healthConfig: ").append(toIndentedString(healthConfig)).append("\n");
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
