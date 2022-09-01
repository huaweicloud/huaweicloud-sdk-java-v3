package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.MetricQueryMeritcParam;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 该参数用来指定需要查询的数据维度，数据周期等。
 */
public class QueryMetricDataParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metrics")
    
    @JacksonXmlProperty(localName = "metrics")
    
    private List<MetricQueryMeritcParam> metrics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    @JacksonXmlProperty(localName = "period")
    
    private Integer period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistics")
    
    @JacksonXmlProperty(localName = "statistics")
    
    private List<String> statistics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timerange")
    
    @JacksonXmlProperty(localName = "timerange")
    
    private String timerange;

    public QueryMetricDataParam withMetrics(List<MetricQueryMeritcParam> metrics) {
        this.metrics = metrics;
        return this;
    }

    
    public QueryMetricDataParam addMetricsItem(MetricQueryMeritcParam metricsItem) {
        if(this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public QueryMetricDataParam withMetrics(Consumer<List<MetricQueryMeritcParam>> metricsSetter) {
        if(this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标对象列表。 取值范围 JSON数组大小不超过20
     * @return metrics
     */
    public List<MetricQueryMeritcParam> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricQueryMeritcParam> metrics) {
        this.metrics = metrics;
    }

    

    public QueryMetricDataParam withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    


    /**
     * 监控数据粒度。 取值范围 枚举值，取值范围： 60，1分钟粒度 300，5分钟粒度 900，15分钟粒度 3600，1小时粒度
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    

    public QueryMetricDataParam withStatistics(List<String> statistics) {
        this.statistics = statistics;
        return this;
    }

    
    public QueryMetricDataParam addStatisticsItem(String statisticsItem) {
        if(this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public QueryMetricDataParam withStatistics(Consumer<List<String>> statisticsSetter) {
        if(this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * 统计方式。 取值范围 maximum，minimum，sum，average，sampleCount
     * @return statistics
     */
    public List<String> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<String> statistics) {
        this.statistics = statistics;
    }

    

    public QueryMetricDataParam withTimerange(String timerange) {
        this.timerange = timerange;
        return this;
    }

    


    /**
     * 说明： timerange/period≤1440 计算时，timerange和period需换算为相同的单位。 取值范围 格式：开始时间UTC毫秒.结束时间UTC毫秒.时间范围分钟数。开始和结束时间为-1时，表示最近N分钟，N为时间范围分钟取值。 查询时间段，如最近五分钟可以表示为-1.-1.5，固定的时间范围（2017-08-01 08:00 :00到2017-08-02 08:00:00）可以表示为1501545600000.1501632000000.1440。
     * @return timerange
     */
    public String getTimerange() {
        return timerange;
    }

    public void setTimerange(String timerange) {
        this.timerange = timerange;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryMetricDataParam queryMetricDataParam = (QueryMetricDataParam) o;
        return Objects.equals(this.metrics, queryMetricDataParam.metrics) &&
            Objects.equals(this.period, queryMetricDataParam.period) &&
            Objects.equals(this.statistics, queryMetricDataParam.statistics) &&
            Objects.equals(this.timerange, queryMetricDataParam.timerange);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metrics, period, statistics, timerange);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryMetricDataParam {\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    timerange: ").append(toIndentedString(timerange)).append("\n");
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

