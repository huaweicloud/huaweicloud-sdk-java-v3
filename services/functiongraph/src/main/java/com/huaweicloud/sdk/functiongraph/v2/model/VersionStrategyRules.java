package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VersionStrategyRules
 */
public class VersionStrategyRules {

    /**
     * 参数类型。
     */
    public static final class RuleTypeEnum {

        /**
         * Enum HEADER for value: "header"
         */
        public static final RuleTypeEnum HEADER = new RuleTypeEnum("header");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final RuleTypeEnum COOKIE = new RuleTypeEnum("cookie");

        private static final Map<String, RuleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuleTypeEnum> createStaticFields() {
            Map<String, RuleTypeEnum> map = new HashMap<>();
            map.put("header", HEADER);
            map.put("cookie", COOKIE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuleTypeEnum(String value) {
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
        public static RuleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuleTypeEnum(value));
        }

        public static RuleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuleTypeEnum) {
                return this.value.equals(((RuleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private RuleTypeEnum ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param")

    private String param;

    /**
     * 规则匹配操作符，目前仅需支持 = 或者in。
     */
    public static final class OpEnum {

        /**
         * Enum IN for value: "in"
         */
        public static final OpEnum IN = new OpEnum("in");

        /**
         * Enum EQUAL for value: "="
         */
        public static final OpEnum EQUAL = new OpEnum("=");

        private static final Map<String, OpEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OpEnum> createStaticFields() {
            Map<String, OpEnum> map = new HashMap<>();
            map.put("in", IN);
            map.put("=", EQUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OpEnum(String value) {
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
        public static OpEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OpEnum(value));
        }

        public static OpEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OpEnum) {
                return this.value.equals(((OpEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op")

    private OpEnum op;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public VersionStrategyRules withRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 参数类型。
     * @return ruleType
     */
    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    public VersionStrategyRules withParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * 规则参数名, 只支持大小写字母，数字，下划线，中划线。
     * @return param
     */
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public VersionStrategyRules withOp(OpEnum op) {
        this.op = op;
        return this;
    }

    /**
     * 规则匹配操作符，目前仅需支持 = 或者in。
     * @return op
     */
    public OpEnum getOp() {
        return op;
    }

    public void setOp(OpEnum op) {
        this.op = op;
    }

    public VersionStrategyRules withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 规则值，如果op为in，则为逗号分隔的多值字符串
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionStrategyRules that = (VersionStrategyRules) obj;
        return Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.param, that.param)
            && Objects.equals(this.op, that.op) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleType, param, op, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionStrategyRules {\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
        sb.append("    op: ").append(toIndentedString(op)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
