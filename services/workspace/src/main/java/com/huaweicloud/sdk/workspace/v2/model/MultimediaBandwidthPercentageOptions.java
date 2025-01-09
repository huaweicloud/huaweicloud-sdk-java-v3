package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MultimediaBandwidthPercentageOptions
 */
public class MultimediaBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multimedia_bandwidth_percentage_value")

    private Integer multimediaBandwidthPercentageValue;

    public MultimediaBandwidthPercentageOptions withMultimediaBandwidthPercentageValue(
        Integer multimediaBandwidthPercentageValue) {
        this.multimediaBandwidthPercentageValue = multimediaBandwidthPercentageValue;
        return this;
    }

    /**
     * 多媒体带宽百分比控制量（%）。取值范围为[0-100]。默认：50。
     * minimum: 0
     * maximum: 100
     * @return multimediaBandwidthPercentageValue
     */
    public Integer getMultimediaBandwidthPercentageValue() {
        return multimediaBandwidthPercentageValue;
    }

    public void setMultimediaBandwidthPercentageValue(Integer multimediaBandwidthPercentageValue) {
        this.multimediaBandwidthPercentageValue = multimediaBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultimediaBandwidthPercentageOptions that = (MultimediaBandwidthPercentageOptions) obj;
        return Objects.equals(this.multimediaBandwidthPercentageValue, that.multimediaBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multimediaBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultimediaBandwidthPercentageOptions {\n");
        sb.append("    multimediaBandwidthPercentageValue: ")
            .append(toIndentedString(multimediaBandwidthPercentageValue))
            .append("\n");
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
