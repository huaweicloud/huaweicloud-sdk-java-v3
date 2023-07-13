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
     * 监控指标名称，当前包含指标： - cpu_used：该维度vCPU已使用核数，单位：个，支持维度：site_id，flavor - cpu_available_total：用户可使用该维度vCPU总核数，单位：个，支持维度：site_id，flavor - cpu_total：该维度vCPU总核数（包含HA等预留核数），单位：个，支持维度：site_id，flavor - memory_used：该维度内存已使用量，单位：Gb，支持维度：site_id，flavor - memory_available_total：用户可使用该维度内存总量，单位：Gb，支持维度：site_id，flavor - memory_total：该维度内存总量（包含HA等预留内存量），单位：Gb，支持维度：site_id，flavor - capacity_used：该维度块存储资源已使用量，单位：GiB，支持维度：site_id，storage - capacity_available_total：用户可使用该维度块存储资源总容量（用户订购开通的存储容量），单位：GiB，支持维度：site_id，storage - capacity_total：当前已订购的资源场景下该维度块存储资源最大容量（订购资源包含的存储容量可能大于用户已开通容量），单位：GiB，支持维度：site_id，storage - available：该维度对应规格剩余可发放数量，单位：台，支持维度：flavor_capacity
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricDataDetail that = (MetricDataDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value)
            && Objects.equals(this.readAt, that.readAt) && Objects.equals(this.dimension, that.dimension);
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
