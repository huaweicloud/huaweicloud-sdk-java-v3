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
import java.util.function.Consumer;

/**
 * CreateCoreSpaceRequestBody
 */
public class CreateCoreSpaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key_id")

    private String apiKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_ttl_hours")

    private Integer messageTtlHours;

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
    @JsonProperty(value = "tags")

    private List<CoreSpaceTag> tags = null;

    /**
     * **参数解释：** 内置策略类型列表，与memory_strategies_customized至少选填一项。 当前包含 4 种内置策略： - **semantic**：语义记忆提取（extraction → consolidation） - **user_preference**：用户偏好提取（extraction → consolidation） - **summary**：会话摘要生成（consolidation） - **episodic**：情景记忆提取（extraction → consolidation → reflection） **约束限制：** 数组长度0-10个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     */
    public static final class MemoryStrategiesBuiltinEnum {

        /**
         * Enum SEMANTIC for value: "semantic"
         */
        public static final MemoryStrategiesBuiltinEnum SEMANTIC = new MemoryStrategiesBuiltinEnum("semantic");

        /**
         * Enum SUMMARY for value: "summary"
         */
        public static final MemoryStrategiesBuiltinEnum SUMMARY = new MemoryStrategiesBuiltinEnum("summary");

        /**
         * Enum USER_PREFERENCE for value: "user_preference"
         */
        public static final MemoryStrategiesBuiltinEnum USER_PREFERENCE =
            new MemoryStrategiesBuiltinEnum("user_preference");

        /**
         * Enum EPISODIC for value: "episodic"
         */
        public static final MemoryStrategiesBuiltinEnum EPISODIC = new MemoryStrategiesBuiltinEnum("episodic");

        private static final Map<String, MemoryStrategiesBuiltinEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MemoryStrategiesBuiltinEnum> createStaticFields() {
            Map<String, MemoryStrategiesBuiltinEnum> map = new HashMap<>();
            map.put("semantic", SEMANTIC);
            map.put("summary", SUMMARY);
            map.put("user_preference", USER_PREFERENCE);
            map.put("episodic", EPISODIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MemoryStrategiesBuiltinEnum(String value) {
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
        public static MemoryStrategiesBuiltinEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new MemoryStrategiesBuiltinEnum(value));
        }

        public static MemoryStrategiesBuiltinEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MemoryStrategiesBuiltinEnum) {
                return this.value.equals(((MemoryStrategiesBuiltinEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_strategies_builtin")

    private List<MemoryStrategiesBuiltinEnum> memoryStrategiesBuiltin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_strategies_customized")

    private List<CreateCoreSpaceMemoryStrategyRequestBody> memoryStrategiesCustomized = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_access")

    private CreateCoreSpaceNetworkRequestBody networkAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_config")

    private EncryptionConfig encryptionConfig;

    public CreateCoreSpaceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 空间名称。 **约束限制：** 仅支持字母、数字和中划线。 **取值范围：** 长度1-48字符。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCoreSpaceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：**  空间描述。 **约束限制：**  不涉及。 **取值范围：**  不超过1000个字符。 **默认取值：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCoreSpaceRequestBody withApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }

    /**
     * **参数解释：** 空间访问Key。 **约束限制：** 不涉及。 **取值范围：** 由英文字母、数字、\"-\"组成的字符串。 **默认取值：** 不涉及。
     * @return apiKeyId
     */
    public String getApiKeyId() {
        return apiKeyId;
    }

    public void setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
    }

    public CreateCoreSpaceRequestBody withMessageTtlHours(Integer messageTtlHours) {
        this.messageTtlHours = messageTtlHours;
        return this;
    }

    /**
     * **参数解释：** 过期时间（小时）。 **约束限制：** 不涉及。 **取值范围：** 1-8760 h。 **默认取值：** 168。 
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

    public CreateCoreSpaceRequestBody withMemoryExtractIdleSeconds(Integer memoryExtractIdleSeconds) {
        this.memoryExtractIdleSeconds = memoryExtractIdleSeconds;
        return this;
    }

    /**
     * **参数解释：** 触发记忆抽取的空闲时间（秒)。 **约束限制：** 不涉及。 **取值范围：** 10-86400 s。 **默认取值：** 不涉及。 
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

    public CreateCoreSpaceRequestBody withMemoryExtractMaxTokens(Integer memoryExtractMaxTokens) {
        this.memoryExtractMaxTokens = memoryExtractMaxTokens;
        return this;
    }

    /**
     * **参数解释：** 触发记忆抽取最大累计token数。 **约束限制：** 不涉及。 **取值范围：** 1000-1073741824 tokens。 **默认取值：** 不涉及。 
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

    public CreateCoreSpaceRequestBody withMemoryExtractMaxMessages(Integer memoryExtractMaxMessages) {
        this.memoryExtractMaxMessages = memoryExtractMaxMessages;
        return this;
    }

    /**
     * **参数解释：** 触发记忆抽取最大累计message数。 **约束限制：** 不涉及。 **取值范围：** 3-10000 条。 **默认取值：** 不涉及。 
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

    public CreateCoreSpaceRequestBody withTags(List<CoreSpaceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCoreSpaceRequestBody addTagsItem(CoreSpaceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCoreSpaceRequestBody withTags(Consumer<List<CoreSpaceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 库标签列表。 **约束限制：** 数组长度0-20个；键最大长度36字符，不允许为空；值最大长度43字符，可以为空。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return tags
     */
    public List<CoreSpaceTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreSpaceTag> tags) {
        this.tags = tags;
    }

    public CreateCoreSpaceRequestBody withMemoryStrategiesBuiltin(
        List<MemoryStrategiesBuiltinEnum> memoryStrategiesBuiltin) {
        this.memoryStrategiesBuiltin = memoryStrategiesBuiltin;
        return this;
    }

    public CreateCoreSpaceRequestBody addMemoryStrategiesBuiltinItem(
        MemoryStrategiesBuiltinEnum memoryStrategiesBuiltinItem) {
        if (this.memoryStrategiesBuiltin == null) {
            this.memoryStrategiesBuiltin = new ArrayList<>();
        }
        this.memoryStrategiesBuiltin.add(memoryStrategiesBuiltinItem);
        return this;
    }

    public CreateCoreSpaceRequestBody withMemoryStrategiesBuiltin(
        Consumer<List<MemoryStrategiesBuiltinEnum>> memoryStrategiesBuiltinSetter) {
        if (this.memoryStrategiesBuiltin == null) {
            this.memoryStrategiesBuiltin = new ArrayList<>();
        }
        memoryStrategiesBuiltinSetter.accept(this.memoryStrategiesBuiltin);
        return this;
    }

    /**
     * **参数解释：** 内置策略类型列表，与memory_strategies_customized至少选填一项。 **约束限制：** 数组长度0-10个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return memoryStrategiesBuiltin
     */
    public List<MemoryStrategiesBuiltinEnum> getMemoryStrategiesBuiltin() {
        return memoryStrategiesBuiltin;
    }

    public void setMemoryStrategiesBuiltin(List<MemoryStrategiesBuiltinEnum> memoryStrategiesBuiltin) {
        this.memoryStrategiesBuiltin = memoryStrategiesBuiltin;
    }

    public CreateCoreSpaceRequestBody withMemoryStrategiesCustomized(
        List<CreateCoreSpaceMemoryStrategyRequestBody> memoryStrategiesCustomized) {
        this.memoryStrategiesCustomized = memoryStrategiesCustomized;
        return this;
    }

    public CreateCoreSpaceRequestBody addMemoryStrategiesCustomizedItem(
        CreateCoreSpaceMemoryStrategyRequestBody memoryStrategiesCustomizedItem) {
        if (this.memoryStrategiesCustomized == null) {
            this.memoryStrategiesCustomized = new ArrayList<>();
        }
        this.memoryStrategiesCustomized.add(memoryStrategiesCustomizedItem);
        return this;
    }

    public CreateCoreSpaceRequestBody withMemoryStrategiesCustomized(
        Consumer<List<CreateCoreSpaceMemoryStrategyRequestBody>> memoryStrategiesCustomizedSetter) {
        if (this.memoryStrategiesCustomized == null) {
            this.memoryStrategiesCustomized = new ArrayList<>();
        }
        memoryStrategiesCustomizedSetter.accept(this.memoryStrategiesCustomized);
        return this;
    }

    /**
     * **参数解释：** 长期记忆自定义策略。 **约束限制：** 与memory_strategies_builtin至少选填一项；单个记忆库最多配置10个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return memoryStrategiesCustomized
     */
    public List<CreateCoreSpaceMemoryStrategyRequestBody> getMemoryStrategiesCustomized() {
        return memoryStrategiesCustomized;
    }

    public void setMemoryStrategiesCustomized(
        List<CreateCoreSpaceMemoryStrategyRequestBody> memoryStrategiesCustomized) {
        this.memoryStrategiesCustomized = memoryStrategiesCustomized;
    }

    public CreateCoreSpaceRequestBody withNetworkAccess(CreateCoreSpaceNetworkRequestBody networkAccess) {
        this.networkAccess = networkAccess;
        return this;
    }

    public CreateCoreSpaceRequestBody withNetworkAccess(
        Consumer<CreateCoreSpaceNetworkRequestBody> networkAccessSetter) {
        if (this.networkAccess == null) {
            this.networkAccess = new CreateCoreSpaceNetworkRequestBody();
            networkAccessSetter.accept(this.networkAccess);
        }

        return this;
    }

    /**
     * Get networkAccess
     * @return networkAccess
     */
    public CreateCoreSpaceNetworkRequestBody getNetworkAccess() {
        return networkAccess;
    }

    public void setNetworkAccess(CreateCoreSpaceNetworkRequestBody networkAccess) {
        this.networkAccess = networkAccess;
    }

    public CreateCoreSpaceRequestBody withEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
        return this;
    }

    public CreateCoreSpaceRequestBody withEncryptionConfig(Consumer<EncryptionConfig> encryptionConfigSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCoreSpaceRequestBody that = (CreateCoreSpaceRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.apiKeyId, that.apiKeyId)
            && Objects.equals(this.messageTtlHours, that.messageTtlHours)
            && Objects.equals(this.memoryExtractIdleSeconds, that.memoryExtractIdleSeconds)
            && Objects.equals(this.memoryExtractMaxTokens, that.memoryExtractMaxTokens)
            && Objects.equals(this.memoryExtractMaxMessages, that.memoryExtractMaxMessages)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.memoryStrategiesBuiltin, that.memoryStrategiesBuiltin)
            && Objects.equals(this.memoryStrategiesCustomized, that.memoryStrategiesCustomized)
            && Objects.equals(this.networkAccess, that.networkAccess)
            && Objects.equals(this.encryptionConfig, that.encryptionConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            apiKeyId,
            messageTtlHours,
            memoryExtractIdleSeconds,
            memoryExtractMaxTokens,
            memoryExtractMaxMessages,
            tags,
            memoryStrategiesBuiltin,
            memoryStrategiesCustomized,
            networkAccess,
            encryptionConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreSpaceRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
        sb.append("    messageTtlHours: ").append(toIndentedString(messageTtlHours)).append("\n");
        sb.append("    memoryExtractIdleSeconds: ").append(toIndentedString(memoryExtractIdleSeconds)).append("\n");
        sb.append("    memoryExtractMaxTokens: ").append(toIndentedString(memoryExtractMaxTokens)).append("\n");
        sb.append("    memoryExtractMaxMessages: ").append(toIndentedString(memoryExtractMaxMessages)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    memoryStrategiesBuiltin: ").append(toIndentedString(memoryStrategiesBuiltin)).append("\n");
        sb.append("    memoryStrategiesCustomized: ").append(toIndentedString(memoryStrategiesCustomized)).append("\n");
        sb.append("    networkAccess: ").append(toIndentedString(networkAccess)).append("\n");
        sb.append("    encryptionConfig: ").append(toIndentedString(encryptionConfig)).append("\n");
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
