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
 * 查询经过转换计算的序列值定义
 */
public class TransformMetricsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_span")

    private TimeSpanDT timeSpan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, Object> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_filter")

    private List<PropertyFilter> propertyFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<DTTransformMetrics> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public TransformMetricsRequest withTimeSpan(TimeSpanDT timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    public TransformMetricsRequest withTimeSpan(Consumer<TimeSpanDT> timeSpanSetter) {
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

    public TransformMetricsRequest withTags(Map<String, Object> tags) {
        this.tags = tags;
        return this;
    }

    public TransformMetricsRequest putTagsItem(String key, Object tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public TransformMetricsRequest withTags(Consumer<Map<String, Object>> tagsSetter) {
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

    public TransformMetricsRequest withPropertyFilter(List<PropertyFilter> propertyFilter) {
        this.propertyFilter = propertyFilter;
        return this;
    }

    public TransformMetricsRequest addPropertyFilterItem(PropertyFilter propertyFilterItem) {
        if (this.propertyFilter == null) {
            this.propertyFilter = new ArrayList<>();
        }
        this.propertyFilter.add(propertyFilterItem);
        return this;
    }

    public TransformMetricsRequest withPropertyFilter(Consumer<List<PropertyFilter>> propertyFilterSetter) {
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

    public TransformMetricsRequest withMetrics(List<DTTransformMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }

    public TransformMetricsRequest addMetricsItem(DTTransformMetrics metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public TransformMetricsRequest withMetrics(Consumer<List<DTTransformMetrics>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 转换查询指标列表，对资产属性进行转换查询得到指标
     * @return metrics
     */
    public List<DTTransformMetrics> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<DTTransformMetrics> metrics) {
        this.metrics = metrics;
    }

    public TransformMetricsRequest withLimit(Integer limit) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransformMetricsRequest that = (TransformMetricsRequest) obj;
        return Objects.equals(this.timeSpan, that.timeSpan) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.propertyFilter, that.propertyFilter) && Objects.equals(this.metrics, that.metrics)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeSpan, tags, propertyFilter, metrics, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransformMetricsRequest {\n");
        sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
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
