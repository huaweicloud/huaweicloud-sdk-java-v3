package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AlertRuleTrigger
 */
public class AlertRuleTrigger {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accumulated_times")

    private Integer accumulatedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    /**
     * **参数解释**: 指标模式 - COUNT 数量  **约束限制** 不涉及 **取值范围**: - COUNT  **默认值** 不涉及
     */
    public static final class ModeEnum {

        /**
         * Enum COUNT for value: "COUNT"
         */
        public static final ModeEnum COUNT = new ModeEnum("COUNT");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("COUNT", COUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    /**
     * **参数解释**: 操作符类型 - GT 大于 - LT 小于 - EQ 等于 - NE 不等于  **约束限制** 不涉及 **取值范围**: - GT - LT - EQ - NE  **默认值** 不涉及
     */
    public static final class OperatorEnum {

        /**
         * Enum EQ for value: "EQ"
         */
        public static final OperatorEnum EQ = new OperatorEnum("EQ");

        /**
         * Enum NE for value: "NE"
         */
        public static final OperatorEnum NE = new OperatorEnum("NE");

        /**
         * Enum GT for value: "GT"
         */
        public static final OperatorEnum GT = new OperatorEnum("GT");

        /**
         * Enum LT for value: "LT"
         */
        public static final OperatorEnum LT = new OperatorEnum("LT");

        private static final Map<String, OperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatorEnum> createStaticFields() {
            Map<String, OperatorEnum> map = new HashMap<>();
            map.put("EQ", EQ);
            map.put("NE", NE);
            map.put("GT", GT);
            map.put("LT", LT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperatorEnum(String value) {
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
        public static OperatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperatorEnum(value));
        }

        public static OperatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperatorEnum) {
                return this.value.equals(((OperatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private OperatorEnum operator;

    /**
     * **参数解释**: 告警等级 - TIPS 提示 - LOW 低危 - MEDIUM 中危 - HIGH 高危 - FATAL 致命  **约束限制** 不涉及 **取值范围**: - TIPS - LOW - MEDIUM - HIGH - FATAL  **默认值** 不涉及
     */
    public static final class SeverityEnum {

        /**
         * Enum TIPS for value: "TIPS"
         */
        public static final SeverityEnum TIPS = new SeverityEnum("TIPS");

        /**
         * Enum LOW for value: "LOW"
         */
        public static final SeverityEnum LOW = new SeverityEnum("LOW");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final SeverityEnum MEDIUM = new SeverityEnum("MEDIUM");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final SeverityEnum HIGH = new SeverityEnum("HIGH");

        /**
         * Enum FATAL for value: "FATAL"
         */
        public static final SeverityEnum FATAL = new SeverityEnum("FATAL");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("TIPS", TIPS);
            map.put("LOW", LOW);
            map.put("MEDIUM", MEDIUM);
            map.put("HIGH", HIGH);
            map.put("FATAL", FATAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    public AlertRuleTrigger withAccumulatedTimes(Integer accumulatedTimes) {
        this.accumulatedTimes = accumulatedTimes;
        return this;
    }

    /**
     * 累计次数
     * minimum: 1
     * maximum: 1000
     * @return accumulatedTimes
     */
    public Integer getAccumulatedTimes() {
        return accumulatedTimes;
    }

    public void setAccumulatedTimes(Integer accumulatedTimes) {
        this.accumulatedTimes = accumulatedTimes;
    }

    public AlertRuleTrigger withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public AlertRuleTrigger withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**: 指标模式 - COUNT 数量  **约束限制** 不涉及 **取值范围**: - COUNT  **默认值** 不涉及
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public AlertRuleTrigger withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释**: 操作符类型 - GT 大于 - LT 小于 - EQ 等于 - NE 不等于  **约束限制** 不涉及 **取值范围**: - GT - LT - EQ - NE  **默认值** 不涉及
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public AlertRuleTrigger withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**: 告警等级 - TIPS 提示 - LOW 低危 - MEDIUM 中危 - HIGH 高危 - FATAL 致命  **约束限制** 不涉及 **取值范围**: - TIPS - LOW - MEDIUM - HIGH - FATAL  **默认值** 不涉及
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertRuleTrigger that = (AlertRuleTrigger) obj;
        return Objects.equals(this.accumulatedTimes, that.accumulatedTimes)
            && Objects.equals(this.expression, that.expression) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.severity, that.severity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accumulatedTimes, expression, mode, operator, severity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertRuleTrigger {\n");
        sb.append("    accumulatedTimes: ").append(toIndentedString(accumulatedTimes)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
