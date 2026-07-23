package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * MemoryRecord
 */
public class MemoryRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_id")

    private UUID spaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_id")

    private UUID strategyId;

    /**
     * **参数解释：**  策略类型，决定记忆的存储和使用方式。 **取值范围：**  semantic（语义记忆）用于存储语义化的信息；summary（摘要记忆）用于对话总结；user_preference（用户偏好）用于存储用户偏好设置；episodic（事件记忆）用于存储特定事件；event（事件记忆）与episodic相同，用于存储特定事件；custom（自定义记忆）用于用户自定义的记忆类型。 **默认取值：** 不涉及。 
     */
    public static final class StrategyTypeEnum {

        /**
         * Enum SEMANTIC for value: "semantic"
         */
        public static final StrategyTypeEnum SEMANTIC = new StrategyTypeEnum("semantic");

        /**
         * Enum SUMMARY for value: "summary"
         */
        public static final StrategyTypeEnum SUMMARY = new StrategyTypeEnum("summary");

        /**
         * Enum USER_PREFERENCE for value: "user_preference"
         */
        public static final StrategyTypeEnum USER_PREFERENCE = new StrategyTypeEnum("user_preference");

        /**
         * Enum EPISODIC for value: "episodic"
         */
        public static final StrategyTypeEnum EPISODIC = new StrategyTypeEnum("episodic");

        /**
         * Enum EVENT for value: "event"
         */
        public static final StrategyTypeEnum EVENT = new StrategyTypeEnum("event");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final StrategyTypeEnum CUSTOM = new StrategyTypeEnum("custom");

        private static final Map<String, StrategyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StrategyTypeEnum> createStaticFields() {
            Map<String, StrategyTypeEnum> map = new HashMap<>();
            map.put("semantic", SEMANTIC);
            map.put("summary", SUMMARY);
            map.put("user_preference", USER_PREFERENCE);
            map.put("episodic", EPISODIC);
            map.put("event", EVENT);
            map.put("custom", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StrategyTypeEnum(String value) {
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
        public static StrategyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StrategyTypeEnum(value));
        }

        public static StrategyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StrategyTypeEnum) {
                return this.value.equals(((StrategyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_type")

    private StrategyTypeEnum strategyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actor_id")

    private String actorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assistant_id")

    private String assistantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private UUID sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    /**
     * **参数解释：**  记忆类型，标识记忆的存储形式。 **取值范围：** memory（一般记忆）用于存储一般的记忆信息；episode（事件记忆）用于存储特定事件；reflection（反思记忆）用于存储反思和总结。 
     */
    public static final class MemoryTypeEnum {

        /**
         * Enum MEMORY for value: "memory"
         */
        public static final MemoryTypeEnum MEMORY = new MemoryTypeEnum("memory");

        /**
         * Enum EPISODE for value: "episode"
         */
        public static final MemoryTypeEnum EPISODE = new MemoryTypeEnum("episode");

        /**
         * Enum REFLECTION for value: "reflection"
         */
        public static final MemoryTypeEnum REFLECTION = new MemoryTypeEnum("reflection");

        private static final Map<String, MemoryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MemoryTypeEnum> createStaticFields() {
            Map<String, MemoryTypeEnum> map = new HashMap<>();
            map.put("memory", MEMORY);
            map.put("episode", EPISODE);
            map.put("reflection", REFLECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MemoryTypeEnum(String value) {
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
        public static MemoryTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MemoryTypeEnum(value));
        }

        public static MemoryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MemoryTypeEnum) {
                return this.value.equals(((MemoryTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_type")

    private MemoryTypeEnum memoryType;

    /**
     * **参数解释：**  记忆隔离级别，控制记忆的可见范围。 **取值范围：**  actor（Actor 隔离）记忆只能在 Actor 内部共享；session（Session 隔离）记忆只能在 Session 内部共享。 不涉及。 
     */
    public static final class IsolationLevelEnum {

        /**
         * Enum ACTOR for value: "actor"
         */
        public static final IsolationLevelEnum ACTOR = new IsolationLevelEnum("actor");

        /**
         * Enum SESSION for value: "session"
         */
        public static final IsolationLevelEnum SESSION = new IsolationLevelEnum("session");

        private static final Map<String, IsolationLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsolationLevelEnum> createStaticFields() {
            Map<String, IsolationLevelEnum> map = new HashMap<>();
            map.put("actor", ACTOR);
            map.put("session", SESSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsolationLevelEnum(String value) {
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
        public static IsolationLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsolationLevelEnum(value));
        }

        public static IsolationLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsolationLevelEnum) {
                return this.value.equals(((IsolationLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isolation_level")

    private IsolationLevelEnum isolationLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public MemoryRecord withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  记忆记录 ID，唯一标识一条记忆记录，创建记忆时由系统自动生成。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public MemoryRecord withSpaceId(UUID spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * **参数解释：**  所属 Space ID，标识该记录所属的记忆库。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * @return spaceId
     */
    public UUID getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(UUID spaceId) {
        this.spaceId = spaceId;
    }

    public MemoryRecord withStrategyId(UUID strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * **参数解释：**  来源策略 ID，标识该记忆记录由哪个策略生成，可通过查询策略接口获取。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * @return strategyId
     */
    public UUID getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(UUID strategyId) {
        this.strategyId = strategyId;
    }

    public MemoryRecord withStrategyType(StrategyTypeEnum strategyType) {
        this.strategyType = strategyType;
        return this;
    }

    /**
     * **参数解释：**  策略类型，决定记忆的存储和使用方式。 **取值范围：**  semantic（语义记忆）用于存储语义化的信息；summary（摘要记忆）用于对话总结；user_preference（用户偏好）用于存储用户偏好设置；episodic（事件记忆）用于存储特定事件；event（事件记忆）与episodic相同，用于存储特定事件；custom（自定义记忆）用于用户自定义的记忆类型。 **默认取值：** 不涉及。 
     * @return strategyType
     */
    public StrategyTypeEnum getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(StrategyTypeEnum strategyType) {
        this.strategyType = strategyType;
    }

    public MemoryRecord withActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    /**
     * **参数解释：**  归属 Actor ID，标识该记忆记录所属的 Actor，实现 Actor 级记忆隔离。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * @return actorId
     */
    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public MemoryRecord withAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }

    /**
     * **参数解释：**  归属 Assistant ID，标识该记录所属的 AI 助手。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * @return assistantId
     */
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public MemoryRecord withSessionId(UUID sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释：**  来源会话 ID，标识该记忆记录关联的会话，实现 Session 级记忆隔离。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * @return sessionId
     */
    public UUID getSessionId() {
        return sessionId;
    }

    public void setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
    }

    public MemoryRecord withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释：**  记忆内容，存储具体的记忆信息文本，如用户偏好、重要事实等。 **取值范围：** 1-10000 字符。 **默认取值：** 不涉及。 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MemoryRecord withMemoryType(MemoryTypeEnum memoryType) {
        this.memoryType = memoryType;
        return this;
    }

    /**
     * **参数解释：**  记忆类型，标识记忆的存储形式。 **取值范围：** memory（一般记忆）用于存储一般的记忆信息；episode（事件记忆）用于存储特定事件；reflection（反思记忆）用于存储反思和总结。 
     * @return memoryType
     */
    public MemoryTypeEnum getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryTypeEnum memoryType) {
        this.memoryType = memoryType;
    }

    public MemoryRecord withIsolationLevel(IsolationLevelEnum isolationLevel) {
        this.isolationLevel = isolationLevel;
        return this;
    }

    /**
     * **参数解释：**  记忆隔离级别，控制记忆的可见范围。 **取值范围：**  actor（Actor 隔离）记忆只能在 Actor 内部共享；session（Session 隔离）记忆只能在 Session 内部共享。 不涉及。 
     * @return isolationLevel
     */
    public IsolationLevelEnum getIsolationLevel() {
        return isolationLevel;
    }

    public void setIsolationLevel(IsolationLevelEnum isolationLevel) {
        this.isolationLevel = isolationLevel;
    }

    public MemoryRecord withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：**  记录的创建时间，由系统自动生成，格式为 ISO 8601。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public MemoryRecord withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：**  记录的最近更新时间，由系统自动更新，格式为 ISO 8601。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
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
        MemoryRecord that = (MemoryRecord) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.spaceId, that.spaceId)
            && Objects.equals(this.strategyId, that.strategyId) && Objects.equals(this.strategyType, that.strategyType)
            && Objects.equals(this.actorId, that.actorId) && Objects.equals(this.assistantId, that.assistantId)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.content, that.content)
            && Objects.equals(this.memoryType, that.memoryType)
            && Objects.equals(this.isolationLevel, that.isolationLevel)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            spaceId,
            strategyId,
            strategyType,
            actorId,
            assistantId,
            sessionId,
            content,
            memoryType,
            isolationLevel,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemoryRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
        sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
        sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    memoryType: ").append(toIndentedString(memoryType)).append("\n");
        sb.append("    isolationLevel: ").append(toIndentedString(isolationLevel)).append("\n");
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
