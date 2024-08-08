package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 指标数据结构。
 */
public class ServerDataPoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average")

    private Double average;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Double max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Double min;

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

    public ServerDataPoints withAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * 聚合周期内指标数据的平均值。
     * @return average
     */
    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public ServerDataPoints withMax(Double max) {
        this.max = max;
        return this;
    }

    /**
     * 聚合周期内指标数据的最大值。
     * @return max
     */
    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public ServerDataPoints withMin(Double min) {
        this.min = min;
        return this;
    }

    /**
     * 聚合周期内指标数据的最小值。
     * @return min
     */
    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public ServerDataPoints withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    /**
     * 聚合周期内指标数据的求和值。
     * @return sum
     */
    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public ServerDataPoints withVariance(Double variance) {
        this.variance = variance;
        return this;
    }

    /**
     * 聚合周期内指标数据的方差。
     * @return variance
     */
    public Double getVariance() {
        return variance;
    }

    public void setVariance(Double variance) {
        this.variance = variance;
    }

    public ServerDataPoints withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 指标采集时间，UNIX时间戳，单位毫秒。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ServerDataPoints withUnit(String unit) {
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
        ServerDataPoints that = (ServerDataPoints) obj;
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
        sb.append("class ServerDataPoints {\n");
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
