package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowStreamMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private Metrics metrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics_list")

    private List<Metrics> metricsList = null;

    public ShowStreamMetricsResponse withMetrics(Metrics metrics) {
        this.metrics = metrics;
        return this;
    }

    public ShowStreamMetricsResponse withMetrics(Consumer<Metrics> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new Metrics();
            metricsSetter.accept(this.metrics);
        }

        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    public ShowStreamMetricsResponse withMetricsList(List<Metrics> metricsList) {
        this.metricsList = metricsList;
        return this;
    }

    public ShowStreamMetricsResponse addMetricsListItem(Metrics metricsListItem) {
        if (this.metricsList == null) {
            this.metricsList = new ArrayList<>();
        }
        this.metricsList.add(metricsListItem);
        return this;
    }

    public ShowStreamMetricsResponse withMetricsList(Consumer<List<Metrics>> metricsListSetter) {
        if (this.metricsList == null) {
            this.metricsList = new ArrayList<>();
        }
        metricsListSetter.accept(this.metricsList);
        return this;
    }

    /**
     * 监控数据对象列表。
     * @return metricsList
     */
    public List<Metrics> getMetricsList() {
        return metricsList;
    }

    public void setMetricsList(List<Metrics> metricsList) {
        this.metricsList = metricsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStreamMetricsResponse that = (ShowStreamMetricsResponse) obj;
        return Objects.equals(this.metrics, that.metrics) && Objects.equals(this.metricsList, that.metricsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metrics, metricsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStreamMetricsResponse {\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    metricsList: ").append(toIndentedString(metricsList)).append("\n");
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
