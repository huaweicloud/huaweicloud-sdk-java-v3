package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.DimensionSeries;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 维度信息。
 */
public class SeriesQueryItemResult  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    private List<DimensionSeries> dimensions = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimension_value_hash")
    

    private String dimensionValueHash;

    public SeriesQueryItemResult withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 命名空间。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public SeriesQueryItemResult withDimensions(List<DimensionSeries> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public SeriesQueryItemResult addDimensionsItem(DimensionSeries dimensionsItem) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public SeriesQueryItemResult withDimensions(Consumer<List<DimensionSeries>> dimensionsSetter) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 维度列表。
     * @return dimensions
     */
    public List<DimensionSeries> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<DimensionSeries> dimensions) {
        this.dimensions = dimensions;
    }

    

    public SeriesQueryItemResult withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 时间序列名称。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    public SeriesQueryItemResult withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 时间序列单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    

    public SeriesQueryItemResult withDimensionValueHash(String dimensionValueHash) {
        this.dimensionValueHash = dimensionValueHash;
        return this;
    }

    


    /**
     * 时间序列哈希值。
     * @return dimensionValueHash
     */
    public String getDimensionValueHash() {
        return dimensionValueHash;
    }

    public void setDimensionValueHash(String dimensionValueHash) {
        this.dimensionValueHash = dimensionValueHash;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SeriesQueryItemResult seriesQueryItemResult = (SeriesQueryItemResult) o;
        return Objects.equals(this.namespace, seriesQueryItemResult.namespace) &&
            Objects.equals(this.dimensions, seriesQueryItemResult.dimensions) &&
            Objects.equals(this.metricName, seriesQueryItemResult.metricName) &&
            Objects.equals(this.unit, seriesQueryItemResult.unit) &&
            Objects.equals(this.dimensionValueHash, seriesQueryItemResult.dimensionValueHash);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, dimensions, metricName, unit, dimensionValueHash);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SeriesQueryItemResult {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    dimensionValueHash: ").append(toIndentedString(dimensionValueHash)).append("\n");
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

