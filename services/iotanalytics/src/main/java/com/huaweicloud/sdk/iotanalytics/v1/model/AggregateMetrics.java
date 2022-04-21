package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 聚合计算定义
 */
public class AggregateMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_span")

    private TimeSpan timeSpan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private String interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<AggregateMetric> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public AggregateMetrics withTimeSpan(TimeSpan timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    public AggregateMetrics withTimeSpan(Consumer<TimeSpan> timeSpanSetter) {
        if (this.timeSpan == null) {
            this.timeSpan = new TimeSpan();
            timeSpanSetter.accept(this.timeSpan);
        }

        return this;
    }

    /**
     * Get timeSpan
     * @return timeSpan
     */
    public TimeSpan getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(TimeSpan timeSpan) {
        this.timeSpan = timeSpan;
    }

    public AggregateMetrics withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 聚合时间间隔, 示例：\"1d|1h|10m|10s\"
     * @return interval
     */
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public AggregateMetrics withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 聚合时间偏移量, 需要小于interval, 示例： \"1h|10m|10s\"
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public AggregateMetrics withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public AggregateMetrics putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public AggregateMetrics withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 对property按指定tags标签进行过滤查询，填入设备标签与标签值，不可为空，例如 {\"deviceId\": \"id0001\"}
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public AggregateMetrics withMetrics(List<AggregateMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public AggregateMetrics addMetricsItem(AggregateMetric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public AggregateMetrics withMetrics(Consumer<List<AggregateMetric>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 查询的测量指标列表
     * @return metrics
     */
    public List<AggregateMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<AggregateMetric> metrics) {
        this.metrics = metrics;
    }

    public AggregateMetrics withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回值个数限制
     * minimum: 1
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
        AggregateMetrics aggregateMetrics = (AggregateMetrics) o;
        return Objects.equals(this.timeSpan, aggregateMetrics.timeSpan)
            && Objects.equals(this.interval, aggregateMetrics.interval)
            && Objects.equals(this.offset, aggregateMetrics.offset) && Objects.equals(this.tags, aggregateMetrics.tags)
            && Objects.equals(this.metrics, aggregateMetrics.metrics)
            && Objects.equals(this.limit, aggregateMetrics.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeSpan, interval, offset, tags, metrics, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregateMetrics {\n");
        sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
