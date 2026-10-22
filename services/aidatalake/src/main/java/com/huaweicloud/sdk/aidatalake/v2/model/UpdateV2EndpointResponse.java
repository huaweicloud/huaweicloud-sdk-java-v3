package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateV2EndpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private Map<String, Object> engine = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private List<V2EndpointCapacityItem> capacity = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceType resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_id")

    private String computeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential")

    private CredentialConfig credential;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private Creator creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private Error error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prometheus_config")

    private PrometheusConfig prometheusConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_config")

    private LtsConfig ltsConfig;

    public UpdateV2EndpointResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：端点ID。 **取值范围**：长度为1~64个字符，支持大小写英文字母、数字、连字符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateV2EndpointResponse withName(String name) {
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

    public UpdateV2EndpointResponse withDisplayName(String displayName) {
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

    public UpdateV2EndpointResponse withDescription(String description) {
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

    public UpdateV2EndpointResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：Endpoint状态。 **取值范围**：   - CREATING：创建中。   - RUNNING：运行中。   - CREATE_FAILED：创建失败。   - DELETING：删除中。   - DELETED：已删除。   - UPDATING：更新中。   - UPDATE_FAILED：更新失败。   - DELETE_FAILED：删除失败。   - FROZEN：冻结。   - TRIAL_ENDED：试用结束。   - ON_DEMAND_FROZEN：按需冻结。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateV2EndpointResponse withEngine(Map<String, Object> engine) {
        this.engine = engine;
        return this;
    }

    public UpdateV2EndpointResponse putEngineItem(String key, Object engineItem) {
        if (this.engine == null) {
            this.engine = new HashMap<>();
        }
        this.engine.put(key, engineItem);
        return this;
    }

    public UpdateV2EndpointResponse withEngine(Consumer<Map<String, Object>> engineSetter) {
        if (this.engine == null) {
            this.engine = new HashMap<>();
        }
        engineSetter.accept(this.engine);
        return this;
    }

    /**
     * **参数解释**：引擎配置。 
     * @return engine
     */
    public Map<String, Object> getEngine() {
        return engine;
    }

    public void setEngine(Map<String, Object> engine) {
        this.engine = engine;
    }

    public UpdateV2EndpointResponse withCapacity(List<V2EndpointCapacityItem> capacity) {
        this.capacity = capacity;
        return this;
    }

    public UpdateV2EndpointResponse addCapacityItem(V2EndpointCapacityItem capacityItem) {
        if (this.capacity == null) {
            this.capacity = new ArrayList<>();
        }
        this.capacity.add(capacityItem);
        return this;
    }

    public UpdateV2EndpointResponse withCapacity(Consumer<List<V2EndpointCapacityItem>> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new ArrayList<>();
        }
        capacitySetter.accept(this.capacity);
        return this;
    }

    /**
     * **参数解释**：计算资源容量配置。 
     * @return capacity
     */
    public List<V2EndpointCapacityItem> getCapacity() {
        return capacity;
    }

    public void setCapacity(List<V2EndpointCapacityItem> capacity) {
        this.capacity = capacity;
    }

    public UpdateV2EndpointResponse withResourceType(ResourceType resourceType) {
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

    public UpdateV2EndpointResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public UpdateV2EndpointResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：资源更新时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateV2EndpointResponse withComputeId(String computeId) {
        this.computeId = computeId;
        return this;
    }

    /**
     * **参数解释**：计算资源ID。 **取值范围**：长度为1~36个英文字母、数字和中划线的组合。 
     * @return computeId
     */
    public String getComputeId() {
        return computeId;
    }

    public void setComputeId(String computeId) {
        this.computeId = computeId;
    }

    public UpdateV2EndpointResponse withCredential(CredentialConfig credential) {
        this.credential = credential;
        return this;
    }

    public UpdateV2EndpointResponse withCredential(Consumer<CredentialConfig> credentialSetter) {
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

    public UpdateV2EndpointResponse withCreator(Creator creator) {
        this.creator = creator;
        return this;
    }

    public UpdateV2EndpointResponse withCreator(Consumer<Creator> creatorSetter) {
        if (this.creator == null) {
            this.creator = new Creator();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public UpdateV2EndpointResponse withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateV2EndpointResponse addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateV2EndpointResponse withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：资源标签列表。 
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public UpdateV2EndpointResponse withError(Error error) {
        this.error = error;
        return this;
    }

    public UpdateV2EndpointResponse withError(Consumer<Error> errorSetter) {
        if (this.error == null) {
            this.error = new Error();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public UpdateV2EndpointResponse withPrometheusConfig(PrometheusConfig prometheusConfig) {
        this.prometheusConfig = prometheusConfig;
        return this;
    }

    public UpdateV2EndpointResponse withPrometheusConfig(Consumer<PrometheusConfig> prometheusConfigSetter) {
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

    public UpdateV2EndpointResponse withLtsConfig(LtsConfig ltsConfig) {
        this.ltsConfig = ltsConfig;
        return this;
    }

    public UpdateV2EndpointResponse withLtsConfig(Consumer<LtsConfig> ltsConfigSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateV2EndpointResponse that = (UpdateV2EndpointResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.capacity, that.capacity) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.computeId, that.computeId) && Objects.equals(this.credential, that.credential)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.error, that.error) && Objects.equals(this.prometheusConfig, that.prometheusConfig)
            && Objects.equals(this.ltsConfig, that.ltsConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            displayName,
            description,
            status,
            engine,
            capacity,
            resourceType,
            createTime,
            updateTime,
            computeId,
            credential,
            creator,
            tags,
            error,
            prometheusConfig,
            ltsConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateV2EndpointResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    prometheusConfig: ").append(toIndentedString(prometheusConfig)).append("\n");
        sb.append("    ltsConfig: ").append(toIndentedString(ltsConfig)).append("\n");
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
