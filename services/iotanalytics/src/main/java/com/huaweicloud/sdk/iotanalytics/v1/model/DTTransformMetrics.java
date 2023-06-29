package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转换指标列表
 */
public class DTTransformMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<MetricInput> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    public DTTransformMetrics withInputs(List<MetricInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    public DTTransformMetrics addInputsItem(MetricInput inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public DTTransformMetrics withInputs(Consumer<List<MetricInput>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 定义指标计算查询的输入资产属性列表
     * @return inputs
     */
    public List<MetricInput> getInputs() {
        return inputs;
    }

    public void setInputs(List<MetricInput> inputs) {
        this.inputs = inputs;
    }

    public DTTransformMetrics withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 指标表达式,最多64个字符
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public DTTransformMetrics withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名，指标计算查询的输出指标名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DTTransformMetrics that = (DTTransformMetrics) obj;
        return Objects.equals(this.inputs, that.inputs) && Objects.equals(this.expression, that.expression)
            && Objects.equals(this.metricName, that.metricName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, expression, metricName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DTTransformMetrics {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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
