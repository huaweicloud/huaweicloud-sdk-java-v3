package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 指标信息
 */
public class MetricInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    @JacksonXmlProperty(localName = "dimensions")

    private List<MetricsDimension> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    @JacksonXmlProperty(localName = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    @JacksonXmlProperty(localName = "unit")

    private String unit;

    public MetricInfoList withDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public MetricInfoList addDimensionsItem(MetricsDimension dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public MetricInfoList withDimensions(Consumer<List<MetricsDimension>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 指标维度
     * @return dimensions
     */
    public List<MetricsDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public MetricInfoList withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称，必须以字母开头，只能包含0-9/a-z/A-Z/_，长度最短为1，最大为64；各服务的指标名称可查看：“[服务指标名称](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
     * 指标命名空间，例如弹性云服务器命名空间SYS.ECS；格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_，总长度最短为3，最大为32。说明： 当alarm_type为（EVENT.SYS| EVENT.CUSTOM）时允许为空；各服务的命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
        MetricInfoList metricInfoList = (MetricInfoList) o;
        return Objects.equals(this.dimensions, metricInfoList.dimensions)
            && Objects.equals(this.metricName, metricInfoList.metricName)
            && Objects.equals(this.namespace, metricInfoList.namespace)
            && Objects.equals(this.unit, metricInfoList.unit);
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
