package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MeasureUnitRest
 */
public class MeasureUnitRest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_name")
    
    private String measureName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="abbreviation")
    
    private String abbreviation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_type")
    
    private Integer measureType;

    public MeasureUnitRest withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位ID| |参数的约束及描述：度量单位ID|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    

    public MeasureUnitRest withMeasureName(String measureName) {
        this.measureName = measureName;
        return this;
    }

    


    /**
     * |参数名称：度量单位名称（默认语言或者要查询语言名称）| |参数约束及描述：度量单位名称（默认语言或者要查询语言名称）|
     * @return measureName
     */
    public String getMeasureName() {
        return measureName;
    }

    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }

    

    public MeasureUnitRest withAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        return this;
    }

    


    /**
     * |参数名称：英文缩写| |参数约束及描述：英文缩写|
     * @return abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    

    public MeasureUnitRest withMeasureType(Integer measureType) {
        this.measureType = measureType;
        return this;
    }

    


    /**
     * |参数名称：度量类型| |参数的约束及描述：度量类型|
     * @return measureType
     */
    public Integer getMeasureType() {
        return measureType;
    }

    public void setMeasureType(Integer measureType) {
        this.measureType = measureType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MeasureUnitRest measureUnitRest = (MeasureUnitRest) o;
        return Objects.equals(this.measureId, measureUnitRest.measureId) &&
            Objects.equals(this.measureName, measureUnitRest.measureName) &&
            Objects.equals(this.abbreviation, measureUnitRest.abbreviation) &&
            Objects.equals(this.measureType, measureUnitRest.measureType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(measureId, measureName, abbreviation, measureType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeasureUnitRest {\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    measureName: ").append(toIndentedString(measureName)).append("\n");
        sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
        sb.append("    measureType: ").append(toIndentedString(measureType)).append("\n");
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

