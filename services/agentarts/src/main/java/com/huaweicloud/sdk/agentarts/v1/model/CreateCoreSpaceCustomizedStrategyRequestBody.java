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
 * **参数解释：** 记忆策略配置，定义记忆的抽取、合并等处理流程。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CreateCoreSpaceCustomizedStrategyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 策略类型，决定记忆的存储和使用方式。 **约束限制：** 不涉及。 **取值范围：** *semantic*: 语义记忆 *summary*: 摘要记忆 *user_preference*: 用户偏好 *episodic*: 情景记忆 **默认取值：** 不涉及。 
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

    private List<CoreSpaceMemoryStrategyStepRequestBody> steps = null;

    public CreateCoreSpaceCustomizedStrategyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**  策略名。 **约束限制：**  仅支持字母、数字和中划线。 **取值范围：**  长度1-48字符。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCoreSpaceCustomizedStrategyRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 策略类型，决定记忆的存储和使用方式。 **约束限制：** 不涉及。 **取值范围：** *semantic*: 语义记忆 *summary*: 摘要记忆 *user_preference*: 用户偏好 *episodic*: 情景记忆 **默认取值：** 不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateCoreSpaceCustomizedStrategyRequestBody withSteps(List<CoreSpaceMemoryStrategyStepRequestBody> steps) {
        this.steps = steps;
        return this;
    }

    public CreateCoreSpaceCustomizedStrategyRequestBody addStepsItem(CoreSpaceMemoryStrategyStepRequestBody stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public CreateCoreSpaceCustomizedStrategyRequestBody withSteps(
        Consumer<List<CoreSpaceMemoryStrategyStepRequestBody>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * **参数解释：** 策略步骤列表，按 step_order 顺序执行。 **约束限制：** 数组长度0-20个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return steps
     */
    public List<CoreSpaceMemoryStrategyStepRequestBody> getSteps() {
        return steps;
    }

    public void setSteps(List<CoreSpaceMemoryStrategyStepRequestBody> steps) {
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
        CreateCoreSpaceCustomizedStrategyRequestBody that = (CreateCoreSpaceCustomizedStrategyRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.steps, that.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreSpaceCustomizedStrategyRequestBody {\n");
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
