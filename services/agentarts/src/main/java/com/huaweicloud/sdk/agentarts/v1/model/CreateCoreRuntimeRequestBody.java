package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * **参数解释**: 运行时创建请求Body体。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
 */
public class CreateCoreRuntimeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "identity_configuration")

    private CoreRunIdentityCreateReqBody identityConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_agency_name")

    private String executionAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_config")

    private CoreRunOutboundNetwork networkConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_gateway_id")

    private UUID agentGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoke_config")

    private CoreRunInvokeConfig invokeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observability")

    private CoreRunObservability observability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_config")

    private CoreRunStorageConfig storageConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreRunTagItem> tags = null;

    /**
     * **参数解释**：  Agent运行时架构，用于标明运行时需要运行在arm或者x86平台架构。 **约束限制**: 无 **取值范围**： 只允许填写arm64或者x86_64。 **默认取值**: arm64。
     */
    public static final class ArchEnum {

        /**
         * Enum ARM64 for value: "arm64"
         */
        public static final ArchEnum ARM64 = new ArchEnum("arm64");

        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final ArchEnum X86_64 = new ArchEnum("x86_64");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("arm64", ARM64);
            map.put("x86_64", X86_64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchEnum(value));
        }

        public static ArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private ArchEnum arch;

    public CreateCoreRuntimeRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  Agent运行时名称，用于在租户内部唯一标识一个Agent运行时。 **约束限制**: 同一账号下名称不可重复。 **取值范围**： 以小写字母开头，以小写字母或数字结尾，可以包含小写字母、数字和中划线，长度为2-48个字符。 **默认取值**: 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCoreRuntimeRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：  描述信息，用于对Agent运行时的内容和用途进行简要说明。 **约束限制**: 不涉及。 **取值范围**： 长度为 0 - 4096 个字符。 **默认取值**: 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCoreRuntimeRequestBody withArtifactSource(CoreRunArtifactSource artifactSource) {
        this.artifactSource = artifactSource;
        return this;
    }

    public CreateCoreRuntimeRequestBody withArtifactSource(Consumer<CoreRunArtifactSource> artifactSourceSetter) {
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

    public CreateCoreRuntimeRequestBody withEnvironmentVariables(
        List<CoreRunEnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    public CreateCoreRuntimeRequestBody addEnvironmentVariablesItem(
        CoreRunEnvironmentVariable environmentVariablesItem) {
        if (this.environmentVariables == null) {
            this.environmentVariables = new ArrayList<>();
        }
        this.environmentVariables.add(environmentVariablesItem);
        return this;
    }

    public CreateCoreRuntimeRequestBody withEnvironmentVariables(
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

    public CreateCoreRuntimeRequestBody withIdentityConfiguration(CoreRunIdentityCreateReqBody identityConfiguration) {
        this.identityConfiguration = identityConfiguration;
        return this;
    }

    public CreateCoreRuntimeRequestBody withIdentityConfiguration(
        Consumer<CoreRunIdentityCreateReqBody> identityConfigurationSetter) {
        if (this.identityConfiguration == null) {
            this.identityConfiguration = new CoreRunIdentityCreateReqBody();
            identityConfigurationSetter.accept(this.identityConfiguration);
        }

        return this;
    }

    /**
     * Get identityConfiguration
     * @return identityConfiguration
     */
    public CoreRunIdentityCreateReqBody getIdentityConfiguration() {
        return identityConfiguration;
    }

    public void setIdentityConfiguration(CoreRunIdentityCreateReqBody identityConfiguration) {
        this.identityConfiguration = identityConfiguration;
    }

    public CreateCoreRuntimeRequestBody withExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
        return this;
    }

    /**
     * **参数解释**：  运行时委托名称。 **约束限制**: 必须是一个存在的信任委托名称，且该委托授权对象为安全沙箱元数据。 **取值范围**： 长度为 1 - 64 个字符。 **默认取值**: 不涉及。
     * @return executionAgencyName
     */
    public String getExecutionAgencyName() {
        return executionAgencyName;
    }

    public void setExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
    }

    public CreateCoreRuntimeRequestBody withNetworkConfig(CoreRunOutboundNetwork networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }

    public CreateCoreRuntimeRequestBody withNetworkConfig(Consumer<CoreRunOutboundNetwork> networkConfigSetter) {
        if (this.networkConfig == null) {
            this.networkConfig = new CoreRunOutboundNetwork();
            networkConfigSetter.accept(this.networkConfig);
        }

        return this;
    }

    /**
     * Get networkConfig
     * @return networkConfig
     */
    public CoreRunOutboundNetwork getNetworkConfig() {
        return networkConfig;
    }

    public void setNetworkConfig(CoreRunOutboundNetwork networkConfig) {
        this.networkConfig = networkConfig;
    }

    public CreateCoreRuntimeRequestBody withAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
        return this;
    }

    /**
     * **参数解释**：  Agent网关的唯一ID，用户可以通过AgentGateway的查询网关实例列表接口来查询到对应的网关ID。 **约束限制**: 不涉及。 **取值范围**： 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **默认取值**: 不涉及。
     * @return agentGatewayId
     */
    public UUID getAgentGatewayId() {
        return agentGatewayId;
    }

    public void setAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
    }

    public CreateCoreRuntimeRequestBody withInvokeConfig(CoreRunInvokeConfig invokeConfig) {
        this.invokeConfig = invokeConfig;
        return this;
    }

    public CreateCoreRuntimeRequestBody withInvokeConfig(Consumer<CoreRunInvokeConfig> invokeConfigSetter) {
        if (this.invokeConfig == null) {
            this.invokeConfig = new CoreRunInvokeConfig();
            invokeConfigSetter.accept(this.invokeConfig);
        }

        return this;
    }

    /**
     * **参数解释**: 智能体调用相关配置。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return invokeConfig
     */
    public CoreRunInvokeConfig getInvokeConfig() {
        return invokeConfig;
    }

    public void setInvokeConfig(CoreRunInvokeConfig invokeConfig) {
        this.invokeConfig = invokeConfig;
    }

    public CreateCoreRuntimeRequestBody withObservability(CoreRunObservability observability) {
        this.observability = observability;
        return this;
    }

    public CreateCoreRuntimeRequestBody withObservability(Consumer<CoreRunObservability> observabilitySetter) {
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

    public CreateCoreRuntimeRequestBody withStorageConfig(CoreRunStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }

    public CreateCoreRuntimeRequestBody withStorageConfig(Consumer<CoreRunStorageConfig> storageConfigSetter) {
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

    public CreateCoreRuntimeRequestBody withTags(List<CoreRunTagItem> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCoreRuntimeRequestBody addTagsItem(CoreRunTagItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCoreRuntimeRequestBody withTags(Consumer<List<CoreRunTagItem>> tagsSetter) {
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

    public CreateCoreRuntimeRequestBody withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**：  Agent运行时架构，用于标明运行时需要运行在arm或者x86平台架构。 **约束限制**: 无 **取值范围**： 只允许填写arm64或者x86_64。 **默认取值**: arm64。
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCoreRuntimeRequestBody that = (CreateCoreRuntimeRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.artifactSource, that.artifactSource)
            && Objects.equals(this.environmentVariables, that.environmentVariables)
            && Objects.equals(this.identityConfiguration, that.identityConfiguration)
            && Objects.equals(this.executionAgencyName, that.executionAgencyName)
            && Objects.equals(this.networkConfig, that.networkConfig)
            && Objects.equals(this.agentGatewayId, that.agentGatewayId)
            && Objects.equals(this.invokeConfig, that.invokeConfig)
            && Objects.equals(this.observability, that.observability)
            && Objects.equals(this.storageConfig, that.storageConfig) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.arch, that.arch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            artifactSource,
            environmentVariables,
            identityConfiguration,
            executionAgencyName,
            networkConfig,
            agentGatewayId,
            invokeConfig,
            observability,
            storageConfig,
            tags,
            arch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreRuntimeRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    artifactSource: ").append(toIndentedString(artifactSource)).append("\n");
        sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
        sb.append("    identityConfiguration: ").append(toIndentedString(identityConfiguration)).append("\n");
        sb.append("    executionAgencyName: ").append(toIndentedString(executionAgencyName)).append("\n");
        sb.append("    networkConfig: ").append(toIndentedString(networkConfig)).append("\n");
        sb.append("    agentGatewayId: ").append(toIndentedString(agentGatewayId)).append("\n");
        sb.append("    invokeConfig: ").append(toIndentedString(invokeConfig)).append("\n");
        sb.append("    observability: ").append(toIndentedString(observability)).append("\n");
        sb.append("    storageConfig: ").append(toIndentedString(storageConfig)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
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
