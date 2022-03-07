package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Policy */
public class Policy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    /** 周期 */
    public static final class PeriodEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final PeriodEnum NUMBER_0 = new PeriodEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final PeriodEnum NUMBER_1 = new PeriodEnum(1);

        /** Enum NUMBER_300 for value: 300 */
        public static final PeriodEnum NUMBER_300 = new PeriodEnum(300);

        /** Enum NUMBER_1200 for value: 1200 */
        public static final PeriodEnum NUMBER_1200 = new PeriodEnum(1200);

        /** Enum NUMBER_3600 for value: 3600 */
        public static final PeriodEnum NUMBER_3600 = new PeriodEnum(3600);

        /** Enum NUMBER_14400 for value: 14400 */
        public static final PeriodEnum NUMBER_14400 = new PeriodEnum(14400);

        /** Enum NUMBER_86400 for value: 86400 */
        public static final PeriodEnum NUMBER_86400 = new PeriodEnum(86400);

        private static final Map<Integer, PeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PeriodEnum> createStaticFields() {
            Map<Integer, PeriodEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
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
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodEnum(value);
            }
            return result;
        }

        public static PeriodEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparison_operator")

    private String comparisonOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Float value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    /** 抑制方式 */
    public static final class SuppressDurationEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final SuppressDurationEnum NUMBER_0 = new SuppressDurationEnum(0);

        /** Enum NUMBER_300 for value: 300 */
        public static final SuppressDurationEnum NUMBER_300 = new SuppressDurationEnum(300);

        /** Enum NUMBER_600 for value: 600 */
        public static final SuppressDurationEnum NUMBER_600 = new SuppressDurationEnum(600);

        /** Enum NUMBER_900 for value: 900 */
        public static final SuppressDurationEnum NUMBER_900 = new SuppressDurationEnum(900);

        /** Enum NUMBER_1800 for value: 1800 */
        public static final SuppressDurationEnum NUMBER_1800 = new SuppressDurationEnum(1800);

        /** Enum NUMBER_3600 for value: 3600 */
        public static final SuppressDurationEnum NUMBER_3600 = new SuppressDurationEnum(3600);

        /** Enum NUMBER_10800 for value: 10800 */
        public static final SuppressDurationEnum NUMBER_10800 = new SuppressDurationEnum(10800);

        /** Enum NUMBER_21600 for value: 21600 */
        public static final SuppressDurationEnum NUMBER_21600 = new SuppressDurationEnum(21600);

        /** Enum NUMBER_43200 for value: 43200 */
        public static final SuppressDurationEnum NUMBER_43200 = new SuppressDurationEnum(43200);

        /** Enum NUMBER_86400 for value: 86400 */
        public static final SuppressDurationEnum NUMBER_86400 = new SuppressDurationEnum(86400);

        private static final Map<Integer, SuppressDurationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, SuppressDurationEnum> createStaticFields() {
            Map<Integer, SuppressDurationEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(300, NUMBER_300);
            map.put(600, NUMBER_600);
            map.put(900, NUMBER_900);
            map.put(1800, NUMBER_1800);
            map.put(3600, NUMBER_3600);
            map.put(10800, NUMBER_10800);
            map.put(21600, NUMBER_21600);
            map.put(43200, NUMBER_43200);
            map.put(86400, NUMBER_86400);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        SuppressDurationEnum(Integer value) {
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
        public static SuppressDurationEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            SuppressDurationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SuppressDurationEnum(value);
            }
            return result;
        }

        public static SuppressDurationEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            SuppressDurationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SuppressDurationEnum) {
                return this.value.equals(((SuppressDurationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suppress_duration")

    private SuppressDurationEnum suppressDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    public Policy withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /** 指标名称
     * 
     * @return metricName */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public Policy withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    /** 周期
     * 
     * @return period */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    public Policy withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /** 聚合方式
     * 
     * @return filter */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Policy withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /** 阈值符号
     * 
     * @return comparisonOperator */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public Policy withValue(Float value) {
        this.value = value;
        return this;
    }

    /** 阈值 minimum: 0 maximum: 1.174271E+108
     * 
     * @return value */
    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Policy withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /** 单位
     * 
     * @return unit */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Policy withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 次数 minimum: 1 maximum: 100
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Policy withType(String type) {
        this.type = type;
        return this;
    }

    /** 类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Policy withSuppressDuration(SuppressDurationEnum suppressDuration) {
        this.suppressDuration = suppressDuration;
        return this;
    }

    /** 抑制方式
     * 
     * @return suppressDuration */
    public SuppressDurationEnum getSuppressDuration() {
        return suppressDuration;
    }

    public void setSuppressDuration(SuppressDurationEnum suppressDuration) {
        this.suppressDuration = suppressDuration;
    }

    public Policy withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /** 告警级别 minimum: 1 maximum: 4
     * 
     * @return level */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Policy policy = (Policy) o;
        return Objects.equals(this.metricName, policy.metricName) && Objects.equals(this.period, policy.period)
            && Objects.equals(this.filter, policy.filter)
            && Objects.equals(this.comparisonOperator, policy.comparisonOperator)
            && Objects.equals(this.value, policy.value) && Objects.equals(this.unit, policy.unit)
            && Objects.equals(this.count, policy.count) && Objects.equals(this.type, policy.type)
            && Objects.equals(this.suppressDuration, policy.suppressDuration)
            && Objects.equals(this.level, policy.level);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(metricName, period, filter, comparisonOperator, value, unit, count, type, suppressDuration, level);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Policy {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    suppressDuration: ").append(toIndentedString(suppressDuration)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
