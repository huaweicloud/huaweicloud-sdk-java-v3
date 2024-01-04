package com.huaweicloud.sdk.aom.v2.model;

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
public class ListMetricItemsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metaData")

    private MetaDataSeries metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<MetricItemResultAPI> metrics = null;

    public ListMetricItemsResponse withMetaData(MetaDataSeries metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListMetricItemsResponse withMetaData(Consumer<MetaDataSeries> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MetaDataSeries();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public MetaDataSeries getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataSeries metaData) {
        this.metaData = metaData;
    }

    public ListMetricItemsResponse withMetrics(List<MetricItemResultAPI> metrics) {
        this.metrics = metrics;
        return this;
    }

    public ListMetricItemsResponse addMetricsItem(MetricItemResultAPI metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ListMetricItemsResponse withMetrics(Consumer<List<MetricItemResultAPI>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标对象列表。
     * @return metrics
     */
    public List<MetricItemResultAPI> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricItemResultAPI> metrics) {
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
        ListMetricItemsResponse that = (ListMetricItemsResponse) obj;
        return Objects.equals(this.metaData, that.metaData) && Objects.equals(this.metrics, that.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaData, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricItemsResponse {\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
