package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 带时间的指标
 */
public class MetricsWithTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<Metric> metrics = null;

    public MetricsWithTime withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MetricsWithTime withMetrics(List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public MetricsWithTime addMetricsItem(Metric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public MetricsWithTime withMetrics(Consumer<List<Metric>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标值
     * @return metrics
     */
    public List<Metric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<Metric> metrics) {
        this.metrics = metrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricsWithTime that = (MetricsWithTime) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.metrics, that.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricsWithTime {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
