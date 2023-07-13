package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DisplayBandwidthPercentageOptions
 */
public class DisplayBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_bandwidth_percentage_value")

    private Integer displayBandwidthPercentageValue;

    public DisplayBandwidthPercentageOptions withDisplayBandwidthPercentageValue(
        Integer displayBandwidthPercentageValue) {
        this.displayBandwidthPercentageValue = displayBandwidthPercentageValue;
        return this;
    }

    /**
     * 显示带宽百分比控制量（%）。取值范围为[0-100]。默认：65。
     * minimum: 0
     * maximum: 100
     * @return displayBandwidthPercentageValue
     */
    public Integer getDisplayBandwidthPercentageValue() {
        return displayBandwidthPercentageValue;
    }

    public void setDisplayBandwidthPercentageValue(Integer displayBandwidthPercentageValue) {
        this.displayBandwidthPercentageValue = displayBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisplayBandwidthPercentageOptions that = (DisplayBandwidthPercentageOptions) obj;
        return Objects.equals(this.displayBandwidthPercentageValue, that.displayBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisplayBandwidthPercentageOptions {\n");
        sb.append("    displayBandwidthPercentageValue: ")
            .append(toIndentedString(displayBandwidthPercentageValue))
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
