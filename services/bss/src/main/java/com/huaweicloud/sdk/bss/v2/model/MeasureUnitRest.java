package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MeasureUnitRest
 */
public class MeasureUnitRest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_name")

    private String measureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abbreviation")

    private String abbreviation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_type")

    private Integer measureType;

    public MeasureUnitRest withMeasureId(Integer measureId) {
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

    public MeasureUnitRest withMeasureName(String measureName) {
        this.measureName = measureName;
        return this;
    }

    /**
     * 度量单位的名称，根据查询的语言类型返回结果。 例如：GB。
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
     * 度量单位名称的英文缩写。 例如：度量单位名称“GB”的英文缩写为“G”。
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
     * 度量类型。 1：货币2：时长3：流量4：数量6：长度7：容量9：行数10：周期11：频率12：个数15：容量*时长16：带宽速率17：容量时长18：查询速率19：带宽速率（1000进制）20：性能测试用量21：面积22：视频23：吞吐量24：分辨率26：通用资源包抵扣单位27：核数*时长28：内存*时长29：IOPS*时长30：吞吐量*时长31：个/时长40：流量（1000进制）41：1K Tokens82：帧98：缓存带宽x时长
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
        MeasureUnitRest that = (MeasureUnitRest) obj;
        return Objects.equals(this.measureId, that.measureId) && Objects.equals(this.measureName, that.measureName)
            && Objects.equals(this.abbreviation, that.abbreviation)
            && Objects.equals(this.measureType, that.measureType);
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
