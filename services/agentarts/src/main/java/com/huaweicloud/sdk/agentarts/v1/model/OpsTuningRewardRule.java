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
 * 奖励规则。
 */
public class OpsTuningRewardRule {

    /**
     * **参数解释：** 规则名称，对应具体的奖励计算逻辑。  **约束限制：** 不涉及  **取值范围：** 思维链式奖励think_format_reward，精准匹配奖励exact_match_reward，数值匹配奖励math_correctness_reward。  **默认取值：** 无
     */
    public static final class FunctionNameEnum {

        /**
         * Enum THINK_FORMAT_REWARD for value: "think_format_reward"
         */
        public static final FunctionNameEnum THINK_FORMAT_REWARD = new FunctionNameEnum("think_format_reward");

        /**
         * Enum EXACT_MATCH_REWARD for value: "exact_match_reward"
         */
        public static final FunctionNameEnum EXACT_MATCH_REWARD = new FunctionNameEnum("exact_match_reward");

        /**
         * Enum MATH_CORRECTNESS_REWARD for value: "math_correctness_reward"
         */
        public static final FunctionNameEnum MATH_CORRECTNESS_REWARD = new FunctionNameEnum("math_correctness_reward");

        private static final Map<String, FunctionNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FunctionNameEnum> createStaticFields() {
            Map<String, FunctionNameEnum> map = new HashMap<>();
            map.put("think_format_reward", THINK_FORMAT_REWARD);
            map.put("exact_match_reward", EXACT_MATCH_REWARD);
            map.put("math_correctness_reward", MATH_CORRECTNESS_REWARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FunctionNameEnum(String value) {
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
        public static FunctionNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FunctionNameEnum(value));
        }

        public static FunctionNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FunctionNameEnum) {
                return this.value.equals(((FunctionNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_name")

    private FunctionNameEnum functionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Double weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex")

    private String regex;

    public OpsTuningRewardRule withFunctionName(FunctionNameEnum functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * **参数解释：** 规则名称，对应具体的奖励计算逻辑。  **约束限制：** 不涉及  **取值范围：** 思维链式奖励think_format_reward，精准匹配奖励exact_match_reward，数值匹配奖励math_correctness_reward。  **默认取值：** 无
     * @return functionName
     */
    public FunctionNameEnum getFunctionName() {
        return functionName;
    }

    public void setFunctionName(FunctionNameEnum functionName) {
        this.functionName = functionName;
    }

    public OpsTuningRewardRule withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 权重，表示该规则在总奖励中的占比。  **约束限制：** 不涉及  **取值范围：** 0.0到1.0之间的浮点数。  **默认取值：** 无
     * minimum: 0
     * maximum: 1
     * @return weight
     */
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public OpsTuningRewardRule withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * **参数解释：** 正则表达式，用于匹配模型输出的特定格式。  **约束限制：** 不涉及  **取值范围：** 合法的正则表达式字符串。  **默认取值：** 无
     * @return regex
     */
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTuningRewardRule that = (OpsTuningRewardRule) obj;
        return Objects.equals(this.functionName, that.functionName) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.regex, that.regex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionName, weight, regex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTuningRewardRule {\n");
        sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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
