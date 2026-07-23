package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 运行时更新请求Body体。 
 */
public class UpdateCoreRuntimeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_source")

    private CoreRunArtifactSource artifactSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_variables")

    private List<CoreRunEnvironmentVariable> environmentVariables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoke_config")

    private UpdateCoreRunInvokeConfig invokeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observability")

    private CoreRunObservability observability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_config")

    private CoreRunStorageConfig storageConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreRunTagItem> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_agency_name")

    private String executionAgencyName;

    public UpdateCoreRuntimeRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 版本名称。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateCoreRuntimeRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 版本描述信息。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCoreRuntimeRequestBody withArtifactSource(CoreRunArtifactSource artifactSource) {
        this.artifactSource = artifactSource;
        return this;
    }

    public UpdateCoreRuntimeRequestBody withArtifactSource(Consumer<CoreRunArtifactSource> artifactSourceSetter) {
        if (this.artifactSource == null) {
            this.artifactSource = new CoreRunArtifactSource();
            artifactSourceSetter.accept(this.artifactSource);
        }

        return this;
    }

    /**
     * Get artifactSource
     * @return artifactSource
     */
    public CoreRunArtifactSource getArtifactSource() {
        return artifactSource;
    }

    public void setArtifactSource(CoreRunArtifactSource artifactSource) {
        this.artifactSource = artifactSource;
    }

    public UpdateCoreRuntimeRequestBody withEnvironmentVariables(
        List<CoreRunEnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    public UpdateCoreRuntimeRequestBody addEnvironmentVariablesItem(
        CoreRunEnvironmentVariable environmentVariablesItem) {
        if (this.environmentVariables == null) {
            this.environmentVariables = new ArrayList<>();
        }
        this.environmentVariables.add(environmentVariablesItem);
        return this;
    }

    public UpdateCoreRuntimeRequestBody withEnvironmentVariables(
        Consumer<List<CoreRunEnvironmentVariable>> environmentVariablesSetter) {
        if (this.environmentVariables == null) {
            this.environmentVariables = new ArrayList<>();
        }
        environmentVariablesSetter.accept(this.environmentVariables);
        return this;
    }

    /**
     * **参数解释**: 环境变量配置列表，用于配置运行时环境变量。 **约束限制**: 总大小约束2MB。 **取值范围**: 支持0 - 1024个元素。 **默认取值**: 不涉及。 
     * @return environmentVariables
     */
    public List<CoreRunEnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(List<CoreRunEnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public UpdateCoreRuntimeRequestBody withInvokeConfig(UpdateCoreRunInvokeConfig invokeConfig) {
        this.invokeConfig = invokeConfig;
        return this;
    }

    public UpdateCoreRuntimeRequestBody withInvokeConfig(Consumer<UpdateCoreRunInvokeConfig> invokeConfigSetter) {
        if (this.invokeConfig == null) {
            this.invokeConfig = new UpdateCoreRunInvokeConfig();
            invokeConfigSetter.accept(this.invokeConfig);
        }

        return this;
    }

    /**
     * Get invokeConfig
     * @return invokeConfig
     */
    public UpdateCoreRunInvokeConfig getInvokeConfig() {
        return invokeConfig;
    }

    public void setInvokeConfig(UpdateCoreRunInvokeConfig invokeConfig) {
        this.invokeConfig = invokeConfig;
    }

    public UpdateCoreRuntimeRequestBody withObservability(CoreRunObservability observability) {
        this.observability = observability;
        return this;
    }

    public UpdateCoreRuntimeRequestBody withObservability(Consumer<CoreRunObservability> observabilitySetter) {
        if (this.observability == null) {
            this.observability = new CoreRunObservability();
            observabilitySetter.accept(this.observability);
        }

        return this;
    }

    /**
     * Get observability
     * @return observability
     */
    public CoreRunObservability getObservability() {
        return observability;
    }

    public void setObservability(CoreRunObservability observability) {
        this.observability = observability;
    }

    public UpdateCoreRuntimeRequestBody withStorageConfig(CoreRunStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }

    public UpdateCoreRuntimeRequestBody withStorageConfig(Consumer<CoreRunStorageConfig> storageConfigSetter) {
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

    public UpdateCoreRuntimeRequestBody withTags(List<CoreRunTagItem> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateCoreRuntimeRequestBody addTagsItem(CoreRunTagItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateCoreRuntimeRequestBody withTags(Consumer<List<CoreRunTagItem>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**: 标签配置列表。 
     * @return tags
     */
    public List<CoreRunTagItem> getTags() {
        return tags;
    }

    public void setTags(List<CoreRunTagItem> tags) {
        this.tags = tags;
    }

    public UpdateCoreRuntimeRequestBody withExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
        return this;
    }

    /**
     * **参数解释**： 运行时委托名称。 **取值范围**： 长度为 1 - 64 个字符。
     * @return executionAgencyName
     */
    public String getExecutionAgencyName() {
        return executionAgencyName;
    }

    public void setExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCoreRuntimeRequestBody that = (UpdateCoreRuntimeRequestBody) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.description, that.description)
            && Objects.equals(this.artifactSource, that.artifactSource)
            && Objects.equals(this.environmentVariables, that.environmentVariables)
            && Objects.equals(this.invokeConfig, that.invokeConfig)
            && Objects.equals(this.observability, that.observability)
            && Objects.equals(this.storageConfig, that.storageConfig) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.executionAgencyName, that.executionAgencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            description,
            artifactSource,
            environmentVariables,
            invokeConfig,
            observability,
            storageConfig,
            tags,
            executionAgencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreRuntimeRequestBody {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    artifactSource: ").append(toIndentedString(artifactSource)).append("\n");
        sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
        sb.append("    invokeConfig: ").append(toIndentedString(invokeConfig)).append("\n");
        sb.append("    observability: ").append(toIndentedString(observability)).append("\n");
        sb.append("    storageConfig: ").append(toIndentedString(storageConfig)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    executionAgencyName: ").append(toIndentedString(executionAgencyName)).append("\n");
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
