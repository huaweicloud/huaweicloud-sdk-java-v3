package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Conversion
 */
public class Conversion  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ref_measure_id")
    
    private Integer refMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conversion_ratio")
    
    private Long conversionRatio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_type")
    
    private Integer measureType;

    public Conversion withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位| |参数的约束及描述：度量单位|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public Conversion withRefMeasureId(Integer refMeasureId) {
        this.refMeasureId = refMeasureId;
        return this;
    }

    


    /**
     * |参数名称：转换的度量单位| |参数的约束及描述：转换的度量单位|
     * @return refMeasureId
     */
    public Integer getRefMeasureId() {
        return refMeasureId;
    }

    public void setRefMeasureId(Integer refMeasureId) {
        this.refMeasureId = refMeasureId;
    }

    public Conversion withConversionRatio(Long conversionRatio) {
        this.conversionRatio = conversionRatio;
        return this;
    }

    


    /**
     * |参数名称：转换比率| |参数的约束及描述：转换比率|
     * @return conversionRatio
     */
    public Long getConversionRatio() {
        return conversionRatio;
    }

    public void setConversionRatio(Long conversionRatio) {
        this.conversionRatio = conversionRatio;
    }

    public Conversion withMeasureType(Integer measureType) {
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
        Conversion conversion = (Conversion) o;
        return Objects.equals(this.measureId, conversion.measureId) &&
            Objects.equals(this.refMeasureId, conversion.refMeasureId) &&
            Objects.equals(this.conversionRatio, conversion.conversionRatio) &&
            Objects.equals(this.measureType, conversion.measureType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(measureId, refMeasureId, conversionRatio, measureType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Conversion {\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    refMeasureId: ").append(toIndentedString(refMeasureId)).append("\n");
        sb.append("    conversionRatio: ").append(toIndentedString(conversionRatio)).append("\n");
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

