package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 告警触发条件
 */
public class AlarmCondition {

    /**
     * 指标周期，单位是秒； 0是默认值，例如事件类告警该字段就用0即可； 1代表指标的原始周期，比如RDS监控指标原始周期是60s，表示该RDS指标按60s周期为一个数据点参与告警计算；如想了解各个云服务的指标原始周期可以参考[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)， 300代表指标按5分钟聚合周期为一个数据点参与告警计算。
     */
    public static final class PeriodEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final PeriodEnum NUMBER_0 = new PeriodEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PeriodEnum NUMBER_1 = new PeriodEnum(1);

        /**
         * Enum NUMBER_300 for value: 300
         */
        public static final PeriodEnum NUMBER_300 = new PeriodEnum(300);

        /**
         * Enum NUMBER_1200 for value: 1200
         */
        public static final PeriodEnum NUMBER_1200 = new PeriodEnum(1200);

        /**
         * Enum NUMBER_3600 for value: 3600
         */
        public static final PeriodEnum NUMBER_3600 = new PeriodEnum(3600);

        /**
         * Enum NUMBER_14400 for value: 14400
         */
        public static final PeriodEnum NUMBER_14400 = new PeriodEnum(14400);

        /**
         * Enum NUMBER_86400 for value: 86400
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodEnum(value));
        }

        public static PeriodEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private Double value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    /**
     * 告警抑制时间，单位为秒，对应页面上创建告警规则时告警策略最后一个字段，该字段主要为解决告警频繁的问题，0代表不抑制，满足条件即告警；300代表满足告警触发条件后每5分钟告警一次；
     */
    public static final class SuppressDurationEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final SuppressDurationEnum NUMBER_0 = new SuppressDurationEnum(0);

        /**
         * Enum NUMBER_300 for value: 300
         */
        public static final SuppressDurationEnum NUMBER_300 = new SuppressDurationEnum(300);

        /**
         * Enum NUMBER_600 for value: 600
         */
        public static final SuppressDurationEnum NUMBER_600 = new SuppressDurationEnum(600);

        /**
         * Enum NUMBER_900 for value: 900
         */
        public static final SuppressDurationEnum NUMBER_900 = new SuppressDurationEnum(900);

        /**
         * Enum NUMBER_1800 for value: 1800
         */
        public static final SuppressDurationEnum NUMBER_1800 = new SuppressDurationEnum(1800);

        /**
         * Enum NUMBER_3600 for value: 3600
         */
        public static final SuppressDurationEnum NUMBER_3600 = new SuppressDurationEnum(3600);

        /**
         * Enum NUMBER_10800 for value: 10800
         */
        public static final SuppressDurationEnum NUMBER_10800 = new SuppressDurationEnum(10800);

        /**
         * Enum NUMBER_21600 for value: 21600
         */
        public static final SuppressDurationEnum NUMBER_21600 = new SuppressDurationEnum(21600);

        /**
         * Enum NUMBER_43200 for value: 43200
         */
        public static final SuppressDurationEnum NUMBER_43200 = new SuppressDurationEnum(43200);

        /**
         * Enum NUMBER_86400 for value: 86400
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SuppressDurationEnum(value));
        }

        public static SuppressDurationEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public AlarmCondition withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    /**
     * 指标周期，单位是秒； 0是默认值，例如事件类告警该字段就用0即可； 1代表指标的原始周期，比如RDS监控指标原始周期是60s，表示该RDS指标按60s周期为一个数据点参与告警计算；如想了解各个云服务的指标原始周期可以参考[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)， 300代表指标按5分钟聚合周期为一个数据点参与告警计算。
     * @return period
     */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    public AlarmCondition withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 聚合方式, 支持的值为(average|min|max|sum)
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public AlarmCondition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * 告警阈值的比较条件，支持的值为(>|<|>=|<=|=|!=|cycle_decrease|cycle_increase|cycle_wave)，cycle_decrease为环比下降，cycle_increase为环比上升，cycle_wave为环比波动
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public AlarmCondition withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 告警阈值，取值范围[0, Number.MAX_VALUE]，Number.MAX_VALUE值为1.7976931348623157e+108。具体阈值取值请参见附录中各服务监控指标中取值范围，如支持监控的服务列表中ECS的CPU使用率cpu_util取值范围可配置80。
     * minimum: 0
     * maximum: 1.174271E+108
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public AlarmCondition withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 数据的单位，最大长度为32位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public AlarmCondition withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 次数
     * minimum: 1
     * maximum: 100
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public AlarmCondition withSuppressDuration(SuppressDurationEnum suppressDuration) {
        this.suppressDuration = suppressDuration;
        return this;
    }

    /**
     * 告警抑制时间，单位为秒，对应页面上创建告警规则时告警策略最后一个字段，该字段主要为解决告警频繁的问题，0代表不抑制，满足条件即告警；300代表满足告警触发条件后每5分钟告警一次；
     * @return suppressDuration
     */
    public SuppressDurationEnum getSuppressDuration() {
        return suppressDuration;
    }

    public void setSuppressDuration(SuppressDurationEnum suppressDuration) {
        this.suppressDuration = suppressDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmCondition that = (AlarmCondition) obj;
        return Objects.equals(this.period, that.period) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.comparisonOperator, that.comparisonOperator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.count, that.count) && Objects.equals(this.suppressDuration, that.suppressDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, filter, comparisonOperator, value, unit, count, suppressDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmCondition {\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    suppressDuration: ").append(toIndentedString(suppressDuration)).append("\n");
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
