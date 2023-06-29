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
 * 转换计算定义
 */
public class TransformMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_span")

    private TimeSpan timeSpan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<TransformMetric> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public TransformMetrics withTimeSpan(TimeSpan timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    public TransformMetrics withTimeSpan(Consumer<TimeSpan> timeSpanSetter) {
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

    public TransformMetrics withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public TransformMetrics putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public TransformMetrics withTags(Consumer<Map<String, String>> tagsSetter) {
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

    public TransformMetrics withMetrics(List<TransformMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public TransformMetrics addMetricsItem(TransformMetric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public TransformMetrics withMetrics(Consumer<List<TransformMetric>> metricsSetter) {
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
    public List<TransformMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<TransformMetric> metrics) {
        this.metrics = metrics;
    }

    public TransformMetrics withLimit(Integer limit) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransformMetrics that = (TransformMetrics) obj;
        return Objects.equals(this.timeSpan, that.timeSpan) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.metrics, that.metrics) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeSpan, tags, metrics, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransformMetrics {\n");
        sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
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
