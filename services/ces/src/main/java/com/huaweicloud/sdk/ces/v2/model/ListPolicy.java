package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListPolicy
 */
public class ListPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private MetricExtraInfo extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

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
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suppress_duration")

    private Integer suppressDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_name")

    private String dimensionName;

    public ListPolicy withMetricName(String metricName) {
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

    public ListPolicy withExtraInfo(MetricExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public ListPolicy withExtraInfo(Consumer<MetricExtraInfo> extraInfoSetter) {
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

    public ListPolicy withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 指标周期，单位是秒； 0是默认值，例如事件类告警该字段就用0即可； 1代表指标的原始周期，比如RDS监控指标原始周期是60s，表示该RDS指标按60s周期为一个数据点参与告警计算；如想了解各个云服务的指标原始周期可以参考“[支持服务列表](ces_03_0059.xml)”，300代表指标按5分钟聚合周期为一个数据点参与告警计算。
     * minimum: 0
     * maximum: 86400
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public ListPolicy withFilter(String filter) {
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

    public ListPolicy withComparisonOperator(String comparisonOperator) {
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

    public ListPolicy withValue(Double value) {
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

    public ListPolicy withHierarchicalValue(HierarchicalValue hierarchicalValue) {
        this.hierarchicalValue = hierarchicalValue;
        return this;
    }

    public ListPolicy withHierarchicalValue(Consumer<HierarchicalValue> hierarchicalValueSetter) {
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

    public ListPolicy withUnit(String unit) {
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

    public ListPolicy withType(String type) {
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

    public ListPolicy withCount(Integer count) {
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

    public ListPolicy withSuppressDuration(Integer suppressDuration) {
        this.suppressDuration = suppressDuration;
        return this;
    }

    /**
     * 告警抑制时间，单位为秒，对应页面上创建告警规则时告警策略最后一个字段，该字段主要为解决告警频繁的问题，0代表不抑制，满足条件即告警；300代表满足告警触发条件后每5分钟告警一次；
     * minimum: 0
     * maximum: 86400
     * @return suppressDuration
     */
    public Integer getSuppressDuration() {
        return suppressDuration;
    }

    public void setSuppressDuration(Integer suppressDuration) {
        this.suppressDuration = suppressDuration;
    }

    public ListPolicy withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 告警级别, 1为紧急，2为重要，3为次要，4为提示。默认值为2。
     * minimum: 1
     * maximum: 4
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ListPolicy withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 查看产品层级规则的策略，会同时返回该策略的namespace（服务命名空间）和dimension_name（服务维度名称）用来获取生效的策略归属。各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListPolicy withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * 查看产品层级规则的策略，会同时返回该策略的namespace（服务命名空间）和dimension_name（服务维度名称）用来获取生效的策略归属。目前最大支持4个维度，各服务资源的指标维度名称可查看：“[服务维度名称](ces_03_0059.xml)”
     * @return dimensionName
     */
    public String getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPolicy that = (ListPolicy) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.extraInfo, that.extraInfo)
            && Objects.equals(this.period, that.period) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.comparisonOperator, that.comparisonOperator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.hierarchicalValue, that.hierarchicalValue)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.type, that.type)
            && Objects.equals(this.count, that.count) && Objects.equals(this.suppressDuration, that.suppressDuration)
            && Objects.equals(this.level, that.level) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.dimensionName, that.dimensionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName,
            extraInfo,
            period,
            filter,
            comparisonOperator,
            value,
            hierarchicalValue,
            unit,
            type,
            count,
            suppressDuration,
            level,
            namespace,
            dimensionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicy {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    hierarchicalValue: ").append(toIndentedString(hierarchicalValue)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    suppressDuration: ").append(toIndentedString(suppressDuration)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensionName: ").append(toIndentedString(dimensionName)).append("\n");
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
