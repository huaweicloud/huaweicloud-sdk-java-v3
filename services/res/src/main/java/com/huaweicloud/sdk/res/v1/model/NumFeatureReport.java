package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户数字类型特征统计
 */
public class NumFeatureReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg")

    private Double avg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Double min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Double max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "median")

    private Double median;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percents_agg")

    private String percentsAgg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    public NumFeatureReport withAvg(Double avg) {
        this.avg = avg;
        return this;
    }

    /**
     * 平均值。
     * @return avg
     */
    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public NumFeatureReport withMin(Double min) {
        this.min = min;
        return this;
    }

    /**
     * 最小值。
     * @return min
     */
    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public NumFeatureReport withMax(Double max) {
        this.max = max;
        return this;
    }

    /**
     * 最大值。
     * @return max
     */
    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public NumFeatureReport withMedian(Double median) {
        this.median = median;
        return this;
    }

    /**
     * 中位数。
     * @return median
     */
    public Double getMedian() {
        return median;
    }

    public void setMedian(Double median) {
        this.median = median;
    }

    public NumFeatureReport withPercentsAgg(String percentsAgg) {
        this.percentsAgg = percentsAgg;
        return this;
    }

    /**
     * 百分位统计。
     * @return percentsAgg
     */
    public String getPercentsAgg() {
        return percentsAgg;
    }

    public void setPercentsAgg(String percentsAgg) {
        this.percentsAgg = percentsAgg;
    }

    public NumFeatureReport withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 特征名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NumFeatureReport withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 特征类型。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NumFeatureReport that = (NumFeatureReport) obj;
        return Objects.equals(this.avg, that.avg) && Objects.equals(this.min, that.min)
            && Objects.equals(this.max, that.max) && Objects.equals(this.median, that.median)
            && Objects.equals(this.percentsAgg, that.percentsAgg) && Objects.equals(this.name, that.name)
            && Objects.equals(this.dataType, that.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avg, min, max, median, percentsAgg, name, dataType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NumFeatureReport {\n");
        sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    median: ").append(toIndentedString(median)).append("\n");
        sb.append("    percentsAgg: ").append(toIndentedString(percentsAgg)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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
