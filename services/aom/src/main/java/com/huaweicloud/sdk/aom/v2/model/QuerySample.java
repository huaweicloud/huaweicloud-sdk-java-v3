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
public class QuerySample  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    private List<Dimension> dimensions = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    
    private String metricName;

    public QuerySample withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 时间序列的命名空间。 取值范围  PAAS.CONTAINER PAAS.NODE PAAS.SLA PAAS.AGGR CUSTOMMETRICS 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public QuerySample withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public QuerySample addDimensionsItem(Dimension dimensionsItem) {
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public QuerySample withDimensions(Consumer<List<Dimension>> dimensionsSetter) {
        if(this.dimensions == null ){
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 时间序列维度列表。 取值范围： 数组不能为空，同时数组中任何一个dimension对象name和value属性的值也不能为空。 
     * @return dimensions
     */
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    public QuerySample withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 时间序列名称。 取值范围 名称长度为1~255个字符 
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySample querySample = (QuerySample) o;
        return Objects.equals(this.namespace, querySample.namespace) &&
            Objects.equals(this.dimensions, querySample.dimensions) &&
            Objects.equals(this.metricName, querySample.metricName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, dimensions, metricName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySample {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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

