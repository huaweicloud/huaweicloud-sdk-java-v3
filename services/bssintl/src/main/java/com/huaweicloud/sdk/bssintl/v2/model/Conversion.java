package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Conversion
 */
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

    /**
     * 度量单位ID。 例如：10表示GB。
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
     * 转换后的度量单位ID。 例如：11表示MB。
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
     * 度量单位和转换后的度量单位之间的转换比率。 例如： 度量单位为GB，转换度量单位为MB时，转换比率为1024，两者之间的转换公式为：1GB=1024MB。
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
     * 度量类型。1：货币 2：时长 3：流量 4：数量 7：容量 9：行数 10：周期 11：频率 12：个数 16：带宽速率 19：带宽速率（1000进制） 20：性能测试用量 27：核数*时长 28：内存*时长 29：IOPS*时长 30：吞吐量*时长 31：个/时长 40：流量（1000进制） 41：1K Tokens 108：数量*时长。
     * @return measureType
     */
    public Integer getMeasureType() {
        return measureType;
    }

    public void setMeasureType(Integer measureType) {
        this.measureType = measureType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Conversion that = (Conversion) obj;
        return Objects.equals(this.measureId, that.measureId) && Objects.equals(this.refMeasureId, that.refMeasureId)
            && Objects.equals(this.conversionRatio, that.conversionRatio)
            && Objects.equals(this.measureType, that.measureType);
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
