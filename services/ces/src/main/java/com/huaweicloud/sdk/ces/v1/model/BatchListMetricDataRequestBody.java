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
     * **参数解释** 指标数据 **约束限制** 包含的指标数据对象个数为[1,500] 
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
     * **参数解释** 查询数据起始时间，UNIX时间戳，单位毫秒 **约束限制** 当period为1时，若(to- from) >4*3600*1000，则from调整为 to - 4*3600*1000 当period为300时，若(to - from) >24*3600*1000，则from调整为 to - 24*3600*1000 当period为1200时，若(to - from) >3*24*3600*1000，则from调整为 to - 3*24*3600*1000 当period为3600时，若(to -from) > 10*24*3600*1000，则from调整为 to -10*24*3600*1000 当period为14400时，若(to - from) >30*24*3600*1000，则from调整为 to - 30*24*3600*1000 当period为86400时，若(to -from) > 180*24*3600*1000，则from调整为 to - 180*24*3600*1000 **取值范围** 毫秒级时间戳范围为[1111111111111,9999999999999] **默认取值** 不涉及 
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
     * **参数解释** 查询数据截止时间，UNIX时间戳，单位毫秒 **约束限制** from 必须小于to **取值范围** 毫秒级时间戳范围为[1111111111111,9999999999999] **默认取值** 不涉及 
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
