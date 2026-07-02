package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释** 指标信息 
 */
public class MetricInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<MetricsDimensionResp> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public MetricInfoList withDimensions(List<MetricsDimensionResp> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public MetricInfoList addDimensionsItem(MetricsDimensionResp dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public MetricInfoList withDimensions(Consumer<List<MetricsDimensionResp>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * **参数解释** 指标维度 
     * @return dimensions
     */
    public List<MetricsDimensionResp> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricsDimensionResp> dimensions) {
        this.dimensions = dimensions;
    }

    public MetricInfoList withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释** 指标名称 **取值范围** 不涉及 
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public MetricInfoList withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释** 服务命名空间 **取值范围** 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public MetricInfoList withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释** 指标单位 **取值范围** 不涉及 
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
        MetricInfoList that = (MetricInfoList) obj;
        return Objects.equals(this.dimensions, that.dimensions) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, metricName, namespace, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricInfoList {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
