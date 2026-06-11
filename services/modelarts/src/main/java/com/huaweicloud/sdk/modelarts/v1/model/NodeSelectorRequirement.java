package com.huaweicloud.sdk.modelarts.v1.model;

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
 * NodeSelectorRequirement
 */
public class NodeSelectorRequirement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    /**
     * **参数解释**：表示键与一组值之间的关系。  **约束限制**：有效的运算符包括 In、NotIn、Exists、DoesNotExist、Gt 和 Lt。 **取值范围**： - In：表示键的值必须在给定的值列表中。例如，如果键是 color，值列表是 [\"red\", \"blue\"]，那么 color In [\"red\", \"blue\"] 表示 color 的值必须是 red 或 blue。 - NotIn：表示键的值不能在给定的值列表中。例如，color NotIn [\"red\", \"blue\"] 表示 color 的值不能是 red 或 blue。 - Exists：表示键必须存在，但对其值没有特定要求。例如，color Exists 表示必须存在 color 这个键，无论其值是什么。 - DoesNotExist：表示键不能存在。例如，color DoesNotExist 表示不能存在 color 这个键。 - Gt：表示键的值必须大于给定的值。例如，如果键是 age，age Gt 18 表示 age 的值必须大于 18。 - Lt：表示键的值必须小于给定的值。例如，age Lt 18 表示 age 的值必须小于 18。 **默认取值**：不涉及。
     */
    public static final class OperatorEnum {

        /**
         * Enum IN for value: "In"
         */
        public static final OperatorEnum IN = new OperatorEnum("In");

        /**
         * Enum NOTIN for value: "NotIn"
         */
        public static final OperatorEnum NOTIN = new OperatorEnum("NotIn");

        /**
         * Enum EXISTS for value: "Exists"
         */
        public static final OperatorEnum EXISTS = new OperatorEnum("Exists");

        /**
         * Enum DOESNOTEXIST for value: "DoesNotExist"
         */
        public static final OperatorEnum DOESNOTEXIST = new OperatorEnum("DoesNotExist");

        /**
         * Enum GT for value: "Gt"
         */
        public static final OperatorEnum GT = new OperatorEnum("Gt");

        /**
         * Enum LT for value: "Lt"
         */
        public static final OperatorEnum LT = new OperatorEnum("Lt");

        private static final Map<String, OperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatorEnum> createStaticFields() {
            Map<String, OperatorEnum> map = new HashMap<>();
            map.put("In", IN);
            map.put("NotIn", NOTIN);
            map.put("Exists", EXISTS);
            map.put("DoesNotExist", DOESNOTEXIST);
            map.put("Gt", GT);
            map.put("Lt", LT);
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
    @JsonProperty(value = "values")

    private List<String> values = null;

    public NodeSelectorRequirement withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**：选择器应用的标签键。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public NodeSelectorRequirement withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释**：表示键与一组值之间的关系。  **约束限制**：有效的运算符包括 In、NotIn、Exists、DoesNotExist、Gt 和 Lt。 **取值范围**： - In：表示键的值必须在给定的值列表中。例如，如果键是 color，值列表是 [\"red\", \"blue\"]，那么 color In [\"red\", \"blue\"] 表示 color 的值必须是 red 或 blue。 - NotIn：表示键的值不能在给定的值列表中。例如，color NotIn [\"red\", \"blue\"] 表示 color 的值不能是 red 或 blue。 - Exists：表示键必须存在，但对其值没有特定要求。例如，color Exists 表示必须存在 color 这个键，无论其值是什么。 - DoesNotExist：表示键不能存在。例如，color DoesNotExist 表示不能存在 color 这个键。 - Gt：表示键的值必须大于给定的值。例如，如果键是 age，age Gt 18 表示 age 的值必须大于 18。 - Lt：表示键的值必须小于给定的值。例如，age Lt 18 表示 age 的值必须小于 18。 **默认取值**：不涉及。
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public NodeSelectorRequirement withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public NodeSelectorRequirement addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public NodeSelectorRequirement withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * **参数解释**：一个字符串值数组。 **约束限制**：如果操作符是“In”或“NotIn”，则该值数组不能为空。如果操作符是“Exists”或“DoesNotExist”，则该值数组必须为空。如果操作符是“Gt”或“Lt”，则该值数组必须包含一个元素，该元素将被解释为整数。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
        NodeSelectorRequirement that = (NodeSelectorRequirement) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, operator, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSelectorRequirement {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
