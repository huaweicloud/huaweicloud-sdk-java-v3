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
 * **参数解释：** 评估器筛选选项集合，包含各个维度的可用筛选项。  **约束限制：** 各维度下的筛选项为非空数组。  **取值范围：** 预定义的枚举值集合。  **默认取值：** 不涉及。 
 */
public class ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions {

    /**
     * Gets or Sets evaluatorType
     */
    public static final class EvaluatorTypeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final EvaluatorTypeEnum NUMBER_1 = new EvaluatorTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final EvaluatorTypeEnum NUMBER_2 = new EvaluatorTypeEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final EvaluatorTypeEnum NUMBER_3 = new EvaluatorTypeEnum(3);

        private static final Map<Integer, EvaluatorTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, EvaluatorTypeEnum> createStaticFields() {
            Map<Integer, EvaluatorTypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        EvaluatorTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EvaluatorTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EvaluatorTypeEnum(value));
        }

        public static EvaluatorTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EvaluatorTypeEnum) {
                return this.value.equals(((EvaluatorTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_type")

    private List<EvaluatorTypeEnum> evaluatorType = null;

    /**
     * Gets or Sets turnType
     */
    public static final class TurnTypeEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final TurnTypeEnum SINGLE = new TurnTypeEnum("single");

        /**
         * Enum MULTI for value: "multi"
         */
        public static final TurnTypeEnum MULTI = new TurnTypeEnum("multi");

        private static final Map<String, TurnTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TurnTypeEnum> createStaticFields() {
            Map<String, TurnTypeEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("multi", MULTI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TurnTypeEnum(String value) {
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
        public static TurnTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TurnTypeEnum(value));
        }

        public static TurnTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TurnTypeEnum) {
                return this.value.equals(((TurnTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turn_type")

    private List<TurnTypeEnum> turnType = null;

    /**
     * Gets or Sets evaluatorContentType
     */
    public static final class EvaluatorContentTypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final EvaluatorContentTypeEnum TEXT = new EvaluatorContentTypeEnum("text");

        /**
         * Enum TRAJECTORY for value: "trajectory"
         */
        public static final EvaluatorContentTypeEnum TRAJECTORY = new EvaluatorContentTypeEnum("trajectory");

        private static final Map<String, EvaluatorContentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EvaluatorContentTypeEnum> createStaticFields() {
            Map<String, EvaluatorContentTypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("trajectory", TRAJECTORY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EvaluatorContentTypeEnum(String value) {
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
        public static EvaluatorContentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EvaluatorContentTypeEnum(value));
        }

        public static EvaluatorContentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EvaluatorContentTypeEnum) {
                return this.value.equals(((EvaluatorContentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_content_type")

    private List<EvaluatorContentTypeEnum> evaluatorContentType = null;

    /**
     * Gets or Sets evaluatorObjectiveType
     */
    public static final class EvaluatorObjectiveTypeEnum {

        /**
         * Enum TASK_COMPLETION for value: "TASK_COMPLETION"
         */
        public static final EvaluatorObjectiveTypeEnum TASK_COMPLETION =
            new EvaluatorObjectiveTypeEnum("TASK_COMPLETION");

        /**
         * Enum OUTPUT_QUALITY for value: "OUTPUT_QUALITY"
         */
        public static final EvaluatorObjectiveTypeEnum OUTPUT_QUALITY =
            new EvaluatorObjectiveTypeEnum("OUTPUT_QUALITY");

        /**
         * Enum SECURITY for value: "SECURITY"
         */
        public static final EvaluatorObjectiveTypeEnum SECURITY = new EvaluatorObjectiveTypeEnum("SECURITY");

        /**
         * Enum TOOL_INVOCATION for value: "TOOL_INVOCATION"
         */
        public static final EvaluatorObjectiveTypeEnum TOOL_INVOCATION =
            new EvaluatorObjectiveTypeEnum("TOOL_INVOCATION");

        /**
         * Enum TRAJECTORY_QUALITY for value: "TRAJECTORY_QUALITY"
         */
        public static final EvaluatorObjectiveTypeEnum TRAJECTORY_QUALITY =
            new EvaluatorObjectiveTypeEnum("TRAJECTORY_QUALITY");

        private static final Map<String, EvaluatorObjectiveTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EvaluatorObjectiveTypeEnum> createStaticFields() {
            Map<String, EvaluatorObjectiveTypeEnum> map = new HashMap<>();
            map.put("TASK_COMPLETION", TASK_COMPLETION);
            map.put("OUTPUT_QUALITY", OUTPUT_QUALITY);
            map.put("SECURITY", SECURITY);
            map.put("TOOL_INVOCATION", TOOL_INVOCATION);
            map.put("TRAJECTORY_QUALITY", TRAJECTORY_QUALITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EvaluatorObjectiveTypeEnum(String value) {
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
        public static EvaluatorObjectiveTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new EvaluatorObjectiveTypeEnum(value));
        }

        public static EvaluatorObjectiveTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EvaluatorObjectiveTypeEnum) {
                return this.value.equals(((EvaluatorObjectiveTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_objective_type")

    private List<EvaluatorObjectiveTypeEnum> evaluatorObjectiveType = null;

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions withEvaluatorType(
        List<EvaluatorTypeEnum> evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions addEvaluatorTypeItem(
        EvaluatorTypeEnum evaluatorTypeItem) {
        if (this.evaluatorType == null) {
            this.evaluatorType = new ArrayList<>();
        }
        this.evaluatorType.add(evaluatorTypeItem);
        return this;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions withEvaluatorType(
        Consumer<List<EvaluatorTypeEnum>> evaluatorTypeSetter) {
        if (this.evaluatorType == null) {
            this.evaluatorType = new ArrayList<>();
        }
        evaluatorTypeSetter.accept(this.evaluatorType);
        return this;
    }

    /**
     * **参数解释：** 评估器类型筛选项。  **约束限制：** 至少包含 1 个选项，最多包含 3 个选项。  **取值范围：** - 1: 模型判定 - 2: 代码判定 - 3: 自适应判定  **默认取值：** 不涉及。 
     * @return evaluatorType
     */
    public List<EvaluatorTypeEnum> getEvaluatorType() {
        return evaluatorType;
    }

    public void setEvaluatorType(List<EvaluatorTypeEnum> evaluatorType) {
        this.evaluatorType = evaluatorType;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions withTurnType(List<TurnTypeEnum> turnType) {
        this.turnType = turnType;
        return this;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions addTurnTypeItem(TurnTypeEnum turnTypeItem) {
        if (this.turnType == null) {
            this.turnType = new ArrayList<>();
        }
        this.turnType.add(turnTypeItem);
        return this;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions withTurnType(
        Consumer<List<TurnTypeEnum>> turnTypeSetter) {
        if (this.turnType == null) {
            this.turnType = new ArrayList<>();
        }
        turnTypeSetter.accept(this.turnType);
        return this;
    }

    /**
     * **参数解释：** 对话轮次类型筛选项。  **约束限制：** 至少包含 1 个选项，最多包含 2 个选项。  **取值范围：** - single: 单轮对话 - multi: 多轮对话  **默认取值：** 不涉及。 
     * @return turnType
     */
    public List<TurnTypeEnum> getTurnType() {
        return turnType;
    }

    public void setTurnType(List<TurnTypeEnum> turnType) {
        this.turnType = turnType;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions withEvaluatorContentType(
        List<EvaluatorContentTypeEnum> evaluatorContentType) {
        this.evaluatorContentType = evaluatorContentType;
        return this;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions addEvaluatorContentTypeItem(
        EvaluatorContentTypeEnum evaluatorContentTypeItem) {
        if (this.evaluatorContentType == null) {
            this.evaluatorContentType = new ArrayList<>();
        }
        this.evaluatorContentType.add(evaluatorContentTypeItem);
        return this;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions withEvaluatorContentType(
        Consumer<List<EvaluatorContentTypeEnum>> evaluatorContentTypeSetter) {
        if (this.evaluatorContentType == null) {
            this.evaluatorContentType = new ArrayList<>();
        }
        evaluatorContentTypeSetter.accept(this.evaluatorContentType);
        return this;
    }

    /**
     * **参数解释：** 评估内容类型筛选项。  **约束限制：** 至少包含 1 个选项，最多包含 2 个选项。  **取值范围：** - text: 文本 - trajectory: 轨迹  **默认取值：** 不涉及。 
     * @return evaluatorContentType
     */
    public List<EvaluatorContentTypeEnum> getEvaluatorContentType() {
        return evaluatorContentType;
    }

    public void setEvaluatorContentType(List<EvaluatorContentTypeEnum> evaluatorContentType) {
        this.evaluatorContentType = evaluatorContentType;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions withEvaluatorObjectiveType(
        List<EvaluatorObjectiveTypeEnum> evaluatorObjectiveType) {
        this.evaluatorObjectiveType = evaluatorObjectiveType;
        return this;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions addEvaluatorObjectiveTypeItem(
        EvaluatorObjectiveTypeEnum evaluatorObjectiveTypeItem) {
        if (this.evaluatorObjectiveType == null) {
            this.evaluatorObjectiveType = new ArrayList<>();
        }
        this.evaluatorObjectiveType.add(evaluatorObjectiveTypeItem);
        return this;
    }

    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions withEvaluatorObjectiveType(
        Consumer<List<EvaluatorObjectiveTypeEnum>> evaluatorObjectiveTypeSetter) {
        if (this.evaluatorObjectiveType == null) {
            this.evaluatorObjectiveType = new ArrayList<>();
        }
        evaluatorObjectiveTypeSetter.accept(this.evaluatorObjectiveType);
        return this;
    }

    /**
     * **参数解释：** 评估目标类型筛选项。  **约束限制：** 至少包含 1 个选项，最多包含 5 个选项。  **取值范围：** - TASK_COMPLETION: 评估任务是否完成 - OUTPUT_QUALITY: 评估输出内容的质量 - SECURITY: 评估内容安全性 - TOOL_INVOCATION: 评估工具调用的合理性 - TRAJECTORY_QUALITY: 评估 Agent 轨迹的质量  **默认取值：** 不涉及。 
     * @return evaluatorObjectiveType
     */
    public List<EvaluatorObjectiveTypeEnum> getEvaluatorObjectiveType() {
        return evaluatorObjectiveType;
    }

    public void setEvaluatorObjectiveType(List<EvaluatorObjectiveTypeEnum> evaluatorObjectiveType) {
        this.evaluatorObjectiveType = evaluatorObjectiveType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions that =
            (ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions) obj;
        return Objects.equals(this.evaluatorType, that.evaluatorType) && Objects.equals(this.turnType, that.turnType)
            && Objects.equals(this.evaluatorContentType, that.evaluatorContentType)
            && Objects.equals(this.evaluatorObjectiveType, that.evaluatorObjectiveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorType, turnType, evaluatorContentType, evaluatorObjectiveType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions {\n");
        sb.append("    evaluatorType: ").append(toIndentedString(evaluatorType)).append("\n");
        sb.append("    turnType: ").append(toIndentedString(turnType)).append("\n");
        sb.append("    evaluatorContentType: ").append(toIndentedString(evaluatorContentType)).append("\n");
        sb.append("    evaluatorObjectiveType: ").append(toIndentedString(evaluatorObjectiveType)).append("\n");
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
