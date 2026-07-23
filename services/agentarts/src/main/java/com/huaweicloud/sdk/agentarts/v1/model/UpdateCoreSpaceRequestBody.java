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
 * **参数解释：** 更新 Space 配置请求体，所有字段可选，仅更新传入字段。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class UpdateCoreSpaceRequestBody {

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
    @JsonProperty(value = "tags")

    private List<CoreSpaceTag> tags = null;

    /**
     * **参数解释：** 内置策略类型列表。 当前包含 4 种内置策略： - **semantic**：语义记忆提取（extraction → consolidation） - **user_preference**：用户偏好提取（extraction → consolidation） - **summary**：会话摘要生成（consolidation） - **episodic**：情景记忆提取（extraction → consolidation → reflection）   **约束限制：** 数组长度0-10个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
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

    public UpdateCoreSpaceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**  记忆库名称。 **约束限制：**  支持字母、数字和中划线。 **取值范围：**  长度1-48字符。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCoreSpaceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：**  记忆库描述。 **约束限制：**  不涉及。 **取值范围：** 不超过1000长度的字符串。 **默认取值：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCoreSpaceRequestBody withMessageTtlHours(Integer messageTtlHours) {
        this.messageTtlHours = messageTtlHours;
        return this;
    }

    /**
     * **参数解释：** Message过期时间（小时）。 **约束限制：** 最大8760个小时（365天）。 **取值范围：** 1-8760 **默认取值：** 不涉及。 
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

    public UpdateCoreSpaceRequestBody withMemoryExtractEnabled(Boolean memoryExtractEnabled) {
        this.memoryExtractEnabled = memoryExtractEnabled;
        return this;
    }

    /**
     * **参数解释：** 是否开启记忆抽取。 **约束限制：** 不涉及。 **取值范围：** - true: 开启记忆抽取 - false: 关闭记忆抽取 **默认取值：** 不涉及。 
     * @return memoryExtractEnabled
     */
    public Boolean getMemoryExtractEnabled() {
        return memoryExtractEnabled;
    }

    public void setMemoryExtractEnabled(Boolean memoryExtractEnabled) {
        this.memoryExtractEnabled = memoryExtractEnabled;
    }

    public UpdateCoreSpaceRequestBody withMemoryExtractIdleSeconds(Integer memoryExtractIdleSeconds) {
        this.memoryExtractIdleSeconds = memoryExtractIdleSeconds;
        return this;
    }

    /**
     * **参数解释：**  触发记忆抽取空闲时间（秒）。 **约束限制：**  不涉及。 **取值范围：**  10-86400（24小时） **默认取值：** 不涉及。 
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

    public UpdateCoreSpaceRequestBody withMemoryExtractMaxTokens(Integer memoryExtractMaxTokens) {
        this.memoryExtractMaxTokens = memoryExtractMaxTokens;
        return this;
    }

    /**
     * **参数解释：** 触发记忆抽取最大累计 token 数。 **约束限制：** 不涉及。 **取值范围：** 1000-1073741824 **默认取值：** 不涉及。 
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

    public UpdateCoreSpaceRequestBody withMemoryExtractMaxMessages(Integer memoryExtractMaxMessages) {
        this.memoryExtractMaxMessages = memoryExtractMaxMessages;
        return this;
    }

    /**
     * **参数解释：**  触发记忆抽取最大累计 message 数。 **约束限制：**  不涉及。 **取值范围：** 3-10000 **默认取值：** 不涉及。 
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

    public UpdateCoreSpaceRequestBody withTags(List<CoreSpaceTag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateCoreSpaceRequestBody addTagsItem(CoreSpaceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateCoreSpaceRequestBody withTags(Consumer<List<CoreSpaceTag>> tagsSetter) {
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

    public UpdateCoreSpaceRequestBody withMemoryStrategiesBuiltin(
        List<MemoryStrategiesBuiltinEnum> memoryStrategiesBuiltin) {
        this.memoryStrategiesBuiltin = memoryStrategiesBuiltin;
        return this;
    }

    public UpdateCoreSpaceRequestBody addMemoryStrategiesBuiltinItem(
        MemoryStrategiesBuiltinEnum memoryStrategiesBuiltinItem) {
        if (this.memoryStrategiesBuiltin == null) {
            this.memoryStrategiesBuiltin = new ArrayList<>();
        }
        this.memoryStrategiesBuiltin.add(memoryStrategiesBuiltinItem);
        return this;
    }

    public UpdateCoreSpaceRequestBody withMemoryStrategiesBuiltin(
        Consumer<List<MemoryStrategiesBuiltinEnum>> memoryStrategiesBuiltinSetter) {
        if (this.memoryStrategiesBuiltin == null) {
            this.memoryStrategiesBuiltin = new ArrayList<>();
        }
        memoryStrategiesBuiltinSetter.accept(this.memoryStrategiesBuiltin);
        return this;
    }

    /**
     * **参数解释：** 内置策略类型列表。 **约束限制：** 数组长度0-10个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return memoryStrategiesBuiltin
     */
    public List<MemoryStrategiesBuiltinEnum> getMemoryStrategiesBuiltin() {
        return memoryStrategiesBuiltin;
    }

    public void setMemoryStrategiesBuiltin(List<MemoryStrategiesBuiltinEnum> memoryStrategiesBuiltin) {
        this.memoryStrategiesBuiltin = memoryStrategiesBuiltin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCoreSpaceRequestBody that = (UpdateCoreSpaceRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.messageTtlHours, that.messageTtlHours)
            && Objects.equals(this.memoryExtractEnabled, that.memoryExtractEnabled)
            && Objects.equals(this.memoryExtractIdleSeconds, that.memoryExtractIdleSeconds)
            && Objects.equals(this.memoryExtractMaxTokens, that.memoryExtractMaxTokens)
            && Objects.equals(this.memoryExtractMaxMessages, that.memoryExtractMaxMessages)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.memoryStrategiesBuiltin, that.memoryStrategiesBuiltin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            messageTtlHours,
            memoryExtractEnabled,
            memoryExtractIdleSeconds,
            memoryExtractMaxTokens,
            memoryExtractMaxMessages,
            tags,
            memoryStrategiesBuiltin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreSpaceRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    messageTtlHours: ").append(toIndentedString(messageTtlHours)).append("\n");
        sb.append("    memoryExtractEnabled: ").append(toIndentedString(memoryExtractEnabled)).append("\n");
        sb.append("    memoryExtractIdleSeconds: ").append(toIndentedString(memoryExtractIdleSeconds)).append("\n");
        sb.append("    memoryExtractMaxTokens: ").append(toIndentedString(memoryExtractMaxTokens)).append("\n");
        sb.append("    memoryExtractMaxMessages: ").append(toIndentedString(memoryExtractMaxMessages)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    memoryStrategiesBuiltin: ").append(toIndentedString(memoryStrategiesBuiltin)).append("\n");
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
