package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义属性任务的返回结果
 */
public class CustomPropsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_definition")

    private PropDefinition propDefinition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<CustomPropsModelMetric> metrics = null;

    public CustomPropsResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义属性ID（API侧）
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomPropsResult withPropDefinition(PropDefinition propDefinition) {
        this.propDefinition = propDefinition;
        return this;
    }

    public CustomPropsResult withPropDefinition(Consumer<PropDefinition> propDefinitionSetter) {
        if (this.propDefinition == null) {
            this.propDefinition = new PropDefinition();
            propDefinitionSetter.accept(this.propDefinition);
        }

        return this;
    }

    /**
     * Get propDefinition
     * @return propDefinition
     */
    public PropDefinition getPropDefinition() {
        return propDefinition;
    }

    public void setPropDefinition(PropDefinition propDefinition) {
        this.propDefinition = propDefinition;
    }

    public CustomPropsResult withMetrics(List<CustomPropsModelMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public CustomPropsResult addMetricsItem(CustomPropsModelMetric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public CustomPropsResult withMetrics(Consumer<List<CustomPropsModelMetric>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 自定义属性建模的评估指标集合
     * @return metrics
     */
    public List<CustomPropsModelMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<CustomPropsModelMetric> metrics) {
        this.metrics = metrics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomPropsResult customPropsResult = (CustomPropsResult) o;
        return Objects.equals(this.id, customPropsResult.id)
            && Objects.equals(this.propDefinition, customPropsResult.propDefinition)
            && Objects.equals(this.metrics, customPropsResult.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, propDefinition, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomPropsResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    propDefinition: ").append(toIndentedString(propDefinition)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
