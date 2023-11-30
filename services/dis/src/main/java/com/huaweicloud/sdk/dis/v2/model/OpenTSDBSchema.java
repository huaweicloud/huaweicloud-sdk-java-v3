package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转储OpenTSDB时必选，与“cloudtable_schema”二选一，表示CloudTable集群OpenTSDB数据的Schema配置。用于将通道内的JSON数据进行格式转换并导入Cloudtable的OpenTSDB。
 */
public class OpenTSDBSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private List<OpenTSDBMetric> metric = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private OpenTSDBTimestamp timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private OpenTSDBValue value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpenTSDBTags> tags = null;

    public OpenTSDBSchema withMetric(List<OpenTSDBMetric> metric) {
        this.metric = metric;
        return this;
    }

    public OpenTSDBSchema addMetricItem(OpenTSDBMetric metricItem) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        this.metric.add(metricItem);
        return this;
    }

    public OpenTSDBSchema withMetric(Consumer<List<OpenTSDBMetric>> metricSetter) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        metricSetter.accept(this.metric);
        return this;
    }

    /**
     * CloudTable集群OpenTSDB数据metric的Schema配置，用于将通道内的JSON数据进行格式转换生成OpenTSDB数据的metric。
     * @return metric
     */
    public List<OpenTSDBMetric> getMetric() {
        return metric;
    }

    public void setMetric(List<OpenTSDBMetric> metric) {
        this.metric = metric;
    }

    public OpenTSDBSchema withTimestamp(OpenTSDBTimestamp timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public OpenTSDBSchema withTimestamp(Consumer<OpenTSDBTimestamp> timestampSetter) {
        if (this.timestamp == null) {
            this.timestamp = new OpenTSDBTimestamp();
            timestampSetter.accept(this.timestamp);
        }

        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     */
    public OpenTSDBTimestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OpenTSDBTimestamp timestamp) {
        this.timestamp = timestamp;
    }

    public OpenTSDBSchema withValue(OpenTSDBValue value) {
        this.value = value;
        return this;
    }

    public OpenTSDBSchema withValue(Consumer<OpenTSDBValue> valueSetter) {
        if (this.value == null) {
            this.value = new OpenTSDBValue();
            valueSetter.accept(this.value);
        }

        return this;
    }

    /**
     * Get value
     * @return value
     */
    public OpenTSDBValue getValue() {
        return value;
    }

    public void setValue(OpenTSDBValue value) {
        this.value = value;
    }

    public OpenTSDBSchema withTags(List<OpenTSDBTags> tags) {
        this.tags = tags;
        return this;
    }

    public OpenTSDBSchema addTagsItem(OpenTSDBTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public OpenTSDBSchema withTags(Consumer<List<OpenTSDBTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * CloudTable集群OpenTSDB数据tags的Schema配置，用于将通道内的JSON数据进行格式转换生成OpenTSDB数据的tags。
     * @return tags
     */
    public List<OpenTSDBTags> getTags() {
        return tags;
    }

    public void setTags(List<OpenTSDBTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenTSDBSchema that = (OpenTSDBSchema) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.value, that.value) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, timestamp, value, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenTSDBSchema {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
