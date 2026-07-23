package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * SearchCoreSpaceMemoriesRequestBody
 */
public class SearchCoreSpaceMemoriesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    /**
     * **参数解释：** 按策略类型过滤。semantic（语义记忆）用于存储语义化的信息；summary（摘要记忆）用于对话总结；user_preference（用户偏好）用于存储用户偏好设置；episodic（事件记忆）用于存储特定事件；event（事件记忆）与episodic相同，用于存储特定事件；custom（自定义记忆）用于用户自定义的记忆类型。 **约束限制：** 不涉及。 **取值范围：** - semantic - summary - user_preference - episodic - event - custom **默认取值：** 不涉及。 
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
    @JsonProperty(value = "strategy_id")

    private UUID strategyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actor_id")

    private String actorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assistant_id")

    private String assistantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private UUID sessionId;

    /**
     * **参数解释：**  按记忆类型过滤。 **约束限制：**  不涉及。 **取值范围：**  - memory - episode - reflection **默认取值：**  memory（一般记忆）用于存储一般的记忆信息；episode（事件记忆）用于存储特定事件；reflection（反思记忆）用于存储反思和总结。 
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_k")

    private Integer topK;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_score")

    private Float minScore;

    public SearchCoreSpaceMemoriesRequestBody withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释：** 查询文本（可选，不传时仅按过滤条件检索）。 **约束限制：** 不涉及。 **取值范围：** 长度1-2000字符。 **默认取值：** 不涉及。 
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public SearchCoreSpaceMemoriesRequestBody withStrategyType(StrategyTypeEnum strategyType) {
        this.strategyType = strategyType;
        return this;
    }

    /**
     * **参数解释：** 按策略类型过滤。semantic（语义记忆）用于存储语义化的信息；summary（摘要记忆）用于对话总结；user_preference（用户偏好）用于存储用户偏好设置；episodic（事件记忆）用于存储特定事件；event（事件记忆）与episodic相同，用于存储特定事件；custom（自定义记忆）用于用户自定义的记忆类型。 **约束限制：** 不涉及。 **取值范围：** - semantic - summary - user_preference - episodic - event - custom **默认取值：** 不涉及。 
     * @return strategyType
     */
    public StrategyTypeEnum getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(StrategyTypeEnum strategyType) {
        this.strategyType = strategyType;
    }

    public SearchCoreSpaceMemoriesRequestBody withStrategyId(UUID strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * **参数解释：**  按策略实例 ID 过滤，仅返回指定策略实例关联的记录。策略实例 ID 可通过查询策略接口获取。 **约束限制：**  不涉及。 **取值范围：**  长度36-36字符。 **默认取值：**  不涉及。 
     * @return strategyId
     */
    public UUID getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(UUID strategyId) {
        this.strategyId = strategyId;
    }

    public SearchCoreSpaceMemoriesRequestBody withActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    /**
     * **参数解释：**  按 Actor ID 过滤，仅返回指定 Actor 关联的记录。Actor ID 用于标识对话参与者。 **约束限制：**  不涉及。 **取值范围：** 长度0-64字符。 **默认取值：** 不涉及。 
     * @return actorId
     */
    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public SearchCoreSpaceMemoriesRequestBody withAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }

    /**
     * **参数解释：**  按 Assistant ID 过滤，仅返回指定 Assistant 关联的记录。Assistant ID 用于标识 AI 助手。 **约束限制：**  不涉及。 **取值范围：** 长度0-64字符。 **默认取值：** 不涉及。 
     * @return assistantId
     */
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public SearchCoreSpaceMemoriesRequestBody withSessionId(UUID sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释：**  按 Session ID 过滤，仅返回指定 Session 关联的记录。 **约束限制：**  不涉及。 **取值范围：**  长度36-36字符。   不涉及。 
     * @return sessionId
     */
    public UUID getSessionId() {
        return sessionId;
    }

    public void setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
    }

    public SearchCoreSpaceMemoriesRequestBody withMemoryType(MemoryTypeEnum memoryType) {
        this.memoryType = memoryType;
        return this;
    }

    /**
     * **参数解释：**  按记忆类型过滤。 **约束限制：**  不涉及。 **取值范围：**  - memory - episode - reflection **默认取值：**  memory（一般记忆）用于存储一般的记忆信息；episode（事件记忆）用于存储特定事件；reflection（反思记忆）用于存储反思和总结。 
     * @return memoryType
     */
    public MemoryTypeEnum getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryTypeEnum memoryType) {
        this.memoryType = memoryType;
    }

    public SearchCoreSpaceMemoriesRequestBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：**  按创建时间过滤的起始时间（毫秒时间戳，包含），仅返回创建时间大于等于此时间的记录。 **约束限制：**  不涉及。 **取值范围：**  0-253402300799999 **默认取值：**  0-253402300799999 
     * minimum: 0
     * maximum: 253402300799999
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public SearchCoreSpaceMemoriesRequestBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：**  按创建时间过滤的结束时间（毫秒时间戳，包含），仅返回创建时间小于等于此时间的记录。 **约束限制：**  不涉及。 **取值范围：**  0-253402300799999 **默认取值：**  0-253402300799999 
     * minimum: 0
     * maximum: 253402300799999
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public SearchCoreSpaceMemoriesRequestBody withTopK(Integer topK) {
        this.topK = topK;
        return this;
    }

    /**
     * **参数解释：** 返回相似度最高的前 K 个结果，用于控制检索返回数量。 **约束限制：** 不涉及。 **取值范围：** 1-100 **默认取值：** 10 
     * minimum: 1
     * maximum: 100
     * @return topK
     */
    public Integer getTopK() {
        return topK;
    }

    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    public SearchCoreSpaceMemoriesRequestBody withMinScore(Float minScore) {
        this.minScore = minScore;
        return this;
    }

    /**
     * **参数解释：**  最小向量相似度分数阈值（基于 OpenSearch 向量检索分数过滤，Rerank 前生效）。 **约束限制：**  不涉及。 **取值范围：**  0.0-1.0 **默认取值：**  不涉及。 
     * minimum: 0
     * maximum: 1
     * @return minScore
     */
    public Float getMinScore() {
        return minScore;
    }

    public void setMinScore(Float minScore) {
        this.minScore = minScore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchCoreSpaceMemoriesRequestBody that = (SearchCoreSpaceMemoriesRequestBody) obj;
        return Objects.equals(this.query, that.query) && Objects.equals(this.strategyType, that.strategyType)
            && Objects.equals(this.strategyId, that.strategyId) && Objects.equals(this.actorId, that.actorId)
            && Objects.equals(this.assistantId, that.assistantId) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.memoryType, that.memoryType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.topK, that.topK)
            && Objects.equals(this.minScore, that.minScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query,
            strategyType,
            strategyId,
            actorId,
            assistantId,
            sessionId,
            memoryType,
            startTime,
            endTime,
            topK,
            minScore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCoreSpaceMemoriesRequestBody {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
        sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    memoryType: ").append(toIndentedString(memoryType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
        sb.append("    minScore: ").append(toIndentedString(minScore)).append("\n");
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
