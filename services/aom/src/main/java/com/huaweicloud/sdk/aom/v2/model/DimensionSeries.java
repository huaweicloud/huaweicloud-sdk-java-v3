package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 时间序列维度列表。
 */
public class DimensionSeries  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    
    private String value;

    public DimensionSeries withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 维度名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public DimensionSeries withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 维度取值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DimensionSeries dimensionSeries = (DimensionSeries) o;
        return Objects.equals(this.name, dimensionSeries.name) &&
            Objects.equals(this.value, dimensionSeries.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionSeries {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

