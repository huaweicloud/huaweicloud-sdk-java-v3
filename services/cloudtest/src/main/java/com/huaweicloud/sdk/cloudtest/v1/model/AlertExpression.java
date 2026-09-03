package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlertExpression
 */
public class AlertExpression {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression_operator")

    private String expressionOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_operator")

    private String metricOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_threshold")

    private Integer metricThreshold;

    public AlertExpression withExpressionOperator(String expressionOperator) {
        this.expressionOperator = expressionOperator;
        return this;
    }

    /**
     * 表达式操作符
     * @return expressionOperator
     */
    public String getExpressionOperator() {
        return expressionOperator;
    }

    public void setExpressionOperator(String expressionOperator) {
        this.expressionOperator = expressionOperator;
    }

    public AlertExpression withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public AlertExpression withMetricOperator(String metricOperator) {
        this.metricOperator = metricOperator;
        return this;
    }

    /**
     * 指标操作符
     * @return metricOperator
     */
    public String getMetricOperator() {
        return metricOperator;
    }

    public void setMetricOperator(String metricOperator) {
        this.metricOperator = metricOperator;
    }

    public AlertExpression withMetricThreshold(Integer metricThreshold) {
        this.metricThreshold = metricThreshold;
        return this;
    }

    /**
     * 指标阈值
     * @return metricThreshold
     */
    public Integer getMetricThreshold() {
        return metricThreshold;
    }

    public void setMetricThreshold(Integer metricThreshold) {
        this.metricThreshold = metricThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertExpression that = (AlertExpression) obj;
        return Objects.equals(this.expressionOperator, that.expressionOperator)
            && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.metricOperator, that.metricOperator)
            && Objects.equals(this.metricThreshold, that.metricThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expressionOperator, metricName, metricOperator, metricThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertExpression {\n");
        sb.append("    expressionOperator: ").append(toIndentedString(expressionOperator)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricOperator: ").append(toIndentedString(metricOperator)).append("\n");
        sb.append("    metricThreshold: ").append(toIndentedString(metricThreshold)).append("\n");
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
