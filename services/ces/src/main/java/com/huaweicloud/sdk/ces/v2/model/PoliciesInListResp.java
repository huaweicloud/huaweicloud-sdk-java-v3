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
     * 资源的监控指标名称，必须以字母开头，只能包含0-9/a-z/A-Z/_，字符长度最短为1，最大为64；如：弹性云服务器中的监控指标cpu_util，表示弹性服务器的CPU使用率；文档数据库中的指标mongo001_command_ps，表示command执行频率；各服务的指标名称可查看：“[服务指标名称](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
     * 聚合方式, 支持的值为(average|min|max|sum)
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
     * 告警阈值的比较条件，支持的值为(>|<|>=|<=|=|!=|cycle_decrease|cycle_increase|cycle_wave)，cycle_decrease为环比下降，cycle_increase为环比上升，cycle_wave为环比波动
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
     * 阈值
     * minimum: 0
     * maximum: 1.7976931348623156E+108
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public PoliciesInListResp withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位
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

    public PoliciesInListResp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 告警策略类型。
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
            && Objects.equals(this.value, that.value) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.count, that.count) && Objects.equals(this.type, that.type)
            && Objects.equals(this.suppressDuration, that.suppressDuration)
            && Objects.equals(this.alarmLevel, that.alarmLevel);
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
            unit,
            count,
            type,
            suppressDuration,
            alarmLevel);
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
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    suppressDuration: ").append(toIndentedString(suppressDuration)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
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
