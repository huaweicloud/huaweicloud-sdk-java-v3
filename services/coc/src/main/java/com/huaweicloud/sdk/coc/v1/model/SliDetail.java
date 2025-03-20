package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Sli的详细信息
 */
public class SliDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_id")

    private Integer sortId;

    /**
     * SLI类型 REQUEST 请求型SLI指标 INSTANCES 实例型SLI指标
     */
    public static final class SliTypeEnum {

        /**
         * Enum REQUEST for value: "REQUEST"
         */
        public static final SliTypeEnum REQUEST = new SliTypeEnum("REQUEST");

        /**
         * Enum INSTANCES for value: "INSTANCES"
         */
        public static final SliTypeEnum INSTANCES = new SliTypeEnum("INSTANCES");

        private static final Map<String, SliTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SliTypeEnum> createStaticFields() {
            Map<String, SliTypeEnum> map = new HashMap<>();
            map.put("REQUEST", REQUEST);
            map.put("INSTANCES", INSTANCES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SliTypeEnum(String value) {
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
        public static SliTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SliTypeEnum(value));
        }

        public static SliTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SliTypeEnum) {
                return this.value.equals(((SliTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sli_type")

    private SliTypeEnum sliType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 比较符 LESS_THAN 小于 LESS_THAN_OR_EQUAL_TO 小于等于 EQUALS 等于 GREATER_THAN 大于 GREATER_THAN_OR_EQUAL_TO 大于等于
     */
    public static final class ComparisonOperatorEnum {

        /**
         * Enum GREATER_THAN for value: "GREATER_THAN"
         */
        public static final ComparisonOperatorEnum GREATER_THAN = new ComparisonOperatorEnum("GREATER_THAN");

        /**
         * Enum GREATER_THAN_OR_EQUAL_TO for value: "GREATER_THAN_OR_EQUAL_TO"
         */
        public static final ComparisonOperatorEnum GREATER_THAN_OR_EQUAL_TO =
            new ComparisonOperatorEnum("GREATER_THAN_OR_EQUAL_TO");

        /**
         * Enum EQUALS for value: "EQUALS"
         */
        public static final ComparisonOperatorEnum EQUALS = new ComparisonOperatorEnum("EQUALS");

        /**
         * Enum LESS_THAN for value: "LESS_THAN"
         */
        public static final ComparisonOperatorEnum LESS_THAN = new ComparisonOperatorEnum("LESS_THAN");

        /**
         * Enum LESS_THAN_OR_EQUAL_TO for value: "LESS_THAN_OR_EQUAL_TO"
         */
        public static final ComparisonOperatorEnum LESS_THAN_OR_EQUAL_TO =
            new ComparisonOperatorEnum("LESS_THAN_OR_EQUAL_TO");

        private static final Map<String, ComparisonOperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ComparisonOperatorEnum> createStaticFields() {
            Map<String, ComparisonOperatorEnum> map = new HashMap<>();
            map.put("GREATER_THAN", GREATER_THAN);
            map.put("GREATER_THAN_OR_EQUAL_TO", GREATER_THAN_OR_EQUAL_TO);
            map.put("EQUALS", EQUALS);
            map.put("LESS_THAN", LESS_THAN);
            map.put("LESS_THAN_OR_EQUAL_TO", LESS_THAN_OR_EQUAL_TO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ComparisonOperatorEnum(String value) {
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
        public static ComparisonOperatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComparisonOperatorEnum(value));
        }

        public static ComparisonOperatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ComparisonOperatorEnum) {
                return this.value.equals(((ComparisonOperatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparison_operator")

    private ComparisonOperatorEnum comparisonOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "numerical_value")

    private Double numericalValue;

    /**
     * 单位 PERCENT_SIGN 百分号 MILLISECONDS 毫秒 NUMBER_OF_REQUESTS_PER_SECOND 每秒请求数量
     */
    public static final class UnitEnum {

        /**
         * Enum PERCENT_SIGN for value: "PERCENT_SIGN"
         */
        public static final UnitEnum PERCENT_SIGN = new UnitEnum("PERCENT_SIGN");

        /**
         * Enum MILLISECONDS for value: "MILLISECONDS"
         */
        public static final UnitEnum MILLISECONDS = new UnitEnum("MILLISECONDS");

        /**
         * Enum NUMBER_OF_REQUESTS_PER_SECOND for value: "NUMBER_OF_REQUESTS_PER_SECOND"
         */
        public static final UnitEnum NUMBER_OF_REQUESTS_PER_SECOND = new UnitEnum("NUMBER_OF_REQUESTS_PER_SECOND");

        private static final Map<String, UnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UnitEnum> createStaticFields() {
            Map<String, UnitEnum> map = new HashMap<>();
            map.put("PERCENT_SIGN", PERCENT_SIGN);
            map.put("MILLISECONDS", MILLISECONDS);
            map.put("NUMBER_OF_REQUESTS_PER_SECOND", NUMBER_OF_REQUESTS_PER_SECOND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UnitEnum(String value) {
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
        public static UnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UnitEnum(value));
        }

        public static UnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UnitEnum) {
                return this.value.equals(((UnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private UnitEnum unit;

    public SliDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * SLi的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SliDetail withSortId(Integer sortId) {
        this.sortId = sortId;
        return this;
    }

    /**
     * 顺序
     * minimum: 0
     * maximum: 50
     * @return sortId
     */
    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public SliDetail withSliType(SliTypeEnum sliType) {
        this.sliType = sliType;
        return this;
    }

    /**
     * SLI类型 REQUEST 请求型SLI指标 INSTANCES 实例型SLI指标
     * @return sliType
     */
    public SliTypeEnum getSliType() {
        return sliType;
    }

    public void setSliType(SliTypeEnum sliType) {
        this.sliType = sliType;
    }

    public SliDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * SLI名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SliDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SLI描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SliDetail withComparisonOperator(ComparisonOperatorEnum comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * 比较符 LESS_THAN 小于 LESS_THAN_OR_EQUAL_TO 小于等于 EQUALS 等于 GREATER_THAN 大于 GREATER_THAN_OR_EQUAL_TO 大于等于
     * @return comparisonOperator
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(ComparisonOperatorEnum comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public SliDetail withNumericalValue(Double numericalValue) {
        this.numericalValue = numericalValue;
        return this;
    }

    /**
     * 数值
     * minimum: 0
     * maximum: 1E+4
     * @return numericalValue
     */
    public Double getNumericalValue() {
        return numericalValue;
    }

    public void setNumericalValue(Double numericalValue) {
        this.numericalValue = numericalValue;
    }

    public SliDetail withUnit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位 PERCENT_SIGN 百分号 MILLISECONDS 毫秒 NUMBER_OF_REQUESTS_PER_SECOND 每秒请求数量
     * @return unit
     */
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SliDetail that = (SliDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sortId, that.sortId)
            && Objects.equals(this.sliType, that.sliType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.comparisonOperator, that.comparisonOperator)
            && Objects.equals(this.numericalValue, that.numericalValue) && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sortId, sliType, name, description, comparisonOperator, numericalValue, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SliDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sortId: ").append(toIndentedString(sortId)).append("\n");
        sb.append("    sliType: ").append(toIndentedString(sliType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    numericalValue: ").append(toIndentedString(numericalValue)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
