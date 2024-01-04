package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 时序数据查询参数。
 */
public class QuerySampleParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "samples")

    private List<QuerySample> samples = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<String> statistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private String timeRange;

    public QuerySampleParam withSamples(List<QuerySample> samples) {
        this.samples = samples;
        return this;
    }

    public QuerySampleParam addSamplesItem(QuerySample samplesItem) {
        if (this.samples == null) {
            this.samples = new ArrayList<>();
        }
        this.samples.add(samplesItem);
        return this;
    }

    public QuerySampleParam withSamples(Consumer<List<QuerySample>> samplesSetter) {
        if (this.samples == null) {
            this.samples = new ArrayList<>();
        }
        samplesSetter.accept(this.samples);
        return this;
    }

    /**
     * 时序数据对象列表。取值范围：JSON数组大小不超过20。
     * @return samples
     */
    public List<QuerySample> getSamples() {
        return samples;
    }

    public void setSamples(List<QuerySample> samples) {
        this.samples = samples;
    }

    public QuerySampleParam withStatistics(List<String> statistics) {
        this.statistics = statistics;
        return this;
    }

    public QuerySampleParam addStatisticsItem(String statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public QuerySampleParam withStatistics(Consumer<List<String>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * 统计方式。取值范围：maximum，minimum，sum，average，sampleCount。
     * @return statistics
     */
    public List<String> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<String> statistics) {
        this.statistics = statistics;
    }

    public QuerySampleParam withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 监控数据粒度。取值范围（枚举）：60（表示粒度为1分钟），300（表示粒度为5分钟），900（表示粒度为15分钟），3600（表示粒度为1小时）。
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public QuerySampleParam withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * timeRange用于指标查询时间范围，主要用于解决客户端时间和服务端时间不一致情况下，查询最近N分钟的数据。另可用于精确查询某一段时间的数据。   如：   - -1.-1.60(表示最近60分钟)，不管当前客户端是什么时间，都以服务端时间为准查询最近60分钟。   - 1650852000000.1650852300000.5(表示GMT+8 2022-04-25 10:00:00至2022-04-25 10:05:00指定的5分钟)   格式：   startTimeInMillis.endTimeInMillis.durationInMinutes   参数解释：   - startTimeInMillis: 查询的开始时间，格式为UTC毫秒，如果指定为-1，服务端将按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间。如-1.1650852300000.5，则相当于1650852000000.1650852300000.5   - endTimeInMillis: 查询的结束时间，格式为UTC毫秒，如果指定为-1，服务端将按(startTimeInMillis + durationInMinutes * 60 * 1000)计算结束时间，如果计算出的结束时间大于当前系统时间，则使用当前系统时间。如1650852000000.-1.5，则相当于1650852000000.1650852300000.5   - durationInMinutes：查询时间的跨度分钟数。 取值范围大于0并且大于等于(endTimeInMillis - startTimeInMillis) / (60 * 1000) - 1。当开始时间与结束时间都设置为-1时，系统会将结束时间设置为当前时间UTC毫秒值，并按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间。如：-1.-1.60(表示最近60分钟)   约束：   单次请求中，查询时长与周期需要满足以下条件: durationInMinutes * 60 / period <= 1440
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuerySampleParam that = (QuerySampleParam) obj;
        return Objects.equals(this.samples, that.samples) && Objects.equals(this.statistics, that.statistics)
            && Objects.equals(this.period, that.period) && Objects.equals(this.timeRange, that.timeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(samples, statistics, period, timeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySampleParam {\n");
        sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
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
