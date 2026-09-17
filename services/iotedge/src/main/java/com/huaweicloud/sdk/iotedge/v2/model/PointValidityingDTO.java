package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 点位校验配置结构体
 */
public class PointValidityingDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Object min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Object max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outlier_filtering")

    private Boolean outlierFiltering;

    public PointValidityingDTO withMin(Object min) {
        this.min = min;
        return this;
    }

    /**
     * 点位上报值的最小值，小于该值则上报告警
     * @return min
     */
    public Object getMin() {
        return min;
    }

    public void setMin(Object min) {
        this.min = min;
    }

    public PointValidityingDTO withMax(Object max) {
        this.max = max;
        return this;
    }

    /**
     * 点位上报值的最大值，大于该值则上报告警
     * @return max
     */
    public Object getMax() {
        return max;
    }

    public void setMax(Object max) {
        this.max = max;
    }

    public PointValidityingDTO withOutlierFiltering(Boolean outlierFiltering) {
        this.outlierFiltering = outlierFiltering;
        return this;
    }

    /**
     * 异常值过滤
     * @return outlierFiltering
     */
    public Boolean getOutlierFiltering() {
        return outlierFiltering;
    }

    public void setOutlierFiltering(Boolean outlierFiltering) {
        this.outlierFiltering = outlierFiltering;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PointValidityingDTO that = (PointValidityingDTO) obj;
        return Objects.equals(this.min, that.min) && Objects.equals(this.max, that.max)
            && Objects.equals(this.outlierFiltering, that.outlierFiltering);
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, outlierFiltering);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PointValidityingDTO {\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    outlierFiltering: ").append(toIndentedString(outlierFiltering)).append("\n");
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
