package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Policy
 */
public class Policy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public Policy withMetricName(String metricName) {
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

    public Policy withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * **参数解释**： 指标周期，单位是秒。如想了解各个云服务的指标原始周期可以参考“[支持服务列表](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 枚举值。 - 0代表立即触发，仅限事件场景使用。 - 1代表指标的原始周期，比如RDS监控指标原始周期是60s，表示该RDS指标按60s周期为一个数据点参与告警计算。 - 300代表指标按5分钟聚合周期为一个数据点参与告警计算。 - 1200代表指标按20分钟聚合周期为一个数据点参与告警计算。 - 3600代表指标按1小时聚合周期为一个数据点参与告警计算。 - 14400代表指标按4小时聚合周期为一个数据点参与告警计算。 - 86400代表指标按1天聚合周期为一个数据点参与告警计算。 **默认取值**：  不涉及。 
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

    public Policy withFilter(String filter) {
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

    public Policy withComparisonOperator(String comparisonOperator) {
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

    public Policy withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 告警阈值。具体阈值取值请参见附录中各服务监控指标中取值范围。    **约束限制**： 单一阈值时value和alarm_level配对使用，当hierarchical_value和value同时使用时以hierarchical_value为准。 **取值范围**： 最小值为-1.7976931348623157e+108，最大值为1.7976931348623157e+108。           **默认取值**： 不涉及。 
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

    public Policy withHierarchicalValue(HierarchicalValue hierarchicalValue) {
        this.hierarchicalValue = hierarchicalValue;
        return this;
    }

    public Policy withHierarchicalValue(Consumer<HierarchicalValue> hierarchicalValueSetter) {
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

    public Policy withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**： 数据的单位。    **约束限制**： 不涉及。 **取值范围**： 长度为[0,32]个字符。         **默认取值**： 不涉及。 
     * @return unit
     */
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

    public Policy withSuppressDuration(Integer suppressDuration) {
        this.suppressDuration = suppressDuration;
        return this;
    }

    /**
     * **参数解释**： 告警抑制时间，单位为秒，对应页面上创建告警规则时告警策略最后一个字段，该字段主要为解决告警频繁的问题。 **约束限制**： 不涉及。 **取值范围**： 枚举值，只能为0、300、600、900、1800、3600、10800、21600、43200、86400。 - 0：在立即触发场景中，0代表不抑制；在累计触发场景，0代表只告警一次。 - 300代表满足告警触发条件后每5分钟告警一次。 - 600代表满足告警触发条件后每10分钟告警一次。 - 900代表满足告警触发条件后每15分钟告警一次。 - 1800代表满足告警触发条件后每30分钟告警一次。 - 3600代表满足告警触发条件后每60分钟告警一次。 - 10800代表满足告警触发条件后每3小时告警一次。 - 21600代表满足告警触发条件后每6小时告警一次。 - 43200代表满足告警触发条件后每12小时告警一次。 - 86000代表满足告警触发条件后每一天告警一次。 **默认取值**： 不涉及。 
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

    public Policy withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**： 告警级别。    **约束限制**： 不涉及。 **取值范围**： 只能为1、2、3、4。1为紧急，2为重要，3为次要，4为提示。         **默认取值**： 2 
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

    public Policy withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 产品层级规则增加namespace（服务命名空间）和dimension_name（服务维度名称，用于指明生效策略的资源归属。各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在0到32个字符之间。 **默认取值**： 不涉及。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Policy withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * **参数解释**： 指标维度名称，各服务资源的指标维度名称可查看：“[服务维度名称](ces_03_0059.xml)”。产品层级规则需要增加namespace（服务命名空间）和dimension_name（服务维度名称），用于指明策略生效的资源归属。 **约束限制**： 不涉及。 **取值范围**： 目前最大支持4个维度。举例：单维度场景：instance_id；多维度场景：instance_id,disk           **默认取值**： 不涉及。 
     * @return dimensionName
     */
    public String getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    public Policy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 告警策略是否生效。true：策略生效，false：策略无效。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Policy that = (Policy) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.period, that.period)
            && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.comparisonOperator, that.comparisonOperator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.hierarchicalValue, that.hierarchicalValue)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.count, that.count)
            && Objects.equals(this.suppressDuration, that.suppressDuration) && Objects.equals(this.level, that.level)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.dimensionName, that.dimensionName)
            && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName,
            period,
            filter,
            comparisonOperator,
            value,
            hierarchicalValue,
            unit,
            count,
            suppressDuration,
            level,
            namespace,
            dimensionName,
            enabled);
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
        sb.append("    hierarchicalValue: ").append(toIndentedString(hierarchicalValue)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    suppressDuration: ").append(toIndentedString(suppressDuration)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensionName: ").append(toIndentedString(dimensionName)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
