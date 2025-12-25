package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 告警规则设置的告警策略。 
 */
public class AlarmRuleConditionResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparison_operator")

    private String comparisonOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private FilterResp filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private PeriodResp period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected_unit")

    private String selectedUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suppress_duration")

    private SuppressDurationResp suppressDuration;

    public AlarmRuleConditionResp withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * **参数解释**： 阈值符号。     **取值范围**： 支持的值为(>|<|>=|<=|=|!=|cycle_decrease|cycle_increase|cycle_wave);cycle_decrease为环比下降,cycle_increase为环比上升,cycle_wave为环比波动。 
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public AlarmRuleConditionResp withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 触发告警的连续发生次数。 **取值范围**： 整数，取值范围[1, 5]。 
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

    public AlarmRuleConditionResp withFilter(FilterResp filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public FilterResp getFilter() {
        return filter;
    }

    public void setFilter(FilterResp filter) {
        this.filter = filter;
    }

    public AlarmRuleConditionResp withPeriod(PeriodResp period) {
        this.period = period;
        return this;
    }

    /**
     * Get period
     * @return period
     */
    public PeriodResp getPeriod() {
        return period;
    }

    public void setPeriod(PeriodResp period) {
        this.period = period;
    }

    public AlarmRuleConditionResp withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**： 数据的原始单位。 **取值范围**： 长度为[0,32]个字符。 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public AlarmRuleConditionResp withSelectedUnit(String selectedUnit) {
        this.selectedUnit = selectedUnit;
        return this;
    }

    /**
     * **参数解释**： 用户选择的数据单位。 **取值范围**： 长度为[0,32]个字符。 
     * @return selectedUnit
     */
    public String getSelectedUnit() {
        return selectedUnit;
    }

    public void setSelectedUnit(String selectedUnit) {
        this.selectedUnit = selectedUnit;
    }

    public AlarmRuleConditionResp withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 告警阈值。具体阈值取值请参见附录中各服务监控指标中取值范围，如[支持监控的服务列表](ces_03_0059.xml)中ECS的CPU使用率cpu_util取值范围可配置80。 **取值范围**： 最小值为-1.7976931348623157e+108，最大值为1.7976931348623157e+108。 
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

    public AlarmRuleConditionResp withSuppressDuration(SuppressDurationResp suppressDuration) {
        this.suppressDuration = suppressDuration;
        return this;
    }

    /**
     * Get suppressDuration
     * @return suppressDuration
     */
    public SuppressDurationResp getSuppressDuration() {
        return suppressDuration;
    }

    public void setSuppressDuration(SuppressDurationResp suppressDuration) {
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
        AlarmRuleConditionResp that = (AlarmRuleConditionResp) obj;
        return Objects.equals(this.comparisonOperator, that.comparisonOperator)
            && Objects.equals(this.count, that.count) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.period, that.period) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.selectedUnit, that.selectedUnit) && Objects.equals(this.value, that.value)
            && Objects.equals(this.suppressDuration, that.suppressDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comparisonOperator, count, filter, period, unit, selectedUnit, value, suppressDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmRuleConditionResp {\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    selectedUnit: ").append(toIndentedString(selectedUnit)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
