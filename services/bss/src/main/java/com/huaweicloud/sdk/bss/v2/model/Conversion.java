package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Conversion */
public class Conversion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_measure_id")

    private Integer refMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conversion_ratio")

    private Long conversionRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_type")

    private Integer measureType;

    public Conversion withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /** 度量单位ID。 例如：10表示GB。
     * 
     * @return measureId */
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

    /** 转换后的度量单位ID。 例如：11表示MB。
     * 
     * @return refMeasureId */
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

    /** 度量单位和转换后的度量单位之间的转换比率。 例如： 度量单位为GB，转换度量单位为MB时，转换比率为1024，两者之间的转换公式为：1GB=1024MB。
     * 
     * @return conversionRatio */
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

    /** 度量类型。
     * 1：货币2：时长3：流量4：数量7：容量9：行数10：周期11：频率12：个数16：带宽速率17：容量时长18：查询速率19：带宽速率（1000进制）20：性能测试用量21：面积22：视频23：吞吐量25：测试类型
     * 
     * @return measureType */
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
        return Objects.equals(this.measureId, conversion.measureId)
            && Objects.equals(this.refMeasureId, conversion.refMeasureId)
            && Objects.equals(this.conversionRatio, conversion.conversionRatio)
            && Objects.equals(this.measureType, conversion.measureType);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
