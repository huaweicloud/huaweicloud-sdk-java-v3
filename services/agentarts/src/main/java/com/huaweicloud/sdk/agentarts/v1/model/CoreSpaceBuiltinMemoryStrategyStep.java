package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释：** 内置记忆策略步骤。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreSpaceBuiltinMemoryStrategyStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_order")

    private Integer stepOrder;

    /**
     * **参数解释：** 步骤类型，决定记忆策略中该步骤的执行逻辑。 **取值范围：** - extraction: 提取 - consolidation: 合并 - reflection: 反思 
     */
    public static final class StepTypeEnum {

        /**
         * Enum EXTRACTION for value: "extraction"
         */
        public static final StepTypeEnum EXTRACTION = new StepTypeEnum("extraction");

        /**
         * Enum CONSOLIDATION for value: "consolidation"
         */
        public static final StepTypeEnum CONSOLIDATION = new StepTypeEnum("consolidation");

        /**
         * Enum REFLECTION for value: "reflection"
         */
        public static final StepTypeEnum REFLECTION = new StepTypeEnum("reflection");

        private static final Map<String, StepTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StepTypeEnum> createStaticFields() {
            Map<String, StepTypeEnum> map = new HashMap<>();
            map.put("extraction", EXTRACTION);
            map.put("consolidation", CONSOLIDATION);
            map.put("reflection", REFLECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StepTypeEnum(String value) {
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
        public static StepTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StepTypeEnum(value));
        }

        public static StepTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StepTypeEnum) {
                return this.value.equals(((StepTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_type")

    private StepTypeEnum stepType;

    /**
     * **参数解释：** 隔离级别。 **取值范围：** - actor: 按用户隔离记忆 - session: 按会话隔离 - null: step_type=extraction时，isolation_level=null 
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
    @JsonProperty(value = "instruction")

    private String instruction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_schema")

    private String outputSchema;

    public CoreSpaceBuiltinMemoryStrategyStep withStepOrder(Integer stepOrder) {
        this.stepOrder = stepOrder;
        return this;
    }

    /**
     * **参数解释：** 步骤执行顺序（从 1 开始）。 **取值范围：** 不涉及。 
     * minimum: 1
     * maximum: 10
     * @return stepOrder
     */
    public Integer getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(Integer stepOrder) {
        this.stepOrder = stepOrder;
    }

    public CoreSpaceBuiltinMemoryStrategyStep withStepType(StepTypeEnum stepType) {
        this.stepType = stepType;
        return this;
    }

    /**
     * **参数解释：** 步骤类型，决定记忆策略中该步骤的执行逻辑。 **取值范围：** - extraction: 提取 - consolidation: 合并 - reflection: 反思 
     * @return stepType
     */
    public StepTypeEnum getStepType() {
        return stepType;
    }

    public void setStepType(StepTypeEnum stepType) {
        this.stepType = stepType;
    }

    public CoreSpaceBuiltinMemoryStrategyStep withIsolationLevel(IsolationLevelEnum isolationLevel) {
        this.isolationLevel = isolationLevel;
        return this;
    }

    /**
     * **参数解释：** 隔离级别。 **取值范围：** - actor: 按用户隔离记忆 - session: 按会话隔离 - null: step_type=extraction时，isolation_level=null 
     * @return isolationLevel
     */
    public IsolationLevelEnum getIsolationLevel() {
        return isolationLevel;
    }

    public void setIsolationLevel(IsolationLevelEnum isolationLevel) {
        this.isolationLevel = isolationLevel;
    }

    public CoreSpaceBuiltinMemoryStrategyStep withInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * **参数解释：** 步骤指令（Prompt 模板）。 **取值范围：** 不涉及。 
     * @return instruction
     */
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public CoreSpaceBuiltinMemoryStrategyStep withOutputSchema(String outputSchema) {
        this.outputSchema = outputSchema;
        return this;
    }

    /**
     * **参数解释：** 输出格式模板。 **取值范围：** 不涉及。 
     * @return outputSchema
     */
    public String getOutputSchema() {
        return outputSchema;
    }

    public void setOutputSchema(String outputSchema) {
        this.outputSchema = outputSchema;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreSpaceBuiltinMemoryStrategyStep that = (CoreSpaceBuiltinMemoryStrategyStep) obj;
        return Objects.equals(this.stepOrder, that.stepOrder) && Objects.equals(this.stepType, that.stepType)
            && Objects.equals(this.isolationLevel, that.isolationLevel)
            && Objects.equals(this.instruction, that.instruction)
            && Objects.equals(this.outputSchema, that.outputSchema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepOrder, stepType, isolationLevel, instruction, outputSchema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreSpaceBuiltinMemoryStrategyStep {\n");
        sb.append("    stepOrder: ").append(toIndentedString(stepOrder)).append("\n");
        sb.append("    stepType: ").append(toIndentedString(stepType)).append("\n");
        sb.append("    isolationLevel: ").append(toIndentedString(isolationLevel)).append("\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
        sb.append("    outputSchema: ").append(toIndentedString(outputSchema)).append("\n");
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
