package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 算力滥用阈值条件
 */
public class AbuseCondition {

    /**
     * 算力消耗统计维度。input: 仅输入, output: 仅输出, input_output: 输入+输出。call_count仅支持input
     */
    public static final class DimensionEnum {

        /**
         * Enum INPUT for value: "input"
         */
        public static final DimensionEnum INPUT = new DimensionEnum("input");

        /**
         * Enum OUTPUT for value: "output"
         */
        public static final DimensionEnum OUTPUT = new DimensionEnum("output");

        /**
         * Enum INPUT_OUTPUT for value: "input_output"
         */
        public static final DimensionEnum INPUT_OUTPUT = new DimensionEnum("input_output");

        private static final Map<String, DimensionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DimensionEnum> createStaticFields() {
            Map<String, DimensionEnum> map = new HashMap<>();
            map.put("input", INPUT);
            map.put("output", OUTPUT);
            map.put("input_output", INPUT_OUTPUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DimensionEnum(String value) {
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
        public static DimensionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DimensionEnum(value));
        }

        public static DimensionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DimensionEnum) {
                return this.value.equals(((DimensionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private DimensionEnum dimension;

    /**
     * 阈值指标类型。call_count: 调用次数, char_count: 字符数
     */
    public static final class MetricEnum {

        /**
         * Enum CALL_COUNT for value: "call_count"
         */
        public static final MetricEnum CALL_COUNT = new MetricEnum("call_count");

        /**
         * Enum CHAR_COUNT for value: "char_count"
         */
        public static final MetricEnum CHAR_COUNT = new MetricEnum("char_count");

        private static final Map<String, MetricEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MetricEnum> createStaticFields() {
            Map<String, MetricEnum> map = new HashMap<>();
            map.put("call_count", CALL_COUNT);
            map.put("char_count", CHAR_COUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MetricEnum(String value) {
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
        public static MetricEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MetricEnum(value));
        }

        public static MetricEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MetricEnum) {
                return this.value.equals(((MetricEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private MetricEnum metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Long value;

    public AbuseCondition withDimension(DimensionEnum dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * 算力消耗统计维度。input: 仅输入, output: 仅输出, input_output: 输入+输出。call_count仅支持input
     * @return dimension
     */
    public DimensionEnum getDimension() {
        return dimension;
    }

    public void setDimension(DimensionEnum dimension) {
        this.dimension = dimension;
    }

    public AbuseCondition withMetric(MetricEnum metric) {
        this.metric = metric;
        return this;
    }

    /**
     * 阈值指标类型。call_count: 调用次数, char_count: 字符数
     * @return metric
     */
    public MetricEnum getMetric() {
        return metric;
    }

    public void setMetric(MetricEnum metric) {
        this.metric = metric;
    }

    public AbuseCondition withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 阈值数值，必须大于0；call_count最大1000000，char_count最大100000000000000
     * minimum: 1
     * maximum: 100000000000000
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
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
        AbuseCondition that = (AbuseCondition) obj;
        return Objects.equals(this.dimension, that.dimension) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimension, metric, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbuseCondition {\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
