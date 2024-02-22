package com.huaweicloud.sdk.functiongraph.v2.model;

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
 * 灰度策略信息
 */
public class VersionStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<VersionStrategyRules> rules = null;

    /**
     * 所有规则聚合方式。and：所有规则都满足，or：满足其中一个
     */
    public static final class CombineTypeEnum {

        /**
         * Enum AND for value: "and"
         */
        public static final CombineTypeEnum AND = new CombineTypeEnum("and");

        /**
         * Enum OR for value: "or"
         */
        public static final CombineTypeEnum OR = new CombineTypeEnum("or");

        private static final Map<String, CombineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CombineTypeEnum> createStaticFields() {
            Map<String, CombineTypeEnum> map = new HashMap<>();
            map.put("and", AND);
            map.put("or", OR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CombineTypeEnum(String value) {
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
        public static CombineTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CombineTypeEnum(value));
        }

        public static CombineTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CombineTypeEnum) {
                return this.value.equals(((CombineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combine_type")

    private CombineTypeEnum combineType;

    public VersionStrategy withRules(List<VersionStrategyRules> rules) {
        this.rules = rules;
        return this;
    }

    public VersionStrategy addRulesItem(VersionStrategyRules rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public VersionStrategy withRules(Consumer<List<VersionStrategyRules>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 规则列表
     * @return rules
     */
    public List<VersionStrategyRules> getRules() {
        return rules;
    }

    public void setRules(List<VersionStrategyRules> rules) {
        this.rules = rules;
    }

    public VersionStrategy withCombineType(CombineTypeEnum combineType) {
        this.combineType = combineType;
        return this;
    }

    /**
     * 所有规则聚合方式。and：所有规则都满足，or：满足其中一个
     * @return combineType
     */
    public CombineTypeEnum getCombineType() {
        return combineType;
    }

    public void setCombineType(CombineTypeEnum combineType) {
        this.combineType = combineType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionStrategy that = (VersionStrategy) obj;
        return Objects.equals(this.rules, that.rules) && Objects.equals(this.combineType, that.combineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rules, combineType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionStrategy {\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    combineType: ").append(toIndentedString(combineType)).append("\n");
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
