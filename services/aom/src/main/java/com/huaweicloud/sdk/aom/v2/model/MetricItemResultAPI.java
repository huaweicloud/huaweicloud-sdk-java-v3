package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.Dimension;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 维度信息。
 */
@JacksonXmlRootElement(localName = "MetricItemResultAPI")
public class MetricItemResultAPI  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    @JacksonXmlProperty(localName = "dimensions")
    private List<Dimension> dimensions = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensionvaluehash")
    
    @JacksonXmlProperty(localName = "dimensionvaluehash")

    private String dimensionvaluehash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metricName")
    
    @JacksonXmlProperty(localName = "metricName")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    
    @JacksonXmlProperty(localName = "unit")

    private String unit;

    public MetricItemResultAPI withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public MetricItemResultAPI addDimensionsItem(Dimension dimensionsItem) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public MetricItemResultAPI withDimensions(Consumer<List<Dimension>> dimensionsSetter) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 指标维度列表。
     * @return dimensions
     */
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    

    public MetricItemResultAPI withDimensionvaluehash(String dimensionvaluehash) {
        this.dimensionvaluehash = dimensionvaluehash;
        return this;
    }

    


    /**
     * 指标哈希值。
     * @return dimensionvaluehash
     */
    public String getDimensionvaluehash() {
        return dimensionvaluehash;
    }

    public void setDimensionvaluehash(String dimensionvaluehash) {
        this.dimensionvaluehash = dimensionvaluehash;
    }

    

    public MetricItemResultAPI withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 指标名称。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    public MetricItemResultAPI withNamespace(String namespace) {
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

    

    public MetricItemResultAPI withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 指标单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricItemResultAPI metricItemResultAPI = (MetricItemResultAPI) o;
        return Objects.equals(this.dimensions, metricItemResultAPI.dimensions) &&
            Objects.equals(this.dimensionvaluehash, metricItemResultAPI.dimensionvaluehash) &&
            Objects.equals(this.metricName, metricItemResultAPI.metricName) &&
            Objects.equals(this.namespace, metricItemResultAPI.namespace) &&
            Objects.equals(this.unit, metricItemResultAPI.unit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dimensions, dimensionvaluehash, metricName, namespace, unit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricItemResultAPI {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    dimensionvaluehash: ").append(toIndentedString(dimensionvaluehash)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

