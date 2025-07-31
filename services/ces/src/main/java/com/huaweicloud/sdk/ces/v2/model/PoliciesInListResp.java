package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PoliciesInListResp
 */
public class PoliciesInListResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_policy_id")

    private String alarmPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private MetricExtraInfo extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Period period;

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
    @JsonProperty(value = "hierarchical_value")

    private HierarchicalValue hierarchicalValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suppress_duration")

    private SuppressDuration suppressDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private Integer alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected_unit")

    private String selectedUnit;

    public PoliciesInListResp withAlarmPolicyId(String alarmPolicyId) {
        this.alarmPolicyId = alarmPolicyId;
        return this;
    }

    /**
     * 告警策略ID。
     * @return alarmPolicyId
     */
    public String getAlarmPolicyId() {
        return alarmPolicyId;
    }

    public void setAlarmPolicyId(String alarmPolicyId) {
        this.alarmPolicyId = alarmPolicyId;
    }

    public PoliciesInListResp withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 资源的监控指标名称，必须以字母开头，只能包含0-9/a-z/A-Z/_，字符长度最短为1，最大为64；如：弹性云服务器中的监控指标cpu_util，表示弹性服务器的CPU使用率；文档数据库中的指标mongo001_command_ps，表示command执行频率；各服务的指标名称可查看：“[服务指标名称](ces_03_0059.xml)”。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public PoliciesInListResp withExtraInfo(MetricExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public PoliciesInListResp withExtraInfo(Consumer<MetricExtraInfo> extraInfoSetter) {
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

    public PoliciesInListResp withPeriod(Period period) {
        this.period = period;
        return this;
    }

    /**
     * Get period
     * @return period
     */
    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public PoliciesInListResp withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 聚合方式。average： 平均值，variance：方差，min：最小值，max：最大值，sum：求和，tp99：99百分位数，tp95：95百分位数，tp90：90百分位数
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public PoliciesInListResp withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * 阈值符号, 支持的值为(>|<|>=|<=|=|!=|cycle_decrease|cycle_increase|cycle_wave);cycle_decrease为环比下降,cycle_increase为环比上升,cycle_wave为环比波动； 指标告警可以使用的阈值符号有>、>=、<、<=、=、!=、cycle_decrease、cycle_increase、cycle_wave； 事件告警可以使用的阈值符号为>、>=、<、<=、=、!=； 
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public PoliciesInListResp withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 告警阈值。单一阈值时value和alarm_level配对使用，当hierarchical_value和value同时使用时以hierarchical_value为准。 具体阈值取值请参见附录中各服务监控指标中取值范围，如支持监控的服务列表中ECS的CPU使用率cpu_util取值范围可配置80。 [具体阈值取值请参见附录中各服务监控指标中取值范围，如[支持监控的服务列表](ces_03_0059.xml)中ECS的CPU使用率cpu_util取值范围可配置80。] 
     * minimum: -1.7976931348623156E+108
     * maximum: 1.7976931348623156E+108
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public PoliciesInListResp withHierarchicalValue(HierarchicalValue hierarchicalValue) {
        this.hierarchicalValue = hierarchicalValue;
        return this;
    }

    public PoliciesInListResp withHierarchicalValue(Consumer<HierarchicalValue> hierarchicalValueSetter) {
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

    public PoliciesInListResp withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 数据的单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public PoliciesInListResp withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警连续触发次数，事件告警时参数值为1~180（包括1和180）；指标告警和站点告警时，次数采用枚举值，枚举值分别为：1、2、3、4、5、10、15、30、60、90、120、180
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

    public PoliciesInListResp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 告警策略类型，已废弃，不推荐使用。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PoliciesInListResp withSuppressDuration(SuppressDuration suppressDuration) {
        this.suppressDuration = suppressDuration;
        return this;
    }

    /**
     * Get suppressDuration
     * @return suppressDuration
     */
    public SuppressDuration getSuppressDuration() {
        return suppressDuration;
    }

    public void setSuppressDuration(SuppressDuration suppressDuration) {
        this.suppressDuration = suppressDuration;
    }

    public PoliciesInListResp withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别，1为紧急，2为重要，3为次要，4为提示
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

    public PoliciesInListResp withSelectedUnit(String selectedUnit) {
        this.selectedUnit = selectedUnit;
        return this;
    }

    /**
     * 用户在页面中选择的指标单位， 用于后续指标数据回显和计算
     * @return selectedUnit
     */
    public String getSelectedUnit() {
        return selectedUnit;
    }

    public void setSelectedUnit(String selectedUnit) {
        this.selectedUnit = selectedUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesInListResp that = (PoliciesInListResp) obj;
        return Objects.equals(this.alarmPolicyId, that.alarmPolicyId)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.extraInfo, that.extraInfo)
            && Objects.equals(this.period, that.period) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.comparisonOperator, that.comparisonOperator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.hierarchicalValue, that.hierarchicalValue)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.count, that.count)
            && Objects.equals(this.type, that.type) && Objects.equals(this.suppressDuration, that.suppressDuration)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.selectedUnit, that.selectedUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmPolicyId,
            metricName,
            extraInfo,
            period,
            filter,
            comparisonOperator,
            value,
            hierarchicalValue,
            unit,
            count,
            type,
            suppressDuration,
            alarmLevel,
            selectedUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesInListResp {\n");
        sb.append("    alarmPolicyId: ").append(toIndentedString(alarmPolicyId)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    hierarchicalValue: ").append(toIndentedString(hierarchicalValue)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    suppressDuration: ").append(toIndentedString(suppressDuration)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    selectedUnit: ").append(toIndentedString(selectedUnit)).append("\n");
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
