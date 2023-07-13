package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListMonitorIndicatorDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_name")

    private String indicatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim0")

    private String dim0;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim1")

    private String dim1;

    public ListMonitorIndicatorDataRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 开始时间。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ListMonitorIndicatorDataRequest withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 结束时间。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ListMonitorIndicatorDataRequest withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * 取值方法。
     * @return function
     */
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public ListMonitorIndicatorDataRequest withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 取值周期。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ListMonitorIndicatorDataRequest withIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
        return this;
    }

    /**
     * 指标名称。
     * @return indicatorName
     */
    public String getIndicatorName() {
        return indicatorName;
    }

    public void setIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
    }

    public ListMonitorIndicatorDataRequest withDim0(String dim0) {
        this.dim0 = dim0;
        return this;
    }

    /**
     * 第一层级。
     * @return dim0
     */
    public String getDim0() {
        return dim0;
    }

    public void setDim0(String dim0) {
        this.dim0 = dim0;
    }

    public ListMonitorIndicatorDataRequest withDim1(String dim1) {
        this.dim1 = dim1;
        return this;
    }

    /**
     * 第二层级。
     * @return dim1
     */
    public String getDim1() {
        return dim1;
    }

    public void setDim1(String dim1) {
        this.dim1 = dim1;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMonitorIndicatorDataRequest that = (ListMonitorIndicatorDataRequest) obj;
        return Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.function, that.function) && Objects.equals(this.period, that.period)
            && Objects.equals(this.indicatorName, that.indicatorName) && Objects.equals(this.dim0, that.dim0)
            && Objects.equals(this.dim1, that.dim1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, function, period, indicatorName, dim0, dim1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMonitorIndicatorDataRequest {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    indicatorName: ").append(toIndentedString(indicatorName)).append("\n");
        sb.append("    dim0: ").append(toIndentedString(dim0)).append("\n");
        sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
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
