package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BCS组织维度监控数据列表结构
 */
public class EntityMetricList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    private List<Dimension> dimensions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private Object values;

    public EntityMetricList withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public EntityMetricList addDimensionsItem(Dimension dimensionsItem) {
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public EntityMetricList withDimensions(Consumer<List<Dimension>> dimensionsSetter) {
        if(this.dimensions == null ){
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 指标对象列表。
     * @return dimensions
     */
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    

    public EntityMetricList withValues(Object values) {
        this.values = values;
        return this;
    }

    


    /**
     * 监控数据列表项目。
     * @return values
     */
    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityMetricList entityMetricList = (EntityMetricList) o;
        return Objects.equals(this.dimensions, entityMetricList.dimensions) &&
            Objects.equals(this.values, entityMetricList.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dimensions, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntityMetricList {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

