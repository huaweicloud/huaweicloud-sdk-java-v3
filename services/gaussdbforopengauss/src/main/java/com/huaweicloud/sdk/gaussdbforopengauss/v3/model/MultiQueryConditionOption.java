package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * MultiQueryConditionOption
 */
public class MultiQueryConditionOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释**: 组合条件类型。 **约束限制**: 不涉及。 **取值范围**: 仅限字符串：\"AND\"、\"OR\"。 **默认取值**: 不涉及。
     */
    public static final class ConditionEnum {

        /**
         * Enum OR for value: "OR"
         */
        public static final ConditionEnum OR = new ConditionEnum("OR");

        /**
         * Enum AND for value: "AND"
         */
        public static final ConditionEnum AND = new ConditionEnum("AND");

        private static final Map<String, ConditionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionEnum> createStaticFields() {
            Map<String, ConditionEnum> map = new HashMap<>();
            map.put("OR", OR);
            map.put("AND", AND);
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
    @JsonProperty(value = "is_fuzzy")

    private Boolean isFuzzy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    public MultiQueryConditionOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 查询字段名称。 **约束限制**： 只支持字符串\"query\"。 **取值范围**： 由英文字母（大小写）、数字或下划线组成，长度为 1 至 128 个字符。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultiQueryConditionOption withCondition(ConditionEnum condition) {
        this.condition = condition;
        return this;
    }

    /**
     * **参数解释**: 组合条件类型。 **约束限制**: 不涉及。 **取值范围**: 仅限字符串：\"AND\"、\"OR\"。 **默认取值**: 不涉及。
     * @return condition
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionEnum condition) {
        this.condition = condition;
    }

    public MultiQueryConditionOption withIsFuzzy(Boolean isFuzzy) {
        this.isFuzzy = isFuzzy;
        return this;
    }

    /**
     * **参数解释**: 多个过滤检索条件内容集合。 **约束限制**: 只支持为true进行模糊查询。 **取值范围**: - true：模糊查询。 - false：精确匹配。  **默认取值**: true 
     * @return isFuzzy
     */
    public Boolean getIsFuzzy() {
        return isFuzzy;
    }

    public void setIsFuzzy(Boolean isFuzzy) {
        this.isFuzzy = isFuzzy;
    }

    public MultiQueryConditionOption withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public MultiQueryConditionOption addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public MultiQueryConditionOption withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * **参数解释**: 多个过滤检索条件内容集合。由 1 至 5 个字符串组成的列表。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiQueryConditionOption that = (MultiQueryConditionOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.isFuzzy, that.isFuzzy) && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, condition, isFuzzy, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiQueryConditionOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    isFuzzy: ").append(toIndentedString(isFuzzy)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
