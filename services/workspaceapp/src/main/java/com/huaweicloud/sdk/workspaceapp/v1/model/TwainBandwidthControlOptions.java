package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TwainBandwidthControlOptions
 */
public class TwainBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twain_bandwidth_control_value")

    private Integer twainBandwidthControlValue;

    public TwainBandwidthControlOptions withTwainBandwidthControlValue(Integer twainBandwidthControlValue) {
        this.twainBandwidthControlValue = twainBandwidthControlValue;
        return this;
    }

    /**
     * TWAIN带宽控制量（Kbps）。取值范围为[2000-10000]。默认：5000。
     * minimum: 2000
     * maximum: 10000
     * @return twainBandwidthControlValue
     */
    public Integer getTwainBandwidthControlValue() {
        return twainBandwidthControlValue;
    }

    public void setTwainBandwidthControlValue(Integer twainBandwidthControlValue) {
        this.twainBandwidthControlValue = twainBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TwainBandwidthControlOptions that = (TwainBandwidthControlOptions) obj;
        return Objects.equals(this.twainBandwidthControlValue, that.twainBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(twainBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TwainBandwidthControlOptions {\n");
        sb.append("    twainBandwidthControlValue: ").append(toIndentedString(twainBandwidthControlValue)).append("\n");
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
