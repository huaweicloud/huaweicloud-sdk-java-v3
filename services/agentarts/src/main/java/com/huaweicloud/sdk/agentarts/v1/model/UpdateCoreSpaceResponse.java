package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateCoreSpaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_ttl_hours")

    private Integer messageTtlHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_extract_enabled")

    private Boolean memoryExtractEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_extract_idle_seconds")

    private Integer memoryExtractIdleSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_extract_max_tokens")

    private Integer memoryExtractMaxTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_extract_max_messages")

    private Integer memoryExtractMaxMessages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_strategies_builtin")

    private List<CoreSpaceBuiltinMemoryStrategy> memoryStrategiesBuiltin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_strategies_customized")

    private List<CoreSpaceMemoryStrategy> memoryStrategiesCustomized = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_access")

    private CoreSpaceNetwork privateAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_access")

    private CoreSpaceNetwork publicAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key")

    private ShowCoreSpaceApiKeyResponseBody apiKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_config")

    private EncryptionConfig encryptionConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreSpaceTag> tags = null;

    /**
     * **参数解释：** Space 状态。 **取值范围：** - creating: 创建中 - running: 运行中 - deleted: 已删除 - create_failed: 创建失败 
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("deleted");

        /**
         * Enum CREATE_FAILED for value: "create_failed"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("create_failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("creating", CREATING);
            map.put("running", RUNNING);
            map.put("deleted", DELETED);
            map.put("create_failed", CREATE_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public UpdateCoreSpaceResponse withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 记忆库 ID，唯一标识一个记忆库，可通过\"创建Space\"接口获取。 **取值范围：** 不涉及。 
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UpdateCoreSpaceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 记忆库名称。 **取值范围：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCoreSpaceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 记忆库描述。 **取值范围：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCoreSpaceResponse withMessageTtlHours(Integer messageTtlHours) {
        this.messageTtlHours = messageTtlHours;
        return this;
    }

    /**
     * **参数解释：** 短期记忆过期时间（小时）。 **取值范围：** 不涉及。 
     * minimum: 1
     * maximum: 8760
     * @return messageTtlHours
     */
    public Integer getMessageTtlHours() {
        return messageTtlHours;
    }

    public void setMessageTtlHours(Integer messageTtlHours) {
        this.messageTtlHours = messageTtlHours;
    }

    public UpdateCoreSpaceResponse withMemoryExtractEnabled(Boolean memoryExtractEnabled) {
        this.memoryExtractEnabled = memoryExtractEnabled;
        return this;
    }

    /**
     * **参数解释：** 是否开启长期记忆抽取。 **取值范围：** - true: 已开启 - false: 未开启 
     * @return memoryExtractEnabled
     */
    public Boolean getMemoryExtractEnabled() {
        return memoryExtractEnabled;
    }

    public void setMemoryExtractEnabled(Boolean memoryExtractEnabled) {
        this.memoryExtractEnabled = memoryExtractEnabled;
    }

    public UpdateCoreSpaceResponse withMemoryExtractIdleSeconds(Integer memoryExtractIdleSeconds) {
        this.memoryExtractIdleSeconds = memoryExtractIdleSeconds;
        return this;
    }

    /**
     * **参数解释：** 长期记忆抽取空闲时间（秒）。 **取值范围：** 不涉及。 
     * minimum: 10
     * maximum: 86400
     * @return memoryExtractIdleSeconds
     */
    public Integer getMemoryExtractIdleSeconds() {
        return memoryExtractIdleSeconds;
    }

    public void setMemoryExtractIdleSeconds(Integer memoryExtractIdleSeconds) {
        this.memoryExtractIdleSeconds = memoryExtractIdleSeconds;
    }

    public UpdateCoreSpaceResponse withMemoryExtractMaxTokens(Integer memoryExtractMaxTokens) {
        this.memoryExtractMaxTokens = memoryExtractMaxTokens;
        return this;
    }

    /**
     * **参数解释：** 长期记忆抽取最大累计 token 数。 **取值范围：** 不涉及。 
     * minimum: 1000
     * maximum: 1073741824
     * @return memoryExtractMaxTokens
     */
    public Integer getMemoryExtractMaxTokens() {
        return memoryExtractMaxTokens;
    }

    public void setMemoryExtractMaxTokens(Integer memoryExtractMaxTokens) {
        this.memoryExtractMaxTokens = memoryExtractMaxTokens;
    }

    public UpdateCoreSpaceResponse withMemoryExtractMaxMessages(Integer memoryExtractMaxMessages) {
        this.memoryExtractMaxMessages = memoryExtractMaxMessages;
        return this;
    }

    /**
     * **参数解释：** 长期记忆抽取最大累计 message 数。 **取值范围：** 不涉及。 
     * minimum: 3
     * maximum: 10000
     * @return memoryExtractMaxMessages
     */
    public Integer getMemoryExtractMaxMessages() {
        return memoryExtractMaxMessages;
    }

    public void setMemoryExtractMaxMessages(Integer memoryExtractMaxMessages) {
        this.memoryExtractMaxMessages = memoryExtractMaxMessages;
    }

    public UpdateCoreSpaceResponse withMemoryStrategiesBuiltin(
        List<CoreSpaceBuiltinMemoryStrategy> memoryStrategiesBuiltin) {
        this.memoryStrategiesBuiltin = memoryStrategiesBuiltin;
        return this;
    }

    public UpdateCoreSpaceResponse addMemoryStrategiesBuiltinItem(
        CoreSpaceBuiltinMemoryStrategy memoryStrategiesBuiltinItem) {
        if (this.memoryStrategiesBuiltin == null) {
            this.memoryStrategiesBuiltin = new ArrayList<>();
        }
        this.memoryStrategiesBuiltin.add(memoryStrategiesBuiltinItem);
        return this;
    }

    public UpdateCoreSpaceResponse withMemoryStrategiesBuiltin(
        Consumer<List<CoreSpaceBuiltinMemoryStrategy>> memoryStrategiesBuiltinSetter) {
        if (this.memoryStrategiesBuiltin == null) {
            this.memoryStrategiesBuiltin = new ArrayList<>();
        }
        memoryStrategiesBuiltinSetter.accept(this.memoryStrategiesBuiltin);
        return this;
    }

    /**
     * **参数解释：** 内置策略列表。 **取值范围：** 不涉及。 
     * @return memoryStrategiesBuiltin
     */
    public List<CoreSpaceBuiltinMemoryStrategy> getMemoryStrategiesBuiltin() {
        return memoryStrategiesBuiltin;
    }

    public void setMemoryStrategiesBuiltin(List<CoreSpaceBuiltinMemoryStrategy> memoryStrategiesBuiltin) {
        this.memoryStrategiesBuiltin = memoryStrategiesBuiltin;
    }

    public UpdateCoreSpaceResponse withMemoryStrategiesCustomized(
        List<CoreSpaceMemoryStrategy> memoryStrategiesCustomized) {
        this.memoryStrategiesCustomized = memoryStrategiesCustomized;
        return this;
    }

    public UpdateCoreSpaceResponse addMemoryStrategiesCustomizedItem(
        CoreSpaceMemoryStrategy memoryStrategiesCustomizedItem) {
        if (this.memoryStrategiesCustomized == null) {
            this.memoryStrategiesCustomized = new ArrayList<>();
        }
        this.memoryStrategiesCustomized.add(memoryStrategiesCustomizedItem);
        return this;
    }

    public UpdateCoreSpaceResponse withMemoryStrategiesCustomized(
        Consumer<List<CoreSpaceMemoryStrategy>> memoryStrategiesCustomizedSetter) {
        if (this.memoryStrategiesCustomized == null) {
            this.memoryStrategiesCustomized = new ArrayList<>();
        }
        memoryStrategiesCustomizedSetter.accept(this.memoryStrategiesCustomized);
        return this;
    }

    /**
     * **参数解释：** 该记忆库关联的用户自定义记忆策略列表（完整数据）。 **取值范围：** 不涉及。 
     * @return memoryStrategiesCustomized
     */
    public List<CoreSpaceMemoryStrategy> getMemoryStrategiesCustomized() {
        return memoryStrategiesCustomized;
    }

    public void setMemoryStrategiesCustomized(List<CoreSpaceMemoryStrategy> memoryStrategiesCustomized) {
        this.memoryStrategiesCustomized = memoryStrategiesCustomized;
    }

    public UpdateCoreSpaceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** 租户 VPC ID，获取方式：[查询VPC列表](https://support.huaweicloud.com/api-vpc/vpc_apiv3_0003.html)。 **取值范围：** 不涉及。 
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public UpdateCoreSpaceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释：** 租户子网 ID，获取方式：[查询子网列表](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html)。 **取值范围：** 不涉及。 
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public UpdateCoreSpaceResponse withPrivateAccess(CoreSpaceNetwork privateAccess) {
        this.privateAccess = privateAccess;
        return this;
    }

    public UpdateCoreSpaceResponse withPrivateAccess(Consumer<CoreSpaceNetwork> privateAccessSetter) {
        if (this.privateAccess == null) {
            this.privateAccess = new CoreSpaceNetwork();
            privateAccessSetter.accept(this.privateAccess);
        }

        return this;
    }

    /**
     * Get privateAccess
     * @return privateAccess
     */
    public CoreSpaceNetwork getPrivateAccess() {
        return privateAccess;
    }

    public void setPrivateAccess(CoreSpaceNetwork privateAccess) {
        this.privateAccess = privateAccess;
    }

    public UpdateCoreSpaceResponse withPublicAccess(CoreSpaceNetwork publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

    public UpdateCoreSpaceResponse withPublicAccess(Consumer<CoreSpaceNetwork> publicAccessSetter) {
        if (this.publicAccess == null) {
            this.publicAccess = new CoreSpaceNetwork();
            publicAccessSetter.accept(this.publicAccess);
        }

        return this;
    }

    /**
     * Get publicAccess
     * @return publicAccess
     */
    public CoreSpaceNetwork getPublicAccess() {
        return publicAccess;
    }

    public void setPublicAccess(CoreSpaceNetwork publicAccess) {
        this.publicAccess = publicAccess;
    }

    public UpdateCoreSpaceResponse withApiKey(ShowCoreSpaceApiKeyResponseBody apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public UpdateCoreSpaceResponse withApiKey(Consumer<ShowCoreSpaceApiKeyResponseBody> apiKeySetter) {
        if (this.apiKey == null) {
            this.apiKey = new ShowCoreSpaceApiKeyResponseBody();
            apiKeySetter.accept(this.apiKey);
        }

        return this;
    }

    /**
     * Get apiKey
     * @return apiKey
     */
    public ShowCoreSpaceApiKeyResponseBody getApiKey() {
        return apiKey;
    }

    public void setApiKey(ShowCoreSpaceApiKeyResponseBody apiKey) {
        this.apiKey = apiKey;
    }

    public UpdateCoreSpaceResponse withEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
        return this;
    }

    public UpdateCoreSpaceResponse withEncryptionConfig(Consumer<EncryptionConfig> encryptionConfigSetter) {
        if (this.encryptionConfig == null) {
            this.encryptionConfig = new EncryptionConfig();
            encryptionConfigSetter.accept(this.encryptionConfig);
        }

        return this;
    }

    /**
     * Get encryptionConfig
     * @return encryptionConfig
     */
    public EncryptionConfig getEncryptionConfig() {
        return encryptionConfig;
    }

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    public UpdateCoreSpaceResponse withTags(List<CoreSpaceTag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateCoreSpaceResponse addTagsItem(CoreSpaceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateCoreSpaceResponse withTags(Consumer<List<CoreSpaceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 库标签列表。 **取值范围：** 不涉及。 
     * @return tags
     */
    public List<CoreSpaceTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreSpaceTag> tags) {
        this.tags = tags;
    }

    public UpdateCoreSpaceResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** Space 状态。 **取值范围：** - creating: 创建中 - running: 运行中 - deleted: 已删除 - create_failed: 创建失败 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateCoreSpaceResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 记录的创建时间，由系统自动生成，格式为 ISO 8601（YYYY-MM-DDTHH:mm:ssZ）。 **取值范围：** 不涉及。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateCoreSpaceResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 记录的最近更新时间，由系统自动更新，格式为 ISO 8601（YYYY-MM-DDTHH:mm:ssZ）。 **取值范围：** 不涉及。 
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCoreSpaceResponse that = (UpdateCoreSpaceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.messageTtlHours, that.messageTtlHours)
            && Objects.equals(this.memoryExtractEnabled, that.memoryExtractEnabled)
            && Objects.equals(this.memoryExtractIdleSeconds, that.memoryExtractIdleSeconds)
            && Objects.equals(this.memoryExtractMaxTokens, that.memoryExtractMaxTokens)
            && Objects.equals(this.memoryExtractMaxMessages, that.memoryExtractMaxMessages)
            && Objects.equals(this.memoryStrategiesBuiltin, that.memoryStrategiesBuiltin)
            && Objects.equals(this.memoryStrategiesCustomized, that.memoryStrategiesCustomized)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.privateAccess, that.privateAccess)
            && Objects.equals(this.publicAccess, that.publicAccess) && Objects.equals(this.apiKey, that.apiKey)
            && Objects.equals(this.encryptionConfig, that.encryptionConfig) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            messageTtlHours,
            memoryExtractEnabled,
            memoryExtractIdleSeconds,
            memoryExtractMaxTokens,
            memoryExtractMaxMessages,
            memoryStrategiesBuiltin,
            memoryStrategiesCustomized,
            vpcId,
            subnetId,
            privateAccess,
            publicAccess,
            apiKey,
            encryptionConfig,
            tags,
            status,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreSpaceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    messageTtlHours: ").append(toIndentedString(messageTtlHours)).append("\n");
        sb.append("    memoryExtractEnabled: ").append(toIndentedString(memoryExtractEnabled)).append("\n");
        sb.append("    memoryExtractIdleSeconds: ").append(toIndentedString(memoryExtractIdleSeconds)).append("\n");
        sb.append("    memoryExtractMaxTokens: ").append(toIndentedString(memoryExtractMaxTokens)).append("\n");
        sb.append("    memoryExtractMaxMessages: ").append(toIndentedString(memoryExtractMaxMessages)).append("\n");
        sb.append("    memoryStrategiesBuiltin: ").append(toIndentedString(memoryStrategiesBuiltin)).append("\n");
        sb.append("    memoryStrategiesCustomized: ").append(toIndentedString(memoryStrategiesCustomized)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    privateAccess: ").append(toIndentedString(privateAccess)).append("\n");
        sb.append("    publicAccess: ").append(toIndentedString(publicAccess)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    encryptionConfig: ").append(toIndentedString(encryptionConfig)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
