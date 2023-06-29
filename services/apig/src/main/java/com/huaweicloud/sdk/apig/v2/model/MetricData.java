package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MetricData
 */
public class MetricData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average")

    private Integer average;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum")

    private Integer sum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variance")

    private Integer variance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Integer timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public MetricData withAverage(Integer average) {
        this.average = average;
        return this;
    }

    /**
     * 聚合周期内指标数据的平均值，仅当请求参数filter字段值为average时支持。
     * @return average
     */
    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    public MetricData withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 聚合周期内指标数据的最大值，仅当请求参数filter字段值为max时支持。
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public MetricData withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 聚合周期内指标数据的最小值，仅当请求参数filter字段值为min时支持。
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public MetricData withSum(Integer sum) {
        this.sum = sum;
        return this;
    }

    /**
     * 聚合周期内指标数据的求和值，仅当请求参数filter字段值为sum时支持。
     * @return sum
     */
    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public MetricData withVariance(Integer variance) {
        this.variance = variance;
        return this;
    }

    /**
     * 聚合周期内指标数据的方差，仅当请求参数filter字段值为variance时支持。
     * @return variance
     */
    public Integer getVariance() {
        return variance;
    }

    public void setVariance(Integer variance) {
        this.variance = variance;
    }

    public MetricData withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 指标采集时间，UNIX时间戳，单位毫秒。
     * @return timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public MetricData withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 指标单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricData that = (MetricData) obj;
        return Objects.equals(this.average, that.average) && Objects.equals(this.max, that.max)
            && Objects.equals(this.min, that.min) && Objects.equals(this.sum, that.sum)
            && Objects.equals(this.variance, that.variance) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(average, max, min, sum, variance, timestamp, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricData {\n");
        sb.append("    average: ").append(toIndentedString(average)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
        sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
