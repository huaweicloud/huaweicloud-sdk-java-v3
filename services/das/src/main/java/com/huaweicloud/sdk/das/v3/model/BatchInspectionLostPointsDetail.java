package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchInspectionLostPointsDetail
 */
public class BatchInspectionLostPointsDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private String metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_value")

    private Double metricValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deducted_points")

    private Double deductedPoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deducted_condition")

    private String deductedCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deducted_formula")

    private String deductedFormula;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestions")

    private String suggestions;

    public BatchInspectionLostPointsDetail withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public BatchInspectionLostPointsDetail withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * 检查项
     * @return metric
     */
    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public BatchInspectionLostPointsDetail withMetricValue(Double metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * 指标值
     * minimum: 0
     * maximum: 1E+2
     * @return metricValue
     */
    public Double getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(Double metricValue) {
        this.metricValue = metricValue;
    }

    public BatchInspectionLostPointsDetail withDeductedPoints(Double deductedPoints) {
        this.deductedPoints = deductedPoints;
        return this;
    }

    /**
     * 扣分值
     * minimum: 0
     * maximum: 1E+2
     * @return deductedPoints
     */
    public Double getDeductedPoints() {
        return deductedPoints;
    }

    public void setDeductedPoints(Double deductedPoints) {
        this.deductedPoints = deductedPoints;
    }

    public BatchInspectionLostPointsDetail withDeductedCondition(String deductedCondition) {
        this.deductedCondition = deductedCondition;
        return this;
    }

    /**
     * 扣分条件
     * @return deductedCondition
     */
    public String getDeductedCondition() {
        return deductedCondition;
    }

    public void setDeductedCondition(String deductedCondition) {
        this.deductedCondition = deductedCondition;
    }

    public BatchInspectionLostPointsDetail withDeductedFormula(String deductedFormula) {
        this.deductedFormula = deductedFormula;
        return this;
    }

    /**
     * 扣分规则
     * @return deductedFormula
     */
    public String getDeductedFormula() {
        return deductedFormula;
    }

    public void setDeductedFormula(String deductedFormula) {
        this.deductedFormula = deductedFormula;
    }

    public BatchInspectionLostPointsDetail withSuggestions(String suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    /**
     * 优化建议
     * @return suggestions
     */
    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchInspectionLostPointsDetail that = (BatchInspectionLostPointsDetail) obj;
        return Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.metricValue, that.metricValue)
            && Objects.equals(this.deductedPoints, that.deductedPoints)
            && Objects.equals(this.deductedCondition, that.deductedCondition)
            && Objects.equals(this.deductedFormula, that.deductedFormula)
            && Objects.equals(this.suggestions, that.suggestions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(riskLevel, metric, metricValue, deductedPoints, deductedCondition, deductedFormula, suggestions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchInspectionLostPointsDetail {\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
        sb.append("    deductedPoints: ").append(toIndentedString(deductedPoints)).append("\n");
        sb.append("    deductedCondition: ").append(toIndentedString(deductedCondition)).append("\n");
        sb.append("    deductedFormula: ").append(toIndentedString(deductedFormula)).append("\n");
        sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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
