package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询结果详细。
 */
public class MetricDataValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataPoints")

    private List<MetricDataPoints> dataPoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private MetricQueryMeritcParam metric;

    public MetricDataValue withDataPoints(List<MetricDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public MetricDataValue addDataPointsItem(MetricDataPoints dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public MetricDataValue withDataPoints(Consumer<List<MetricDataPoints>> dataPointsSetter) {
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
    public List<MetricDataPoints> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<MetricDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public MetricDataValue withMetric(MetricQueryMeritcParam metric) {
        this.metric = metric;
        return this;
    }

    public MetricDataValue withMetric(Consumer<MetricQueryMeritcParam> metricSetter) {
        if (this.metric == null) {
            this.metric = new MetricQueryMeritcParam();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public MetricQueryMeritcParam getMetric() {
        return metric;
    }

    public void setMetric(MetricQueryMeritcParam metric) {
        this.metric = metric;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricDataValue that = (MetricDataValue) obj;
        return Objects.equals(this.dataPoints, that.dataPoints) && Objects.equals(this.metric, that.metric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataPoints, metric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricDataValue {\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
