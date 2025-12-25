package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警等级统计
 */
public class ListAlertRuleTemplateMetricsResponseBodySeverity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private ListAlertRuleTemplateMetricsResponseBodySeverityMetric metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public ListAlertRuleTemplateMetricsResponseBodySeverity withMetric(
        ListAlertRuleTemplateMetricsResponseBodySeverityMetric metric) {
        this.metric = metric;
        return this;
    }

    public ListAlertRuleTemplateMetricsResponseBodySeverity withMetric(
        Consumer<ListAlertRuleTemplateMetricsResponseBodySeverityMetric> metricSetter) {
        if (this.metric == null) {
            this.metric = new ListAlertRuleTemplateMetricsResponseBodySeverityMetric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public ListAlertRuleTemplateMetricsResponseBodySeverityMetric getMetric() {
        return metric;
    }

    public void setMetric(ListAlertRuleTemplateMetricsResponseBodySeverityMetric metric) {
        this.metric = metric;
    }

    public ListAlertRuleTemplateMetricsResponseBodySeverity withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 分类方式
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlertRuleTemplateMetricsResponseBodySeverity that = (ListAlertRuleTemplateMetricsResponseBodySeverity) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertRuleTemplateMetricsResponseBodySeverity {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
