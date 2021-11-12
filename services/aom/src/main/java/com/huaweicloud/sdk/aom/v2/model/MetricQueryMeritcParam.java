package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询参数集
 */
public class MetricQueryMeritcParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    
    private List<Dimension> dimensions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metricName")
    
    
    private String metricName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    
    private String namespace;

    public MetricQueryMeritcParam withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public MetricQueryMeritcParam addDimensionsItem(Dimension dimensionsItem) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public MetricQueryMeritcParam withDimensions(Consumer<List<Dimension>> dimensionsSetter) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 指标维度列表。 取值范围： 数组不能为空，同时数组中任何一个dimension对象name和value属性的值也不能为空。
     * @return dimensions
     */
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    

    public MetricQueryMeritcParam withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 指标名称。 取值范围 名称长度为1~255个字符
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    public MetricQueryMeritcParam withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 指标命名空间。 取值范围 PAAS.CONTAINER PAAS.NODE PAAS.SLA PAAS.AGGR CUSTOMMETRICS
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricQueryMeritcParam metricQueryMeritcParam = (MetricQueryMeritcParam) o;
        return Objects.equals(this.dimensions, metricQueryMeritcParam.dimensions) &&
            Objects.equals(this.metricName, metricQueryMeritcParam.metricName) &&
            Objects.equals(this.namespace, metricQueryMeritcParam.namespace);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dimensions, metricName, namespace);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricQueryMeritcParam {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

