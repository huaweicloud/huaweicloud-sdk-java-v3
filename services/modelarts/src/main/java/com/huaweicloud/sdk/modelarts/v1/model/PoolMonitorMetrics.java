package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PoolMonitorMetrics
 */
public class PoolMonitorMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private PoolMonitorMetric metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataPoints")

    private List<PoolMonitorDataPoints> dataPoints = null;

    public PoolMonitorMetrics withMetric(PoolMonitorMetric metric) {
        this.metric = metric;
        return this;
    }

    public PoolMonitorMetrics withMetric(Consumer<PoolMonitorMetric> metricSetter) {
        if (this.metric == null) {
            this.metric = new PoolMonitorMetric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public PoolMonitorMetric getMetric() {
        return metric;
    }

    public void setMetric(PoolMonitorMetric metric) {
        this.metric = metric;
    }

    public PoolMonitorMetrics withDataPoints(List<PoolMonitorDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public PoolMonitorMetrics addDataPointsItem(PoolMonitorDataPoints dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public PoolMonitorMetrics withDataPoints(Consumer<List<PoolMonitorDataPoints>> dataPointsSetter) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * 重点指标。
     * @return dataPoints
     */
    public List<PoolMonitorDataPoints> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<PoolMonitorDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolMonitorMetrics that = (PoolMonitorMetrics) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.dataPoints, that.dataPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, dataPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMonitorMetrics {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
