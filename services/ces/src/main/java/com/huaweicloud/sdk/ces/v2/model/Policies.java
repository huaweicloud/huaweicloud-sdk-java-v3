package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Policies
 */
public class Policies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_name")

    private String dimensionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private MetricExtraInfo extraInfo;

    /**
     * **参数解释**： 告警条件判断周期,单位为秒。 **约束限制**： 不涉及。 **取值范围**： 枚举值。 - 0是默认值，事件类告警该字段用0即可。 - 1代表指标的原始周期，比如RDS监控指标原始周期是60s，表示该RDS指标按60s周期为一个数据点参与告警计算。 - 300代表指标按5分钟聚合周期为一个数据点参与告警计算。 - 1200代表指标按20分钟聚合周期为一个数据点参与告警计算。 - 3600代表指标按1小时聚合周期为一个数据点参与告警计算。 - 14400代表指标按4小时聚合周期为一个数据点参与告警计算。 - 86400代表指标按1天聚合周期为一个数据点参与告警计算。          **默认取值**： 不涉及。 
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

    private BigDecimal value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hierarchical_value")

    private HierarchicalValue hierarchicalValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected_unit")

    private String selectedUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private Integer alarmLevel;

    /**
     * **参数解释**： 告警抑制周期，单位为秒。 **约束限制**： 不涉及。 **取值范围**： 枚举值，只能为0、300、600、900、1800、3600、10800、21600、43200、86400。 - 0：在立即触发场景中，0代表不抑制；在累计触发场景，0代表只告警一次。 - 300代表满足告警触发条件后每5分钟告警一次。 - 600代表满足告警触发条件后每10分钟告警一次。 - 900代表满足告警触发条件后每15分钟告警一次。 - 1800代表满足告警触发条件后每30分钟告警一次。 - 3600代表满足告警触发条件后每60分钟告警一次。 - 10800代表满足告警触发条件后每3小时告警一次。 - 21600代表满足告警触发条件后每6小时告警一次。 - 43200代表满足告警触发条件后每12小时告警一次。 - 86400代表满足告警触发条件后每一天告警一次。 **默认取值**： 不涉及。 
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

    public Policies withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在 3 到 32个字符之间。 **默认取值**： 不涉及。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Policies withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * **参数解释**： 资源维度。     **约束限制**： 事件告警模板DimensionName为空 **取值范围**： 必须以字母开头，多维度用\",\"分隔，只能包含0-9/a-z/A-Z/_/-，每个维度的最大长度为32。目前最大支持4个维度。举例：单维度场景：instance_id；多维度场景：instance_id,disk        **默认取值**： 不涉及。 
     * @return dimensionName
     */
    public String getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    public Policies withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释**： 资源的监控指标名称，各服务的指标名称可查看：“[服务指标名称](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 必须以字母开头，只能包含0-9/a-z/A-Z/_/-。字符长度最短为1，最大为96。如：弹性云服务器中的监控指标cpu_util，表示弹性服务器的CPU使用率；文档数据库中的指标mongo001_command_ps，表示command执行频率。         **默认取值**： 不涉及。 
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public Policies withExtraInfo(MetricExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public Policies withExtraInfo(Consumer<MetricExtraInfo> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new MetricExtraInfo();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public MetricExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(MetricExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Policies withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    /**
     * **参数解释**： 告警条件判断周期,单位为秒。 **约束限制**： 不涉及。 **取值范围**： 枚举值。 - 0是默认值，事件类告警该字段用0即可。 - 1代表指标的原始周期，比如RDS监控指标原始周期是60s，表示该RDS指标按60s周期为一个数据点参与告警计算。 - 300代表指标按5分钟聚合周期为一个数据点参与告警计算。 - 1200代表指标按20分钟聚合周期为一个数据点参与告警计算。 - 3600代表指标按1小时聚合周期为一个数据点参与告警计算。 - 14400代表指标按4小时聚合周期为一个数据点参与告警计算。 - 86400代表指标按1天聚合周期为一个数据点参与告警计算。          **默认取值**： 不涉及。 
     * @return period
     */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    public Policies withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * **参数解释**： 聚合方式。         **约束限制**： 不涉及。 **取值范围**： average： 平均值，variance：方差，min：最小值，max：最大值，sum：求和。           **默认取值**： 不涉及。 
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Policies withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * **参数解释**： 阈值符号。     **约束限制**： 指标告警可以使用的阈值符号有>、>=、<、<=、=、!=、cycle_decrease、cycle_increase、cycle_wave； 事件告警可以使用的阈值符号为>、>=、<、<=、=、!=。 **取值范围**： 支持的值为(>|<|>=|<=|=|!=|cycle_decrease|cycle_increase|cycle_wave);cycle_decrease为环比下降,cycle_increase为环比上升,cycle_wave为环比波动。           **默认取值**： 不涉及。 
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public Policies withValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 告警阈值。 **约束限制**： 单一阈值时value和alarm_level配对使用，当hierarchical_value和value同时使用时以hierarchical_value为准。 **取值范围**： 不涉及。           **默认取值**： 不涉及。 
     * minimum: 0
     * maximum: 1.7976931348623156E+108
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Policies withHierarchicalValue(HierarchicalValue hierarchicalValue) {
        this.hierarchicalValue = hierarchicalValue;
        return this;
    }

    public Policies withHierarchicalValue(Consumer<HierarchicalValue> hierarchicalValueSetter) {
        if (this.hierarchicalValue == null) {
            this.hierarchicalValue = new HierarchicalValue();
            hierarchicalValueSetter.accept(this.hierarchicalValue);
        }

        return this;
    }

    /**
     * Get hierarchicalValue
     * @return hierarchicalValue
     */
    public HierarchicalValue getHierarchicalValue() {
        return hierarchicalValue;
    }

    public void setHierarchicalValue(HierarchicalValue hierarchicalValue) {
        this.hierarchicalValue = hierarchicalValue;
    }

    public Policies withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**： 数据的单位字符串，长度不超过32。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,32]个字符    **默认取值**： 不涉及。 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Policies withSelectedUnit(String selectedUnit) {
        this.selectedUnit = selectedUnit;
        return this;
    }

    /**
     * **参数解释**： 用户在页面中选择的指标单位， 用于后续指标数据回显和计算。     **约束限制**： 不涉及。 **取值范围**： 长度为[0,64]个字符。        **默认取值**： 不涉及。 
     * @return selectedUnit
     */
    public String getSelectedUnit() {
        return selectedUnit;
    }

    public void setSelectedUnit(String selectedUnit) {
        this.selectedUnit = selectedUnit;
    }

    public Policies withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 告警连续触发次数。     **约束限制**： 不涉及。 **取值范围**： 事件告警时参数值为1~180（包括1和180）；指标告警和站点告警时，次数采用枚举值，枚举值分别为：1、2、3、4、5、10、15、30、60、90、120、180。          **默认取值**： 不涉及。 
     * minimum: 1
     * maximum: 180
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Policies withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 告警策略类型，已废弃，不推荐使用。 **约束限制**： 不涉及。 **取值范围**： 只能为auto。          **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Policies withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * **参数解释**： 告警级别。     **约束限制**： 不涉及。 **取值范围**： 只能为1、2、3、4。 - 1为紧急 - 2为重要 - 3为次要 - 4为提示           **默认取值**： 不涉及。 
     * minimum: 1
     * maximum: 4
     * @return alarmLevel
     */
    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public Policies withSuppressDuration(SuppressDurationEnum suppressDuration) {
        this.suppressDuration = suppressDuration;
        return this;
    }

    /**
     * **参数解释**： 告警抑制周期，单位为秒。 **约束限制**： 不涉及。 **取值范围**： 枚举值，只能为0、300、600、900、1800、3600、10800、21600、43200、86400。 - 0：在立即触发场景中，0代表不抑制；在累计触发场景，0代表只告警一次。 - 300代表满足告警触发条件后每5分钟告警一次。 - 600代表满足告警触发条件后每10分钟告警一次。 - 900代表满足告警触发条件后每15分钟告警一次。 - 1800代表满足告警触发条件后每30分钟告警一次。 - 3600代表满足告警触发条件后每60分钟告警一次。 - 10800代表满足告警触发条件后每3小时告警一次。 - 21600代表满足告警触发条件后每6小时告警一次。 - 43200代表满足告警触发条件后每12小时告警一次。 - 86400代表满足告警触发条件后每一天告警一次。 **默认取值**： 不涉及。 
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
        Policies that = (Policies) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.dimensionName, that.dimensionName)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.extraInfo, that.extraInfo)
            && Objects.equals(this.period, that.period) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.comparisonOperator, that.comparisonOperator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.hierarchicalValue, that.hierarchicalValue)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.selectedUnit, that.selectedUnit)
            && Objects.equals(this.count, that.count) && Objects.equals(this.type, that.type)
            && Objects.equals(this.alarmLevel, that.alarmLevel)
            && Objects.equals(this.suppressDuration, that.suppressDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace,
            dimensionName,
            metricName,
            extraInfo,
            period,
            filter,
            comparisonOperator,
            value,
            hierarchicalValue,
            unit,
            selectedUnit,
            count,
            type,
            alarmLevel,
            suppressDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Policies {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensionName: ").append(toIndentedString(dimensionName)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    hierarchicalValue: ").append(toIndentedString(hierarchicalValue)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    selectedUnit: ").append(toIndentedString(selectedUnit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
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
