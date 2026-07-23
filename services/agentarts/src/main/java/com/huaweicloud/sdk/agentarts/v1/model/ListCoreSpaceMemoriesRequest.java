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
 * Request Object
 */
public class ListCoreSpaceMemoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_id")

    private UUID spaceId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    /**
     * **参数解释：**  排序字段，指定按哪个字段对结果进行排序。 **约束限制：**  不涉及。 **取值范围：** created_at（按创建时间排序）根据记录的创建时间进行排序；updated_at（按更新时间排序）根据记录的最近更新时间进行排序。 **默认取值：** created_at 
     */
    public static final class SortByEnum {

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortByEnum CREATED_AT = new SortByEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final SortByEnum UPDATED_AT = new SortByEnum("updated_at");

        private static final Map<String, SortByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortByEnum> createStaticFields() {
            Map<String, SortByEnum> map = new HashMap<>();
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortByEnum(String value) {
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
        public static SortByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortByEnum(value));
        }

        public static SortByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortByEnum) {
                return this.value.equals(((SortByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private SortByEnum sortBy;

    /**
     * **参数解释：**  排序方向，指定按升序还是降序排列结果。 **约束限制：**  不涉及。 **取值范围：** asc（升序）按从小到大顺序排序；desc（降序）按从大到小顺序排序。 **默认取值：** desc 
     */
    public static final class SortOrderEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortOrderEnum ASC = new SortOrderEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortOrderEnum DESC = new SortOrderEnum("desc");

        private static final Map<String, SortOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortOrderEnum> createStaticFields() {
            Map<String, SortOrderEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortOrderEnum(String value) {
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
        public static SortOrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortOrderEnum(value));
        }

        public static SortOrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortOrderEnum) {
                return this.value.equals(((SortOrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_order")

    private SortOrderEnum sortOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListCoreSpaceMemoriesRequest withSpaceId(UUID spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * **参数解释：**  记忆库 ID，唯一标识一个记忆库，可以通过AgentArts智能体记忆库控制台或者记忆库查询接口获取。 **约束限制：** 仅支持字母、数字和中划线。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **默认取值：** 不涉及。 
     * @return spaceId
     */
    public UUID getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(UUID spaceId) {
        this.spaceId = spaceId;
    }

    public ListCoreSpaceMemoriesRequest withStrategyType(StrategyTypeEnum strategyType) {
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

    public ListCoreSpaceMemoriesRequest withStrategyId(UUID strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * **参数解释：** 按策略实例 ID 过滤。 **约束限制：** 不涉及。 **取值范围：** 长度36-36字符。  **默认取值：** 不涉及。 
     * @return strategyId
     */
    public UUID getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(UUID strategyId) {
        this.strategyId = strategyId;
    }

    public ListCoreSpaceMemoriesRequest withActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    /**
     * **参数解释：**  按 Actor ID 过滤，仅返回指定 Actor 关联的记录。Actor ID 用于标识对话参与者。 **约束限制：**  不涉及。 **取值范围：** 长度范围 1-64 字符。 **默认取值：** 不涉及。 
     * @return actorId
     */
    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public ListCoreSpaceMemoriesRequest withAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }

    /**
     * **参数解释：**  按 Assistant ID 过滤，仅返回指定 Assistant 关联的记录。Assistant ID 用于标识 AI 助手。 **约束限制：**  不涉及。 **取值范围：** 长度范围 1-64 字符。 **默认取值：** 不涉及。 
     * @return assistantId
     */
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public ListCoreSpaceMemoriesRequest withSessionId(UUID sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释：**  按 Session ID 过滤，仅返回指定 Session 关联的记录。 **约束限制：**  不涉及。 **取值范围：** 长度36-36字符。 **默认取值：** 不涉及。 
     * @return sessionId
     */
    public UUID getSessionId() {
        return sessionId;
    }

    public void setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
    }

    public ListCoreSpaceMemoriesRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：**  按创建时间过滤的起始时间（毫秒时间戳，包含），仅返回创建时间大于等于此时间的记录。 **约束限制：**  不涉及。 **取值范围：**  0-253402300799999 **默认取值：** 不涉及。 
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

    public ListCoreSpaceMemoriesRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：**  按创建时间过滤的结束时间（毫秒时间戳，包含），仅返回创建时间小于等于此时间的记录。 **约束限制：**  不涉及。 **取值范围：**  0-253402300799999 **默认取值：** 不涉及。 
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

    public ListCoreSpaceMemoriesRequest withSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * **参数解释：**  排序字段，指定按哪个字段对结果进行排序。 **约束限制：**  不涉及。 **取值范围：** created_at（按创建时间排序）根据记录的创建时间进行排序；updated_at（按更新时间排序）根据记录的最近更新时间进行排序。 **默认取值：** created_at 
     * @return sortBy
     */
    public SortByEnum getSortBy() {
        return sortBy;
    }

    public void setSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
    }

    public ListCoreSpaceMemoriesRequest withSortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * **参数解释：**  排序方向，指定按升序还是降序排列结果。 **约束限制：**  不涉及。 **取值范围：** asc（升序）按从小到大顺序排序；desc（降序）按从大到小顺序排序。 **默认取值：** desc 
     * @return sortOrder
     */
    public SortOrderEnum getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
    }

    public ListCoreSpaceMemoriesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 限制数量。 **约束限制：** 不涉及。 **取值范围：** 正整数，最大值1000。 **默认取值：** 1000。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCoreSpaceMemoriesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 返回结果偏移量。 **约束限制：** 必须为非负整数。 **取值范围：** 0-100000。 **默认取值：** 0。 
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCoreSpaceMemoriesRequest that = (ListCoreSpaceMemoriesRequest) obj;
        return Objects.equals(this.spaceId, that.spaceId) && Objects.equals(this.strategyType, that.strategyType)
            && Objects.equals(this.strategyId, that.strategyId) && Objects.equals(this.actorId, that.actorId)
            && Objects.equals(this.assistantId, that.assistantId) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.sortOrder, that.sortOrder)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spaceId,
            strategyType,
            strategyId,
            actorId,
            assistantId,
            sessionId,
            startTime,
            endTime,
            sortBy,
            sortOrder,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreSpaceMemoriesRequest {\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
        sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
