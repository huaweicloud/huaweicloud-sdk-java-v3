package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询经过聚合计算的序列值定义
 */
public class AggregateMetricsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_span")

    @JacksonXmlProperty(localName = "time_span")

    private TimeSpanDT timeSpan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    @JacksonXmlProperty(localName = "interval")

    private String interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private Map<String, Object> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_filter")

    @JacksonXmlProperty(localName = "property_filter")

    private List<PropertyFilter> propertyFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    @JacksonXmlProperty(localName = "metrics")

    private List<DTAggregateMetrics> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public AggregateMetricsRequest withTimeSpan(TimeSpanDT timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    public AggregateMetricsRequest withTimeSpan(Consumer<TimeSpanDT> timeSpanSetter) {
        if (this.timeSpan == null) {
            this.timeSpan = new TimeSpanDT();
            timeSpanSetter.accept(this.timeSpan);
        }

        return this;
    }

    /**
     * Get timeSpan
     * @return timeSpan
     */
    public TimeSpanDT getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(TimeSpanDT timeSpan) {
        this.timeSpan = timeSpan;
    }

    public AggregateMetricsRequest withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 聚合时间间隔，正则：\"^[1-9][0-9]*[dhms]$\"，示例：\"1d|1h|10m|10s\"
     * @return interval
     */
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public AggregateMetricsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 聚合时间偏移量，需要小于interval，正则： \"^[1-9][0-9]*[hms]$\"，示例： \"1h|10m|10s\"
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public AggregateMetricsRequest withTags(Map<String, Object> tags) {
        this.tags = tags;
        return this;
    }

    public AggregateMetricsRequest putTagsItem(String key, Object tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public AggregateMetricsRequest withTags(Consumer<Map<String, Object>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 对property按指定tags标签进行过滤查询，填入资产标签属性的属性名与属性值，不可为空，例如 {\"tagPropertyA\": \"id0001\"}；注意，标签过滤只对打上标签时刻之后的数据生效，打标签之前的数据不能通过标签过滤
     * @return tags
     */
    public Map<String, Object> getTags() {
        return tags;
    }

    public void setTags(Map<String, Object> tags) {
        this.tags = tags;
    }

    public AggregateMetricsRequest withPropertyFilter(List<PropertyFilter> propertyFilter) {
        this.propertyFilter = propertyFilter;
        return this;
    }

    public AggregateMetricsRequest addPropertyFilterItem(PropertyFilter propertyFilterItem) {
        if (this.propertyFilter == null) {
            this.propertyFilter = new ArrayList<>();
        }
        this.propertyFilter.add(propertyFilterItem);
        return this;
    }

    public AggregateMetricsRequest withPropertyFilter(Consumer<List<PropertyFilter>> propertyFilterSetter) {
        if (this.propertyFilter == null) {
            this.propertyFilter = new ArrayList<>();
        }
        propertyFilterSetter.accept(this.propertyFilter);
        return this;
    }

    /**
     * 属性过滤器，最多5个
     * @return propertyFilter
     */
    public List<PropertyFilter> getPropertyFilter() {
        return propertyFilter;
    }

    public void setPropertyFilter(List<PropertyFilter> propertyFilter) {
        this.propertyFilter = propertyFilter;
    }

    public AggregateMetricsRequest withMetrics(List<DTAggregateMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }

    public AggregateMetricsRequest addMetricsItem(DTAggregateMetrics metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public AggregateMetricsRequest withMetrics(Consumer<List<DTAggregateMetrics>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 聚合查询指标列表，对资产属性进行聚合查询得到指标
     * @return metrics
     */
    public List<DTAggregateMetrics> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<DTAggregateMetrics> metrics) {
        this.metrics = metrics;
    }

    public AggregateMetricsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回值个数限制，最多2000个
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregateMetricsRequest aggregateMetricsRequest = (AggregateMetricsRequest) o;
        return Objects.equals(this.timeSpan, aggregateMetricsRequest.timeSpan)
            && Objects.equals(this.interval, aggregateMetricsRequest.interval)
            && Objects.equals(this.offset, aggregateMetricsRequest.offset)
            && Objects.equals(this.tags, aggregateMetricsRequest.tags)
            && Objects.equals(this.propertyFilter, aggregateMetricsRequest.propertyFilter)
            && Objects.equals(this.metrics, aggregateMetricsRequest.metrics)
            && Objects.equals(this.limit, aggregateMetricsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeSpan, interval, offset, tags, propertyFilter, metrics, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregateMetricsRequest {\n");
        sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    propertyFilter: ").append(toIndentedString(propertyFilter)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
