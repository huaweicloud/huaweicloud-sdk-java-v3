package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "metrics")

    private List<MetricInfo> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    @JacksonXmlProperty(localName = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    @JacksonXmlProperty(localName = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    @JacksonXmlProperty(localName = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    @JacksonXmlProperty(localName = "to")

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

    public BatchListMetricDataRequestBody withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 指标监控数据的聚合粒度，取值范围：1，300，1200，3600，14400，86400；1为监控资源的实时数据；300为聚合5分钟粒度数据，表示5分钟一个数据点；1200为聚合20分钟粒度数据，表示20分钟一个数据点；3600为聚合1小时粒度数据，表示1小时一个数据点；14400为聚合4小时粒度数据，表示4小时一个数据点；86400为聚合1天粒度数据，表示1天一个数据点；聚合解释可查看：“[聚合含义](https://support.huaweicloud.com/ces_faq/ces_faq_0009.html)”。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public BatchListMetricDataRequestBody withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 数据聚合方式。  支持的值为max, min, average, sum, variance；max为最大值，min为最小值，average为平均值，sum为和，variance为方差值。
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public BatchListMetricDataRequestBody withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 查询数据起始时间，UNIX时间戳，单位毫秒。建议from的值相对于当前时间向前偏移至少1个周期。由于聚合运算的过程是将一个聚合周期范围内的数据点聚合到周期起始边界上，如果将from和to的范围设置在聚合周期内，会因为聚合未完成而造成查询数据为空，所以建议from参数相对于当前时间向前偏移至少1个周期。以5分钟聚合周期为例：假设当前时间点为10:35，10:30~10:35之间的原始数据会被聚合到10:30这个点上，所以查询5分钟数据点时from参数应为10:30或之前。 说明： 云监控会根据所选择的聚合粒度向前取整from参数；如：1607146998177
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
     * 查询数据截止时间UNIX时间戳，单位毫秒。from必须小于to；如：1607150598177。
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchListMetricDataRequestBody batchListMetricDataRequestBody = (BatchListMetricDataRequestBody) o;
        return Objects.equals(this.metrics, batchListMetricDataRequestBody.metrics)
            && Objects.equals(this.period, batchListMetricDataRequestBody.period)
            && Objects.equals(this.filter, batchListMetricDataRequestBody.filter)
            && Objects.equals(this.from, batchListMetricDataRequestBody.from)
            && Objects.equals(this.to, batchListMetricDataRequestBody.to);
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
