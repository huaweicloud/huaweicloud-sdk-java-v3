package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListMetricsResponseBodyDatapoint
 */
public class ListMetricsResponseBodyDatapoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_name")

    private String statisticName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public ListMetricsResponseBodyDatapoint withStatisticName(String statisticName) {
        this.statisticName = statisticName;
        return this;
    }

    /**
     * 统计维度，例如total,success,failed,
     * @return statisticName
     */
    public String getStatisticName() {
        return statisticName;
    }

    public void setStatisticName(String statisticName) {
        this.statisticName = statisticName;
    }

    public ListMetricsResponseBodyDatapoint withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 指标数据取值
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ListMetricsResponseBodyDatapoint withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 指标数据的单位，例如：个、GB、%
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
        ListMetricsResponseBodyDatapoint that = (ListMetricsResponseBodyDatapoint) obj;
        return Objects.equals(this.statisticName, that.statisticName) && Objects.equals(this.value, that.value)
            && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statisticName, value, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricsResponseBodyDatapoint {\n");
        sb.append("    statisticName: ").append(toIndentedString(statisticName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
