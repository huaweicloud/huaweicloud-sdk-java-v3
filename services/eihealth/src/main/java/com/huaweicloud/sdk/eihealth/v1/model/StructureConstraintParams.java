package com.huaweicloud.sdk.eihealth.v1.model;

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
 * 结构约束参数
 */
public class StructureConstraintParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structs")

    private List<String> structs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive")

    private Boolean exclusive;

    /**
     * 多个子结构之间的逻辑关系
     */
    public static final class OperatorEnum {

        /**
         * Enum OR for value: "or"
         */
        public static final OperatorEnum OR = new OperatorEnum("or");

        /**
         * Enum AND for value: "and"
         */
        public static final OperatorEnum AND = new OperatorEnum("and");

        private static final Map<String, OperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatorEnum> createStaticFields() {
            Map<String, OperatorEnum> map = new HashMap<>();
            map.put("or", OR);
            map.put("and", AND);
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

    public StructureConstraintParams withStructs(List<String> structs) {
        this.structs = structs;
        return this;
    }

    public StructureConstraintParams addStructsItem(String structsItem) {
        if (this.structs == null) {
            this.structs = new ArrayList<>();
        }
        this.structs.add(structsItem);
        return this;
    }

    public StructureConstraintParams withStructs(Consumer<List<String>> structsSetter) {
        if (this.structs == null) {
            this.structs = new ArrayList<>();
        }
        structsSetter.accept(this.structs);
        return this;
    }

    /**
     * 子结构SMILES
     * @return structs
     */
    public List<String> getStructs() {
        return structs;
    }

    public void setStructs(List<String> structs) {
        this.structs = structs;
    }

    public StructureConstraintParams withExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }

    /**
     * 是否排除子结构
     * @return exclusive
     */
    public Boolean getExclusive() {
        return exclusive;
    }

    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    public StructureConstraintParams withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 多个子结构之间的逻辑关系
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StructureConstraintParams that = (StructureConstraintParams) obj;
        return Objects.equals(this.structs, that.structs) && Objects.equals(this.exclusive, that.exclusive)
            && Objects.equals(this.operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(structs, exclusive, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructureConstraintParams {\n");
        sb.append("    structs: ").append(toIndentedString(structs)).append("\n");
        sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
