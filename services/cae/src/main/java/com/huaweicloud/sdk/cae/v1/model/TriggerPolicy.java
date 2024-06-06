package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TriggerPolicy
 */
public class TriggerPolicy {

    /**
     * 触发类型，accumulative: 累计触发，immediately: 立即触发。
     */
    public static final class TriggerTypeEnum {

        /**
         * Enum ACCUMULATIVE for value: "accumulative"
         */
        public static final TriggerTypeEnum ACCUMULATIVE = new TriggerTypeEnum("accumulative");

        /**
         * Enum IMMEDIATELY for value: "immediately"
         */
        public static final TriggerTypeEnum IMMEDIATELY = new TriggerTypeEnum("immediately");

        private static final Map<String, TriggerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeEnum> createStaticFields() {
            Map<String, TriggerTypeEnum> map = new HashMap<>();
            map.put("accumulative", ACCUMULATIVE);
            map.put("immediately", IMMEDIATELY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerTypeEnum(String value) {
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
        public static TriggerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TriggerTypeEnum(value));
        }

        public static TriggerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerTypeEnum) {
                return this.value.equals(((TriggerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private TriggerTypeEnum triggerType;

    /**
     * 触发周期，选择累计触发时需设置该参数，默认单位为s，支持5分钟、20分钟、1小时、4小时、24小时。
     */
    public static final class PeriodEnum {

        /**
         * Enum NUMBER_300 for value: 300
         */
        public static final PeriodEnum NUMBER_300 = new PeriodEnum(300);

        /**
         * Enum NUMBER_1200 for value: 1200
         */
        public static final PeriodEnum NUMBER_1200 = new PeriodEnum(1200);

        /**
         * Enum NUMBER_3600 for value: 3600
         */
        public static final PeriodEnum NUMBER_3600 = new PeriodEnum(3600);

        /**
         * Enum NUMBER_14400 for value: 14400
         */
        public static final PeriodEnum NUMBER_14400 = new PeriodEnum(14400);

        /**
         * Enum NUMBER_86400 for value: 86400
         */
        public static final PeriodEnum NUMBER_86400 = new PeriodEnum(86400);

        private static final Map<Integer, PeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PeriodEnum> createStaticFields() {
            Map<Integer, PeriodEnum> map = new HashMap<>();
            map.put(300, NUMBER_300);
            map.put(1200, NUMBER_1200);
            map.put(3600, NUMBER_3600);
            map.put(14400, NUMBER_14400);
            map.put(86400, NUMBER_86400);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PeriodEnum(Integer value) {
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
        public static PeriodEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodEnum(value));
        }

        public static PeriodEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodEnum) {
                return this.value.equals(((PeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private PeriodEnum period;

    /**
     * 比较符，支持'>'和'>='。
     */
    public static final class OperatorEnum {

        /**
         * Enum GREATER_THAN for value: ">"
         */
        public static final OperatorEnum GREATER_THAN = new OperatorEnum(">");

        /**
         * Enum GREATER_THAN_OR_EQUAL_TO for value: ">="
         */
        public static final OperatorEnum GREATER_THAN_OR_EQUAL_TO = new OperatorEnum(">=");

        private static final Map<String, OperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatorEnum> createStaticFields() {
            Map<String, OperatorEnum> map = new HashMap<>();
            map.put(">", GREATER_THAN);
            map.put(">=", GREATER_THAN_OR_EQUAL_TO);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public TriggerPolicy withTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发类型，accumulative: 累计触发，immediately: 立即触发。
     * @return triggerType
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
    }

    public TriggerPolicy withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    /**
     * 触发周期，选择累计触发时需设置该参数，默认单位为s，支持5分钟、20分钟、1小时、4小时、24小时。
     * @return period
     */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    public TriggerPolicy withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 比较符，支持'>'和'>='。
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public TriggerPolicy withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 触发次数，选择累计触发时需设置该参数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerPolicy that = (TriggerPolicy) obj;
        return Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.period, that.period)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerType, period, operator, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerPolicy {\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
