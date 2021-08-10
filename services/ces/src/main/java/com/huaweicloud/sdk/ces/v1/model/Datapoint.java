package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class Datapoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Double max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Double min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average")

    private Double average;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum")

    private Double sum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variance")

    private Double variance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public Datapoint withMax(Double max) {
        this.max = max;
        return this;
    }

    /** 聚合周期内指标数据的最大值。
     * 
     * @return max */
    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Datapoint withMin(Double min) {
        this.min = min;
        return this;
    }

    /** 聚合周期内指标数据的最小值。
     * 
     * @return min */
    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Datapoint withAverage(Double average) {
        this.average = average;
        return this;
    }

    /** 聚合周期内指标数据的平均值。
     * 
     * @return average */
    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Datapoint withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    /** 聚合周期内指标数据的求和值。
     * 
     * @return sum */
    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Datapoint withVariance(Double variance) {
        this.variance = variance;
        return this;
    }

    /** 聚合周期内指标数据的方差。
     * 
     * @return variance */
    public Double getVariance() {
        return variance;
    }

    public void setVariance(Double variance) {
        this.variance = variance;
    }

    public Datapoint withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** 指标采集时间，UNIX时间戳，单位毫秒。
     * 
     * @return timestamp */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Datapoint withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /** 指标单位。
     * 
     * @return unit */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Datapoint datapoint = (Datapoint) o;
        return Objects.equals(this.max, datapoint.max) && Objects.equals(this.min, datapoint.min)
            && Objects.equals(this.average, datapoint.average) && Objects.equals(this.sum, datapoint.sum)
            && Objects.equals(this.variance, datapoint.variance) && Objects.equals(this.timestamp, datapoint.timestamp)
            && Objects.equals(this.unit, datapoint.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, min, average, sum, variance, timestamp, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Datapoint {\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    average: ").append(toIndentedString(average)).append("\n");
        sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
        sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
