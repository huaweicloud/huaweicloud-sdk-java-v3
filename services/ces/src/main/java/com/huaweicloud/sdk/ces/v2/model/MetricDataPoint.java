package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 监控数据点 
 */
public class MetricDataPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<MetricDataPointDimensions> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public MetricDataPoint withDimensions(List<MetricDataPointDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public MetricDataPoint addDimensionsItem(MetricDataPointDimensions dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public MetricDataPoint withDimensions(Consumer<List<MetricDataPointDimensions>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * **参数解释**： 维度信息 
     * @return dimensions
     */
    public List<MetricDataPointDimensions> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricDataPointDimensions> dimensions) {
        this.dimensions = dimensions;
    }

    public MetricDataPoint withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * **参数解释**： 指标采集时间 **取值范围**： 最小值为0 
     * minimum: 0
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public MetricDataPoint withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 指标值 **取值范围**： 不涉及 
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public MetricDataPoint withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**： 数据的单位。    **取值范围**： 长度为[0,32]个字符。 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricDataPoint that = (MetricDataPoint) obj;
        return Objects.equals(this.dimensions, that.dimensions) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.value, that.value) && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, timestamp, value, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricDataPoint {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
