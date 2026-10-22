package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：创建端点请求。 **约束限制**：name、compute_id、engine、capacity为必填字段，必须在计算资源下创建。 
 */
public class CreateV2EndpointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_id")

    private String computeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private V2EndpointCreateEngineConfig engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private List<V2EndpointCapacityItem> capacity = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prometheus_config")

    private PrometheusConfig prometheusConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_config")

    private LtsConfig ltsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential")

    private CredentialConfig credential;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceType resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<V2ResourceTag> tags = null;

    public CreateV2EndpointRequestBody withComputeId(String computeId) {
        this.computeId = computeId;
        return this;
    }

    /**
     * **参数解释**：计算资源ID。可通过[查询计算资源列表](ListV2Computes.xml)获取计算资源ID。 **约束限制**：预留模式和混合模式端点必填。 **取值范围**：长度为1~36个英文字母、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return computeId
     */
    public String getComputeId() {
        return computeId;
    }

    public void setComputeId(String computeId) {
        this.computeId = computeId;
    }

    public CreateV2EndpointRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：端点名称。 **取值范围**：支持小写字母、数字、中划线，必须字母开头、字母或数字结尾，长度为1~63个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateV2EndpointRequestBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**：端点显示名称。 **取值范围**：长度为1~63个字符，支持字母、数字、中划线、汉字。 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateV2EndpointRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：资源描述信息。 **取值范围**：不允许输入感叹号、小于号、大于号、等号、与号、双引号、单引号、艾特符、井号、百分号、分号、左括号、右括号、竖线、星号、反斜杠。长度为0~512个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateV2EndpointRequestBody withEngine(V2EndpointCreateEngineConfig engine) {
        this.engine = engine;
        return this;
    }

    public CreateV2EndpointRequestBody withEngine(Consumer<V2EndpointCreateEngineConfig> engineSetter) {
        if (this.engine == null) {
            this.engine = new V2EndpointCreateEngineConfig();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public V2EndpointCreateEngineConfig getEngine() {
        return engine;
    }

    public void setEngine(V2EndpointCreateEngineConfig engine) {
        this.engine = engine;
    }

    public CreateV2EndpointRequestBody withCapacity(List<V2EndpointCapacityItem> capacity) {
        this.capacity = capacity;
        return this;
    }

    public CreateV2EndpointRequestBody addCapacityItem(V2EndpointCapacityItem capacityItem) {
        if (this.capacity == null) {
            this.capacity = new ArrayList<>();
        }
        this.capacity.add(capacityItem);
        return this;
    }

    public CreateV2EndpointRequestBody withCapacity(Consumer<List<V2EndpointCapacityItem>> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new ArrayList<>();
        }
        capacitySetter.accept(this.capacity);
        return this;
    }

    /**
     * **参数解释**：计算资源容量配置。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return capacity
     */
    public List<V2EndpointCapacityItem> getCapacity() {
        return capacity;
    }

    public void setCapacity(List<V2EndpointCapacityItem> capacity) {
        this.capacity = capacity;
    }

    public CreateV2EndpointRequestBody withPrometheusConfig(PrometheusConfig prometheusConfig) {
        this.prometheusConfig = prometheusConfig;
        return this;
    }

    public CreateV2EndpointRequestBody withPrometheusConfig(Consumer<PrometheusConfig> prometheusConfigSetter) {
        if (this.prometheusConfig == null) {
            this.prometheusConfig = new PrometheusConfig();
            prometheusConfigSetter.accept(this.prometheusConfig);
        }

        return this;
    }

    /**
     * Get prometheusConfig
     * @return prometheusConfig
     */
    public PrometheusConfig getPrometheusConfig() {
        return prometheusConfig;
    }

    public void setPrometheusConfig(PrometheusConfig prometheusConfig) {
        this.prometheusConfig = prometheusConfig;
    }

    public CreateV2EndpointRequestBody withLtsConfig(LtsConfig ltsConfig) {
        this.ltsConfig = ltsConfig;
        return this;
    }

    public CreateV2EndpointRequestBody withLtsConfig(Consumer<LtsConfig> ltsConfigSetter) {
        if (this.ltsConfig == null) {
            this.ltsConfig = new LtsConfig();
            ltsConfigSetter.accept(this.ltsConfig);
        }

        return this;
    }

    /**
     * Get ltsConfig
     * @return ltsConfig
     */
    public LtsConfig getLtsConfig() {
        return ltsConfig;
    }

    public void setLtsConfig(LtsConfig ltsConfig) {
        this.ltsConfig = ltsConfig;
    }

    public CreateV2EndpointRequestBody withCredential(CredentialConfig credential) {
        this.credential = credential;
        return this;
    }

    public CreateV2EndpointRequestBody withCredential(Consumer<CredentialConfig> credentialSetter) {
        if (this.credential == null) {
            this.credential = new CredentialConfig();
            credentialSetter.accept(this.credential);
        }

        return this;
    }

    /**
     * Get credential
     * @return credential
     */
    public CredentialConfig getCredential() {
        return credential;
    }

    public void setCredential(CredentialConfig credential) {
        this.credential = credential;
    }

    public CreateV2EndpointRequestBody withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     * @return resourceType
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public CreateV2EndpointRequestBody withTags(List<V2ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateV2EndpointRequestBody addTagsItem(V2ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateV2EndpointRequestBody withTags(Consumer<List<V2ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：标签列表，每个元素为一个V2ResourceTag对象，包含key（标签键）和value（标签值）字段。 **约束限制**：最多20个标签。 
     * @return tags
     */
    public List<V2ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<V2ResourceTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateV2EndpointRequestBody that = (CreateV2EndpointRequestBody) obj;
        return Objects.equals(this.computeId, that.computeId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.engine, that.engine) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.prometheusConfig, that.prometheusConfig)
            && Objects.equals(this.ltsConfig, that.ltsConfig) && Objects.equals(this.credential, that.credential)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computeId,
            name,
            displayName,
            description,
            engine,
            capacity,
            prometheusConfig,
            ltsConfig,
            credential,
            resourceType,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateV2EndpointRequestBody {\n");
        sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    prometheusConfig: ").append(toIndentedString(prometheusConfig)).append("\n");
        sb.append("    ltsConfig: ").append(toIndentedString(ltsConfig)).append("\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
