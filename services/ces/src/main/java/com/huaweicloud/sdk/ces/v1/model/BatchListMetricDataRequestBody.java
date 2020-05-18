package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.MetricInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class BatchListMetricDataRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metrics")
    
    private List<MetricInfo> metrics = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from")
    
    private Long from;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to")
    
    private Long to;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    private String period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="filter")
    
    private String filter;

    public BatchListMetricDataRequestBody withMetrics(List<MetricInfo> metrics) {
        this.metrics = metrics;
        return this;
    }

    
    public BatchListMetricDataRequestBody addMetricsItem(MetricInfo metricsItem) {
        this.metrics.add(metricsItem);
        return this;
    }

    public BatchListMetricDataRequestBody withMetrics(Consumer<List<MetricInfo>> metricsSetter) {
        if(this.metrics == null ){
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标数据。数组长度最大10
     * @return metrics
     */
    public List<MetricInfo> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricInfo> metrics) {
        this.metrics = metrics;
    }

    public BatchListMetricDataRequestBody withFrom(Long from) {
        this.from = from;
        return this;
    }

    


    /**
     * 查询数据起始时间，UNIX时间戳，单位毫秒。建议from的值相对于当前时间向前偏移至少1个周期。由于聚合运算的过程是将一个聚合周期范围内的数据点聚合到周期起始边界上，如果将from和to的范围设置在聚合周期内，会因为聚合未完成而造成查询数据为空，所以建议from参数相对于当前时间向前偏移至少1个周期。以5分钟聚合周期为例：假设当前时间点为10:35，10:30~10:35之间的原始数据会被聚合到10:30这个点上，所以查询5分钟数据点时from参数应为10:30或之前。  说明： 云监控会根据所选择的聚合粒度向前取整from参数。
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
     * 查询数据截止时间UNIX时间戳，单位毫秒。from必须小于to。
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public BatchListMetricDataRequestBody withPeriod(String period) {
        this.period = period;
        return this;
    }

    


    /**
     * 监控数据粒度。  取值范围：  \"1\"，原始数据 \"300\"，5分钟粒度 \"1200\"，20分钟粒度 \"3600\"，1小时粒度 \"14400\"，4小时粒度 \"86400\"，1天粒度
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
     * 数据聚合方式。  支持的值为max, min, average, sum, variance。  filter参数的值不会影响原始数据（period为1）的查询结果。
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
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
        return Objects.equals(this.metrics, batchListMetricDataRequestBody.metrics) &&
            Objects.equals(this.from, batchListMetricDataRequestBody.from) &&
            Objects.equals(this.to, batchListMetricDataRequestBody.to) &&
            Objects.equals(this.period, batchListMetricDataRequestBody.period) &&
            Objects.equals(this.filter, batchListMetricDataRequestBody.filter);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metrics, from, to, period, filter);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListMetricDataRequestBody {\n");
            sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
            sb.append("    from: ").append(toIndentedString(from)).append("\n");
            sb.append("    to: ").append(toIndentedString(to)).append("\n");
            sb.append("    period: ").append(toIndentedString(period)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

