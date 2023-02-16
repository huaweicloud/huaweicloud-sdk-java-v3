package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.MetricQueryMeritcParam;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 该参数用来指定需要查询的数据维度，数据周期等。
 */
public class QueryMetricDataParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metrics")
    
    
    private List<MetricQueryMeritcParam> metrics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    
    private Integer period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistics")
    
    
    private List<String> statistics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timerange")
    
    
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
     * 监控数据粒度。 取值范围（枚举）：60（表示粒度为1分钟），300（表示粒度为5分钟），900（表示粒度为15分钟），3600（表示粒度为1小时）。
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
     * timeRange用于指标查询时间范围，主要用于解决客户端时间和服务端时间不一致情况下，查询最近N分钟的数据。另可用于精确查询某一段时间的数据。  如：  - -1.-1.60(表示最近60分钟)，不管当前客户端是什么时间，都以服务端时间为准查询最近60分钟。  - 1650852000000.1650852300000.5(表示北京时间2022-04-25 10:00:00至2022-04-25 10:05:00指定的5分钟)  格式：  startTimeInMillis.endTimeInMillis.durationInMinutes  参数解释：  - startTimeInMillis: 查询的开始时间，格式为UTC毫秒，如果指定为-1，服务端将按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间。如-1.1650852300000.5，则相当于1650852000000.1650852300000.5  - endTimeInMillis: 查询的结束时间，格式为UTC毫秒，如果指定为-1，服务端将按(startTimeInMillis + durationInMinutes * 60 * 1000)计算结束时间，如果计算出的结束时间大于当前系统时间，则使用当前系统时间。如1650852000000.-1.5，则相当于1650852000000.1650852300000.5  - durationInMinutes：查询时间的跨度分钟数。 取值范围大于0并且大于等于(endTimeInMillis - startTimeInMillis) / (60 * 1000) - 1。当开始时间与结束时间都设置为-1时，系统会将结束时间设置为当前时间UTC毫秒值，并按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间。如：-1.-1.60(表示最近60分钟)  约束：  单次请求中，查询时长与周期需要满足以下条件: durationInMinutes * 60 / period <= 1440
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

