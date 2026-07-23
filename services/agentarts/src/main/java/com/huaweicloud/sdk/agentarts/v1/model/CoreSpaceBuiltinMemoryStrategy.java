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
 * **参数解释：** 内置记忆策略配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreSpaceBuiltinMemoryStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 策略名称，用于标识和区分不同的记忆策略。 - **semantic**：语义记忆提取（extraction → consolidation） - **user_preference**：用户偏好提取（extraction → consolidation） - **summary**：会话摘要生成（consolidation） - **episodic**：情景记忆提取（extraction → consolidation → reflection） **取值范围：** 不涉及。 
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<CoreSpaceBuiltinMemoryStrategyStep> steps = null;

    public CoreSpaceBuiltinMemoryStrategy withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 策略 ID，唯一标识一个记忆策略。 **取值范围：** 不涉及。 
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public CoreSpaceBuiltinMemoryStrategy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 策略名称，用于标识和区分不同的记忆策略。 **取值范围：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoreSpaceBuiltinMemoryStrategy withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 策略名称，用于标识和区分不同的记忆策略。 - **semantic**：语义记忆提取（extraction → consolidation） - **user_preference**：用户偏好提取（extraction → consolidation） - **summary**：会话摘要生成（consolidation） - **episodic**：情景记忆提取（extraction → consolidation → reflection） **取值范围：** 不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CoreSpaceBuiltinMemoryStrategy withSteps(List<CoreSpaceBuiltinMemoryStrategyStep> steps) {
        this.steps = steps;
        return this;
    }

    public CoreSpaceBuiltinMemoryStrategy addStepsItem(CoreSpaceBuiltinMemoryStrategyStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public CoreSpaceBuiltinMemoryStrategy withSteps(Consumer<List<CoreSpaceBuiltinMemoryStrategyStep>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * **参数解释：** 策略步骤列表，按 step_order 顺序执行。 **取值范围：** 不涉及。 
     * @return steps
     */
    public List<CoreSpaceBuiltinMemoryStrategyStep> getSteps() {
        return steps;
    }

    public void setSteps(List<CoreSpaceBuiltinMemoryStrategyStep> steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreSpaceBuiltinMemoryStrategy that = (CoreSpaceBuiltinMemoryStrategy) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.steps, that.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreSpaceBuiltinMemoryStrategy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
