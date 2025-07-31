package com.huaweicloud.sdk.ces.v2.model;

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
 * 组合匹配参数
 */
public class CombRelation {

    /**
     * 逻辑运算符  ALL 所有条件匹配成功  ANY 任意条件匹配成功 
     */
    public static final class LogicalOperatorEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final LogicalOperatorEnum ALL = new LogicalOperatorEnum("ALL");

        /**
         * Enum ANY for value: "ANY"
         */
        public static final LogicalOperatorEnum ANY = new LogicalOperatorEnum("ANY");

        private static final Map<String, LogicalOperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogicalOperatorEnum> createStaticFields() {
            Map<String, LogicalOperatorEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("ANY", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogicalOperatorEnum(String value) {
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
        public static LogicalOperatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogicalOperatorEnum(value));
        }

        public static LogicalOperatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogicalOperatorEnum) {
                return this.value.equals(((LogicalOperatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_operator")

    private LogicalOperatorEnum logicalOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<Condition> conditions = null;

    public CombRelation withLogicalOperator(LogicalOperatorEnum logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }

    /**
     * 逻辑运算符  ALL 所有条件匹配成功  ANY 任意条件匹配成功 
     * @return logicalOperator
     */
    public LogicalOperatorEnum getLogicalOperator() {
        return logicalOperator;
    }

    public void setLogicalOperator(LogicalOperatorEnum logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    public CombRelation withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CombRelation addConditionsItem(Condition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CombRelation withConditions(Consumer<List<Condition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 组合匹配资源分组的匹配条件
     * @return conditions
     */
    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CombRelation that = (CombRelation) obj;
        return Objects.equals(this.logicalOperator, that.logicalOperator)
            && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalOperator, conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CombRelation {\n");
        sb.append("    logicalOperator: ").append(toIndentedString(logicalOperator)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
