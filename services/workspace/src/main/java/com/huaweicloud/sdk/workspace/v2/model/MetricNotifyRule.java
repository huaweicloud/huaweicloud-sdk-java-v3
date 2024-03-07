package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 指标通知规则
 */
public class MetricNotifyRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparison_operator")

    private String comparisonOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_object")

    private String notifyObject;

    public MetricNotifyRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public MetricNotifyRule withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 统计指标名称，目前仅支持固定值：desktop_idle_duration * `desktop_idle_duration` -  桌面空闲时长
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public MetricNotifyRule withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 统计持续周期(天)
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public MetricNotifyRule withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * 统计指标对应的统计值和threshold进行比较的条件 * `>=` -  统计指标大于等于threshold时触发 * `>` -   统计指标大于threshold时触发 * `=` -  统计指标等于threshold时触发 * `<=` -  统计指标小于等于threshold时触发 * `<` -  统计指标小于threshold时触发
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public MetricNotifyRule withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 触发通知后；下次通知的间隔时间;默认每天一次
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public MetricNotifyRule withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 启禁用规则 true:启用 false:禁用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public MetricNotifyRule withNotifyObject(String notifyObject) {
        this.notifyObject = notifyObject;
        return this;
    }

    /**
     * 通知对象;smn的主题urn
     * @return notifyObject
     */
    public String getNotifyObject() {
        return notifyObject;
    }

    public void setNotifyObject(String notifyObject) {
        this.notifyObject = notifyObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricNotifyRule that = (MetricNotifyRule) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.comparisonOperator, that.comparisonOperator)
            && Objects.equals(this.interval, that.interval) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.notifyObject, that.notifyObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, metricName, threshold, comparisonOperator, interval, enable, notifyObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricNotifyRule {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    notifyObject: ").append(toIndentedString(notifyObject)).append("\n");
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
