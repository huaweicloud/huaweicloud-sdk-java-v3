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
public class UpdateCoreSpaceCustomizedStrategyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 策略类型。 当前包含 4 种内置策略： - **semantic**：语义记忆提取（extraction → consolidation） - **user_preference**：用户偏好提取（extraction → consolidation） - **summary**：会话摘要生成（consolidation） - **episodic**：情景记忆提取（extraction → consolidation → reflection）        **取值范围：** 不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum SEMANTIC for value: "semantic"
         */
        public static final TypeEnum SEMANTIC = new TypeEnum("semantic");

        /**
         * Enum SUMMARY for value: "summary"
         */
        public static final TypeEnum SUMMARY = new TypeEnum("summary");

        /**
         * Enum USER_PREFERENCE for value: "user_preference"
         */
        public static final TypeEnum USER_PREFERENCE = new TypeEnum("user_preference");

        /**
         * Enum EPISODIC for value: "episodic"
         */
        public static final TypeEnum EPISODIC = new TypeEnum("episodic");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("semantic", SEMANTIC);
            map.put("summary", SUMMARY);
            map.put("user_preference", USER_PREFERENCE);
            map.put("episodic", EPISODIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * **参数解释：** 策略来源类型。 **取值范围：** - builtin: 系统内置 - user: 用户自定义 
     */
    public static final class OriginTypeEnum {

        /**
         * Enum BUILTIN for value: "builtin"
         */
        public static final OriginTypeEnum BUILTIN = new OriginTypeEnum("builtin");

        /**
         * Enum USER for value: "user"
         */
        public static final OriginTypeEnum USER = new OriginTypeEnum("user");

        private static final Map<String, OriginTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginTypeEnum> createStaticFields() {
            Map<String, OriginTypeEnum> map = new HashMap<>();
            map.put("builtin", BUILTIN);
            map.put("user", USER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginTypeEnum(String value) {
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
        public static OriginTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OriginTypeEnum(value));
        }

        public static OriginTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OriginTypeEnum) {
                return this.value.equals(((OriginTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_type")

    private OriginTypeEnum originType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<CoreSpaceMemoryStrategyStep> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public UpdateCoreSpaceCustomizedStrategyResponse withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 策略 ID。 **取值范围：** 不涉及。 
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UpdateCoreSpaceCustomizedStrategyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 策略名称。 **取值范围：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCoreSpaceCustomizedStrategyResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 策略类型。 当前包含 4 种内置策略： - **semantic**：语义记忆提取（extraction → consolidation） - **user_preference**：用户偏好提取（extraction → consolidation） - **summary**：会话摘要生成（consolidation） - **episodic**：情景记忆提取（extraction → consolidation → reflection）        **取值范围：** 不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateCoreSpaceCustomizedStrategyResponse withOriginType(OriginTypeEnum originType) {
        this.originType = originType;
        return this;
    }

    /**
     * **参数解释：** 策略来源类型。 **取值范围：** - builtin: 系统内置 - user: 用户自定义 
     * @return originType
     */
    public OriginTypeEnum getOriginType() {
        return originType;
    }

    public void setOriginType(OriginTypeEnum originType) {
        this.originType = originType;
    }

    public UpdateCoreSpaceCustomizedStrategyResponse withSteps(List<CoreSpaceMemoryStrategyStep> steps) {
        this.steps = steps;
        return this;
    }

    public UpdateCoreSpaceCustomizedStrategyResponse addStepsItem(CoreSpaceMemoryStrategyStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public UpdateCoreSpaceCustomizedStrategyResponse withSteps(
        Consumer<List<CoreSpaceMemoryStrategyStep>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * **参数解释：** 策略步骤列表。 **取值范围：** 0-20个。 
     * @return steps
     */
    public List<CoreSpaceMemoryStrategyStep> getSteps() {
        return steps;
    }

    public void setSteps(List<CoreSpaceMemoryStrategyStep> steps) {
        this.steps = steps;
    }

    public UpdateCoreSpaceCustomizedStrategyResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间，格式为 ISO 8601（YYYY-MM-DDTHH:mm:ssZ）。 **取值范围：** 不涉及。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateCoreSpaceCustomizedStrategyResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间，格式为 ISO 8601（YYYY-MM-DDTHH:mm:ssZ）。 **取值范围：** 不涉及。 
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
        UpdateCoreSpaceCustomizedStrategyResponse that = (UpdateCoreSpaceCustomizedStrategyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.originType, that.originType)
            && Objects.equals(this.steps, that.steps) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, originType, steps, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreSpaceCustomizedStrategyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
