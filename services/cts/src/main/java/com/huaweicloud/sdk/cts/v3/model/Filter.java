package com.huaweicloud.sdk.cts.v3.model;

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
 * 关键操作通知高级筛选条件。
 */
public class Filter {

    /**
     * 多条件关系。 - AND 表示所有过滤条件满足后生效。 - OR 表示有任意一个条件满足时生效。
     */
    public static final class ConditionEnum {

        /**
         * Enum AND for value: "AND"
         */
        public static final ConditionEnum AND = new ConditionEnum("AND");

        /**
         * Enum OR for value: "OR"
         */
        public static final ConditionEnum OR = new ConditionEnum("OR");

        private static final Map<String, ConditionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionEnum> createStaticFields() {
            Map<String, ConditionEnum> map = new HashMap<>();
            map.put("AND", AND);
            map.put("OR", OR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionEnum(String value) {
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
        public static ConditionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConditionEnum(value));
        }

        public static ConditionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionEnum) {
                return this.value.equals(((ConditionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private ConditionEnum condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_filter")

    private Boolean isSupportFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private List<String> rule = null;

    public Filter withCondition(ConditionEnum condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 多条件关系。 - AND 表示所有过滤条件满足后生效。 - OR 表示有任意一个条件满足时生效。
     * @return condition
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionEnum condition) {
        this.condition = condition;
    }

    public Filter withIsSupportFilter(Boolean isSupportFilter) {
        this.isSupportFilter = isSupportFilter;
        return this;
    }

    /**
     * 是否打开高级筛选开关。
     * @return isSupportFilter
     */
    public Boolean getIsSupportFilter() {
        return isSupportFilter;
    }

    public void setIsSupportFilter(Boolean isSupportFilter) {
        this.isSupportFilter = isSupportFilter;
    }

    public Filter withRule(List<String> rule) {
        this.rule = rule;
        return this;
    }

    public Filter addRuleItem(String ruleItem) {
        if (this.rule == null) {
            this.rule = new ArrayList<>();
        }
        this.rule.add(ruleItem);
        return this;
    }

    public Filter withRule(Consumer<List<String>> ruleSetter) {
        if (this.rule == null) {
            this.rule = new ArrayList<>();
        }
        ruleSetter.accept(this.rule);
        return this;
    }

    /**
     * 高级过滤条件规则，示例如下：\"key != value\"，格式为：字段 规则 值。 -字段取值范围：api_version,code,trace_rating,trace_type,resource_id,resource_name。 -规则：!= 或 =。 - 值：api_version正则约束：^(a-zA-Z0-9_-.){1,64}$；code：最小长度1，最大长度256；trace_rating枚举值：\"normal\", \"warning\", \"incident\"；trace_type枚举值：\"ConsoleAction\", \"ApiCall\", \"SystemAction\"；resource_id：最小长度1，最大长度350；resource_name：最小长度1，最大长度256
     * @return rule
     */
    public List<String> getRule() {
        return rule;
    }

    public void setRule(List<String> rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Filter that = (Filter) obj;
        return Objects.equals(this.condition, that.condition)
            && Objects.equals(this.isSupportFilter, that.isSupportFilter) && Objects.equals(this.rule, that.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, isSupportFilter, rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Filter {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    isSupportFilter: ").append(toIndentedString(isSupportFilter)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
