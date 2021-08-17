package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.QuerySample;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 时序数据查询参数。
 */
public class QuerySampleParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="samples")
    
    private List<QuerySample> samples = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistics")
    
    private List<String> statistics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    private Integer period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_range")
    
    private String timeRange;

    public QuerySampleParam withSamples(List<QuerySample> samples) {
        this.samples = samples;
        return this;
    }

    
    public QuerySampleParam addSamplesItem(QuerySample samplesItem) {
        if(this.samples == null) {
            this.samples = new ArrayList<>();
        }
        this.samples.add(samplesItem);
        return this;
    }

    public QuerySampleParam withSamples(Consumer<List<QuerySample>> samplesSetter) {
        if(this.samples == null) {
            this.samples = new ArrayList<>();
        }
        samplesSetter.accept(this.samples);
        return this;
    }

    /**
     * 取值范围 JSON数组大小不超过20 时序数据对象列表。 
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
        if(this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public QuerySampleParam withStatistics(Consumer<List<String>> statisticsSetter) {
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

    

    public QuerySampleParam withPeriod(Integer period) {
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

    

    public QuerySampleParam withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    


    /**
     * 说明： time_range/period≤1440 计算时，time_range和period需换算为相同的单位。 取值范围 格式：开始时间UTC毫秒.结束时间UTC毫秒.时间范围分钟数。开始和结束时间为-1时，表示最近N分钟，N为时间范围分钟取值。 查询时间段，如最近五分钟可以表示为-1.-1.5，固定的时间范围（2017-08-01 08:00 :00到2017-08-02 08:00:00）可以表示为1501545600000.1501632000000.1440。 
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySampleParam querySampleParam = (QuerySampleParam) o;
        return Objects.equals(this.samples, querySampleParam.samples) &&
            Objects.equals(this.statistics, querySampleParam.statistics) &&
            Objects.equals(this.period, querySampleParam.period) &&
            Objects.equals(this.timeRange, querySampleParam.timeRange);
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

