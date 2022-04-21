package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetricDataDetail
 */
public class MetricDataDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Long value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_at")

    private OffsetDateTime readAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private MetricDataDetailDimension dimension;

    public MetricDataDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 监控指标名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetricDataDetail withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 监控值
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public MetricDataDetail withReadAt(OffsetDateTime readAt) {
        this.readAt = readAt;
        return this;
    }

    /**
     * 记录更新时间
     * @return readAt
     */
    public OffsetDateTime getReadAt() {
        return readAt;
    }

    public void setReadAt(OffsetDateTime readAt) {
        this.readAt = readAt;
    }

    public MetricDataDetail withDimension(MetricDataDetailDimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public MetricDataDetail withDimension(Consumer<MetricDataDetailDimension> dimensionSetter) {
        if (this.dimension == null) {
            this.dimension = new MetricDataDetailDimension();
            dimensionSetter.accept(this.dimension);
        }

        return this;
    }

    /**
     * Get dimension
     * @return dimension
     */
    public MetricDataDetailDimension getDimension() {
        return dimension;
    }

    public void setDimension(MetricDataDetailDimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricDataDetail metricDataDetail = (MetricDataDetail) o;
        return Objects.equals(this.name, metricDataDetail.name) && Objects.equals(this.value, metricDataDetail.value)
            && Objects.equals(this.readAt, metricDataDetail.readAt)
            && Objects.equals(this.dimension, metricDataDetail.dimension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, readAt, dimension);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricDataDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    readAt: ").append(toIndentedString(readAt)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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
