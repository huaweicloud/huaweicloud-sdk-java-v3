package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 时间序列数据
 */
public class TimeSeriesData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    public TimeSeriesData withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 13位时间戳
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public TimeSeriesData withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 数据值，单位：Kbps（查询流量时）、次（查询事件时）
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeSeriesData that = (TimeSeriesData) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeSeriesData {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
