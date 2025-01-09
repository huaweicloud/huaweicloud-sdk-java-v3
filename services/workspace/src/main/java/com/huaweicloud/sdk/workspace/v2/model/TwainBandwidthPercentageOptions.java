package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TwainBandwidthPercentageOptions
 */
public class TwainBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twain_bandwidth_percentage_value")

    private Integer twainBandwidthPercentageValue;

    public TwainBandwidthPercentageOptions withTwainBandwidthPercentageValue(Integer twainBandwidthPercentageValue) {
        this.twainBandwidthPercentageValue = twainBandwidthPercentageValue;
        return this;
    }

    /**
     * TWAIN带宽百分比控制量（%）。取值范围为[0-100]。默认：15。
     * minimum: 0
     * maximum: 100
     * @return twainBandwidthPercentageValue
     */
    public Integer getTwainBandwidthPercentageValue() {
        return twainBandwidthPercentageValue;
    }

    public void setTwainBandwidthPercentageValue(Integer twainBandwidthPercentageValue) {
        this.twainBandwidthPercentageValue = twainBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TwainBandwidthPercentageOptions that = (TwainBandwidthPercentageOptions) obj;
        return Objects.equals(this.twainBandwidthPercentageValue, that.twainBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(twainBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TwainBandwidthPercentageOptions {\n");
        sb.append("    twainBandwidthPercentageValue: ")
            .append(toIndentedString(twainBandwidthPercentageValue))
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
