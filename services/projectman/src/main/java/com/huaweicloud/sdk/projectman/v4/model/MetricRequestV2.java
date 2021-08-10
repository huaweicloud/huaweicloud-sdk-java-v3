package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** MetricRequestV2 */
public class MetricRequestV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_range")

    private String dateRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_type")

    private String metricType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dividend")

    private MetricRequestV2Dividend dividend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "divisor")

    private Object divisor;

    public MetricRequestV2 withDateRange(String dateRange) {
        this.dateRange = dateRange;
        return this;
    }

    /** 统计周期
     * 
     * @return dateRange */
    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public MetricRequestV2 withMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }

    /** 指标类型
     * 
     * @return metricType */
    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public MetricRequestV2 withDividend(MetricRequestV2Dividend dividend) {
        this.dividend = dividend;
        return this;
    }

    public MetricRequestV2 withDividend(Consumer<MetricRequestV2Dividend> dividendSetter) {
        if (this.dividend == null) {
            this.dividend = new MetricRequestV2Dividend();
            dividendSetter.accept(this.dividend);
        }

        return this;
    }

    /** Get dividend
     * 
     * @return dividend */
    public MetricRequestV2Dividend getDividend() {
        return dividend;
    }

    public void setDividend(MetricRequestV2Dividend dividend) {
        this.dividend = dividend;
    }

    public MetricRequestV2 withDivisor(Object divisor) {
        this.divisor = divisor;
        return this;
    }

    /** 指标分母过滤条件
     * 
     * @return divisor */
    public Object getDivisor() {
        return divisor;
    }

    public void setDivisor(Object divisor) {
        this.divisor = divisor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricRequestV2 metricRequestV2 = (MetricRequestV2) o;
        return Objects.equals(this.dateRange, metricRequestV2.dateRange)
            && Objects.equals(this.metricType, metricRequestV2.metricType)
            && Objects.equals(this.dividend, metricRequestV2.dividend)
            && Objects.equals(this.divisor, metricRequestV2.divisor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateRange, metricType, dividend, divisor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricRequestV2 {\n");
        sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
        sb.append("    dividend: ").append(toIndentedString(dividend)).append("\n");
        sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
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
