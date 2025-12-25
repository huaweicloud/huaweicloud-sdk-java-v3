package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class BatchListMetricDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<MetricInfo> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private BatchPeriod period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private Filter filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    public BatchListMetricDataRequestBody withMetrics(List<MetricInfo> metrics) {
        this.metrics = metrics;
        return this;
    }

    public BatchListMetricDataRequestBody addMetricsItem(MetricInfo metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public BatchListMetricDataRequestBody withMetrics(Consumer<List<MetricInfo>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标数据。数组长度最大500
     * @return metrics
     */
    public List<MetricInfo> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricInfo> metrics) {
        this.metrics = metrics;
    }

    public BatchListMetricDataRequestBody withPeriod(BatchPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Get period
     * @return period
     */
    public BatchPeriod getPeriod() {
        return period;
    }

    public void setPeriod(BatchPeriod period) {
        this.period = period;
    }

    public BatchListMetricDataRequestBody withFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public BatchListMetricDataRequestBody withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * minimum: 1111111111111
     * maximum: 9999999999999
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public BatchListMetricDataRequestBody withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * minimum: 1111111111111
     * maximum: 9999999999999
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListMetricDataRequestBody that = (BatchListMetricDataRequestBody) obj;
        return Objects.equals(this.metrics, that.metrics) && Objects.equals(this.period, that.period)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metrics, period, filter, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListMetricDataRequestBody {\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
